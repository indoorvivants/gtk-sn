package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{Credentials, CredentialsType}
import sn.gnome.gio.internal.{GCredentials, pid_t, uid_t}
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*

/** The #GCredentials type is a reference-counted wrapper for native
  * credentials. This information is typically used for identifying,
  * authenticating and authorizing other processes.
  *
  * Some operating systems supports looking up the credentials of the remote
  * peer of a communication endpoint - see e.g. g_socket_get_credentials().
  *
  * Some operating systems supports securely sending and receiving credentials
  * over a Unix Domain Socket, see #GUnixCredentialsMessage,
  * g_unix_connection_send_credentials() and
  * g_unix_connection_receive_credentials() for details.
  *
  * On Linux, the native credential type is a `struct ucred` - see the unix(7)
  * man page for details. This corresponds to %G_CREDENTIALS_TYPE_LINUX_UCRED.
  *
  * On Apple operating systems (including iOS, tvOS, and macOS), the native
  * credential type is a `struct xucred`. This corresponds to
  * %G_CREDENTIALS_TYPE_APPLE_XUCRED.
  *
  * On FreeBSD, Debian GNU/kFreeBSD, and GNU/Hurd, the native credential type is
  * a `struct cmsgcred`. This corresponds to
  * %G_CREDENTIALS_TYPE_FREEBSD_CMSGCRED.
  *
  * On NetBSD, the native credential type is a `struct unpcbid`. This
  * corresponds to %G_CREDENTIALS_TYPE_NETBSD_UNPCBID.
  *
  * On OpenBSD, the native credential type is a `struct sockpeercred`. This
  * corresponds to %G_CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED.
  *
  * On Solaris (including OpenSolaris and its derivatives), the native
  * credential type is a `ucred_t`. This corresponds to
  * %G_CREDENTIALS_TYPE_SOLARIS_UCRED.
  *
  * Since GLib 2.72, on Windows, the native credentials may contain the PID of a
  * process. This corresponds to %G_CREDENTIALS_TYPE_WIN32_PID.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Credentials private[gnome] (raw: Ptr[GCredentials])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets a pointer to native credentials of type @native_type from
    * @credentials.
    *
    * It is a programming error (which will cause a warning to be logged) to use
    * this method if there is no #GCredentials support for the OS or if @native_type
    * isn't supported by the OS.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNative(
      native_type: CredentialsType /* Some(GCredentialsType) */
  ): Ptr[Byte] /* None */ =
    g_credentials_get_native(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GCredentials]],
      native_type.raw
    ).value
  end getNative

  /** Tries to get the UNIX process identifier from @credentials. This method is
    * only available on UNIX platforms.
    *
    * This operation can fail if #GCredentials is not supported on the OS or if
    * the native credentials type does not contain information about the UNIX
    * process ID.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUnixPid(): GResult[pid_t /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_credentials_get_unix_pid(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GCredentials]],
        __errorPtr
      )
    )
  end getUnixPid

  /** Tries to get the UNIX user identifier from @credentials. This method is
    * only available on UNIX platforms.
    *
    * This operation can fail if #GCredentials is not supported on the OS or if
    * the native credentials type does not contain information about the UNIX
    * user.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUnixUser(): GResult[uid_t /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_credentials_get_unix_user(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GCredentials]],
        __errorPtr
      )
    )
  end getUnixUser

  /** Checks if @credentials and @other_credentials is the same user.
    *
    * This operation can fail if #GCredentials is not supported on the the OS.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isSameUser(
      other_credentials: sn.gnome.gio.fluent.Credentials /* Some(Ptr[GCredentials]) */
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_credentials_is_same_user(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GCredentials]],
        other_credentials.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end isSameUser

  /** Copies the native credentials of type @native_type from @native into @credentials.
    *
    * It is a programming error (which will cause a warning to be logged) to use
    * this method if there is no #GCredentials support for the OS or if @native_type
    * isn't supported by the OS.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setNative(
      native_type: CredentialsType /* Some(GCredentialsType) */,
      native: Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
  ): Unit /* None */ =
    g_credentials_set_native(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GCredentials]],
      native_type.raw,
      gpointer(native)
    )
  end setNative

  /** Tries to set the UNIX user identifier on @credentials. This method is only
    * available on UNIX platforms.
    *
    * This operation can fail if #GCredentials is not supported on the OS or if
    * the native credentials type does not contain information about the UNIX
    * user. It can also fail if the OS does not allow the use of "spoofed"
    * credentials.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUnixUser(uid: uid_t /* Some(uid_t) */ ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_credentials_set_unix_user(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GCredentials]],
        uid,
        __errorPtr
      ).value.!=(0)
    )
  end setUnixUser

  /** Creates a human-readable textual representation of @credentials that can
    * be used in logging and debug messages. The format of the returned string
    * may change in future GLib release.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toString()(using Zone): String /* None */ =
    fromCString(
      g_credentials_to_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GCredentials]]
      ).asInstanceOf
    )
  end toString

end Credentials

object Credentials:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GCredentials])(using Runtime) =
    summon[Runtime].getOrCreate[Credentials](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new Credentials(ptr)
    )

  /** Creates a new #GCredentials object with credentials matching the the
    * current process.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): Credentials =
    val raw: Ptr[Byte] = g_credentials_new().asInstanceOf
    summon[Runtime].getOrCreate[Credentials](
      raw,
      r => Credentials.applyUnsafe(r.asInstanceOf)
    )
  end apply
end Credentials
