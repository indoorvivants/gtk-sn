package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GOutputStreamSpliceFlags

/** GOutputStreamSpliceFlags determine how streams should be spliced.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class OutputStreamSpliceFlags private (val raw: GOutputStreamSpliceFlags):
  def is(kv: OutputStreamSpliceFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[OutputStreamSpliceFlags.KnownValue]
    OutputStreamSpliceFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"OutputStreamSpliceFlags(${sb.result().mkString(", ")})"
end OutputStreamSpliceFlags

object OutputStreamSpliceFlags:
  export KnownValue.*

  def fromRaw(raw: GOutputStreamSpliceFlags) = new OutputStreamSpliceFlags(raw)

  extension (af: OutputStreamSpliceFlags)
    def &(other: OutputStreamSpliceFlags) =
      OutputStreamSpliceFlags(af.raw & other.raw)
    def |(other: OutputStreamSpliceFlags) =
      OutputStreamSpliceFlags(af.raw | other.raw)

  /** GOutputStreamSpliceFlags determine how streams should be spliced.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(
      override val raw: GOutputStreamSpliceFlags,
      name: scala.Predef.String
  ) extends OutputStreamSpliceFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** Do not close either stream.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(
          GOutputStreamSpliceFlags.G_OUTPUT_STREAM_SPLICE_NONE,
          "NONE"
        )

    /** Close the source stream after the splice.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CLOSE_SOURCE
        extends KnownValue(
          GOutputStreamSpliceFlags.G_OUTPUT_STREAM_SPLICE_CLOSE_SOURCE,
          "CLOSE_SOURCE"
        )

    /** Close the target stream after the splice.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CLOSE_TARGET
        extends KnownValue(
          GOutputStreamSpliceFlags.G_OUTPUT_STREAM_SPLICE_CLOSE_TARGET,
          "CLOSE_TARGET"
        )
  end KnownValue
end OutputStreamSpliceFlags
