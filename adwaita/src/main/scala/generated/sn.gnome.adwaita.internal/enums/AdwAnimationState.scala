package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation.h
*/
opaque type AdwAnimationState = CUnsignedInt
object AdwAnimationState extends _BindgenEnumCUnsignedInt[AdwAnimationState]:
  given _tag: Tag[AdwAnimationState] = Tag.UInt
  inline def define(inline a: Long): AdwAnimationState = a.toUInt
  val ADW_ANIMATION_IDLE = define(0)
  val ADW_ANIMATION_PAUSED = define(1)
  val ADW_ANIMATION_PLAYING = define(2)
  val ADW_ANIMATION_FINISHED = define(3)
  def getName(value: AdwAnimationState): Option[String] =
    value match
      case `ADW_ANIMATION_IDLE` => Some("ADW_ANIMATION_IDLE")
      case `ADW_ANIMATION_PAUSED` => Some("ADW_ANIMATION_PAUSED")
      case `ADW_ANIMATION_PLAYING` => Some("ADW_ANIMATION_PLAYING")
      case `ADW_ANIMATION_FINISHED` => Some("ADW_ANIMATION_FINISHED")
      case _ => _root_.scala.None
  extension (a: AdwAnimationState)
    inline def &(b: AdwAnimationState): AdwAnimationState = a & b
    inline def |(b: AdwAnimationState): AdwAnimationState = a | b
    inline def is(b: AdwAnimationState): Boolean = (a & b) == b