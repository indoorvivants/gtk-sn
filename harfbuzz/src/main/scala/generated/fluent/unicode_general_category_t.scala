package sn.gnome.harfbuzz.fluent

import _root_.sn.gnome.harfbuzz.internal.hb_unicode_general_category_t

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Data type for the "General_Category" (gc) property from the Unicode
  * Character Database.
  */
enum unicode_general_category_t(val raw: hb_unicode_general_category_t):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Cc]
    */
  case CONTROL
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CONTROL
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Cf]
    */
  case FORMAT
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_FORMAT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Cn]
    */
  case UNASSIGNED
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_UNASSIGNED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Co]
    */
  case PRIVATE_USE
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_PRIVATE_USE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Cs]
    */
  case SURROGATE
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_SURROGATE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Ll]
    */
  case LOWERCASE_LETTER
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_LOWERCASE_LETTER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Lm]
    */
  case MODIFIER_LETTER
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_MODIFIER_LETTER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Lo]
    */
  case OTHER_LETTER
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_LETTER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Lt]
    */
  case TITLECASE_LETTER
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_TITLECASE_LETTER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Lu]
    */
  case UPPERCASE_LETTER
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_UPPERCASE_LETTER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Mc]
    */
  case SPACING_MARK
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_SPACING_MARK
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Me]
    */
  case ENCLOSING_MARK
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_ENCLOSING_MARK
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Mn]
    */
  case NON_SPACING_MARK
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_NON_SPACING_MARK
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Nd]
    */
  case DECIMAL_NUMBER
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_DECIMAL_NUMBER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Nl]
    */
  case LETTER_NUMBER
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_LETTER_NUMBER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [No]
    */
  case OTHER_NUMBER
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_NUMBER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Pc]
    */
  case CONNECT_PUNCTUATION
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CONNECT_PUNCTUATION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Pd]
    */
  case DASH_PUNCTUATION
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_DASH_PUNCTUATION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Pe]
    */
  case CLOSE_PUNCTUATION
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CLOSE_PUNCTUATION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Pf]
    */
  case FINAL_PUNCTUATION
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_FINAL_PUNCTUATION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Pi]
    */
  case INITIAL_PUNCTUATION
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_INITIAL_PUNCTUATION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Po]
    */
  case OTHER_PUNCTUATION
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_PUNCTUATION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Ps]
    */
  case OPEN_PUNCTUATION
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OPEN_PUNCTUATION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Sc]
    */
  case CURRENCY_SYMBOL
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CURRENCY_SYMBOL
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Sk]
    */
  case MODIFIER_SYMBOL
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_MODIFIER_SYMBOL
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Sm]
    */
  case MATH_SYMBOL
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_MATH_SYMBOL
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [So]
    */
  case OTHER_SYMBOL
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_SYMBOL
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Zl]
    */
  case LINE_SEPARATOR
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_LINE_SEPARATOR
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Zp]
    */
  case PARAGRAPH_SEPARATOR
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_PARAGRAPH_SEPARATOR
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Zs]
    */
  case SPACE_SEPARATOR
      extends unicode_general_category_t(
        hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_SPACE_SEPARATOR
      )
end unicode_general_category_t

object unicode_general_category_t:
  def fromRaw(raw: hb_unicode_general_category_t): unicode_general_category_t =
    raw match
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CONTROL =>
        unicode_general_category_t.CONTROL
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_FORMAT =>
        unicode_general_category_t.FORMAT
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_UNASSIGNED =>
        unicode_general_category_t.UNASSIGNED
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_PRIVATE_USE =>
        unicode_general_category_t.PRIVATE_USE
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_SURROGATE =>
        unicode_general_category_t.SURROGATE
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_LOWERCASE_LETTER =>
        unicode_general_category_t.LOWERCASE_LETTER
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_MODIFIER_LETTER =>
        unicode_general_category_t.MODIFIER_LETTER
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_LETTER =>
        unicode_general_category_t.OTHER_LETTER
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_TITLECASE_LETTER =>
        unicode_general_category_t.TITLECASE_LETTER
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_UPPERCASE_LETTER =>
        unicode_general_category_t.UPPERCASE_LETTER
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_SPACING_MARK =>
        unicode_general_category_t.SPACING_MARK
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_ENCLOSING_MARK =>
        unicode_general_category_t.ENCLOSING_MARK
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_NON_SPACING_MARK =>
        unicode_general_category_t.NON_SPACING_MARK
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_DECIMAL_NUMBER =>
        unicode_general_category_t.DECIMAL_NUMBER
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_LETTER_NUMBER =>
        unicode_general_category_t.LETTER_NUMBER
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_NUMBER =>
        unicode_general_category_t.OTHER_NUMBER
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CONNECT_PUNCTUATION =>
        unicode_general_category_t.CONNECT_PUNCTUATION
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_DASH_PUNCTUATION =>
        unicode_general_category_t.DASH_PUNCTUATION
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CLOSE_PUNCTUATION =>
        unicode_general_category_t.CLOSE_PUNCTUATION
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_FINAL_PUNCTUATION =>
        unicode_general_category_t.FINAL_PUNCTUATION
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_INITIAL_PUNCTUATION =>
        unicode_general_category_t.INITIAL_PUNCTUATION
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_PUNCTUATION =>
        unicode_general_category_t.OTHER_PUNCTUATION
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OPEN_PUNCTUATION =>
        unicode_general_category_t.OPEN_PUNCTUATION
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_CURRENCY_SYMBOL =>
        unicode_general_category_t.CURRENCY_SYMBOL
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_MODIFIER_SYMBOL =>
        unicode_general_category_t.MODIFIER_SYMBOL
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_MATH_SYMBOL =>
        unicode_general_category_t.MATH_SYMBOL
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_OTHER_SYMBOL =>
        unicode_general_category_t.OTHER_SYMBOL
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_LINE_SEPARATOR =>
        unicode_general_category_t.LINE_SEPARATOR
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_PARAGRAPH_SEPARATOR =>
        unicode_general_category_t.PARAGRAPH_SEPARATOR
      case hb_unicode_general_category_t.HB_UNICODE_GENERAL_CATEGORY_SPACE_SEPARATOR =>
        unicode_general_category_t.SPACE_SEPARATOR
  end fromRaw
end unicode_general_category_t
