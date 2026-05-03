package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkButtonsType: _BUTTONS_NONE: no buttons at all _BUTTONS_OK: an OK button _BUTTONS_CLOSE: a Close button _BUTTONS_CANCEL: a Cancel button _BUTTONS_YES_NO: Yes and No buttons _BUTTONS_OK_CANCEL: OK and Cancel buttons
*/
opaque type GtkButtonsType = CUnsignedInt
object GtkButtonsType extends _BindgenEnumCUnsignedInt[GtkButtonsType]:
  given _tag: Tag[GtkButtonsType] = Tag.UInt
  inline def define(inline a: Long): GtkButtonsType = a.toUInt
  val GTK_BUTTONS_NONE = define(0)
  val GTK_BUTTONS_OK = define(1)
  val GTK_BUTTONS_CLOSE = define(2)
  val GTK_BUTTONS_CANCEL = define(3)
  val GTK_BUTTONS_YES_NO = define(4)
  val GTK_BUTTONS_OK_CANCEL = define(5)
  def getName(value: GtkButtonsType): Option[String] =
    value match
      case `GTK_BUTTONS_NONE` => Some("GTK_BUTTONS_NONE")
      case `GTK_BUTTONS_OK` => Some("GTK_BUTTONS_OK")
      case `GTK_BUTTONS_CLOSE` => Some("GTK_BUTTONS_CLOSE")
      case `GTK_BUTTONS_CANCEL` => Some("GTK_BUTTONS_CANCEL")
      case `GTK_BUTTONS_YES_NO` => Some("GTK_BUTTONS_YES_NO")
      case `GTK_BUTTONS_OK_CANCEL` => Some("GTK_BUTTONS_OK_CANCEL")
      case _ => _root_.scala.None
  extension (a: GtkButtonsType)
    inline def &(b: GtkButtonsType): GtkButtonsType = a & b
    inline def |(b: GtkButtonsType): GtkButtonsType = a | b
    inline def is(b: GtkButtonsType): Boolean = (a & b) == b