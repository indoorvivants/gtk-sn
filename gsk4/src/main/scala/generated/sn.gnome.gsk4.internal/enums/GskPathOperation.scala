package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GskPathOperation: _PATH_MOVE: A move-to operation, with 1 point describing the target point. _PATH_CLOSE: A close operation ending the current contour with a line back to the starting point. Two points describe the start and end of the line. _PATH_LINE: A line-to operation, with 2 points describing the start and end point of a straight line. _PATH_QUAD: A curve-to operation describing a quadratic Bézier curve with 3 points describing the start point, the control point and the end point of the curve. _PATH_CUBIC: A curve-to operation describing a cubic Bézier curve with 4 points describing the start point, the two control points and the end point of the curve. _PATH_CONIC: A rational quadratic Bézier curve with 3 points describing the start point, control point and end point of the curve. A weight for the curve will be passed, too.
*/
opaque type GskPathOperation = CUnsignedInt
object GskPathOperation extends _BindgenEnumCUnsignedInt[GskPathOperation]:
  given _tag: Tag[GskPathOperation] = Tag.UInt
  inline def define(inline a: Long): GskPathOperation = a.toUInt
  val GSK_PATH_MOVE = define(0)
  val GSK_PATH_CLOSE = define(1)
  val GSK_PATH_LINE = define(2)
  val GSK_PATH_QUAD = define(3)
  val GSK_PATH_CUBIC = define(4)
  val GSK_PATH_CONIC = define(5)
  def getName(value: GskPathOperation): Option[String] =
    value match
      case `GSK_PATH_MOVE` => Some("GSK_PATH_MOVE")
      case `GSK_PATH_CLOSE` => Some("GSK_PATH_CLOSE")
      case `GSK_PATH_LINE` => Some("GSK_PATH_LINE")
      case `GSK_PATH_QUAD` => Some("GSK_PATH_QUAD")
      case `GSK_PATH_CUBIC` => Some("GSK_PATH_CUBIC")
      case `GSK_PATH_CONIC` => Some("GSK_PATH_CONIC")
      case _ => _root_.scala.None
  extension (a: GskPathOperation)
    inline def &(b: GskPathOperation): GskPathOperation = a & b
    inline def |(b: GskPathOperation): GskPathOperation = a | b
    inline def is(b: GskPathOperation): Boolean = (a & b) == b