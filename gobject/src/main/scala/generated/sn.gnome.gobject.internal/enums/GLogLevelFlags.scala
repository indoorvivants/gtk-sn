package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GLogLevelFlags = CInt
object GLogLevelFlags extends _BindgenEnumCInt[GLogLevelFlags]:
  given _tag: Tag[GLogLevelFlags] = Tag.Int
  inline def define(inline a: CInt): GLogLevelFlags = a
  val G_LOG_FLAG_RECURSION = define(1)
  val G_LOG_FLAG_FATAL = define(2)
  val G_LOG_LEVEL_ERROR = define(4)
  val G_LOG_LEVEL_CRITICAL = define(8)
  val G_LOG_LEVEL_WARNING = define(16)
  val G_LOG_LEVEL_MESSAGE = define(32)
  val G_LOG_LEVEL_INFO = define(64)
  val G_LOG_LEVEL_DEBUG = define(128)
  val G_LOG_LEVEL_MASK = define(-4)
  def getName(value: GLogLevelFlags): Option[String] =
    value match
      case `G_LOG_FLAG_RECURSION` => Some("G_LOG_FLAG_RECURSION")
      case `G_LOG_FLAG_FATAL` => Some("G_LOG_FLAG_FATAL")
      case `G_LOG_LEVEL_ERROR` => Some("G_LOG_LEVEL_ERROR")
      case `G_LOG_LEVEL_CRITICAL` => Some("G_LOG_LEVEL_CRITICAL")
      case `G_LOG_LEVEL_WARNING` => Some("G_LOG_LEVEL_WARNING")
      case `G_LOG_LEVEL_MESSAGE` => Some("G_LOG_LEVEL_MESSAGE")
      case `G_LOG_LEVEL_INFO` => Some("G_LOG_LEVEL_INFO")
      case `G_LOG_LEVEL_DEBUG` => Some("G_LOG_LEVEL_DEBUG")
      case `G_LOG_LEVEL_MASK` => Some("G_LOG_LEVEL_MASK")
      case _ => _root_.scala.None
  extension (a: GLogLevelFlags)
    inline def &(b: GLogLevelFlags): GLogLevelFlags = a & b
    inline def |(b: GLogLevelFlags): GLogLevelFlags = a | b
    inline def is(b: GLogLevelFlags): Boolean = (a & b) == b