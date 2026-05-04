package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GFileAttributeInfoFlags

/** Flags specifying the behaviour of an attribute.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FileAttributeInfoFlags private (val raw: GFileAttributeInfoFlags):
  def is(kv: FileAttributeInfoFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[FileAttributeInfoFlags.KnownValue]
    FileAttributeInfoFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"FileAttributeInfoFlags(${sb.result().mkString(", ")})"
end FileAttributeInfoFlags

object FileAttributeInfoFlags:
  export KnownValue.*

  def fromRaw(raw: GFileAttributeInfoFlags) = new FileAttributeInfoFlags(raw)

  extension (af: FileAttributeInfoFlags)
    def &(other: FileAttributeInfoFlags) =
      FileAttributeInfoFlags(af.raw & other.raw)
    def |(other: FileAttributeInfoFlags) =
      FileAttributeInfoFlags(af.raw | other.raw)

  /** Flags specifying the behaviour of an attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GFileAttributeInfoFlags, name: String)
      extends FileAttributeInfoFlags(raw):
    override def toString(): String = this.name

    /** no flags set.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(
          GFileAttributeInfoFlags.G_FILE_ATTRIBUTE_INFO_NONE,
          "NONE"
        )

    /** copy the attribute values when the file is copied.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case COPY_WITH_FILE
        extends KnownValue(
          GFileAttributeInfoFlags.G_FILE_ATTRIBUTE_INFO_COPY_WITH_FILE,
          "COPY_WITH_FILE"
        )

    /** copy the attribute values when the file is moved.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case COPY_WHEN_MOVED
        extends KnownValue(
          GFileAttributeInfoFlags.G_FILE_ATTRIBUTE_INFO_COPY_WHEN_MOVED,
          "COPY_WHEN_MOVED"
        )
  end KnownValue
end FileAttributeInfoFlags
