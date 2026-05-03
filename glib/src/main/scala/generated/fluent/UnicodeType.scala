package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GUnicodeType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * These are the possible character classifications from the Unicode
  * specification. See [Unicode Character
  * Database](http://www.unicode.org/reports/tr44/#General_Category_Values).
  */
enum UnicodeType(val raw: GUnicodeType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Other, Control" (Cc)
    */
  case CONTROL extends UnicodeType(GUnicodeType.G_UNICODE_CONTROL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Other, Format" (Cf)
    */
  case FORMAT extends UnicodeType(GUnicodeType.G_UNICODE_FORMAT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Other, Not Assigned" (Cn)
    */
  case UNASSIGNED extends UnicodeType(GUnicodeType.G_UNICODE_UNASSIGNED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Other, Private Use" (Co)
    */
  case PRIVATE_USE extends UnicodeType(GUnicodeType.G_UNICODE_PRIVATE_USE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Other, Surrogate" (Cs)
    */
  case SURROGATE extends UnicodeType(GUnicodeType.G_UNICODE_SURROGATE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Letter, Lowercase" (Ll)
    */
  case LOWERCASE_LETTER
      extends UnicodeType(GUnicodeType.G_UNICODE_LOWERCASE_LETTER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Letter, Modifier" (Lm)
    */
  case MODIFIER_LETTER
      extends UnicodeType(GUnicodeType.G_UNICODE_MODIFIER_LETTER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Letter, Other" (Lo)
    */
  case OTHER_LETTER extends UnicodeType(GUnicodeType.G_UNICODE_OTHER_LETTER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Letter, Titlecase" (Lt)
    */
  case TITLECASE_LETTER
      extends UnicodeType(GUnicodeType.G_UNICODE_TITLECASE_LETTER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Letter, Uppercase" (Lu)
    */
  case UPPERCASE_LETTER
      extends UnicodeType(GUnicodeType.G_UNICODE_UPPERCASE_LETTER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Mark, Spacing" (Mc)
    */
  case SPACING_MARK extends UnicodeType(GUnicodeType.G_UNICODE_SPACING_MARK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Mark, Enclosing" (Me)
    */
  case ENCLOSING_MARK extends UnicodeType(GUnicodeType.G_UNICODE_ENCLOSING_MARK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Mark, Nonspacing" (Mn)
    */
  case NON_SPACING_MARK
      extends UnicodeType(GUnicodeType.G_UNICODE_NON_SPACING_MARK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Number, Decimal Digit" (Nd)
    */
  case DECIMAL_NUMBER extends UnicodeType(GUnicodeType.G_UNICODE_DECIMAL_NUMBER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Number, Letter" (Nl)
    */
  case LETTER_NUMBER extends UnicodeType(GUnicodeType.G_UNICODE_LETTER_NUMBER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Number, Other" (No)
    */
  case OTHER_NUMBER extends UnicodeType(GUnicodeType.G_UNICODE_OTHER_NUMBER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Punctuation, Connector" (Pc)
    */
  case CONNECT_PUNCTUATION
      extends UnicodeType(GUnicodeType.G_UNICODE_CONNECT_PUNCTUATION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Punctuation, Dash" (Pd)
    */
  case DASH_PUNCTUATION
      extends UnicodeType(GUnicodeType.G_UNICODE_DASH_PUNCTUATION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Punctuation, Close" (Pe)
    */
  case CLOSE_PUNCTUATION
      extends UnicodeType(GUnicodeType.G_UNICODE_CLOSE_PUNCTUATION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Punctuation, Final quote" (Pf)
    */
  case FINAL_PUNCTUATION
      extends UnicodeType(GUnicodeType.G_UNICODE_FINAL_PUNCTUATION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Punctuation, Initial quote" (Pi)
    */
  case INITIAL_PUNCTUATION
      extends UnicodeType(GUnicodeType.G_UNICODE_INITIAL_PUNCTUATION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Punctuation, Other" (Po)
    */
  case OTHER_PUNCTUATION
      extends UnicodeType(GUnicodeType.G_UNICODE_OTHER_PUNCTUATION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Punctuation, Open" (Ps)
    */
  case OPEN_PUNCTUATION
      extends UnicodeType(GUnicodeType.G_UNICODE_OPEN_PUNCTUATION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Symbol, Currency" (Sc)
    */
  case CURRENCY_SYMBOL
      extends UnicodeType(GUnicodeType.G_UNICODE_CURRENCY_SYMBOL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Symbol, Modifier" (Sk)
    */
  case MODIFIER_SYMBOL
      extends UnicodeType(GUnicodeType.G_UNICODE_MODIFIER_SYMBOL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Symbol, Math" (Sm)
    */
  case MATH_SYMBOL extends UnicodeType(GUnicodeType.G_UNICODE_MATH_SYMBOL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Symbol, Other" (So)
    */
  case OTHER_SYMBOL extends UnicodeType(GUnicodeType.G_UNICODE_OTHER_SYMBOL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Separator, Line" (Zl)
    */
  case LINE_SEPARATOR extends UnicodeType(GUnicodeType.G_UNICODE_LINE_SEPARATOR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Separator, Paragraph" (Zp)
    */
  case PARAGRAPH_SEPARATOR
      extends UnicodeType(GUnicodeType.G_UNICODE_PARAGRAPH_SEPARATOR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * General category "Separator, Space" (Zs)
    */
  case SPACE_SEPARATOR
      extends UnicodeType(GUnicodeType.G_UNICODE_SPACE_SEPARATOR)
end UnicodeType

object UnicodeType:
  def fromRaw(raw: GUnicodeType): UnicodeType =
    raw match
      case GUnicodeType.G_UNICODE_CONTROL          => UnicodeType.CONTROL
      case GUnicodeType.G_UNICODE_FORMAT           => UnicodeType.FORMAT
      case GUnicodeType.G_UNICODE_UNASSIGNED       => UnicodeType.UNASSIGNED
      case GUnicodeType.G_UNICODE_PRIVATE_USE      => UnicodeType.PRIVATE_USE
      case GUnicodeType.G_UNICODE_SURROGATE        => UnicodeType.SURROGATE
      case GUnicodeType.G_UNICODE_LOWERCASE_LETTER =>
        UnicodeType.LOWERCASE_LETTER
      case GUnicodeType.G_UNICODE_MODIFIER_LETTER => UnicodeType.MODIFIER_LETTER
      case GUnicodeType.G_UNICODE_OTHER_LETTER    => UnicodeType.OTHER_LETTER
      case GUnicodeType.G_UNICODE_TITLECASE_LETTER =>
        UnicodeType.TITLECASE_LETTER
      case GUnicodeType.G_UNICODE_UPPERCASE_LETTER =>
        UnicodeType.UPPERCASE_LETTER
      case GUnicodeType.G_UNICODE_SPACING_MARK     => UnicodeType.SPACING_MARK
      case GUnicodeType.G_UNICODE_ENCLOSING_MARK   => UnicodeType.ENCLOSING_MARK
      case GUnicodeType.G_UNICODE_NON_SPACING_MARK =>
        UnicodeType.NON_SPACING_MARK
      case GUnicodeType.G_UNICODE_DECIMAL_NUMBER => UnicodeType.DECIMAL_NUMBER
      case GUnicodeType.G_UNICODE_LETTER_NUMBER  => UnicodeType.LETTER_NUMBER
      case GUnicodeType.G_UNICODE_OTHER_NUMBER   => UnicodeType.OTHER_NUMBER
      case GUnicodeType.G_UNICODE_CONNECT_PUNCTUATION =>
        UnicodeType.CONNECT_PUNCTUATION
      case GUnicodeType.G_UNICODE_DASH_PUNCTUATION =>
        UnicodeType.DASH_PUNCTUATION
      case GUnicodeType.G_UNICODE_CLOSE_PUNCTUATION =>
        UnicodeType.CLOSE_PUNCTUATION
      case GUnicodeType.G_UNICODE_FINAL_PUNCTUATION =>
        UnicodeType.FINAL_PUNCTUATION
      case GUnicodeType.G_UNICODE_INITIAL_PUNCTUATION =>
        UnicodeType.INITIAL_PUNCTUATION
      case GUnicodeType.G_UNICODE_OTHER_PUNCTUATION =>
        UnicodeType.OTHER_PUNCTUATION
      case GUnicodeType.G_UNICODE_OPEN_PUNCTUATION =>
        UnicodeType.OPEN_PUNCTUATION
      case GUnicodeType.G_UNICODE_CURRENCY_SYMBOL => UnicodeType.CURRENCY_SYMBOL
      case GUnicodeType.G_UNICODE_MODIFIER_SYMBOL => UnicodeType.MODIFIER_SYMBOL
      case GUnicodeType.G_UNICODE_MATH_SYMBOL     => UnicodeType.MATH_SYMBOL
      case GUnicodeType.G_UNICODE_OTHER_SYMBOL    => UnicodeType.OTHER_SYMBOL
      case GUnicodeType.G_UNICODE_LINE_SEPARATOR  => UnicodeType.LINE_SEPARATOR
      case GUnicodeType.G_UNICODE_PARAGRAPH_SEPARATOR =>
        UnicodeType.PARAGRAPH_SEPARATOR
      case GUnicodeType.G_UNICODE_SPACE_SEPARATOR => UnicodeType.SPACE_SEPARATOR
  end fromRaw
end UnicodeType
