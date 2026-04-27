package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GTestDBus
import sn.gnome.gio.internal.GTestDBusFlags
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.fluent.Object

class TestDBus(raw: Ptr[GTestDBus]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addServiceDir(path: String | CString)(using Zone): Unit =
    g_test_dbus_add_service_dir(
      this.raw.asInstanceOf,
      __sn_extract_string(path).asInstanceOf[Ptr[gchar]]
    )

  def down(): Unit = g_test_dbus_down(this.raw.asInstanceOf)

  def getBusAddress()(using Zone): String = fromCString(
    g_test_dbus_get_bus_address(this.raw.asInstanceOf).asInstanceOf
  )

  def getFlags(): GTestDBusFlags = g_test_dbus_get_flags(this.raw.asInstanceOf)

  def stop(): Unit = g_test_dbus_stop(this.raw.asInstanceOf)

  def up(): Unit = g_test_dbus_up(this.raw.asInstanceOf)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end TestDBus

object TestDBus:
  def apply(flags: GTestDBusFlags): TestDBus = new TestDBus(
    g_test_dbus_new(flags).asInstanceOf
  )
end TestDBus
