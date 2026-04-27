package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Emblem
import sn.gnome.gio.fluent.Icon
import sn.gnome.gio.internal.GEmblemedIcon
import sn.gnome.glib.internal.GList
import sn.gnome.gobject.fluent.Object

class EmblemedIcon(raw: Ptr[GEmblemedIcon])
    extends Object(raw.asInstanceOf),
      Icon:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addEmblem(emblem: Emblem): Unit = g_emblemed_icon_add_emblem(
    this.raw.asInstanceOf,
    emblem.getUnsafeRawPointer().asInstanceOf
  )

  def clearEmblems(): Unit = g_emblemed_icon_clear_emblems(
    this.raw.asInstanceOf
  )

  def getEmblems(): Ptr[GList] = g_emblemed_icon_get_emblems(
    this.raw.asInstanceOf
  )

  def getIcon(): Icon = new Icon.Abstract(
    g_emblemed_icon_get_icon(this.raw.asInstanceOf).asInstanceOf
  )

end EmblemedIcon

object EmblemedIcon:
  def apply(icon: Icon, emblem: Emblem): EmblemedIcon = new EmblemedIcon(
    g_emblemed_icon_new(
      icon.getUnsafeRawPointer().asInstanceOf,
      emblem.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end EmblemedIcon
