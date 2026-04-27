package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Icon
import sn.gnome.gio.internal.GEmblem
import sn.gnome.gio.internal.GEmblemOrigin
import sn.gnome.gobject.fluent.Object

class Emblem(raw: Ptr[GEmblem]) extends Object(raw.asInstanceOf), Icon:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getIcon(): Icon =
    new Icon.Abstract(g_emblem_get_icon(this.raw.asInstanceOf).asInstanceOf)

  def getOrigin(): GEmblemOrigin = g_emblem_get_origin(this.raw.asInstanceOf)

end Emblem

object Emblem:
  def apply(icon: Icon): Emblem = new Emblem(
    g_emblem_new(icon.getUnsafeRawPointer().asInstanceOf).asInstanceOf
  )
  def withOrigin(icon: Icon, origin: GEmblemOrigin): Emblem = new Emblem(
    g_emblem_new_with_origin(
      icon.getUnsafeRawPointer().asInstanceOf,
      origin
    ).asInstanceOf
  )
end Emblem
