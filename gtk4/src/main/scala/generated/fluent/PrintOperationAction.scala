package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPrintOperationAction

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Determines what action the print operation should perform.
  *
  * A parameter of this typs is passed to [method@Gtk.PrintOperation.run].
  */
enum PrintOperationAction(val raw: GtkPrintOperationAction):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Show the print dialog.
    */
  case PRINT_DIALOG
      extends PrintOperationAction(
        GtkPrintOperationAction.GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Start to print without showing the print dialog, based on the current
    * print settings.
    */
  case PRINT
      extends PrintOperationAction(
        GtkPrintOperationAction.GTK_PRINT_OPERATION_ACTION_PRINT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Show the print preview.
    */
  case PREVIEW
      extends PrintOperationAction(
        GtkPrintOperationAction.GTK_PRINT_OPERATION_ACTION_PREVIEW
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Export to a file. This requires the export-filename property to be set.
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
