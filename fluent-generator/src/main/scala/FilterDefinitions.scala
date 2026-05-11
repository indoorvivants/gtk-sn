import com.indoorvivants.gnome.gir_schema.*

import scala.util.boundary, boundary.break
import FluentErrReason.*

def filterDefinitions(
    namespace: Option[AugmentedNamespace] = None,
    cls: Option[AugmentedClass] = None,
    iface: Option[AugmentedInterface] = None,
    method: Option[Method] = None,
    constructor: Option[Constructor] = None,
    enumer: Option[Enumeration] = None,
    function: Option[FunctionType] = None,
    bitfield: Option[Bitfield] = None,
    constant: Option[AugmentedConstant] = None,
    signal: Option[AugmentedSignal] = None
)(using boundary.Label[FluentErr]): Unit =

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

  def hasNullableParameters(
      params: Seq[Parameter | Instanceu45parameter]
  ): Boolean =
    params
      .collectFirst:
        case p: Parameter if p.nullable.contains(Number1Value20) => true
        case p: Instanceu45parameter if p.nullable.contains(Number1Value20) =>
          true
      .contains(true)

  def hasInoutParamaters(
      params: Seq[Parameter | Instanceu45parameter]
  ): Boolean =
    params
      .collectFirst:
        case p: Parameter if p.direction.contains(Inout)                 => true
        case p: Instanceu45parameter if p.direction.contains(InoutValue) => true
      .contains(true)

  val msg = boundary[Option[String]]:
    def check(b: Boolean, msg: String) =
      if b then break(Some(msg))

    def weirdClass(name: String, msg: String = "") =
      check(isClass(name), s"Class $name is weird: $msg")

    def weirdEnum(name: String, msg: String = "") =
      check(enumer.exists(_.name == name), s"Enum $name is weird: $msg")

    def weirdBitfield(name: String, msg: String = "") =
      check(bitfield.exists(_.name == name), s"Bitfield $name is weird: $msg")

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

    // Something about harfbuzz on apple may be
    val weirdEnums = Seq(
      "ot_layout_glyph_class_t",
      "aat_layout_feature_selector_t",
      "aat_layout_feature_type_t",
      "ot_layout_baseline_tag_t",
      "ot_math_constant_t",
      "ot_math_kern_t",
      "ot_meta_tag_t",
      "ot_metrics_tag_t",
      "ot_name_id_predefined_t",
      "PackDirection"
    )

    weirdEnums.foreach(weirdEnum(_))

    val weirdBitfields = Seq(
      "ot_color_palette_flags_t",
      "ot_math_glyph_part_flags_t",
      "ot_var_axis_flags_t",
      "PixbufFormatFlags",
      "PrintCapabilities"
    )

    weirdBitfields.foreach(weirdBitfield(_))

    def weirdMethod(cName: String, msg: String) =
      method.foreach: meth =>
        check(meth.identifier == cName, s"Method ${meth.name} is weird: $msg")

    def weirdFunction(cName: String, msg: String) =
      function.foreach: meth =>
        check(meth.identifier == cName, s"Function ${meth.name} is weird: $msg")

    def weirdConstructor(cName: String, msg: String) =
      constructor.foreach: meth =>
        check(
          meth.identifier == cName,
          s"Constructor ${meth.name} is weird: $msg"
        )

    val weirdArrays = Seq(
      "gtk_cclosure_expression_new",
      "g_application_open",
      "g_socket_send_message",
      "gtk_closure_expression_new",
      "gtk_snapshot_append_cairo",
      "gtk_im_context_simple_add_table",
      "gtk_cclosure_expression_new",
      "gtk_snapshot_append_border",
      "gdk_content_provider_new_union",
      "gsk_container_node_new",
      "gsk_border_node_new",
      "gsk_gl_shader_node_new",
      "g_object_interface_list_properties"
    )

    weirdFunction("g_strv_get_type", "Incorrectly sitting in gobject bindings?")
    weirdFunction(
      "g_variant_get_gtype",
      "Incorrectly sitting in gobject bindings?"
    )

    weirdArrays.foreach: ar =>
      weirdMethod(ar, "non NULL-terminated arrays require special handling")
      weirdConstructor(
        ar,
        "non NULL-terminated arrays require special handling"
      )
      weirdFunction(ar, "non NULL-terminated arrays require special handling")

    val weirdFunctions = Seq(
      "g_assertion_message_cmpstrv",
      "g_atomic_",
      "g_bit_trylock",
      "g_bit_unlock",
      "cairo_image_surface_create"
    )

    weirdFunctions.foreach: f =>
      check(function.exists(_.identifier.startsWith(f)), "weird")

    weirdMethod(
      "g_type_module_use",
      "Incompatible override between TypeModule and TypePlugin"
    )

    weirdMethod("g_object_get_valist", "conflicting override")
    weirdMethod(
      "gtk_print_settings_set",
      "override stuff I don't want to deal with"
    )
    weirdMethod("g_type_module_unuse", "I don't want to deal with this")

    weirdMethod(
      "g_socket_client_connect",
      "Incorrectly marked as overriding a connect method in GObject"
    )
    weirdMethod(
      "g_socket_connect",
      "Incorrectly marked as overriding a connect method in GObject"
    )
    weirdMethod(
      "g_socket_connection_connect",
      "Incorrectly marked as overriding a connect method in GObject"
    )

    weirdMethod(
      "pango_coverage_set",
      "Incorrectly marked as overriding a set method in GObject"
    )

    weirdMethod("gdk_clipboard_set_valist", "Something with overrides ")

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

      weirdArrays.foreach: ar =>
        weirdMethod(ar, "non NULL-terminated arrays require special handling")

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
        hasOutParameters(constr.parameters),
        s"Constructor ${constr.name} contains an OUT parameter, which is not supported yet"
      )
      check(
        hasInoutParamaters(constr.parameters),
        s"Constructor ${constr.name} contains an INOUT parameter, which is not supported yet"
      )
    function.foreach: func =>
      check(
        hasOutParameters(func.parameters),
        s"Function ${func.name} contains an OUT parameter, which is not supported yet"
      )
      check(
        hasInoutParamaters(func.parameters),
        s"Function ${func.name} contains an INOUT parameter, which is not supported yet"
      )

    None

  msg.foreach: m =>
    raise(Other(m))
end filterDefinitions
