package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GIOStreamSpliceFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * GIOStreamSpliceFlags determine how streams should be spliced.
  */
class IOStreamSpliceFlags private (val raw: GIOStreamSpliceFlags):
  def is(kv: IOStreamSpliceFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[IOStreamSpliceFlags.KnownValue]
    IOStreamSpliceFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"IOStreamSpliceFlags(${sb.result().mkString(", ")})"
end IOStreamSpliceFlags

object IOStreamSpliceFlags:
  export KnownValue.*

  def fromRaw(raw: GIOStreamSpliceFlags) = new IOStreamSpliceFlags(raw)

  extension (af: IOStreamSpliceFlags)
    def &(other: IOStreamSpliceFlags) =
      IOStreamSpliceFlags(af.raw & other.raw)
    def |(other: IOStreamSpliceFlags) =
      IOStreamSpliceFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * GIOStreamSpliceFlags determine how streams should be spliced.
    */
  enum KnownValue(override val raw: GIOStreamSpliceFlags, name: String)
      extends IOStreamSpliceFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Do not close either stream.
      */
    case NONE
        extends KnownValue(GIOStreamSpliceFlags.G_IO_STREAM_SPLICE_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Close the first stream after the splice.
      */
    case CLOSE_STREAM1
        extends KnownValue(
          GIOStreamSpliceFlags.G_IO_STREAM_SPLICE_CLOSE_STREAM1,
          "CLOSE_STREAM1"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Close the second stream after the splice.
      */
    case CLOSE_STREAM2
        extends KnownValue(
          GIOStreamSpliceFlags.G_IO_STREAM_SPLICE_CLOSE_STREAM2,
          "CLOSE_STREAM2"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Wait for both splice operations to finish before calling the callback.
      */
    case WAIT_FOR_BOTH
        extends KnownValue(
          GIOStreamSpliceFlags.G_IO_STREAM_SPLICE_WAIT_FOR_BOTH,
          "WAIT_FOR_BOTH"
        )
  end KnownValue
end IOStreamSpliceFlags
