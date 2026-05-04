package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GConverterFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags used when calling a g_converter_convert().
  */
class ConverterFlags private (val raw: GConverterFlags):
  def is(kv: ConverterFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[ConverterFlags.KnownValue]
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags used when calling a g_converter_convert().
    */
  enum KnownValue(override val raw: GConverterFlags, name: String)
      extends ConverterFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags.
      */
    case NONE extends KnownValue(GConverterFlags.G_CONVERTER_NO_FLAGS, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * At end of input data
      */
    case INPUT_AT_END
        extends KnownValue(
          GConverterFlags.G_CONVERTER_INPUT_AT_END,
          "INPUT_AT_END"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Flush data
      */
    case FLUSH extends KnownValue(GConverterFlags.G_CONVERTER_FLUSH, "FLUSH")
  end KnownValue
end ConverterFlags
