package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GTlsPasswordFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Various flags for the password.
  */
class TlsPasswordFlags private (val raw: GTlsPasswordFlags):
  def is(kv: TlsPasswordFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[TlsPasswordFlags.KnownValue]
    TlsPasswordFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"TlsPasswordFlags(${sb.result().mkString(", ")})"
end TlsPasswordFlags

object TlsPasswordFlags:
  export KnownValue.*

  def fromRaw(raw: GTlsPasswordFlags) = new TlsPasswordFlags(raw)

  extension (af: TlsPasswordFlags)
    def &(other: TlsPasswordFlags) =
      TlsPasswordFlags(af.raw & other.raw)
    def |(other: TlsPasswordFlags) =
      TlsPasswordFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Various flags for the password.
    */
  enum KnownValue(override val raw: GTlsPasswordFlags, name: String)
      extends TlsPasswordFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags
      */
    case NONE extends KnownValue(GTlsPasswordFlags.G_TLS_PASSWORD_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The password was wrong, and the user should retry.
      */
    case RETRY
        extends KnownValue(GTlsPasswordFlags.G_TLS_PASSWORD_RETRY, "RETRY")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Hint to the user that the password has been wrong many times, and the
      * user may not have many chances left.
      */
    case MANY_TRIES
        extends KnownValue(
          GTlsPasswordFlags.G_TLS_PASSWORD_MANY_TRIES,
          "MANY_TRIES"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Hint to the user that this is the last try to get this password right.
      */
    case FINAL_TRY
        extends KnownValue(
          GTlsPasswordFlags.G_TLS_PASSWORD_FINAL_TRY,
          "FINAL_TRY"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * For PKCS #11, the user PIN is required. Since: 2.70.
      */
    case PKCS11_USER
        extends KnownValue(
          GTlsPasswordFlags.G_TLS_PASSWORD_PKCS11_USER,
          "PKCS11_USER"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * For PKCS #11, the security officer PIN is required. Since: 2.70.
      */
    case PKCS11_SECURITY_OFFICER
        extends KnownValue(
          GTlsPasswordFlags.G_TLS_PASSWORD_PKCS11_SECURITY_OFFICER,
          "PKCS11_SECURITY_OFFICER"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * For PKCS #11, the context-specific PIN is required. Since: 2.70.
      */
    case PKCS11_CONTEXT_SPECIFIC
        extends KnownValue(
          GTlsPasswordFlags.G_TLS_PASSWORD_PKCS11_CONTEXT_SPECIFIC,
          "PKCS11_CONTEXT_SPECIFIC"
        )
  end KnownValue
end TlsPasswordFlags
