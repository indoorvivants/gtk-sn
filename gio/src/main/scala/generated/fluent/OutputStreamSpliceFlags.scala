package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GOutputStreamSpliceFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * GOutputStreamSpliceFlags determine how streams should be spliced.
  */
class OutputStreamSpliceFlags private (val raw: GOutputStreamSpliceFlags):
  def is(kv: OutputStreamSpliceFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[OutputStreamSpliceFlags.KnownValue]
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * GOutputStreamSpliceFlags determine how streams should be spliced.
    */
  enum KnownValue(override val raw: GOutputStreamSpliceFlags, name: String)
      extends OutputStreamSpliceFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Do not close either stream.
      */
    case NONE
        extends KnownValue(
          GOutputStreamSpliceFlags.G_OUTPUT_STREAM_SPLICE_NONE,
          "NONE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Close the source stream after the splice.
      */
    case CLOSE_SOURCE
        extends KnownValue(
          GOutputStreamSpliceFlags.G_OUTPUT_STREAM_SPLICE_CLOSE_SOURCE,
          "CLOSE_SOURCE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Close the target stream after the splice.
      */
    case CLOSE_TARGET
        extends KnownValue(
          GOutputStreamSpliceFlags.G_OUTPUT_STREAM_SPLICE_CLOSE_TARGET,
          "CLOSE_TARGET"
        )
  end KnownValue
end OutputStreamSpliceFlags
