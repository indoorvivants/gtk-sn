package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GIOChannelError = CUnsignedInt
object GIOChannelError extends _BindgenEnumCUnsignedInt[GIOChannelError]:
  given _tag: Tag[GIOChannelError] = Tag.UInt
  inline def define(inline a: Long): GIOChannelError = a.toUInt
  val G_IO_CHANNEL_ERROR_FBIG = define(0)
  val G_IO_CHANNEL_ERROR_INVAL = define(1)
  val G_IO_CHANNEL_ERROR_IO = define(2)
  val G_IO_CHANNEL_ERROR_ISDIR = define(3)
  val G_IO_CHANNEL_ERROR_NOSPC = define(4)
  val G_IO_CHANNEL_ERROR_NXIO = define(5)
  val G_IO_CHANNEL_ERROR_OVERFLOW = define(6)
  val G_IO_CHANNEL_ERROR_PIPE = define(7)
  val G_IO_CHANNEL_ERROR_FAILED = define(8)
  def getName(value: GIOChannelError): Option[String] =
    value match
      case `G_IO_CHANNEL_ERROR_FBIG` => Some("G_IO_CHANNEL_ERROR_FBIG")
      case `G_IO_CHANNEL_ERROR_INVAL` => Some("G_IO_CHANNEL_ERROR_INVAL")
      case `G_IO_CHANNEL_ERROR_IO` => Some("G_IO_CHANNEL_ERROR_IO")
      case `G_IO_CHANNEL_ERROR_ISDIR` => Some("G_IO_CHANNEL_ERROR_ISDIR")
      case `G_IO_CHANNEL_ERROR_NOSPC` => Some("G_IO_CHANNEL_ERROR_NOSPC")
      case `G_IO_CHANNEL_ERROR_NXIO` => Some("G_IO_CHANNEL_ERROR_NXIO")
      case `G_IO_CHANNEL_ERROR_OVERFLOW` => Some("G_IO_CHANNEL_ERROR_OVERFLOW")
      case `G_IO_CHANNEL_ERROR_PIPE` => Some("G_IO_CHANNEL_ERROR_PIPE")
      case `G_IO_CHANNEL_ERROR_FAILED` => Some("G_IO_CHANNEL_ERROR_FAILED")
      case _ => _root_.scala.None
  extension (a: GIOChannelError)
    inline def &(b: GIOChannelError): GIOChannelError = a & b
    inline def |(b: GIOChannelError): GIOChannelError = a | b
    inline def is(b: GIOChannelError): Boolean = (a & b) == b