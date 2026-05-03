package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkInputPurpose

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Describes primary purpose of the input widget.
  *
  * This information is useful for on-screen keyboards and similar input methods
  * to decide which keys should be presented to the user.
  *
  * Note that the purpose is not meant to impose a totally strict rule about
  * allowed characters, and does not replace input validation. It is fine for an
  * on-screen keyboard to let the user override the character set restriction
  * that is expressed by the purpose. The application is expected to validate
  * the entry contents, even if it specified a purpose.
  *
  * The difference between %GTK_INPUT_PURPOSE_DIGITS and
  * %GTK_INPUT_PURPOSE_NUMBER is that the former accepts only digits while the
  * latter also some punctuation (like commas or points, plus, minus) and “e” or
  * “E” as in 3.14E+000.
  *
  * This enumeration may be extended in the future; input methods should
  * interpret unknown values as “free form”.
  */
enum InputPurpose(val raw: GtkInputPurpose):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Allow any character
    */
  case FREE_FORM
      extends InputPurpose(GtkInputPurpose.GTK_INPUT_PURPOSE_FREE_FORM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Allow only alphabetic characters
    */
  case ALPHA extends InputPurpose(GtkInputPurpose.GTK_INPUT_PURPOSE_ALPHA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Allow only digits
    */
  case DIGITS extends InputPurpose(GtkInputPurpose.GTK_INPUT_PURPOSE_DIGITS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Edited field expects numbers
    */
  case NUMBER extends InputPurpose(GtkInputPurpose.GTK_INPUT_PURPOSE_NUMBER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Edited field expects phone number
    */
  case PHONE extends InputPurpose(GtkInputPurpose.GTK_INPUT_PURPOSE_PHONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Edited field expects URL
    */
  case URL extends InputPurpose(GtkInputPurpose.GTK_INPUT_PURPOSE_URL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Edited field expects email address
    */
  case EMAIL extends InputPurpose(GtkInputPurpose.GTK_INPUT_PURPOSE_EMAIL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Edited field expects the name of a person
    */
  case NAME extends InputPurpose(GtkInputPurpose.GTK_INPUT_PURPOSE_NAME)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Like %GTK_INPUT_PURPOSE_FREE_FORM, but characters are hidden
    */
  case PASSWORD extends InputPurpose(GtkInputPurpose.GTK_INPUT_PURPOSE_PASSWORD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Like %GTK_INPUT_PURPOSE_DIGITS, but characters are hidden
    */
  case PIN extends InputPurpose(GtkInputPurpose.GTK_INPUT_PURPOSE_PIN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Allow any character, in addition to control codes
    */
  case TERMINAL extends InputPurpose(GtkInputPurpose.GTK_INPUT_PURPOSE_TERMINAL)
end InputPurpose

object InputPurpose:
  def fromRaw(raw: GtkInputPurpose): InputPurpose =
    raw match
      case GtkInputPurpose.GTK_INPUT_PURPOSE_FREE_FORM => InputPurpose.FREE_FORM
      case GtkInputPurpose.GTK_INPUT_PURPOSE_ALPHA     => InputPurpose.ALPHA
      case GtkInputPurpose.GTK_INPUT_PURPOSE_DIGITS    => InputPurpose.DIGITS
      case GtkInputPurpose.GTK_INPUT_PURPOSE_NUMBER    => InputPurpose.NUMBER
      case GtkInputPurpose.GTK_INPUT_PURPOSE_PHONE     => InputPurpose.PHONE
      case GtkInputPurpose.GTK_INPUT_PURPOSE_URL       => InputPurpose.URL
      case GtkInputPurpose.GTK_INPUT_PURPOSE_EMAIL     => InputPurpose.EMAIL
      case GtkInputPurpose.GTK_INPUT_PURPOSE_NAME      => InputPurpose.NAME
      case GtkInputPurpose.GTK_INPUT_PURPOSE_PASSWORD  => InputPurpose.PASSWORD
      case GtkInputPurpose.GTK_INPUT_PURPOSE_PIN       => InputPurpose.PIN
      case GtkInputPurpose.GTK_INPUT_PURPOSE_TERMINAL  => InputPurpose.TERMINAL
  end fromRaw
end InputPurpose
