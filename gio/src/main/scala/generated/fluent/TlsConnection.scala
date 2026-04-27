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

class TlsConnection(raw: Ptr[GTlsConnection])
    extends IOStream(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def emitAcceptCertificate(
      peer_cert: TlsCertificate,
      errors: GTlsCertificateFlags
  ): Boolean = g_tls_connection_emit_accept_certificate(
    this.raw.asInstanceOf,
    peer_cert.getUnsafeRawPointer().asInstanceOf,
    errors
  ).value.!=(0)

  def getCertificate(): TlsCertificate = new TlsCertificate(
    g_tls_connection_get_certificate(this.raw.asInstanceOf).asInstanceOf
  )

  // Method get_channel_binding_data contains an array parameter, which is not supported yet

  def getCiphersuiteName()(using Zone): String = fromCString(
    g_tls_connection_get_ciphersuite_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getDatabase(): TlsDatabase = new TlsDatabase(
    g_tls_connection_get_database(this.raw.asInstanceOf).asInstanceOf
  )

  def getInteraction(): TlsInteraction = new TlsInteraction(
    g_tls_connection_get_interaction(this.raw.asInstanceOf).asInstanceOf
  )

  def getNegotiatedProtocol()(using Zone): String = fromCString(
    g_tls_connection_get_negotiated_protocol(this.raw.asInstanceOf).asInstanceOf
  )

  def getPeerCertificate(): TlsCertificate = new TlsCertificate(
    g_tls_connection_get_peer_certificate(this.raw.asInstanceOf).asInstanceOf
  )

  def getPeerCertificateErrors(): GTlsCertificateFlags =
    g_tls_connection_get_peer_certificate_errors(this.raw.asInstanceOf)

  def getProtocolVersion(): GTlsProtocolVersion =
    g_tls_connection_get_protocol_version(this.raw.asInstanceOf)

  def getRehandshakeMode(): GTlsRehandshakeMode =
    g_tls_connection_get_rehandshake_mode(this.raw.asInstanceOf)

  def getRequireCloseNotify(): Boolean =
    g_tls_connection_get_require_close_notify(this.raw.asInstanceOf).value.!=(0)

  def getUseSystemCertdb(): Boolean =
    g_tls_connection_get_use_system_certdb(this.raw.asInstanceOf).value.!=(0)

  def handshake(cancellable: Cancellable): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_tls_connection_handshake(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def handshakeAsync(
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_tls_connection_handshake_async(
    this.raw.asInstanceOf,
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def handshakeFinish(result: AsyncResult): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_tls_connection_handshake_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  // Method set_advertised_protocols contains an array parameter, which is not supported yet

  def setCertificate(certificate: TlsCertificate): Unit =
    g_tls_connection_set_certificate(
      this.raw.asInstanceOf,
      certificate.getUnsafeRawPointer().asInstanceOf
    )

  def setDatabase(database: TlsDatabase): Unit = g_tls_connection_set_database(
    this.raw.asInstanceOf,
    database.getUnsafeRawPointer().asInstanceOf
  )

  def setInteraction(interaction: TlsInteraction): Unit =
    g_tls_connection_set_interaction(
      this.raw.asInstanceOf,
      interaction.getUnsafeRawPointer().asInstanceOf
    )

  def setRehandshakeMode(mode: GTlsRehandshakeMode): Unit =
    g_tls_connection_set_rehandshake_mode(this.raw.asInstanceOf, mode)

  def setRequireCloseNotify(require_close_notify: Boolean): Unit =
    g_tls_connection_set_require_close_notify(
      this.raw.asInstanceOf,
      gboolean(gint((if require_close_notify == true then 1 else 0)))
    )

  def setUseSystemCertdb(use_system_certdb: Boolean): Unit =
    g_tls_connection_set_use_system_certdb(
      this.raw.asInstanceOf,
      gboolean(gint((if use_system_certdb == true then 1 else 0)))
    )

end TlsConnection
