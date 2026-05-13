package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{AsyncResult, Cancellable, Credentials, SocketConnection}
import sn.gnome.gio.internal.{GSocketConnection, GUnixConnection}
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*

/** This is the subclass of #GSocketConnection that is created for UNIX domain
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class UnixConnection private[gnome] (raw: Ptr[GUnixConnection])
    extends SocketConnection(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Connect @connection to the specified remote address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method connect]: Method connect is weird: Incorrectly marked as overriding a connect method in GObject"
  )
  private def connect__ = ???

  /** Receives credentials from the sending end of the connection. The sending
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def receiveCredentials(
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[sn.gnome.gio.Credentials /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.Credentials.applyUnsafe(
        g_unix_connection_receive_credentials(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GUnixConnection]],
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end receiveCredentials

  /** Asynchronously receive credentials.
    *
    * For more details, see g_unix_connection_receive_credentials() which is the
    * synchronous version of this call.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_unix_connection_receive_credentials_finish() to get the result of
    * the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method receive_credentials_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def receiveCredentialsAsync__ = ???

  /** Finishes an asynchronous receive credentials operation started with
    * g_unix_connection_receive_credentials_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def receiveCredentialsFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.gio.Credentials /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gio.Credentials.applyUnsafe(
        g_unix_connection_receive_credentials_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GUnixConnection]],
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end receiveCredentialsFinish

  /** Receives a file descriptor from the sending end of the connection. The
    * sending end has to call g_unix_connection_send_fd() for this to work.
    *
    * As well as reading the fd this also reads a single byte from the stream,
    * as this is required for fd passing to work on some implementations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def receiveFd(
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Int /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_unix_connection_receive_fd(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GUnixConnection]],
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value
    )
  end receiveFd

  /** Passes the credentials of the current user the receiving side of the
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def sendCredentials(
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_unix_connection_send_credentials(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GUnixConnection]],
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end sendCredentials

  /** Asynchronously send credentials.
    *
    * For more details, see g_unix_connection_send_credentials() which is the
    * synchronous version of this call.
    *
    * When the operation is finished, @callback will be called. You can then
    * call g_unix_connection_send_credentials_finish() to get the result of the
    * operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method send_credentials_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def sendCredentialsAsync__ = ???

  /** Finishes an asynchronous send credentials operation started with
    * g_unix_connection_send_credentials_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def sendCredentialsFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_unix_connection_send_credentials_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GUnixConnection]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end sendCredentialsFinish

  /** Passes a file descriptor to the receiving side of the connection. The
    * receiving end has to call g_unix_connection_receive_fd() to accept the
    * file descriptor.
    *
    * As well as sending the fd this also writes a single byte to the stream, as
    * this is required for fd passing to work on some implementations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def sendFd(
      fd: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_unix_connection_send_fd(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GUnixConnection]],
        gint(fd),
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end sendFd

end UnixConnection

object UnixConnection:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GUnixConnection])(using Runtime) =
    summon[Runtime].getOrCreate[UnixConnection](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new UnixConnection(ptr)
    )

end UnixConnection
