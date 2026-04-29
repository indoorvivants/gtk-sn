package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-breakpoint.h
*/
opaque type AdwBreakpointConditionRatioType = CUnsignedInt
object AdwBreakpointConditionRatioType extends _BindgenEnumCUnsignedInt[AdwBreakpointConditionRatioType]:
  given _tag: Tag[AdwBreakpointConditionRatioType] = Tag.UInt
  inline def define(inline a: Long): AdwBreakpointConditionRatioType = a.toUInt
  val ADW_BREAKPOINT_CONDITION_MIN_ASPECT_RATIO = define(0)
  val ADW_BREAKPOINT_CONDITION_MAX_ASPECT_RATIO = define(1)
  def getName(value: AdwBreakpointConditionRatioType): Option[String] =
    value match
      case `ADW_BREAKPOINT_CONDITION_MIN_ASPECT_RATIO` => Some("ADW_BREAKPOINT_CONDITION_MIN_ASPECT_RATIO")
      case `ADW_BREAKPOINT_CONDITION_MAX_ASPECT_RATIO` => Some("ADW_BREAKPOINT_CONDITION_MAX_ASPECT_RATIO")
      case _ => _root_.scala.None
  extension (a: AdwBreakpointConditionRatioType)
    inline def &(b: AdwBreakpointConditionRatioType): AdwBreakpointConditionRatioType = a & b
    inline def |(b: AdwBreakpointConditionRatioType): AdwBreakpointConditionRatioType = a | b
    inline def is(b: AdwBreakpointConditionRatioType): Boolean = (a & b) == b