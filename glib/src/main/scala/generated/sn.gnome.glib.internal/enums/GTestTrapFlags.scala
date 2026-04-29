package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTestTrapFlags: _TEST_TRAP_DEFAULT: Default behaviour. Since: 2.74 _TEST_TRAP_SILENCE_STDOUT: Redirect stdout of the test child to `/dev/null` so it cannot be observed on the console during test runs. The actual output is still captured though to allow later tests with g_test_trap_assert_stdout(). _TEST_TRAP_SILENCE_STDERR: Redirect stderr of the test child to `/dev/null` so it cannot be observed on the console during test runs. The actual output is still captured though to allow later tests with g_test_trap_assert_stderr(). _TEST_TRAP_INHERIT_STDIN: If this flag is given, stdin of the child process is shared with stdin of its parent process. It is redirected to `/dev/null` otherwise.
*/
opaque type GTestTrapFlags = CUnsignedInt
object GTestTrapFlags extends _BindgenEnumCUnsignedInt[GTestTrapFlags]:
  given _tag: Tag[GTestTrapFlags] = Tag.UInt
  inline def define(inline a: Long): GTestTrapFlags = a.toUInt
  val G_TEST_TRAP_DEFAULT = define(0)
  val G_TEST_TRAP_SILENCE_STDOUT = define(128)
  val G_TEST_TRAP_SILENCE_STDERR = define(256)
  val G_TEST_TRAP_INHERIT_STDIN = define(512)
  def getName(value: GTestTrapFlags): Option[String] =
    value match
      case `G_TEST_TRAP_DEFAULT` => Some("G_TEST_TRAP_DEFAULT")
      case `G_TEST_TRAP_SILENCE_STDOUT` => Some("G_TEST_TRAP_SILENCE_STDOUT")
      case `G_TEST_TRAP_SILENCE_STDERR` => Some("G_TEST_TRAP_SILENCE_STDERR")
      case `G_TEST_TRAP_INHERIT_STDIN` => Some("G_TEST_TRAP_INHERIT_STDIN")
      case _ => _root_.scala.None
  extension (a: GTestTrapFlags)
    inline def &(b: GTestTrapFlags): GTestTrapFlags = a & b
    inline def |(b: GTestTrapFlags): GTestTrapFlags = a | b
    inline def is(b: GTestTrapFlags): Boolean = (a & b) == b