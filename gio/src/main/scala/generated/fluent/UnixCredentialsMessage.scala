package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{Credentials, SocketControlMessage}
import sn.gnome.gio.internal.GUnixCredentialsMessage
import sn.gnome.glib.internal.{gboolean, gint}

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * This #GSocketControlMessage contains a #GCredentials instance. It may be
  * sent using g_socket_send_message() and received using
  * g_socket_receive_message() over UNIX sockets (ie: sockets in the
  * %G_SOCKET_FAMILY_UNIX family).
  *
  * For an easier way to send and receive credentials over stream-oriented UNIX
  * sockets, see g_unix_connection_send_credentials() and
  * g_unix_connection_receive_credentials(). To receive credentials of a foreign
  * process connected to a socket, use g_socket_get_credentials().
  *
  * Since GLib 2.72, #GUnixCredentialMessage is available on all platforms. It
  * requires underlying system support (such as Windows 10 with `AF_UNIX`) at
  * run time.
  *
  * Before GLib 2.72, `<gio/gunixcredentialsmessage.h>` belonged to the
  * UNIX-specific GIO interfaces, thus you had to use the `gio-unix-2.0.pc`
  * pkg-config file when using it. This is no longer necessary since GLib 2.72.
  */
class UnixCredentialsMessage(raw: Ptr[GUnixCredentialsMessage])
    extends SocketControlMessage(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the credentials stored in @message.
    */
  def getCredentials(): Credentials /* None */ = new Credentials(
    g_unix_credentials_message_get_credentials(
      this.raw.asInstanceOf[Ptr[GUnixCredentialsMessage]]
    ).asInstanceOf
  )

end UnixCredentialsMessage

object UnixCredentialsMessage:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GUnixCredentialsMessage with credentials matching the
    * current processes.
    */
  def apply(): UnixCredentialsMessage = new UnixCredentialsMessage(
    g_unix_credentials_message_new().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GUnixCredentialsMessage holding @credentials.
    */
  def withCredentials(
      credentials: Credentials /* Some(Ptr[GCredentials]) */
  ): UnixCredentialsMessage = new UnixCredentialsMessage(
    g_unix_credentials_message_new_with_credentials(
      credentials.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if passing #GCredentials on a #GSocket is supported on this
    * platform.
    */
  def isSupported()
      : Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_unix_credentials_message_is_supported().value.!=(0)

end UnixCredentialsMessage
