package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GUnicodeBreakType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * These are the possible line break classifications.
  *
  * Since new unicode versions may add new types here, applications should be
  * ready to handle unknown values. They may be regarded as
  * %G_UNICODE_BREAK_UNKNOWN.
  *
  * See [Unicode Line Breaking
  * Algorithm](https://www.unicode.org/reports/tr14/).
  */
enum UnicodeBreakType(val raw: GUnicodeBreakType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Mandatory Break (BK)
    */
  case MANDATORY
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_MANDATORY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Carriage Return (CR)
    */
  case CARRIAGE_RETURN
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_CARRIAGE_RETURN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Line Feed (LF)
    */
  case LINE_FEED
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_LINE_FEED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attached Characters and Combining Marks (CM)
    */
  case COMBINING_MARK
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_COMBINING_MARK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Surrogates (SG)
    */
  case SURROGATE
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_SURROGATE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Zero Width Space (ZW)
    */
  case ZERO_WIDTH_SPACE
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_ZERO_WIDTH_SPACE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inseparable (IN)
    */
  case INSEPARABLE
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_INSEPARABLE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Non-breaking ("Glue") (GL)
    */
  case NON_BREAKING_GLUE
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_NON_BREAKING_GLUE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Contingent Break Opportunity (CB)
    */
  case CONTINGENT
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_CONTINGENT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Space (SP)
    */
  case SPACE extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_SPACE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Break Opportunity After (BA)
    */
  case AFTER extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_AFTER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Break Opportunity Before (BB)
    */
  case BEFORE extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_BEFORE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Break Opportunity Before and After (B2)
    */
  case BEFORE_AND_AFTER
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_BEFORE_AND_AFTER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hyphen (HY)
    */
  case HYPHEN extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_HYPHEN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Nonstarter (NS)
    */
  case NON_STARTER
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_NON_STARTER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Opening Punctuation (OP)
    */
  case OPEN_PUNCTUATION
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_OPEN_PUNCTUATION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Closing Punctuation (CL)
    */
  case CLOSE_PUNCTUATION
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_CLOSE_PUNCTUATION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ambiguous Quotation (QU)
    */
  case QUOTATION
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_QUOTATION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Exclamation/Interrogation (EX)
    */
  case EXCLAMATION
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_EXCLAMATION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ideographic (ID)
    */
  case IDEOGRAPHIC
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_IDEOGRAPHIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Numeric (NU)
    */
  case NUMERIC
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_NUMERIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Infix Separator (Numeric) (IS)
    */
  case INFIX_SEPARATOR
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_INFIX_SEPARATOR
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Symbols Allowing Break After (SY)
    */
  case SYMBOL extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_SYMBOL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ordinary Alphabetic and Symbol Characters (AL)
    */
  case ALPHABETIC
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_ALPHABETIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Prefix (Numeric) (PR)
    */
  case PREFIX extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_PREFIX)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Postfix (Numeric) (PO)
    */
  case POSTFIX
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_POSTFIX)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Complex Content Dependent (South East Asian) (SA)
    */
  case COMPLEX_CONTEXT
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_COMPLEX_CONTEXT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ambiguous (Alphabetic or Ideographic) (AI)
    */
  case AMBIGUOUS
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_AMBIGUOUS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unknown (XX)
    */
  case UNKNOWN
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_UNKNOWN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Next Line (NL)
    */
  case NEXT_LINE
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_NEXT_LINE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Word Joiner (WJ)
    */
  case WORD_JOINER
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_WORD_JOINER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hangul L Jamo (JL)
    */
  case HANGUL_L_JAMO
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_L_JAMO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hangul V Jamo (JV)
    */
  case HANGUL_V_JAMO
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_V_JAMO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hangul T Jamo (JT)
    */
  case HANGUL_T_JAMO
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_T_JAMO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hangul LV Syllable (H2)
    */
  case HANGUL_LV_SYLLABLE
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_LV_SYLLABLE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hangul LVT Syllable (H3)
    */
  case HANGUL_LVT_SYLLABLE
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_LVT_SYLLABLE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Closing Parenthesis (CP). Since 2.28. Deprecated: 2.70: Use
    * %G_UNICODE_BREAK_CLOSE_PARENTHESIS instead.
    */
  case CLOSE_PARANTHESIS
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_CLOSE_PARANTHESIS
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Closing Parenthesis (CP). Since 2.70
    */
  case CLOSE_PARENTHESIS
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_CLOSE_PARENTHESIS
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Conditional Japanese Starter (CJ). Since: 2.32
    */
  case CONDITIONAL_JAPANESE_STARTER
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_CONDITIONAL_JAPANESE_STARTER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hebrew Letter (HL). Since: 2.32
    */
  case HEBREW_LETTER
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_HEBREW_LETTER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Regional Indicator (RI). Since: 2.36
    */
  case REGIONAL_INDICATOR
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_REGIONAL_INDICATOR
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emoji Base (EB). Since: 2.50
    */
  case EMOJI_BASE
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_EMOJI_BASE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emoji Modifier (EM). Since: 2.50
    */
  case EMOJI_MODIFIER
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_EMOJI_MODIFIER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Zero Width Joiner (ZWJ). Since: 2.50
    */
  case ZERO_WIDTH_JOINER
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_ZERO_WIDTH_JOINER
      )
end UnicodeBreakType

object UnicodeBreakType:
  def fromRaw(raw: GUnicodeBreakType): UnicodeBreakType =
    raw match
      case GUnicodeBreakType.G_UNICODE_BREAK_MANDATORY =>
        UnicodeBreakType.MANDATORY
      case GUnicodeBreakType.G_UNICODE_BREAK_CARRIAGE_RETURN =>
        UnicodeBreakType.CARRIAGE_RETURN
      case GUnicodeBreakType.G_UNICODE_BREAK_LINE_FEED =>
        UnicodeBreakType.LINE_FEED
      case GUnicodeBreakType.G_UNICODE_BREAK_COMBINING_MARK =>
        UnicodeBreakType.COMBINING_MARK
      case GUnicodeBreakType.G_UNICODE_BREAK_SURROGATE =>
        UnicodeBreakType.SURROGATE
      case GUnicodeBreakType.G_UNICODE_BREAK_ZERO_WIDTH_SPACE =>
        UnicodeBreakType.ZERO_WIDTH_SPACE
      case GUnicodeBreakType.G_UNICODE_BREAK_INSEPARABLE =>
        UnicodeBreakType.INSEPARABLE
      case GUnicodeBreakType.G_UNICODE_BREAK_NON_BREAKING_GLUE =>
        UnicodeBreakType.NON_BREAKING_GLUE
      case GUnicodeBreakType.G_UNICODE_BREAK_CONTINGENT =>
        UnicodeBreakType.CONTINGENT
      case GUnicodeBreakType.G_UNICODE_BREAK_SPACE  => UnicodeBreakType.SPACE
      case GUnicodeBreakType.G_UNICODE_BREAK_AFTER  => UnicodeBreakType.AFTER
      case GUnicodeBreakType.G_UNICODE_BREAK_BEFORE => UnicodeBreakType.BEFORE
      case GUnicodeBreakType.G_UNICODE_BREAK_BEFORE_AND_AFTER =>
        UnicodeBreakType.BEFORE_AND_AFTER
      case GUnicodeBreakType.G_UNICODE_BREAK_HYPHEN => UnicodeBreakType.HYPHEN
      case GUnicodeBreakType.G_UNICODE_BREAK_NON_STARTER =>
        UnicodeBreakType.NON_STARTER
      case GUnicodeBreakType.G_UNICODE_BREAK_OPEN_PUNCTUATION =>
        UnicodeBreakType.OPEN_PUNCTUATION
      case GUnicodeBreakType.G_UNICODE_BREAK_CLOSE_PUNCTUATION =>
        UnicodeBreakType.CLOSE_PUNCTUATION
      case GUnicodeBreakType.G_UNICODE_BREAK_QUOTATION =>
        UnicodeBreakType.QUOTATION
      case GUnicodeBreakType.G_UNICODE_BREAK_EXCLAMATION =>
        UnicodeBreakType.EXCLAMATION
      case GUnicodeBreakType.G_UNICODE_BREAK_IDEOGRAPHIC =>
        UnicodeBreakType.IDEOGRAPHIC
      case GUnicodeBreakType.G_UNICODE_BREAK_NUMERIC => UnicodeBreakType.NUMERIC
      case GUnicodeBreakType.G_UNICODE_BREAK_INFIX_SEPARATOR =>
        UnicodeBreakType.INFIX_SEPARATOR
      case GUnicodeBreakType.G_UNICODE_BREAK_SYMBOL => UnicodeBreakType.SYMBOL
      case GUnicodeBreakType.G_UNICODE_BREAK_ALPHABETIC =>
        UnicodeBreakType.ALPHABETIC
      case GUnicodeBreakType.G_UNICODE_BREAK_PREFIX  => UnicodeBreakType.PREFIX
      case GUnicodeBreakType.G_UNICODE_BREAK_POSTFIX => UnicodeBreakType.POSTFIX
      case GUnicodeBreakType.G_UNICODE_BREAK_COMPLEX_CONTEXT =>
        UnicodeBreakType.COMPLEX_CONTEXT
      case GUnicodeBreakType.G_UNICODE_BREAK_AMBIGUOUS =>
        UnicodeBreakType.AMBIGUOUS
      case GUnicodeBreakType.G_UNICODE_BREAK_UNKNOWN => UnicodeBreakType.UNKNOWN
      case GUnicodeBreakType.G_UNICODE_BREAK_NEXT_LINE =>
        UnicodeBreakType.NEXT_LINE
      case GUnicodeBreakType.G_UNICODE_BREAK_WORD_JOINER =>
        UnicodeBreakType.WORD_JOINER
      case GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_L_JAMO =>
        UnicodeBreakType.HANGUL_L_JAMO
      case GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_V_JAMO =>
        UnicodeBreakType.HANGUL_V_JAMO
      case GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_T_JAMO =>
        UnicodeBreakType.HANGUL_T_JAMO
      case GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_LV_SYLLABLE =>
        UnicodeBreakType.HANGUL_LV_SYLLABLE
      case GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_LVT_SYLLABLE =>
        UnicodeBreakType.HANGUL_LVT_SYLLABLE
      case GUnicodeBreakType.G_UNICODE_BREAK_CLOSE_PARANTHESIS =>
        UnicodeBreakType.CLOSE_PARANTHESIS
      case GUnicodeBreakType.G_UNICODE_BREAK_CLOSE_PARENTHESIS =>
        UnicodeBreakType.CLOSE_PARENTHESIS
      case GUnicodeBreakType.G_UNICODE_BREAK_CONDITIONAL_JAPANESE_STARTER =>
        UnicodeBreakType.CONDITIONAL_JAPANESE_STARTER
      case GUnicodeBreakType.G_UNICODE_BREAK_HEBREW_LETTER =>
        UnicodeBreakType.HEBREW_LETTER
      case GUnicodeBreakType.G_UNICODE_BREAK_REGIONAL_INDICATOR =>
        UnicodeBreakType.REGIONAL_INDICATOR
      case GUnicodeBreakType.G_UNICODE_BREAK_EMOJI_BASE =>
        UnicodeBreakType.EMOJI_BASE
      case GUnicodeBreakType.G_UNICODE_BREAK_EMOJI_MODIFIER =>
        UnicodeBreakType.EMOJI_MODIFIER
      case GUnicodeBreakType.G_UNICODE_BREAK_ZERO_WIDTH_JOINER =>
        UnicodeBreakType.ZERO_WIDTH_JOINER
  end fromRaw
end UnicodeBreakType
