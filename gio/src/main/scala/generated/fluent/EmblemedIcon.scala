package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{Emblem, Icon}
import sn.gnome.gio.internal.GEmblemedIcon
import sn.gnome.gobject.fluent.Object

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
class EmblemedIcon(raw: Ptr[GEmblemedIcon])
    extends Object(raw.asInstanceOf),
      Icon:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds @emblem to the #GList of #GEmblems.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addEmblem(emblem: Emblem /* Some(Ptr[GEmblem]) */ ): Unit /* None */ =
    g_emblemed_icon_add_emblem(
      this.raw.asInstanceOf[Ptr[GEmblemedIcon]],
      emblem.getUnsafeRawPointer().asInstanceOf
    )

  /** Removes all the emblems from @icon.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clearEmblems(): Unit /* None */ = g_emblemed_icon_clear_emblems(
    this.raw.asInstanceOf[Ptr[GEmblemedIcon]]
  )

  /** Gets the list of emblems for the @icon.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_emblems/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Emblem))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def getEmblems__ = ???

  /** Gets the main icon for @emblemed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIcon(): Icon /* None */ = new Icon.Abstract(
    g_emblemed_icon_get_icon(
      this.raw.asInstanceOf[Ptr[GEmblemedIcon]]
    ).asInstanceOf
  )

end EmblemedIcon

object EmblemedIcon:
  /** Creates a new emblemed icon for @icon with the emblem @emblem.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
