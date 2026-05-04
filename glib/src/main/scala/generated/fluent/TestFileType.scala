package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GTestFileType

/** The type of file to return the filename for, when used with
  * g_test_build_filename().
  *
  * These two options correspond rather directly to the 'dist' and 'built'
  * terminology that automake uses and are explicitly used to distinguish
  * between the 'srcdir' and 'builddir' being separate. All files in your
  * project should either be dist (in the `EXTRA_DIST` or `dist_schema_DATA`
  * sense, in which case they will always be in the srcdir) or built (in the
  * `BUILT_SOURCES` sense, in which case they will always be in the builddir).
  *
  * Note: as a general rule of automake, files that are generated only as part
  * of the build-from-git process (but then are distributed with the tarball)
  * always go in srcdir (even if doing a srcdir != builddir build from git) and
  * are considered as distributed files.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum TestFileType(val raw: GTestFileType):
  /** a file that was included in the distribution tarball
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DIST extends TestFileType(GTestFileType.G_TEST_DIST)

  /** a file that was built on the compiling machine
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BUILT extends TestFileType(GTestFileType.G_TEST_BUILT)
end TestFileType

object TestFileType:
  def fromRaw(raw: GTestFileType): TestFileType =
    raw match
      case GTestFileType.G_TEST_DIST  => TestFileType.DIST
      case GTestFileType.G_TEST_BUILT => TestFileType.BUILT
  end fromRaw
end TestFileType
