package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPrintStatus

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The status gives a rough indication of the completion of a running print
  * operation.
  */
enum PrintStatus(val raw: GtkPrintStatus):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The printing has not started yet; this status is set initially, and while
    * the print dialog is shown.
    */
  case INITIAL extends PrintStatus(GtkPrintStatus.GTK_PRINT_STATUS_INITIAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This status is set while the begin-print signal is emitted and during
    * pagination.
    */
  case PREPARING extends PrintStatus(GtkPrintStatus.GTK_PRINT_STATUS_PREPARING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This status is set while the pages are being rendered.
    */
  case GENERATING_DATA
      extends PrintStatus(GtkPrintStatus.GTK_PRINT_STATUS_GENERATING_DATA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The print job is being sent off to the printer.
    */
  case SENDING_DATA
      extends PrintStatus(GtkPrintStatus.GTK_PRINT_STATUS_SENDING_DATA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The print job has been sent to the printer, but is not printed for some
    * reason, e.g. the printer may be stopped.
    */
  case PENDING extends PrintStatus(GtkPrintStatus.GTK_PRINT_STATUS_PENDING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Some problem has occurred during printing, e.g. a paper jam.
    */
  case PENDING_ISSUE
      extends PrintStatus(GtkPrintStatus.GTK_PRINT_STATUS_PENDING_ISSUE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The printer is processing the print job.
    */
  case PRINTING extends PrintStatus(GtkPrintStatus.GTK_PRINT_STATUS_PRINTING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The printing has been completed successfully.
    */
  case FINISHED extends PrintStatus(GtkPrintStatus.GTK_PRINT_STATUS_FINISHED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The printing has been aborted.
    */
  case FINISHED_ABORTED
      extends PrintStatus(GtkPrintStatus.GTK_PRINT_STATUS_FINISHED_ABORTED)
end PrintStatus

object PrintStatus:
  def fromRaw(raw: GtkPrintStatus): PrintStatus =
    raw match
      case GtkPrintStatus.GTK_PRINT_STATUS_INITIAL   => PrintStatus.INITIAL
      case GtkPrintStatus.GTK_PRINT_STATUS_PREPARING => PrintStatus.PREPARING
      case GtkPrintStatus.GTK_PRINT_STATUS_GENERATING_DATA =>
        PrintStatus.GENERATING_DATA
      case GtkPrintStatus.GTK_PRINT_STATUS_SENDING_DATA =>
        PrintStatus.SENDING_DATA
      case GtkPrintStatus.GTK_PRINT_STATUS_PENDING       => PrintStatus.PENDING
      case GtkPrintStatus.GTK_PRINT_STATUS_PENDING_ISSUE =>
        PrintStatus.PENDING_ISSUE
      case GtkPrintStatus.GTK_PRINT_STATUS_PRINTING => PrintStatus.PRINTING
      case GtkPrintStatus.GTK_PRINT_STATUS_FINISHED => PrintStatus.FINISHED
      case GtkPrintStatus.GTK_PRINT_STATUS_FINISHED_ABORTED =>
        PrintStatus.FINISHED_ABORTED
  end fromRaw
end PrintStatus
