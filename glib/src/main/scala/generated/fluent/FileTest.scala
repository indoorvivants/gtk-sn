package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GFileTest

/** A test to perform on a file using g_file_test().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FileTest private (val raw: GFileTest):
  def is(kv: FileTest): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[FileTest.KnownValue]
    FileTest.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"FileTest(${sb.result().mkString(", ")})"
end FileTest

object FileTest:
  export KnownValue.*

  def fromRaw(raw: GFileTest) = new FileTest(raw)

  extension (af: FileTest)
    def &(other: FileTest) =
      FileTest(af.raw & other.raw)
    def |(other: FileTest) =
      FileTest(af.raw | other.raw)

  /** A test to perform on a file using g_file_test().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GFileTest, name: String)
      extends FileTest(raw):
    override def toString(): String = this.name

    /** %TRUE if the file is a regular file (not a directory). Note that this
      * test will also return %TRUE if the tested file is a symlink to a regular
      * file.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case IS_REGULAR
        extends KnownValue(GFileTest.G_FILE_TEST_IS_REGULAR, "IS_REGULAR")

    /** %TRUE if the file is a symlink.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case IS_SYMLINK
        extends KnownValue(GFileTest.G_FILE_TEST_IS_SYMLINK, "IS_SYMLINK")

    /** %TRUE if the file is a directory.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case IS_DIR extends KnownValue(GFileTest.G_FILE_TEST_IS_DIR, "IS_DIR")

    /** %TRUE if the file is executable.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case IS_EXECUTABLE
        extends KnownValue(GFileTest.G_FILE_TEST_IS_EXECUTABLE, "IS_EXECUTABLE")

    /** %TRUE if the file exists. It may or may not be a regular file.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case EXISTS extends KnownValue(GFileTest.G_FILE_TEST_EXISTS, "EXISTS")
  end KnownValue
end FileTest
