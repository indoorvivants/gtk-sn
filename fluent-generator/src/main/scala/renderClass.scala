import com.indoorvivants.gnome.gir_schema.*
import rendition.*

import scala.util.boundary, boundary.*
import FluentErrReason.*

def getRenderableMethods(
    cls: ClassLike
)(using GlobalKnowledge, NamingPolicy, Label[FluentErr]) =
  WithEffects.collect: coll =>
    val (thisClass, inherited) = collectAllMethods(cls)

    val (ownMethods, inheritedMethods) =
      thisClass.partition(pair => !inherited.contains(pair._1))

    val overridden = inheritedMethods
      .filter: (sig, meth) =>
        inherited
          .get(sig)
          .nonEmpty // .exists(_._1.isInstanceOf[MethodRef.Impl])
      .map(_._2)
      .map((_, MethodRenderingOptions(isOverride = true, body = true)))

    val conflicts = inherited.flatMap:
      case (sig, meth) if meth.length > 1 =>
        meth.headOption.map: meth =>
          val gn = meth._1.globalName
          coll.addAll(gn.effects)

          coll.add(
            Effect.RequiresImport(
              namingPolicy.namespaceToInternalPackage(gn.namespace),
              meth._1.tv
            )
          )
          (meth._2, MethodRenderingOptions(isOverride = true, body = true))
      case _ => None

    val toRender = ownMethods.toList.map(
      _._2 -> MethodRenderingOptions(isOverride = false, body = true)
    ) ++
      overridden.toList ++ conflicts.toList

    toRender.sortBy(_._1.name)

def renderClass(
    ns: AugmentedNamespace,
    cls: AugmentedClass
)(using
    RenderingContext,
    GlobalKnowledge,
    NamingPolicy,
    Label[FluentErr]
)(using reporter: ClassReporter): WithEffects[Unit] =
  WithEffects.collect: coll =>
    val cType = cls.cType
    coll.add(
      Effect.RequiresImport(
        namingPolicy.namespaceToInternalPackage(ns.name.get),
        cType
      )
    )

    val data = s"(raw: Ptr[${cType}])"

    val extensions =
      coll.observe(renderClassExtensions(cls.name, cls.parent, cls.implements))

    val classHeader =
      s"class ${cls.name} private[gnome] $data${extensions}"

    val classHasAnyMembers =
      cls.methods.nonEmpty

    renderComment(cls.doc)
    block(
      classHeader + ":",
      s"end ${cls.name}"
    ):
      val overrides = if cls.parent.nonEmpty then "override " else ""
      emptyLine()
      line(
        s"${overrides}def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf"
      )
      emptyLine()

      val toRender = coll.observe(getRenderableMethods(cls))

      toRender
        .foreach: (meth, opts) =>
          transact[FluentErr]:
            inContext(s"method ${meth.name}"):
              filterDefinitions(
                namespace = Some(ns),
                cls = Some(cls),
                method = Some(meth)
              )
              coll.observe(
                renderClassMethod(
                  MethodLocation.Klass(cls),
                  meth,
                  opts
                )
              )
              reporter.recordMethod(meth.name, ReportResult.Success)
          .foreach: err =>
            renderMethodStub(meth, err)
            reporter.recordMethod(
              meth.name,
              ReportResult.Failure(err.getMessage)
            )

      cls.signals.foreach: signal =>
        transact[FluentErr]:
          inContext(s"signal ${signal.name}"):
            filterDefinitions(
              namespace = Some(ns),
              cls = Some(cls),
              signal = Some(signal)
            )
            coll.observe(renderSignal(cls, signal))
            reporter.recordSignal(signal.name, ReportResult.Success)
        .foreach: err =>
          renderSignalStub(signal, err)
          reporter.recordSignal(
            signal.name,
            ReportResult.Failure(err.getMessage)
          )

      coll
        .effectsSoFar()
        .distinct
        .collect:
          case Effect.RequiresDefinition(df) =>
            emptyLine()
            df()

    handleExceptions:
      coll.observe(renderClassCompanionObject(ns, cls))
end renderClass
