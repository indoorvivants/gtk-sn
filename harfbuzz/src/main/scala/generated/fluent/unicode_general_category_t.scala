package sn.gnome.harfbuzz.fluent

import _root_.sn.gnome.harfbuzz.internal.hb_unicode_general_category_t

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Data type for the "General_Category" (gc) property from the Unicode
  * Character Database.
  */
enum Unicode_general_category_t(val raw: hb_unicode_general_category_t):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Cc]
    */
  case CONTROL
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CONTROL
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Cf]
    */
  case FORMAT
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_FORMAT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Cn]
    */
  case UNASSIGNED
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_UNASSIGNED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Co]
    */
  case PRIVATE_USE
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_PRIVATE_USE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Cs]
    */
  case SURROGATE
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_SURROGATE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Ll]
    */
  case LOWERCASE_LETTER
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_LOWERCASE_LETTER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Lm]
    */
  case MODIFIER_LETTER
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_MODIFIER_LETTER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Lo]
    */
  case OTHER_LETTER
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_LETTER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Lt]
    */
  case TITLECASE_LETTER
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_TITLECASE_LETTER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Lu]
    */
  case UPPERCASE_LETTER
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_UPPERCASE_LETTER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Mc]
    */
  case SPACING_MARK
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_SPACING_MARK
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Me]
    */
  case ENCLOSING_MARK
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_ENCLOSING_MARK
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Mn]
    */
  case NON_SPACING_MARK
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_NON_SPACING_MARK
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Nd]
    */
  case DECIMAL_NUMBER
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_DECIMAL_NUMBER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Nl]
    */
  case LETTER_NUMBER
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_LETTER_NUMBER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [No]
    */
  case OTHER_NUMBER
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_NUMBER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Pc]
    */
  case CONNECT_PUNCTUATION
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CONNECT_PUNCTUATION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Pd]
    */
  case DASH_PUNCTUATION
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_DASH_PUNCTUATION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Pe]
    */
  case CLOSE_PUNCTUATION
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CLOSE_PUNCTUATION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Pf]
    */
  case FINAL_PUNCTUATION
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_FINAL_PUNCTUATION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Pi]
    */
  case INITIAL_PUNCTUATION
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_INITIAL_PUNCTUATION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Po]
    */
  case OTHER_PUNCTUATION
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_PUNCTUATION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Ps]
    */
  case OPEN_PUNCTUATION
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OPEN_PUNCTUATION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Sc]
    */
  case CURRENCY_SYMBOL
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CURRENCY_SYMBOL
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Sk]
    */
  case MODIFIER_SYMBOL
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_MODIFIER_SYMBOL
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Sm]
    */
  case MATH_SYMBOL
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_MATH_SYMBOL
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [So]
    */
  case OTHER_SYMBOL
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_SYMBOL
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Zl]
    */
  case LINE_SEPARATOR
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_LINE_SEPARATOR
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Zp]
    */
  case PARAGRAPH_SEPARATOR
      extends Unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_PARAGRAPH_SEPARATOR
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Zs]
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
