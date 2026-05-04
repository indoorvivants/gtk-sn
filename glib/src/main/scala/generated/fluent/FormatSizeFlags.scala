package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GFormatSizeFlags

/** Flags to modify the format of the string returned by g_format_size_full().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FormatSizeFlags private (val raw: GFormatSizeFlags):
  def is(kv: FormatSizeFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[FormatSizeFlags.KnownValue]
    FormatSizeFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"FormatSizeFlags(${sb.result().mkString(", ")})"
end FormatSizeFlags

object FormatSizeFlags:
  export KnownValue.*

  def fromRaw(raw: GFormatSizeFlags) = new FormatSizeFlags(raw)

  extension (af: FormatSizeFlags)
    def &(other: FormatSizeFlags) =
      FormatSizeFlags(af.raw & other.raw)
    def |(other: FormatSizeFlags) =
      FormatSizeFlags(af.raw | other.raw)

  /** Flags to modify the format of the string returned by g_format_size_full().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GFormatSizeFlags, name: String)
      extends FormatSizeFlags(raw):
    override def toString(): String = this.name

    /** behave the same as g_format_size()
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DEFAULT
        extends KnownValue(GFormatSizeFlags.G_FORMAT_SIZE_DEFAULT, "DEFAULT")

    /** include the exact number of bytes as part of the returned string. For
      * example, "45.6 kB (45,612 bytes)".
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case LONG_FORMAT
        extends KnownValue(
          GFormatSizeFlags.G_FORMAT_SIZE_LONG_FORMAT,
          "LONG_FORMAT"
        )

    /** use IEC (base 1024) units with "KiB"-style suffixes. IEC units should
      * only be used for reporting things with a strong "power of 2" basis, like
      * RAM sizes or RAID stripe sizes. Network and storage sizes should be
      * reported in the normal SI units.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case IEC_UNITS
        extends KnownValue(
          GFormatSizeFlags.G_FORMAT_SIZE_IEC_UNITS,
          "IEC_UNITS"
        )

    /** set the size as a quantity in bits, rather than bytes, and return units
      * in bits. For example, ‘Mb’ rather than ‘MB’.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case BITS extends KnownValue(GFormatSizeFlags.G_FORMAT_SIZE_BITS, "BITS")

    /** return only value, without unit; this should not be used together with @G_FORMAT_SIZE_LONG_FORMAT
      * nor @G_FORMAT_SIZE_ONLY_UNIT. Since: 2.74
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ONLY_VALUE
        extends KnownValue(
          GFormatSizeFlags.G_FORMAT_SIZE_ONLY_VALUE,
          "ONLY_VALUE"
        )

    /** return only unit, without value; this should not be used together with @G_FORMAT_SIZE_LONG_FORMAT
      * nor @G_FORMAT_SIZE_ONLY_VALUE. Since: 2.74
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ONLY_UNIT
        extends KnownValue(
          GFormatSizeFlags.G_FORMAT_SIZE_ONLY_UNIT,
          "ONLY_UNIT"
        )
  end KnownValue
end FormatSizeFlags
