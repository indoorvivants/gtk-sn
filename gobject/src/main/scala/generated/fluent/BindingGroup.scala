package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.fluent.{BindingFlags, Object}
import sn.gnome.gobject.internal.GBindingGroup

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
class BindingGroup(raw: Ptr[GBindingGroup]) extends Object(raw.asInstanceOf):

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
      source_property: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      target: Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      target_property: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      flags: BindingFlags /* Some(GBindingFlags) */
  )(using Zone): Unit /* None */ = g_binding_group_bind(
    this.raw.asInstanceOf[Ptr[GBindingGroup]],
    __sn_extract_string(source_property).asInstanceOf[Ptr[gchar]],
    target.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(target_property).asInstanceOf[Ptr[gchar]],
    flags.raw
  )

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
  @annotation.compileTimeOnly(
    "[method bind_with_closures/<method parameters>/transform_to]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Closure), @type -> DataRecord(GClosure*)))"
  )
  private def bindWithClosures__ = ???

  /** Gets the source object used for binding properties.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dupSource(): Object /* None */ = new Object(
    g_binding_group_dup_source(
      this.raw.asInstanceOf[Ptr[GBindingGroup]]
    ).asInstanceOf
  )

  /** Sets @source as the source object used for creating property bindings. If
    * there is already a source object all bindings from it will be removed.
    *
    * Note that all properties that have been bound must exist on @source.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSource(
      source: Option[Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */ ]
  ): Unit /* None */ = g_binding_group_set_source(
    this.raw.asInstanceOf[Ptr[GBindingGroup]],
    source
      .map[_root_.sn.gnome.glib.internal.gpointer](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end BindingGroup

object BindingGroup:
  /** Creates a new #GBindingGroup.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): BindingGroup = new BindingGroup(
    g_binding_group_new().asInstanceOf
  )
end BindingGroup
