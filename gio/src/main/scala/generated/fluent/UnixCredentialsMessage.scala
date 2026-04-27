package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Credentials
import sn.gnome.gio.fluent.SocketControlMessage
import sn.gnome.gio.internal.GUnixCredentialsMessage

class UnixCredentialsMessage(raw: Ptr[GUnixCredentialsMessage])
    extends SocketControlMessage(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getCredentials(): Credentials = new Credentials(
    g_unix_credentials_message_get_credentials(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

end UnixCredentialsMessage

object UnixCredentialsMessage:
  def apply(): UnixCredentialsMessage = new UnixCredentialsMessage(
    g_unix_credentials_message_new().asInstanceOf
  )
  def withCredentials(credentials: Credentials): UnixCredentialsMessage =
    new UnixCredentialsMessage(
      g_unix_credentials_message_new_with_credentials(
        credentials.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
end UnixCredentialsMessage
