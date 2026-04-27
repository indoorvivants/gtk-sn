package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.DBusConnection
import sn.gnome.gio.fluent.DebugController
import sn.gnome.gio.fluent.Initable
import sn.gnome.gio.internal.GDebugControllerDBus
import sn.gnome.glib.fluent.GResult
import sn.gnome.gobject.fluent.Object

class DebugControllerDBus(raw: Ptr[GDebugControllerDBus])
    extends Object(raw.asInstanceOf),
      DebugController,
      Initable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def stop(): Unit = g_debug_controller_dbus_stop(this.raw.asInstanceOf)

end DebugControllerDBus

object DebugControllerDBus:
  def apply(
      connection: DBusConnection,
      cancellable: Cancellable
  ): GResult[DebugControllerDBus] = GResult.wrap(__errorPtr =>
    new DebugControllerDBus(
      g_debug_controller_dbus_new(
        connection.getUnsafeRawPointer().asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )
end DebugControllerDBus
