package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GIOFlags

/** Specifies properties of a #GIOChannel. Some of the flags can only be read
  * with g_io_channel_get_flags(), but not changed with
  * g_io_channel_set_flags().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class IOFlags private (val raw: GIOFlags):
  def is(kv: IOFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[IOFlags.KnownValue]
    IOFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"IOFlags(${sb.result().mkString(", ")})"
end IOFlags

object IOFlags:
  export KnownValue.*

  def fromRaw(raw: GIOFlags) = new IOFlags(raw)

  extension (af: IOFlags)
    def &(other: IOFlags) =
      IOFlags(af.raw & other.raw)
    def |(other: IOFlags) =
      IOFlags(af.raw | other.raw)

  /** Specifies properties of a #GIOChannel. Some of the flags can only be read
    * with g_io_channel_get_flags(), but not changed with
    * g_io_channel_set_flags().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GIOFlags, name: String)
      extends IOFlags(raw):
    override def toString(): String = this.name

    /** no special flags set. Since: 2.74
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE extends KnownValue(GIOFlags.G_IO_FLAG_NONE, "NONE")

    /** turns on append mode, corresponds to %O_APPEND (see the documentation of
      * the UNIX open() syscall)
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case APPEND extends KnownValue(GIOFlags.G_IO_FLAG_APPEND, "APPEND")

    /** turns on nonblocking mode, corresponds to %O_NONBLOCK/%O_NDELAY (see the
      * documentation of the UNIX open() syscall)
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONBLOCK extends KnownValue(GIOFlags.G_IO_FLAG_NONBLOCK, "NONBLOCK")

    /** indicates that the io channel is readable. This flag cannot be changed.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case IS_READABLE
        extends KnownValue(GIOFlags.G_IO_FLAG_IS_READABLE, "IS_READABLE")

    /** indicates that the io channel is writable. This flag cannot be changed.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case IS_WRITABLE
        extends KnownValue(GIOFlags.G_IO_FLAG_IS_WRITABLE, "IS_WRITABLE")

    /** a misspelled version of @G_IO_FLAG_IS_WRITABLE that existed before the
      * spelling was fixed in GLib 2.30. It is kept here for compatibility
      * reasons. Deprecated since 2.30
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case IS_WRITEABLE
        extends KnownValue(GIOFlags.G_IO_FLAG_IS_WRITEABLE, "IS_WRITEABLE")

    /** indicates that the io channel is seekable, i.e. that
      * g_io_channel_seek_position() can be used on it. This flag cannot be
      * changed.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case IS_SEEKABLE
        extends KnownValue(GIOFlags.G_IO_FLAG_IS_SEEKABLE, "IS_SEEKABLE")

    /** the mask that specifies all the valid flags.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case MASK extends KnownValue(GIOFlags.G_IO_FLAG_MASK, "MASK")

    /** the mask of the flags that are returned from g_io_channel_get_flags()
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case GET_MASK extends KnownValue(GIOFlags.G_IO_FLAG_GET_MASK, "GET_MASK")

    /** the mask of the flags that the user can modify with
      * g_io_channel_set_flags()
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SET_MASK extends KnownValue(GIOFlags.G_IO_FLAG_SET_MASK, "SET_MASK")
  end KnownValue
end IOFlags
