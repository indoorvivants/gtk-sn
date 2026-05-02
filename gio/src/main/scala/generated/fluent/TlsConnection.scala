package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.IOStream
import sn.gnome.gio.fluent.TlsCertificate
import sn.gnome.gio.fluent.TlsDatabase
import sn.gnome.gio.fluent.TlsInteraction
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GTlsCertificateFlags
import sn.gnome.gio.internal.GTlsConnection
import sn.gnome.gio.internal.GTlsProtocolVersion
import sn.gnome.gio.internal.GTlsRehandshakeMode
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GTlsConnection is the base TLS connection class type, which wraps a
  * #GIOStream and provides TLS encryption on top of it. Its subclasses,
  * #GTlsClientConnection and #GTlsServerConnection, implement client-side and
  * server-side TLS, respectively.
  *
  * For DTLS (Datagram TLS) support, see #GDtlsConnection.
  */
class TlsConnection(raw: Ptr[GTlsConnection])
    extends IOStream(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Used by #GTlsConnection implementations to emit the
    * #GTlsConnection::accept-certificate signal.
    */
  def emitAcceptCertificate(
      peer_cert: TlsCertificate /* Some(Ptr[GTlsCertificate]) */,
      errors: GTlsCertificateFlags /* Some(GTlsCertificateFlags) */
  ): Boolean /* None */ = g_tls_connection_emit_accept_certificate(
    this.raw.asInstanceOf[Ptr[GTlsConnection]],
    peer_cert.getUnsafeRawPointer().asInstanceOf,
    errors
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets @conn's certificate, as set by g_tls_connection_set_certificate().
    */
  def getCertificate(): TlsCertificate /* None */ = new TlsCertificate(
    g_tls_connection_get_certificate(
      this.raw.asInstanceOf[Ptr[GTlsConnection]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Query the TLS backend for TLS channel binding data of @type for @conn.
    *
    * This call retrieves TLS channel binding data as specified in RFC
    * [5056](https://tools.ietf.org/html/rfc5056), RFC
    * [5929](https://tools.ietf.org/html/rfc5929), and related RFCs. The binding
    * data is returned in @data. The @data is resized by the callee using
    * #GByteArray buffer management and will be freed when the @data is
    * destroyed by g_byte_array_unref(). If @data is %NULL, it will only check
    * whether TLS backend is able to fetch the data (e.g. whether @type is
    * supported by the TLS backend). It does not guarantee that the data will be
    * available though. That could happen if TLS connection does not support @type
    * or the binding data is not available yet due to additional negotiation or
    * input required.
    */
  @annotation.compileTimeOnly(
    "Method get_channel_binding_data contains an OUT parameter, which is not supported yet"
  )
  private def getChannelBindingData__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the name of the current TLS ciphersuite, or %NULL if the
    * connection has not handshaked or has been closed. Beware that the TLS
    * backend may use any of multiple different naming conventions, because
    * OpenSSL and GnuTLS have their own ciphersuite naming conventions that are
    * different from each other and different from the standard, IANA-
    * registered ciphersuite names. The ciphersuite name is intended to be
    * displayed to the user for informative purposes only, and parsing it is not
    * recommended.
    */
  def getCiphersuiteName()(using Zone): String /* None */ = fromCString(
    g_tls_connection_get_ciphersuite_name(
      this.raw.asInstanceOf[Ptr[GTlsConnection]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the certificate database that @conn uses to verify peer certificates.
    * See g_tls_connection_set_database().
    */
  def getDatabase(): TlsDatabase /* None */ = new TlsDatabase(
    g_tls_connection_get_database(
      this.raw.asInstanceOf[Ptr[GTlsConnection]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get the object that will be used to interact with the user. It will be
    * used for things like prompting the user for passwords. If %NULL is
    * returned, then no user interaction will occur for this connection.
    */
  def getInteraction(): TlsInteraction /* None */ = new TlsInteraction(
    g_tls_connection_get_interaction(
      this.raw.asInstanceOf[Ptr[GTlsConnection]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the name of the application-layer protocol negotiated during the
    * handshake.
    *
    * If the peer did not use the ALPN extension, or did not advertise a
    * protocol that matched one of @conn's protocols, or the TLS backend does
    * not support ALPN, then this will be %NULL. See
    * g_tls_connection_set_advertised_protocols().
    */
  def getNegotiatedProtocol()(using Zone): String /* None */ = fromCString(
    g_tls_connection_get_negotiated_protocol(
      this.raw.asInstanceOf[Ptr[GTlsConnection]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets @conn's peer's certificate after the handshake has completed or
    * failed. (It is not set during the emission of
    * #GTlsConnection::accept-certificate.)
    */
  def getPeerCertificate(): TlsCertificate /* None */ = new TlsCertificate(
    g_tls_connection_get_peer_certificate(
      this.raw.asInstanceOf[Ptr[GTlsConnection]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the errors associated with validating @conn's peer's certificate,
    * after the handshake has completed or failed. (It is not set during the
    * emission of #GTlsConnection::accept-certificate.)
    *
    * See #GTlsConnection:peer-certificate-errors for more information.
    */
  def getPeerCertificateErrors(): GTlsCertificateFlags /* None */ =
    g_tls_connection_get_peer_certificate_errors(
      this.raw.asInstanceOf[Ptr[GTlsConnection]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the current TLS protocol version, which may be
    * %G_TLS_PROTOCOL_VERSION_UNKNOWN if the connection has not handshaked, or
    * has been closed, or if the TLS backend has implemented a protocol version
    * that is not a recognized #GTlsProtocolVersion.
    */
  def getProtocolVersion(): GTlsProtocolVersion /* None */ =
    g_tls_connection_get_protocol_version(
      this.raw.asInstanceOf[Ptr[GTlsConnection]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets @conn rehandshaking mode. See g_tls_connection_set_rehandshake_mode()
    * for details.
    */
  def getRehandshakeMode(): GTlsRehandshakeMode /* None */ =
    g_tls_connection_get_rehandshake_mode(
      this.raw.asInstanceOf[Ptr[GTlsConnection]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether or not @conn expects a proper TLS close notification when
    * the connection is closed. See g_tls_connection_set_require_close_notify()
    * for details.
    */
  def getRequireCloseNotify(): Boolean /* None */ =
    g_tls_connection_get_require_close_notify(
      this.raw.asInstanceOf[Ptr[GTlsConnection]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether @conn uses the system certificate database to verify peer
    * certificates. See g_tls_connection_set_use_system_certdb().
    */
  def getUseSystemCertdb(): Boolean /* None */ =
    g_tls_connection_get_use_system_certdb(
      this.raw.asInstanceOf[Ptr[GTlsConnection]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attempts a TLS handshake on @conn.
    *
    * On the client side, it is never necessary to call this method; although
    * the connection needs to perform a handshake after connecting (or after
    * sending a "STARTTLS"-type command), #GTlsConnection will handle this for
    * you automatically when you try to send or receive data on the connection.
    * You can call g_tls_connection_handshake() manually if you want to know
    * whether the initial handshake succeeded or failed (as opposed to just
    * immediately trying to use @conn to read or write, in which case, if it
    * fails, it may not be possible to tell if it failed before or after
    * completing the handshake), but beware that servers may reject client
    * authentication after the handshake has completed, so a successful
    * handshake does not indicate the connection will be usable.
    *
    * Likewise, on the server side, although a handshake is necessary at the
    * beginning of the communication, you do not need to call this function
    * explicitly unless you want clearer error reporting.
    *
    * Previously, calling g_tls_connection_handshake() after the initial
    * handshake would trigger a rehandshake; however, this usage was deprecated
    * in GLib 2.60 because rehandshaking was removed from the TLS protocol in
    * TLS 1.3. Since GLib 2.64, calling this function after the initial
    * handshake will no longer do anything.
    *
    * When using a #GTlsConnection created by #GSocketClient, the #GSocketClient
    * performs the initial handshake, so calling this function manually is not
    * recommended.
    *
    * #GTlsConnection::accept_certificate may be emitted during the handshake.
    */
  def handshake(
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_tls_connection_handshake(
      this.raw.asInstanceOf[Ptr[GTlsConnection]],
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value.!=(0)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asynchronously performs a TLS handshake on @conn. See
    * g_tls_connection_handshake() for more information.
    */
  def handshakeAsync(
      io_priority: Int /* Some(CInt) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ],
      callback: Option[GAsyncReadyCallback /* Some(GAsyncReadyCallback) */ ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = g_tls_connection_handshake_async(
    this.raw.asInstanceOf[Ptr[GTlsConnection]],
    io_priority,
    cancellable
      .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
    callback
      .map[GAsyncReadyCallback](o => o)
      .getOrElse(null.asInstanceOf[GAsyncReadyCallback]),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finish an asynchronous TLS handshake operation. See
    * g_tls_connection_handshake() for more information.
    */
  def handshakeFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_tls_connection_handshake_finish(
      this.raw.asInstanceOf[Ptr[GTlsConnection]],
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value.!=(0)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the list of application-layer protocols to advertise that the caller
    * is willing to speak on this connection. The Application-Layer Protocol
    * Negotiation (ALPN) extension will be used to negotiate a compatible
    * protocol with the peer; use g_tls_connection_get_negotiated_protocol() to
    * find the negotiated protocol after the handshake. Specifying %NULL for the
    * the value of @protocols will disable ALPN negotiation.
    *
    * See [IANA TLS ALPN Protocol
    * IDs](https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids)
    * for a list of registered protocol IDs.
    */
  def setAdvertisedProtocols(
      protocols: Option[
        Ptr[CString] /* Some(Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]) */
      ]
  )(using Zone): Unit /* None */ = g_tls_connection_set_advertised_protocols(
    this.raw.asInstanceOf[Ptr[GTlsConnection]],
    protocols
      .map[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]](o => o.asInstanceOf)
      .getOrElse(
        null.asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]
      )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This sets the certificate that @conn will present to its peer during the
    * TLS handshake. For a #GTlsServerConnection, it is mandatory to set this,
    * and that will normally be done at construct time.
    *
    * For a #GTlsClientConnection, this is optional. If a handshake fails with
    * %G_TLS_ERROR_CERTIFICATE_REQUIRED, that means that the server requires a
    * certificate, and if you try connecting again, you should call this method
    * first. You can call g_tls_client_connection_get_accepted_cas() on the
    * failed connection to get a list of Certificate Authorities that the server
    * will accept certificates from.
    *
    * (It is also possible that a server will allow the connection with or
    * without a certificate; in that case, if you don't provide a certificate,
    * you can tell that the server requested one by the fact that
    * g_tls_client_connection_get_accepted_cas() will return non-%NULL.)
    */
  def setCertificate(
      certificate: TlsCertificate /* Some(Ptr[GTlsCertificate]) */
  ): Unit /* None */ = g_tls_connection_set_certificate(
    this.raw.asInstanceOf[Ptr[GTlsConnection]],
    certificate.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the certificate database that is used to verify peer certificates.
    * This is set to the default database by default. See
    * g_tls_backend_get_default_database(). If set to %NULL, then peer
    * certificate validation will always set the %G_TLS_CERTIFICATE_UNKNOWN_CA
    * error (meaning #GTlsConnection::accept-certificate will always be emitted
    * on client-side connections, unless that bit is not set in
    * #GTlsClientConnection:validation-flags).
    *
    * There are nonintuitive security implications when using a non-default
    * database. See #GTlsConnection:database for details.
    */
  def setDatabase(
      database: Option[TlsDatabase /* Some(Ptr[GTlsDatabase]) */ ]
  ): Unit /* None */ = g_tls_connection_set_database(
    this.raw.asInstanceOf[Ptr[GTlsConnection]],
    database
      .map[Ptr[GTlsDatabase]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GTlsDatabase]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Set the object that will be used to interact with the user. It will be
    * used for things like prompting the user for passwords.
    *
    * The @interaction argument will normally be a derived subclass of
    * #GTlsInteraction. %NULL can also be provided if no user interaction should
    * occur for this connection.
    */
  def setInteraction(
      interaction: Option[TlsInteraction /* Some(Ptr[GTlsInteraction]) */ ]
  ): Unit /* None */ = g_tls_connection_set_interaction(
    this.raw.asInstanceOf[Ptr[GTlsConnection]],
    interaction
      .map[Ptr[GTlsInteraction]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GTlsInteraction]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Since GLib 2.64, changing the rehandshake mode is no longer supported and
    * will have no effect. With TLS 1.3, rehandshaking has been removed from the
    * TLS protocol, replaced by separate post-handshake authentication and rekey
    * operations.
    */
  def setRehandshakeMode(
      mode: GTlsRehandshakeMode /* Some(GTlsRehandshakeMode) */
  ): Unit /* None */ = g_tls_connection_set_rehandshake_mode(
    this.raw.asInstanceOf[Ptr[GTlsConnection]],
    mode
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether or not @conn expects a proper TLS close notification before
    * the connection is closed. If this is %TRUE (the default), then @conn will
    * expect to receive a TLS close notification from its peer before the
    * connection is closed, and will return a %G_TLS_ERROR_EOF error if the
    * connection is closed without proper notification (since this may indicate
    * a network error, or man-in-the-middle attack).
    *
    * In some protocols, the application will know whether or not the connection
    * was closed cleanly based on application-level data (because the
    * application-level data includes a length field, or is somehow
    * self-delimiting); in this case, the close notify is redundant and
    * sometimes omitted. (TLS 1.1 explicitly allows this; in TLS 1.0 it is
    * technically an error, but often done anyway.) You can use
    * g_tls_connection_set_require_close_notify() to tell @conn to allow an
    * "unannounced" connection close, in which case the close will show up as a
    * 0-length read, as in a non-TLS #GSocketConnection, and it is up to the
    * application to check that the data has been fully received.
    *
    * Note that this only affects the behavior when the peer closes the
    * connection; when the application calls g_io_stream_close() itself on @conn,
    * this will send a close notification regardless of the setting of this
    * property. If you explicitly want to do an unclean close, you can close @conn's
    * #GTlsConnection:base-io-stream rather than closing @conn itself, but note
    * that this may only be done when no other operations are pending on @conn
    * or the base I/O stream.
    */
  def setRequireCloseNotify(
      require_close_notify: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = g_tls_connection_set_require_close_notify(
    this.raw.asInstanceOf[Ptr[GTlsConnection]],
    gboolean(gint((if require_close_notify == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether @conn uses the system certificate database to verify peer
    * certificates. This is %TRUE by default. If set to %FALSE, then peer
    * certificate validation will always set the %G_TLS_CERTIFICATE_UNKNOWN_CA
    * error (meaning #GTlsConnection::accept-certificate will always be emitted
    * on client-side connections, unless that bit is not set in
    * #GTlsClientConnection:validation-flags).
    */
  def setUseSystemCertdb(
      use_system_certdb: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = g_tls_connection_set_use_system_certdb(
    this.raw.asInstanceOf[Ptr[GTlsConnection]],
    gboolean(gint((if use_system_certdb == true then 1 else 0)))
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end TlsConnection
