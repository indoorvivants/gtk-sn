package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Credentials
import sn.gnome.gio.fluent.IOStream
import sn.gnome.gio.internal.GDBusAuthObserver
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

class DBusAuthObserver(raw: Ptr[GDBusAuthObserver])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def allowMechanism(mechanism: String | CString)(using Zone): Boolean =
    g_dbus_auth_observer_allow_mechanism(
      this.raw.asInstanceOf,
      __sn_extract_string(mechanism).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)

  def authorizeAuthenticatedPeer(
      stream: IOStream,
      credentials: Credentials
  ): Boolean = g_dbus_auth_observer_authorize_authenticated_peer(
    this.raw.asInstanceOf,
    stream.getUnsafeRawPointer().asInstanceOf,
    credentials.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DBusAuthObserver

object DBusAuthObserver:
  def apply(): DBusAuthObserver = new DBusAuthObserver(
    g_dbus_auth_observer_new().asInstanceOf
  )
end DBusAuthObserver
