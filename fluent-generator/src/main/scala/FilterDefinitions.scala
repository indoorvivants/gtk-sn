import com.indoorvivants.gnome.gir_schema.*

import scala.util.boundary, boundary.break

def filterDefinitions(
    namespace: Option[AugmentedNamespace] = None,
    cls: Option[AugmentedClass] = None,
    iface: Option[AugmentedInterface] = None,
    method: Option[Method] = None,
    constructor: Option[Constructor] = None
): Option[String] =

  def isNamespace(name: String) =
    namespace.exists(_.name.exists(n => n.equalsIgnoreCase(name)))
  def isClass(name: String) =
    cls.exists(_.name.equalsIgnoreCase(name))
  def isMethod(name: String) =
    method.exists(_.name.equalsIgnoreCase(name))

  def isConstructor(name: String) =
    constructor.exists(_.name.equalsIgnoreCase(name))

  def all(b: Boolean*) =
    b.forall(identity)

  def hasArray(params: Seq[Parameter | Instanceu45parameter]): Boolean =
    params
      .flatMap(_.tpe)
      .collectFirst:
        case _: ArrayType => true
      .contains(true)
  end hasArray

  def hasArrayConstr(params: Seq[Parameter | Instanceu45parameter]): Boolean =
    params
      .flatMap(_.tpe)
      .collectFirst:
        case _: ArrayType => true
      .contains(true)


  def hasOutParameters(params: Seq[Parameter | Instanceu45parameter]): Boolean =
    params
      .collectFirst:
        case p: Parameter if p.direction.contains(Out)                 => true
        case p: Instanceu45parameter if p.direction.contains(OutValue) => true
        // case _: ArrayType => true
      .contains(true)
  end hasOutParameters

  def hasInoutParamaters(params: Seq[Parameter | Instanceu45parameter]): Boolean =
    params
      .collectFirst:
        case p: Parameter if p.direction.contains(Inout)                 => true
        case p: Instanceu45parameter if p.direction.contains(InoutValue) => true
      .contains(true)

  boundary[Option[String]]:
    def check(b: Boolean, msg: String) =
      if b then break(Some(msg))

    def weirdClass(name: String, msg: String = "") =
      check(isClass(name), s"Class $name is weird: $msg")

    weirdClass("UnixInputStream")
    weirdClass("UnixMountMonitor")
    weirdClass("UnixOutputStream")
    weirdClass("UnixFDMessage")
    weirdClass("DesktopAppInfo")
    weirdClass("ThreadedResolver")
    weirdClass("BroadwayRenderer", "Missing in raw bindings")
    weirdClass("PrintJob", "Missing in raw bindings")
    weirdClass("Printer", "Missing in raw bindings")
    weirdClass("PrintUnixDialog", "Missing in raw bindings")
    weirdClass("PageSetupUnixDialog", "Missing in raw bindings")

    def weirdMethod(cName: String, msg: String) =
      method.foreach: meth =>
        check(meth.identifier == cName, s"Method ${meth.name} is weird: $msg")

    method.foreach: meth =>
      weirdMethod(
        "pango_font_get_hb_font",
        "refers to HarfBuzz.font_t as gconstpointer"
      )
      weirdMethod(
        "g_data_input_stream_read_byte",
        s"there are conflicting versions of it in DataInputStream and BufferedInputStream"
      )
      weirdMethod("gtk_menu_button_get_direction", "conflicting override")
      weirdMethod("gtk_menu_button_set_direction", "conflicting override")
      check(
        meth.identifier.startsWith("g_settings_backend"),
        "GSettingsBackend methods are not rendered"
      )
      check(
        hasArray(meth.parameters),
        s"Method ${meth.name} contains an array parameter, which is not supported yet"
      )
      check(
        hasOutParameters(meth.parameters),
        s"Method ${meth.name} contains an OUT parameter, which is not supported yet"
      )
      check(
        hasInoutParamaters(meth.parameters),
        s"Method ${meth.name} contains an INOUT parameter, which is not supported yet"
      )

    constructor.foreach: constr =>
      check(
        hasArray(constr.parameters),
        s"constructor ${constr.name} contains an array parameter, which is not supported yet"
      )
      check(
        hasOutParameters(constr.parameters),
        s"Constructor ${constr.name} contains an OUT parameter, which is not supported yet"
      )
      check(
        hasInoutParamaters(constr.parameters),
        s"Constructor ${constr.name} contains an INOUT parameter, which is not supported yet"
      )

    None

end filterDefinitions
