package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkPrintOperationAction: _PRINT_OPERATION_ACTION_PRINT_DIALOG: Show the print dialog. _PRINT_OPERATION_ACTION_PRINT: Start to print without showing the print dialog, based on the current print settings. _PRINT_OPERATION_ACTION_PREVIEW: Show the print preview. _PRINT_OPERATION_ACTION_EXPORT: Export to a file. This requires the export-filename property to be set.
*/
opaque type GtkPrintOperationAction = CUnsignedInt
object GtkPrintOperationAction extends _BindgenEnumCUnsignedInt[GtkPrintOperationAction]:
  given _tag: Tag[GtkPrintOperationAction] = Tag.UInt
  inline def define(inline a: Long): GtkPrintOperationAction = a.toUInt
  val GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG = define(0)
  val GTK_PRINT_OPERATION_ACTION_PRINT = define(1)
  val GTK_PRINT_OPERATION_ACTION_PREVIEW = define(2)
  val GTK_PRINT_OPERATION_ACTION_EXPORT = define(3)
  def getName(value: GtkPrintOperationAction): Option[String] =
    value match
      case `GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG` => Some("GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG")
      case `GTK_PRINT_OPERATION_ACTION_PRINT` => Some("GTK_PRINT_OPERATION_ACTION_PRINT")
      case `GTK_PRINT_OPERATION_ACTION_PREVIEW` => Some("GTK_PRINT_OPERATION_ACTION_PREVIEW")
      case `GTK_PRINT_OPERATION_ACTION_EXPORT` => Some("GTK_PRINT_OPERATION_ACTION_EXPORT")
      case _ => _root_.scala.None
  extension (a: GtkPrintOperationAction)
    inline def &(b: GtkPrintOperationAction): GtkPrintOperationAction = a & b
    inline def |(b: GtkPrintOperationAction): GtkPrintOperationAction = a | b
    inline def is(b: GtkPrintOperationAction): Boolean = (a & b) == b