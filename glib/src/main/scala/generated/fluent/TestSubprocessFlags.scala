package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GTestSubprocessFlags

/** Flags to pass to g_test_trap_subprocess() to control input and output.
  *
  * Note that in contrast with g_test_trap_fork(), the default is to not show
  * stdout and stderr.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TestSubprocessFlags private (val raw: GTestSubprocessFlags):
  def is(kv: TestSubprocessFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[TestSubprocessFlags.KnownValue]
    TestSubprocessFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"TestSubprocessFlags(${sb.result().mkString(", ")})"
end TestSubprocessFlags

object TestSubprocessFlags:
  export KnownValue.*

  def fromRaw(raw: GTestSubprocessFlags) = new TestSubprocessFlags(raw)

  extension (af: TestSubprocessFlags)
    def &(other: TestSubprocessFlags) =
      TestSubprocessFlags(af.raw & other.raw)
    def |(other: TestSubprocessFlags) =
      TestSubprocessFlags(af.raw | other.raw)

  /** Flags to pass to g_test_trap_subprocess() to control input and output.
    *
    * Note that in contrast with g_test_trap_fork(), the default is to not show
    * stdout and stderr.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GTestSubprocessFlags, name: String)
      extends TestSubprocessFlags(raw):
    override def toString(): String = this.name

    /** Default behaviour. Since: 2.74
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DEFAULT
        extends KnownValue(
          GTestSubprocessFlags.G_TEST_SUBPROCESS_DEFAULT,
          "DEFAULT"
        )

    /** If this flag is given, the child process will inherit the parent's
      * stdin. Otherwise, the child's stdin is redirected to `/dev/null`.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case INHERIT_STDIN
        extends KnownValue(
          GTestSubprocessFlags.G_TEST_SUBPROCESS_INHERIT_STDIN,
          "INHERIT_STDIN"
        )

    /** If this flag is given, the child process will inherit the parent's
      * stdout. Otherwise, the child's stdout will not be visible, but it will
      * be captured to allow later tests with g_test_trap_assert_stdout().
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case INHERIT_STDOUT
        extends KnownValue(
          GTestSubprocessFlags.G_TEST_SUBPROCESS_INHERIT_STDOUT,
          "INHERIT_STDOUT"
        )

    /** If this flag is given, the child process will inherit the parent's
      * stderr. Otherwise, the child's stderr will not be visible, but it will
      * be captured to allow later tests with g_test_trap_assert_stderr().
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case INHERIT_STDERR
        extends KnownValue(
          GTestSubprocessFlags.G_TEST_SUBPROCESS_INHERIT_STDERR,
          "INHERIT_STDERR"
        )
  end KnownValue
end TestSubprocessFlags
