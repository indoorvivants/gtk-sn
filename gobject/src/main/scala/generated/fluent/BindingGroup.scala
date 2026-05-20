package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.{BindingFlags, Closure, Object}
import sn.gnome.gobject.internal.GBindingGroup
import sn.gnome.gobject.runtime.*

/** The #GBindingGroup can be used to bind multiple properties from an object
  * collectively.
  *
  * Use the various methods to bind properties from a single source object to
  * multiple destination objects. Properties can be bound bidirectionally and
  * are connected when the source object is set with
  * g_binding_group_set_source().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class BindingGroup private[gnome] (raw: Ptr[GBindingGroup])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Creates a binding between @source_property on the source object and @target_property
    * on @target. Whenever the @source_property is changed the @target_property
    * is updated using the same value. The binding flag %G_BINDING_SYNC_CREATE
    * is automatically specified.
    *
    * See g_object_bind_property() for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def bind(
      source_property: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      target: sn.gnome.gobject.Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      target_property: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      flags: sn.gnome.gobject.BindingFlags /* Some(GBindingFlags) */
  )(using Runtime): Unit /* None */ =
    g_binding_group_bind(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GBindingGroup]],
      summon[Runtime]
        .inZone(toCString(source_property))
        .asInstanceOf[Ptr[gchar]],
      target.getUnsafeRawPointer().asInstanceOf,
      summon[Runtime]
        .inZone(toCString(target_property))
        .asInstanceOf[Ptr[gchar]],
      flags.raw
    )
  end bind

  /** Creates a binding between @source_property on the source object and
    * @target_property
    *   on @target, allowing you to set the transformation functions to be used
    *   by the binding. The binding flag %G_BINDING_SYNC_CREATE is automatically
    *   specified.
    *
    * See g_object_bind_property_full() for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method bind_full/<method parameters>/transform_to]: Cannot render type Type(List(),ListMap(@name -> DataRecord(BindingTransformFunc), @type -> DataRecord(GBindingTransformFunc)))"
  )
  private def bindFull__ = ???

  /** Creates a binding between @source_property on the source object and
    * @target_property
    *   on @target, allowing you to set the transformation functions to be used
    *   by the binding. The binding flag %G_BINDING_SYNC_CREATE is automatically
    *   specified.
    *
    * This function is the language bindings friendly version of
    * g_binding_group_bind_property_full(), using #GClosures instead of function
    * pointers.
    *
    * See g_object_bind_property_with_closures() for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def bindWithClosures(
      source_property: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      target: sn.gnome.gobject.Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      target_property: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      flags: sn.gnome.gobject.BindingFlags /* Some(GBindingFlags) */,
      transform_to: Option[sn.gnome.gobject.Closure /* Some(Ptr[GClosure]) */ ],
      transform_from: Option[
        sn.gnome.gobject.Closure /* Some(Ptr[GClosure]) */
      ]
  )(using Runtime): Unit /* None */ =
    g_binding_group_bind_with_closures(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GBindingGroup]],
      summon[Runtime]
        .inZone(toCString(source_property))
        .asInstanceOf[Ptr[gchar]],
      target.getUnsafeRawPointer().asInstanceOf,
      summon[Runtime]
        .inZone(toCString(target_property))
        .asInstanceOf[Ptr[gchar]],
      flags.raw,
      transform_to
        .map[Ptr[GClosure]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GClosure]]),
      transform_from
        .map[Ptr[GClosure]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GClosure]])
    )
  end bindWithClosures

  /** Gets the source object used for binding properties.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dupSource()(using Runtime): sn.gnome.gobject.Object /* None */ =
    sn.gnome.gobject.Object.applyUnsafe(
      g_binding_group_dup_source(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GBindingGroup]]
      ).asInstanceOf
    )
  end dupSource

  /** Sets @source as the source object used for creating property bindings. If
    * there is already a source object all bindings from it will be removed.
    *
    * Note that all properties that have been bound must exist on @source.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSource(
      source: Option[
        sn.gnome.gobject.Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  )(using Runtime): Unit /* None */ =
    g_binding_group_set_source(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GBindingGroup]],
      source
        .map[_root_.sn.gnome.glib.internal.gpointer](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
    )
  end setSource

end BindingGroup

object BindingGroup:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GBindingGroup])(using Runtime) =
    summon[Runtime].getOrCreate[BindingGroup](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new BindingGroup(ptr)
    )

  /** Creates a new #GBindingGroup.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): BindingGroup =
    val raw: Ptr[Byte] = g_binding_group_new().asInstanceOf
    summon[Runtime].getOrCreate[BindingGroup](
      raw,
      r => BindingGroup.applyUnsafe(r.asInstanceOf)
    )
  end apply
end BindingGroup
