package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.SocketConnectable
import sn.gnome.gio.fluent.TlsCertificate
import sn.gnome.gio.internal.GTlsCertificate
import sn.gnome.gio.internal.GTlsCertificateFlags
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GDateTime
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gsize
import sn.gnome.glib.internal.gssize
import sn.gnome.glib.internal.guint8
import sn.gnome.gobject.fluent.Object

class TlsCertificate(raw: Ptr[GTlsCertificate])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getIssuer(): TlsCertificate = new TlsCertificate(
    g_tls_certificate_get_issuer(this.raw.asInstanceOf).asInstanceOf
  )

  def getIssuerName()(using Zone): String = fromCString(
    g_tls_certificate_get_issuer_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getNotValidAfter(): Ptr[GDateTime] =
    g_tls_certificate_get_not_valid_after(this.raw.asInstanceOf)

  def getNotValidBefore(): Ptr[GDateTime] =
    g_tls_certificate_get_not_valid_before(this.raw.asInstanceOf)

  def getSubjectName()(using Zone): String = fromCString(
    g_tls_certificate_get_subject_name(this.raw.asInstanceOf).asInstanceOf
  )

  def isSame(cert_two: TlsCertificate): Boolean = g_tls_certificate_is_same(
    this.raw.asInstanceOf,
    cert_two.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def verify(
      identity: SocketConnectable,
      trusted_ca: TlsCertificate
  ): GTlsCertificateFlags = g_tls_certificate_verify(
    this.raw.asInstanceOf,
    identity.getUnsafeRawPointer().asInstanceOf,
    trusted_ca.getUnsafeRawPointer().asInstanceOf
  )

end TlsCertificate

object TlsCertificate:
  def fromFile(file: String | CString)(using Zone): GResult[TlsCertificate] =
    GResult.wrap(__errorPtr =>
      new TlsCertificate(
        g_tls_certificate_new_from_file(
          __sn_extract_string(file).asInstanceOf[Ptr[gchar]],
          __errorPtr
        ).asInstanceOf
      )
    )
  def fromFileWithPassword(file: String | CString, password: String | CString)(
      using Zone
  ): GResult[TlsCertificate] = GResult.wrap(__errorPtr =>
    new TlsCertificate(
      g_tls_certificate_new_from_file_with_password(
        __sn_extract_string(file).asInstanceOf[Ptr[gchar]],
        __sn_extract_string(password).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).asInstanceOf
    )
  )
  def fromFiles(cert_file: String | CString, key_file: String | CString)(using
      Zone
  ): GResult[TlsCertificate] = GResult.wrap(__errorPtr =>
    new TlsCertificate(
      g_tls_certificate_new_from_files(
        __sn_extract_string(cert_file).asInstanceOf[Ptr[gchar]],
        __sn_extract_string(key_file).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).asInstanceOf
    )
  )
  def fromPem(data: String | CString, length: CLongInt)(using
      Zone
  ): GResult[TlsCertificate] = GResult.wrap(__errorPtr =>
    new TlsCertificate(
      g_tls_certificate_new_from_pem(
        __sn_extract_string(data).asInstanceOf[Ptr[gchar]],
        gssize(length),
        __errorPtr
      ).asInstanceOf
    )
  )
  def fromPkcs11Uris(
      pkcs11_uri: String | CString,
      private_key_pkcs11_uri: String | CString
  )(using Zone): GResult[TlsCertificate] = GResult.wrap(__errorPtr =>
    new TlsCertificate(
      g_tls_certificate_new_from_pkcs11_uris(
        __sn_extract_string(pkcs11_uri).asInstanceOf[Ptr[gchar]],
        __sn_extract_string(private_key_pkcs11_uri).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).asInstanceOf
    )
  )
  def fromPkcs12(
      data: Ptr[guint8],
      length: CUnsignedLongInt,
      password: String | CString
  )(using Zone): GResult[TlsCertificate] = GResult.wrap(__errorPtr =>
    new TlsCertificate(
      g_tls_certificate_new_from_pkcs12(
        data.asInstanceOf,
        gsize(length),
        __sn_extract_string(password).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).asInstanceOf
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
end TlsCertificate
