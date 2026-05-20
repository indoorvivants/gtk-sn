package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.{BindingFlags, Object}
import sn.gnome.gobject.internal.GBinding
import sn.gnome.gobject.runtime.*

/**  #GBinding is the representation of a binding between a property on a
  *  #GObject instance (or source) and another property on another #GObject
  *  instance (or target).
  *
  *  Whenever the source property changes, the same value is applied to the
  *  target property; for instance, the following binding:
  *
  *  |[<!-- language="C" -->
  *    g_object_bind_property (object1, "property-a",
  *                            object2, "property-b",
  *                            G_BINDING_DEFAULT);
  *  ]|
  *
  *  will cause the property named "property-b" of @object2 to be updated
  *  every time g_object_set() or the specific accessor changes the value of
  *  the property "property-a" of @object1.
  *
  *  It is possible to create a bidirectional binding between two properties
  *  of two #GObject instances, so that if either property changes, the
  *  other is updated as well, for instance:
  *
  *  |[<!-- language="C" -->
  *    g_object_bind_property (object1, "property-a",
  *                            object2, "property-b",
  *                            G_BINDING_BIDIRECTIONAL);
  *  ]|
  *
  *  will keep the two properties in sync.
  *
  *  It is also possible to set a custom transformation function (in both
  *  directions, in case of a bidirectional binding) to apply a custom
  *  transformation from the source value to the target value before
  *  applying it; for instance, the following binding:
  *
  *  |[<!-- language="C" -->
  *    g_object_bind_property_full (adjustment1, "value",
  *                                 adjustment2, "value",
  *                                 G_BINDING_BIDIRECTIONAL,
  *                                 celsius_to_fahrenheit,
  *                                 fahrenheit_to_celsius,
  *                                 NULL, NULL);
  *  ]|
  *
  *  will keep the "value" property of the two adjustments in sync; the
  *  @celsius_to_fahrenheit function will be called whenever the "value"
  *  property of @adjustment1 changes and will transform the current value
  *  of the property before applying it to the "value" property of @adjustment2.
  *
  *  Vice versa, the @fahrenheit_to_celsius function will be called whenever
  *  the "value" property of @adjustment2 changes, and will transform the
  *  current value of the property before applying it to the "value" property
  *  of @adjustment1.
  *
  *  Note that #GBinding does not resolve cycles by itself; a cycle like
  *
  *  |[
  *    object1:propertyA -> object2:propertyB
  *    object2:propertyB -> object3:propertyC
  *    object3:propertyC -> object1:propertyA
  *  ]|
  *
  *  might lead to an infinite loop. The loop, in this particular case,
  *  can be avoided if the objects emit the #GObject::notify signal only
  *  if the value has effectively been changed. A binding is implemented
  *  using the #GObject::notify signal, so it is susceptible to all the
  *  various ways of blocking a signal emission, like g_signal_stop_emission()
  *  or g_signal_handler_block().
  *
  *  A binding will be severed, and the resources it allocates freed, whenever
  *  either one of the #GObject instances it refers to are finalized, or when
  *  the #GBinding instance loses its last reference.
  *
  *  Bindings for languages with garbage collection can use
  *  g_binding_unbind() to explicitly release a binding between the source
  *  and target properties, instead of relying on the last reference on the
  *  binding, source, and target instances to drop.
  *
  *  #GBinding is available since GObject 2.26
  *
  *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
  */
class Binding private[gnome] (raw: Ptr[GBinding])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the #GObject instance used as the source of the binding.
    *
    * A #GBinding can outlive the source #GObject as the binding does not hold a
    * strong reference to the source. If the source is destroyed before the
    * binding then this function will return %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dupSource()(using Runtime): sn.gnome.gobject.Object /* None */ =
    sn.gnome.gobject.Object.applyUnsafe(
      g_binding_dup_source(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GBinding]]
      ).asInstanceOf
    )
  end dupSource

  /** Retrieves the #GObject instance used as the target of the binding.
    *
    * A #GBinding can outlive the target #GObject as the binding does not hold a
    * strong reference to the target. If the target is destroyed before the
    * binding then this function will return %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dupTarget()(using Runtime): sn.gnome.gobject.Object /* None */ =
    sn.gnome.gobject.Object.applyUnsafe(
      g_binding_dup_target(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GBinding]]
      ).asInstanceOf
    )
  end dupTarget

  /** Retrieves the flags passed when constructing the #GBinding.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFlags(): sn.gnome.gobject.BindingFlags /* None */ =
    sn.gnome.gobject.BindingFlags.fromRaw(
      g_binding_get_flags(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GBinding]]
      )
    )
  end getFlags

  /** Retrieves the #GObject instance used as the source of the binding.
    *
    * A #GBinding can outlive the source #GObject as the binding does not hold a
    * strong reference to the source. If the source is destroyed before the
    * binding then this function will return %NULL.
    *
    * Use g_binding_dup_source() if the source or binding are used from
    * different threads as otherwise the pointer returned from this function
    * might become invalid if the source is finalized from another thread in the
    * meantime.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSource()(using Runtime): sn.gnome.gobject.Object /* None */ =
    sn.gnome.gobject.Object.applyUnsafe(
      g_binding_get_source(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GBinding]]
      ).asInstanceOf
    )
  end getSource

  /** Retrieves the name of the property of #GBinding:source used as the source
    * of the binding.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSourceProperty(): scala.Predef.String /* None */ =
    fromCString(
      g_binding_get_source_property(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GBinding]]
      ).asInstanceOf
    )
  end getSourceProperty

  /** Retrieves the #GObject instance used as the target of the binding.
    *
    * A #GBinding can outlive the target #GObject as the binding does not hold a
    * strong reference to the target. If the target is destroyed before the
    * binding then this function will return %NULL.
    *
    * Use g_binding_dup_target() if the target or binding are used from
    * different threads as otherwise the pointer returned from this function
    * might become invalid if the target is finalized from another thread in the
    * meantime.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTarget()(using Runtime): sn.gnome.gobject.Object /* None */ =
    sn.gnome.gobject.Object.applyUnsafe(
      g_binding_get_target(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GBinding]]
      ).asInstanceOf
    )
  end getTarget

  /** Retrieves the name of the property of #GBinding:target used as the target
    * of the binding.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTargetProperty(): scala.Predef.String /* None */ =
    fromCString(
      g_binding_get_target_property(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GBinding]]
      ).asInstanceOf
    )
  end getTargetProperty

  /** Explicitly releases the binding between the source and the target property
    * expressed by @binding.
    *
    * This function will release the reference that is being held on the @binding
    * instance if the binding is still bound; if you want to hold on to the
    * #GBinding instance after calling g_binding_unbind(), you will need to hold
    * a reference to it.
    *
    * Note however that this function does not take ownership of @binding, it
    * only unrefs the reference that was initially created by
    * g_object_bind_property() and is owned by the binding.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unbind(): Unit /* None */ =
    g_binding_unbind(this.getUnsafeRawPointer().asInstanceOf[Ptr[GBinding]])
  end unbind

end Binding

object Binding:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GBinding])(using Runtime) = summon[Runtime]
    .getOrCreate[Binding](ptr.asInstanceOf[Ptr[Byte]], p => new Binding(ptr))

end Binding
