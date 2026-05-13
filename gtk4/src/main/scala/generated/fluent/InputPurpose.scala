package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkInputPurpose

/** Describes primary purpose of the input widget.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum InputPurpose(val raw: GtkInputPurpose):
  /** Allow any character
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FREE_FORM
      extends InputPurpose(GtkInputPurpose.GTK_INPUT_PURPOSE_FREE_FORM)

  /** Allow only alphabetic characters
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ALPHA extends InputPurpose(GtkInputPurpose.GTK_INPUT_PURPOSE_ALPHA)

  /** Allow only digits
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DIGITS extends InputPurpose(GtkInputPurpose.GTK_INPUT_PURPOSE_DIGITS)

  /** Edited field expects numbers
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NUMBER extends InputPurpose(GtkInputPurpose.GTK_INPUT_PURPOSE_NUMBER)

  /** Edited field expects phone number
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PHONE extends InputPurpose(GtkInputPurpose.GTK_INPUT_PURPOSE_PHONE)

  /** Edited field expects URL
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case URL extends InputPurpose(GtkInputPurpose.GTK_INPUT_PURPOSE_URL)

  /** Edited field expects email address
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EMAIL extends InputPurpose(GtkInputPurpose.GTK_INPUT_PURPOSE_EMAIL)

  /** Edited field expects the name of a person
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NAME extends InputPurpose(GtkInputPurpose.GTK_INPUT_PURPOSE_NAME)

  /** Like %GTK_INPUT_PURPOSE_FREE_FORM, but characters are hidden
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PASSWORD extends InputPurpose(GtkInputPurpose.GTK_INPUT_PURPOSE_PASSWORD)

  /** Like %GTK_INPUT_PURPOSE_DIGITS, but characters are hidden
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PIN extends InputPurpose(GtkInputPurpose.GTK_INPUT_PURPOSE_PIN)

  /** Allow any character, in addition to control codes
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
