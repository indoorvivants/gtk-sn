package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.TlsDatabase
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.runtime.*

trait TlsBackend:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Gets the #GType of @backend's #GTlsCertificate implementation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCertificateType(): GType /* None */ =
    g_tls_backend_get_certificate_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsBackend]]
    )
  end getCertificateType

  /** Gets the #GType of @backend's #GTlsClientConnection implementation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getClientConnectionType(): GType /* None */ =
    g_tls_backend_get_client_connection_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsBackend]]
    )
  end getClientConnectionType

  /** Gets the default #GTlsDatabase used to verify TLS connections.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefaultDatabase()(using
      Runtime
  ): sn.gnome.gio.fluent.TlsDatabase /* None */ =
    sn.gnome.gio.fluent.TlsDatabase.applyUnsafe(
      g_tls_backend_get_default_database(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsBackend]]
      ).asInstanceOf
    )
  end getDefaultDatabase

  /** Gets the #GType of @backend’s #GDtlsClientConnection implementation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDtlsClientConnectionType(): GType /* None */ =
    g_tls_backend_get_dtls_client_connection_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsBackend]]
    )
  end getDtlsClientConnectionType

  /** Gets the #GType of @backend’s #GDtlsServerConnection implementation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDtlsServerConnectionType(): GType /* None */ =
    g_tls_backend_get_dtls_server_connection_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsBackend]]
    )
  end getDtlsServerConnectionType

  /** Gets the #GType of @backend's #GTlsFileDatabase implementation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFileDatabaseType(): GType /* None */ =
    g_tls_backend_get_file_database_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsBackend]]
    )
  end getFileDatabaseType

  /** Gets the #GType of @backend's #GTlsServerConnection implementation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getServerConnectionType(): GType /* None */ =
    g_tls_backend_get_server_connection_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsBackend]]
    )
  end getServerConnectionType

  /** Set the default #GTlsDatabase used to verify TLS connections
    *
    * Any subsequent call to g_tls_backend_get_default_database() will return
    * the database set in this call. Existing databases and connections are not
    * modified.
    *
    * Setting a %NULL default database will reset to using the system default
    * database as if g_tls_backend_set_default_database() had never been called.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDefaultDatabase(
      database: Option[
        sn.gnome.gio.fluent.TlsDatabase /* Some(Ptr[GTlsDatabase]) */
      ]
  )(using Runtime): Unit /* None */ =
    g_tls_backend_set_default_database(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsBackend]],
      database
        .map[Ptr[GTlsDatabase]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GTlsDatabase]])
    )
  end setDefaultDatabase

  /** Checks if DTLS is supported. DTLS support may not be available even if TLS
    * support is available, and vice-versa.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def supportsDtls(): Boolean /* None */ =
    g_tls_backend_supports_dtls(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsBackend]]
    ).value.!=(0)
  end supportsDtls

  /** Checks if TLS is supported; if this returns %FALSE for the default
    * #GTlsBackend, it means no "real" TLS backend is available.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def supportsTls(): Boolean /* None */ =
    g_tls_backend_supports_tls(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsBackend]]
    ).value.!=(0)
  end supportsTls

end TlsBackend

object TlsBackend:
  class Abstract(raw: Ptr[Byte]) extends TlsBackend:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end TlsBackend
