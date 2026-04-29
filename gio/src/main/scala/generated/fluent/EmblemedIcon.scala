package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Emblem
import sn.gnome.gio.fluent.Icon
import sn.gnome.gio.internal.GEmblemedIcon
import sn.gnome.glib.internal.GList
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GEmblemedIcon is an implementation of #GIcon that supports adding an emblem
  * to an icon. Adding multiple emblems to an icon is ensured via
  * g_emblemed_icon_add_emblem().
  *
  * Note that #GEmblemedIcon allows no control over the position of the emblems.
  * See also #GEmblem for more information.
  */
class EmblemedIcon(raw: Ptr[GEmblemedIcon])
    extends Object(raw.asInstanceOf),
      Icon:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds @emblem to the #GList of #GEmblems.
    */
  def addEmblem(emblem: Emblem): Unit = g_emblemed_icon_add_emblem(
    this.raw.asInstanceOf,
    emblem.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes all the emblems from @icon.
    */
  def clearEmblems(): Unit = g_emblemed_icon_clear_emblems(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the list of emblems for the @icon.
    */
  def getEmblems(): Ptr[GList] = g_emblemed_icon_get_emblems(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the main icon for @emblemed.
    */
  def getIcon(): Icon = new Icon.Abstract(
    g_emblemed_icon_get_icon(this.raw.asInstanceOf).asInstanceOf
  )

end EmblemedIcon

object EmblemedIcon:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new emblemed icon for @icon with the emblem @emblem.
    */
  def apply(icon: Icon, emblem: Emblem): EmblemedIcon = new EmblemedIcon(
    g_emblemed_icon_new(
      icon.getUnsafeRawPointer().asInstanceOf,
      emblem.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end EmblemedIcon
