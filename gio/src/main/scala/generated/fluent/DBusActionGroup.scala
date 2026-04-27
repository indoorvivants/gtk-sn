package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ActionGroup
import sn.gnome.gio.fluent.RemoteActionGroup
import sn.gnome.gio.internal.GDBusActionGroup
import sn.gnome.gobject.fluent.Object

class DBusActionGroup(raw: Ptr[GDBusActionGroup])
    extends Object(raw.asInstanceOf),
      ActionGroup,
      RemoteActionGroup:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end DBusActionGroup
