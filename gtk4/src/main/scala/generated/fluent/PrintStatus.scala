package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPrintStatus

/** The status gives a rough indication of the completion of a running print
  * operation.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum PrintStatus(val raw: GtkPrintStatus):
  /** The printing has not started yet; this status is set initially, and while
    * the print dialog is shown.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INITIAL extends PrintStatus(GtkPrintStatus.GTK_PRINT_STATUS_INITIAL)

  /** This status is set while the begin-print signal is emitted and during
    * pagination.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PREPARING extends PrintStatus(GtkPrintStatus.GTK_PRINT_STATUS_PREPARING)

  /** This status is set while the pages are being rendered.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GENERATING_DATA
      extends PrintStatus(GtkPrintStatus.GTK_PRINT_STATUS_GENERATING_DATA)

  /** The print job is being sent off to the printer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SENDING_DATA
      extends PrintStatus(GtkPrintStatus.GTK_PRINT_STATUS_SENDING_DATA)

  /** The print job has been sent to the printer, but is not printed for some
    * reason, e.g. the printer may be stopped.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PENDING extends PrintStatus(GtkPrintStatus.GTK_PRINT_STATUS_PENDING)

  /** Some problem has occurred during printing, e.g. a paper jam.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PENDING_ISSUE
      extends PrintStatus(GtkPrintStatus.GTK_PRINT_STATUS_PENDING_ISSUE)

  /** The printer is processing the print job.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PRINTING extends PrintStatus(GtkPrintStatus.GTK_PRINT_STATUS_PRINTING)

  /** The printing has been completed successfully.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FINISHED extends PrintStatus(GtkPrintStatus.GTK_PRINT_STATUS_FINISHED)

  /** The printing has been aborted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
