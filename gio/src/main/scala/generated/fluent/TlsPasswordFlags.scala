package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GTlsPasswordFlags

/** Various flags for the password.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TlsPasswordFlags private (val raw: GTlsPasswordFlags):
  def is(kv: TlsPasswordFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[TlsPasswordFlags.KnownValue]
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

  /** Various flags for the password.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(
      override val raw: GTlsPasswordFlags,
      name: scala.Predef.String
  ) extends TlsPasswordFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** No flags
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE extends KnownValue(GTlsPasswordFlags.G_TLS_PASSWORD_NONE, "NONE")

    /** The password was wrong, and the user should retry.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case RETRY
        extends KnownValue(GTlsPasswordFlags.G_TLS_PASSWORD_RETRY, "RETRY")

    /** Hint to the user that the password has been wrong many times, and the
      * user may not have many chances left.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case MANY_TRIES
        extends KnownValue(
          GTlsPasswordFlags.G_TLS_PASSWORD_MANY_TRIES,
          "MANY_TRIES"
        )

    /** Hint to the user that this is the last try to get this password right.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FINAL_TRY
        extends KnownValue(
          GTlsPasswordFlags.G_TLS_PASSWORD_FINAL_TRY,
          "FINAL_TRY"
        )

    /** For PKCS #11, the user PIN is required. Since: 2.70.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case PKCS11_USER
        extends KnownValue(
          GTlsPasswordFlags.G_TLS_PASSWORD_PKCS11_USER,
          "PKCS11_USER"
        )

    /** For PKCS #11, the security officer PIN is required. Since: 2.70.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case PKCS11_SECURITY_OFFICER
        extends KnownValue(
          GTlsPasswordFlags.G_TLS_PASSWORD_PKCS11_SECURITY_OFFICER,
          "PKCS11_SECURITY_OFFICER"
        )

    /** For PKCS #11, the context-specific PIN is required. Since: 2.70.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case PKCS11_CONTEXT_SPECIFIC
        extends KnownValue(
          GTlsPasswordFlags.G_TLS_PASSWORD_PKCS11_CONTEXT_SPECIFIC,
          "PKCS11_CONTEXT_SPECIFIC"
        )
  end KnownValue
end TlsPasswordFlags
