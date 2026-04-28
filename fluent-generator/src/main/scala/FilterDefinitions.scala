import com.indoorvivants.gnome.gir_schema.*

import scala.util.boundary, boundary.break

def filterDefinitions(
    namespace: Option[AugmentedNamespace] = None,
    cls: Option[AugmentedClass] = None,
    iface: Option[AugmentedInterface] = None,
    method: Option[Method] = None,
    constructor: Option[Constructor] = None
): Option[String] =
  // val isiFltered = cls
  //   .map(_.name)
  //   .collect:
  //     case "Application" => None
  //     case other         => Some(s"skipping $other")
  //   .flatten

  // return isiFltered

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

  def hasArray(meth: Method): Boolean =
    meth.parameters
      .flatMap(_.tpe)
      .collectFirst:
        case _: ArrayType => true
      .contains(true)
  end hasArray

  def hasOutParameters(meth: Method): Boolean =
    meth.parameters
      .collectFirst:
        case p: Parameter if p.direction.contains(Out)                 => true
        case p: Instanceu45parameter if p.direction.contains(OutValue) => true
        // case _: ArrayType => true
      .contains(true)
  end hasOutParameters

  boundary[Option[String]]:
    def check(b: Boolean, msg: String) =
      if b then break(Some(msg))

    // check(
    //   all(
    //     isNamespace("gobject"),
    //     isClass("SignalGroup"),
    //     isMethod(
    //       "connect_closure"
    //     )
    //   ),
    //   "Method connectClosure is not rendered: for some reason g_signal_group_connect_closure is absent from raw bindings"
    // )

    def weirdClass(name: String) =
      check(isClass(name), s"Class $name is weird")

    weirdClass("UnixInputStream")
    weirdClass("UnixMountMonitor")
    weirdClass("UnixOutputStream")
    weirdClass("UnixFDMessage")
    weirdClass("DesktopAppInfo")
    weirdClass("ThreadedResolver")

    def weirdMethod(cName: String, msg: String) =
      method.foreach: meth =>
        check(meth.identifier == cName, s"Method ${meth.name} is weird: $msg")

    method.foreach: meth =>
      weirdMethod(
        "pango_font_get_hb_font",
        "refers to HarfBuzz.font_t as gconstpointer"
      )
      check(
        meth.identifier.startsWith("g_data_input_stream_read_byte"),
        s"Method ${meth.name} is not rendered – there are conflicting versions of it in DataInputStream and BufferedInputStream"
      )
      check(
        meth.identifier.startsWith("g_settings_backend"),
        "GSettingsBackend methods are not rendered"
      )
      check(
        hasArray(meth),
        s"Method ${meth.name} contains an array parameter, which is not supported yet"
      )
      check(
        hasOutParameters(meth),
        s"Method ${meth.name} contains an OUT parameter, which is not supported yet"
      )

    None

end filterDefinitions
