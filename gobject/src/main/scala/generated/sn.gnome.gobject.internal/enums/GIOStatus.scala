package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GIOStatus = CUnsignedInt
object GIOStatus extends _BindgenEnumCUnsignedInt[GIOStatus]:
  given _tag: Tag[GIOStatus] = Tag.UInt
  inline def define(inline a: Long): GIOStatus = a.toUInt
  val G_IO_STATUS_ERROR = define(0)
  val G_IO_STATUS_NORMAL = define(1)
  val G_IO_STATUS_EOF = define(2)
  val G_IO_STATUS_AGAIN = define(3)
  def getName(value: GIOStatus): Option[String] =
    value match
      case `G_IO_STATUS_ERROR` => Some("G_IO_STATUS_ERROR")
      case `G_IO_STATUS_NORMAL` => Some("G_IO_STATUS_NORMAL")
      case `G_IO_STATUS_EOF` => Some("G_IO_STATUS_EOF")
      case `G_IO_STATUS_AGAIN` => Some("G_IO_STATUS_AGAIN")
      case _ => _root_.scala.None
  extension (a: GIOStatus)
    inline def &(b: GIOStatus): GIOStatus = a & b
    inline def |(b: GIOStatus): GIOStatus = a | b
    inline def is(b: GIOStatus): Boolean = (a & b) == b