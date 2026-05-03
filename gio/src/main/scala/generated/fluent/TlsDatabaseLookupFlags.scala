package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GTlsDatabaseLookupFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags for g_tls_database_lookup_certificate_for_handle(),
  * g_tls_database_lookup_certificate_issuer(), and
  * g_tls_database_lookup_certificates_issued_by().
  */
enum TlsDatabaseLookupFlags(val raw: GTlsDatabaseLookupFlags):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No lookup flags
    */
  case NONE
      extends TlsDatabaseLookupFlags(
        GTlsDatabaseLookupFlags.G_TLS_DATABASE_LOOKUP_NONE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Restrict lookup to certificates that have a private key.
    */
  case KEYPAIR
      extends TlsDatabaseLookupFlags(
        GTlsDatabaseLookupFlags.G_TLS_DATABASE_LOOKUP_KEYPAIR
      )
end TlsDatabaseLookupFlags

object TlsDatabaseLookupFlags:
  def fromRaw(raw: GTlsDatabaseLookupFlags): TlsDatabaseLookupFlags =
    raw match
      case GTlsDatabaseLookupFlags.G_TLS_DATABASE_LOOKUP_NONE =>
        TlsDatabaseLookupFlags.NONE
      case GTlsDatabaseLookupFlags.G_TLS_DATABASE_LOOKUP_KEYPAIR =>
        TlsDatabaseLookupFlags.KEYPAIR
  end fromRaw
end TlsDatabaseLookupFlags
