package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Icon
import sn.gnome.gio.internal.GEmblem
import sn.gnome.gio.internal.GEmblemOrigin
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GEmblem is an implementation of #GIcon that supports having an emblem,
  * which is an icon with additional properties. It can than be added to a
  * #GEmblemedIcon.
  *
  * Currently, only metainformation about the emblem's origin is supported. More
  * may be added in the future.
  */
class Emblem(raw: Ptr[GEmblem]) extends Object(raw.asInstanceOf), Icon:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gives back the icon from @emblem.
    */
  def getIcon(): Icon /* None */ = new Icon.Abstract(
    g_emblem_get_icon(this.raw.asInstanceOf[Ptr[GEmblem]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the origin of the emblem.
    */
  def getOrigin(): GEmblemOrigin /* None */ = g_emblem_get_origin(
    this.raw.asInstanceOf[Ptr[GEmblem]]
  )

end Emblem

object Emblem:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new emblem for @icon.
    */
  def apply(icon: Icon /* Some(Ptr[GIcon]) */ ): Emblem = new Emblem(
    g_emblem_new(icon.getUnsafeRawPointer().asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new emblem for @icon.
    */
  def withOrigin(
      icon: Icon /* Some(Ptr[GIcon]) */,
      origin: GEmblemOrigin /* Some(GEmblemOrigin) */
  ): Emblem = new Emblem(
    g_emblem_new_with_origin(
      icon.getUnsafeRawPointer().asInstanceOf,
      origin
    ).asInstanceOf
  )
end Emblem
