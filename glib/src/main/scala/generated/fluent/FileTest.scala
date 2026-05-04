package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GFileTest

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A test to perform on a file using g_file_test().
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A test to perform on a file using g_file_test().
    */
  enum KnownValue(override val raw: GFileTest, name: String)
      extends FileTest(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * %TRUE if the file is a regular file (not a directory). Note that this
      * test will also return %TRUE if the tested file is a symlink to a regular
      * file.
      */
    case IS_REGULAR
        extends KnownValue(GFileTest.G_FILE_TEST_IS_REGULAR, "IS_REGULAR")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * %TRUE if the file is a symlink.
      */
    case IS_SYMLINK
        extends KnownValue(GFileTest.G_FILE_TEST_IS_SYMLINK, "IS_SYMLINK")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * %TRUE if the file is a directory.
      */
    case IS_DIR extends KnownValue(GFileTest.G_FILE_TEST_IS_DIR, "IS_DIR")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * %TRUE if the file is executable.
      */
    case IS_EXECUTABLE
        extends KnownValue(GFileTest.G_FILE_TEST_IS_EXECUTABLE, "IS_EXECUTABLE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * %TRUE if the file exists. It may or may not be a regular file.
      */
    case EXISTS extends KnownValue(GFileTest.G_FILE_TEST_EXISTS, "EXISTS")
  end KnownValue
end FileTest
