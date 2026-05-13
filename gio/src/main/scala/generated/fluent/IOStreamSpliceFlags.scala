package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GIOStreamSpliceFlags

/** GIOStreamSpliceFlags determine how streams should be spliced.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
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

  /** GIOStreamSpliceFlags determine how streams should be spliced.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GIOStreamSpliceFlags, name: String)
      extends IOStreamSpliceFlags(raw):
    override def toString(): String = this.name

    /** Do not close either stream.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(GIOStreamSpliceFlags.G_IO_STREAM_SPLICE_NONE, "NONE")

    /** Close the first stream after the splice.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CLOSE_STREAM1
        extends KnownValue(
          GIOStreamSpliceFlags.G_IO_STREAM_SPLICE_CLOSE_STREAM1,
          "CLOSE_STREAM1"
        )

    /** Close the second stream after the splice.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CLOSE_STREAM2
        extends KnownValue(
          GIOStreamSpliceFlags.G_IO_STREAM_SPLICE_CLOSE_STREAM2,
          "CLOSE_STREAM2"
        )

    /** Wait for both splice operations to finish before calling the callback.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case WAIT_FOR_BOTH
        extends KnownValue(
          GIOStreamSpliceFlags.G_IO_STREAM_SPLICE_WAIT_FOR_BOTH,
          "WAIT_FOR_BOTH"
        )
  end KnownValue
end IOStreamSpliceFlags
