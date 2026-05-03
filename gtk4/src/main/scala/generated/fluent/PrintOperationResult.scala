package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPrintOperationResult

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The result of a print operation.
  *
  * A value of this type is returned by [method@Gtk.PrintOperation.run].
  */
enum PrintOperationResult(val raw: GtkPrintOperationResult):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An error has occurred.
    */
  case ERROR
      extends PrintOperationResult(
        GtkPrintOperationResult.GTK_PRINT_OPERATION_RESULT_ERROR
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The print settings should be stored.
    */
  case APPLY
      extends PrintOperationResult(
        GtkPrintOperationResult.GTK_PRINT_OPERATION_RESULT_APPLY
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The print operation has been canceled, the print settings should not be
    * stored.
    */
  case CANCEL
      extends PrintOperationResult(
        GtkPrintOperationResult.GTK_PRINT_OPERATION_RESULT_CANCEL
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The print operation is not complete yet. This value will only be returned
    * when running asynchronously.
    */
  case IN_PROGRESS
      extends PrintOperationResult(
        GtkPrintOperationResult.GTK_PRINT_OPERATION_RESULT_IN_PROGRESS
      )
end PrintOperationResult

object PrintOperationResult:
  def fromRaw(raw: GtkPrintOperationResult): PrintOperationResult =
    raw match
      case GtkPrintOperationResult.GTK_PRINT_OPERATION_RESULT_ERROR =>
        PrintOperationResult.ERROR
      case GtkPrintOperationResult.GTK_PRINT_OPERATION_RESULT_APPLY =>
        PrintOperationResult.APPLY
      case GtkPrintOperationResult.GTK_PRINT_OPERATION_RESULT_CANCEL =>
        PrintOperationResult.CANCEL
      case GtkPrintOperationResult.GTK_PRINT_OPERATION_RESULT_IN_PROGRESS =>
        PrintOperationResult.IN_PROGRESS
  end fromRaw
end PrintOperationResult
