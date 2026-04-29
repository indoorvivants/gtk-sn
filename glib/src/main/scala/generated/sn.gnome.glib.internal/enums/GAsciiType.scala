package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GAsciiType = CUnsignedInt
object GAsciiType extends _BindgenEnumCUnsignedInt[GAsciiType]:
  given _tag: Tag[GAsciiType] = Tag.UInt
  inline def define(inline a: Long): GAsciiType = a.toUInt
  val G_ASCII_ALNUM = define(1)
  val G_ASCII_ALPHA = define(2)
  val G_ASCII_CNTRL = define(4)
  val G_ASCII_DIGIT = define(8)
  val G_ASCII_GRAPH = define(16)
  val G_ASCII_LOWER = define(32)
  val G_ASCII_PRINT = define(64)
  val G_ASCII_PUNCT = define(128)
  val G_ASCII_SPACE = define(256)
  val G_ASCII_UPPER = define(512)
  val G_ASCII_XDIGIT = define(1024)
  def getName(value: GAsciiType): Option[String] =
    value match
      case `G_ASCII_ALNUM` => Some("G_ASCII_ALNUM")
      case `G_ASCII_ALPHA` => Some("G_ASCII_ALPHA")
      case `G_ASCII_CNTRL` => Some("G_ASCII_CNTRL")
      case `G_ASCII_DIGIT` => Some("G_ASCII_DIGIT")
      case `G_ASCII_GRAPH` => Some("G_ASCII_GRAPH")
      case `G_ASCII_LOWER` => Some("G_ASCII_LOWER")
      case `G_ASCII_PRINT` => Some("G_ASCII_PRINT")
      case `G_ASCII_PUNCT` => Some("G_ASCII_PUNCT")
      case `G_ASCII_SPACE` => Some("G_ASCII_SPACE")
      case `G_ASCII_UPPER` => Some("G_ASCII_UPPER")
      case `G_ASCII_XDIGIT` => Some("G_ASCII_XDIGIT")
      case _ => _root_.scala.None
  extension (a: GAsciiType)
    inline def &(b: GAsciiType): GAsciiType = a & b
    inline def |(b: GAsciiType): GAsciiType = a | b
    inline def is(b: GAsciiType): Boolean = (a & b) == b