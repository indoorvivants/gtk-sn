package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{
  SocketConnectable,
  TlsCertificateFlags,
  TlsClientConnection
}
import sn.gnome.glib.List
import sn.gnome.glib.internal.{gboolean, gint}

trait TlsClientConnection:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Possibly copies session state from one connection to another, for use in
    * TLS session resumption. This is not normally needed, but may be used when
    * the same session needs to be used between different endpoints, as is
    * required by some protocols, such as FTP over TLS.
    * @source
    *   should have already completed a handshake and, since TLS 1.3, it should
    *   have been used to read data at least once. @conn should not have
    *   completed a handshake.
    *
    * It is not possible to know whether a call to this function will actually
    * do anything. Because session resumption is normally used only for
    * performance benefit, the TLS backend might not implement this function.
    * Even if implemented, it may not actually succeed in allowing @conn to
    * resume @source's TLS session, because the server may not have sent a
    * session resumption token to @source, or it may refuse to accept the token
    * from @conn. There is no way to know whether a call to this function is
    * actually successful.
    *
    * Using this function is not required to benefit from session resumption. If
    * the TLS backend supports session resumption, the session will be resumed
    * automatically if it is possible to do so without weakening the privacy
    * guarantees normally provided by TLS, without need to call this function.
    * For example, with TLS 1.3, a session ticket will be automatically copied
    * from any #GTlsClientConnection that has previously received session
    * tickets from the server, provided a ticket is available that has not
    * previously been used for session resumption, since session ticket reuse
    * would be a privacy weakness. Using this function causes the ticket to be
    * copied without regard for privacy considerations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copySessionState(
      source: sn.gnome.gio.TlsClientConnection /* Some(Ptr[GTlsClientConnection]) */
  ): Unit /* None */ =
    g_tls_client_connection_copy_session_state(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsClientConnection]],
      source.getUnsafeRawPointer().asInstanceOf
    )
  end copySessionState

  /** Gets the list of distinguished names of the Certificate Authorities that
    * the server will accept certificates from. This will be set during the TLS
    * handshake if the server requests a certificate. Otherwise, it will be
    * %NULL.
    *
    * Each item in the list is a #GByteArray which contains the complete subject
    * DN of the certificate authority.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAcceptedCas(): sn.gnome.glib.List /* None */ =
    sn.gnome.glib.List.fromRaw(
      g_tls_client_connection_get_accepted_cas(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsClientConnection]]
      )
    )
  end getAcceptedCas

  /** Gets @conn's expected server identity
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getServerIdentity(): sn.gnome.gio.SocketConnectable /* None */ =
    new SocketConnectable.Abstract(
      g_tls_client_connection_get_server_identity(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsClientConnection]]
      ).asInstanceOf
    )
  end getServerIdentity

  /** SSL 3.0 is no longer supported. See g_tls_client_connection_set_use_ssl3()
    * for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUseSsl3(): Boolean /* None */ =
    g_tls_client_connection_get_use_ssl3(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsClientConnection]]
    ).value.!=(0)
  end getUseSsl3

  /** Gets @conn's validation flags
    *
    * This function does not work as originally designed and is impossible to
    * use correctly. See #GTlsClientConnection:validation-flags for more
    * information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getValidationFlags(): sn.gnome.gio.TlsCertificateFlags /* None */ =
    sn.gnome.gio.TlsCertificateFlags.fromRaw(
      g_tls_client_connection_get_validation_flags(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsClientConnection]]
      )
    )
  end getValidationFlags

  /** Sets @conn's expected server identity, which is used both to tell servers
    * on virtual hosts which certificate to present, and also to let @conn know
    * what name to look for in the certificate when performing
    * %G_TLS_CERTIFICATE_BAD_IDENTITY validation, if enabled.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setServerIdentity(
      identity: sn.gnome.gio.SocketConnectable /* Some(Ptr[GSocketConnectable]) */
  ): Unit /* None */ =
    g_tls_client_connection_set_server_identity(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsClientConnection]],
      identity.getUnsafeRawPointer().asInstanceOf
    )
  end setServerIdentity

  /** Since GLib 2.42.1, SSL 3.0 is no longer supported.
    *
    * From GLib 2.42.1 through GLib 2.62, this function could be used to force
    * use of TLS 1.0, the lowest-supported TLS protocol version at the time. In
    * the past, this was needed to connect to broken TLS servers that exhibited
    * protocol version intolerance. Such servers are no longer common, and using
    * TLS 1.0 is no longer considered acceptable.
    *
    * Since GLib 2.64, this function does nothing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUseSsl3(
      use_ssl3: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    g_tls_client_connection_set_use_ssl3(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsClientConnection]],
      gboolean(gint((if use_ssl3 == true then 1 else 0)))
    )
  end setUseSsl3

  /** Sets @conn's validation flags, to override the default set of checks
    * performed when validating a server certificate. By default,
    * %G_TLS_CERTIFICATE_VALIDATE_ALL is used.
    *
    * This function does not work as originally designed and is impossible to
    * use correctly. See #GTlsClientConnection:validation-flags for more
    * information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setValidationFlags(
      flags: sn.gnome.gio.TlsCertificateFlags /* Some(GTlsCertificateFlags) */
  ): Unit /* None */ =
    g_tls_client_connection_set_validation_flags(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsClientConnection]],
      flags.raw
    )
  end setValidationFlags

end TlsClientConnection

object TlsClientConnection:
  class Abstract(raw: Ptr[Byte]) extends TlsClientConnection:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end TlsClientConnection
