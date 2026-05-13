package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{
  AsyncResult,
  Cancellable,
  IOStream,
  TlsCertificate,
  TlsCertificateFlags,
  TlsDatabase,
  TlsInteraction,
  TlsProtocolVersion,
  TlsRehandshakeMode
}
import sn.gnome.gio.internal.{
  GTlsCertificate,
  GTlsCertificateFlags,
  GTlsConnection
}
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** #GTlsConnection is the base TLS connection class type, which wraps a
  * #GIOStream and provides TLS encryption on top of it. Its subclasses,
  * #GTlsClientConnection and #GTlsServerConnection, implement client-side and
  * server-side TLS, respectively.
  *
  * For DTLS (Datagram TLS) support, see #GDtlsConnection.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TlsConnection private[gnome] (raw: Ptr[GTlsConnection])
    extends IOStream(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Used by #GTlsConnection implementations to emit the
    * #GTlsConnection::accept-certificate signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def emitAcceptCertificate(
      peer_cert: sn.gnome.gio.fluent.TlsCertificate /* Some(Ptr[GTlsCertificate]) */,
      errors: TlsCertificateFlags /* Some(GTlsCertificateFlags) */
  )(using Runtime): Boolean /* None */ =
    g_tls_connection_emit_accept_certificate(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsConnection]],
      peer_cert.getUnsafeRawPointer().asInstanceOf,
      errors.raw
    ).value.!=(0)
  end emitAcceptCertificate

  /** Gets @conn's certificate, as set by g_tls_connection_set_certificate().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCertificate()(using
      Runtime
  ): sn.gnome.gio.fluent.TlsCertificate /* None */ =
    sn.gnome.gio.fluent.TlsCertificate.applyUnsafe(
      g_tls_connection_get_certificate(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsConnection]]
      ).asInstanceOf
    )
  end getCertificate

  /** Query the TLS backend for TLS channel binding data of @type for @conn.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_channel_binding_data]: Method get_channel_binding_data contains an OUT parameter, which is not supported yet"
  )
  private def getChannelBindingData__ = ???

  /** Returns the name of the current TLS ciphersuite, or %NULL if the
    * connection has not handshaked or has been closed. Beware that the TLS
    * backend may use any of multiple different naming conventions, because
    * OpenSSL and GnuTLS have their own ciphersuite naming conventions that are
    * different from each other and different from the standard, IANA-
    * registered ciphersuite names. The ciphersuite name is intended to be
    * displayed to the user for informative purposes only, and parsing it is not
    * recommended.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCiphersuiteName()(using Zone): String /* None */ =
    fromCString(
      g_tls_connection_get_ciphersuite_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsConnection]]
      ).asInstanceOf
    )
  end getCiphersuiteName

  /** Gets the certificate database that @conn uses to verify peer certificates.
    * See g_tls_connection_set_database().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDatabase()(using Runtime): sn.gnome.gio.fluent.TlsDatabase /* None */ =
    sn.gnome.gio.fluent.TlsDatabase.applyUnsafe(
      g_tls_connection_get_database(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsConnection]]
      ).asInstanceOf
    )
  end getDatabase

  /** Get the object that will be used to interact with the user. It will be
    * used for things like prompting the user for passwords. If %NULL is
    * returned, then no user interaction will occur for this connection.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInteraction()(using
      Runtime
  ): sn.gnome.gio.fluent.TlsInteraction /* None */ =
    sn.gnome.gio.fluent.TlsInteraction.applyUnsafe(
      g_tls_connection_get_interaction(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsConnection]]
      ).asInstanceOf
    )
  end getInteraction

  /** Gets the name of the application-layer protocol negotiated during the
    * handshake.
    *
    * If the peer did not use the ALPN extension, or did not advertise a
    * protocol that matched one of @conn's protocols, or the TLS backend does
    * not support ALPN, then this will be %NULL. See
    * g_tls_connection_set_advertised_protocols().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNegotiatedProtocol()(using Zone): String /* None */ =
    fromCString(
      g_tls_connection_get_negotiated_protocol(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsConnection]]
      ).asInstanceOf
    )
  end getNegotiatedProtocol

  /** Gets @conn's peer's certificate after the handshake has completed or
    * failed. (It is not set during the emission of
    * #GTlsConnection::accept-certificate.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPeerCertificate()(using
      Runtime
  ): sn.gnome.gio.fluent.TlsCertificate /* None */ =
    sn.gnome.gio.fluent.TlsCertificate.applyUnsafe(
      g_tls_connection_get_peer_certificate(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsConnection]]
      ).asInstanceOf
    )
  end getPeerCertificate

  /** Gets the errors associated with validating @conn's peer's certificate,
    * after the handshake has completed or failed. (It is not set during the
    * emission of #GTlsConnection::accept-certificate.)
    *
    * See #GTlsConnection:peer-certificate-errors for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPeerCertificateErrors(): TlsCertificateFlags /* None */ =
    TlsCertificateFlags.fromRaw(
      g_tls_connection_get_peer_certificate_errors(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsConnection]]
      )
    )
  end getPeerCertificateErrors

  /** Returns the current TLS protocol version, which may be
    * %G_TLS_PROTOCOL_VERSION_UNKNOWN if the connection has not handshaked, or
    * has been closed, or if the TLS backend has implemented a protocol version
    * that is not a recognized #GTlsProtocolVersion.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getProtocolVersion(): TlsProtocolVersion /* None */ =
    TlsProtocolVersion.fromRaw(
      g_tls_connection_get_protocol_version(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsConnection]]
      )
    )
  end getProtocolVersion

  /** Gets @conn rehandshaking mode. See g_tls_connection_set_rehandshake_mode()
    * for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRehandshakeMode(): TlsRehandshakeMode /* None */ =
    TlsRehandshakeMode.fromRaw(
      g_tls_connection_get_rehandshake_mode(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsConnection]]
      )
    )
  end getRehandshakeMode

  /** Tests whether or not @conn expects a proper TLS close notification when
    * the connection is closed. See g_tls_connection_set_require_close_notify()
    * for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRequireCloseNotify(): Boolean /* None */ =
    g_tls_connection_get_require_close_notify(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsConnection]]
    ).value.!=(0)
  end getRequireCloseNotify

  /** Gets whether @conn uses the system certificate database to verify peer
    * certificates. See g_tls_connection_set_use_system_certdb().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUseSystemCertdb(): Boolean /* None */ =
    g_tls_connection_get_use_system_certdb(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsConnection]]
    ).value.!=(0)
  end getUseSystemCertdb

  /** Attempts a TLS handshake on @conn.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def handshake(
      cancellable: Option[
        sn.gnome.gio.fluent.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_tls_connection_handshake(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsConnection]],
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end handshake

  /** Asynchronously performs a TLS handshake on @conn. See
    * g_tls_connection_handshake() for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method handshake_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def handshakeAsync__ = ???

  /** Finish an asynchronous TLS handshake operation. See
    * g_tls_connection_handshake() for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def handshakeFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_tls_connection_handshake_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsConnection]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end handshakeFinish

  /** Sets the list of application-layer protocols to advertise that the caller
    * is willing to speak on this connection. The Application-Layer Protocol
    * Negotiation (ALPN) extension will be used to negotiate a compatible
    * protocol with the peer; use g_tls_connection_get_negotiated_protocol() to
    * find the negotiated protocol after the handshake. Specifying %NULL for the
    * the value of @protocols will disable ALPN negotiation.
    *
    * See [IANA TLS ALPN Protocol
    * IDs](https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids)
    * for a list of registered protocol IDs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_advertised_protocols/<method parameters>/protocols]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar*)))),ListMap(@type -> DataRecord(const gchar* const*)))"
  )
  private def setAdvertisedProtocols__ = ???

  /** This sets the certificate that @conn will present to its peer during the
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCertificate(
      certificate: sn.gnome.gio.fluent.TlsCertificate /* Some(Ptr[GTlsCertificate]) */
  )(using Runtime): Unit /* None */ =
    g_tls_connection_set_certificate(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsConnection]],
      certificate.getUnsafeRawPointer().asInstanceOf
    )
  end setCertificate

  /** Sets the certificate database that is used to verify peer certificates.
    * This is set to the default database by default. See
    * g_tls_backend_get_default_database(). If set to %NULL, then peer
    * certificate validation will always set the %G_TLS_CERTIFICATE_UNKNOWN_CA
    * error (meaning #GTlsConnection::accept-certificate will always be emitted
    * on client-side connections, unless that bit is not set in
    * #GTlsClientConnection:validation-flags).
    *
    * There are nonintuitive security implications when using a non-default
    * database. See #GTlsConnection:database for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDatabase(
      database: Option[
        sn.gnome.gio.fluent.TlsDatabase /* Some(Ptr[GTlsDatabase]) */
      ]
  )(using Runtime): Unit /* None */ =
    g_tls_connection_set_database(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsConnection]],
      database
        .map[Ptr[GTlsDatabase]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GTlsDatabase]])
    )
  end setDatabase

  /** Set the object that will be used to interact with the user. It will be
    * used for things like prompting the user for passwords.
    *
    * The @interaction argument will normally be a derived subclass of
    * #GTlsInteraction. %NULL can also be provided if no user interaction should
    * occur for this connection.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInteraction(
      interaction: Option[
        sn.gnome.gio.fluent.TlsInteraction /* Some(Ptr[GTlsInteraction]) */
      ]
  )(using Runtime): Unit /* None */ =
    g_tls_connection_set_interaction(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsConnection]],
      interaction
        .map[Ptr[GTlsInteraction]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GTlsInteraction]])
    )
  end setInteraction

  /** Since GLib 2.64, changing the rehandshake mode is no longer supported and
    * will have no effect. With TLS 1.3, rehandshaking has been removed from the
    * TLS protocol, replaced by separate post-handshake authentication and rekey
    * operations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRehandshakeMode(
      mode: TlsRehandshakeMode /* Some(GTlsRehandshakeMode) */
  ): Unit /* None */ =
    g_tls_connection_set_rehandshake_mode(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsConnection]],
      mode.raw
    )
  end setRehandshakeMode

  /** Sets whether or not @conn expects a proper TLS close notification before
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRequireCloseNotify(
      require_close_notify: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    g_tls_connection_set_require_close_notify(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsConnection]],
      gboolean(gint((if require_close_notify == true then 1 else 0)))
    )
  end setRequireCloseNotify

  /** Sets whether @conn uses the system certificate database to verify peer
    * certificates. This is %TRUE by default. If set to %FALSE, then peer
    * certificate validation will always set the %G_TLS_CERTIFICATE_UNKNOWN_CA
    * error (meaning #GTlsConnection::accept-certificate will always be emitted
    * on client-side connections, unless that bit is not set in
    * #GTlsClientConnection:validation-flags).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUseSystemCertdb(
      use_system_certdb: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    g_tls_connection_set_use_system_certdb(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsConnection]],
      gboolean(gint((if use_system_certdb == true then 1 else 0)))
    )
  end setUseSystemCertdb

  /** Emitted during the TLS handshake after the peer certificate has been
    * received. You can examine @peer_cert's certification path by calling
    * g_tls_certificate_get_issuer() on it.
    *
    * For a client-side connection, @peer_cert is the server's certificate, and
    * the signal will only be emitted if the certificate was not acceptable
    * according to @conn's #GTlsClientConnection:validation_flags. If you would
    * like the certificate to be accepted despite @errors, return %TRUE from the
    * signal handler. Otherwise, if no handler accepts the certificate, the
    * handshake will fail with %G_TLS_ERROR_BAD_CERTIFICATE.
    *
    * GLib guarantees that if certificate verification fails, this signal will
    * be emitted with at least one error will be set in @errors, but it does not
    * guarantee that all possible errors will be set. Accordingly, you may not
    * safely decide to ignore any particular type of error. For example, it
    * would be incorrect to ignore %G_TLS_CERTIFICATE_EXPIRED if you want to
    * allow expired certificates, because this could potentially be the only
    * error flag set even if other problems exist with the certificate.
    *
    * For a server-side connection, @peer_cert is the certificate presented by
    * the client, if this was requested via the server's
    * #GTlsServerConnection:authentication_mode. On the server side, the signal
    * is always emitted when the client presents a certificate, and the
    * certificate will only be accepted if a handler returns %TRUE.
    *
    * Note that if this signal is emitted as part of asynchronous I/O in the
    * main thread, then you should not attempt to interact with the user before
    * returning from the signal handler. If you want to let the user decide
    * whether or not to accept the certificate, you would have to return %FALSE
    * from the signal handler on the first attempt, and then after the
    * connection attempt returns a %G_TLS_ERROR_BAD_CERTIFICATE, you can
    * interact with the user, and if the user decides to accept the certificate,
    * remember that fact, create a new connection, and return %TRUE from the
    * signal handler the next time.
    *
    * If you are doing I/O in another thread, you do not need to worry about
    * this, and can simply block in the signal handler until the UI thread
    * returns an answer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onAcceptCertificate(
      handler: (
          (peerCert: TlsCertificate, errors: TlsCertificateFlags)
      ) => Boolean
  )(using Runtime) =
    type SignalRegType = SignalRegistration[
      this.type,
      (peerCert: TlsCertificate, errors: TlsCertificateFlags),
      Boolean
    ]
    val c_handler = CFuncPtr4.fromScalaFunction {
      (
          self: Ptr[GTlsConnection],
          peerCert: Ptr[GTlsCertificate] /* param */,
          errors: GTlsCertificateFlags /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (
            peerCert =
              sr.runtime.get[TlsCertificate](peerCert.asInstanceOf[Ptr[Byte]]),
            errors = TlsCertificateFlags.fromRaw(errors)
          )
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"accept-certificate"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onAcceptCertificate
end TlsConnection

object TlsConnection:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GTlsConnection])(using Runtime) =
    summon[Runtime].getOrCreate[TlsConnection](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new TlsConnection(ptr)
    )

end TlsConnection
