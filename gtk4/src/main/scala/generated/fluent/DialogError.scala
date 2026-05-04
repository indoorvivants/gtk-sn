package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkDialogError

/** Error codes in the `GTK_DIALOG_ERROR` domain that can be returned by async
  * dialog functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum DialogError(val raw: GtkDialogError):
  /** Generic error condition for when an operation fails and no more specific
    * code is applicable
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FAILED extends DialogError(GtkDialogError.GTK_DIALOG_ERROR_FAILED)

  /** The async function call was cancelled via its `GCancellable`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CANCELLED extends DialogError(GtkDialogError.GTK_DIALOG_ERROR_CANCELLED)

  /** The operation was cancelled by the user (via a Cancel or Close button)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
