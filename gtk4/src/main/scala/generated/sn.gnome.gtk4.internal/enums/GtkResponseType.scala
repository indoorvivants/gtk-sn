package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkResponseType: _RESPONSE_NONE: Returned if an action widget has no response id, or if the dialog gets programmatically hidden or destroyed _RESPONSE_REJECT: Generic response id, not used by GTK dialogs _RESPONSE_ACCEPT: Generic response id, not used by GTK dialogs _RESPONSE_DELETE_EVENT: Returned if the dialog is deleted _RESPONSE_OK: Returned by OK buttons in GTK dialogs _RESPONSE_CANCEL: Returned by Cancel buttons in GTK dialogs _RESPONSE_CLOSE: Returned by Close buttons in GTK dialogs _RESPONSE_YES: Returned by Yes buttons in GTK dialogs _RESPONSE_NO: Returned by No buttons in GTK dialogs _RESPONSE_APPLY: Returned by Apply buttons in GTK dialogs _RESPONSE_HELP: Returned by Help buttons in GTK dialogs
*/
opaque type GtkResponseType = CInt
object GtkResponseType extends _BindgenEnumCInt[GtkResponseType]:
  given _tag: Tag[GtkResponseType] = Tag.Int
  inline def define(inline a: CInt): GtkResponseType = a
  val GTK_RESPONSE_NONE = define(-1)
  val GTK_RESPONSE_REJECT = define(-2)
  val GTK_RESPONSE_ACCEPT = define(-3)
  val GTK_RESPONSE_DELETE_EVENT = define(-4)
  val GTK_RESPONSE_OK = define(-5)
  val GTK_RESPONSE_CANCEL = define(-6)
  val GTK_RESPONSE_CLOSE = define(-7)
  val GTK_RESPONSE_YES = define(-8)
  val GTK_RESPONSE_NO = define(-9)
  val GTK_RESPONSE_APPLY = define(-10)
  val GTK_RESPONSE_HELP = define(-11)
  def getName(value: GtkResponseType): Option[String] =
    value match
      case `GTK_RESPONSE_NONE` => Some("GTK_RESPONSE_NONE")
      case `GTK_RESPONSE_REJECT` => Some("GTK_RESPONSE_REJECT")
      case `GTK_RESPONSE_ACCEPT` => Some("GTK_RESPONSE_ACCEPT")
      case `GTK_RESPONSE_DELETE_EVENT` => Some("GTK_RESPONSE_DELETE_EVENT")
      case `GTK_RESPONSE_OK` => Some("GTK_RESPONSE_OK")
      case `GTK_RESPONSE_CANCEL` => Some("GTK_RESPONSE_CANCEL")
      case `GTK_RESPONSE_CLOSE` => Some("GTK_RESPONSE_CLOSE")
      case `GTK_RESPONSE_YES` => Some("GTK_RESPONSE_YES")
      case `GTK_RESPONSE_NO` => Some("GTK_RESPONSE_NO")
      case `GTK_RESPONSE_APPLY` => Some("GTK_RESPONSE_APPLY")
      case `GTK_RESPONSE_HELP` => Some("GTK_RESPONSE_HELP")
      case _ => _root_.scala.None
  extension (a: GtkResponseType)
    inline def &(b: GtkResponseType): GtkResponseType = a & b
    inline def |(b: GtkResponseType): GtkResponseType = a | b
    inline def is(b: GtkResponseType): Boolean = (a & b) == b