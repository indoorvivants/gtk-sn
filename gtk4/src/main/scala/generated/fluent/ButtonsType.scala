package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkButtonsType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Prebuilt sets of buttons for `GtkDialog`.
  *
  * If none of these choices are appropriate, simply use %GTK_BUTTONS_NONE and
  * call [method@Gtk.Dialog.add_buttons].
  *
  * > Please note that %GTK_BUTTONS_OK, %GTK_BUTTONS_YES_NO > and
  * %GTK_BUTTONS_OK_CANCEL are discouraged by the > [GNOME Human Interface
  * Guidelines](http://library.gnome.org/devel/hig-book/stable/).
  */
enum ButtonsType(val raw: GtkButtonsType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * no buttons at all
    */
  case NONE extends ButtonsType(GtkButtonsType.GTK_BUTTONS_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * an OK button
    */
  case OK extends ButtonsType(GtkButtonsType.GTK_BUTTONS_OK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a Close button
    */
  case CLOSE extends ButtonsType(GtkButtonsType.GTK_BUTTONS_CLOSE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a Cancel button
    */
  case CANCEL extends ButtonsType(GtkButtonsType.GTK_BUTTONS_CANCEL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Yes and No buttons
    */
  case YES_NO extends ButtonsType(GtkButtonsType.GTK_BUTTONS_YES_NO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * OK and Cancel buttons
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
