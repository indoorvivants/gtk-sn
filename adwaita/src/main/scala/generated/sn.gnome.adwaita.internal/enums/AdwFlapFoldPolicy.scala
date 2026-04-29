package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-flap.h
*/
opaque type AdwFlapFoldPolicy = CUnsignedInt
object AdwFlapFoldPolicy extends _BindgenEnumCUnsignedInt[AdwFlapFoldPolicy]:
  given _tag: Tag[AdwFlapFoldPolicy] = Tag.UInt
  inline def define(inline a: Long): AdwFlapFoldPolicy = a.toUInt
  val ADW_FLAP_FOLD_POLICY_NEVER = define(0)
  val ADW_FLAP_FOLD_POLICY_ALWAYS = define(1)
  val ADW_FLAP_FOLD_POLICY_AUTO = define(2)
  def getName(value: AdwFlapFoldPolicy): Option[String] =
    value match
      case `ADW_FLAP_FOLD_POLICY_NEVER` => Some("ADW_FLAP_FOLD_POLICY_NEVER")
      case `ADW_FLAP_FOLD_POLICY_ALWAYS` => Some("ADW_FLAP_FOLD_POLICY_ALWAYS")
      case `ADW_FLAP_FOLD_POLICY_AUTO` => Some("ADW_FLAP_FOLD_POLICY_AUTO")
      case _ => _root_.scala.None
  extension (a: AdwFlapFoldPolicy)
    inline def &(b: AdwFlapFoldPolicy): AdwFlapFoldPolicy = a & b
    inline def |(b: AdwFlapFoldPolicy): AdwFlapFoldPolicy = a | b
    inline def is(b: AdwFlapFoldPolicy): Boolean = (a & b) == b