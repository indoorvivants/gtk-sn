package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{Emblem, Icon}
import sn.gnome.gio.internal.GEmblemedIcon
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
  def addEmblem(emblem: Emblem /* Some(Ptr[GEmblem]) */ ): Unit /* None */ =
    g_emblemed_icon_add_emblem(
      this.raw.asInstanceOf[Ptr[GEmblemedIcon]],
      emblem.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes all the emblems from @icon.
    */
  def clearEmblems(): Unit /* None */ = g_emblemed_icon_clear_emblems(
    this.raw.asInstanceOf[Ptr[GEmblemedIcon]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the list of emblems for the @icon.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Emblem))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  def getEmblems__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the main icon for @emblemed.
    */
  def getIcon(): Icon /* None */ = new Icon.Abstract(
    g_emblemed_icon_get_icon(
      this.raw.asInstanceOf[Ptr[GEmblemedIcon]]
    ).asInstanceOf
  )

end EmblemedIcon

object EmblemedIcon:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new emblemed icon for @icon with the emblem @emblem.
    */
  def apply(
      icon: Icon /* Some(Ptr[GIcon]) */,
      emblem: Option[Emblem /* Some(Ptr[GEmblem]) */ ]
  ): EmblemedIcon = new EmblemedIcon(
    g_emblemed_icon_new(
      icon.getUnsafeRawPointer().asInstanceOf,
      emblem
        .map[Ptr[GEmblem]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GEmblem]])
    ).asInstanceOf
  )
end EmblemedIcon
