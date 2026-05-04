package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GIOFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Specifies properties of a #GIOChannel. Some of the flags can only be read
  * with g_io_channel_get_flags(), but not changed with
  * g_io_channel_set_flags().
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Specifies properties of a #GIOChannel. Some of the flags can only be read
    * with g_io_channel_get_flags(), but not changed with
    * g_io_channel_set_flags().
    */
  enum KnownValue(override val raw: GIOFlags, name: String)
      extends IOFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * no special flags set. Since: 2.74
      */
    case NONE extends KnownValue(GIOFlags.G_IO_FLAG_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * turns on append mode, corresponds to %O_APPEND (see the documentation of
      * the UNIX open() syscall)
      */
    case APPEND extends KnownValue(GIOFlags.G_IO_FLAG_APPEND, "APPEND")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * turns on nonblocking mode, corresponds to %O_NONBLOCK/%O_NDELAY (see the
      * documentation of the UNIX open() syscall)
      */
    case NONBLOCK extends KnownValue(GIOFlags.G_IO_FLAG_NONBLOCK, "NONBLOCK")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * indicates that the io channel is readable. This flag cannot be changed.
      */
    case IS_READABLE
        extends KnownValue(GIOFlags.G_IO_FLAG_IS_READABLE, "IS_READABLE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * indicates that the io channel is writable. This flag cannot be changed.
      */
    case IS_WRITABLE
        extends KnownValue(GIOFlags.G_IO_FLAG_IS_WRITABLE, "IS_WRITABLE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * a misspelled version of @G_IO_FLAG_IS_WRITABLE that existed before the
      * spelling was fixed in GLib 2.30. It is kept here for compatibility
      * reasons. Deprecated since 2.30
      */
    case IS_WRITEABLE
        extends KnownValue(GIOFlags.G_IO_FLAG_IS_WRITEABLE, "IS_WRITEABLE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * indicates that the io channel is seekable, i.e. that
      * g_io_channel_seek_position() can be used on it. This flag cannot be
      * changed.
      */
    case IS_SEEKABLE
        extends KnownValue(GIOFlags.G_IO_FLAG_IS_SEEKABLE, "IS_SEEKABLE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the mask that specifies all the valid flags.
      */
    case MASK extends KnownValue(GIOFlags.G_IO_FLAG_MASK, "MASK")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the mask of the flags that are returned from g_io_channel_get_flags()
      */
    case GET_MASK extends KnownValue(GIOFlags.G_IO_FLAG_GET_MASK, "GET_MASK")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the mask of the flags that the user can modify with
      * g_io_channel_set_flags()
      */
    case SET_MASK extends KnownValue(GIOFlags.G_IO_FLAG_SET_MASK, "SET_MASK")
  end KnownValue
end IOFlags
