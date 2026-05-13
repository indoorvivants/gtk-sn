package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.hb_unicode_general_category_t

/** Data type for the "General_Category" (gc) property from the Unicode
  * Character Database.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Unicode_general_category_t(val raw: hb_unicode_general_category_t):
  /** [Cc]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CONTROL
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CONTROL
      )

  /** [Cf]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FORMAT
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_FORMAT
      )

  /** [Cn]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNASSIGNED
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_UNASSIGNED
      )

  /** [Co]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PRIVATE_USE
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_PRIVATE_USE
      )

  /** [Cs]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SURROGATE
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_SURROGATE
      )

  /** [Ll]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LOWERCASE_LETTER
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_LOWERCASE_LETTER
      )

  /** [Lm]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MODIFIER_LETTER
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_MODIFIER_LETTER
      )

  /** [Lo]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OTHER_LETTER
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_LETTER
      )

  /** [Lt]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TITLECASE_LETTER
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_TITLECASE_LETTER
      )

  /** [Lu]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UPPERCASE_LETTER
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_UPPERCASE_LETTER
      )

  /** [Mc]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SPACING_MARK
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_SPACING_MARK
      )

  /** [Me]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ENCLOSING_MARK
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_ENCLOSING_MARK
      )

  /** [Mn]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NON_SPACING_MARK
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_NON_SPACING_MARK
      )

  /** [Nd]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DECIMAL_NUMBER
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_DECIMAL_NUMBER
      )

  /** [Nl]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LETTER_NUMBER
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_LETTER_NUMBER
      )

  /** [No]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OTHER_NUMBER
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_NUMBER
      )

  /** [Pc]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CONNECT_PUNCTUATION
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CONNECT_PUNCTUATION
      )

  /** [Pd]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DASH_PUNCTUATION
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_DASH_PUNCTUATION
      )

  /** [Pe]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CLOSE_PUNCTUATION
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CLOSE_PUNCTUATION
      )

  /** [Pf]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FINAL_PUNCTUATION
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_FINAL_PUNCTUATION
      )

  /** [Pi]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INITIAL_PUNCTUATION
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_INITIAL_PUNCTUATION
      )

  /** [Po]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OTHER_PUNCTUATION
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_PUNCTUATION
      )

  /** [Ps]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OPEN_PUNCTUATION
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OPEN_PUNCTUATION
      )

  /** [Sc]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CURRENCY_SYMBOL
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CURRENCY_SYMBOL
      )

  /** [Sk]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MODIFIER_SYMBOL
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_MODIFIER_SYMBOL
      )

  /** [Sm]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MATH_SYMBOL
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_MATH_SYMBOL
      )

  /** [So]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OTHER_SYMBOL
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_SYMBOL
      )

  /** [Zl]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LINE_SEPARATOR
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_LINE_SEPARATOR
      )

  /** [Zp]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PARAGRAPH_SEPARATOR
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_PARAGRAPH_SEPARATOR
      )

  /** [Zs]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SPACE_SEPARATOR
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_SPACE_SEPARATOR
      )
end Unicode_general_category_t

object Unicode_general_category_t:
  def fromRaw(raw: hb_unicode_general_category_t): Unicode_general_category_t =
    raw match
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CONTROL =>
        Unicode_general_category_t.CONTROL
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_FORMAT =>
        Unicode_general_category_t.FORMAT
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_UNASSIGNED =>
        Unicode_general_category_t.UNASSIGNED
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_PRIVATE_USE =>
        Unicode_general_category_t.PRIVATE_USE
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_SURROGATE =>
        Unicode_general_category_t.SURROGATE
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_LOWERCASE_LETTER =>
        Unicode_general_category_t.LOWERCASE_LETTER
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_MODIFIER_LETTER =>
        Unicode_general_category_t.MODIFIER_LETTER
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_LETTER =>
        Unicode_general_category_t.OTHER_LETTER
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_TITLECASE_LETTER =>
        Unicode_general_category_t.TITLECASE_LETTER
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_UPPERCASE_LETTER =>
        Unicode_general_category_t.UPPERCASE_LETTER
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_SPACING_MARK =>
        Unicode_general_category_t.SPACING_MARK
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_ENCLOSING_MARK =>
        Unicode_general_category_t.ENCLOSING_MARK
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_NON_SPACING_MARK =>
        Unicode_general_category_t.NON_SPACING_MARK
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_DECIMAL_NUMBER =>
        Unicode_general_category_t.DECIMAL_NUMBER
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_LETTER_NUMBER =>
        Unicode_general_category_t.LETTER_NUMBER
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_NUMBER =>
        Unicode_general_category_t.OTHER_NUMBER
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CONNECT_PUNCTUATION =>
        Unicode_general_category_t.CONNECT_PUNCTUATION
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_DASH_PUNCTUATION =>
        Unicode_general_category_t.DASH_PUNCTUATION
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CLOSE_PUNCTUATION =>
        Unicode_general_category_t.CLOSE_PUNCTUATION
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_FINAL_PUNCTUATION =>
        Unicode_general_category_t.FINAL_PUNCTUATION
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_INITIAL_PUNCTUATION =>
        Unicode_general_category_t.INITIAL_PUNCTUATION
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_PUNCTUATION =>
        Unicode_general_category_t.OTHER_PUNCTUATION
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OPEN_PUNCTUATION =>
        Unicode_general_category_t.OPEN_PUNCTUATION
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CURRENCY_SYMBOL =>
        Unicode_general_category_t.CURRENCY_SYMBOL
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_MODIFIER_SYMBOL =>
        Unicode_general_category_t.MODIFIER_SYMBOL
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_MATH_SYMBOL =>
        Unicode_general_category_t.MATH_SYMBOL
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_SYMBOL =>
        Unicode_general_category_t.OTHER_SYMBOL
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_LINE_SEPARATOR =>
        Unicode_general_category_t.LINE_SEPARATOR
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_PARAGRAPH_SEPARATOR =>
        Unicode_general_category_t.PARAGRAPH_SEPARATOR
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_SPACE_SEPARATOR =>
        Unicode_general_category_t.SPACE_SEPARATOR
  end fromRaw
end Unicode_general_category_t
