package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-alert-dialog.h
*/
opaque type AdwResponseAppearance = CUnsignedInt
object AdwResponseAppearance extends _BindgenEnumCUnsignedInt[AdwResponseAppearance]:
  given _tag: Tag[AdwResponseAppearance] = Tag.UInt
  inline def define(inline a: Long): AdwResponseAppearance = a.toUInt
  val ADW_RESPONSE_DEFAULT = define(0)
  val ADW_RESPONSE_SUGGESTED = define(1)
  val ADW_RESPONSE_DESTRUCTIVE = define(2)
  def getName(value: AdwResponseAppearance): Option[String] =
    value match
      case `ADW_RESPONSE_DEFAULT` => Some("ADW_RESPONSE_DEFAULT")
      case `ADW_RESPONSE_SUGGESTED` => Some("ADW_RESPONSE_SUGGESTED")
      case `ADW_RESPONSE_DESTRUCTIVE` => Some("ADW_RESPONSE_DESTRUCTIVE")
      case _ => _root_.scala.None
  extension (a: AdwResponseAppearance)
    inline def &(b: AdwResponseAppearance): AdwResponseAppearance = a & b
    inline def |(b: AdwResponseAppearance): AdwResponseAppearance = a | b
    inline def is(b: AdwResponseAppearance): Boolean = (a & b) == b