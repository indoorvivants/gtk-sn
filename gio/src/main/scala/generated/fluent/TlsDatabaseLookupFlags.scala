package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GTlsDatabaseLookupFlags

/** Flags for g_tls_database_lookup_certificate_for_handle(),
  * g_tls_database_lookup_certificate_issuer(), and
  * g_tls_database_lookup_certificates_issued_by().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum TlsDatabaseLookupFlags(val raw: GTlsDatabaseLookupFlags):
  /** No lookup flags
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE
      extends TlsDatabaseLookupFlags(
        GTlsDatabaseLookupFlags.G_TLS_DATABASE_LOOKUP_NONE
      )

  /** Restrict lookup to certificates that have a private key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
