package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GIOCondition = CUnsignedInt
object GIOCondition extends _BindgenEnumCUnsignedInt[GIOCondition]:
  given _tag: Tag[GIOCondition] = Tag.UInt
  inline def define(inline a: Long): GIOCondition = a.toUInt
  val G_IO_IN = define(1)
  val G_IO_OUT = define(4)
  val G_IO_PRI = define(2)
  val G_IO_ERR = define(8)
  val G_IO_HUP = define(16)
  val G_IO_NVAL = define(32)
  def getName(value: GIOCondition): Option[String] =
    value match
      case `G_IO_IN` => Some("G_IO_IN")
      case `G_IO_OUT` => Some("G_IO_OUT")
      case `G_IO_PRI` => Some("G_IO_PRI")
      case `G_IO_ERR` => Some("G_IO_ERR")
      case `G_IO_HUP` => Some("G_IO_HUP")
      case `G_IO_NVAL` => Some("G_IO_NVAL")
      case _ => _root_.scala.None
  extension (a: GIOCondition)
    inline def &(b: GIOCondition): GIOCondition = a & b
    inline def |(b: GIOCondition): GIOCondition = a | b
    inline def is(b: GIOCondition): Boolean = (a & b) == b