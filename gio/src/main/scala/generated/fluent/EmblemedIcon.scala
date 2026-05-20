package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{Emblem, Icon}
import sn.gnome.gio.internal.GEmblemedIcon
import sn.gnome.glib.List
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** #GEmblemedIcon is an implementation of #GIcon that supports adding an emblem
  * to an icon. Adding multiple emblems to an icon is ensured via
  * g_emblemed_icon_add_emblem().
  *
  * Note that #GEmblemedIcon allows no control over the position of the emblems.
  * See also #GEmblem for more information.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class EmblemedIcon private[gnome] (raw: Ptr[GEmblemedIcon])
    extends Object(raw.asInstanceOf),
      Icon:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds @emblem to the #GList of #GEmblems.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addEmblem(
      emblem: sn.gnome.gio.Emblem /* Some(Ptr[GEmblem]) */
  )(using Runtime): Unit /* None */ =
    g_emblemed_icon_add_emblem(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GEmblemedIcon]],
      emblem.getUnsafeRawPointer().asInstanceOf
    )
  end addEmblem

  /** Removes all the emblems from @icon.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clearEmblems(): Unit /* None */ =
    g_emblemed_icon_clear_emblems(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GEmblemedIcon]]
    )
  end clearEmblems

  /** Gets the list of emblems for the @icon.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEmblems(): sn.gnome.glib.List /* None */ =
    sn.gnome.glib.List.fromRaw(
      g_emblemed_icon_get_emblems(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GEmblemedIcon]]
      )
    )
  end getEmblems

  /** Gets the main icon for @emblemed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIcon(): sn.gnome.gio.Icon /* None */ =
    new Icon.Abstract(
      g_emblemed_icon_get_icon(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GEmblemedIcon]]
      ).asInstanceOf
    )
  end getIcon

end EmblemedIcon

object EmblemedIcon:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GEmblemedIcon])(using Runtime) =
    summon[Runtime].getOrCreate[EmblemedIcon](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new EmblemedIcon(ptr)
    )

  /** Creates a new emblemed icon for @icon with the emblem @emblem.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      icon: sn.gnome.gio.Icon /* Some(Ptr[GIcon]) */,
      emblem: Option[sn.gnome.gio.Emblem /* Some(Ptr[GEmblem]) */ ]
  )(using Runtime): EmblemedIcon =
    val raw: Ptr[Byte] = g_emblemed_icon_new(
      icon.getUnsafeRawPointer().asInstanceOf,
      emblem
        .map[Ptr[GEmblem]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GEmblem]])
    ).asInstanceOf
    summon[Runtime].getOrCreate[EmblemedIcon](
      raw,
      r => EmblemedIcon.applyUnsafe(r.asInstanceOf)
    )
  end apply
end EmblemedIcon
