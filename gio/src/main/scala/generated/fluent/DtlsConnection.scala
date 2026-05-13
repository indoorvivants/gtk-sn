package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{
  AsyncResult,
  Cancellable,
  TlsCertificate,
  TlsCertificateFlags,
  TlsDatabase,
  TlsInteraction,
  TlsProtocolVersion,
  TlsRehandshakeMode
}
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint}
import sn.gnome.gobject.runtime.*

trait DtlsConnection:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Close the DTLS connection. This is equivalent to calling
    * g_dtls_connection_shutdown() to shut down both sides of the connection.
    *
    * Closing a #GDtlsConnection waits for all buffered but untransmitted data
    * to be sent before it completes. It then sends a `close_notify` DTLS alert
    * to the peer and may wait for a `close_notify` to be received from the
    * peer. It does not close the underlying #GDtlsConnection:base-socket; that
    * must be closed separately.
    *
    * Once @conn is closed, all other operations will return %G_IO_ERROR_CLOSED.
    * Closing a #GDtlsConnection multiple times will not return an error.
    *
    * #GDtlsConnections will be automatically closed when the last reference is
    * dropped, but you might want to call this function to make sure resources
    * are released as early as possible.
    *
    * If @cancellable is cancelled, the #GDtlsConnection may be left
    * partially-closed and any pending untransmitted data may be lost. Call
    * g_dtls_connection_close() again to complete closing the #GDtlsConnection.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def close(
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_dtls_connection_close(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsConnection]],
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end close

  /** Asynchronously close the DTLS connection. See g_dtls_connection_close()
    * for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method close_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def closeAsync__ = ???

  /** Finish an asynchronous TLS close operation. See g_dtls_connection_close()
    * for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def closeFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_dtls_connection_close_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsConnection]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end closeFinish

  /** Used by #GDtlsConnection implementations to emit the
    * #GDtlsConnection::accept-certificate signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def emitAcceptCertificate(
      peer_cert: sn.gnome.gio.TlsCertificate /* Some(Ptr[GTlsCertificate]) */,
      errors: TlsCertificateFlags /* Some(GTlsCertificateFlags) */
  )(using Runtime): Boolean /* None */ =
    g_dtls_connection_emit_accept_certificate(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsConnection]],
      peer_cert.getUnsafeRawPointer().asInstanceOf,
      errors.raw
    ).value.!=(0)
  end emitAcceptCertificate

  /** Gets @conn's certificate, as set by g_dtls_connection_set_certificate().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCertificate()(using Runtime): sn.gnome.gio.TlsCertificate /* None */ =
    sn.gnome.gio.TlsCertificate.applyUnsafe(
      g_dtls_connection_get_certificate(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsConnection]]
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

  /** Returns the name of the current DTLS ciphersuite, or %NULL if the
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
      g_dtls_connection_get_ciphersuite_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsConnection]]
      ).asInstanceOf
    )
  end getCiphersuiteName

  /** Gets the certificate database that @conn uses to verify peer certificates.
    * See g_dtls_connection_set_database().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDatabase()(using Runtime): sn.gnome.gio.TlsDatabase /* None */ =
    sn.gnome.gio.TlsDatabase.applyUnsafe(
      g_dtls_connection_get_database(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsConnection]]
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
  def getInteraction()(using Runtime): sn.gnome.gio.TlsInteraction /* None */ =
    sn.gnome.gio.TlsInteraction.applyUnsafe(
      g_dtls_connection_get_interaction(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsConnection]]
      ).asInstanceOf
    )
  end getInteraction

  /** Gets the name of the application-layer protocol negotiated during the
    * handshake.
    *
    * If the peer did not use the ALPN extension, or did not advertise a
    * protocol that matched one of @conn's protocols, or the TLS backend does
    * not support ALPN, then this will be %NULL. See
    * g_dtls_connection_set_advertised_protocols().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNegotiatedProtocol()(using Zone): String /* None */ =
    fromCString(
      g_dtls_connection_get_negotiated_protocol(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsConnection]]
      ).asInstanceOf
    )
  end getNegotiatedProtocol

  /** Gets @conn's peer's certificate after the handshake has completed or
    * failed. (It is not set during the emission of
    * #GDtlsConnection::accept-certificate.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPeerCertificate()(using
      Runtime
  ): sn.gnome.gio.TlsCertificate /* None */ =
    sn.gnome.gio.TlsCertificate.applyUnsafe(
      g_dtls_connection_get_peer_certificate(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsConnection]]
      ).asInstanceOf
    )
  end getPeerCertificate

  /** Gets the errors associated with validating @conn's peer's certificate,
    * after the handshake has completed or failed. (It is not set during the
    * emission of #GDtlsConnection::accept-certificate.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPeerCertificateErrors(): TlsCertificateFlags /* None */ =
    TlsCertificateFlags.fromRaw(
      g_dtls_connection_get_peer_certificate_errors(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsConnection]]
      )
    )
  end getPeerCertificateErrors

  /** Returns the current DTLS protocol version, which may be
    * %G_TLS_PROTOCOL_VERSION_UNKNOWN if the connection has not handshaked, or
    * has been closed, or if the TLS backend has implemented a protocol version
    * that is not a recognized #GTlsProtocolVersion.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getProtocolVersion(): TlsProtocolVersion /* None */ =
    TlsProtocolVersion.fromRaw(
      g_dtls_connection_get_protocol_version(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsConnection]]
      )
    )
  end getProtocolVersion

  /** Gets @conn rehandshaking mode. See
    * g_dtls_connection_set_rehandshake_mode() for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRehandshakeMode(): TlsRehandshakeMode /* None */ =
    TlsRehandshakeMode.fromRaw(
      g_dtls_connection_get_rehandshake_mode(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsConnection]]
      )
    )
  end getRehandshakeMode

  /** Tests whether or not @conn expects a proper TLS close notification when
    * the connection is closed. See g_dtls_connection_set_require_close_notify()
    * for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRequireCloseNotify(): Boolean /* None */ =
    g_dtls_connection_get_require_close_notify(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsConnection]]
    ).value.!=(0)
  end getRequireCloseNotify

  /** Attempts a TLS handshake on @conn.
    *
    * On the client side, it is never necessary to call this method; although
    * the connection needs to perform a handshake after connecting,
    * #GDtlsConnection will handle this for you automatically when you try to
    * send or receive data on the connection. You can call
    * g_dtls_connection_handshake() manually if you want to know whether the
    * initial handshake succeeded or failed (as opposed to just immediately
    * trying to use @conn to read or write, in which case, if it fails, it may
    * not be possible to tell if it failed before or after completing the
    * handshake), but beware that servers may reject client authentication after
    * the handshake has completed, so a successful handshake does not indicate
    * the connection will be usable.
    *
    * Likewise, on the server side, although a handshake is necessary at the
    * beginning of the communication, you do not need to call this function
    * explicitly unless you want clearer error reporting.
    *
    * Previously, calling g_dtls_connection_handshake() after the initial
    * handshake would trigger a rehandshake; however, this usage was deprecated
    * in GLib 2.60 because rehandshaking was removed from the TLS protocol in
    * TLS 1.3. Since GLib 2.64, calling this function after the initial
    * handshake will no longer do anything.
    *
    * #GDtlsConnection::accept_certificate may be emitted during the handshake.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def handshake(
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_dtls_connection_handshake(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsConnection]],
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end handshake

  /** Asynchronously performs a TLS handshake on @conn. See
    * g_dtls_connection_handshake() for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method handshake_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def handshakeAsync__ = ???

  /** Finish an asynchronous TLS handshake operation. See
    * g_dtls_connection_handshake() for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def handshakeFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_dtls_connection_handshake_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsConnection]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end handshakeFinish

  /** Sets the list of application-layer protocols to advertise that the caller
    * is willing to speak on this connection. The Application-Layer Protocol
    * Negotiation (ALPN) extension will be used to negotiate a compatible
    * protocol with the peer; use g_dtls_connection_get_negotiated_protocol() to
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
    * TLS handshake. For a #GDtlsServerConnection, it is mandatory to set this,
    * and that will normally be done at construct time.
    *
    * For a #GDtlsClientConnection, this is optional. If a handshake fails with
    * %G_TLS_ERROR_CERTIFICATE_REQUIRED, that means that the server requires a
    * certificate, and if you try connecting again, you should call this method
    * first. You can call g_dtls_client_connection_get_accepted_cas() on the
    * failed connection to get a list of Certificate Authorities that the server
    * will accept certificates from.
    *
    * (It is also possible that a server will allow the connection with or
    * without a certificate; in that case, if you don't provide a certificate,
    * you can tell that the server requested one by the fact that
    * g_dtls_client_connection_get_accepted_cas() will return non-%NULL.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCertificate(
      certificate: sn.gnome.gio.TlsCertificate /* Some(Ptr[GTlsCertificate]) */
  )(using Runtime): Unit /* None */ =
    g_dtls_connection_set_certificate(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsConnection]],
      certificate.getUnsafeRawPointer().asInstanceOf
    )
  end setCertificate

  /** Sets the certificate database that is used to verify peer certificates.
    * This is set to the default database by default. See
    * g_tls_backend_get_default_database(). If set to %NULL, then peer
    * certificate validation will always set the %G_TLS_CERTIFICATE_UNKNOWN_CA
    * error (meaning #GDtlsConnection::accept-certificate will always be emitted
    * on client-side connections, unless that bit is not set in
    * #GDtlsClientConnection:validation-flags).
    *
    * There are nonintuitive security implications when using a non-default
    * database. See #GDtlsConnection:database for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDatabase(
      database: Option[sn.gnome.gio.TlsDatabase /* Some(Ptr[GTlsDatabase]) */ ]
  )(using Runtime): Unit /* None */ =
    g_dtls_connection_set_database(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsConnection]],
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
        sn.gnome.gio.TlsInteraction /* Some(Ptr[GTlsInteraction]) */
      ]
  )(using Runtime): Unit /* None */ =
    g_dtls_connection_set_interaction(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsConnection]],
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
    g_dtls_connection_set_rehandshake_mode(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsConnection]],
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
    * self-delimiting); in this case, the close notify is redundant and may be
    * omitted. You can use g_dtls_connection_set_require_close_notify() to tell @conn
    * to allow an "unannounced" connection close, in which case the close will
    * show up as a 0-length read, as in a non-TLS #GDatagramBased, and it is up
    * to the application to check that the data has been fully received.
    *
    * Note that this only affects the behavior when the peer closes the
    * connection; when the application calls g_dtls_connection_close_async() on
    * @conn
    *   itself, this will send a close notification regardless of the setting of
    *   this property. If you explicitly want to do an unclean close, you can
    *   close @conn's #GDtlsConnection:base-socket rather than closing @conn
    *   itself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRequireCloseNotify(
      require_close_notify: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    g_dtls_connection_set_require_close_notify(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsConnection]],
      gboolean(gint((if require_close_notify == true then 1 else 0)))
    )
  end setRequireCloseNotify

  /** Shut down part or all of a DTLS connection.
    *
    * If @shutdown_read is %TRUE then the receiving side of the connection is
    * shut down, and further reading is disallowed. Subsequent calls to
    * g_datagram_based_receive_messages() will return %G_IO_ERROR_CLOSED.
    *
    * If @shutdown_write is %TRUE then the sending side of the connection is
    * shut down, and further writing is disallowed. Subsequent calls to
    * g_datagram_based_send_messages() will return %G_IO_ERROR_CLOSED.
    *
    * It is allowed for both @shutdown_read and @shutdown_write to be TRUE —
    * this is equivalent to calling g_dtls_connection_close().
    *
    * If @cancellable is cancelled, the #GDtlsConnection may be left
    * partially-closed and any pending untransmitted data may be lost. Call
    * g_dtls_connection_shutdown() again to complete closing the
    * #GDtlsConnection.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def shutdown(
      shutdown_read: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      shutdown_write: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_dtls_connection_shutdown(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsConnection]],
        gboolean(gint((if shutdown_read == true then 1 else 0))),
        gboolean(gint((if shutdown_write == true then 1 else 0))),
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end shutdown

  /** Asynchronously shut down part or all of the DTLS connection. See
    * g_dtls_connection_shutdown() for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method shutdown_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def shutdownAsync__ = ???

  /** Finish an asynchronous TLS shutdown operation. See
    * g_dtls_connection_shutdown() for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def shutdownFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_dtls_connection_shutdown_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDtlsConnection]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end shutdownFinish

end DtlsConnection

object DtlsConnection:
  class Abstract(raw: Ptr[Byte]) extends DtlsConnection:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end DtlsConnection
