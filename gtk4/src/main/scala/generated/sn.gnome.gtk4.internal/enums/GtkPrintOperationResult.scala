package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkPrintOperationResult: _PRINT_OPERATION_RESULT_ERROR: An error has occurred. _PRINT_OPERATION_RESULT_APPLY: The print settings should be stored. _PRINT_OPERATION_RESULT_CANCEL: The print operation has been canceled, the print settings should not be stored. _PRINT_OPERATION_RESULT_IN_PROGRESS: The print operation is not complete yet. This value will only be returned when running asynchronously.
*/
opaque type GtkPrintOperationResult = CUnsignedInt
object GtkPrintOperationResult extends _BindgenEnumCUnsignedInt[GtkPrintOperationResult]:
  given _tag: Tag[GtkPrintOperationResult] = Tag.UInt
  inline def define(inline a: Long): GtkPrintOperationResult = a.toUInt
  val GTK_PRINT_OPERATION_RESULT_ERROR = define(0)
  val GTK_PRINT_OPERATION_RESULT_APPLY = define(1)
  val GTK_PRINT_OPERATION_RESULT_CANCEL = define(2)
  val GTK_PRINT_OPERATION_RESULT_IN_PROGRESS = define(3)
  def getName(value: GtkPrintOperationResult): Option[String] =
    value match
      case `GTK_PRINT_OPERATION_RESULT_ERROR` => Some("GTK_PRINT_OPERATION_RESULT_ERROR")
      case `GTK_PRINT_OPERATION_RESULT_APPLY` => Some("GTK_PRINT_OPERATION_RESULT_APPLY")
      case `GTK_PRINT_OPERATION_RESULT_CANCEL` => Some("GTK_PRINT_OPERATION_RESULT_CANCEL")
      case `GTK_PRINT_OPERATION_RESULT_IN_PROGRESS` => Some("GTK_PRINT_OPERATION_RESULT_IN_PROGRESS")
      case _ => _root_.scala.None
  extension (a: GtkPrintOperationResult)
    inline def &(b: GtkPrintOperationResult): GtkPrintOperationResult = a & b
    inline def |(b: GtkPrintOperationResult): GtkPrintOperationResult = a | b
    inline def is(b: GtkPrintOperationResult): Boolean = (a & b) == b