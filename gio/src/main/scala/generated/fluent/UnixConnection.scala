package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.Credentials
import sn.gnome.gio.fluent.SocketConnection
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GUnixConnection
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * This is the subclass of #GSocketConnection that is created for UNIX domain
  * sockets.
  *
  * It contains functions to do some of the UNIX socket specific functionality
  * like passing file descriptors.
  *
  * Since GLib 2.72, #GUnixConnection is available on all platforms. It requires
  * underlying system support (such as Windows 10 with `AF_UNIX`) at run time.
  *
  * Before GLib 2.72, `<gio/gunixconnection.h>` belonged to the UNIX-specific
  * GIO interfaces, thus you had to use the `gio-unix-2.0.pc` pkg-config file
  * when using it. This is no longer necessary since GLib 2.72.
  */
class UnixConnection(raw: Ptr[GUnixConnection])
    extends SocketConnection(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Receives credentials from the sending end of the connection. The sending
    * end has to call g_unix_connection_send_credentials() (or similar) for this
    * to work.
    *
    * As well as reading the credentials this also reads (and discards) a single
    * byte from the stream, as this is required for credentials passing to work
    * on some implementations.
    *
    * This method can be expected to be available on the following platforms:
    *
    *   - Linux since GLib 2.26
    *   - FreeBSD since GLib 2.26
    *   - GNU/kFreeBSD since GLib 2.36
    *   - Solaris, Illumos and OpenSolaris since GLib 2.40
    *   - GNU/Hurd since GLib 2.40
    *
    * Other ways to exchange credentials with a foreign peer includes the
    * #GUnixCredentialsMessage type and g_socket_get_credentials() function.
    */
  def receiveCredentials(cancellable: Cancellable): GResult[Credentials] =
    GResult.wrap(__errorPtr =>
      new Credentials(
        g_unix_connection_receive_credentials(
          this.raw.asInstanceOf,
          cancellable.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asynchronously receive credentials.
    *
    * For more details, see g_unix_connection_receive_credentials() which is the
    * synchronous version of this call.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_unix_connection_receive_credentials_finish() to get the result of
    * the operation.
    */
  def receiveCredentialsAsync(
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_unix_connection_receive_credentials_async(
    this.raw.asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an asynchronous receive credentials operation started with
    * g_unix_connection_receive_credentials_async().
    */
  def receiveCredentialsFinish(result: AsyncResult): GResult[Credentials] =
    GResult.wrap(__errorPtr =>
      new Credentials(
        g_unix_connection_receive_credentials_finish(
          this.raw.asInstanceOf,
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Receives a file descriptor from the sending end of the connection. The
    * sending end has to call g_unix_connection_send_fd() for this to work.
    *
    * As well as reading the fd this also reads a single byte from the stream,
    * as this is required for fd passing to work on some implementations.
    */
  def receiveFd(cancellable: Cancellable): GResult[Int] =
    GResult.wrap(__errorPtr =>
      g_unix_connection_receive_fd(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Passes the credentials of the current user the receiving side of the
    * connection. The receiving end has to call
    * g_unix_connection_receive_credentials() (or similar) to accept the
    * credentials.
    *
    * As well as sending the credentials this also writes a single NUL byte to
    * the stream, as this is required for credentials passing to work on some
    * implementations.
    *
    * This method can be expected to be available on the following platforms:
    *
    *   - Linux since GLib 2.26
    *   - FreeBSD since GLib 2.26
    *   - GNU/kFreeBSD since GLib 2.36
    *   - Solaris, Illumos and OpenSolaris since GLib 2.40
    *   - GNU/Hurd since GLib 2.40
    *
    * Other ways to exchange credentials with a foreign peer includes the
    * #GUnixCredentialsMessage type and g_socket_get_credentials() function.
    */
  def sendCredentials(cancellable: Cancellable): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_unix_connection_send_credentials(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asynchronously send credentials.
    *
    * For more details, see g_unix_connection_send_credentials() which is the
    * synchronous version of this call.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_unix_connection_send_credentials_finish() to get the result of the
    * operation.
    */
  def sendCredentialsAsync(
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_unix_connection_send_credentials_async(
    this.raw.asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an asynchronous send credentials operation started with
    * g_unix_connection_send_credentials_async().
    */
  def sendCredentialsFinish(result: AsyncResult): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_unix_connection_send_credentials_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Passes a file descriptor to the receiving side of the connection. The
    * receiving end has to call g_unix_connection_receive_fd() to accept the
    * file descriptor.
    *
    * As well as sending the fd this also writes a single byte to the stream, as
    * this is required for fd passing to work on some implementations.
    */
  def sendFd(fd: Int, cancellable: Cancellable): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_unix_connection_send_fd(
        this.raw.asInstanceOf,
        gint(fd),
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

end UnixConnection
