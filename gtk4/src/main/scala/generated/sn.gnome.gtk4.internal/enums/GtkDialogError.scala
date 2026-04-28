package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkDialogError: _DIALOG_ERROR_FAILED: Generic error condition for when an operation fails and no more specific code is applicable _DIALOG_ERROR_CANCELLED: The async function call was cancelled via its `GCancellable` _DIALOG_ERROR_DISMISSED: The operation was cancelled by the user (via a Cancel or Close button)
*/
opaque type GtkDialogError = CUnsignedInt
object GtkDialogError extends _BindgenEnumCUnsignedInt[GtkDialogError]:
  given _tag: Tag[GtkDialogError] = Tag.UInt
  inline def define(inline a: Long): GtkDialogError = a.toUInt
  val GTK_DIALOG_ERROR_FAILED = define(0)
  val GTK_DIALOG_ERROR_CANCELLED = define(1)
  val GTK_DIALOG_ERROR_DISMISSED = define(2)
  def getName(value: GtkDialogError): Option[String] =
    value match
      case `GTK_DIALOG_ERROR_FAILED` => Some("GTK_DIALOG_ERROR_FAILED")
      case `GTK_DIALOG_ERROR_CANCELLED` => Some("GTK_DIALOG_ERROR_CANCELLED")
      case `GTK_DIALOG_ERROR_DISMISSED` => Some("GTK_DIALOG_ERROR_DISMISSED")
      case _ => _root_.scala.None
  extension (a: GtkDialogError)
    inline def &(b: GtkDialogError): GtkDialogError = a & b
    inline def |(b: GtkDialogError): GtkDialogError = a | b
    inline def is(b: GtkDialogError): Boolean = (a & b) == b