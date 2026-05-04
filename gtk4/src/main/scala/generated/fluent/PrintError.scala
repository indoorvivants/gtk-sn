package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPrintError

/** Error codes that identify various errors that can occur while using the GTK
  * printing support.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum PrintError(val raw: GtkPrintError):
  /** An unspecified error occurred.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GENERAL extends PrintError(GtkPrintError.GTK_PRINT_ERROR_GENERAL)

  /** An internal error occurred.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INTERNAL_ERROR
      extends PrintError(GtkPrintError.GTK_PRINT_ERROR_INTERNAL_ERROR)

  /** A memory allocation failed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOMEM extends PrintError(GtkPrintError.GTK_PRINT_ERROR_NOMEM)

  /** An error occurred while loading a page setup or paper size from a key
    * file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_FILE
      extends PrintError(GtkPrintError.GTK_PRINT_ERROR_INVALID_FILE)
end PrintError

object PrintError:
  def fromRaw(raw: GtkPrintError): PrintError =
    raw match
      case GtkPrintError.GTK_PRINT_ERROR_GENERAL        => PrintError.GENERAL
      case GtkPrintError.GTK_PRINT_ERROR_INTERNAL_ERROR =>
        PrintError.INTERNAL_ERROR
      case GtkPrintError.GTK_PRINT_ERROR_NOMEM        => PrintError.NOMEM
      case GtkPrintError.GTK_PRINT_ERROR_INVALID_FILE => PrintError.INVALID_FILE
  end fromRaw
end PrintError
