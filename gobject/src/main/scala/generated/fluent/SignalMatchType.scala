package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.GSignalMatchType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The match types specify what g_signal_handlers_block_matched(),
  * g_signal_handlers_unblock_matched() and
  * g_signal_handlers_disconnect_matched() match signals by.
  */
class SignalMatchType private (val raw: GSignalMatchType):
  def is(kv: SignalMatchType): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[SignalMatchType.KnownValue]
    SignalMatchType.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"SignalMatchType(${sb.result().mkString(", ")})"
end SignalMatchType

object SignalMatchType:
  export KnownValue.*

  def fromRaw(raw: GSignalMatchType) = new SignalMatchType(raw)

  extension (af: SignalMatchType)
    def &(other: SignalMatchType) =
      SignalMatchType(af.raw & other.raw)
    def |(other: SignalMatchType) =
      SignalMatchType(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The match types specify what g_signal_handlers_block_matched(),
    * g_signal_handlers_unblock_matched() and
    * g_signal_handlers_disconnect_matched() match signals by.
    */
  enum KnownValue(override val raw: GSignalMatchType, name: String)
      extends SignalMatchType(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The signal id must be equal.
      */
    case ID extends KnownValue(GSignalMatchType.G_SIGNAL_MATCH_ID, "ID")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The signal detail must be equal.
      */
    case DETAIL
        extends KnownValue(GSignalMatchType.G_SIGNAL_MATCH_DETAIL, "DETAIL")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The closure must be the same.
      */
    case CLOSURE
        extends KnownValue(GSignalMatchType.G_SIGNAL_MATCH_CLOSURE, "CLOSURE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The C closure callback must be the same.
      */
    case FUNC extends KnownValue(GSignalMatchType.G_SIGNAL_MATCH_FUNC, "FUNC")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The closure data must be the same.
      */
    case DATA extends KnownValue(GSignalMatchType.G_SIGNAL_MATCH_DATA, "DATA")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Only unblocked signals may be matched.
      */
    case UNBLOCKED
        extends KnownValue(
          GSignalMatchType.G_SIGNAL_MATCH_UNBLOCKED,
          "UNBLOCKED"
        )
  end KnownValue
end SignalMatchType
