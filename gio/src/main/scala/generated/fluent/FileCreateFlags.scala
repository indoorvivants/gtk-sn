package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GFileCreateFlags

/** Flags used when an operation may create a file.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FileCreateFlags private (val raw: GFileCreateFlags):
  def is(kv: FileCreateFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[FileCreateFlags.KnownValue]
    FileCreateFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"FileCreateFlags(${sb.result().mkString(", ")})"
end FileCreateFlags

object FileCreateFlags:
  export KnownValue.*

  def fromRaw(raw: GFileCreateFlags) = new FileCreateFlags(raw)

  extension (af: FileCreateFlags)
    def &(other: FileCreateFlags) =
      FileCreateFlags(af.raw & other.raw)
    def |(other: FileCreateFlags) =
      FileCreateFlags(af.raw | other.raw)

  /** Flags used when an operation may create a file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GFileCreateFlags, name: String)
      extends FileCreateFlags(raw):
    override def toString(): String = this.name

    /** No flags set.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE extends KnownValue(GFileCreateFlags.G_FILE_CREATE_NONE, "NONE")

    /** Create a file that can only be accessed by the current user.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case PRIVATE
        extends KnownValue(GFileCreateFlags.G_FILE_CREATE_PRIVATE, "PRIVATE")

    /** Replace the destination as if it didn't exist before. Don't try to keep
      * any old permissions, replace instead of following links. This is
      * generally useful if you're doing a "copy over" rather than a "save new
      * version of" replace operation. You can think of it as "unlink
      * destination" before writing to it, although the implementation may not
      * be exactly like that. This flag can only be used with g_file_replace()
      * and its variants, including g_file_replace_contents(). Since 2.20
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case REPLACE_DESTINATION
        extends KnownValue(
          GFileCreateFlags.G_FILE_CREATE_REPLACE_DESTINATION,
          "REPLACE_DESTINATION"
        )
  end KnownValue
end FileCreateFlags
