package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTestLogType = CUnsignedInt
object GTestLogType extends _BindgenEnumCUnsignedInt[GTestLogType]:
  given _tag: Tag[GTestLogType] = Tag.UInt
  inline def define(inline a: Long): GTestLogType = a.toUInt
  val G_TEST_LOG_NONE = define(0)
  val G_TEST_LOG_ERROR = define(1)
  val G_TEST_LOG_START_BINARY = define(2)
  val G_TEST_LOG_LIST_CASE = define(3)
  val G_TEST_LOG_SKIP_CASE = define(4)
  val G_TEST_LOG_START_CASE = define(5)
  val G_TEST_LOG_STOP_CASE = define(6)
  val G_TEST_LOG_MIN_RESULT = define(7)
  val G_TEST_LOG_MAX_RESULT = define(8)
  val G_TEST_LOG_MESSAGE = define(9)
  val G_TEST_LOG_START_SUITE = define(10)
  val G_TEST_LOG_STOP_SUITE = define(11)
  def getName(value: GTestLogType): Option[String] =
    value match
      case `G_TEST_LOG_NONE` => Some("G_TEST_LOG_NONE")
      case `G_TEST_LOG_ERROR` => Some("G_TEST_LOG_ERROR")
      case `G_TEST_LOG_START_BINARY` => Some("G_TEST_LOG_START_BINARY")
      case `G_TEST_LOG_LIST_CASE` => Some("G_TEST_LOG_LIST_CASE")
      case `G_TEST_LOG_SKIP_CASE` => Some("G_TEST_LOG_SKIP_CASE")
      case `G_TEST_LOG_START_CASE` => Some("G_TEST_LOG_START_CASE")
      case `G_TEST_LOG_STOP_CASE` => Some("G_TEST_LOG_STOP_CASE")
      case `G_TEST_LOG_MIN_RESULT` => Some("G_TEST_LOG_MIN_RESULT")
      case `G_TEST_LOG_MAX_RESULT` => Some("G_TEST_LOG_MAX_RESULT")
      case `G_TEST_LOG_MESSAGE` => Some("G_TEST_LOG_MESSAGE")
      case `G_TEST_LOG_START_SUITE` => Some("G_TEST_LOG_START_SUITE")
      case `G_TEST_LOG_STOP_SUITE` => Some("G_TEST_LOG_STOP_SUITE")
      case _ => _root_.scala.None
  extension (a: GTestLogType)
    inline def &(b: GTestLogType): GTestLogType = a & b
    inline def |(b: GTestLogType): GTestLogType = a | b
    inline def is(b: GTestLogType): Boolean = (a & b) == b