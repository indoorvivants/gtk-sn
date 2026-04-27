package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTestResult = CUnsignedInt
object GTestResult extends _BindgenEnumCUnsignedInt[GTestResult]:
  given _tag: Tag[GTestResult] = Tag.UInt
  inline def define(inline a: Long): GTestResult = a.toUInt
  val G_TEST_RUN_SUCCESS = define(0)
  val G_TEST_RUN_SKIPPED = define(1)
  val G_TEST_RUN_FAILURE = define(2)
  val G_TEST_RUN_INCOMPLETE = define(3)
  def getName(value: GTestResult): Option[String] =
    value match
      case `G_TEST_RUN_SUCCESS` => Some("G_TEST_RUN_SUCCESS")
      case `G_TEST_RUN_SKIPPED` => Some("G_TEST_RUN_SKIPPED")
      case `G_TEST_RUN_FAILURE` => Some("G_TEST_RUN_FAILURE")
      case `G_TEST_RUN_INCOMPLETE` => Some("G_TEST_RUN_INCOMPLETE")
      case _ => _root_.scala.None
  extension (a: GTestResult)
    inline def &(b: GTestResult): GTestResult = a & b
    inline def |(b: GTestResult): GTestResult = a | b
    inline def is(b: GTestResult): Boolean = (a & b) == b