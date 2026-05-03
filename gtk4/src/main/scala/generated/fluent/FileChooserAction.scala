package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkFileChooserAction

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Describes whether a `GtkFileChooser` is being used to open existing files or
  * to save to a possibly new file.
  */
enum FileChooserAction(val raw: GtkFileChooserAction):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates open mode. The file chooser will only let the user pick an
    * existing file.
    */
  case OPEN
      extends FileChooserAction(
        GtkFileChooserAction.GTK_FILE_CHOOSER_ACTION_OPEN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates save mode. The file chooser will let the user pick an existing
    * file, or type in a new filename.
    */
  case SAVE
      extends FileChooserAction(
        GtkFileChooserAction.GTK_FILE_CHOOSER_ACTION_SAVE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates an Open mode for selecting folders. The file chooser will let
    * the user pick an existing folder.
    */
  case SELECT_FOLDER
      extends FileChooserAction(
        GtkFileChooserAction.GTK_FILE_CHOOSER_ACTION_SELECT_FOLDER
      )
end FileChooserAction

object FileChooserAction:
  def fromRaw(raw: GtkFileChooserAction): FileChooserAction =
    raw match
      case GtkFileChooserAction.GTK_FILE_CHOOSER_ACTION_OPEN =>
        FileChooserAction.OPEN
      case GtkFileChooserAction.GTK_FILE_CHOOSER_ACTION_SAVE =>
        FileChooserAction.SAVE
      case GtkFileChooserAction.GTK_FILE_CHOOSER_ACTION_SELECT_FOLDER =>
        FileChooserAction.SELECT_FOLDER
  end fromRaw
end FileChooserAction
