package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GErrorType = CUnsignedInt
object GErrorType extends _BindgenEnumCUnsignedInt[GErrorType]:
  given _tag: Tag[GErrorType] = Tag.UInt
  inline def define(inline a: Long): GErrorType = a.toUInt
  val G_ERR_UNKNOWN = define(0)
  val G_ERR_UNEXP_EOF = define(1)
  val G_ERR_UNEXP_EOF_IN_STRING = define(2)
  val G_ERR_UNEXP_EOF_IN_COMMENT = define(3)
  val G_ERR_NON_DIGIT_IN_CONST = define(4)
  val G_ERR_DIGIT_RADIX = define(5)
  val G_ERR_FLOAT_RADIX = define(6)
  val G_ERR_FLOAT_MALFORMED = define(7)
  def getName(value: GErrorType): Option[String] =
    value match
      case `G_ERR_UNKNOWN` => Some("G_ERR_UNKNOWN")
      case `G_ERR_UNEXP_EOF` => Some("G_ERR_UNEXP_EOF")
      case `G_ERR_UNEXP_EOF_IN_STRING` => Some("G_ERR_UNEXP_EOF_IN_STRING")
      case `G_ERR_UNEXP_EOF_IN_COMMENT` => Some("G_ERR_UNEXP_EOF_IN_COMMENT")
      case `G_ERR_NON_DIGIT_IN_CONST` => Some("G_ERR_NON_DIGIT_IN_CONST")
      case `G_ERR_DIGIT_RADIX` => Some("G_ERR_DIGIT_RADIX")
      case `G_ERR_FLOAT_RADIX` => Some("G_ERR_FLOAT_RADIX")
      case `G_ERR_FLOAT_MALFORMED` => Some("G_ERR_FLOAT_MALFORMED")
      case _ => _root_.scala.None
  extension (a: GErrorType)
    inline def &(b: GErrorType): GErrorType = a & b
    inline def |(b: GErrorType): GErrorType = a | b
    inline def is(b: GErrorType): Boolean = (a & b) == b