package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GTlsDatabaseVerifyFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags for g_tls_database_verify_chain().
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags for g_tls_database_verify_chain().
    */
  enum KnownValue(override val raw: GTlsDatabaseVerifyFlags, name: String)
      extends TlsDatabaseVerifyFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No verification flags
      */
    case NONE
        extends KnownValue(
          GTlsDatabaseVerifyFlags.G_TLS_DATABASE_VERIFY_NONE,
          "NONE"
        )
  end KnownValue
end TlsDatabaseVerifyFlags
