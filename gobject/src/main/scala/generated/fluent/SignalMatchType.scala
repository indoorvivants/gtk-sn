package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.GSignalMatchType

/** The match types specify what g_signal_handlers_block_matched(),
  * g_signal_handlers_unblock_matched() and
  * g_signal_handlers_disconnect_matched() match signals by.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
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

  /** The match types specify what g_signal_handlers_block_matched(),
    * g_signal_handlers_unblock_matched() and
    * g_signal_handlers_disconnect_matched() match signals by.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GSignalMatchType, name: String)
      extends SignalMatchType(raw):
    override def toString(): String = this.name

    /** The signal id must be equal.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ID extends KnownValue(GSignalMatchType.G_SIGNAL_MATCH_ID, "ID")

    /** The signal detail must be equal.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DETAIL
        extends KnownValue(GSignalMatchType.G_SIGNAL_MATCH_DETAIL, "DETAIL")

    /** The closure must be the same.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CLOSURE
        extends KnownValue(GSignalMatchType.G_SIGNAL_MATCH_CLOSURE, "CLOSURE")

    /** The C closure callback must be the same.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FUNC extends KnownValue(GSignalMatchType.G_SIGNAL_MATCH_FUNC, "FUNC")

    /** The closure data must be the same.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DATA extends KnownValue(GSignalMatchType.G_SIGNAL_MATCH_DATA, "DATA")

    /** Only unblocked signals may be matched.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case UNBLOCKED
        extends KnownValue(
          GSignalMatchType.G_SIGNAL_MATCH_UNBLOCKED,
          "UNBLOCKED"
        )
  end KnownValue
end SignalMatchType
