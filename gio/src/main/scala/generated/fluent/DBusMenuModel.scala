package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.MenuModel
import sn.gnome.gio.internal.GDBusMenuModel

class DBusMenuModel(raw: Ptr[GDBusMenuModel])
    extends MenuModel(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end DBusMenuModel
