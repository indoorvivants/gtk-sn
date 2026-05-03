package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkFileChooserError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * These identify the various errors that can occur while calling
  * `GtkFileChooser` functions.
  */
enum FileChooserError(val raw: GtkFileChooserError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates that a file does not exist.
    */
  case NONEXISTENT
      extends FileChooserError(
        GtkFileChooserError.GTK_FILE_CHOOSER_ERROR_NONEXISTENT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates a malformed filename.
    */
  case BAD_FILENAME
      extends FileChooserError(
        GtkFileChooserError.GTK_FILE_CHOOSER_ERROR_BAD_FILENAME
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates a duplicate path (e.g. when adding a bookmark).
    */
  case ALREADY_EXISTS
      extends FileChooserError(
        GtkFileChooserError.GTK_FILE_CHOOSER_ERROR_ALREADY_EXISTS
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates an incomplete hostname (e.g. "http://foo" without a slash after
    * that).
    */
  case INCOMPLETE_HOSTNAME
      extends FileChooserError(
        GtkFileChooserError.GTK_FILE_CHOOSER_ERROR_INCOMPLETE_HOSTNAME
      )
end FileChooserError

object FileChooserError:
  def fromRaw(raw: GtkFileChooserError): FileChooserError =
    raw match
      case GtkFileChooserError.GTK_FILE_CHOOSER_ERROR_NONEXISTENT =>
        FileChooserError.NONEXISTENT
      case GtkFileChooserError.GTK_FILE_CHOOSER_ERROR_BAD_FILENAME =>
        FileChooserError.BAD_FILENAME
      case GtkFileChooserError.GTK_FILE_CHOOSER_ERROR_ALREADY_EXISTS =>
        FileChooserError.ALREADY_EXISTS
      case GtkFileChooserError.GTK_FILE_CHOOSER_ERROR_INCOMPLETE_HOSTNAME =>
        FileChooserError.INCOMPLETE_HOSTNAME
  end fromRaw
end FileChooserError
