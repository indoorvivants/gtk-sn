package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GIOFlags = CUnsignedInt
object GIOFlags extends _BindgenEnumCUnsignedInt[GIOFlags]:
  given _tag: Tag[GIOFlags] = Tag.UInt
  inline def define(inline a: Long): GIOFlags = a.toUInt
  val G_IO_FLAG_NONE = define(0)
  val G_IO_FLAG_APPEND = define(1)
  val G_IO_FLAG_NONBLOCK = define(2)
  val G_IO_FLAG_IS_READABLE = define(4)
  val G_IO_FLAG_IS_WRITABLE = define(8)
  val G_IO_FLAG_IS_WRITEABLE = define(8)
  val G_IO_FLAG_IS_SEEKABLE = define(16)
  val G_IO_FLAG_MASK = define(31)
  val G_IO_FLAG_GET_MASK = define(31)
  val G_IO_FLAG_SET_MASK = define(3)
  def getName(value: GIOFlags): Option[String] =
    value match
      case `G_IO_FLAG_NONE` => Some("G_IO_FLAG_NONE")
      case `G_IO_FLAG_APPEND` => Some("G_IO_FLAG_APPEND")
      case `G_IO_FLAG_NONBLOCK` => Some("G_IO_FLAG_NONBLOCK")
      case `G_IO_FLAG_IS_READABLE` => Some("G_IO_FLAG_IS_READABLE")
      case `G_IO_FLAG_IS_WRITABLE` => Some("G_IO_FLAG_IS_WRITABLE")
      case `G_IO_FLAG_IS_WRITEABLE` => Some("G_IO_FLAG_IS_WRITEABLE")
      case `G_IO_FLAG_IS_SEEKABLE` => Some("G_IO_FLAG_IS_SEEKABLE")
      case `G_IO_FLAG_MASK` => Some("G_IO_FLAG_MASK")
      case `G_IO_FLAG_GET_MASK` => Some("G_IO_FLAG_GET_MASK")
      case `G_IO_FLAG_SET_MASK` => Some("G_IO_FLAG_SET_MASK")
      case _ => _root_.scala.None
  extension (a: GIOFlags)
    inline def &(b: GIOFlags): GIOFlags = a & b
    inline def |(b: GIOFlags): GIOFlags = a | b
    inline def is(b: GIOFlags): Boolean = (a & b) == b