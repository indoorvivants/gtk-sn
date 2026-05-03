package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTraverseFlags = CUnsignedInt
object GTraverseFlags extends _BindgenEnumCUnsignedInt[GTraverseFlags]:
  given _tag: Tag[GTraverseFlags] = Tag.UInt
  inline def define(inline a: Long): GTraverseFlags = a.toUInt
  val G_TRAVERSE_LEAVES = define(1)
  val G_TRAVERSE_NON_LEAVES = define(2)
  val G_TRAVERSE_ALL = define(3)
  val G_TRAVERSE_MASK = define(3)
  val G_TRAVERSE_LEAFS = define(1)
  val G_TRAVERSE_NON_LEAFS = define(2)
  def getName(value: GTraverseFlags): Option[String] =
    value match
      case `G_TRAVERSE_LEAVES` => Some("G_TRAVERSE_LEAVES")
      case `G_TRAVERSE_NON_LEAVES` => Some("G_TRAVERSE_NON_LEAVES")
      case `G_TRAVERSE_ALL` => Some("G_TRAVERSE_ALL")
      case `G_TRAVERSE_MASK` => Some("G_TRAVERSE_MASK")
      case `G_TRAVERSE_LEAFS` => Some("G_TRAVERSE_LEAFS")
      case `G_TRAVERSE_NON_LEAFS` => Some("G_TRAVERSE_NON_LEAFS")
      case _ => _root_.scala.None
  extension (a: GTraverseFlags)
    inline def &(b: GTraverseFlags): GTraverseFlags = a & b
    inline def |(b: GTraverseFlags): GTraverseFlags = a | b
    inline def is(b: GTraverseFlags): Boolean = (a & b) == b