package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GIOError = CUnsignedInt
object GIOError extends _BindgenEnumCUnsignedInt[GIOError]:
  given _tag: Tag[GIOError] = Tag.UInt
  inline def define(inline a: Long): GIOError = a.toUInt
  val G_IO_ERROR_NONE = define(0)
  val G_IO_ERROR_AGAIN = define(1)
  val G_IO_ERROR_INVAL = define(2)
  val G_IO_ERROR_UNKNOWN = define(3)
  def getName(value: GIOError): Option[String] =
    value match
      case `G_IO_ERROR_NONE` => Some("G_IO_ERROR_NONE")
      case `G_IO_ERROR_AGAIN` => Some("G_IO_ERROR_AGAIN")
      case `G_IO_ERROR_INVAL` => Some("G_IO_ERROR_INVAL")
      case `G_IO_ERROR_UNKNOWN` => Some("G_IO_ERROR_UNKNOWN")
      case _ => _root_.scala.None
  extension (a: GIOError)
    inline def &(b: GIOError): GIOError = a & b
    inline def |(b: GIOError): GIOError = a | b
    inline def is(b: GIOError): Boolean = (a & b) == b