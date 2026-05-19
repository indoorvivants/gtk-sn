package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer, gsize}
import sn.gnome.gobject.{Binding, BindingFlags, Object, ParamSpec, Value}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  GObject,
  GParamSpec,
  GType,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** The base object type.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Object private[gnome] (raw: Ptr[GObject]):

  def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Increases the reference count of the object by one and sets a callback to
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_toggle_ref/<method parameters>/notify]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ToggleNotify), @type -> DataRecord(GToggleNotify)))"
  )
  private def addToggleRef__ = ???

  /** Adds a weak reference from weak_pointer to @object to indicate that the
    * pointer located at @weak_pointer_location is only valid during the
    * lifetime of @object. When the @object is finalized,
    * @weak_pointer
    *   will be set to %NULL.
    *
    * Note that as with g_object_weak_ref(), the weak references created by this
    * method are not thread-safe: they cannot safely be used in one thread if
    * the object's last g_object_unref() might happen in another thread. Use
    * #GWeakRef if thread-safety is required.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_weak_pointer]: Method add_weak_pointer contains an INOUT parameter, which is not supported yet"
  )
  private def addWeakPointer__ = ???

  /**  Creates a binding between @source_property on @source and @target_property
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
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def bindProperty(
      source_property: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      target: sn.gnome.gobject.Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      target_property: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      flags: BindingFlags /* Some(GBindingFlags) */
  )(using Zone, Runtime): sn.gnome.gobject.Binding /* None */ =
    sn.gnome.gobject.Binding.applyUnsafe(
      g_object_bind_property(
        this
          .getUnsafeRawPointer()
          .asInstanceOf[_root_.sn.gnome.glib.internal.gpointer],
        toCString(source_property).asInstanceOf[Ptr[gchar]],
        target.getUnsafeRawPointer().asInstanceOf,
        toCString(target_property).asInstanceOf[Ptr[gchar]],
        flags.raw
      ).asInstanceOf
    )
  end bindProperty

  /** Complete version of g_object_bind_property().
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method bind_property_full/<method parameters>/transform_to]: Cannot render type Type(List(),ListMap(@name -> DataRecord(BindingTransformFunc), @type -> DataRecord(GBindingTransformFunc)))"
  )
  private def bindPropertyFull__ = ???

  /** Creates a binding between @source_property on @source and @target_property
    * on @target, allowing you to set the transformation functions to be used by
    * the binding.
    *
    * This function is the language bindings friendly version of
    * g_object_bind_property_full(), using #GClosures instead of function
    * pointers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method bind_property_with_closures/<method parameters>/transform_to]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def bindPropertyWithClosures__ = ???

  /**  A convenience function to connect multiple signals at once.
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
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method connect/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def connect__ = ???

  /** A convenience function to disconnect multiple signals at once.
    *
    * The signal specs expected by this function have the form "any_signal",
    * which means to disconnect any signal with matching callback and data, or
    * "any_signal::signal_name", which only disconnects the signal named
    * "signal_name".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method disconnect/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def disconnect__ = ???

  /** This is a variant of g_object_get_data() which returns a 'duplicate' of
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method dup_data/<method parameters>/dup_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DuplicateFunc), @type -> DataRecord(GDuplicateFunc)))"
  )
  private def dupData__ = ???

  /** This is a variant of g_object_get_qdata() which returns a 'duplicate' of
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method dup_qdata/<method parameters>/quark]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def dupQdata__ = ???

  /** This function is intended for #GObject implementations to re-enforce a
    * [floating][floating-ref] object reference. Doing this is seldom required:
    * all #GInitiallyUnowneds are created with a floating reference which
    * usually just needs to be sunken by calling g_object_ref_sink().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forceFloating(): Unit /* None */ =
    g_object_force_floating(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GObject]]
    )
  end forceFloating

  /** Increases the freeze count on @object. If the freeze count is non-zero,
    * the emission of "notify" signals on @object is stopped. The signals are
    * queued until the freeze count is decreased to zero. Duplicate
    * notifications are squashed so that at most one #GObject::notify signal is
    * emitted for each property modified while the object is frozen.
    *
    * This is necessary for accessors that modify multiple properties to prevent
    * premature notification while the object is still being modified.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def freezeNotify(): Unit /* None */ =
    g_object_freeze_notify(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GObject]]
    )
  end freezeNotify

  /**  Gets properties of an object.
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
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def get__ = ???

  /** Gets a named field from the objects table of associations (see
    * g_object_set_data()).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getData(
      key: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Ptr[Byte] /* None */ =
    g_object_get_data(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GObject]],
      toCString(key).asInstanceOf[Ptr[gchar]]
    ).value
  end getData

  /** Gets a property of an object.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getProperty(
      property_name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      value: Value /* Some(Ptr[GValue]) */
  )(using Zone, Runtime): Unit /* None */ =
    g_object_get_property(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GObject]],
      toCString(property_name).asInstanceOf[Ptr[gchar]],
      value.getUnsafeRawPointer()
    )
  end getProperty

  /** This function gets back user data pointers stored via
    * g_object_set_qdata().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_qdata/<method parameters>/quark]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def getQdata__ = ???

  /** Gets properties of an object.
    *
    * In general, a copy is made of the property contents and the caller is
    * responsible for freeing the memory in the appropriate manner for the type,
    * for instance by calling g_free() or g_object_unref().
    *
    * See g_object_get().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_valist]: Method get_valist is weird: conflicting override"
  )
  private def getValist__ = ???

  /** Gets @n_properties properties for an @object. Obtained properties will be
    * set to @values. All properties must be valid. Warnings will be emitted and
    * undefined behaviour may result if invalid properties are passed in.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method getv/<method parameters>/names]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar*)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(0), @type -> DataRecord(const gchar**)))"
  )
  private def getv__ = ???

  /** Checks whether @object has a [floating][floating-ref] reference.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isFloating(): Boolean /* None */ =
    g_object_is_floating(
      this
        .getUnsafeRawPointer()
        .asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
    ).value.!=(0)
  end isFloating

  /** Emits a "notify" signal for the property @property_name on @object.
    *
    * When possible, eg. when signaling a property change from within the class
    * that registered the property, you should use g_object_notify_by_pspec()
    * instead.
    *
    * Note that emission of the notify signal may be blocked with
    * g_object_freeze_notify(). In this case, the signal emissions are queued
    * and will be emitted (in reverse order) when g_object_thaw_notify() is
    * called.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def _notify(
      property_name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ =
    g_object_notify(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GObject]],
      toCString(property_name).asInstanceOf[Ptr[gchar]]
    )
  end _notify

  /**  Emits a "notify" signal for the property specified by @pspec on @object.
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
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def notifyByPspec(
      pspec: sn.gnome.gobject.ParamSpec /* Some(Ptr[GParamSpec]) */
  )(using Runtime): Unit /* None */ =
    g_object_notify_by_pspec(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GObject]],
      pspec.getUnsafeRawPointer().asInstanceOf
    )
  end notifyByPspec

  /** Increases the reference count of @object.
    *
    * Since GLib 2.56, if `GLIB_VERSION_MAX_ALLOWED` is 2.56 or greater, the
    * type of @object will be propagated to the return type (using the GCC
    * typeof() extension), so any casting the caller needs to do on the return
    * type must be explicit.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref()(using Runtime): sn.gnome.gobject.Object /* None */ =
    sn.gnome.gobject.Object.applyUnsafe(
      g_object_ref(
        this
          .getUnsafeRawPointer()
          .asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
      ).asInstanceOf
    )
  end ref

  /** Increase the reference count of @object, and possibly remove the
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def refSink()(using Runtime): sn.gnome.gobject.Object /* None */ =
    sn.gnome.gobject.Object.applyUnsafe(
      g_object_ref_sink(
        this
          .getUnsafeRawPointer()
          .asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
      ).asInstanceOf
    )
  end refSink

  /** Removes a reference added with g_object_add_toggle_ref(). The reference
    * count of the object is decreased by one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method remove_toggle_ref/<method parameters>/notify]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ToggleNotify), @type -> DataRecord(GToggleNotify)))"
  )
  private def removeToggleRef__ = ???

  /** Removes a weak reference from @object that was previously added using
    * g_object_add_weak_pointer(). The @weak_pointer_location has to match the
    * one used with g_object_add_weak_pointer().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method remove_weak_pointer]: Method remove_weak_pointer contains an INOUT parameter, which is not supported yet"
  )
  private def removeWeakPointer__ = ???

  /** Compares the user data for the key @key on @object with
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method replace_data]: Method replace_data contains an OUT parameter, which is not supported yet"
  )
  private def replaceData__ = ???

  /** Compares the user data for the key @quark on @object with
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
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method replace_qdata]: Method replace_qdata contains an OUT parameter, which is not supported yet"
  )
  private def replaceQdata__ = ???

  /** Releases all references to other objects. This can be used to break
    * reference cycles.
    *
    * This function should only be called from object system implementations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def runDispose(): Unit /* None */ =
    g_object_run_dispose(this.getUnsafeRawPointer().asInstanceOf[Ptr[GObject]])
  end runDispose

  /** Sets properties on an object.
    *
    * The same caveats about passing integer literals as varargs apply as with
    * g_object_new(). In particular, any integer literals set as the values for
    * properties of type #gint64 or #guint64 must be 64 bits wide, using the
    * %G_GINT64_CONSTANT or %G_GUINT64_CONSTANT macros.
    *
    * Note that the "notify" signals are queued and only emitted (in reverse
    * order) after all properties have been set. See g_object_freeze_notify().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def set__ = ???

  /** Each object carries around a table of associations from strings to
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setData(
      key: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  )(using Zone): Unit /* None */ =
    g_object_set_data(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GObject]],
      toCString(key).asInstanceOf[Ptr[gchar]],
      data
        .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
    )
  end setData

  /** Like g_object_set_data() except it adds notification for when the
    * association is destroyed, either by setting it to a different value or
    * when the object is destroyed.
    *
    * Note that the @destroy callback is not called if @data is %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_data_full/<method parameters>/destroy]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DestroyNotify), @type -> DataRecord(GDestroyNotify)))"
  )
  private def setDataFull__ = ???

  /** Sets a property on an object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setProperty(
      property_name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      value: Value /* Some(Ptr[GValue]) */
  )(using Zone, Runtime): Unit /* None */ =
    g_object_set_property(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GObject]],
      toCString(property_name).asInstanceOf[Ptr[gchar]],
      value.getUnsafeRawPointer()
    )
  end setProperty

  /** This sets an opaque, named pointer on an object. The name is specified
    * through a #GQuark (retrieved e.g. via g_quark_from_static_string()), and
    * the pointer can be gotten back from the @object with g_object_get_qdata()
    * until the @object is finalized. Setting a previously set user data
    * pointer, overrides (frees) the old pointer set, using #NULL as pointer
    * essentially removes the data stored.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_qdata/<method parameters>/quark]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def setQdata__ = ???

  /** This function works like g_object_set_qdata(), but in addition, a void
    * (*destroy) (gpointer) function may be specified which is called with @data
    * as argument when the @object is finalized, or the data is being
    * overwritten by a call to g_object_set_qdata() with the same @quark.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_qdata_full/<method parameters>/quark]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def setQdataFull__ = ???

  /** Sets properties on an object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setValist(
      first_property_name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      var_args: CVarArgList /* Some(va_list) */
  )(using Zone): Unit /* None */ =
    g_object_set_valist(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GObject]],
      toCString(first_property_name).asInstanceOf[Ptr[gchar]],
      var_args
    )
  end setValist

  /** Sets @n_properties properties for an @object. Properties to be set will be
    * taken from @values. All properties must be valid. Warnings will be emitted
    * and undefined behaviour may result if invalid properties are passed in.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method setv/<method parameters>/names]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar*)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(0), @type -> DataRecord(const gchar**)))"
  )
  private def setv__ = ???

  /** Remove a specified datum from the object's data associations, without
    * invoking the association's destroy handler.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def stealData(
      key: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Ptr[Byte] /* None */ =
    g_object_steal_data(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GObject]],
      toCString(key).asInstanceOf[Ptr[gchar]]
    ).value
  end stealData

  /**  This function gets back user data pointers stored via
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
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method steal_qdata/<method parameters>/quark]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def stealQdata__ = ???

  /** If @object is floating, sink it. Otherwise, do nothing.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def takeRef()(using Runtime): sn.gnome.gobject.Object /* None */ =
    sn.gnome.gobject.Object.applyUnsafe(
      g_object_take_ref(
        this
          .getUnsafeRawPointer()
          .asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
      ).asInstanceOf
    )
  end takeRef

  /** Reverts the effect of a previous call to g_object_freeze_notify(). The
    * freeze count is decreased on @object and when it reaches zero, queued
    * "notify" signals are emitted.
    *
    * Duplicate notifications for each property are squashed so that at most one
    * #GObject::notify signal is emitted for each property, in the reverse order
    * in which they have been queued.
    *
    * It is an error to call this function when the freeze count is zero.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def thawNotify(): Unit /* None */ =
    g_object_thaw_notify(this.getUnsafeRawPointer().asInstanceOf[Ptr[GObject]])
  end thawNotify

  /** Decreases the reference count of @object. When its reference count drops
    * to 0, the object is finalized (i.e. its memory is freed).
    *
    * If the pointer to the #GObject may be reused in future (for example, if it
    * is an instance variable of another object), it is recommended to clear the
    * pointer to %NULL rather than retain a dangling pointer to a potentially
    * invalid #GObject instance. Use g_clear_object() for this.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_object_unref(
      this
        .getUnsafeRawPointer()
        .asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
    )
  end unref

  /** This function essentially limits the life time of the @closure to the life
    * time of the object. That is, when the object is finalized, the @closure is
    * invalidated by calling g_closure_invalidate() on it, in order to prevent
    * invocations of the closure with a finalized (nonexisting) object. Also,
    * g_object_ref() and g_object_unref() are added as marshal guards to the @closure,
    * to ensure that an extra reference count is held on @object during
    * invocation of the
    * @closure.
    *   Usually, this function will be called on closures that use this @object
    *   as closure data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method watch_closure/<method parameters>/closure]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def watchClosure__ = ???

  /** Adds a weak reference callback to an object. Weak references are used for
    * notification when an object is disposed. They are called "weak references"
    * because they allow you to safely hold a pointer to an object without
    * calling g_object_ref() (g_object_ref() adds a strong reference, that is,
    * forces the object to stay alive).
    *
    * Note that the weak references created by this method are not thread-safe:
    * they cannot safely be used in one thread if the object's last
    * g_object_unref() might happen in another thread. Use #GWeakRef if
    * thread-safety is required.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method weak_ref/<method parameters>/notify]: Cannot render type Type(List(),ListMap(@name -> DataRecord(WeakNotify), @type -> DataRecord(GWeakNotify)))"
  )
  private def weakRef__ = ???

  /** Removes a weak reference callback to an object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method weak_unref/<method parameters>/notify]: Cannot render type Type(List(),ListMap(@name -> DataRecord(WeakNotify), @type -> DataRecord(GWeakNotify)))"
  )
  private def weakUnref__ = ???

  /**  The notify signal is emitted on an object when one of its properties has
    *  its value set through g_object_set_property(), g_object_set(), et al.
    *
    *  Note that getting this signal doesn’t itself guarantee that the value of
    *  the property has actually changed. When it is emitted is determined by the
    *  derived GObject class. If the implementor did not create the property with
    *  %G_PARAM_EXPLICIT_NOTIFY, then any call to g_object_set_property() results
    *  in ::notify being emitted, even if the new value is the same as the old.
    *  If they did pass %G_PARAM_EXPLICIT_NOTIFY, then this signal is emitted only
    *  when they explicitly call g_object_notify() or g_object_notify_by_pspec(),
    *  and common practice is to do that only when the value has actually changed.
    *
    *  This signal is typically used to obtain change notification for a
    *  single property, by specifying the property name as a detail in the
    *  g_signal_connect() call, like this:
    *
    *  |[<!-- language="C" -->
    *  g_signal_connect (text_view->buffer, "notify::paste-target-list",
    *                    G_CALLBACK (gtk_text_view_target_list_notify),
    *                    text_view)
    *  ]|
    *
    *  It is important to note that you must use
    *  [canonical parameter names][canonical-parameter-names] as
    *  detail strings for the notify signal.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def onNotify(handler: ((pspec: ParamSpec)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (pspec: ParamSpec), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GObject],
          pspec: Ptr[GParamSpec] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (pspec = sr.runtime.get[ParamSpec](pspec.asInstanceOf[Ptr[Byte]]))
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"notify"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onNotify
end Object

object Object:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GObject])(using Runtime) = summon[Runtime]
    .getOrCreate[Object](ptr.asInstanceOf[Ptr[Byte]], p => new Object(ptr))

  /** Creates a new instance of a #GObject subtype and sets its properties.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  inline def apply(
      object_type: GType /* Some(GType) */,
      first_property_name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      args: Any*
  )(using Zone, Runtime): Object =
    val raw: Ptr[Byte] = g_object_new(
      object_type,
      toCString(first_property_name).asInstanceOf[Ptr[gchar]],
      args*
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Object](raw, r => Object.applyUnsafe(r.asInstanceOf))
  end apply

  /** Creates a new instance of a #GObject subtype and sets its properties.
    *
    * Construction parameters (see %G_PARAM_CONSTRUCT, %G_PARAM_CONSTRUCT_ONLY)
    * which are not explicitly specified are set to their default values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def valist(
      object_type: GType /* Some(GType) */,
      first_property_name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      var_args: CVarArgList /* Some(va_list) */
  )(using Zone, Runtime): Object =
    val raw: Ptr[Byte] = g_object_new_valist(
      object_type,
      toCString(first_property_name).asInstanceOf[Ptr[gchar]],
      var_args
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Object](raw, r => Object.applyUnsafe(r.asInstanceOf))
  end valist

  /** Creates a new instance of a #GObject subtype and sets its properties using
    * the provided arrays. Both arrays must have exactly @n_properties elements,
    * and the names and values correspond by index.
    *
    * Construction parameters (see %G_PARAM_CONSTRUCT, %G_PARAM_CONSTRUCT_ONLY)
    * which are not explicitly specified are set to their default values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new_with_properties/values]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Value), @type -> DataRecord(GValue)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const GValue*)))"
  )
  private def withProperties() = ???

  /** Creates a new instance of a #GObject subtype and sets its properties.
    *
    * Construction parameters (see %G_PARAM_CONSTRUCT, %G_PARAM_CONSTRUCT_ONLY)
    * which are not explicitly specified are set to their default values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor newv/parameters]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Parameter), @type -> DataRecord(GParameter)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(GParameter*)))"
  )
  private def newv() = ???

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

  /** Find the #GParamSpec with the given name for an interface. Generally, the
    * interface vtable passed in as @g_iface will be the default vtable from
    * g_type_default_interface_ref(), or, if you know the interface has already
    * been loaded, g_type_default_interface_peek().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[function interface_find_property/<function parameters>/g_iface]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TypeInterface), @type -> DataRecord(gpointer)))"
  )
  private def interfaceFindProperty() = ???

  /** Add a property to an interface; this is only useful for interfaces that
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[function interface_install_property/<function parameters>/g_iface]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TypeInterface), @type -> DataRecord(gpointer)))"
  )
  private def interfaceInstallProperty() = ???

  /** Lists the properties of an interface.Generally, the interface vtable
    * passed in as @g_iface will be the default vtable from
    * g_type_default_interface_ref(), or, if you know the interface has already
    * been loaded, g_type_default_interface_peek().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[function interface_list_properties]: Function interface_list_properties is weird: non NULL-terminated arrays require special handling"
  )
  private def interfaceListProperties() = ???

end Object
