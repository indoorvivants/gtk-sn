package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTraverseType = CUnsignedInt
object GTraverseType extends _BindgenEnumCUnsignedInt[GTraverseType]:
  given _tag: Tag[GTraverseType] = Tag.UInt
  inline def define(inline a: Long): GTraverseType = a.toUInt
  val G_IN_ORDER = define(0)
  val G_PRE_ORDER = define(1)
  val G_POST_ORDER = define(2)
  val G_LEVEL_ORDER = define(3)
  def getName(value: GTraverseType): Option[String] =
    value match
      case `G_IN_ORDER` => Some("G_IN_ORDER")
      case `G_PRE_ORDER` => Some("G_PRE_ORDER")
      case `G_POST_ORDER` => Some("G_POST_ORDER")
      case `G_LEVEL_ORDER` => Some("G_LEVEL_ORDER")
      case _ => _root_.scala.None
  extension (a: GTraverseType)
    inline def &(b: GTraverseType): GTraverseType = a & b
    inline def |(b: GTraverseType): GTraverseType = a | b
    inline def is(b: GTraverseType): Boolean = (a & b) == b