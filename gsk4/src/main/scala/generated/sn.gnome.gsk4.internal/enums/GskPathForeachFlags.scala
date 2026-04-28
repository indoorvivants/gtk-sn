package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GskPathForeachFlags: _PATH_FOREACH_ALLOW_ONLY_LINES: The default behavior, only allow lines. _PATH_FOREACH_ALLOW_QUAD: Allow emission of `GSK_PATH_QUAD` operations _PATH_FOREACH_ALLOW_CUBIC: Allow emission of `GSK_PATH_CUBIC` operations. _PATH_FOREACH_ALLOW_CONIC: Allow emission of `GSK_PATH_CONIC` operations.
*/
opaque type GskPathForeachFlags = CUnsignedInt
object GskPathForeachFlags extends _BindgenEnumCUnsignedInt[GskPathForeachFlags]:
  given _tag: Tag[GskPathForeachFlags] = Tag.UInt
  inline def define(inline a: Long): GskPathForeachFlags = a.toUInt
  val GSK_PATH_FOREACH_ALLOW_ONLY_LINES = define(0)
  val GSK_PATH_FOREACH_ALLOW_QUAD = define(1)
  val GSK_PATH_FOREACH_ALLOW_CUBIC = define(2)
  val GSK_PATH_FOREACH_ALLOW_CONIC = define(4)
  def getName(value: GskPathForeachFlags): Option[String] =
    value match
      case `GSK_PATH_FOREACH_ALLOW_ONLY_LINES` => Some("GSK_PATH_FOREACH_ALLOW_ONLY_LINES")
      case `GSK_PATH_FOREACH_ALLOW_QUAD` => Some("GSK_PATH_FOREACH_ALLOW_QUAD")
      case `GSK_PATH_FOREACH_ALLOW_CUBIC` => Some("GSK_PATH_FOREACH_ALLOW_CUBIC")
      case `GSK_PATH_FOREACH_ALLOW_CONIC` => Some("GSK_PATH_FOREACH_ALLOW_CONIC")
      case _ => _root_.scala.None
  extension (a: GskPathForeachFlags)
    inline def &(b: GskPathForeachFlags): GskPathForeachFlags = a & b
    inline def |(b: GskPathForeachFlags): GskPathForeachFlags = a | b
    inline def is(b: GskPathForeachFlags): Boolean = (a & b) == b