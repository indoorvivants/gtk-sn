package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GAppInfoMonitor
import sn.gnome.gobject.fluent.Object

class AppInfoMonitor(raw: Ptr[GAppInfoMonitor])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end AppInfoMonitor
