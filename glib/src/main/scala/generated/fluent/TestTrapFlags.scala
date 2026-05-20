package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GTestTrapFlags

/** Test traps are guards around forked tests. These flags determine what traps
  * to set.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TestTrapFlags private (val raw: GTestTrapFlags):
  def is(kv: TestTrapFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[TestTrapFlags.KnownValue]
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

  /** Test traps are guards around forked tests. These flags determine what
    * traps to set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GTestTrapFlags, name: scala.Predef.String)
      extends TestTrapFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** Default behaviour. Since: 2.74
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DEFAULT
        extends KnownValue(GTestTrapFlags.G_TEST_TRAP_DEFAULT, "DEFAULT")

    /** Redirect stdout of the test child to `/dev/null` so it cannot be
      * observed on the console during test runs. The actual output is still
      * captured though to allow later tests with g_test_trap_assert_stdout().
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SILENCE_STDOUT
        extends KnownValue(
          GTestTrapFlags.G_TEST_TRAP_SILENCE_STDOUT,
          "SILENCE_STDOUT"
        )

    /** Redirect stderr of the test child to `/dev/null` so it cannot be
      * observed on the console during test runs. The actual output is still
      * captured though to allow later tests with g_test_trap_assert_stderr().
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SILENCE_STDERR
        extends KnownValue(
          GTestTrapFlags.G_TEST_TRAP_SILENCE_STDERR,
          "SILENCE_STDERR"
        )

    /** If this flag is given, stdin of the child process is shared with stdin
      * of its parent process. It is redirected to `/dev/null` otherwise.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case INHERIT_STDIN
        extends KnownValue(
          GTestTrapFlags.G_TEST_TRAP_INHERIT_STDIN,
          "INHERIT_STDIN"
        )
  end KnownValue
end TestTrapFlags
