package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-header-bar.h
*/
opaque type AdwCenteringPolicy = CUnsignedInt
object AdwCenteringPolicy extends _BindgenEnumCUnsignedInt[AdwCenteringPolicy]:
  given _tag: Tag[AdwCenteringPolicy] = Tag.UInt
  inline def define(inline a: Long): AdwCenteringPolicy = a.toUInt
  val ADW_CENTERING_POLICY_LOOSE = define(0)
  val ADW_CENTERING_POLICY_STRICT = define(1)
  def getName(value: AdwCenteringPolicy): Option[String] =
    value match
      case `ADW_CENTERING_POLICY_LOOSE` => Some("ADW_CENTERING_POLICY_LOOSE")
      case `ADW_CENTERING_POLICY_STRICT` => Some("ADW_CENTERING_POLICY_STRICT")
      case _ => _root_.scala.None
  extension (a: AdwCenteringPolicy)
    inline def &(b: AdwCenteringPolicy): AdwCenteringPolicy = a & b
    inline def |(b: AdwCenteringPolicy): AdwCenteringPolicy = a | b
    inline def is(b: AdwCenteringPolicy): Boolean = (a & b) == b