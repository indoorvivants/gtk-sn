package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GBinding
import sn.gnome.gobject.internal.GBindingFlags

/**  COMMENT FOR THE ORIGINAL C DEFINITION
  *
  *  #GBinding is the representation of a binding between a property on a
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
  */
class Binding(raw: Ptr[GBinding]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the #GObject instance used as the source of the binding.
    *
    * A #GBinding can outlive the source #GObject as the binding does not hold a
    * strong reference to the source. If the source is destroyed before the
    * binding then this function will return %NULL.
    */
  def dupSource(): Object /* None */ = new Object(
    g_binding_dup_source(this.raw.asInstanceOf[Ptr[GBinding]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the #GObject instance used as the target of the binding.
    *
    * A #GBinding can outlive the target #GObject as the binding does not hold a
    * strong reference to the target. If the target is destroyed before the
    * binding then this function will return %NULL.
    */
  def dupTarget(): Object /* None */ = new Object(
    g_binding_dup_target(this.raw.asInstanceOf[Ptr[GBinding]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the flags passed when constructing the #GBinding.
    */
  def getFlags(): GBindingFlags /* None */ = g_binding_get_flags(
    this.raw.asInstanceOf[Ptr[GBinding]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the #GObject instance used as the source of the binding.
    *
    * A #GBinding can outlive the source #GObject as the binding does not hold a
    * strong reference to the source. If the source is destroyed before the
    * binding then this function will return %NULL.
    *
    * Use g_binding_dup_source() if the source or binding are used from
    * different threads as otherwise the pointer returned from this function
    * might become invalid if the source is finalized from another thread in the
    * meantime.
    */
  def getSource(): Object /* None */ = new Object(
    g_binding_get_source(this.raw.asInstanceOf[Ptr[GBinding]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the name of the property of #GBinding:source used as the source
    * of the binding.
    */
  def getSourceProperty()(using Zone): String /* None */ = fromCString(
    g_binding_get_source_property(
      this.raw.asInstanceOf[Ptr[GBinding]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the #GObject instance used as the target of the binding.
    *
    * A #GBinding can outlive the target #GObject as the binding does not hold a
    * strong reference to the target. If the target is destroyed before the
    * binding then this function will return %NULL.
    *
    * Use g_binding_dup_target() if the target or binding are used from
    * different threads as otherwise the pointer returned from this function
    * might become invalid if the target is finalized from another thread in the
    * meantime.
    */
  def getTarget(): Object /* None */ = new Object(
    g_binding_get_target(this.raw.asInstanceOf[Ptr[GBinding]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the name of the property of #GBinding:target used as the target
    * of the binding.
    */
  def getTargetProperty()(using Zone): String /* None */ = fromCString(
    g_binding_get_target_property(
      this.raw.asInstanceOf[Ptr[GBinding]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Explicitly releases the binding between the source and the target property
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
    */
  def unbind(): Unit /* None */ = g_binding_unbind(
    this.raw.asInstanceOf[Ptr[GBinding]]
  )

end Binding
