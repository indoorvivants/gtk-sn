package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPrintOperationResult

/** The result of a print operation.
  *
  * A value of this type is returned by [method@Gtk.PrintOperation.run].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum PrintOperationResult(val raw: GtkPrintOperationResult):
  /** An error has occurred.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ERROR
      extends PrintOperationResult(
        GtkPrintOperationResult.GTK_PRINT_OPERATION_RESULT_ERROR
      )

  /** The print settings should be stored.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case APPLY
      extends PrintOperationResult(
        GtkPrintOperationResult.GTK_PRINT_OPERATION_RESULT_APPLY
      )

  /** The print operation has been canceled, the print settings should not be
    * stored.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CANCEL
      extends PrintOperationResult(
        GtkPrintOperationResult.GTK_PRINT_OPERATION_RESULT_CANCEL
      )

  /** The print operation is not complete yet. This value will only be returned
    * when running asynchronously.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
