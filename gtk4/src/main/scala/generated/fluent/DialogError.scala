package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkDialogError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Error codes in the `GTK_DIALOG_ERROR` domain that can be returned by async
  * dialog functions.
  */
enum DialogError(val raw: GtkDialogError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Generic error condition for when an operation fails and no more specific
    * code is applicable
    */
  case FAILED extends DialogError(GtkDialogError.GTK_DIALOG_ERROR_FAILED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The async function call was cancelled via its `GCancellable`
    */
  case CANCELLED extends DialogError(GtkDialogError.GTK_DIALOG_ERROR_CANCELLED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The operation was cancelled by the user (via a Cancel or Close button)
    */
  case DISMISSED extends DialogError(GtkDialogError.GTK_DIALOG_ERROR_DISMISSED)
end DialogError

object DialogError:
  def fromRaw(raw: GtkDialogError): DialogError =
    raw match
      case GtkDialogError.GTK_DIALOG_ERROR_FAILED    => DialogError.FAILED
      case GtkDialogError.GTK_DIALOG_ERROR_CANCELLED => DialogError.CANCELLED
      case GtkDialogError.GTK_DIALOG_ERROR_DISMISSED => DialogError.DISMISSED
  end fromRaw
end DialogError
