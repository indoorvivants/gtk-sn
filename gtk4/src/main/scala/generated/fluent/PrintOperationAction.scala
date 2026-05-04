package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPrintOperationAction

/** Determines what action the print operation should perform.
  *
  * A parameter of this typs is passed to [method@Gtk.PrintOperation.run].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum PrintOperationAction(val raw: GtkPrintOperationAction):
  /** Show the print dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PRINT_DIALOG
      extends PrintOperationAction(
        GtkPrintOperationAction.GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG
      )

  /** Start to print without showing the print dialog, based on the current
    * print settings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PRINT
      extends PrintOperationAction(
        GtkPrintOperationAction.GTK_PRINT_OPERATION_ACTION_PRINT
      )

  /** Show the print preview.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PREVIEW
      extends PrintOperationAction(
        GtkPrintOperationAction.GTK_PRINT_OPERATION_ACTION_PREVIEW
      )

  /** Export to a file. This requires the export-filename property to be set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EXPORT
      extends PrintOperationAction(
        GtkPrintOperationAction.GTK_PRINT_OPERATION_ACTION_EXPORT
      )
end PrintOperationAction

object PrintOperationAction:
  def fromRaw(raw: GtkPrintOperationAction): PrintOperationAction =
    raw match
      case GtkPrintOperationAction.GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG =>
        PrintOperationAction.PRINT_DIALOG
      case GtkPrintOperationAction.GTK_PRINT_OPERATION_ACTION_PRINT =>
        PrintOperationAction.PRINT
      case GtkPrintOperationAction.GTK_PRINT_OPERATION_ACTION_PREVIEW =>
        PrintOperationAction.PREVIEW
      case GtkPrintOperationAction.GTK_PRINT_OPERATION_ACTION_EXPORT =>
        PrintOperationAction.EXPORT
  end fromRaw
end PrintOperationAction
