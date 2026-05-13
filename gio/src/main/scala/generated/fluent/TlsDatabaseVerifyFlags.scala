package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GTlsDatabaseVerifyFlags

/** Flags for g_tls_database_verify_chain().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TlsDatabaseVerifyFlags private (val raw: GTlsDatabaseVerifyFlags):
  def is(kv: TlsDatabaseVerifyFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[TlsDatabaseVerifyFlags.KnownValue]
    TlsDatabaseVerifyFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"TlsDatabaseVerifyFlags(${sb.result().mkString(", ")})"
end TlsDatabaseVerifyFlags

object TlsDatabaseVerifyFlags:
  export KnownValue.*

  def fromRaw(raw: GTlsDatabaseVerifyFlags) = new TlsDatabaseVerifyFlags(raw)

  extension (af: TlsDatabaseVerifyFlags)
    def &(other: TlsDatabaseVerifyFlags) =
      TlsDatabaseVerifyFlags(af.raw & other.raw)
    def |(other: TlsDatabaseVerifyFlags) =
      TlsDatabaseVerifyFlags(af.raw | other.raw)

  /** Flags for g_tls_database_verify_chain().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GTlsDatabaseVerifyFlags, name: String)
      extends TlsDatabaseVerifyFlags(raw):
    override def toString(): String = this.name

    /** No verification flags
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(
          GTlsDatabaseVerifyFlags.G_TLS_DATABASE_VERIFY_NONE,
          "NONE"
        )
  end KnownValue
end TlsDatabaseVerifyFlags
