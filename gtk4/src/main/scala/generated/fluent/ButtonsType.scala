package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkButtonsType

/** Prebuilt sets of buttons for `GtkDialog`.
  *
  * If none of these choices are appropriate, simply use %GTK_BUTTONS_NONE and
  * call [method@Gtk.Dialog.add_buttons].
  *
  * > Please note that %GTK_BUTTONS_OK, %GTK_BUTTONS_YES_NO > and
  * %GTK_BUTTONS_OK_CANCEL are discouraged by the > [GNOME Human Interface
  * Guidelines](http://library.gnome.org/devel/hig-book/stable/).
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ButtonsType(val raw: GtkButtonsType):
  /** no buttons at all
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends ButtonsType(GtkButtonsType.GTK_BUTTONS_NONE)

  /** an OK button
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OK extends ButtonsType(GtkButtonsType.GTK_BUTTONS_OK)

  /** a Close button
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CLOSE extends ButtonsType(GtkButtonsType.GTK_BUTTONS_CLOSE)

  /** a Cancel button
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CANCEL extends ButtonsType(GtkButtonsType.GTK_BUTTONS_CANCEL)

  /** Yes and No buttons
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case YES_NO extends ButtonsType(GtkButtonsType.GTK_BUTTONS_YES_NO)

  /** OK and Cancel buttons
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OK_CANCEL extends ButtonsType(GtkButtonsType.GTK_BUTTONS_OK_CANCEL)
end ButtonsType

object ButtonsType:
  def fromRaw(raw: GtkButtonsType): ButtonsType =
    raw match
      case GtkButtonsType.GTK_BUTTONS_NONE      => ButtonsType.NONE
      case GtkButtonsType.GTK_BUTTONS_OK        => ButtonsType.OK
      case GtkButtonsType.GTK_BUTTONS_CLOSE     => ButtonsType.CLOSE
      case GtkButtonsType.GTK_BUTTONS_CANCEL    => ButtonsType.CANCEL
      case GtkButtonsType.GTK_BUTTONS_YES_NO    => ButtonsType.YES_NO
      case GtkButtonsType.GTK_BUTTONS_OK_CANCEL => ButtonsType.OK_CANCEL
  end fromRaw
end ButtonsType
