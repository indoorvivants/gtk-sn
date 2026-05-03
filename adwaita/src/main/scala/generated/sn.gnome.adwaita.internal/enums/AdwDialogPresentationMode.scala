package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-dialog.h
*/
opaque type AdwDialogPresentationMode = CUnsignedInt
object AdwDialogPresentationMode extends _BindgenEnumCUnsignedInt[AdwDialogPresentationMode]:
  given _tag: Tag[AdwDialogPresentationMode] = Tag.UInt
  inline def define(inline a: Long): AdwDialogPresentationMode = a.toUInt
  val ADW_DIALOG_AUTO = define(0)
  val ADW_DIALOG_FLOATING = define(1)
  val ADW_DIALOG_BOTTOM_SHEET = define(2)
  def getName(value: AdwDialogPresentationMode): Option[String] =
    value match
      case `ADW_DIALOG_AUTO` => Some("ADW_DIALOG_AUTO")
      case `ADW_DIALOG_FLOATING` => Some("ADW_DIALOG_FLOATING")
      case `ADW_DIALOG_BOTTOM_SHEET` => Some("ADW_DIALOG_BOTTOM_SHEET")
      case _ => _root_.scala.None
  extension (a: AdwDialogPresentationMode)
    inline def &(b: AdwDialogPresentationMode): AdwDialogPresentationMode = a & b
    inline def |(b: AdwDialogPresentationMode): AdwDialogPresentationMode = a | b
    inline def is(b: AdwDialogPresentationMode): Boolean = (a & b) == b