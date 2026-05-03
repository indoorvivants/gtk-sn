package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-leaflet.h
*/
opaque type AdwLeafletTransitionType = CUnsignedInt
object AdwLeafletTransitionType extends _BindgenEnumCUnsignedInt[AdwLeafletTransitionType]:
  given _tag: Tag[AdwLeafletTransitionType] = Tag.UInt
  inline def define(inline a: Long): AdwLeafletTransitionType = a.toUInt
  val ADW_LEAFLET_TRANSITION_TYPE_OVER = define(0)
  val ADW_LEAFLET_TRANSITION_TYPE_UNDER = define(1)
  val ADW_LEAFLET_TRANSITION_TYPE_SLIDE = define(2)
  def getName(value: AdwLeafletTransitionType): Option[String] =
    value match
      case `ADW_LEAFLET_TRANSITION_TYPE_OVER` => Some("ADW_LEAFLET_TRANSITION_TYPE_OVER")
      case `ADW_LEAFLET_TRANSITION_TYPE_UNDER` => Some("ADW_LEAFLET_TRANSITION_TYPE_UNDER")
      case `ADW_LEAFLET_TRANSITION_TYPE_SLIDE` => Some("ADW_LEAFLET_TRANSITION_TYPE_SLIDE")
      case _ => _root_.scala.None
  extension (a: AdwLeafletTransitionType)
    inline def &(b: AdwLeafletTransitionType): AdwLeafletTransitionType = a & b
    inline def |(b: AdwLeafletTransitionType): AdwLeafletTransitionType = a | b
    inline def is(b: AdwLeafletTransitionType): Boolean = (a & b) == b