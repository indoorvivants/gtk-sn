package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPrintError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Error codes that identify various errors that can occur while using the GTK
  * printing support.
  */
enum PrintError(val raw: GtkPrintError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An unspecified error occurred.
    */
  case GENERAL extends PrintError(GtkPrintError.GTK_PRINT_ERROR_GENERAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An internal error occurred.
    */
  case INTERNAL_ERROR
      extends PrintError(GtkPrintError.GTK_PRINT_ERROR_INTERNAL_ERROR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A memory allocation failed.
    */
  case NOMEM extends PrintError(GtkPrintError.GTK_PRINT_ERROR_NOMEM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An error occurred while loading a page setup or paper size from a key
    * file.
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
