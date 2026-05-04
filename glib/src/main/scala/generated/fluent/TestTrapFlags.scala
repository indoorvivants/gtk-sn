package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GTestTrapFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Test traps are guards around forked tests. These flags determine what traps
  * to set.
  */
class TestTrapFlags private (val raw: GTestTrapFlags):
  def is(kv: TestTrapFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[TestTrapFlags.KnownValue]
    TestTrapFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"TestTrapFlags(${sb.result().mkString(", ")})"
end TestTrapFlags

object TestTrapFlags:
  export KnownValue.*

  def fromRaw(raw: GTestTrapFlags) = new TestTrapFlags(raw)

  extension (af: TestTrapFlags)
    def &(other: TestTrapFlags) =
      TestTrapFlags(af.raw & other.raw)
    def |(other: TestTrapFlags) =
      TestTrapFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Test traps are guards around forked tests. These flags determine what
    * traps to set.
    */
  enum KnownValue(override val raw: GTestTrapFlags, name: String)
      extends TestTrapFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Default behaviour. Since: 2.74
      */
    case DEFAULT
        extends KnownValue(GTestTrapFlags.G_TEST_TRAP_DEFAULT, "DEFAULT")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Redirect stdout of the test child to `/dev/null` so it cannot be
      * observed on the console during test runs. The actual output is still
      * captured though to allow later tests with g_test_trap_assert_stdout().
      */
    case SILENCE_STDOUT
        extends KnownValue(
          GTestTrapFlags.G_TEST_TRAP_SILENCE_STDOUT,
          "SILENCE_STDOUT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Redirect stderr of the test child to `/dev/null` so it cannot be
      * observed on the console during test runs. The actual output is still
      * captured though to allow later tests with g_test_trap_assert_stderr().
      */
    case SILENCE_STDERR
        extends KnownValue(
          GTestTrapFlags.G_TEST_TRAP_SILENCE_STDERR,
          "SILENCE_STDERR"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * If this flag is given, stdin of the child process is shared with stdin
      * of its parent process. It is redirected to `/dev/null` otherwise.
      */
    case INHERIT_STDIN
        extends KnownValue(
          GTestTrapFlags.G_TEST_TRAP_INHERIT_STDIN,
          "INHERIT_STDIN"
        )
  end KnownValue
end TestTrapFlags
