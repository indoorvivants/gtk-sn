package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkFileChooserError

/** These identify the various errors that can occur while calling
  * `GtkFileChooser` functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum FileChooserError(val raw: GtkFileChooserError):
  /** Indicates that a file does not exist.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONEXISTENT
      extends FileChooserError(
        GtkFileChooserError.GTK_FILE_CHOOSER_ERROR_NONEXISTENT
      )

  /** Indicates a malformed filename.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BAD_FILENAME
      extends FileChooserError(
        GtkFileChooserError.GTK_FILE_CHOOSER_ERROR_BAD_FILENAME
      )

  /** Indicates a duplicate path (e.g. when adding a bookmark).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ALREADY_EXISTS
      extends FileChooserError(
        GtkFileChooserError.GTK_FILE_CHOOSER_ERROR_ALREADY_EXISTS
      )

  /** Indicates an incomplete hostname (e.g. "http://foo" without a slash after
    * that).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
