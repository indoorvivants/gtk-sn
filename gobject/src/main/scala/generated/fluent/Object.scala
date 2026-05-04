package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer, gsize}
import sn.gnome.gobject.fluent.{Binding, BindingFlags, Object, ParamSpec}
import sn.gnome.gobject.internal.{GObject, GType}

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The base object type.
  *
  * All the fields in the `GObject` structure are private to the implementation
  * and should never be accessed directly.
  *
  * Since GLib 2.72, all #GObjects are guaranteed to be aligned to at least the
  * alignment of the largest basic GLib type (typically this is #guint64 or
  * #gdouble). If you need larger alignment for an element in a #GObject, you
  * should allocate it on the heap (aligned), or arrange for your #GObject to be
  * appropriately padded. This guarantee applies to the #GObject (or derived)
  * struct, the #GObjectClass (or derived) struct, and any private data
  * allocated by G_ADD_PRIVATE().
  */
class Object(raw: Ptr[GObject]):

  def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Increases the reference count of the object by one and sets a callback to
    * be called when all other references to the object are dropped, or when
    * this is already the last reference to the object and another reference is
    * established.
    *
    * This functionality is intended for binding @object to a proxy object
    * managed by another memory manager. This is done with two paired
    * references: the strong reference added by g_object_add_toggle_ref() and a
    * reverse reference to the proxy object which is either a strong reference
    * or weak reference.
    *
    * The setup is that when there are no other references to @object, only a
    * weak reference is held in the reverse direction from @object to the proxy
    * object, but when there are other references held to
    * @object,
    *   a strong reference is held. The @notify callback is called when the
    *   reference from @object to the proxy object should be "toggled" from
    *   strong to weak (@is_last_ref true) or weak to strong (@is_last_ref
    *   false).
    *
    * Since a (normal) reference must be held to the object before calling
    * g_object_add_toggle_ref(), the initial state of the reverse link is always
    * strong.
    *
    * Multiple toggle references may be added to the same gobject, however if
    * there are multiple toggle references to an object, none of them will ever
    * be notified until all but one are removed. For this reason, you should
    * only ever use a toggle reference if there is important state in the proxy
    * object.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(ToggleNotify), @type -> DataRecord(GToggleNotify)))"
  )
  def addToggleRef__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a weak reference from weak_pointer to @object to indicate that the
    * pointer located at @weak_pointer_location is only valid during the
    * lifetime of @object. When the @object is finalized,
    * @weak_pointer
    *   will be set to %NULL.
    *
    * Note that as with g_object_weak_ref(), the weak references created by this
    * method are not thread-safe: they cannot safely be used in one thread if
    * the object's last g_object_unref() might happen in another thread. Use
    * #GWeakRef if thread-safety is required.
    */
  @annotation.compileTimeOnly(
    "Method add_weak_pointer contains an INOUT parameter, which is not supported yet"
  )
  def addWeakPointer__ = ???

  /**  COMMENT FOR THE ORIGINAL C DEFINITION
    *
    *  Creates a binding between @source_property on @source and @target_property
    *  on @target.
    *
    *  Whenever the @source_property is changed the @target_property is
    *  updated using the same value. For instance:
    *
    *  |[<!-- language="C" -->
    *    g_object_bind_property (action, "active", widget, "sensitive", 0);
    *  ]|
    *
    *  Will result in the "sensitive" property of the widget #GObject instance to be
    *  updated with the same value of the "active" property of the action #GObject
    *  instance.
    *
    *  If @flags contains %G_BINDING_BIDIRECTIONAL then the binding will be mutual:
    *  if @target_property on @target changes then the @source_property on @source
    *  will be updated as well.
    *
    *  The binding will automatically be removed when either the @source or the
    *  @target instances are finalized. To remove the binding without affecting the
    *  @source and the @target you can just call g_object_unref() on the returned
    *  #GBinding instance.
    *
    *  Removing the binding by calling g_object_unref() on it must only be done if
    *  the binding, @source and @target are only used from a single thread and it
    *  is clear that both @source and @target outlive the binding. Especially it
    *  is not safe to rely on this if the binding, @source or @target can be
    *  finalized from different threads. Keep another reference to the binding and
    *  use g_binding_unbind() instead to be on the safe side.
    *
    *  A #GObject can have multiple bindings.
    */
  def bindProperty(
      source_property: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      target: Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      target_property: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      flags: BindingFlags /* Some(GBindingFlags) */
  )(using Zone): Binding /* None */ = new Binding(
    g_object_bind_property(
      this.raw.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer],
      __sn_extract_string(source_property).asInstanceOf[Ptr[gchar]],
      gpointer(
        target.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]
      ),
      __sn_extract_string(target_property).asInstanceOf[Ptr[gchar]],
      flags.raw
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Complete version of g_object_bind_property().
    *
    * Creates a binding between @source_property on @source and @target_property
    * on @target, allowing you to set the transformation functions to be used by
    * the binding.
    *
    * If @flags contains %G_BINDING_BIDIRECTIONAL then the binding will be
    * mutual: if @target_property on @target changes then the @source_property
    * on @source will be updated as well. The @transform_from function is only
    * used in case of bidirectional bindings, otherwise it will be ignored
    *
    * The binding will automatically be removed when either the @source or the
    * @target
    *   instances are finalized. This will release the reference that is being
    *   held on the #GBinding instance; if you want to hold on to the #GBinding
    *   instance, you will need to hold a reference to it.
    *
    * To remove the binding, call g_binding_unbind().
    *
    * A #GObject can have multiple bindings.
    *
    * The same @user_data parameter will be used for both @transform_to and @transform_from
    * transformation functions; the @notify function will be called once, when
    * the binding is removed. If you need different data for each transformation
    * function, please use g_object_bind_property_with_closures() instead.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(BindingTransformFunc), @type -> DataRecord(GBindingTransformFunc)))"
  )
  def bindPropertyFull__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a binding between @source_property on @source and @target_property
    * on @target, allowing you to set the transformation functions to be used by
    * the binding.
    *
    * This function is the language bindings friendly version of
    * g_object_bind_property_full(), using #GClosures instead of function
    * pointers.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def bindPropertyWithClosures__ = ???

  /**  COMMENT FOR THE ORIGINAL C DEFINITION
    *
    *  A convenience function to connect multiple signals at once.
    *
    *  The signal specs expected by this function have the form
    *  "modifier::signal_name", where modifier can be one of the following:
    *  - signal: equivalent to g_signal_connect_data (..., NULL, G_CONNECT_DEFAULT)
    *  - object-signal, object_signal: equivalent to g_signal_connect_object (..., G_CONNECT_DEFAULT)
    *  - swapped-signal, swapped_signal: equivalent to g_signal_connect_data (..., NULL, G_CONNECT_SWAPPED)
    *  - swapped_object_signal, swapped-object-signal: equivalent to g_signal_connect_object (..., G_CONNECT_SWAPPED)
    *  - signal_after, signal-after: equivalent to g_signal_connect_data (..., NULL, G_CONNECT_AFTER)
    *  - object_signal_after, object-signal-after: equivalent to g_signal_connect_object (..., G_CONNECT_AFTER)
    *  - swapped_signal_after, swapped-signal-after: equivalent to g_signal_connect_data (..., NULL, G_CONNECT_SWAPPED | G_CONNECT_AFTER)
    *  - swapped_object_signal_after, swapped-object-signal-after: equivalent to g_signal_connect_object (..., G_CONNECT_SWAPPED | G_CONNECT_AFTER)
    *
    *  |[<!-- language="C" -->
    *    menu->toplevel = g_object_connect (g_object_new (GTK_TYPE_WINDOW,
    *           "type", GTK_WINDOW_POPUP,
    *           "child", menu,
    *           NULL),
    *           "signal::event", gtk_menu_window_event, menu,
    *           "signal::size_request", gtk_menu_window_size_request, menu,
    *           "signal::destroy", gtk_widget_destroyed, &menu->toplevel,
    *           NULL);
    *  ]|
    */
  inline def connect(
      signal_spec: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      args: Any*
  )(using Zone): Object /* None */ = new Object(
    g_object_connect(
      this.raw.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer],
      __sn_extract_string(signal_spec).asInstanceOf[Ptr[gchar]],
      args*
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A convenience function to disconnect multiple signals at once.
    *
    * The signal specs expected by this function have the form "any_signal",
    * which means to disconnect any signal with matching callback and data, or
    * "any_signal::signal_name", which only disconnects the signal named
    * "signal_name".
    */
  inline def disconnect(
      signal_spec: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      args: Any*
  )(using Zone): Unit /* None */ = g_object_disconnect(
    this.raw.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer],
    __sn_extract_string(signal_spec).asInstanceOf[Ptr[gchar]],
    args*
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This is a variant of g_object_get_data() which returns a 'duplicate' of
    * the value. @dup_func defines the meaning of 'duplicate' in this context,
    * it could e.g. take a reference on a ref-counted object.
    *
    * If the @key is not set on the object then @dup_func will be called with a
    * %NULL argument.
    *
    * Note that @dup_func is called while user data of @object is locked.
    *
    * This function can be useful to avoid races when multiple threads are using
    * object data on the same key on the same object.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DuplicateFunc), @type -> DataRecord(GDuplicateFunc)))"
  )
  def dupData__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This is a variant of g_object_get_qdata() which returns a 'duplicate' of
    * the value. @dup_func defines the meaning of 'duplicate' in this context,
    * it could e.g. take a reference on a ref-counted object.
    *
    * If the @quark is not set on the object then @dup_func will be called with
    * a %NULL argument.
    *
    * Note that @dup_func is called while user data of @object is locked.
    *
    * This function can be useful to avoid races when multiple threads are using
    * object data on the same key on the same object.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def dupQdata__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function is intended for #GObject implementations to re-enforce a
    * [floating][floating-ref] object reference. Doing this is seldom required:
    * all #GInitiallyUnowneds are created with a floating reference which
    * usually just needs to be sunken by calling g_object_ref_sink().
    */
  def forceFloating(): Unit /* None */ = g_object_force_floating(
    this.raw.asInstanceOf[Ptr[GObject]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Increases the freeze count on @object. If the freeze count is non-zero,
    * the emission of "notify" signals on @object is stopped. The signals are
    * queued until the freeze count is decreased to zero. Duplicate
    * notifications are squashed so that at most one #GObject::notify signal is
    * emitted for each property modified while the object is frozen.
    *
    * This is necessary for accessors that modify multiple properties to prevent
    * premature notification while the object is still being modified.
    */
  def freezeNotify(): Unit /* None */ = g_object_freeze_notify(
    this.raw.asInstanceOf[Ptr[GObject]]
  )

  /**  COMMENT FOR THE ORIGINAL C DEFINITION
    *
    *  Gets properties of an object.
    *
    *  In general, a copy is made of the property contents and the caller
    *  is responsible for freeing the memory in the appropriate manner for
    *  the type, for instance by calling g_free() or g_object_unref().
    *
    *  Here is an example of using g_object_get() to get the contents
    *  of three properties: an integer, a string and an object:
    *  |[<!-- language="C" -->
    *   gint intval;
    *   guint64 uint64val;
    *   gchar *strval;
    *   GObject *objval;
    *
    *   g_object_get (my_object,
    *                 "int-property", &intval,
    *                 "uint64-property", &uint64val,
    *                 "str-property", &strval,
    *                 "obj-property", &objval,
    *                 NULL);
    *
    *   // Do something with intval, uint64val, strval, objval
    *
    *   g_free (strval);
    *   g_object_unref (objval);
    *  ]|
    */
  inline def get(
      first_property_name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      args: Any*
  )(using Zone): Unit /* None */ = g_object_get(
    this.raw.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer],
    __sn_extract_string(first_property_name).asInstanceOf[Ptr[gchar]],
    args*
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a named field from the objects table of associations (see
    * g_object_set_data()).
    */
  def getData(
      key: String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Ptr[Byte] /* None */ = g_object_get_data(
    this.raw.asInstanceOf[Ptr[GObject]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a property of an object.
    *
    * The @value can be:
    *
    *   - an empty #GValue initialized by %G_VALUE_INIT, which will be
    *     automatically initialized with the expected type of the property
    *     (since GLib 2.60)
    *   - a #GValue initialized with the expected type of the property
    *   - a #GValue initialized with a type to which the expected type of the
    *     property can be transformed
    *
    * In general, a copy is made of the property contents and the caller is
    * responsible for freeing the memory by calling g_value_unset().
    *
    * Note that g_object_get_property() is really intended for language
    * bindings, g_object_get() is much more convenient for C programming.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(GValue*)))"
  )
  def getProperty__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function gets back user data pointers stored via
    * g_object_set_qdata().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def getQdata__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets properties of an object.
    *
    * In general, a copy is made of the property contents and the caller is
    * responsible for freeing the memory in the appropriate manner for the type,
    * for instance by calling g_free() or g_object_unref().
    *
    * See g_object_get().
    */
  def getValist(
      first_property_name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      var_args: CVarArgList /* Some(va_list) */
  )(using Zone): Unit /* None */ = g_object_get_valist(
    this.raw.asInstanceOf[Ptr[GObject]],
    __sn_extract_string(first_property_name).asInstanceOf[Ptr[gchar]],
    var_args
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets @n_properties properties for an @object. Obtained properties will be
    * set to @values. All properties must be valid. Warnings will be emitted and
    * undefined behaviour may result if invalid properties are passed in.
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar*)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(0), @type -> DataRecord(const gchar**)))"
  )
  def getv__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether @object has a [floating][floating-ref] reference.
    */
  def isFloating(): Boolean /* None */ = g_object_is_floating(
    this.raw.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emits a "notify" signal for the property @property_name on @object.
    *
    * When possible, eg. when signaling a property change from within the class
    * that registered the property, you should use g_object_notify_by_pspec()
    * instead.
    *
    * Note that emission of the notify signal may be blocked with
    * g_object_freeze_notify(). In this case, the signal emissions are queued
    * and will be emitted (in reverse order) when g_object_thaw_notify() is
    * called.
    */
  def _notify(
      property_name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ = g_object_notify(
    this.raw.asInstanceOf[Ptr[GObject]],
    __sn_extract_string(property_name).asInstanceOf[Ptr[gchar]]
  )

  /**  COMMENT FOR THE ORIGINAL C DEFINITION
    *
    *  Emits a "notify" signal for the property specified by @pspec on @object.
    *
    *  This function omits the property name lookup, hence it is faster than
    *  g_object_notify().
    *
    *  One way to avoid using g_object_notify() from within the
    *  class that registered the properties, and using g_object_notify_by_pspec()
    *  instead, is to store the GParamSpec used with
    *  g_object_class_install_property() inside a static array, e.g.:
    *
    *  |[<!-- language="C" -->
    *    typedef enum
    *    {
    *      PROP_FOO = 1,
    *      PROP_LAST
    *    } MyObjectProperty;
    *
    *    static GParamSpec *properties[PROP_LAST];
    *
    *    static void
    *    my_object_class_init (MyObjectClass *klass)
    *    {
    *      properties[PROP_FOO] = g_param_spec_int ("foo", "Foo", "The foo",
    *                                               0, 100,
    *                                               50,
    *                                               G_PARAM_READWRITE | G_PARAM_STATIC_STRINGS);
    *      g_object_class_install_property (gobject_class,
    *                                       PROP_FOO,
    *                                       properties[PROP_FOO]);
    *    }
    *  ]|
    *
    *  and then notify a change on the "foo" property with:
    *
    *  |[<!-- language="C" -->
    *    g_object_notify_by_pspec (self, properties[PROP_FOO]);
    *  ]|
    */
  def notifyByPspec(
      pspec: ParamSpec /* Some(Ptr[GParamSpec]) */
  ): Unit /* None */ = g_object_notify_by_pspec(
    this.raw.asInstanceOf[Ptr[GObject]],
    pspec.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Increases the reference count of @object.
    *
    * Since GLib 2.56, if `GLIB_VERSION_MAX_ALLOWED` is 2.56 or greater, the
    * type of @object will be propagated to the return type (using the GCC
    * typeof() extension), so any casting the caller needs to do on the return
    * type must be explicit.
    */
  def ref(): Object /* None */ = new Object(
    g_object_ref(
      this.raw.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Increase the reference count of @object, and possibly remove the
    * [floating][floating-ref] reference, if @object has a floating reference.
    *
    * In other words, if the object is floating, then this call "assumes
    * ownership" of the floating reference, converting it to a normal reference
    * by clearing the floating flag while leaving the reference count unchanged.
    * If the object is not floating, then this call adds a new normal reference
    * increasing the reference count by one.
    *
    * Since GLib 2.56, the type of @object will be propagated to the return type
    * under the same conditions as for g_object_ref().
    */
  def refSink(): Object /* None */ = new Object(
    g_object_ref_sink(
      this.raw.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a reference added with g_object_add_toggle_ref(). The reference
    * count of the object is decreased by one.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(ToggleNotify), @type -> DataRecord(GToggleNotify)))"
  )
  def removeToggleRef__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a weak reference from @object that was previously added using
    * g_object_add_weak_pointer(). The @weak_pointer_location has to match the
    * one used with g_object_add_weak_pointer().
    */
  @annotation.compileTimeOnly(
    "Method remove_weak_pointer contains an INOUT parameter, which is not supported yet"
  )
  def removeWeakPointer__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Compares the user data for the key @key on @object with
    * @oldval,
    *   and if they are the same, replaces @oldval with
    * @newval.
    *
    * This is like a typical atomic compare-and-exchange operation, for user
    * data on an object.
    *
    * If the previous value was replaced then ownership of the old value
    * (@oldval) is passed to the caller, including the registered destroy notify
    * for it (passed out in @old_destroy). It’s up to the caller to free this as
    * needed, which may or may not include using @old_destroy as sometimes
    * replacement should not destroy the object in the normal way.
    *
    * See g_object_set_data() for guidance on using a small, bounded set of
    * values for @key.
    */
  @annotation.compileTimeOnly(
    "Method replace_data contains an OUT parameter, which is not supported yet"
  )
  def replaceData__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Compares the user data for the key @quark on @object with
    * @oldval,
    *   and if they are the same, replaces @oldval with
    * @newval.
    *
    * This is like a typical atomic compare-and-exchange operation, for user
    * data on an object.
    *
    * If the previous value was replaced then ownership of the old value
    * (@oldval) is passed to the caller, including the registered destroy notify
    * for it (passed out in @old_destroy). It’s up to the caller to free this as
    * needed, which may or may not include using @old_destroy as sometimes
    * replacement should not destroy the object in the normal way.
    */
  @annotation.compileTimeOnly(
    "Method replace_qdata contains an OUT parameter, which is not supported yet"
  )
  def replaceQdata__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Releases all references to other objects. This can be used to break
    * reference cycles.
    *
    * This function should only be called from object system implementations.
    */
  def runDispose(): Unit /* None */ = g_object_run_dispose(
    this.raw.asInstanceOf[Ptr[GObject]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets properties on an object.
    *
    * The same caveats about passing integer literals as varargs apply as with
    * g_object_new(). In particular, any integer literals set as the values for
    * properties of type #gint64 or #guint64 must be 64 bits wide, using the
    * %G_GINT64_CONSTANT or %G_GUINT64_CONSTANT macros.
    *
    * Note that the "notify" signals are queued and only emitted (in reverse
    * order) after all properties have been set. See g_object_freeze_notify().
    */
  inline def set(
      first_property_name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      args: Any*
  )(using Zone): Unit /* None */ = g_object_set(
    this.raw.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer],
    __sn_extract_string(first_property_name).asInstanceOf[Ptr[gchar]],
    args*
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Each object carries around a table of associations from strings to
    * pointers. This function lets you set an association.
    *
    * If the object already had an association with that name, the old
    * association will be destroyed.
    *
    * Internally, the @key is converted to a #GQuark using
    * g_quark_from_string(). This means a copy of @key is kept permanently (even
    * after @object has been finalized) — so it is recommended to only use a
    * small, bounded set of values for @key in your program, to avoid the
    * #GQuark storage growing unbounded.
    */
  def setData(
      key: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  )(using Zone): Unit /* None */ = g_object_set_data(
    this.raw.asInstanceOf[Ptr[GObject]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Like g_object_set_data() except it adds notification for when the
    * association is destroyed, either by setting it to a different value or
    * when the object is destroyed.
    *
    * Note that the @destroy callback is not called if @data is %NULL.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DestroyNotify), @type -> DataRecord(GDestroyNotify)))"
  )
  def setDataFull__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a property on an object.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(const GValue*)))"
  )
  def setProperty__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This sets an opaque, named pointer on an object. The name is specified
    * through a #GQuark (retrieved e.g. via g_quark_from_static_string()), and
    * the pointer can be gotten back from the @object with g_object_get_qdata()
    * until the @object is finalized. Setting a previously set user data
    * pointer, overrides (frees) the old pointer set, using #NULL as pointer
    * essentially removes the data stored.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def setQdata__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function works like g_object_set_qdata(), but in addition, a void
    * (*destroy) (gpointer) function may be specified which is called with @data
    * as argument when the @object is finalized, or the data is being
    * overwritten by a call to g_object_set_qdata() with the same @quark.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def setQdataFull__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets properties on an object.
    */
  def setValist(
      first_property_name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      var_args: CVarArgList /* Some(va_list) */
  )(using Zone): Unit /* None */ = g_object_set_valist(
    this.raw.asInstanceOf[Ptr[GObject]],
    __sn_extract_string(first_property_name).asInstanceOf[Ptr[gchar]],
    var_args
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @n_properties properties for an @object. Properties to be set will be
    * taken from @values. All properties must be valid. Warnings will be emitted
    * and undefined behaviour may result if invalid properties are passed in.
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar*)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(0), @type -> DataRecord(const gchar**)))"
  )
  def setv__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Remove a specified datum from the object's data associations, without
    * invoking the association's destroy handler.
    */
  def stealData(
      key: String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Ptr[Byte] /* None */ = g_object_steal_data(
    this.raw.asInstanceOf[Ptr[GObject]],
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
  ).value

  /**  COMMENT FOR THE ORIGINAL C DEFINITION
    *
    *  This function gets back user data pointers stored via
    *  g_object_set_qdata() and removes the @data from object
    *  without invoking its destroy() function (if any was
    *  set).
    *  Usually, calling this function is only required to update
    *  user data pointers with a destroy notifier, for example:
    *  |[<!-- language="C" -->
    *  void
    *  object_add_to_user_list (GObject     *object,
    *                           const gchar *new_string)
    *  {
    *    // the quark, naming the object data
    *    GQuark quark_string_list = g_quark_from_static_string ("my-string-list");
    *    // retrieve the old string list
    *    GList *list = g_object_steal_qdata (object, quark_string_list);
    *
    *    // prepend new string
    *    list = g_list_prepend (list, g_strdup (new_string));
    *    // this changed 'list', so we need to set it again
    *    g_object_set_qdata_full (object, quark_string_list, list, free_string_list);
    *  }
    *  static void
    *  free_string_list (gpointer data)
    *  {
    *    GList *node, *list = data;
    *
    *    for (node = list; node; node = node->next)
    *      g_free (node->data);
    *    g_list_free (list);
    *  }
    *  ]|
    *  Using g_object_get_qdata() in the above example, instead of
    *  g_object_steal_qdata() would have left the destroy function set,
    *  and thus the partial string list would have been freed upon
    *  g_object_set_qdata_full().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def stealQdata__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @object is floating, sink it. Otherwise, do nothing.
    *
    * In other words, this function will convert a floating reference (if
    * present) into a full reference.
    *
    * Typically you want to use g_object_ref_sink() in order to automatically do
    * the correct thing with respect to floating or non-floating references, but
    * there is one specific scenario where this function is helpful.
    *
    * The situation where this function is helpful is when creating an API that
    * allows the user to provide a callback function that returns a GObject. We
    * certainly want to allow the user the flexibility to return a non-floating
    * reference from this callback (for the case where the object that is being
    * returned already exists).
    *
    * At the same time, the API style of some popular GObject-based libraries
    * (such as Gtk) make it likely that for newly-created GObject instances, the
    * user can be saved some typing if they are allowed to return a floating
    * reference.
    *
    * Using this function on the return value of the user's callback allows the
    * user to do whichever is more convenient for them. The caller will alway
    * receives exactly one full reference to the value: either the one that was
    * returned in the first place, or a floating reference that has been
    * converted to a full reference.
    *
    * This function has an odd interaction when combined with
    * g_object_ref_sink() running at the same time in another thread on the same
    * #GObject instance. If g_object_ref_sink() runs first then the result will
    * be that the floating reference is converted to a hard reference. If
    * g_object_take_ref() runs first then the result will be that the floating
    * reference is converted to a hard reference and an additional reference on
    * top of that one is added. It is best to avoid this situation.
    */
  def takeRef(): Object /* None */ = new Object(
    g_object_take_ref(
      this.raw.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reverts the effect of a previous call to g_object_freeze_notify(). The
    * freeze count is decreased on @object and when it reaches zero, queued
    * "notify" signals are emitted.
    *
    * Duplicate notifications for each property are squashed so that at most one
    * #GObject::notify signal is emitted for each property, in the reverse order
    * in which they have been queued.
    *
    * It is an error to call this function when the freeze count is zero.
    */
  def thawNotify(): Unit /* None */ = g_object_thaw_notify(
    this.raw.asInstanceOf[Ptr[GObject]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Decreases the reference count of @object. When its reference count drops
    * to 0, the object is finalized (i.e. its memory is freed).
    *
    * If the pointer to the #GObject may be reused in future (for example, if it
    * is an instance variable of another object), it is recommended to clear the
    * pointer to %NULL rather than retain a dangling pointer to a potentially
    * invalid #GObject instance. Use g_clear_object() for this.
    */
  def unref(): Unit /* None */ = g_object_unref(
    this.raw.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function essentially limits the life time of the @closure to the life
    * time of the object. That is, when the object is finalized, the @closure is
    * invalidated by calling g_closure_invalidate() on it, in order to prevent
    * invocations of the closure with a finalized (nonexisting) object. Also,
    * g_object_ref() and g_object_unref() are added as marshal guards to the @closure,
    * to ensure that an extra reference count is held on @object during
    * invocation of the
    * @closure.
    *   Usually, this function will be called on closures that use this @object
    *   as closure data.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  def watchClosure__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a weak reference callback to an object. Weak references are used for
    * notification when an object is disposed. They are called "weak references"
    * because they allow you to safely hold a pointer to an object without
    * calling g_object_ref() (g_object_ref() adds a strong reference, that is,
    * forces the object to stay alive).
    *
    * Note that the weak references created by this method are not thread-safe:
    * they cannot safely be used in one thread if the object's last
    * g_object_unref() might happen in another thread. Use #GWeakRef if
    * thread-safety is required.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(WeakNotify), @type -> DataRecord(GWeakNotify)))"
  )
  def weakRef__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a weak reference callback to an object.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(WeakNotify), @type -> DataRecord(GWeakNotify)))"
  )
  def weakUnref__ = ???

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Object

object Object:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new instance of a #GObject subtype and sets its properties.
    *
    * Construction parameters (see %G_PARAM_CONSTRUCT, %G_PARAM_CONSTRUCT_ONLY)
    * which are not explicitly specified are set to their default values. Any
    * private data for the object is guaranteed to be initialized with zeros, as
    * per g_type_create_instance().
    *
    * Note that in C, small integer types in variable argument lists are
    * promoted up to `gint` or `guint` as appropriate, and read back
    * accordingly. `gint` is 32 bits on every platform on which GLib is
    * currently supported. This means that you can use C expressions of type
    * `gint` with g_object_new() and properties of type `gint` or `guint` or
    * smaller. Specifically, you can use integer literals with these property
    * types.
    *
    * When using property types of `gint64` or `guint64`, you must ensure that
    * the value that you provide is 64 bit. This means that you should use a
    * cast or make use of the %G_GINT64_CONSTANT or %G_GUINT64_CONSTANT macros.
    *
    * Similarly, `gfloat` is promoted to `gdouble`, so you must ensure that the
    * value you provide is a `gdouble`, even for a property of type `gfloat`.
    *
    * Since GLib 2.72, all #GObjects are guaranteed to be aligned to at least
    * the alignment of the largest basic GLib type (typically this is `guint64`
    * or `gdouble`). If you need larger alignment for an element in a #GObject,
    * you should allocate it on the heap (aligned), or arrange for your #GObject
    * to be appropriately padded.
    */
  inline def apply(
      object_type: GType /* Some(GType) */,
      first_property_name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      args: Any*
  )(using Zone): Object = new Object(
    g_object_new(
      object_type,
      __sn_extract_string(first_property_name).asInstanceOf[Ptr[gchar]],
      args*
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new instance of a #GObject subtype and sets its properties.
    *
    * Construction parameters (see %G_PARAM_CONSTRUCT, %G_PARAM_CONSTRUCT_ONLY)
    * which are not explicitly specified are set to their default values.
    */
  def valist(
      object_type: GType /* Some(GType) */,
      first_property_name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      var_args: CVarArgList /* Some(va_list) */
  )(using Zone): Object = new Object(
    g_object_new_valist(
      object_type,
      __sn_extract_string(first_property_name).asInstanceOf[Ptr[gchar]],
      var_args
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new instance of a #GObject subtype and sets its properties using
    * the provided arrays. Both arrays must have exactly @n_properties elements,
    * and the names and values correspond by index.
    *
    * Construction parameters (see %G_PARAM_CONSTRUCT, %G_PARAM_CONSTRUCT_ONLY)
    * which are not explicitly specified are set to their default values.
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(char*)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const char**)))"
  )
  def new_with_properties() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new instance of a #GObject subtype and sets its properties.
    *
    * Construction parameters (see %G_PARAM_CONSTRUCT, %G_PARAM_CONSTRUCT_ONLY)
    * which are not explicitly specified are set to their default values.
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Parameter), @type -> DataRecord(GParameter)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(GParameter*)))"
  )
  def newv() = ???

  def compatControl(
      what: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */,
      data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */ =
    g_object_compat_control(
      gsize(what),
      data
        .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
    ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Find the #GParamSpec with the given name for an interface. Generally, the
    * interface vtable passed in as @g_iface will be the default vtable from
    * g_type_default_interface_ref(), or, if you know the interface has already
    * been loaded, g_type_default_interface_peek().
    */
  def interfaceFindProperty(
      g_iface: Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      property_name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): ParamSpec /* Some(Ptr[GParamSpec]) */ = new ParamSpec(
    g_object_interface_find_property(
      gpointer(g_iface),
      __sn_extract_string(property_name).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Add a property to an interface; this is only useful for interfaces that
    * are added to GObject-derived types. Adding a property to an interface
    * forces all objects classes with that interface to have a compatible
    * property. The compatible property could be a newly created #GParamSpec,
    * but normally g_object_class_override_property() will be used so that the
    * object class only needs to provide an implementation and inherits the
    * property description, default value, bounds, and so forth from the
    * interface property.
    *
    * This function is meant to be called from the interface's default vtable
    * initialization function (the @class_init member of #GTypeInfo.) It must
    * not be called after after @class_init has been called for any object types
    * implementing this interface.
    *
    * If @pspec is a floating reference, it will be consumed.
    */
  def interfaceInstallProperty(
      g_iface: Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      pspec: ParamSpec /* Some(Ptr[GParamSpec]) */
  ): Unit /* Some(Unit) */ = g_object_interface_install_property(
    gpointer(g_iface),
    pspec.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Lists the properties of an interface.Generally, the interface vtable
    * passed in as @g_iface will be the default vtable from
    * g_type_default_interface_ref(), or, if you know the interface has already
    * been loaded, g_type_default_interface_peek().
    */
  @annotation.compileTimeOnly(
    "Function interface_list_properties is weird: non NULL-terminated arrays require special handling"
  )
  def interfaceListProperties() = ???

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Object
