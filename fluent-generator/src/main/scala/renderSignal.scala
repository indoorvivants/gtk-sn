import rendition.*

import com.indoorvivants.gnome.gir_schema.*
import util.boundary.*
import FluentErrReason.*

def renderSignal(cls: AugmentedClass, prop: AugmentedSignal)(using
    RenderingContext,
    GlobalKnowledge,
    NamingPolicy,
    Label[FluentErr]
) =
  WithEffects.collect: coll =>
    val signalName = makeSignalName(prop.name)

    val arguments = prop.parameters.collect:
      case p: Parameter =>
        val tpe = p.tpe.getOrElse(
          raiseWith(_.MethodParameterHasNoType(prop.name, p.name))
        )
        val name =
          p.name.getOrElse(raiseWith(_.Other("Signal parameter has no name")))

        val simpleTpe = tpe match
          case t: Type       => t
          case at: ArrayType =>
            raiseWith(_.Other("Array signal parameters not supported yet"))

        (name = name, tpe = renderSignalType(simpleTpe, TypePosition.ParameterType))

    arguments.map(_.tpe).foreach(c => coll.addAll(c.effects))

    val paramsType =
      val args = arguments
        .map(tp => tp.name + ":" + tp.tpe.fluent)
        .mkString("(", ", ", ")")

      if arguments.isEmpty then "EmptyTuple.type" else args

    val returnType = prop.returnType
      .collect:
        case t: Type       => renderSignalType(t, TypePosition.ReturnType)
        case at: ArrayType =>
          raiseWith(
            _.Other(
              "Array signal parameters in return types not supported yet"
            )
          )
      .getOrElse(SignalTypeMapping("Unit", "Unit"))

    coll.addAll(returnType.effects)

    coll.add(Effect.RequiresImport("sn.gnome.gobject.runtime", "*"))
    coll.addAll(
      Effect.requiresImports(
        "sn.gnome.gobject.internal",
        "GClosure",
        "GConnectFlags",
        "GClosureNotify",
        "g_signal_connect_data"
      )
    )
    coll.addAll(
      Effect.requiresImports("sn.gnome.glib.internal", "gpointer", "gchar")
    )

    val functionType =
      if arguments.isEmpty then s"EmptyTuple.type => ${returnType.fluent}"
      else s"($paramsType) => ${returnType.fluent}"

    renderComment(prop.doc)
    block(
      s"def $signalName(f: $functionType)(using Runtime) =",
      s"end $signalName"
    ):
      val funcArity = arguments.length + 2
      val signalRegParams = s"this.type, $paramsType, ${returnType.fluent}"
      line(s"type SignalRegType = SignalRegistration[$signalRegParams]")
      block(s"val c_handler = CFuncPtr${funcArity}.fromScalaFunction {", "}"):
        line("(")
        line(s"self: Ptr[${cls.cType}],")
        arguments.foreach: arg =>
          line(s"${arg.name}: ${arg.tpe.internal}, ")
        line(
          s"data: Ptr[SignalRegType]"
        )
        line(") => ")
        line("val sr = !data")

        val call =
          val params = arguments
            .map: arg =>
              s"${arg.name} = ${arg.tpe.intoFluent(arg.name)}"
            .mkString(", ")
          s"sr.handler(($params))"

        if arguments.isEmpty then line("sr.handler(EmptyTuple)")
        else line(call)
      line(s"val sr: SignalRegType = SignalRegistration(this, f)")
      line("val (ptr, mem) = Captured.unsafe(sr)")

      block("val destroy_data = CFuncPtr2.fromScalaFunction {", "}"):
        line("(data: gpointer, closure: Ptr[GClosure]) => ")
        line(
          s"val sr = !data.asInstanceOf[Ptr[SignalRegType]]"
        )
        line("GCRoots.removeRoot(sr)")

      line("val flags = GConnectFlags.G_CONNECT_DEFAULT")
      line(s"val signal = c\"${prop.name}\"")
      signalRegLines.foreach(line(_))

case class SignalTypeMapping(
    fluent: String,
    internal: String,
    massageIntoInternal: List[Massage] = Nil,
    massageIntoFluent: List[Massage] = Nil,
    effects: List[Effect] = Nil
):
  def withMassageIntoInternal(m: Massage*) =
    copy(massageIntoInternal = massageIntoInternal ++ m)
  def withMassageIntofluent(m: Massage*) =
    copy(massageIntoFluent = massageIntoFluent ++ m)
  def withEffect(eff: Effect*) = copy(effects = effects ++ eff)

  def intoFluent(ref: String) =
    massageIntoFluent.foldLeft(ref): (cur, m) =>
      m.render(cur)

  def intoInternal(ref: String) =
    massageIntoInternal.foldLeft(ref): (cur, m) =>
      m.render(cur)

end SignalTypeMapping

def renderSignalType(tpe: Type, pos: TypePosition)(using
    Label[FluentErr]
): SignalTypeMapping =

  val (typeName, typeValue) =
    tpe.name -> safeGetTypeValue(tpe)

  def whenFull(
      name: String,
      cName: String
  )(fluent: String, internal: String) =
    Option
      .when(typeName.contains(name) && typeValue.trim == cName)(
        SignalTypeMapping(fluent, internal)
      )

  def whenTypeValue(cName: String)(fluent: String, internal: String) =
    Option
      .when(typeValue.trim == cName)(
        SignalTypeMapping(fluent, internal)
      )

  def whenTypeName(name: String)(fluent: String, internal: String) =
    Option
      .when(typeName.contains(name))(
        SignalTypeMapping(fluent, internal)
      )

  val importUnsigned =
    Effect.RequiresImport("_root_.scala.scalanative.unsigned", "*")

  val importUnsafe =
    Effect.RequiresImport("_root_.scala.scalanative.unsafe", "*")

  val importGlib = (nm: String) =>
    Effect.RequiresImport("sn.gnome.glib.internal", nm)

  Seq(
    whenFull("gint", "gint")("Int", "Int"),
    whenFull("none", "void")("Unit", "Unit"),
    whenFull("gboolean", "gboolean")("Boolean", "Boolean")
  ).reduce(_ orElse _)
    .getOrElse(
      raiseWith(_.Other(s"Signal param/return type cannot be serialised: $tpe"))
    )

private def signalRegLines =
  """
 |SignalHandleID(
 |  g_signal_connect_data(
 |    gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
 |    signal.asInstanceOf[Ptr[gchar]],
 |    c_handler.asGCallback,
 |    gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
 |    GClosureNotify(destroy_data), // destroy_data
 |    flags
 |  ).value
 |)
    """.trim.stripMargin.linesIterator
