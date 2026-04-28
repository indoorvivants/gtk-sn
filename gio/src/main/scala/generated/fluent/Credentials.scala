package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Credentials
import sn.gnome.gio.internal.GCredentials
import sn.gnome.gio.internal.GCredentialsType
import sn.gnome.gio.internal.pid_t
import sn.gnome.gio.internal.uid_t
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

class Credentials(raw: Ptr[GCredentials]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getNative(native_type: GCredentialsType): Ptr[Byte] =
    g_credentials_get_native(this.raw.asInstanceOf, native_type).value

  def getUnixPid(): GResult[pid_t] = GResult.wrap(__errorPtr =>
    g_credentials_get_unix_pid(this.raw.asInstanceOf, __errorPtr)
  )

  def getUnixUser(): GResult[uid_t] = GResult.wrap(__errorPtr =>
    g_credentials_get_unix_user(this.raw.asInstanceOf, __errorPtr)
  )

  def isSameUser(other_credentials: Credentials): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_credentials_is_same_user(
        this.raw.asInstanceOf,
        other_credentials.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def setNative(native_type: GCredentialsType, native: Ptr[Byte]): Unit =
    g_credentials_set_native(
      this.raw.asInstanceOf,
      native_type,
      gpointer(native)
    )

  def setUnixUser(uid: uid_t): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_credentials_set_unix_user(this.raw.asInstanceOf, uid, __errorPtr).value
      .!=(0)
  )

  def toString()(using Zone): String = fromCString(
    g_credentials_to_string(this.raw.asInstanceOf).asInstanceOf
  )

end Credentials

object Credentials:
  def apply(): Credentials = new Credentials(g_credentials_new().asInstanceOf)
end Credentials
