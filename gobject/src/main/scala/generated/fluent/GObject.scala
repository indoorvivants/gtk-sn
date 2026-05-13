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
import sn.gnome.gobject.runtime.*

object GObject:
  /** Provide a copy of a boxed structure @src_boxed which is of type @boxed_type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def boxedCopy(
      boxed_type: GType /* Some(GType) */,
      src_boxed: Ptr[
        Byte
      ] /* Some(_root_.sn.gnome.glib.internal.gconstpointer) */
  ): Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */ =
    g_boxed_copy(boxed_type, gconstpointer(src_boxed)).value

  /** Free the boxed structure @boxed which is of type @boxed_type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def boxedFree(
      boxed_type: GType /* Some(GType) */,
      boxed: Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
  ): Unit /* Some(Unit) */ = g_boxed_free(boxed_type, gpointer(boxed))

  /** This function creates a new %G_TYPE_BOXED derived type id for a new boxed
    * type with name @name.
    *
    * Boxed type handling functions have to be provided to copy and free opaque
    * boxed structures of this type.
    *
    * For the general case, it is recommended to use G_DEFINE_BOXED_TYPE()
    * instead of calling g_boxed_type_register_static() directly. The macro will
    * create the appropriate `*_get_type()` function for the boxed type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[boxed_type_register_static:/<function parameters>/boxed_copy]: Cannot render type Type(List(),ListMap(@name -> DataRecord(BoxedCopyFunc), @type -> DataRecord(GBoxedCopyFunc)))"
  )
  private def boxedTypeRegisterStatic() = ???

  /** A #GClosureMarshal function for use with signals with handlers that take
    * two boxed pointers as arguments and return a boolean. If you have such a
    * signal, you will probably also need to use an accumulator, such as
    * g_signal_accumulator_true_handled().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_marshal_BOOLEAN__BOXED_BOXED:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def cclosureMarshalBOOLEANBOXEDBOXED() = ???

  /** A marshaller for a #GCClosure with a callback of type
    * `gboolean (*callback) (gpointer instance, gint arg1, gpointer user_data)`
    * where the #gint parameter denotes a flags type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_marshal_BOOLEAN__FLAGS:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def cclosureMarshalBOOLEANFLAGS() = ???

  /** A marshaller for a #GCClosure with a callback of type
    * `gchar* (*callback) (gpointer instance, GObject *arg1, gpointer arg2, gpointer user_data)`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_marshal_STRING__OBJECT_POINTER:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def cclosureMarshalSTRINGOBJECTPOINTER() = ???

  /** A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, gboolean arg1, gpointer user_data)`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_marshal_VOID__BOOLEAN:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def cclosureMarshalVOIDBOOLEAN() = ???

  /** A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, GBoxed *arg1, gpointer user_data)`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_marshal_VOID__BOXED:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def cclosureMarshalVOIDBOXED() = ???

  /** A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, gchar arg1, gpointer user_data)`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_marshal_VOID__CHAR:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def cclosureMarshalVOIDCHAR() = ???

  /** A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, gdouble arg1, gpointer user_data)`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_marshal_VOID__DOUBLE:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def cclosureMarshalVOIDDOUBLE() = ???

  /** A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, gint arg1, gpointer user_data)`
    * where the #gint parameter denotes an enumeration type..
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_marshal_VOID__ENUM:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def cclosureMarshalVOIDENUM() = ???

  /** A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, gint arg1, gpointer user_data)`
    * where the #gint parameter denotes a flags type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_marshal_VOID__FLAGS:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def cclosureMarshalVOIDFLAGS() = ???

  /** A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, gfloat arg1, gpointer user_data)`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_marshal_VOID__FLOAT:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def cclosureMarshalVOIDFLOAT() = ???

  /** A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, gint arg1, gpointer user_data)`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_marshal_VOID__INT:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def cclosureMarshalVOIDINT() = ???

  /** A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, glong arg1, gpointer user_data)`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_marshal_VOID__LONG:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def cclosureMarshalVOIDLONG() = ???

  /** A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, GObject *arg1, gpointer user_data)`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_marshal_VOID__OBJECT:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def cclosureMarshalVOIDOBJECT() = ???

  /** A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, GParamSpec *arg1, gpointer user_data)`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_marshal_VOID__PARAM:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def cclosureMarshalVOIDPARAM() = ???

  /** A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, gpointer arg1, gpointer user_data)`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_marshal_VOID__POINTER:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def cclosureMarshalVOIDPOINTER() = ???

  /** A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, const gchar *arg1, gpointer user_data)`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_marshal_VOID__STRING:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def cclosureMarshalVOIDSTRING() = ???

  /** A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, guchar arg1, gpointer user_data)`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_marshal_VOID__UCHAR:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def cclosureMarshalVOIDUCHAR() = ???

  /** A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, guint arg1, gpointer user_data)`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_marshal_VOID__UINT:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def cclosureMarshalVOIDUINT() = ???

  /** A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, guint arg1, gpointer arg2, gpointer user_data)`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_marshal_VOID__UINT_POINTER:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def cclosureMarshalVOIDUINTPOINTER() = ???

  /** A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, gulong arg1, gpointer user_data)`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_marshal_VOID__ULONG:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def cclosureMarshalVOIDULONG() = ???

  /** A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, GVariant *arg1, gpointer user_data)`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_marshal_VOID__VARIANT:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def cclosureMarshalVOIDVARIANT() = ???

  /** A marshaller for a #GCClosure with a callback of type
    * `void (*callback) (gpointer instance, gpointer user_data)`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_marshal_VOID__VOID:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def cclosureMarshalVOIDVOID() = ???

  /** A generic marshaller function implemented via
    * [libffi](http://sourceware.org/libffi/).
    *
    * Normally this function is not passed explicitly to g_signal_new(), but
    * used automatically by GLib when specifying a %NULL marshaller.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_marshal_generic:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def cclosureMarshalGeneric() = ???

  /** Creates a new closure which invokes @callback_func with @user_data as the
    * last parameter.
    *
    * @destroy_data
    *   will be called as a finalize notifier on the #GClosure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_new:/<function parameters>/callback_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))"
  )
  private def cclosureNew() = ???

  /** A variant of g_cclosure_new() which uses @object as @user_data and calls
    * g_object_watch_closure() on @object and the created closure. This function
    * is useful when you have a callback closely associated with a #GObject, and
    * want the callback to no longer run after the object is is freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_new_object:/<function parameters>/callback_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))"
  )
  private def cclosureNewObject() = ???

  /** A variant of g_cclosure_new_swap() which uses @object as @user_data and
    * calls g_object_watch_closure() on @object and the created closure. This
    * function is useful when you have a callback closely associated with a
    * #GObject, and want the callback to no longer run after the object is is
    * freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_new_object_swap:/<function parameters>/callback_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))"
  )
  private def cclosureNewObjectSwap() = ???

  /** Creates a new closure which invokes @callback_func with @user_data as the
    * first parameter.
    *
    * @destroy_data
    *   will be called as a finalize notifier on the #GClosure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cclosure_new_swap:/<function parameters>/callback_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))"
  )
  private def cclosureNewSwap() = ???

  /** Clears a reference to a #GObject.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clearObject(
      object_ptr: sn.gnome.gobject.fluent.Object /* Some(Ptr[Ptr[GObject]]) */
  )(using Runtime): Unit /* Some(Unit) */ = g_clear_object(
    object_ptr.getUnsafeRawPointer().asInstanceOf
  )

  /** Disconnects a handler from @instance so it will not be called during any
    * future or currently ongoing emissions of the signal it has been connected
    * to. The @handler_id_ptr is then set to zero, which is never a valid
    * handler ID value (see g_signal_connect()).
    *
    * If the handler ID is 0 then this function does nothing.
    *
    * There is also a macro version of this function so that the code will be
    * inlined.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[clear_signal_handler:/<function parameters>/handler_id_ptr]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gulong), @type -> DataRecord(gulong*)))"
  )
  private def clearSignalHandler() = ???

  /**  This function is meant to be called from the `complete_type_info`
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
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[enum_complete_type_info:]: Function enum_complete_type_info contains an OUT parameter, which is not supported yet"
  )
  private def enumCompleteTypeInfo() = ???

  /** Returns the #GEnumValue for a value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[enum_get_value:/<function parameters>/enum_class]: Cannot render type Type(List(),ListMap(@name -> DataRecord(EnumClass), @type -> DataRecord(GEnumClass*)))"
  )
  private def enumGetValue() = ???

  /** Looks up a #GEnumValue by name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[enum_get_value_by_name:/<function parameters>/enum_class]: Cannot render type Type(List(),ListMap(@name -> DataRecord(EnumClass), @type -> DataRecord(GEnumClass*)))"
  )
  private def enumGetValueByName() = ???

  /** Looks up a #GEnumValue by nickname.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[enum_get_value_by_nick:/<function parameters>/enum_class]: Cannot render type Type(List(),ListMap(@name -> DataRecord(EnumClass), @type -> DataRecord(GEnumClass*)))"
  )
  private def enumGetValueByNick() = ???

  /** Registers a new static enumeration type with the name @name.
    *
    * It is normally more convenient to let [glib-mkenums][glib-mkenums],
    * generate a my_enum_get_type() function from a usual C enumeration
    * definition than to write one yourself using g_enum_register_static().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[enum_register_static:/<function parameters>/const_static_values]: Cannot render type Type(List(),ListMap(@name -> DataRecord(EnumValue), @type -> DataRecord(const GEnumValue*)))"
  )
  private def enumRegisterStatic() = ???

  /** Pretty-prints @value in the form of the enum’s name.
    *
    * This is intended to be used for debugging purposes. The format of the
    * output may change in the future.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def enumToString(
      g_enum_type: GType /* Some(GType) */,
      value: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  )(using Zone): String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */ =
    fromCString(g_enum_to_string(g_enum_type, gint(value)).asInstanceOf)

  /** This function is meant to be called from the complete_type_info() function
    * of a #GTypePlugin implementation, see the example for
    * g_enum_complete_type_info() above.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[flags_complete_type_info:]: Function flags_complete_type_info contains an OUT parameter, which is not supported yet"
  )
  private def flagsCompleteTypeInfo() = ???

  /** Returns the first #GFlagsValue which is set in @value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[flags_get_first_value:/<function parameters>/flags_class]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FlagsClass), @type -> DataRecord(GFlagsClass*)))"
  )
  private def flagsGetFirstValue() = ???

  /** Looks up a #GFlagsValue by name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[flags_get_value_by_name:/<function parameters>/flags_class]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FlagsClass), @type -> DataRecord(GFlagsClass*)))"
  )
  private def flagsGetValueByName() = ???

  /** Looks up a #GFlagsValue by nickname.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[flags_get_value_by_nick:/<function parameters>/flags_class]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FlagsClass), @type -> DataRecord(GFlagsClass*)))"
  )
  private def flagsGetValueByNick() = ???

  /** Registers a new static flags type with the name @name.
    *
    * It is normally more convenient to let [glib-mkenums][glib-mkenums]
    * generate a my_flags_get_type() function from a usual C enumeration
    * definition than to write one yourself using g_flags_register_static().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[flags_register_static:/<function parameters>/const_static_values]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FlagsValue), @type -> DataRecord(const GFlagsValue*)))"
  )
  private def flagsRegisterStatic() = ???

  /** Pretty-prints @value in the form of the flag names separated by ` | ` and
    * sorted. Any extra bits will be shown at the end as a hexadecimal number.
    *
    * This is intended to be used for debugging purposes. The format of the
    * output may change in the future.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flagsToString(
      flags_type: GType /* Some(GType) */,
      value: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Zone): String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */ =
    fromCString(g_flags_to_string(flags_type, guint(value)).asInstanceOf)

  def gtypeGetType(): GType /* Some(GType) */ = g_gtype_get_type()

  /** Creates a new #GParamSpecBoolean instance specifying a %G_TYPE_BOOLEAN
    * property. In many cases, it may be more appropriate to use an enum with
    * g_param_spec_enum(), both to improve code clarity by using explicitly
    * named values, and to allow for more values to be added in future without
    * breaking API.
    *
    * See g_param_spec_internal() for details on property names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paramSpecBoolean(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      default_value: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using
      Zone,
      Runtime
  ): sn.gnome.gobject.fluent.ParamSpec /* Some(Ptr[GParamSpec]) */ =
    sn.gnome.gobject.fluent.ParamSpec.applyUnsafe(
      g_param_spec_boolean(
        toCString(name).asInstanceOf[Ptr[gchar]],
        nick
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        blurb
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        gboolean(gint((if default_value == true then 1 else 0))),
        flags.raw
      ).asInstanceOf
    )

  /** Creates a new #GParamSpecBoxed instance specifying a %G_TYPE_BOXED derived
    * property.
    *
    * See g_param_spec_internal() for details on property names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paramSpecBoxed(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      boxed_type: GType /* Some(GType) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using
      Zone,
      Runtime
  ): sn.gnome.gobject.fluent.ParamSpec /* Some(Ptr[GParamSpec]) */ =
    sn.gnome.gobject.fluent.ParamSpec.applyUnsafe(
      g_param_spec_boxed(
        toCString(name).asInstanceOf[Ptr[gchar]],
        nick
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        blurb
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        boxed_type,
        flags.raw
      ).asInstanceOf
    )

  /** Creates a new #GParamSpecChar instance specifying a %G_TYPE_CHAR property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[param_spec_char:/<function parameters>/minimum]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gint8), @type -> DataRecord(gint8)))"
  )
  private def paramSpecChar() = ???

  /** Creates a new #GParamSpecDouble instance specifying a %G_TYPE_DOUBLE
    * property.
    *
    * See g_param_spec_internal() for details on property names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paramSpecDouble(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      minimum: Double /* Some(_root_.sn.gnome.glib.internal.gdouble) */,
      maximum: Double /* Some(_root_.sn.gnome.glib.internal.gdouble) */,
      default_value: Double /* Some(_root_.sn.gnome.glib.internal.gdouble) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using
      Zone,
      Runtime
  ): sn.gnome.gobject.fluent.ParamSpec /* Some(Ptr[GParamSpec]) */ =
    sn.gnome.gobject.fluent.ParamSpec.applyUnsafe(
      g_param_spec_double(
        toCString(name).asInstanceOf[Ptr[gchar]],
        nick
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        blurb
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        gdouble(minimum),
        gdouble(maximum),
        gdouble(default_value),
        flags.raw
      ).asInstanceOf
    )

  /** Creates a new #GParamSpecEnum instance specifying a %G_TYPE_ENUM property.
    *
    * See g_param_spec_internal() for details on property names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paramSpecEnum(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      enum_type: GType /* Some(GType) */,
      default_value: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using
      Zone,
      Runtime
  ): sn.gnome.gobject.fluent.ParamSpec /* Some(Ptr[GParamSpec]) */ =
    sn.gnome.gobject.fluent.ParamSpec.applyUnsafe(
      g_param_spec_enum(
        toCString(name).asInstanceOf[Ptr[gchar]],
        nick
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        blurb
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        enum_type,
        gint(default_value),
        flags.raw
      ).asInstanceOf
    )

  /** Creates a new #GParamSpecFlags instance specifying a %G_TYPE_FLAGS
    * property.
    *
    * See g_param_spec_internal() for details on property names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paramSpecFlags(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      flags_type: GType /* Some(GType) */,
      default_value: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using
      Zone,
      Runtime
  ): sn.gnome.gobject.fluent.ParamSpec /* Some(Ptr[GParamSpec]) */ =
    sn.gnome.gobject.fluent.ParamSpec.applyUnsafe(
      g_param_spec_flags(
        toCString(name).asInstanceOf[Ptr[gchar]],
        nick
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        blurb
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        flags_type,
        guint(default_value),
        flags.raw
      ).asInstanceOf
    )

  /** Creates a new #GParamSpecFloat instance specifying a %G_TYPE_FLOAT
    * property.
    *
    * See g_param_spec_internal() for details on property names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paramSpecFloat(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      minimum: Float /* Some(_root_.sn.gnome.glib.internal.gfloat) */,
      maximum: Float /* Some(_root_.sn.gnome.glib.internal.gfloat) */,
      default_value: Float /* Some(_root_.sn.gnome.glib.internal.gfloat) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using
      Zone,
      Runtime
  ): sn.gnome.gobject.fluent.ParamSpec /* Some(Ptr[GParamSpec]) */ =
    sn.gnome.gobject.fluent.ParamSpec.applyUnsafe(
      g_param_spec_float(
        toCString(name).asInstanceOf[Ptr[gchar]],
        nick
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        blurb
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        gfloat(minimum),
        gfloat(maximum),
        gfloat(default_value),
        flags.raw
      ).asInstanceOf
    )

  /** Creates a new #GParamSpecGType instance specifying a %G_TYPE_GTYPE
    * property.
    *
    * See g_param_spec_internal() for details on property names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paramSpecGtype(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      is_a_type: GType /* Some(GType) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using
      Zone,
      Runtime
  ): sn.gnome.gobject.fluent.ParamSpec /* Some(Ptr[GParamSpec]) */ =
    sn.gnome.gobject.fluent.ParamSpec.applyUnsafe(
      g_param_spec_gtype(
        toCString(name).asInstanceOf[Ptr[gchar]],
        nick
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        blurb
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        is_a_type,
        flags.raw
      ).asInstanceOf
    )

  /** Creates a new #GParamSpecInt instance specifying a %G_TYPE_INT property.
    *
    * See g_param_spec_internal() for details on property names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paramSpecInt(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      minimum: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      maximum: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      default_value: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using
      Zone,
      Runtime
  ): sn.gnome.gobject.fluent.ParamSpec /* Some(Ptr[GParamSpec]) */ =
    sn.gnome.gobject.fluent.ParamSpec.applyUnsafe(
      g_param_spec_int(
        toCString(name).asInstanceOf[Ptr[gchar]],
        nick
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        blurb
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        gint(minimum),
        gint(maximum),
        gint(default_value),
        flags.raw
      ).asInstanceOf
    )

  /** Creates a new #GParamSpecInt64 instance specifying a %G_TYPE_INT64
    * property.
    *
    * See g_param_spec_internal() for details on property names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paramSpecInt64(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      minimum: CLongInt /* Some(_root_.sn.gnome.glib.internal.gint64) */,
      maximum: CLongInt /* Some(_root_.sn.gnome.glib.internal.gint64) */,
      default_value: CLongInt /* Some(_root_.sn.gnome.glib.internal.gint64) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using
      Zone,
      Runtime
  ): sn.gnome.gobject.fluent.ParamSpec /* Some(Ptr[GParamSpec]) */ =
    sn.gnome.gobject.fluent.ParamSpec.applyUnsafe(
      g_param_spec_int64(
        toCString(name).asInstanceOf[Ptr[gchar]],
        nick
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        blurb
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        gint64(minimum),
        gint64(maximum),
        gint64(default_value),
        flags.raw
      ).asInstanceOf
    )

  /** Creates a new #GParamSpecLong instance specifying a %G_TYPE_LONG property.
    *
    * See g_param_spec_internal() for details on property names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[param_spec_long:/<function parameters>/minimum]: Cannot render type Type(List(),ListMap(@name -> DataRecord(glong), @type -> DataRecord(glong)))"
  )
  private def paramSpecLong() = ???

  /** Creates a new #GParamSpecBoxed instance specifying a %G_TYPE_OBJECT
    * derived property.
    *
    * See g_param_spec_internal() for details on property names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paramSpecObject(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      object_type: GType /* Some(GType) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using
      Zone,
      Runtime
  ): sn.gnome.gobject.fluent.ParamSpec /* Some(Ptr[GParamSpec]) */ =
    sn.gnome.gobject.fluent.ParamSpec.applyUnsafe(
      g_param_spec_object(
        toCString(name).asInstanceOf[Ptr[gchar]],
        nick
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        blurb
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        object_type,
        flags.raw
      ).asInstanceOf
    )

  /** Creates a new property of type #GParamSpecOverride. This is used to direct
    * operations to another paramspec, and will not be directly useful unless
    * you are implementing a new base type similar to GObject.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paramSpecOverride(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      overridden: sn.gnome.gobject.fluent.ParamSpec /* Some(Ptr[GParamSpec]) */
  )(using
      Zone,
      Runtime
  ): sn.gnome.gobject.fluent.ParamSpec /* Some(Ptr[GParamSpec]) */ =
    sn.gnome.gobject.fluent.ParamSpec.applyUnsafe(
      g_param_spec_override(
        toCString(name).asInstanceOf[Ptr[gchar]],
        overridden.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

  /** Creates a new #GParamSpecParam instance specifying a %G_TYPE_PARAM
    * property.
    *
    * See g_param_spec_internal() for details on property names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paramSpecParam(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      param_type: GType /* Some(GType) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using
      Zone,
      Runtime
  ): sn.gnome.gobject.fluent.ParamSpec /* Some(Ptr[GParamSpec]) */ =
    sn.gnome.gobject.fluent.ParamSpec.applyUnsafe(
      g_param_spec_param(
        toCString(name).asInstanceOf[Ptr[gchar]],
        nick
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        blurb
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        param_type,
        flags.raw
      ).asInstanceOf
    )

  /** Creates a new #GParamSpecPointer instance specifying a pointer property.
    * Where possible, it is better to use g_param_spec_object() or
    * g_param_spec_boxed() to expose memory management information.
    *
    * See g_param_spec_internal() for details on property names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paramSpecPointer(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      flags: ParamFlags /* Some(GParamFlags) */
  )(using
      Zone,
      Runtime
  ): sn.gnome.gobject.fluent.ParamSpec /* Some(Ptr[GParamSpec]) */ =
    sn.gnome.gobject.fluent.ParamSpec.applyUnsafe(
      g_param_spec_pointer(
        toCString(name).asInstanceOf[Ptr[gchar]],
        nick
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        blurb
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        flags.raw
      ).asInstanceOf
    )

  /** Creates a new #GParamSpecString instance.
    *
    * See g_param_spec_internal() for details on property names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paramSpecString(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      default_value: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      flags: ParamFlags /* Some(GParamFlags) */
  )(using
      Zone,
      Runtime
  ): sn.gnome.gobject.fluent.ParamSpec /* Some(Ptr[GParamSpec]) */ =
    sn.gnome.gobject.fluent.ParamSpec.applyUnsafe(
      g_param_spec_string(
        toCString(name).asInstanceOf[Ptr[gchar]],
        nick
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        blurb
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        default_value
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        flags.raw
      ).asInstanceOf
    )

  /** Creates a new #GParamSpecUChar instance specifying a %G_TYPE_UCHAR
    * property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paramSpecUchar(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      minimum: UByte /* Some(_root_.sn.gnome.glib.internal.guint8) */,
      maximum: UByte /* Some(_root_.sn.gnome.glib.internal.guint8) */,
      default_value: UByte /* Some(_root_.sn.gnome.glib.internal.guint8) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using
      Zone,
      Runtime
  ): sn.gnome.gobject.fluent.ParamSpec /* Some(Ptr[GParamSpec]) */ =
    sn.gnome.gobject.fluent.ParamSpec.applyUnsafe(
      g_param_spec_uchar(
        toCString(name).asInstanceOf[Ptr[gchar]],
        nick
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        blurb
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        guint8(minimum),
        guint8(maximum),
        guint8(default_value),
        flags.raw
      ).asInstanceOf
    )

  /** Creates a new #GParamSpecUInt instance specifying a %G_TYPE_UINT property.
    *
    * See g_param_spec_internal() for details on property names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paramSpecUint(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      minimum: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      maximum: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      default_value: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using
      Zone,
      Runtime
  ): sn.gnome.gobject.fluent.ParamSpec /* Some(Ptr[GParamSpec]) */ =
    sn.gnome.gobject.fluent.ParamSpec.applyUnsafe(
      g_param_spec_uint(
        toCString(name).asInstanceOf[Ptr[gchar]],
        nick
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        blurb
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        guint(minimum),
        guint(maximum),
        guint(default_value),
        flags.raw
      ).asInstanceOf
    )

  /** Creates a new #GParamSpecUInt64 instance specifying a %G_TYPE_UINT64
    * property.
    *
    * See g_param_spec_internal() for details on property names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paramSpecUint64(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      minimum: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.guint64) */,
      maximum: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.guint64) */,
      default_value: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.guint64) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using
      Zone,
      Runtime
  ): sn.gnome.gobject.fluent.ParamSpec /* Some(Ptr[GParamSpec]) */ =
    sn.gnome.gobject.fluent.ParamSpec.applyUnsafe(
      g_param_spec_uint64(
        toCString(name).asInstanceOf[Ptr[gchar]],
        nick
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        blurb
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        guint64(minimum),
        guint64(maximum),
        guint64(default_value),
        flags.raw
      ).asInstanceOf
    )

  /** Creates a new #GParamSpecULong instance specifying a %G_TYPE_ULONG
    * property.
    *
    * See g_param_spec_internal() for details on property names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paramSpecUlong(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      minimum: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gulong) */,
      maximum: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gulong) */,
      default_value: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gulong) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using
      Zone,
      Runtime
  ): sn.gnome.gobject.fluent.ParamSpec /* Some(Ptr[GParamSpec]) */ =
    sn.gnome.gobject.fluent.ParamSpec.applyUnsafe(
      g_param_spec_ulong(
        toCString(name).asInstanceOf[Ptr[gchar]],
        nick
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        blurb
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        gulong(minimum),
        gulong(maximum),
        gulong(default_value),
        flags.raw
      ).asInstanceOf
    )

  /** Creates a new #GParamSpecUnichar instance specifying a %G_TYPE_UINT
    * property. #GValue structures for this property can be accessed with
    * g_value_set_uint() and g_value_get_uint().
    *
    * See g_param_spec_internal() for details on property names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paramSpecUnichar(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      default_value: CUnsignedInt /* Some(_root_.sn.gnome.glib.internal.gunichar) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using
      Zone,
      Runtime
  ): sn.gnome.gobject.fluent.ParamSpec /* Some(Ptr[GParamSpec]) */ =
    sn.gnome.gobject.fluent.ParamSpec.applyUnsafe(
      g_param_spec_unichar(
        toCString(name).asInstanceOf[Ptr[gchar]],
        nick
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        blurb
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        gunichar(guint32(default_value)),
        flags.raw
      ).asInstanceOf
    )

  /** Creates a new #GParamSpecValueArray instance specifying a
    * %G_TYPE_VALUE_ARRAY property. %G_TYPE_VALUE_ARRAY is a %G_TYPE_BOXED type,
    * as such, #GValue structures for this property can be accessed with
    * g_value_set_boxed() and g_value_get_boxed().
    *
    * See g_param_spec_internal() for details on property names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paramSpecValueArray(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      nick: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      blurb: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      element_spec: sn.gnome.gobject.fluent.ParamSpec /* Some(Ptr[GParamSpec]) */,
      flags: ParamFlags /* Some(GParamFlags) */
  )(using
      Zone,
      Runtime
  ): sn.gnome.gobject.fluent.ParamSpec /* Some(Ptr[GParamSpec]) */ =
    sn.gnome.gobject.fluent.ParamSpec.applyUnsafe(
      g_param_spec_value_array(
        toCString(name).asInstanceOf[Ptr[gchar]],
        nick
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        blurb
          .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
            toCString(o).asInstanceOf[Ptr[gchar]]
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
          ),
        element_spec.getUnsafeRawPointer().asInstanceOf,
        flags.raw
      ).asInstanceOf
    )

  /** Creates a new #GParamSpecVariant instance specifying a #GVariant property.
    *
    * If @default_value is floating, it is consumed.
    *
    * See g_param_spec_internal() for details on property names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[param_spec_variant:/<function parameters>/type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.VariantType), @type -> DataRecord(const GVariantType*)))"
  )
  private def paramSpecVariant() = ???

  /** Registers @name as the name of a new static type derived from
    * %G_TYPE_PARAM.
    *
    * The type system uses the information contained in the #GParamSpecTypeInfo
    * structure pointed to by @info to manage the #GParamSpec type and its
    * instances.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[param_type_register_static:/<function parameters>/pspec_info]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ParamSpecTypeInfo), @type -> DataRecord(const GParamSpecTypeInfo*)))"
  )
  private def paramTypeRegisterStatic() = ???

  /** Transforms @src_value into @dest_value if possible, and then validates @dest_value,
    * in order for it to conform to @pspec. If
    * @strict_validation
    *   is %TRUE this function will only succeed if the transformed @dest_value
    *   complied to @pspec without modifications.
    *
    * See also g_value_type_transformable(), g_value_transform() and
    * g_param_value_validate().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[param_value_convert:/<function parameters>/src_value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(const GValue*)))"
  )
  private def paramValueConvert() = ???

  /** Checks whether @value contains the default value as specified in @pspec.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[param_value_defaults:/<function parameters>/value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(const GValue*)))"
  )
  private def paramValueDefaults() = ???

  /** Return whether the contents of @value comply with the specifications set
    * out by @pspec.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[param_value_is_valid:/<function parameters>/value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(const GValue*)))"
  )
  private def paramValueIsValid() = ???

  /** Sets @value to its default value as specified in @pspec.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[param_value_set_default:/<function parameters>/value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(GValue*)))"
  )
  private def paramValueSetDefault() = ???

  /** Ensures that the contents of @value comply with the specifications set out
    * by @pspec. For example, a #GParamSpecInt might require that integers
    * stored in @value may not be smaller than -42 and not be greater than +42.
    * If @value contains an integer outside of this range, it is modified
    * accordingly, so the resulting value will fit into the range -42 .. +42.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[param_value_validate:/<function parameters>/value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(GValue*)))"
  )
  private def paramValueValidate() = ???

  /** Compares @value1 with @value2 according to @pspec, and return -1, 0 or +1,
    * if @value1 is found to be less than, equal to or greater than @value2,
    * respectively.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[param_values_cmp:/<function parameters>/value1]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(const GValue*)))"
  )
  private def paramValuesCmp() = ???

  /** Creates a new %G_TYPE_POINTER derived type id for a new pointer type with
    * name @name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pointerTypeRegisterStatic(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): GType /* Some(GType) */ = g_pointer_type_register_static(
    toCString(name).asInstanceOf[Ptr[gchar]]
  )

  /** A predefined #GSignalAccumulator for signals intended to be used as a hook
    * for application code to provide a particular value. Usually only one such
    * value is desired and multiple handlers for the same signal don't make much
    * sense (except for the case of the default handler defined in the class
    * structure, in which case you will usually want the signal connection to
    * override the class handler).
    *
    * This accumulator will use the return value from the first signal handler
    * that is run as the return value for the signal and not run any further
    * handlers (ie: the first handler "wins").
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_accumulator_first_wins:/<function parameters>/ihint]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SignalInvocationHint), @type -> DataRecord(GSignalInvocationHint*)))"
  )
  private def signalAccumulatorFirstWins() = ???

  /** A predefined #GSignalAccumulator for signals that return a boolean values.
    * The behavior that this accumulator gives is that a return of %TRUE stops
    * the signal emission: no further callbacks will be invoked, while a return
    * of %FALSE allows the emission to continue. The idea here is that a %TRUE
    * return indicates that the callback handled the signal, and no further
    * handling is needed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_accumulator_true_handled:/<function parameters>/ihint]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SignalInvocationHint), @type -> DataRecord(GSignalInvocationHint*)))"
  )
  private def signalAccumulatorTrueHandled() = ???

  /** Adds an emission hook for a signal, which will get called for any emission
    * of that signal, independent of the instance. This is possible only for
    * signals which don't have %G_SIGNAL_NO_HOOKS flag set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_add_emission_hook:/<function parameters>/detail]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def signalAddEmissionHook() = ???

  /** Calls the original class closure of a signal. This function should only be
    * called from an overridden class closure; see
    * g_signal_override_class_closure() and g_signal_override_class_handler().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_chain_from_overridden:/<function parameters>/instance_and_params]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(GValue)))),ListMap(@zero-terminated -> DataRecord(0), @type -> DataRecord(const GValue*)))"
  )
  private def signalChainFromOverridden() = ???

  /** Calls the original class closure of a signal. This function should only be
    * called from an overridden class closure; see
    * g_signal_override_class_closure() and g_signal_override_class_handler().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  inline def signalChainFromOverriddenHandler(
      instance: Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      args: Any*
  ): Unit /* Some(Unit) */ =
    g_signal_chain_from_overridden_handler(gpointer(instance), args*)

  /** Connects a closure to a signal for a particular object.
    *
    * If @closure is a floating reference (see g_closure_sink()), this function
    * takes ownership of @closure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_connect_closure:/<function parameters>/closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def signalConnectClosure() = ???

  /** Connects a closure to a signal for a particular object.
    *
    * If @closure is a floating reference (see g_closure_sink()), this function
    * takes ownership of @closure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_connect_closure_by_id:/<function parameters>/detail]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def signalConnectClosureById() = ???

  /** Connects a #GCallback function to a signal for a particular object.
    * Similar to g_signal_connect(), but allows to provide a #GClosureNotify for
    * the data which will be called when the signal handler is disconnected and
    * no longer used. Specify @connect_flags if you need `..._after()` or
    * `..._swapped()` variants of this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_connect_data:/<function parameters>/c_handler]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))"
  )
  private def signalConnectData() = ???

  /** This is similar to g_signal_connect_data(), but uses a closure which
    * ensures that the @gobject stays alive during the call to @c_handler by
    * temporarily adding a reference count to @gobject.
    *
    * When the @gobject is destroyed the signal handler will be automatically
    * disconnected. Note that this is not currently threadsafe (ie: emitting a
    * signal while @gobject is being destroyed in another thread is not safe).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_connect_object:/<function parameters>/c_handler]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))"
  )
  private def signalConnectObject() = ???

  /** Emits a signal. Signal emission is done synchronously. The method will
    * only return control after all handlers are called or signal emission was
    * stopped.
    *
    * Note that g_signal_emit() resets the return value to the default if no
    * handlers are connected, in contrast to g_signal_emitv().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_emit:/<function parameters>/detail]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def signalEmit() = ???

  /** Emits a signal. Signal emission is done synchronously. The method will
    * only return control after all handlers are called or signal emission was
    * stopped.
    *
    * Note that g_signal_emit_by_name() resets the return value to the default
    * if no handlers are connected, in contrast to g_signal_emitv().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  inline def signalEmitByName(
      instance: sn.gnome.gobject.fluent.Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      detailed_signal: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      args: Any*
  )(using Zone, Runtime): Unit /* Some(Unit) */ = g_signal_emit_by_name(
    instance.getUnsafeRawPointer().asInstanceOf,
    toCString(detailed_signal).asInstanceOf[Ptr[gchar]],
    args*
  )

  /** Emits a signal. Signal emission is done synchronously. The method will
    * only return control after all handlers are called or signal emission was
    * stopped.
    *
    * Note that g_signal_emit_valist() resets the return value to the default if
    * no handlers are connected, in contrast to g_signal_emitv().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_emit_valist:/<function parameters>/detail]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def signalEmitValist() = ???

  /** Emits a signal. Signal emission is done synchronously. The method will
    * only return control after all handlers are called or signal emission was
    * stopped.
    *
    * Note that g_signal_emitv() doesn't change @return_value if no handlers are
    * connected, in contrast to g_signal_emit() and g_signal_emit_valist().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_emitv:]: Function signal_emitv contains an INOUT parameter, which is not supported yet"
  )
  private def signalEmitv() = ???

  /** Returns the invocation hint of the innermost signal emission of instance.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_get_invocation_hint:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SignalInvocationHint), @type -> DataRecord(GSignalInvocationHint*)))"
  )
  private def signalGetInvocationHint() = ???

  /** Blocks a handler of an instance so it will not be called during any signal
    * emissions unless it is unblocked again. Thus "blocking" a signal handler
    * means to temporarily deactivate it, a signal handler has to be unblocked
    * exactly the same amount of times it has been blocked before to become
    * active again.
    *
    * The @handler_id has to be a valid signal handler id, connected to a signal
    * of @instance.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def signalHandlerBlock(
      instance: sn.gnome.gobject.fluent.Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      handler_id: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gulong) */
  )(using Runtime): Unit /* Some(Unit) */ = g_signal_handler_block(
    instance.getUnsafeRawPointer().asInstanceOf,
    gulong(handler_id)
  )

  /** Disconnects a handler from an instance so it will not be called during any
    * future or currently ongoing emissions of the signal it has been connected
    * to. The @handler_id becomes invalid and may be reused.
    *
    * The @handler_id has to be a valid signal handler id, connected to a signal
    * of @instance.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def signalHandlerDisconnect(
      instance: sn.gnome.gobject.fluent.Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      handler_id: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gulong) */
  )(using Runtime): Unit /* Some(Unit) */ = g_signal_handler_disconnect(
    instance.getUnsafeRawPointer().asInstanceOf,
    gulong(handler_id)
  )

  /** Finds the first signal handler that matches certain selection criteria.
    * The criteria mask is passed as an OR-ed combination of #GSignalMatchType
    * flags, and the criteria values are passed as arguments. The match @mask
    * has to be non-0 for successful matches. If no handler was found, 0 is
    * returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_handler_find:/<function parameters>/detail]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def signalHandlerFind() = ???

  /** Returns whether @handler_id is the ID of a handler connected to @instance.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def signalHandlerIsConnected(
      instance: sn.gnome.gobject.fluent.Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      handler_id: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gulong) */
  )(using Runtime): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_signal_handler_is_connected(
      instance.getUnsafeRawPointer().asInstanceOf,
      gulong(handler_id)
    ).value.!=(0)

  /** Undoes the effect of a previous g_signal_handler_block() call. A blocked
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def signalHandlerUnblock(
      instance: sn.gnome.gobject.fluent.Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      handler_id: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gulong) */
  )(using Runtime): Unit /* Some(Unit) */ = g_signal_handler_unblock(
    instance.getUnsafeRawPointer().asInstanceOf,
    gulong(handler_id)
  )

  /** Blocks all handlers on an instance that match a certain selection
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_handlers_block_matched:/<function parameters>/detail]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def signalHandlersBlockMatched() = ???

  /** Destroy all signal handlers of a type instance. This function is an
    * implementation detail of the #GObject dispose implementation, and should
    * not be used outside of the type system.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def signalHandlersDestroy(
      instance: sn.gnome.gobject.fluent.Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */
  )(using Runtime): Unit /* Some(Unit) */ = g_signal_handlers_destroy(
    instance.getUnsafeRawPointer().asInstanceOf
  )

  /** Disconnects all handlers on an instance that match a certain selection
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_handlers_disconnect_matched:/<function parameters>/detail]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def signalHandlersDisconnectMatched() = ???

  /** Unblocks all handlers on an instance that match a certain selection
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_handlers_unblock_matched:/<function parameters>/detail]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def signalHandlersUnblockMatched() = ???

  /** Returns whether there are any handlers connected to @instance for the
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_has_handler_pending:/<function parameters>/detail]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def signalHasHandlerPending() = ???

  /** Validate a signal name. This can be useful for dynamically-generated
    * signals which need to be validated at run-time before actually trying to
    * create them.
    *
    * See [canonical parameter names][canonical-parameter-names] for details of
    * the rules for valid names. The rules for signal names are the same as
    * those for property names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def signalIsValidName(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_signal_is_valid_name(toCString(name).asInstanceOf[Ptr[gchar]]).value.!=(0)

  /** Lists the signals by id that a certain instance or interface type created.
    * Further information about the signals can be acquired through
    * g_signal_query().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_list_ids:]: Function signal_list_ids contains an OUT parameter, which is not supported yet"
  )
  private def signalListIds() = ???

  /** Given the name of the signal and the type of object it connects to, gets
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def signalLookup(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      itype: GType /* Some(GType) */
  )(using Zone): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ =
    g_signal_lookup(toCString(name).asInstanceOf[Ptr[gchar]], itype).value

  /** Given the signal's identifier, finds its name.
    *
    * Two different signals may have the same name, if they have differing
    * types.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def signalName(
      signal_id: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Zone): String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */ =
    fromCString(g_signal_name(guint(signal_id)).asInstanceOf)

  /** Creates a new signal. (This is usually done in the class initializer.)
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_new:/<function parameters>/accumulator]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SignalAccumulator), @type -> DataRecord(GSignalAccumulator)))"
  )
  private def signalNew() = ???

  /** Creates a new signal. (This is usually done in the class initializer.)
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_new_class_handler:/<function parameters>/class_handler]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))"
  )
  private def signalNewClassHandler() = ???

  /** Creates a new signal. (This is usually done in the class initializer.)
    *
    * See g_signal_new() for details on allowed signal names.
    *
    * If c_marshaller is %NULL, g_cclosure_marshal_generic() will be used as the
    * marshaller for this signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_new_valist:/<function parameters>/class_closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def signalNewValist() = ???

  /** Creates a new signal. (This is usually done in the class initializer.)
    *
    * See g_signal_new() for details on allowed signal names.
    *
    * If c_marshaller is %NULL, g_cclosure_marshal_generic() will be used as the
    * marshaller for this signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_newv:/<function parameters>/class_closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def signalNewv() = ???

  /** Overrides the class closure (i.e. the default handler) for the given
    * signal for emissions on instances of @instance_type. @instance_type must
    * be derived from the type to which the signal belongs.
    *
    * See g_signal_chain_from_overridden() and
    * g_signal_chain_from_overridden_handler() for how to chain up to the parent
    * class closure from inside the overridden one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_override_class_closure:/<function parameters>/class_closure]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def signalOverrideClassClosure() = ???

  /** Overrides the class closure (i.e. the default handler) for the given
    * signal for emissions on instances of @instance_type with callback @class_handler. @instance_type
    * must be derived from the type to which the signal belongs.
    *
    * See g_signal_chain_from_overridden() and
    * g_signal_chain_from_overridden_handler() for how to chain up to the parent
    * class closure from inside the overridden one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_override_class_handler:/<function parameters>/class_handler]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Callback), @type -> DataRecord(GCallback)))"
  )
  private def signalOverrideClassHandler() = ???

  /** Internal function to parse a signal name into its @signal_id and @detail
    * quark.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_parse_name:]: Function signal_parse_name contains an OUT parameter, which is not supported yet"
  )
  private def signalParseName() = ???

  /** Queries the signal system for in-depth information about a specific
    * signal. This function will fill in a user-provided structure to hold
    * signal-specific information. If an invalid signal id is passed in, the @signal_id
    * member of the #GSignalQuery is 0. All members filled into the
    * #GSignalQuery structure should be considered constant and have to be left
    * untouched.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_query:]: Function signal_query contains an OUT parameter, which is not supported yet"
  )
  private def signalQuery() = ???

  /** Deletes an emission hook.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def signalRemoveEmissionHook(
      signal_id: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      hook_id: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gulong) */
  ): Unit /* Some(Unit) */ =
    g_signal_remove_emission_hook(guint(signal_id), gulong(hook_id))

  /** Change the #GSignalCVaMarshaller used for a given signal. This is a
    * specialised form of the marshaller that can often be used for the common
    * case of a single connected signal handler and avoids the overhead of
    * #GValue. Its use is optional.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_set_va_marshaller:/<function parameters>/va_marshaller]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SignalCVaMarshaller), @type -> DataRecord(GSignalCVaMarshaller)))"
  )
  private def signalSetVaMarshaller() = ???

  /** Stops a signal's current emission.
    *
    * This will prevent the default method from running, if the signal was
    * %G_SIGNAL_RUN_LAST and you connected normally (i.e. without the "after"
    * flag).
    *
    * Prints a warning if used on a signal which isn't being emitted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_stop_emission:/<function parameters>/detail]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def signalStopEmission() = ???

  /** Stops a signal's current emission.
    *
    * This is just like g_signal_stop_emission() except it will look up the
    * signal id for you.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def signalStopEmissionByName(
      instance: sn.gnome.gobject.fluent.Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      detailed_signal: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone, Runtime): Unit /* Some(Unit) */ =
    g_signal_stop_emission_by_name(
      instance.getUnsafeRawPointer().asInstanceOf,
      toCString(detailed_signal).asInstanceOf[Ptr[gchar]]
    )

  /** Creates a new closure which invokes the function found at the offset
    * @struct_offset
    *   in the class structure of the interface or classed type identified by @itype.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal_type_cclosure_new:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def signalTypeCclosureNew() = ???

  /** Set the callback for a source as a #GClosure.
    *
    * If the source is not one of the standard GLib types, the @closure_callback
    * and @closure_marshal fields of the #GSourceFuncs structure must have been
    * filled in with pointers to appropriate functions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[source_set_closure:/<function parameters>/source]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Source), @type -> DataRecord(GSource*)))"
  )
  private def sourceSetClosure() = ???

  /** Sets a dummy callback for @source. The callback will do nothing, and if
    * the source expects a #gboolean return value, it will return %TRUE. (If the
    * source expects any other type of return value, it will return a 0/%NULL
    * value; whatever g_value_init() initializes a #GValue to for that type.)
    *
    * If the source is not one of the standard GLib types, the
    * @closure_callback
    *   and @closure_marshal fields of the #GSourceFuncs structure must have
    *   been filled in with pointers to appropriate functions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[source_set_dummy_callback:/<function parameters>/source]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Source), @type -> DataRecord(GSource*)))"
  )
  private def sourceSetDummyCallback() = ???

  /** Return a newly allocated string, which describes the contents of a
    * #GValue. The main purpose of this function is to describe #GValue contents
    * for debugging output, the way in which the contents are described may
    * change between different GLib versions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[strdup_value_contents:/<function parameters>/value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(const GValue*)))"
  )
  private def strdupValueContents() = ???

  /** Adds a #GTypeClassCacheFunc to be called before the reference count of a
    * class goes from one to zero. This can be used to prevent premature class
    * destruction. All installed #GTypeClassCacheFunc functions will be chained
    * until one of them returns %TRUE. The functions have to check the class id
    * passed in to figure whether they actually want to cache the class of this
    * type, since all classes are routed through the same #GTypeClassCacheFunc
    * chain.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[type_add_class_cache_func:/<function parameters>/cache_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeClassCacheFunc), @type -> DataRecord(GTypeClassCacheFunc)))"
  )
  private def typeAddClassCacheFunc() = ???

  /** Registers a private class structure for a classed type; when the class is
    * allocated, the private structures for the class and all of its parent
    * types are allocated sequentially in the same memory block as the public
    * structures, and are zero-filled.
    *
    * This function should be called in the type's get_type() function after the
    * type is registered. The private structure can be retrieved using the
    * G_TYPE_CLASS_GET_PRIVATE() macro.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

  /** Adds a function to be called after an interface vtable is initialized for
    * any class (i.e. after the @interface_init member of #GInterfaceInfo has
    * been called).
    *
    * This function is useful when you want to check an invariant that depends
    * on the interfaces of a class. For instance, the implementation of #GObject
    * uses this facility to check that an object implements all of the
    * properties that are defined on its interfaces.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[type_add_interface_check:/<function parameters>/check_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeInterfaceCheckFunc), @type -> DataRecord(GTypeInterfaceCheckFunc)))"
  )
  private def typeAddInterfaceCheck() = ???

  /** Adds @interface_type to the dynamic @instance_type. The information
    * contained in the #GTypePlugin structure pointed to by @plugin is used to
    * manage the relationship.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

  /** Adds @interface_type to the static @instance_type. The information
    * contained in the #GInterfaceInfo structure pointed to by @info is used to
    * manage the relationship.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[type_add_interface_static:/<function parameters>/info]: Cannot render type Type(List(),ListMap(@name -> DataRecord(InterfaceInfo), @type -> DataRecord(const GInterfaceInfo*)))"
  )
  private def typeAddInterfaceStatic() = ???

  @annotation.compileTimeOnly(
    "[type_check_class_cast:/<function parameters>/g_class]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeClass), @type -> DataRecord(GTypeClass*)))"
  )
  private def typeCheckClassCast() = ???

  @annotation.compileTimeOnly(
    "[type_check_class_is_a:/<function parameters>/g_class]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeClass), @type -> DataRecord(GTypeClass*)))"
  )
  private def typeCheckClassIsA() = ???

  /** Private helper function to aid implementation of the
    * G_TYPE_CHECK_INSTANCE() macro.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[type_check_instance:/<function parameters>/instance]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeInstance), @type -> DataRecord(GTypeInstance*)))"
  )
  private def typeCheckInstance() = ???

  @annotation.compileTimeOnly(
    "[type_check_instance_cast:/<function parameters>/instance]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeInstance), @type -> DataRecord(GTypeInstance*)))"
  )
  private def typeCheckInstanceCast() = ???

  @annotation.compileTimeOnly(
    "[type_check_instance_is_a:/<function parameters>/instance]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeInstance), @type -> DataRecord(GTypeInstance*)))"
  )
  private def typeCheckInstanceIsA() = ???

  @annotation.compileTimeOnly(
    "[type_check_instance_is_fundamentally_a:/<function parameters>/instance]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeInstance), @type -> DataRecord(GTypeInstance*)))"
  )
  private def typeCheckInstanceIsFundamentallyA() = ???

  def typeCheckIsValueType(
      `type`: GType /* Some(GType) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_type_check_is_value_type(`type`).value.!=(0)

  @annotation.compileTimeOnly(
    "[type_check_value:/<function parameters>/value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(const GValue*)))"
  )
  private def typeCheckValue() = ???

  @annotation.compileTimeOnly(
    "[type_check_value_holds:/<function parameters>/value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(const GValue*)))"
  )
  private def typeCheckValueHolds() = ???

  /** Return a newly allocated and 0-terminated array of type IDs, listing the
    * child types of @type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[type_children:]: Function type_children contains an OUT parameter, which is not supported yet"
  )
  private def typeChildren() = ???

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

  /** This function is essentially the same as g_type_class_ref(), except that
    * the classes reference count isn't incremented. As a consequence, this
    * function may return %NULL if the class of the type passed in does not
    * currently exist (hasn't been referenced before).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeClassPeek(
      `type`: GType /* Some(GType) */
  ): Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */ =
    g_type_class_peek(`type`).value

  /** A more efficient version of g_type_class_peek() which works only for
    * static types.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeClassPeekStatic(
      `type`: GType /* Some(GType) */
  ): Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */ =
    g_type_class_peek_static(`type`).value

  /** Increments the reference count of the class structure belonging to
    * @type.
    *   This function will demand-create the class if it doesn't exist already.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeClassRef(
      `type`: GType /* Some(GType) */
  ): Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */ =
    g_type_class_ref(`type`).value

  /** Creates and initializes an instance of @type if @type is valid and can be
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[type_create_instance:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeInstance), @type -> DataRecord(GTypeInstance*)))"
  )
  private def typeCreateInstance() = ???

  /** If the interface type @g_type is currently in use, returns its default
    * interface vtable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeDefaultInterfacePeek(
      g_type: GType /* Some(GType) */
  ): Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */ =
    g_type_default_interface_peek(g_type).value

  /** Increments the reference count for the interface type @g_type, and returns
    * the default interface vtable for the type.
    *
    * If the type is not currently in use, then the default vtable for the type
    * will be created and initialized by calling the base interface init and
    * default vtable init functions for the type (the @base_init and @class_init
    * members of #GTypeInfo). Calling g_type_default_interface_ref() is useful
    * when you want to make sure that signals and properties for an interface
    * have been installed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeDefaultInterfaceRef(
      g_type: GType /* Some(GType) */
  ): Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */ =
    g_type_default_interface_ref(g_type).value

  /** Decrements the reference count for the type corresponding to the interface
    * default vtable @g_iface. If the type is dynamic, then when no one is using
    * the interface and all references have been released, the finalize function
    * for the interface's default vtable (the @class_finalize member of
    * #GTypeInfo) will be called.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeDefaultInterfaceUnref(
      g_iface: Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
  ): Unit /* Some(Unit) */ = g_type_default_interface_unref(gpointer(g_iface))

  /** Returns the length of the ancestry of the passed in type. This includes
    * the type itself, so that e.g. a fundamental type has depth 1.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeDepth(
      `type`: GType /* Some(GType) */
  ): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ = g_type_depth(
    `type`
  ).value

  /** Ensures that the indicated @type has been registered with the type system,
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeEnsure(`type`: GType /* Some(GType) */ ): Unit /* Some(Unit) */ =
    g_type_ensure(`type`)

  /** Frees an instance of a type, returning it to the instance pool for the
    * type, if there is one.
    *
    * Like g_type_create_instance(), this function is reserved for implementors
    * of fundamental types.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[type_free_instance:/<function parameters>/instance]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeInstance), @type -> DataRecord(GTypeInstance*)))"
  )
  private def typeFreeInstance() = ???

  /** Look up the type ID from a given type name, returning 0 if no type has
    * been registered under this name (this is the preferred method to find out
    * by name whether a specific type has been registered yet).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeFromName(
      name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): GType /* Some(GType) */ = g_type_from_name(
    toCString(name).asInstanceOf[Ptr[gchar]]
  )

  /** Internal function, used to extract the fundamental type ID portion. Use
    * G_TYPE_FUNDAMENTAL() instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeFundamental(
      type_id: GType /* Some(GType) */
  ): GType /* Some(GType) */ = g_type_fundamental(type_id)

  /** Returns the next free fundamental type id which can be used to register a
    * new fundamental type with g_type_register_fundamental(). The returned type
    * ID represents the highest currently registered fundamental type
    * identifier.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeFundamentalNext(): GType /* Some(GType) */ = g_type_fundamental_next()

  /** Returns the number of instances allocated of the particular type; this is
    * only available if GLib is built with debugging support and the
    * `instance-count` debug flag is set (by setting the `GOBJECT_DEBUG`
    * variable to include `instance-count`).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeGetInstanceCount(
      `type`: GType /* Some(GType) */
  ): Int /* Some(CInt) */ = g_type_get_instance_count(`type`)

  /** Returns the #GTypePlugin structure for @type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeGetPlugin(
      `type`: GType /* Some(GType) */
  ): TypePlugin /* Some(Ptr[GTypePlugin]) */ =
    new TypePlugin.Abstract(g_type_get_plugin(`type`).asInstanceOf)

  /** Obtains data which has previously been attached to @type with
    * g_type_set_qdata().
    *
    * Note that this does not take subtyping into account; data attached to one
    * type with g_type_set_qdata() cannot be retrieved from a subtype using
    * g_type_get_qdata().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[type_get_qdata:/<function parameters>/quark]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def typeGetQdata() = ???

  /** Returns an opaque serial number that represents the state of the set of
    * registered types. Any time a type is registered this serial changes, which
    * means you can cache information based on type lookups (such as
    * g_type_from_name()) and know if the cache is still valid at a later time
    * by comparing the current serial with the one at the type lookup.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeGetTypeRegistrationSerial()
      : UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ =
    g_type_get_type_registration_serial().value

  /** This function used to initialise the type system. Since GLib 2.36, the
    * type system is initialised automatically and this function does nothing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeInit(): Unit /* Some(Unit) */ = g_type_init()

  /** This function used to initialise the type system with debugging flags.
    * Since GLib 2.36, the type system is initialised automatically and this
    * function does nothing.
    *
    * If you need to enable debugging features, use the `GOBJECT_DEBUG`
    * environment variable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeInitWithDebugFlags(
      debug_flags: TypeDebugFlags /* Some(GTypeDebugFlags) */
  ): Unit /* Some(Unit) */ = g_type_init_with_debug_flags(debug_flags.raw)

  /** Adds @prerequisite_type to the list of prerequisites of @interface_type.
    * This means that any type implementing @interface_type must also implement
    * @prerequisite_type.
    *   Prerequisites can be thought of as an alternative to interface
    *   derivation (which GType doesn't support). An interface can have at most
    *   one instantiatable prerequisite type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeInterfaceAddPrerequisite(
      interface_type: GType /* Some(GType) */,
      prerequisite_type: GType /* Some(GType) */
  ): Unit /* Some(Unit) */ =
    g_type_interface_add_prerequisite(interface_type, prerequisite_type)

  /** Returns the #GTypePlugin structure for the dynamic interface
    * @interface_type
    *   which has been added to @instance_type, or %NULL if @interface_type has
    *   not been added to @instance_type or does not have a #GTypePlugin
    *   structure. See g_type_add_interface_dynamic().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeInterfaceGetPlugin(
      instance_type: GType /* Some(GType) */,
      interface_type: GType /* Some(GType) */
  ): TypePlugin /* Some(Ptr[GTypePlugin]) */ = new TypePlugin.Abstract(
    g_type_interface_get_plugin(instance_type, interface_type).asInstanceOf
  )

  /** Returns the most specific instantiatable prerequisite of an interface
    * type. If the interface type has no instantiatable prerequisite,
    * %G_TYPE_INVALID is returned.
    *
    * See g_type_interface_add_prerequisite() for more information about
    * prerequisites.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeInterfaceInstantiatablePrerequisite(
      interface_type: GType /* Some(GType) */
  ): GType /* Some(GType) */ = g_type_interface_instantiatable_prerequisite(
    interface_type
  )

  /** Returns the #GTypeInterface structure of an interface to which the passed
    * in class conforms.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeInterfacePeek(
      instance_class: Ptr[
        Byte
      ] /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      iface_type: GType /* Some(GType) */
  ): Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */ =
    g_type_interface_peek(gpointer(instance_class), iface_type).value

  /** Returns the prerequisites of an interfaces type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[type_interface_prerequisites:]: Function type_interface_prerequisites contains an OUT parameter, which is not supported yet"
  )
  private def typeInterfacePrerequisites() = ???

  /** Return a newly allocated and 0-terminated array of type IDs, listing the
    * interface types that @type conforms to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[type_interfaces:]: Function type_interfaces contains an OUT parameter, which is not supported yet"
  )
  private def typeInterfaces() = ???

  /** If @is_a_type is a derivable type, check whether @type is a descendant of @is_a_type.
    * If @is_a_type is an interface, check whether @type conforms to it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeIsA(
      `type`: GType /* Some(GType) */,
      is_a_type: GType /* Some(GType) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_type_is_a(`type`, is_a_type).value.!=(0)

  /** Get the unique name that is assigned to a type ID. Note that this function
    * (like all other GType API) cannot cope with invalid type IDs.
    * %G_TYPE_INVALID may be passed to this function, as may be any other
    * validly registered type ID, but randomized type IDs should not be passed
    * in and will most likely lead to a crash.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeName(`type`: GType /* Some(GType) */ )(using
      Zone
  ): String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */ = fromCString(
    g_type_name(`type`).asInstanceOf
  )

  @annotation.compileTimeOnly(
    "[type_name_from_class:/<function parameters>/g_class]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeClass), @type -> DataRecord(GTypeClass*)))"
  )
  private def typeNameFromClass() = ???

  @annotation.compileTimeOnly(
    "[type_name_from_instance:/<function parameters>/instance]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeInstance), @type -> DataRecord(GTypeInstance*)))"
  )
  private def typeNameFromInstance() = ???

  /** Given a @leaf_type and a @root_type which is contained in its ancestry,
    * return the type that @root_type is the immediate parent of. In other
    * words, this function determines the type that is derived directly from @root_type
    * which is also a base class of
    * @leaf_type.
    *   Given a root type and a leaf type, this function can be used to
    *   determine the types and order in which the leaf type is descended from
    *   the root type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeNextBase(
      leaf_type: GType /* Some(GType) */,
      root_type: GType /* Some(GType) */
  ): GType /* Some(GType) */ = g_type_next_base(leaf_type, root_type)

  /** Return the direct parent type of the passed in type. If the passed in type
    * has no parent, i.e. is a fundamental type, 0 is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeParent(`type`: GType /* Some(GType) */ ): GType /* Some(GType) */ =
    g_type_parent(`type`)

  /** Get the corresponding quark of the type IDs name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[type_qname:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def typeQname() = ???

  /** Queries the type system for information about a specific type.
    *
    * This function will fill in a user-provided structure to hold type-specific
    * information. If an invalid #GType is passed in, the
    * @type
    *   member of the #GTypeQuery is 0. All members filled into the #GTypeQuery
    *   structure should be considered constant and have to be left untouched.
    *
    * Since GLib 2.78, this function allows queries on dynamic types. Previously
    * it only supported static types.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[type_query:]: Function type_query contains an OUT parameter, which is not supported yet"
  )
  private def typeQuery() = ???

  /** Registers @type_name as the name of a new dynamic type derived from
    * @parent_type.
    *   The type system uses the information contained in the #GTypePlugin
    *   structure pointed to by @plugin to manage the type and its instances (if
    *   not abstract). The value of @flags determines the nature (e.g. abstract
    *   or not) of the type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeRegisterDynamic(
      parent_type: GType /* Some(GType) */,
      type_name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      plugin: TypePlugin /* Some(Ptr[GTypePlugin]) */,
      flags: TypeFlags /* Some(GTypeFlags) */
  )(using Zone): GType /* Some(GType) */ = g_type_register_dynamic(
    parent_type,
    toCString(type_name).asInstanceOf[Ptr[gchar]],
    plugin.getUnsafeRawPointer().asInstanceOf,
    flags.raw
  )

  /** Registers @type_id as the predefined identifier and @type_name as the name
    * of a fundamental type. If @type_id is already registered, or a type named @type_name
    * is already registered, the behaviour is undefined. The type system uses
    * the information contained in the #GTypeInfo structure pointed to by @info
    * and the #GTypeFundamentalInfo structure pointed to by
    * @finfo
    *   to manage the type and its instances. The value of @flags determines
    *   additional characteristics of the fundamental type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[type_register_fundamental:/<function parameters>/info]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeInfo), @type -> DataRecord(const GTypeInfo*)))"
  )
  private def typeRegisterFundamental() = ???

  /** Registers @type_name as the name of a new static type derived from
    * @parent_type.
    *   The type system uses the information contained in the #GTypeInfo
    *   structure pointed to by @info to manage the type and its instances (if
    *   not abstract). The value of @flags determines the nature (e.g. abstract
    *   or not) of the type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[type_register_static:/<function parameters>/info]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeInfo), @type -> DataRecord(const GTypeInfo*)))"
  )
  private def typeRegisterStatic() = ???

  /** Registers @type_name as the name of a new static type derived from
    * @parent_type.
    *   The value of @flags determines the nature (e.g. abstract or not) of the
    *   type. It works by filling a #GTypeInfo struct and calling
    *   g_type_register_static().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[type_register_static_simple:/<function parameters>/class_init]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ClassInitFunc), @type -> DataRecord(GClassInitFunc)))"
  )
  private def typeRegisterStaticSimple() = ???

  /** Removes a previously installed #GTypeClassCacheFunc. The cache maintained
    * by @cache_func has to be empty when calling
    * g_type_remove_class_cache_func() to avoid leaks.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[type_remove_class_cache_func:/<function parameters>/cache_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeClassCacheFunc), @type -> DataRecord(GTypeClassCacheFunc)))"
  )
  private def typeRemoveClassCacheFunc() = ???

  /** Removes an interface check function added with
    * g_type_add_interface_check().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[type_remove_interface_check:/<function parameters>/check_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeInterfaceCheckFunc), @type -> DataRecord(GTypeInterfaceCheckFunc)))"
  )
  private def typeRemoveInterfaceCheck() = ???

  /** Attaches arbitrary data to a type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[type_set_qdata:/<function parameters>/quark]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def typeSetQdata() = ???

  def typeTestFlags(
      `type`: GType /* Some(GType) */,
      flags: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_type_test_flags(`type`, guint(flags)).value.!=(0)

  /** Returns the location of the #GTypeValueTable associated with @type.
    *
    * Note that this function should only be used from source code that
    * implements or has internal knowledge of the implementation of
    * @type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[type_value_table_peek:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeValueTable), @type -> DataRecord(GTypeValueTable*)))"
  )
  private def typeValueTablePeek() = ???

  /** Registers a value transformation function for use in g_value_transform().
    * A previously registered transformation function for @src_type and @dest_type
    * will be replaced.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[value_register_transform_func:/<function parameters>/transform_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ValueTransform), @type -> DataRecord(GValueTransform)))"
  )
  private def valueRegisterTransformFunc() = ???

  /** Returns whether a #GValue of type @src_type can be copied into a #GValue
    * of type @dest_type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def valueTypeCompatible(
      src_type: GType /* Some(GType) */,
      dest_type: GType /* Some(GType) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_value_type_compatible(src_type, dest_type).value.!=(0)

  /** Check whether g_value_transform() is able to transform values of type @src_type
    * into values of type @dest_type. Note that for the types to be
    * transformable, they must be compatible or a transformation function must
    * be registered.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def valueTypeTransformable(
      src_type: GType /* Some(GType) */,
      dest_type: GType /* Some(GType) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_value_type_transformable(src_type, dest_type).value.!=(0)

  /** Mask containing the bits of #GParamSpec.flags which are reserved for GLib.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PARAM_MASK: Int = 255

  /** #GParamFlags value alias for %G_PARAM_STATIC_NAME | %G_PARAM_STATIC_NICK |
    * %G_PARAM_STATIC_BLURB.
    *
    * It is recommended to use this for all properties by default, as it allows
    * for internal performance improvements in GObject.
    *
    * It is very rare that a property would have a dynamically constructed name,
    * nickname or blurb.
    *
    * Since 2.13.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PARAM_STATIC_STRINGS: Int = 224

  /** Minimum shift count to be used for user defined flags, to be stored in
    * #GParamSpec.flags. The maximum allowed is 10.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PARAM_USER_SHIFT: Int = 8

  /** A mask for all #GSignalFlags bits.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val SIGNAL_FLAGS_MASK: Int = 511

  /** A mask for all #GSignalMatchType bits.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val SIGNAL_MATCH_MASK: Int = 63

  /** A bit in the type number that's supposed to be left untouched.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[TYPE_FLAG_RESERVED_ID_BIT:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(GLib.Type), @type -> DataRecord(GType))) with raw value `1`"
  )
  private def TYPE_FLAG_RESERVED_ID_BIT() = ???

  /** An integer constant that represents the number of identifiers reserved for
    * types that are assigned at compile-time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val TYPE_FUNDAMENTAL_MAX: Int = 255

  /** Shift value used in converting numbers to type IDs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val TYPE_FUNDAMENTAL_SHIFT: Int = 2

  /** First fundamental type number to create a new fundamental type id with
    * G_TYPE_MAKE_FUNDAMENTAL() reserved for BSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val TYPE_RESERVED_BSE_FIRST: Int = 32

  /** Last fundamental type number reserved for BSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val TYPE_RESERVED_BSE_LAST: Int = 48

  /** First fundamental type number to create a new fundamental type id with
    * G_TYPE_MAKE_FUNDAMENTAL() reserved for GLib.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val TYPE_RESERVED_GLIB_FIRST: Int = 22

  /** Last fundamental type number reserved for GLib.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val TYPE_RESERVED_GLIB_LAST: Int = 31

  /** First available fundamental type number to create new fundamental type id
    * with G_TYPE_MAKE_FUNDAMENTAL().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val TYPE_RESERVED_USER_FIRST: Int = 49

  /** For string values, indicates that the string contained is canonical and
    * will exist for the duration of the process. See
    * g_value_set_interned_string().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val VALUE_INTERNED_STRING: Int = 268435456

  /** If passed to G_VALUE_COLLECT(), allocated data won't be copied but used
    * verbatim. This does not affect ref-counted types like objects. This does
    * not affect usage of g_value_copy(), the data will be copied if it is not
    * ref-counted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val VALUE_NOCOPY_CONTENTS: Int = 134217728
end GObject
