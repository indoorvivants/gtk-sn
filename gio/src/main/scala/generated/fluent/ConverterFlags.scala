package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GConverterFlags

/** Flags used when calling a g_converter_convert().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ConverterFlags private (val raw: GConverterFlags):
  def is(kv: ConverterFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[ConverterFlags.KnownValue]
    ConverterFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"ConverterFlags(${sb.result().mkString(", ")})"
end ConverterFlags

object ConverterFlags:
  export KnownValue.*

  def fromRaw(raw: GConverterFlags) = new ConverterFlags(raw)

  extension (af: ConverterFlags)
    def &(other: ConverterFlags) =
      ConverterFlags(af.raw & other.raw)
    def |(other: ConverterFlags) =
      ConverterFlags(af.raw | other.raw)

  /** Flags used when calling a g_converter_convert().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GConverterFlags, name: scala.Predef.String)
      extends ConverterFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** No flags.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE extends KnownValue(GConverterFlags.G_CONVERTER_NO_FLAGS, "NONE")

    /** At end of input data
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case INPUT_AT_END
        extends KnownValue(
          GConverterFlags.G_CONVERTER_INPUT_AT_END,
          "INPUT_AT_END"
        )

    /** Flush data
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FLUSH extends KnownValue(GConverterFlags.G_CONVERTER_FLUSH, "FLUSH")
  end KnownValue
end ConverterFlags
