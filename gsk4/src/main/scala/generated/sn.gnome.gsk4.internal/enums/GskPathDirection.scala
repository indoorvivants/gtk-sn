package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GskPathDirection: _PATH_FROM_START: The tangent in path direction of the incoming side of the path _PATH_TO_START: The tangent against path direction of the incoming side of the path _PATH_TO_END: The tangent in path direction of the outgoing side of the path _PATH_FROM_END: The tangent against path direction of the outgoing side of the path
*/
opaque type GskPathDirection = CUnsignedInt
object GskPathDirection extends _BindgenEnumCUnsignedInt[GskPathDirection]:
  given _tag: Tag[GskPathDirection] = Tag.UInt
  inline def define(inline a: Long): GskPathDirection = a.toUInt
  val GSK_PATH_FROM_START = define(0)
  val GSK_PATH_TO_START = define(1)
  val GSK_PATH_TO_END = define(2)
  val GSK_PATH_FROM_END = define(3)
  def getName(value: GskPathDirection): Option[String] =
    value match
      case `GSK_PATH_FROM_START` => Some("GSK_PATH_FROM_START")
      case `GSK_PATH_TO_START` => Some("GSK_PATH_TO_START")
      case `GSK_PATH_TO_END` => Some("GSK_PATH_TO_END")
      case `GSK_PATH_FROM_END` => Some("GSK_PATH_FROM_END")
      case _ => _root_.scala.None
  extension (a: GskPathDirection)
    inline def &(b: GskPathDirection): GskPathDirection = a & b
    inline def |(b: GskPathDirection): GskPathDirection = a | b
    inline def is(b: GskPathDirection): Boolean = (a & b) == b