package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{
  gboolean,
  gchar,
  gconstpointer,
  gdouble,
  gfloat,
  gint,
  gint64,
  gpointer,
  gsize,
  guint,
  guint32,
  guint64,
  guint8,
  gulong,
  gunichar
}
import sn.gnome.gobject.fluent.{
  Object,
  ParamFlags,
  ParamSpec,
  TypeDebugFlags,
  TypeFlags,
  TypePlugin
}
import sn.gnome.gobject.internal.GType

object GObject:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Provide a copy of a boxed structure @src_boxed which is of type @boxed_type.
    */
  def boxedCopy(
      boxed_type: GType /* Some(GType) */,
      src_boxed: Ptr[
        Byte
      ] /* Some(_root_.sn.gnome.glib.internal.gconstpointer) */
  ): Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */ =
    g_boxed_copy(boxed_type, gconstpointer(src_boxed)).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Free the boxed structure @boxed which is of type @boxed_type.
    */
  def boxedFree(
      boxed_type: GType /* Some(GType) */,
      boxed: Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
  ): Unit /* Some(Unit) */ = g_boxed_free(boxed_type, gpointer(boxed))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function creates a new %G_TYPE_BOXED derived type id for a new boxed
    * type with name @name.
    *
    * Boxed type handling functions have to be provided to copy and free opaque
    * boxed structures of this type.
    *
    * For the general case, it is recommended to use G_DEFINE_BOXED_TYPE()
    * instead of calling g_boxed_type_register_static() directly. The macro will
    * create the appropriate `*_get_type()` function for the boxed type.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(BoxedCopyFunc), @type -> DataRecord(GBoxedCopyFunc)))"
  )
  def boxedTypeRegisterStatic() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A #GClosureMarshal function for use with signals with handlers that take
    * two boxed pointers as arguments and return a boolean. If you have such a
    * signal, you will probably also need to use an accumulator, such as
    * g_signal_accumulator_true_handled().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def cclosureMarshalBOOLEANBOXEDBOXED() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A marshaller for a #GCClosure with a callback of type
    * `gboolean (*callback) (gpointer instance, gint arg1, gpointer user_data)`
    * where the #gint parameter denotes a flags type.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def cclosureMarshalBOOLEANFLAGS() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A marshaller for a #GCClosure with a callback of type
    * `gchar* (*callback) (gpointer instance, GObject *arg1, gpointer arg2, gpointer user_data)`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def cclosureMarshalSTRINGOBJECTPOINTER() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, gboolean arg1, gpointer user_data)`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def cclosureMarshalVOIDBOOLEAN() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, GBoxed *arg1, gpointer user_data)`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def cclosureMarshalVOIDBOXED() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, gchar arg1, gpointer user_data)`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def cclosureMarshalVOIDCHAR() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, gdouble arg1, gpointer user_data)`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def cclosureMarshalVOIDDOUBLE() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, gint arg1, gpointer user_data)`
    * where the #gint parameter denotes an enumeration type..
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def cclosureMarshalVOIDENUM() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, gint arg1, gpointer user_data)`
    * where the #gint parameter denotes a flags type.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def cclosureMarshalVOIDFLAGS() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, gfloat arg1, gpointer user_data)`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def cclosureMarshalVOIDFLOAT() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, gint arg1, gpointer user_data)`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def cclosureMarshalVOIDINT() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, glong arg1, gpointer user_data)`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def cclosureMarshalVOIDLONG() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, GObject *arg1, gpointer user_data)`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def cclosureMarshalVOIDOBJECT() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, GParamSpec *arg1, gpointer user_data)`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def cclosureMarshalVOIDPARAM() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, gpointer arg1, gpointer user_data)`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def cclosureMarshalVOIDPOINTER() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, const gchar *arg1, gpointer user_data)`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def cclosureMarshalVOIDSTRING() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, guchar arg1, gpointer user_data)`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def cclosureMarshalVOIDUCHAR() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, guint arg1, gpointer user_data)`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def cclosureMarshalVOIDUINT() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, guint arg1, gpointer arg2, gpointer user_data)`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def cclosureMarshalVOIDUINTPOINTER() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, gulong arg1, gpointer user_data)`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def cclosureMarshalVOIDULONG() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, GVariant *arg1, gpointer user_data)`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def cclosureMarshalVOIDVARIANT() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, gpointer user_data)`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def cclosureMarshalVOIDVOID() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A generic marshaller function implemented via
    * [libffi](http://sourceware.org/libffi/).
    *
    * Normally this function is not passed explicitly to g_signal_new(), but
    * used automatically by GLib when specifying a %NULL marshaller.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def cclosureMarshalGeneric() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new closure which invokes @callback_func with @user_data as the
    * last parameter.
    *
    * @destroy_data
    *   will be called as a finalize notifier on the #GClosure.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))"
  )
  def cclosureNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A variant of g_cclosure_new() which uses @object as @user_data and calls
    * g_object_watch_closure() on @object and the created closure. This function
    * is useful when you have a callback closely associated with a #GObject, and
    * want the callback to no longer run after the object is is freed.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))"
  )
  def cclosureNewObject() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A variant of g_cclosure_new_swap() which uses @object as @user_data and
    * calls g_object_watch_closure() on @object and the created closure. This
    * function is useful when you have a callback closely associated with a
    * #GObject, and want the callback to no longer run after the object is is
    * freed.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))"
  )
  def cclosureNewObjectSwap() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new closure which invokes @callback_func with @user_data as the
    * first parameter.
    *
    * @destroy_data
    *   will be called as a finalize notifier on the #GClosure.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))"
  )
  def cclosureNewSwap() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Clears a reference to a #GObject.
    *
    * @object_ptr
    *   must not be %NULL.
    *
    * If the reference is %NULL then this function does nothing. Otherwise, the
    * reference count of the object is decreased and the pointer is set to
    * %NULL.
    *
    * A macro is also included that allows this function to be used without
    * pointer casts.
    */
  def clearObject(
      object_ptr: Object /* Some(Ptr[Ptr[GObject]]) */
  ): Unit /* Some(Unit) */ = g_clear_object(
    object_ptr.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Disconnects a handler from @instance so it will not be called during any
    * future or currently ongoing emissions of the signal it has been connected
    * to. The @handler_id_ptr is then set to zero, which is never a valid
    * handler ID value (see g_signal_connect()).
    *
    * If the handler ID is 0 then this function does nothing.
    *
    * There is also a macro version of this function so that the code will be
    * inlined.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(gulong), @type -> DataRecord(gulong*)))"
  )
  def clearSignalHandler() = ???

  /**  COMMENT FOR THE ORIGINAL C DEFINITION
    *
    *  This function is meant to be called from the `complete_type_info`
    *  function of a #GTypePlugin implementation, as in the following
    *  example:
    *
    *  |[<!-- language="C" -->
    *  static void
    *  my_enum_complete_type_info (GTypePlugin     *plugin,
    *                              GType            g_type,
    *                              GTypeInfo       *info,
    *                              GTypeValueTable *value_table)
    *  {
    *    static const GEnumValue values[] = {
    *      { MY_ENUM_FOO, "MY_ENUM_FOO", "foo" },
    *      { MY_ENUM_BAR, "MY_ENUM_BAR", "bar" },
    *      { 0, NULL, NULL }
    *    };
    *
    *    g_enum_complete_type_info (type, info, values);
    *  }
    *  ]|
    */
  @annotation.compileTimeOnly(
    "Function enum_complete_type_info contains an OUT parameter, which is not supported yet"
  )
  def enumCompleteTypeInfo() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the #GEnumValue for a value.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(EnumClass), @type -> DataRecord(GEnumClass*)))"
  )
  def enumGetValue() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks up a #GEnumValue by name.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(EnumClass), @type -> DataRecord(GEnumClass*)))"
  )
  def enumGetValueByName() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks up a #GEnumValue by nickname.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(EnumClass), @type -> DataRecord(GEnumClass*)))"
  )
  def enumGetValueByNick() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Registers a new static enumeration type with the name @name.
    *
    * It is normally more convenient to let [glib-mkenums][glib-mkenums],
    * generate a my_enum_get_type() function from a usual C enumeration
    * definition than to write one yourself using g_enum_register_static().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(EnumValue), @type -> DataRecord(const GEnumValue*)))"
  )
  def enumRegisterStatic() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pretty-prints @value in the form of the enum’s name.
    *
    * This is intended to be used for debugging purposes. The format of the
    * output may change in the future.
    */
  def enumToString(
      g_enum_type: GType /* Some(GType) */,
      value: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  )(using Zone): String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */ =
    fromCString(g_enum_to_string(g_enum_type, gint(value)).asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function is meant to be called from the complete_type_info() function
    * of a #GTypePlugin implementation, see the example for
    * g_enum_complete_type_info() above.
    */
  @annotation.compileTimeOnly(
    "Function flags_complete_type_info contains an OUT parameter, which is not supported yet"
  )
  def flagsCompleteTypeInfo() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the first #GFlagsValue which is set in @value.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(FlagsClass), @type -> DataRecord(GFlagsClass*)))"
  )
  def flagsGetFirstValue() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks up a #GFlagsValue by name.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(FlagsClass), @type -> DataRecord(GFlagsClass*)))"
  )
  def flagsGetValueByName() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks up a #GFlagsValue by nickname.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(FlagsClass), @type -> DataRecord(GFlagsClass*)))"
  )
  def flagsGetValueByNick() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Registers a new static flags type with the name @name.
    *
    * It is normally more convenient to let [glib-mkenums][glib-mkenums]
    * generate a my_flags_get_type() function from a usual C enumeration
    * definition than to write one yourself using g_flags_register_static().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(FlagsValue), @type -> DataRecord(const GFlagsValue*)))"
  )
  def flagsRegisterStatic() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pretty-prints @value in the form of the flag names separated by ` | ` and
    * sorted. Any extra bits will be shown at the end as a hexadecimal number.
    *
    * This is intended to be used for debugging purposes. The format of the
    * output may change in the future.
    */
  def flagsToString(
      flags_type: GType /* Some(GType) */,
      value: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Zone): String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */ =
    fromCString(g_flags_to_string(flags_type, guint(value)).asInstanceOf)

  def gtypeGetType(): GType /* Some(GType) */ = g_gtype_get_type()

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GParamSpecBoolean instance specifying a %G_TYPE_BOOLEAN
    * property. In many cases, it may be more appropriate to use an enum with
    * g_param_spec_enum(), both to improve code clarity by using explicitly
    * named values, and to allow for more values to be added in future without
    * breaking API.
    *
    * See g_param_spec_internal() for details on property names.
    */
  def paramSpecBoolean(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      default_value: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using Zone): ParamSpec /* Some(Ptr[GParamSpec]) */ = new ParamSpec(
    g_param_spec_boolean(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      nick
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      blurb
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      gboolean(gint((if default_value == true then 1 else 0))),
      flags.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GParamSpecBoxed instance specifying a %G_TYPE_BOXED derived
    * property.
    *
    * See g_param_spec_internal() for details on property names.
    */
  def paramSpecBoxed(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      boxed_type: GType /* Some(GType) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using Zone): ParamSpec /* Some(Ptr[GParamSpec]) */ = new ParamSpec(
    g_param_spec_boxed(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      nick
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      blurb
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      boxed_type,
      flags.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GParamSpecChar instance specifying a %G_TYPE_CHAR property.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(gint8), @type -> DataRecord(gint8)))"
  )
  def paramSpecChar() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GParamSpecDouble instance specifying a %G_TYPE_DOUBLE
    * property.
    *
    * See g_param_spec_internal() for details on property names.
    */
  def paramSpecDouble(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      minimum: Double /* Some(_root_.sn.gnome.glib.internal.gdouble) */,
      maximum: Double /* Some(_root_.sn.gnome.glib.internal.gdouble) */,
      default_value: Double /* Some(_root_.sn.gnome.glib.internal.gdouble) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using Zone): ParamSpec /* Some(Ptr[GParamSpec]) */ = new ParamSpec(
    g_param_spec_double(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      nick
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      blurb
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      gdouble(minimum),
      gdouble(maximum),
      gdouble(default_value),
      flags.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GParamSpecEnum instance specifying a %G_TYPE_ENUM property.
    *
    * See g_param_spec_internal() for details on property names.
    */
  def paramSpecEnum(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      enum_type: GType /* Some(GType) */,
      default_value: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using Zone): ParamSpec /* Some(Ptr[GParamSpec]) */ = new ParamSpec(
    g_param_spec_enum(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      nick
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      blurb
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      enum_type,
      gint(default_value),
      flags.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GParamSpecFlags instance specifying a %G_TYPE_FLAGS
    * property.
    *
    * See g_param_spec_internal() for details on property names.
    */
  def paramSpecFlags(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      flags_type: GType /* Some(GType) */,
      default_value: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using Zone): ParamSpec /* Some(Ptr[GParamSpec]) */ = new ParamSpec(
    g_param_spec_flags(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      nick
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      blurb
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      flags_type,
      guint(default_value),
      flags.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GParamSpecFloat instance specifying a %G_TYPE_FLOAT
    * property.
    *
    * See g_param_spec_internal() for details on property names.
    */
  def paramSpecFloat(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      minimum: Float /* Some(_root_.sn.gnome.glib.internal.gfloat) */,
      maximum: Float /* Some(_root_.sn.gnome.glib.internal.gfloat) */,
      default_value: Float /* Some(_root_.sn.gnome.glib.internal.gfloat) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using Zone): ParamSpec /* Some(Ptr[GParamSpec]) */ = new ParamSpec(
    g_param_spec_float(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      nick
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      blurb
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      gfloat(minimum),
      gfloat(maximum),
      gfloat(default_value),
      flags.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GParamSpecGType instance specifying a %G_TYPE_GTYPE
    * property.
    *
    * See g_param_spec_internal() for details on property names.
    */
  def paramSpecGtype(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      is_a_type: GType /* Some(GType) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using Zone): ParamSpec /* Some(Ptr[GParamSpec]) */ = new ParamSpec(
    g_param_spec_gtype(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      nick
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      blurb
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      is_a_type,
      flags.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GParamSpecInt instance specifying a %G_TYPE_INT property.
    *
    * See g_param_spec_internal() for details on property names.
    */
  def paramSpecInt(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      minimum: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      maximum: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      default_value: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using Zone): ParamSpec /* Some(Ptr[GParamSpec]) */ = new ParamSpec(
    g_param_spec_int(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      nick
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      blurb
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      gint(minimum),
      gint(maximum),
      gint(default_value),
      flags.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GParamSpecInt64 instance specifying a %G_TYPE_INT64
    * property.
    *
    * See g_param_spec_internal() for details on property names.
    */
  def paramSpecInt64(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      minimum: CLongInt /* Some(_root_.sn.gnome.glib.internal.gint64) */,
      maximum: CLongInt /* Some(_root_.sn.gnome.glib.internal.gint64) */,
      default_value: CLongInt /* Some(_root_.sn.gnome.glib.internal.gint64) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using Zone): ParamSpec /* Some(Ptr[GParamSpec]) */ = new ParamSpec(
    g_param_spec_int64(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      nick
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      blurb
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      gint64(minimum),
      gint64(maximum),
      gint64(default_value),
      flags.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GParamSpecLong instance specifying a %G_TYPE_LONG property.
    *
    * See g_param_spec_internal() for details on property names.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(glong), @type -> DataRecord(glong)))"
  )
  def paramSpecLong() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GParamSpecBoxed instance specifying a %G_TYPE_OBJECT
    * derived property.
    *
    * See g_param_spec_internal() for details on property names.
    */
  def paramSpecObject(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      object_type: GType /* Some(GType) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using Zone): ParamSpec /* Some(Ptr[GParamSpec]) */ = new ParamSpec(
    g_param_spec_object(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      nick
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      blurb
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      object_type,
      flags.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new property of type #GParamSpecOverride. This is used to direct
    * operations to another paramspec, and will not be directly useful unless
    * you are implementing a new base type similar to GObject.
    */
  def paramSpecOverride(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      overridden: ParamSpec /* Some(Ptr[GParamSpec]) */
  )(using Zone): ParamSpec /* Some(Ptr[GParamSpec]) */ = new ParamSpec(
    g_param_spec_override(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      overridden.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GParamSpecParam instance specifying a %G_TYPE_PARAM
    * property.
    *
    * See g_param_spec_internal() for details on property names.
    */
  def paramSpecParam(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      param_type: GType /* Some(GType) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using Zone): ParamSpec /* Some(Ptr[GParamSpec]) */ = new ParamSpec(
    g_param_spec_param(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      nick
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      blurb
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      param_type,
      flags.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GParamSpecPointer instance specifying a pointer property.
    * Where possible, it is better to use g_param_spec_object() or
    * g_param_spec_boxed() to expose memory management information.
    *
    * See g_param_spec_internal() for details on property names.
    */
  def paramSpecPointer(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      flags: ParamFlags /* Some(GParamFlags) */
  )(using Zone): ParamSpec /* Some(Ptr[GParamSpec]) */ = new ParamSpec(
    g_param_spec_pointer(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      nick
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      blurb
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      flags.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GParamSpecString instance.
    *
    * See g_param_spec_internal() for details on property names.
    */
  def paramSpecString(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      default_value: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      flags: ParamFlags /* Some(GParamFlags) */
  )(using Zone): ParamSpec /* Some(Ptr[GParamSpec]) */ = new ParamSpec(
    g_param_spec_string(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      nick
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      blurb
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      default_value
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      flags.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GParamSpecUChar instance specifying a %G_TYPE_UCHAR
    * property.
    */
  def paramSpecUchar(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      minimum: UByte /* Some(_root_.sn.gnome.glib.internal.guint8) */,
      maximum: UByte /* Some(_root_.sn.gnome.glib.internal.guint8) */,
      default_value: UByte /* Some(_root_.sn.gnome.glib.internal.guint8) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using Zone): ParamSpec /* Some(Ptr[GParamSpec]) */ = new ParamSpec(
    g_param_spec_uchar(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      nick
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      blurb
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      guint8(minimum),
      guint8(maximum),
      guint8(default_value),
      flags.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GParamSpecUInt instance specifying a %G_TYPE_UINT property.
    *
    * See g_param_spec_internal() for details on property names.
    */
  def paramSpecUint(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      minimum: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      maximum: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      default_value: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using Zone): ParamSpec /* Some(Ptr[GParamSpec]) */ = new ParamSpec(
    g_param_spec_uint(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      nick
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      blurb
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      guint(minimum),
      guint(maximum),
      guint(default_value),
      flags.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GParamSpecUInt64 instance specifying a %G_TYPE_UINT64
    * property.
    *
    * See g_param_spec_internal() for details on property names.
    */
  def paramSpecUint64(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      minimum: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.guint64) */,
      maximum: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.guint64) */,
      default_value: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.guint64) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using Zone): ParamSpec /* Some(Ptr[GParamSpec]) */ = new ParamSpec(
    g_param_spec_uint64(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      nick
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      blurb
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      guint64(minimum),
      guint64(maximum),
      guint64(default_value),
      flags.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GParamSpecULong instance specifying a %G_TYPE_ULONG
    * property.
    *
    * See g_param_spec_internal() for details on property names.
    */
  def paramSpecUlong(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      minimum: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gulong) */,
      maximum: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gulong) */,
      default_value: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gulong) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using Zone): ParamSpec /* Some(Ptr[GParamSpec]) */ = new ParamSpec(
    g_param_spec_ulong(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      nick
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      blurb
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      gulong(minimum),
      gulong(maximum),
      gulong(default_value),
      flags.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GParamSpecUnichar instance specifying a %G_TYPE_UINT
    * property. #GValue structures for this property can be accessed with
    * g_value_set_uint() and g_value_get_uint().
    *
    * See g_param_spec_internal() for details on property names.
    */
  def paramSpecUnichar(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      default_value: CUnsignedInt /* Some(_root_.sn.gnome.glib.internal.gunichar) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using Zone): ParamSpec /* Some(Ptr[GParamSpec]) */ = new ParamSpec(
    g_param_spec_unichar(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      nick
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      blurb
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      gunichar(guint32(default_value)),
      flags.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GParamSpecValueArray instance specifying a
    * %G_TYPE_VALUE_ARRAY property. %G_TYPE_VALUE_ARRAY is a %G_TYPE_BOXED type,
    * as such, #GValue structures for this property can be accessed with
    * g_value_set_boxed() and g_value_get_boxed().
    *
    * See g_param_spec_internal() for details on property names.
    */
  def paramSpecValueArray(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      element_spec: ParamSpec /* Some(Ptr[GParamSpec]) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using Zone): ParamSpec /* Some(Ptr[GParamSpec]) */ = new ParamSpec(
    g_param_spec_value_array(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      nick
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      blurb
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      element_spec.getUnsafeRawPointer().asInstanceOf,
      flags.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GParamSpecVariant instance specifying a #GVariant property.
    *
    * If @default_value is floating, it is consumed.
    *
    * See g_param_spec_internal() for details on property names.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.VariantType), @type -> DataRecord(const GVariantType*)))"
  )
  def paramSpecVariant() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Registers @name as the name of a new static type derived from
    * %G_TYPE_PARAM.
    *
    * The type system uses the information contained in the #GParamSpecTypeInfo
    * structure pointed to by @info to manage the #GParamSpec type and its
    * instances.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(ParamSpecTypeInfo), @type -> DataRecord(const GParamSpecTypeInfo*)))"
  )
  def paramTypeRegisterStatic() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Transforms @src_value into @dest_value if possible, and then validates @dest_value,
    * in order for it to conform to @pspec. If
    * @strict_validation
    *   is %TRUE this function will only succeed if the transformed @dest_value
    *   complied to @pspec without modifications.
    *
    * See also g_value_type_transformable(), g_value_transform() and
    * g_param_value_validate().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(const GValue*)))"
  )
  def paramValueConvert() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether @value contains the default value as specified in @pspec.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(const GValue*)))"
  )
  def paramValueDefaults() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Return whether the contents of @value comply with the specifications set
    * out by @pspec.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(const GValue*)))"
  )
  def paramValueIsValid() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @value to its default value as specified in @pspec.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(GValue*)))"
  )
  def paramValueSetDefault() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ensures that the contents of @value comply with the specifications set out
    * by @pspec. For example, a #GParamSpecInt might require that integers
    * stored in @value may not be smaller than -42 and not be greater than +42.
    * If @value contains an integer outside of this range, it is modified
    * accordingly, so the resulting value will fit into the range -42 .. +42.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(GValue*)))"
  )
  def paramValueValidate() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Compares @value1 with @value2 according to @pspec, and return -1, 0 or +1,
    * if @value1 is found to be less than, equal to or greater than @value2,
    * respectively.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(const GValue*)))"
  )
  def paramValuesCmp() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new %G_TYPE_POINTER derived type id for a new pointer type with
    * name @name.
    */
  def pointerTypeRegisterStatic(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): GType /* Some(GType) */ = g_pointer_type_register_static(
    __sn_extract_string(name).asInstanceOf[Ptr[gchar]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A predefined #GSignalAccumulator for signals intended to be used as a hook
    * for application code to provide a particular value. Usually only one such
    * value is desired and multiple handlers for the same signal don't make much
    * sense (except for the case of the default handler defined in the class
    * structure, in which case you will usually want the signal connection to
    * override the class handler).
    *
    * This accumulator will use the return value from the first signal handler
    * that is run as the return value for the signal and not run any further
    * handlers (ie: the first handler "wins").
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(SignalInvocationHint), @type -> DataRecord(GSignalInvocationHint*)))"
  )
  def signalAccumulatorFirstWins() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A predefined #GSignalAccumulator for signals that return a boolean values.
    * The behavior that this accumulator gives is that a return of %TRUE stops
    * the signal emission: no further callbacks will be invoked, while a return
    * of %FALSE allows the emission to continue. The idea here is that a %TRUE
    * return indicates that the callback handled the signal, and no further
    * handling is needed.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(SignalInvocationHint), @type -> DataRecord(GSignalInvocationHint*)))"
  )
  def signalAccumulatorTrueHandled() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds an emission hook for a signal, which will get called for any emission
    * of that signal, independent of the instance. This is possible only for
    * signals which don't have %G_SIGNAL_NO_HOOKS flag set.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def signalAddEmissionHook() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Calls the original class closure of a signal. This function should only be
    * called from an overridden class closure; see
    * g_signal_override_class_closure() and g_signal_override_class_handler().
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(GValue)))),ListMap(@zero-terminated -> DataRecord(0), @type -> DataRecord(const GValue*)))"
  )
  def signalChainFromOverridden() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Calls the original class closure of a signal. This function should only be
    * called from an overridden class closure; see
    * g_signal_override_class_closure() and g_signal_override_class_handler().
    */
  inline def signalChainFromOverriddenHandler(
      instance: Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      args: Any*
  ): Unit /* Some(Unit) */ =
    g_signal_chain_from_overridden_handler(gpointer(instance), args*)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Connects a closure to a signal for a particular object.
    *
    * If @closure is a floating reference (see g_closure_sink()), this function
    * takes ownership of @closure.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def signalConnectClosure() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Connects a closure to a signal for a particular object.
    *
    * If @closure is a floating reference (see g_closure_sink()), this function
    * takes ownership of @closure.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def signalConnectClosureById() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Connects a #GCallback function to a signal for a particular object.
    * Similar to g_signal_connect(), but allows to provide a #GClosureNotify for
    * the data which will be called when the signal handler is disconnected and
    * no longer used. Specify @connect_flags if you need `..._after()` or
    * `..._swapped()` variants of this function.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))"
  )
  def signalConnectData() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This is similar to g_signal_connect_data(), but uses a closure which
    * ensures that the @gobject stays alive during the call to @c_handler by
    * temporarily adding a reference count to @gobject.
    *
    * When the @gobject is destroyed the signal handler will be automatically
    * disconnected. Note that this is not currently threadsafe (ie: emitting a
    * signal while @gobject is being destroyed in another thread is not safe).
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))"
  )
  def signalConnectObject() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emits a signal. Signal emission is done synchronously. The method will
    * only return control after all handlers are called or signal emission was
    * stopped.
    *
    * Note that g_signal_emit() resets the return value to the default if no
    * handlers are connected, in contrast to g_signal_emitv().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def signalEmit() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emits a signal. Signal emission is done synchronously. The method will
    * only return control after all handlers are called or signal emission was
    * stopped.
    *
    * Note that g_signal_emit_by_name() resets the return value to the default
    * if no handlers are connected, in contrast to g_signal_emitv().
    */
  inline def signalEmitByName(
      instance: Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      detailed_signal: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      args: Any*
  )(using Zone): Unit /* Some(Unit) */ = g_signal_emit_by_name(
    gpointer(
      instance.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]
    ),
    __sn_extract_string(detailed_signal).asInstanceOf[Ptr[gchar]],
    args*
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emits a signal. Signal emission is done synchronously. The method will
    * only return control after all handlers are called or signal emission was
    * stopped.
    *
    * Note that g_signal_emit_valist() resets the return value to the default if
    * no handlers are connected, in contrast to g_signal_emitv().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def signalEmitValist() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emits a signal. Signal emission is done synchronously. The method will
    * only return control after all handlers are called or signal emission was
    * stopped.
    *
    * Note that g_signal_emitv() doesn't change @return_value if no handlers are
    * connected, in contrast to g_signal_emit() and g_signal_emit_valist().
    */
  @annotation.compileTimeOnly(
    "Function signal_emitv contains an INOUT parameter, which is not supported yet"
  )
  def signalEmitv() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the invocation hint of the innermost signal emission of instance.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(SignalInvocationHint), @type -> DataRecord(GSignalInvocationHint*)))"
  )
  def signalGetInvocationHint() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Blocks a handler of an instance so it will not be called during any signal
    * emissions unless it is unblocked again. Thus "blocking" a signal handler
    * means to temporarily deactivate it, a signal handler has to be unblocked
    * exactly the same amount of times it has been blocked before to become
    * active again.
    *
    * The @handler_id has to be a valid signal handler id, connected to a signal
    * of @instance.
    */
  def signalHandlerBlock(
      instance: Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      handler_id: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gulong) */
  ): Unit /* Some(Unit) */ = g_signal_handler_block(
    gpointer(
      instance.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]
    ),
    gulong(handler_id)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Disconnects a handler from an instance so it will not be called during any
    * future or currently ongoing emissions of the signal it has been connected
    * to. The @handler_id becomes invalid and may be reused.
    *
    * The @handler_id has to be a valid signal handler id, connected to a signal
    * of @instance.
    */
  def signalHandlerDisconnect(
      instance: Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      handler_id: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gulong) */
  ): Unit /* Some(Unit) */ = g_signal_handler_disconnect(
    gpointer(
      instance.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]
    ),
    gulong(handler_id)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finds the first signal handler that matches certain selection criteria.
    * The criteria mask is passed as an OR-ed combination of #GSignalMatchType
    * flags, and the criteria values are passed as arguments. The match @mask
    * has to be non-0 for successful matches. If no handler was found, 0 is
    * returned.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def signalHandlerFind() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether @handler_id is the ID of a handler connected to @instance.
    */
  def signalHandlerIsConnected(
      instance: Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      handler_id: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gulong) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_signal_handler_is_connected(
      gpointer(
        instance.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]
      ),
      gulong(handler_id)
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Undoes the effect of a previous g_signal_handler_block() call. A blocked
    * handler is skipped during signal emissions and will not be invoked,
    * unblocking it (for exactly the amount of times it has been blocked before)
    * reverts its "blocked" state, so the handler will be recognized by the
    * signal system and is called upon future or currently ongoing signal
    * emissions (since the order in which handlers are called during signal
    * emissions is deterministic, whether the unblocked handler in question is
    * called as part of a currently ongoing emission depends on how far that
    * emission has proceeded yet).
    *
    * The @handler_id has to be a valid id of a signal handler that is connected
    * to a signal of @instance and is currently blocked.
    */
  def signalHandlerUnblock(
      instance: Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      handler_id: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gulong) */
  ): Unit /* Some(Unit) */ = g_signal_handler_unblock(
    gpointer(
      instance.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]
    ),
    gulong(handler_id)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Blocks all handlers on an instance that match a certain selection
    * criteria.
    *
    * The criteria mask is passed as a combination of #GSignalMatchType flags,
    * and the criteria values are passed as arguments. A handler must match on
    * all flags set in @mask to be blocked (i.e. the match is conjunctive).
    *
    * Passing at least one of the %G_SIGNAL_MATCH_ID, %G_SIGNAL_MATCH_CLOSURE,
    * %G_SIGNAL_MATCH_FUNC or %G_SIGNAL_MATCH_DATA match flags is required for
    * successful matches. If no handlers were found, 0 is returned, the number
    * of blocked handlers otherwise.
    *
    * Support for %G_SIGNAL_MATCH_ID was added in GLib 2.78.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def signalHandlersBlockMatched() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Destroy all signal handlers of a type instance. This function is an
    * implementation detail of the #GObject dispose implementation, and should
    * not be used outside of the type system.
    */
  def signalHandlersDestroy(
      instance: Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */
  ): Unit /* Some(Unit) */ = g_signal_handlers_destroy(
    gpointer(
      instance.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Disconnects all handlers on an instance that match a certain selection
    * criteria.
    *
    * The criteria mask is passed as a combination of #GSignalMatchType flags,
    * and the criteria values are passed as arguments. A handler must match on
    * all flags set in @mask to be disconnected (i.e. the match is conjunctive).
    *
    * Passing at least one of the %G_SIGNAL_MATCH_ID, %G_SIGNAL_MATCH_CLOSURE,
    * %G_SIGNAL_MATCH_FUNC or %G_SIGNAL_MATCH_DATA match flags is required for
    * successful matches. If no handlers were found, 0 is returned, the number
    * of disconnected handlers otherwise.
    *
    * Support for %G_SIGNAL_MATCH_ID was added in GLib 2.78.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def signalHandlersDisconnectMatched() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unblocks all handlers on an instance that match a certain selection
    * criteria.
    *
    * The criteria mask is passed as a combination of #GSignalMatchType flags,
    * and the criteria values are passed as arguments. A handler must match on
    * all flags set in @mask to be unblocked (i.e. the match is conjunctive).
    *
    * Passing at least one of the %G_SIGNAL_MATCH_ID, %G_SIGNAL_MATCH_CLOSURE,
    * %G_SIGNAL_MATCH_FUNC or %G_SIGNAL_MATCH_DATA match flags is required for
    * successful matches. If no handlers were found, 0 is returned, the number
    * of unblocked handlers otherwise. The match criteria should not apply to
    * any handlers that are not currently blocked.
    *
    * Support for %G_SIGNAL_MATCH_ID was added in GLib 2.78.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def signalHandlersUnblockMatched() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether there are any handlers connected to @instance for the
    * given signal id and detail.
    *
    * If @detail is 0 then it will only match handlers that were connected
    * without detail. If @detail is non-zero then it will match handlers
    * connected both without detail and with the given detail. This is
    * consistent with how a signal emitted with @detail would be delivered to
    * those handlers.
    *
    * Since 2.46 this also checks for a non-default class closure being
    * installed, as this is basically always what you want.
    *
    * One example of when you might use this is when the arguments to the signal
    * are difficult to compute. A class implementor may opt to not emit the
    * signal if no one is attached anyway, thus saving the cost of building the
    * arguments.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def signalHasHandlerPending() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Validate a signal name. This can be useful for dynamically-generated
    * signals which need to be validated at run-time before actually trying to
    * create them.
    *
    * See [canonical parameter names][canonical-parameter-names] for details of
    * the rules for valid names. The rules for signal names are the same as
    * those for property names.
    */
  def signalIsValidName(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_signal_is_valid_name(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Lists the signals by id that a certain instance or interface type created.
    * Further information about the signals can be acquired through
    * g_signal_query().
    */
  @annotation.compileTimeOnly(
    "Function signal_list_ids contains an OUT parameter, which is not supported yet"
  )
  def signalListIds() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Given the name of the signal and the type of object it connects to, gets
    * the signal's identifying integer. Emitting the signal by number is
    * somewhat faster than using the name each time.
    *
    * Also tries the ancestors of the given type.
    *
    * The type class passed as @itype must already have been instantiated (for
    * example, using g_type_class_ref()) for this function to work, as signals
    * are always installed during class initialization.
    *
    * See g_signal_new() for details on allowed signal names.
    */
  def signalLookup(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      itype: GType /* Some(GType) */
  )(using Zone): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ =
    g_signal_lookup(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      itype
    ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Given the signal's identifier, finds its name.
    *
    * Two different signals may have the same name, if they have differing
    * types.
    */
  def signalName(
      signal_id: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Zone): String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */ =
    fromCString(g_signal_name(guint(signal_id)).asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new signal. (This is usually done in the class initializer.)
    *
    * A signal name consists of segments consisting of ASCII letters and digits,
    * separated by either the `-` or `_` character. The first character of a
    * signal name must be a letter. Names which violate these rules lead to
    * undefined behaviour. These are the same rules as for property naming (see
    * g_param_spec_internal()).
    *
    * When registering a signal and looking up a signal, either separator can be
    * used, but they cannot be mixed. Using `-` is considerably more efficient.
    * Using `_` is discouraged.
    *
    * If 0 is used for @class_offset subclasses cannot override the class
    * handler in their class_init method by doing super_class->signal_handler =
    * my_signal_handler. Instead they will have to use
    * g_signal_override_class_handler().
    *
    * If @c_marshaller is %NULL, g_cclosure_marshal_generic() will be used as
    * the marshaller for this signal. In some simple cases, g_signal_new() will
    * use a more optimized c_marshaller and va_marshaller for the signal instead
    * of g_cclosure_marshal_generic().
    *
    * If @c_marshaller is non-%NULL, you need to also specify a va_marshaller
    * using g_signal_set_va_marshaller() or the generic va_marshaller will be
    * used.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(SignalAccumulator), @type -> DataRecord(GSignalAccumulator)))"
  )
  def signalNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new signal. (This is usually done in the class initializer.)
    *
    * This is a variant of g_signal_new() that takes a C callback instead of a
    * class offset for the signal's class handler. This function doesn't need a
    * function pointer exposed in the class structure of an object definition,
    * instead the function pointer is passed directly and can be overridden by
    * derived classes with g_signal_override_class_closure() or
    * g_signal_override_class_handler() and chained to with
    * g_signal_chain_from_overridden() or
    * g_signal_chain_from_overridden_handler().
    *
    * See g_signal_new() for information about signal names.
    *
    * If c_marshaller is %NULL, g_cclosure_marshal_generic() will be used as the
    * marshaller for this signal.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))"
  )
  def signalNewClassHandler() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new signal. (This is usually done in the class initializer.)
    *
    * See g_signal_new() for details on allowed signal names.
    *
    * If c_marshaller is %NULL, g_cclosure_marshal_generic() will be used as the
    * marshaller for this signal.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def signalNewValist() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new signal. (This is usually done in the class initializer.)
    *
    * See g_signal_new() for details on allowed signal names.
    *
    * If c_marshaller is %NULL, g_cclosure_marshal_generic() will be used as the
    * marshaller for this signal.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def signalNewv() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Overrides the class closure (i.e. the default handler) for the given
    * signal for emissions on instances of @instance_type. @instance_type must
    * be derived from the type to which the signal belongs.
    *
    * See g_signal_chain_from_overridden() and
    * g_signal_chain_from_overridden_handler() for how to chain up to the parent
    * class closure from inside the overridden one.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def signalOverrideClassClosure() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Overrides the class closure (i.e. the default handler) for the given
    * signal for emissions on instances of @instance_type with callback @class_handler. @instance_type
    * must be derived from the type to which the signal belongs.
    *
    * See g_signal_chain_from_overridden() and
    * g_signal_chain_from_overridden_handler() for how to chain up to the parent
    * class closure from inside the overridden one.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))"
  )
  def signalOverrideClassHandler() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Internal function to parse a signal name into its @signal_id and @detail
    * quark.
    */
  @annotation.compileTimeOnly(
    "Function signal_parse_name contains an OUT parameter, which is not supported yet"
  )
  def signalParseName() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Queries the signal system for in-depth information about a specific
    * signal. This function will fill in a user-provided structure to hold
    * signal-specific information. If an invalid signal id is passed in, the @signal_id
    * member of the #GSignalQuery is 0. All members filled into the
    * #GSignalQuery structure should be considered constant and have to be left
    * untouched.
    */
  @annotation.compileTimeOnly(
    "Function signal_query contains an OUT parameter, which is not supported yet"
  )
  def signalQuery() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Deletes an emission hook.
    */
  def signalRemoveEmissionHook(
      signal_id: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      hook_id: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gulong) */
  ): Unit /* Some(Unit) */ =
    g_signal_remove_emission_hook(guint(signal_id), gulong(hook_id))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Change the #GSignalCVaMarshaller used for a given signal. This is a
    * specialised form of the marshaller that can often be used for the common
    * case of a single connected signal handler and avoids the overhead of
    * #GValue. Its use is optional.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(SignalCVaMarshaller), @type -> DataRecord(GSignalCVaMarshaller)))"
  )
  def signalSetVaMarshaller() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Stops a signal's current emission.
    *
    * This will prevent the default method from running, if the signal was
    * %G_SIGNAL_RUN_LAST and you connected normally (i.e. without the "after"
    * flag).
    *
    * Prints a warning if used on a signal which isn't being emitted.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def signalStopEmission() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Stops a signal's current emission.
    *
    * This is just like g_signal_stop_emission() except it will look up the
    * signal id for you.
    */
  def signalStopEmissionByName(
      instance: Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      detailed_signal: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* Some(Unit) */ = g_signal_stop_emission_by_name(
    gpointer(
      instance.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]
    ),
    __sn_extract_string(detailed_signal).asInstanceOf[Ptr[gchar]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new closure which invokes the function found at the offset
    * @struct_offset
    *   in the class structure of the interface or classed type identified by @itype.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def signalTypeCclosureNew() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Set the callback for a source as a #GClosure.
    *
    * If the source is not one of the standard GLib types, the @closure_callback
    * and @closure_marshal fields of the #GSourceFuncs structure must have been
    * filled in with pointers to appropriate functions.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Source), @type -> DataRecord(GSource*)))"
  )
  def sourceSetClosure() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a dummy callback for @source. The callback will do nothing, and if
    * the source expects a #gboolean return value, it will return %TRUE. (If the
    * source expects any other type of return value, it will return a 0/%NULL
    * value; whatever g_value_init() initializes a #GValue to for that type.)
    *
    * If the source is not one of the standard GLib types, the
    * @closure_callback
    *   and @closure_marshal fields of the #GSourceFuncs structure must have
    *   been filled in with pointers to appropriate functions.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Source), @type -> DataRecord(GSource*)))"
  )
  def sourceSetDummyCallback() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Return a newly allocated string, which describes the contents of a
    * #GValue. The main purpose of this function is to describe #GValue contents
    * for debugging output, the way in which the contents are described may
    * change between different GLib versions.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(const GValue*)))"
  )
  def strdupValueContents() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a #GTypeClassCacheFunc to be called before the reference count of a
    * class goes from one to zero. This can be used to prevent premature class
    * destruction. All installed #GTypeClassCacheFunc functions will be chained
    * until one of them returns %TRUE. The functions have to check the class id
    * passed in to figure whether they actually want to cache the class of this
    * type, since all classes are routed through the same #GTypeClassCacheFunc
    * chain.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeClassCacheFunc), @type -> DataRecord(GTypeClassCacheFunc)))"
  )
  def typeAddClassCacheFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Registers a private class structure for a classed type; when the class is
    * allocated, the private structures for the class and all of its parent
    * types are allocated sequentially in the same memory block as the public
    * structures, and are zero-filled.
    *
    * This function should be called in the type's get_type() function after the
    * type is registered. The private structure can be retrieved using the
    * G_TYPE_CLASS_GET_PRIVATE() macro.
    */
  def typeAddClassPrivate(
      class_type: GType /* Some(GType) */,
      private_size: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */
  ): Unit /* Some(Unit) */ =
    g_type_add_class_private(class_type, gsize(private_size))

  def typeAddInstancePrivate(
      class_type: GType /* Some(GType) */,
      private_size: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */
  ): Int /* Some(_root_.sn.gnome.glib.internal.gint) */ =
    g_type_add_instance_private(class_type, gsize(private_size)).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a function to be called after an interface vtable is initialized for
    * any class (i.e. after the @interface_init member of #GInterfaceInfo has
    * been called).
    *
    * This function is useful when you want to check an invariant that depends
    * on the interfaces of a class. For instance, the implementation of #GObject
    * uses this facility to check that an object implements all of the
    * properties that are defined on its interfaces.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeInterfaceCheckFunc), @type -> DataRecord(GTypeInterfaceCheckFunc)))"
  )
  def typeAddInterfaceCheck() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds @interface_type to the dynamic @instance_type. The information
    * contained in the #GTypePlugin structure pointed to by @plugin is used to
    * manage the relationship.
    */
  def typeAddInterfaceDynamic(
      instance_type: GType /* Some(GType) */,
      interface_type: GType /* Some(GType) */,
      plugin: TypePlugin /* Some(Ptr[GTypePlugin]) */
  ): Unit /* Some(Unit) */ = g_type_add_interface_dynamic(
    instance_type,
    interface_type,
    plugin.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds @interface_type to the static @instance_type. The information
    * contained in the #GInterfaceInfo structure pointed to by @info is used to
    * manage the relationship.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(InterfaceInfo), @type -> DataRecord(const GInterfaceInfo*)))"
  )
  def typeAddInterfaceStatic() = ???

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeClass), @type -> DataRecord(GTypeClass*)))"
  )
  def typeCheckClassCast() = ???

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeClass), @type -> DataRecord(GTypeClass*)))"
  )
  def typeCheckClassIsA() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Private helper function to aid implementation of the
    * G_TYPE_CHECK_INSTANCE() macro.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeInstance), @type -> DataRecord(GTypeInstance*)))"
  )
  def typeCheckInstance() = ???

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeInstance), @type -> DataRecord(GTypeInstance*)))"
  )
  def typeCheckInstanceCast() = ???

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeInstance), @type -> DataRecord(GTypeInstance*)))"
  )
  def typeCheckInstanceIsA() = ???

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeInstance), @type -> DataRecord(GTypeInstance*)))"
  )
  def typeCheckInstanceIsFundamentallyA() = ???

  def typeCheckIsValueType(
      `type`: GType /* Some(GType) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_type_check_is_value_type(`type`).value.!=(0)

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(const GValue*)))"
  )
  def typeCheckValue() = ???

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(const GValue*)))"
  )
  def typeCheckValueHolds() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Return a newly allocated and 0-terminated array of type IDs, listing the
    * child types of @type.
    */
  @annotation.compileTimeOnly(
    "Function type_children contains an OUT parameter, which is not supported yet"
  )
  def typeChildren() = ???

  def typeClassAdjustPrivateOffset(
      g_class: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      private_size_or_offset: Ptr[
        Int
      ] /* Some(Ptr[_root_.sn.gnome.glib.internal.gint]) */
  ): Unit /* Some(Unit) */ = g_type_class_adjust_private_offset(
    g_class
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
    private_size_or_offset.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function is essentially the same as g_type_class_ref(), except that
    * the classes reference count isn't incremented. As a consequence, this
    * function may return %NULL if the class of the type passed in does not
    * currently exist (hasn't been referenced before).
    */
  def typeClassPeek(
      `type`: GType /* Some(GType) */
  ): Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */ =
    g_type_class_peek(`type`).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A more efficient version of g_type_class_peek() which works only for
    * static types.
    */
  def typeClassPeekStatic(
      `type`: GType /* Some(GType) */
  ): Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */ =
    g_type_class_peek_static(`type`).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Increments the reference count of the class structure belonging to
    * @type.
    *   This function will demand-create the class if it doesn't exist already.
    */
  def typeClassRef(
      `type`: GType /* Some(GType) */
  ): Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */ =
    g_type_class_ref(`type`).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates and initializes an instance of @type if @type is valid and can be
    * instantiated. The type system only performs basic allocation and structure
    * setups for instances: actual instance creation should happen through
    * functions supplied by the type's fundamental type implementation. So use
    * of g_type_create_instance() is reserved for implementers of fundamental
    * types only. E.g. instances of the #GObject hierarchy should be created via
    * g_object_new() and never directly through g_type_create_instance() which
    * doesn't handle things like singleton objects or object construction.
    *
    * The extended members of the returned instance are guaranteed to be filled
    * with zeros.
    *
    * Note: Do not use this function, unless you're implementing a fundamental
    * type. Also language bindings should not use this function, but
    * g_object_new() instead.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeInstance), @type -> DataRecord(GTypeInstance*)))"
  )
  def typeCreateInstance() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If the interface type @g_type is currently in use, returns its default
    * interface vtable.
    */
  def typeDefaultInterfacePeek(
      g_type: GType /* Some(GType) */
  ): Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */ =
    g_type_default_interface_peek(g_type).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Increments the reference count for the interface type @g_type, and returns
    * the default interface vtable for the type.
    *
    * If the type is not currently in use, then the default vtable for the type
    * will be created and initialized by calling the base interface init and
    * default vtable init functions for the type (the @base_init and @class_init
    * members of #GTypeInfo). Calling g_type_default_interface_ref() is useful
    * when you want to make sure that signals and properties for an interface
    * have been installed.
    */
  def typeDefaultInterfaceRef(
      g_type: GType /* Some(GType) */
  ): Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */ =
    g_type_default_interface_ref(g_type).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Decrements the reference count for the type corresponding to the interface
    * default vtable @g_iface. If the type is dynamic, then when no one is using
    * the interface and all references have been released, the finalize function
    * for the interface's default vtable (the @class_finalize member of
    * #GTypeInfo) will be called.
    */
  def typeDefaultInterfaceUnref(
      g_iface: Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
  ): Unit /* Some(Unit) */ = g_type_default_interface_unref(gpointer(g_iface))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the length of the ancestry of the passed in type. This includes
    * the type itself, so that e.g. a fundamental type has depth 1.
    */
  def typeDepth(
      `type`: GType /* Some(GType) */
  ): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ = g_type_depth(
    `type`
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ensures that the indicated @type has been registered with the type system,
    * and its _class_init() method has been run.
    *
    * In theory, simply calling the type's _get_type() method (or using the
    * corresponding macro) is supposed take care of this. However, _get_type()
    * methods are often marked %G_GNUC_CONST for performance reasons, even
    * though this is technically incorrect (since %G_GNUC_CONST requires that
    * the function not have side effects, which _get_type() methods do on the
    * first call). As a result, if you write a bare call to a _get_type() macro,
    * it may get optimized out by the compiler. Using g_type_ensure() guarantees
    * that the type's _get_type() method is called.
    */
  def typeEnsure(`type`: GType /* Some(GType) */ ): Unit /* Some(Unit) */ =
    g_type_ensure(`type`)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Frees an instance of a type, returning it to the instance pool for the
    * type, if there is one.
    *
    * Like g_type_create_instance(), this function is reserved for implementors
    * of fundamental types.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeInstance), @type -> DataRecord(GTypeInstance*)))"
  )
  def typeFreeInstance() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Look up the type ID from a given type name, returning 0 if no type has
    * been registered under this name (this is the preferred method to find out
    * by name whether a specific type has been registered yet).
    */
  def typeFromName(
      name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): GType /* Some(GType) */ = g_type_from_name(
    __sn_extract_string(name).asInstanceOf[Ptr[gchar]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Internal function, used to extract the fundamental type ID portion. Use
    * G_TYPE_FUNDAMENTAL() instead.
    */
  def typeFundamental(
      type_id: GType /* Some(GType) */
  ): GType /* Some(GType) */ = g_type_fundamental(type_id)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the next free fundamental type id which can be used to register a
    * new fundamental type with g_type_register_fundamental(). The returned type
    * ID represents the highest currently registered fundamental type
    * identifier.
    */
  def typeFundamentalNext(): GType /* Some(GType) */ = g_type_fundamental_next()

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the number of instances allocated of the particular type; this is
    * only available if GLib is built with debugging support and the
    * `instance-count` debug flag is set (by setting the `GOBJECT_DEBUG`
    * variable to include `instance-count`).
    */
  def typeGetInstanceCount(
      `type`: GType /* Some(GType) */
  ): Int /* Some(CInt) */ = g_type_get_instance_count(`type`)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the #GTypePlugin structure for @type.
    */
  def typeGetPlugin(
      `type`: GType /* Some(GType) */
  ): TypePlugin /* Some(Ptr[GTypePlugin]) */ =
    new TypePlugin.Abstract(g_type_get_plugin(`type`).asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains data which has previously been attached to @type with
    * g_type_set_qdata().
    *
    * Note that this does not take subtyping into account; data attached to one
    * type with g_type_set_qdata() cannot be retrieved from a subtype using
    * g_type_get_qdata().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def typeGetQdata() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns an opaque serial number that represents the state of the set of
    * registered types. Any time a type is registered this serial changes, which
    * means you can cache information based on type lookups (such as
    * g_type_from_name()) and know if the cache is still valid at a later time
    * by comparing the current serial with the one at the type lookup.
    */
  def typeGetTypeRegistrationSerial()
      : UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ =
    g_type_get_type_registration_serial().value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function used to initialise the type system. Since GLib 2.36, the
    * type system is initialised automatically and this function does nothing.
    */
  def typeInit(): Unit /* Some(Unit) */ = g_type_init()

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function used to initialise the type system with debugging flags.
    * Since GLib 2.36, the type system is initialised automatically and this
    * function does nothing.
    *
    * If you need to enable debugging features, use the `GOBJECT_DEBUG`
    * environment variable.
    */
  def typeInitWithDebugFlags(
      debug_flags: TypeDebugFlags /* Some(GTypeDebugFlags) */
  ): Unit /* Some(Unit) */ = g_type_init_with_debug_flags(debug_flags.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds @prerequisite_type to the list of prerequisites of @interface_type.
    * This means that any type implementing @interface_type must also implement
    * @prerequisite_type.
    *   Prerequisites can be thought of as an alternative to interface
    *   derivation (which GType doesn't support). An interface can have at most
    *   one instantiatable prerequisite type.
    */
  def typeInterfaceAddPrerequisite(
      interface_type: GType /* Some(GType) */,
      prerequisite_type: GType /* Some(GType) */
  ): Unit /* Some(Unit) */ =
    g_type_interface_add_prerequisite(interface_type, prerequisite_type)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the #GTypePlugin structure for the dynamic interface
    * @interface_type
    *   which has been added to @instance_type, or %NULL if @interface_type has
    *   not been added to @instance_type or does not have a #GTypePlugin
    *   structure. See g_type_add_interface_dynamic().
    */
  def typeInterfaceGetPlugin(
      instance_type: GType /* Some(GType) */,
      interface_type: GType /* Some(GType) */
  ): TypePlugin /* Some(Ptr[GTypePlugin]) */ = new TypePlugin.Abstract(
    g_type_interface_get_plugin(instance_type, interface_type).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the most specific instantiatable prerequisite of an interface
    * type. If the interface type has no instantiatable prerequisite,
    * %G_TYPE_INVALID is returned.
    *
    * See g_type_interface_add_prerequisite() for more information about
    * prerequisites.
    */
  def typeInterfaceInstantiatablePrerequisite(
      interface_type: GType /* Some(GType) */
  ): GType /* Some(GType) */ = g_type_interface_instantiatable_prerequisite(
    interface_type
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the #GTypeInterface structure of an interface to which the passed
    * in class conforms.
    */
  def typeInterfacePeek(
      instance_class: Ptr[
        Byte
      ] /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      iface_type: GType /* Some(GType) */
  ): Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */ =
    g_type_interface_peek(gpointer(instance_class), iface_type).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the prerequisites of an interfaces type.
    */
  @annotation.compileTimeOnly(
    "Function type_interface_prerequisites contains an OUT parameter, which is not supported yet"
  )
  def typeInterfacePrerequisites() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Return a newly allocated and 0-terminated array of type IDs, listing the
    * interface types that @type conforms to.
    */
  @annotation.compileTimeOnly(
    "Function type_interfaces contains an OUT parameter, which is not supported yet"
  )
  def typeInterfaces() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @is_a_type is a derivable type, check whether @type is a descendant of @is_a_type.
    * If @is_a_type is an interface, check whether @type conforms to it.
    */
  def typeIsA(
      `type`: GType /* Some(GType) */,
      is_a_type: GType /* Some(GType) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_type_is_a(`type`, is_a_type).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get the unique name that is assigned to a type ID. Note that this function
    * (like all other GType API) cannot cope with invalid type IDs.
    * %G_TYPE_INVALID may be passed to this function, as may be any other
    * validly registered type ID, but randomized type IDs should not be passed
    * in and will most likely lead to a crash.
    */
  def typeName(`type`: GType /* Some(GType) */ )(using
      Zone
  ): String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */ = fromCString(
    g_type_name(`type`).asInstanceOf
  )

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeClass), @type -> DataRecord(GTypeClass*)))"
  )
  def typeNameFromClass() = ???

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeInstance), @type -> DataRecord(GTypeInstance*)))"
  )
  def typeNameFromInstance() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Given a @leaf_type and a @root_type which is contained in its ancestry,
    * return the type that @root_type is the immediate parent of. In other
    * words, this function determines the type that is derived directly from @root_type
    * which is also a base class of
    * @leaf_type.
    *   Given a root type and a leaf type, this function can be used to
    *   determine the types and order in which the leaf type is descended from
    *   the root type.
    */
  def typeNextBase(
      leaf_type: GType /* Some(GType) */,
      root_type: GType /* Some(GType) */
  ): GType /* Some(GType) */ = g_type_next_base(leaf_type, root_type)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Return the direct parent type of the passed in type. If the passed in type
    * has no parent, i.e. is a fundamental type, 0 is returned.
    */
  def typeParent(`type`: GType /* Some(GType) */ ): GType /* Some(GType) */ =
    g_type_parent(`type`)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get the corresponding quark of the type IDs name.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def typeQname() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Queries the type system for information about a specific type.
    *
    * This function will fill in a user-provided structure to hold type-specific
    * information. If an invalid #GType is passed in, the
    * @type
    *   member of the #GTypeQuery is 0. All members filled into the #GTypeQuery
    *   structure should be considered constant and have to be left untouched.
    *
    * Since GLib 2.78, this function allows queries on dynamic types. Previously
    * it only supported static types.
    */
  @annotation.compileTimeOnly(
    "Function type_query contains an OUT parameter, which is not supported yet"
  )
  def typeQuery() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Registers @type_name as the name of a new dynamic type derived from
    * @parent_type.
    *   The type system uses the information contained in the #GTypePlugin
    *   structure pointed to by @plugin to manage the type and its instances (if
    *   not abstract). The value of @flags determines the nature (e.g. abstract
    *   or not) of the type.
    */
  def typeRegisterDynamic(
      parent_type: GType /* Some(GType) */,
      type_name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      plugin: TypePlugin /* Some(Ptr[GTypePlugin]) */,
      flags: TypeFlags /* Some(GTypeFlags) */
  )(using Zone): GType /* Some(GType) */ = g_type_register_dynamic(
    parent_type,
    __sn_extract_string(type_name).asInstanceOf[Ptr[gchar]],
    plugin.getUnsafeRawPointer().asInstanceOf,
    flags.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Registers @type_id as the predefined identifier and @type_name as the name
    * of a fundamental type. If @type_id is already registered, or a type named @type_name
    * is already registered, the behaviour is undefined. The type system uses
    * the information contained in the #GTypeInfo structure pointed to by @info
    * and the #GTypeFundamentalInfo structure pointed to by
    * @finfo
    *   to manage the type and its instances. The value of @flags determines
    *   additional characteristics of the fundamental type.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeInfo), @type -> DataRecord(const GTypeInfo*)))"
  )
  def typeRegisterFundamental() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Registers @type_name as the name of a new static type derived from
    * @parent_type.
    *   The type system uses the information contained in the #GTypeInfo
    *   structure pointed to by @info to manage the type and its instances (if
    *   not abstract). The value of @flags determines the nature (e.g. abstract
    *   or not) of the type.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeInfo), @type -> DataRecord(const GTypeInfo*)))"
  )
  def typeRegisterStatic() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Registers @type_name as the name of a new static type derived from
    * @parent_type.
    *   The value of @flags determines the nature (e.g. abstract or not) of the
    *   type. It works by filling a #GTypeInfo struct and calling
    *   g_type_register_static().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(ClassInitFunc), @type -> DataRecord(GClassInitFunc)))"
  )
  def typeRegisterStaticSimple() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a previously installed #GTypeClassCacheFunc. The cache maintained
    * by @cache_func has to be empty when calling
    * g_type_remove_class_cache_func() to avoid leaks.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeClassCacheFunc), @type -> DataRecord(GTypeClassCacheFunc)))"
  )
  def typeRemoveClassCacheFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes an interface check function added with
    * g_type_add_interface_check().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeInterfaceCheckFunc), @type -> DataRecord(GTypeInterfaceCheckFunc)))"
  )
  def typeRemoveInterfaceCheck() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attaches arbitrary data to a type.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def typeSetQdata() = ???

  def typeTestFlags(
      `type`: GType /* Some(GType) */,
      flags: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_type_test_flags(`type`, guint(flags)).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the location of the #GTypeValueTable associated with @type.
    *
    * Note that this function should only be used from source code that
    * implements or has internal knowledge of the implementation of
    * @type.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeValueTable), @type -> DataRecord(GTypeValueTable*)))"
  )
  def typeValueTablePeek() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Registers a value transformation function for use in g_value_transform().
    * A previously registered transformation function for @src_type and @dest_type
    * will be replaced.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(ValueTransform), @type -> DataRecord(GValueTransform)))"
  )
  def valueRegisterTransformFunc() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether a #GValue of type @src_type can be copied into a #GValue
    * of type @dest_type.
    */
  def valueTypeCompatible(
      src_type: GType /* Some(GType) */,
      dest_type: GType /* Some(GType) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_value_type_compatible(src_type, dest_type).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Check whether g_value_transform() is able to transform values of type @src_type
    * into values of type @dest_type. Note that for the types to be
    * transformable, they must be compatible or a transformation function must
    * be registered.
    */
  def valueTypeTransformable(
      src_type: GType /* Some(GType) */,
      dest_type: GType /* Some(GType) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_value_type_transformable(src_type, dest_type).value.!=(0)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end GObject
