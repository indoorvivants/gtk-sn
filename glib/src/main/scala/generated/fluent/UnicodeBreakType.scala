package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GUnicodeBreakType

/** These are the possible line break classifications.
  *
  * Since new unicode versions may add new types here, applications should be
  * ready to handle unknown values. They may be regarded as
  * %G_UNICODE_BREAK_UNKNOWN.
  *
  * See [Unicode Line Breaking
  * Algorithm](https://www.unicode.org/reports/tr14/).
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum UnicodeBreakType(val raw: GUnicodeBreakType):
  /** Mandatory Break (BK)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MANDATORY
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_MANDATORY)

  /** Carriage Return (CR)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CARRIAGE_RETURN
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_CARRIAGE_RETURN
      )

  /** Line Feed (LF)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LINE_FEED
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_LINE_FEED)

  /** Attached Characters and Combining Marks (CM)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COMBINING_MARK
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_COMBINING_MARK)

  /** Surrogates (SG)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SURROGATE
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_SURROGATE)

  /** Zero Width Space (ZW)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ZERO_WIDTH_SPACE
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_ZERO_WIDTH_SPACE
      )

  /** Inseparable (IN)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INSEPARABLE
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_INSEPARABLE)

  /** Non-breaking ("Glue") (GL)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NON_BREAKING_GLUE
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_NON_BREAKING_GLUE
      )

  /** Contingent Break Opportunity (CB)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CONTINGENT
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_CONTINGENT)

  /** Space (SP)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SPACE extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_SPACE)

  /** Break Opportunity After (BA)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case AFTER extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_AFTER)

  /** Break Opportunity Before (BB)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BEFORE extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_BEFORE)

  /** Break Opportunity Before and After (B2)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BEFORE_AND_AFTER
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_BEFORE_AND_AFTER
      )

  /** Hyphen (HY)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HYPHEN extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_HYPHEN)

  /** Nonstarter (NS)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NON_STARTER
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_NON_STARTER)

  /** Opening Punctuation (OP)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OPEN_PUNCTUATION
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_OPEN_PUNCTUATION
      )

  /** Closing Punctuation (CL)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CLOSE_PUNCTUATION
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_CLOSE_PUNCTUATION
      )

  /** Ambiguous Quotation (QU)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case QUOTATION
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_QUOTATION)

  /** Exclamation/Interrogation (EX)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EXCLAMATION
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_EXCLAMATION)

  /** Ideographic (ID)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case IDEOGRAPHIC
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_IDEOGRAPHIC)

  /** Numeric (NU)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NUMERIC
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_NUMERIC)

  /** Infix Separator (Numeric) (IS)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INFIX_SEPARATOR
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_INFIX_SEPARATOR
      )

  /** Symbols Allowing Break After (SY)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SYMBOL extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_SYMBOL)

  /** Ordinary Alphabetic and Symbol Characters (AL)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ALPHABETIC
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_ALPHABETIC)

  /** Prefix (Numeric) (PR)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PREFIX extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_PREFIX)

  /** Postfix (Numeric) (PO)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case POSTFIX
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_POSTFIX)

  /** Complex Content Dependent (South East Asian) (SA)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COMPLEX_CONTEXT
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_COMPLEX_CONTEXT
      )

  /** Ambiguous (Alphabetic or Ideographic) (AI)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case AMBIGUOUS
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_AMBIGUOUS)

  /** Unknown (XX)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_UNKNOWN)

  /** Next Line (NL)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NEXT_LINE
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_NEXT_LINE)

  /** Word Joiner (WJ)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WORD_JOINER
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_WORD_JOINER)

  /** Hangul L Jamo (JL)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HANGUL_L_JAMO
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_L_JAMO)

  /** Hangul V Jamo (JV)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HANGUL_V_JAMO
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_V_JAMO)

  /** Hangul T Jamo (JT)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HANGUL_T_JAMO
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_T_JAMO)

  /** Hangul LV Syllable (H2)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HANGUL_LV_SYLLABLE
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_LV_SYLLABLE
      )

  /** Hangul LVT Syllable (H3)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HANGUL_LVT_SYLLABLE
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_HANGUL_LVT_SYLLABLE
      )

  /** Closing Parenthesis (CP). Since 2.28. Deprecated: 2.70: Use
    * %G_UNICODE_BREAK_CLOSE_PARENTHESIS instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CLOSE_PARANTHESIS
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_CLOSE_PARANTHESIS
      )

  /** Closing Parenthesis (CP). Since 2.70
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CLOSE_PARENTHESIS
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_CLOSE_PARENTHESIS
      )

  /** Conditional Japanese Starter (CJ). Since: 2.32
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CONDITIONAL_JAPANESE_STARTER
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_CONDITIONAL_JAPANESE_STARTER
      )

  /** Hebrew Letter (HL). Since: 2.32
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HEBREW_LETTER
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_HEBREW_LETTER)

  /** Regional Indicator (RI). Since: 2.36
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case REGIONAL_INDICATOR
      extends UnicodeBreakType(
        GUnicodeBreakType.G_UNICODE_BREAK_REGIONAL_INDICATOR
      )

  /** Emoji Base (EB). Since: 2.50
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EMOJI_BASE
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_EMOJI_BASE)

  /** Emoji Modifier (EM). Since: 2.50
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EMOJI_MODIFIER
      extends UnicodeBreakType(GUnicodeBreakType.G_UNICODE_BREAK_EMOJI_MODIFIER)

  /** Zero Width Joiner (ZWJ). Since: 2.50
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
