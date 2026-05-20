package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{EmblemOrigin, Icon}
import sn.gnome.gio.internal.GEmblem
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** #GEmblem is an implementation of #GIcon that supports having an emblem,
  * which is an icon with additional properties. It can than be added to a
  * #GEmblemedIcon.
  *
  * Currently, only metainformation about the emblem's origin is supported. More
  * may be added in the future.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Emblem private[gnome] (raw: Ptr[GEmblem])
    extends Object(raw.asInstanceOf),
      Icon:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gives back the icon from @emblem.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIcon(): sn.gnome.gio.Icon /* None */ =
    new Icon.Abstract(
      g_emblem_get_icon(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GEmblem]]
      ).asInstanceOf
    )
  end getIcon

  /** Gets the origin of the emblem.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getOrigin(): sn.gnome.gio.EmblemOrigin /* None */ =
    sn.gnome.gio.EmblemOrigin.fromRaw(
      g_emblem_get_origin(this.getUnsafeRawPointer().asInstanceOf[Ptr[GEmblem]])
    )
  end getOrigin

end Emblem

object Emblem:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GEmblem])(using Runtime) = summon[Runtime]
    .getOrCreate[Emblem](ptr.asInstanceOf[Ptr[Byte]], p => new Emblem(ptr))

  /** Creates a new emblem for @icon.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(icon: sn.gnome.gio.Icon /* Some(Ptr[GIcon]) */ )(using
      Runtime
  ): Emblem =
    val raw: Ptr[Byte] = g_emblem_new(
      icon.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Emblem](raw, r => Emblem.applyUnsafe(r.asInstanceOf))
  end apply

  /** Creates a new emblem for @icon.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withOrigin(
      icon: sn.gnome.gio.Icon /* Some(Ptr[GIcon]) */,
      origin: sn.gnome.gio.EmblemOrigin /* Some(GEmblemOrigin) */
  )(using Runtime): Emblem =
    val raw: Ptr[Byte] = g_emblem_new_with_origin(
      icon.getUnsafeRawPointer().asInstanceOf,
      origin.raw
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Emblem](raw, r => Emblem.applyUnsafe(r.asInstanceOf))
  end withOrigin
end Emblem
