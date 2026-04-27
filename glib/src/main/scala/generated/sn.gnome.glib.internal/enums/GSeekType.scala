package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSeekType = CUnsignedInt
object GSeekType extends _BindgenEnumCUnsignedInt[GSeekType]:
  given _tag: Tag[GSeekType] = Tag.UInt
  inline def define(inline a: Long): GSeekType = a.toUInt
  val G_SEEK_CUR = define(0)
  val G_SEEK_SET = define(1)
  val G_SEEK_END = define(2)
  def getName(value: GSeekType): Option[String] =
    value match
      case `G_SEEK_CUR` => Some("G_SEEK_CUR")
      case `G_SEEK_SET` => Some("G_SEEK_SET")
      case `G_SEEK_END` => Some("G_SEEK_END")
      case _ => _root_.scala.None
  extension (a: GSeekType)
    inline def &(b: GSeekType): GSeekType = a & b
    inline def |(b: GSeekType): GSeekType = a | b
    inline def is(b: GSeekType): Boolean = (a & b) == b