package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTestSubprocessFlags = CUnsignedInt
object GTestSubprocessFlags extends _BindgenEnumCUnsignedInt[GTestSubprocessFlags]:
  given _tag: Tag[GTestSubprocessFlags] = Tag.UInt
  inline def define(inline a: Long): GTestSubprocessFlags = a.toUInt
  val G_TEST_SUBPROCESS_DEFAULT = define(0)
  val G_TEST_SUBPROCESS_INHERIT_STDIN = define(1)
  val G_TEST_SUBPROCESS_INHERIT_STDOUT = define(2)
  val G_TEST_SUBPROCESS_INHERIT_STDERR = define(4)
  def getName(value: GTestSubprocessFlags): Option[String] =
    value match
      case `G_TEST_SUBPROCESS_DEFAULT` => Some("G_TEST_SUBPROCESS_DEFAULT")
      case `G_TEST_SUBPROCESS_INHERIT_STDIN` => Some("G_TEST_SUBPROCESS_INHERIT_STDIN")
      case `G_TEST_SUBPROCESS_INHERIT_STDOUT` => Some("G_TEST_SUBPROCESS_INHERIT_STDOUT")
      case `G_TEST_SUBPROCESS_INHERIT_STDERR` => Some("G_TEST_SUBPROCESS_INHERIT_STDERR")
      case _ => _root_.scala.None
  extension (a: GTestSubprocessFlags)
    inline def &(b: GTestSubprocessFlags): GTestSubprocessFlags = a & b
    inline def |(b: GTestSubprocessFlags): GTestSubprocessFlags = a | b
    inline def is(b: GTestSubprocessFlags): Boolean = (a & b) == b