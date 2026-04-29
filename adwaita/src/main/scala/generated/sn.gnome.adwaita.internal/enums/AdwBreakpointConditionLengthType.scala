package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-breakpoint.h
*/
opaque type AdwBreakpointConditionLengthType = CUnsignedInt
object AdwBreakpointConditionLengthType extends _BindgenEnumCUnsignedInt[AdwBreakpointConditionLengthType]:
  given _tag: Tag[AdwBreakpointConditionLengthType] = Tag.UInt
  inline def define(inline a: Long): AdwBreakpointConditionLengthType = a.toUInt
  val ADW_BREAKPOINT_CONDITION_MIN_WIDTH = define(0)
  val ADW_BREAKPOINT_CONDITION_MAX_WIDTH = define(1)
  val ADW_BREAKPOINT_CONDITION_MIN_HEIGHT = define(2)
  val ADW_BREAKPOINT_CONDITION_MAX_HEIGHT = define(3)
  def getName(value: AdwBreakpointConditionLengthType): Option[String] =
    value match
      case `ADW_BREAKPOINT_CONDITION_MIN_WIDTH` => Some("ADW_BREAKPOINT_CONDITION_MIN_WIDTH")
      case `ADW_BREAKPOINT_CONDITION_MAX_WIDTH` => Some("ADW_BREAKPOINT_CONDITION_MAX_WIDTH")
      case `ADW_BREAKPOINT_CONDITION_MIN_HEIGHT` => Some("ADW_BREAKPOINT_CONDITION_MIN_HEIGHT")
      case `ADW_BREAKPOINT_CONDITION_MAX_HEIGHT` => Some("ADW_BREAKPOINT_CONDITION_MAX_HEIGHT")
      case _ => _root_.scala.None
  extension (a: AdwBreakpointConditionLengthType)
    inline def &(b: AdwBreakpointConditionLengthType): AdwBreakpointConditionLengthType = a & b
    inline def |(b: AdwBreakpointConditionLengthType): AdwBreakpointConditionLengthType = a | b
    inline def is(b: AdwBreakpointConditionLengthType): Boolean = (a & b) == b