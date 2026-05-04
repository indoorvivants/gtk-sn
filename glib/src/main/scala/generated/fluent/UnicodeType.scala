package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GUnicodeType

/** These are the possible character classifications from the Unicode
  * specification. See [Unicode Character
  * Database](http://www.unicode.org/reports/tr44/#General_Category_Values).
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum UnicodeType(val raw: GUnicodeType):
  /** General category "Other, Control" (Cc)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CONTROL extends UnicodeType(GUnicodeType.G_UNICODE_CONTROL)

  /** General category "Other, Format" (Cf)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FORMAT extends UnicodeType(GUnicodeType.G_UNICODE_FORMAT)

  /** General category "Other, Not Assigned" (Cn)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNASSIGNED extends UnicodeType(GUnicodeType.G_UNICODE_UNASSIGNED)

  /** General category "Other, Private Use" (Co)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PRIVATE_USE extends UnicodeType(GUnicodeType.G_UNICODE_PRIVATE_USE)

  /** General category "Other, Surrogate" (Cs)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SURROGATE extends UnicodeType(GUnicodeType.G_UNICODE_SURROGATE)

  /** General category "Letter, Lowercase" (Ll)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LOWERCASE_LETTER
      extends UnicodeType(GUnicodeType.G_UNICODE_LOWERCASE_LETTER)

  /** General category "Letter, Modifier" (Lm)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MODIFIER_LETTER
      extends UnicodeType(GUnicodeType.G_UNICODE_MODIFIER_LETTER)

  /** General category "Letter, Other" (Lo)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OTHER_LETTER extends UnicodeType(GUnicodeType.G_UNICODE_OTHER_LETTER)

  /** General category "Letter, Titlecase" (Lt)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TITLECASE_LETTER
      extends UnicodeType(GUnicodeType.G_UNICODE_TITLECASE_LETTER)

  /** General category "Letter, Uppercase" (Lu)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UPPERCASE_LETTER
      extends UnicodeType(GUnicodeType.G_UNICODE_UPPERCASE_LETTER)

  /** General category "Mark, Spacing" (Mc)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SPACING_MARK extends UnicodeType(GUnicodeType.G_UNICODE_SPACING_MARK)

  /** General category "Mark, Enclosing" (Me)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ENCLOSING_MARK extends UnicodeType(GUnicodeType.G_UNICODE_ENCLOSING_MARK)

  /** General category "Mark, Nonspacing" (Mn)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NON_SPACING_MARK
      extends UnicodeType(GUnicodeType.G_UNICODE_NON_SPACING_MARK)

  /** General category "Number, Decimal Digit" (Nd)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DECIMAL_NUMBER extends UnicodeType(GUnicodeType.G_UNICODE_DECIMAL_NUMBER)

  /** General category "Number, Letter" (Nl)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LETTER_NUMBER extends UnicodeType(GUnicodeType.G_UNICODE_LETTER_NUMBER)

  /** General category "Number, Other" (No)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OTHER_NUMBER extends UnicodeType(GUnicodeType.G_UNICODE_OTHER_NUMBER)

  /** General category "Punctuation, Connector" (Pc)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CONNECT_PUNCTUATION
      extends UnicodeType(GUnicodeType.G_UNICODE_CONNECT_PUNCTUATION)

  /** General category "Punctuation, Dash" (Pd)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DASH_PUNCTUATION
      extends UnicodeType(GUnicodeType.G_UNICODE_DASH_PUNCTUATION)

  /** General category "Punctuation, Close" (Pe)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CLOSE_PUNCTUATION
      extends UnicodeType(GUnicodeType.G_UNICODE_CLOSE_PUNCTUATION)

  /** General category "Punctuation, Final quote" (Pf)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FINAL_PUNCTUATION
      extends UnicodeType(GUnicodeType.G_UNICODE_FINAL_PUNCTUATION)

  /** General category "Punctuation, Initial quote" (Pi)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INITIAL_PUNCTUATION
      extends UnicodeType(GUnicodeType.G_UNICODE_INITIAL_PUNCTUATION)

  /** General category "Punctuation, Other" (Po)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OTHER_PUNCTUATION
      extends UnicodeType(GUnicodeType.G_UNICODE_OTHER_PUNCTUATION)

  /** General category "Punctuation, Open" (Ps)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OPEN_PUNCTUATION
      extends UnicodeType(GUnicodeType.G_UNICODE_OPEN_PUNCTUATION)

  /** General category "Symbol, Currency" (Sc)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CURRENCY_SYMBOL
      extends UnicodeType(GUnicodeType.G_UNICODE_CURRENCY_SYMBOL)

  /** General category "Symbol, Modifier" (Sk)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MODIFIER_SYMBOL
      extends UnicodeType(GUnicodeType.G_UNICODE_MODIFIER_SYMBOL)

  /** General category "Symbol, Math" (Sm)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MATH_SYMBOL extends UnicodeType(GUnicodeType.G_UNICODE_MATH_SYMBOL)

  /** General category "Symbol, Other" (So)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OTHER_SYMBOL extends UnicodeType(GUnicodeType.G_UNICODE_OTHER_SYMBOL)

  /** General category "Separator, Line" (Zl)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LINE_SEPARATOR extends UnicodeType(GUnicodeType.G_UNICODE_LINE_SEPARATOR)

  /** General category "Separator, Paragraph" (Zp)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PARAGRAPH_SEPARATOR
      extends UnicodeType(GUnicodeType.G_UNICODE_PARAGRAPH_SEPARATOR)

  /** General category "Separator, Space" (Zs)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
