package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GBindingFlags
import sn.gnome.gobject.internal.GBindingGroup
import sn.gnome.gobject.internal.GBindingTransformFunc
import sn.gnome.gobject.internal.GClosure

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The #GBindingGroup can be used to bind multiple properties from an object
  * collectively.
  *
  * Use the various methods to bind properties from a single source object to
  * multiple destination objects. Properties can be bound bidirectionally and
  * are connected when the source object is set with
  * g_binding_group_set_source().
  */
class BindingGroup(raw: Ptr[GBindingGroup]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a binding between @source_property on the source object and @target_property
    * on @target. Whenever the @source_property is changed the @target_property
    * is updated using the same value. The binding flag %G_BINDING_SYNC_CREATE
    * is automatically specified.
    *
    * See g_object_bind_property() for more information.
    */
  def bind(
      source_property: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      target: Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      target_property: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      flags: GBindingFlags /* Some(GBindingFlags) */
  )(using Zone): Unit /* None */ = g_binding_group_bind(
    this.raw.asInstanceOf[Ptr[GBindingGroup]],
    __sn_extract_string(source_property).asInstanceOf[Ptr[gchar]],
    gpointer(target.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]),
    __sn_extract_string(target_property).asInstanceOf[Ptr[gchar]],
    flags
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a binding between @source_property on the source object and
    * @target_property
    *   on @target, allowing you to set the transformation functions to be used
    *   by the binding. The binding flag %G_BINDING_SYNC_CREATE is automatically
    *   specified.
    *
    * See g_object_bind_property_full() for more information.
    */
  def bindFull(
      source_property: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      target: Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      target_property: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      flags: GBindingFlags /* Some(GBindingFlags) */,
      transform_to: Option[
        GBindingTransformFunc /* Some(GBindingTransformFunc) */
      ],
      transform_from: Option[
        GBindingTransformFunc /* Some(GBindingTransformFunc) */
      ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      user_data_destroy: GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
  )(using Zone): Unit /* None */ = g_binding_group_bind_full(
    this.raw.asInstanceOf[Ptr[GBindingGroup]],
    __sn_extract_string(source_property).asInstanceOf[Ptr[gchar]],
    gpointer(target.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]),
    __sn_extract_string(target_property).asInstanceOf[Ptr[gchar]],
    flags,
    transform_to
      .map[GBindingTransformFunc](o => o)
      .getOrElse(null.asInstanceOf[GBindingTransformFunc]),
    transform_from
      .map[GBindingTransformFunc](o => o)
      .getOrElse(null.asInstanceOf[GBindingTransformFunc]),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
    user_data_destroy
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a binding between @source_property on the source object and
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
    */
  def bindWithClosures(
      source_property: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      target: Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      target_property: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      flags: GBindingFlags /* Some(GBindingFlags) */,
      transform_to: Option[Ptr[GClosure] /* Some(Ptr[GClosure]) */ ],
      transform_from: Option[Ptr[GClosure] /* Some(Ptr[GClosure]) */ ]
  )(using Zone): Unit /* None */ = g_binding_group_bind_with_closures(
    this.raw.asInstanceOf[Ptr[GBindingGroup]],
    __sn_extract_string(source_property).asInstanceOf[Ptr[gchar]],
    gpointer(target.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]),
    __sn_extract_string(target_property).asInstanceOf[Ptr[gchar]],
    flags,
    transform_to
      .map[Ptr[GClosure]](o => o)
      .getOrElse(null.asInstanceOf[Ptr[GClosure]]),
    transform_from
      .map[Ptr[GClosure]](o => o)
      .getOrElse(null.asInstanceOf[Ptr[GClosure]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the source object used for binding properties.
    */
  def dupSource(): Object /* None */ = new Object(
    g_binding_group_dup_source(
      this.raw.asInstanceOf[Ptr[GBindingGroup]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @source as the source object used for creating property bindings. If
    * there is already a source object all bindings from it will be removed.
    *
    * Note that all properties that have been bound must exist on @source.
    */
  def setSource(
      source: Option[Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */ ]
  ): Unit /* None */ = g_binding_group_set_source(
    this.raw.asInstanceOf[Ptr[GBindingGroup]],
    source
      .map[_root_.sn.gnome.glib.internal.gpointer](o =>
        gpointer(o.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]])
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GBindingGroup.
    */
  def apply(): BindingGroup = new BindingGroup(
    g_binding_group_new().asInstanceOf
  )
end BindingGroup
