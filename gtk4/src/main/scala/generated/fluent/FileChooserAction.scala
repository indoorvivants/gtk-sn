package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkFileChooserAction

/** Describes whether a `GtkFileChooser` is being used to open existing files or
  * to save to a possibly new file.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum FileChooserAction(val raw: GtkFileChooserAction):
  /** Indicates open mode. The file chooser will only let the user pick an
    * existing file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OPEN
      extends FileChooserAction(
        GtkFileChooserAction.GTK_FILE_CHOOSER_ACTION_OPEN
      )

  /** Indicates save mode. The file chooser will let the user pick an existing
    * file, or type in a new filename.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SAVE
      extends FileChooserAction(
        GtkFileChooserAction.GTK_FILE_CHOOSER_ACTION_SAVE
      )

  /** Indicates an Open mode for selecting folders. The file chooser will let
    * the user pick an existing folder.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
