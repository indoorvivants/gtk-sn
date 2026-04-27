package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.SocketConnectable
import sn.gnome.gio.fluent.TlsCertificate
import sn.gnome.gio.fluent.TlsInteraction
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GTlsCertificateFlags
import sn.gnome.gio.internal.GTlsDatabase
import sn.gnome.gio.internal.GTlsDatabaseLookupFlags
import sn.gnome.gio.internal.GTlsDatabaseVerifyFlags
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GList
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

class TlsDatabase(raw: Ptr[GTlsDatabase]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def createCertificateHandle(certificate: TlsCertificate)(using Zone): String =
    fromCString(
      g_tls_database_create_certificate_handle(
        this.raw.asInstanceOf,
        certificate.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

  def lookupCertificateForHandle(
      handle: String | CString,
      interaction: TlsInteraction,
      flags: GTlsDatabaseLookupFlags,
      cancellable: Cancellable
  )(using Zone): GResult[TlsCertificate] = GResult.wrap(__errorPtr =>
    new TlsCertificate(
      g_tls_database_lookup_certificate_for_handle(
        this.raw.asInstanceOf,
        __sn_extract_string(handle).asInstanceOf[Ptr[gchar]],
        interaction.getUnsafeRawPointer().asInstanceOf,
        flags,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  def lookupCertificateForHandleAsync(
      handle: String | CString,
      interaction: TlsInteraction,
      flags: GTlsDatabaseLookupFlags,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = g_tls_database_lookup_certificate_for_handle_async(
    this.raw.asInstanceOf,
    __sn_extract_string(handle).asInstanceOf[Ptr[gchar]],
    interaction.getUnsafeRawPointer().asInstanceOf,
    flags,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def lookupCertificateForHandleFinish(
      result: AsyncResult
  ): GResult[TlsCertificate] = GResult.wrap(__errorPtr =>
    new TlsCertificate(
      g_tls_database_lookup_certificate_for_handle_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  def lookupCertificateIssuer(
      certificate: TlsCertificate,
      interaction: TlsInteraction,
      flags: GTlsDatabaseLookupFlags,
      cancellable: Cancellable
  ): GResult[TlsCertificate] = GResult.wrap(__errorPtr =>
    new TlsCertificate(
      g_tls_database_lookup_certificate_issuer(
        this.raw.asInstanceOf,
        certificate.getUnsafeRawPointer().asInstanceOf,
        interaction.getUnsafeRawPointer().asInstanceOf,
        flags,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  def lookupCertificateIssuerAsync(
      certificate: TlsCertificate,
      interaction: TlsInteraction,
      flags: GTlsDatabaseLookupFlags,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_tls_database_lookup_certificate_issuer_async(
    this.raw.asInstanceOf,
    certificate.getUnsafeRawPointer().asInstanceOf,
    interaction.getUnsafeRawPointer().asInstanceOf,
    flags,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def lookupCertificateIssuerFinish(
      result: AsyncResult
  ): GResult[TlsCertificate] = GResult.wrap(__errorPtr =>
    new TlsCertificate(
      g_tls_database_lookup_certificate_issuer_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  // Method lookup_certificates_issued_by contains an array parameter, which is not supported yet

  // Method lookup_certificates_issued_by_async contains an array parameter, which is not supported yet

  def lookupCertificatesIssuedByFinish(
      result: AsyncResult
  ): GResult[Ptr[GList]] = GResult.wrap(__errorPtr =>
    g_tls_database_lookup_certificates_issued_by_finish(
      this.raw.asInstanceOf,
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  def verifyChain(
      chain: TlsCertificate,
      purpose: String | CString,
      identity: SocketConnectable,
      interaction: TlsInteraction,
      flags: GTlsDatabaseVerifyFlags,
      cancellable: Cancellable
  )(using Zone): GResult[GTlsCertificateFlags] = GResult.wrap(__errorPtr =>
    g_tls_database_verify_chain(
      this.raw.asInstanceOf,
      chain.getUnsafeRawPointer().asInstanceOf,
      __sn_extract_string(purpose).asInstanceOf[Ptr[gchar]],
      identity.getUnsafeRawPointer().asInstanceOf,
      interaction.getUnsafeRawPointer().asInstanceOf,
      flags,
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  def verifyChainAsync(
      chain: TlsCertificate,
      purpose: String | CString,
      identity: SocketConnectable,
      interaction: TlsInteraction,
      flags: GTlsDatabaseVerifyFlags,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = g_tls_database_verify_chain_async(
    this.raw.asInstanceOf,
    chain.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(purpose).asInstanceOf[Ptr[gchar]],
    identity.getUnsafeRawPointer().asInstanceOf,
    interaction.getUnsafeRawPointer().asInstanceOf,
    flags,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def verifyChainFinish(result: AsyncResult): GResult[GTlsCertificateFlags] =
    GResult.wrap(__errorPtr =>
      g_tls_database_verify_chain_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      )
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end TlsDatabase
