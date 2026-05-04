package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoScript

/** The `PangoScript` enumeration identifies different writing systems.
  *
  * The values correspond to the names as defined in the Unicode standard. See
  * [Unicode Standard Annex 24: Script
  * names](http://www.unicode.org/reports/tr24/)
  *
  * Note that this enumeration is deprecated and will not be updated to include
  * values in newer versions of the Unicode standard. Applications should use
  * the [enum@GLib.UnicodeScript] enumeration instead, whose values are
  * interchangeable with `PangoScript`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Script(val raw: PangoScript):
  /** a value never returned from pango_script_for_unichar()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_CODE extends Script(PangoScript.PANGO_SCRIPT_INVALID_CODE)

  /** a character used by multiple different scripts
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COMMON extends Script(PangoScript.PANGO_SCRIPT_COMMON)

  /** a mark glyph that takes its script from the base glyph to which it is
    * attached
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INHERITED extends Script(PangoScript.PANGO_SCRIPT_INHERITED)

  /** Arabic
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ARABIC extends Script(PangoScript.PANGO_SCRIPT_ARABIC)

  /** Armenian
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ARMENIAN extends Script(PangoScript.PANGO_SCRIPT_ARMENIAN)

  /** Bengali
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BENGALI extends Script(PangoScript.PANGO_SCRIPT_BENGALI)

  /** Bopomofo
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BOPOMOFO extends Script(PangoScript.PANGO_SCRIPT_BOPOMOFO)

  /** Cherokee
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CHEROKEE extends Script(PangoScript.PANGO_SCRIPT_CHEROKEE)

  /** Coptic
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COPTIC extends Script(PangoScript.PANGO_SCRIPT_COPTIC)

  /** Cyrillic
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CYRILLIC extends Script(PangoScript.PANGO_SCRIPT_CYRILLIC)

  /** Deseret
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DESERET extends Script(PangoScript.PANGO_SCRIPT_DESERET)

  /** Devanagari
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DEVANAGARI extends Script(PangoScript.PANGO_SCRIPT_DEVANAGARI)

  /** Ethiopic
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ETHIOPIC extends Script(PangoScript.PANGO_SCRIPT_ETHIOPIC)

  /** Georgian
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GEORGIAN extends Script(PangoScript.PANGO_SCRIPT_GEORGIAN)

  /** Gothic
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GOTHIC extends Script(PangoScript.PANGO_SCRIPT_GOTHIC)

  /** Greek
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GREEK extends Script(PangoScript.PANGO_SCRIPT_GREEK)

  /** Gujarati
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GUJARATI extends Script(PangoScript.PANGO_SCRIPT_GUJARATI)

  /** Gurmukhi
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GURMUKHI extends Script(PangoScript.PANGO_SCRIPT_GURMUKHI)

  /** Han
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HAN extends Script(PangoScript.PANGO_SCRIPT_HAN)

  /** Hangul
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HANGUL extends Script(PangoScript.PANGO_SCRIPT_HANGUL)

  /** Hebrew
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HEBREW extends Script(PangoScript.PANGO_SCRIPT_HEBREW)

  /** Hiragana
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HIRAGANA extends Script(PangoScript.PANGO_SCRIPT_HIRAGANA)

  /** Kannada
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case KANNADA extends Script(PangoScript.PANGO_SCRIPT_KANNADA)

  /** Katakana
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case KATAKANA extends Script(PangoScript.PANGO_SCRIPT_KATAKANA)

  /** Khmer
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case KHMER extends Script(PangoScript.PANGO_SCRIPT_KHMER)

  /** Lao
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LAO extends Script(PangoScript.PANGO_SCRIPT_LAO)

  /** Latin
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LATIN extends Script(PangoScript.PANGO_SCRIPT_LATIN)

  /** Malayalam
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MALAYALAM extends Script(PangoScript.PANGO_SCRIPT_MALAYALAM)

  /** Mongolian
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MONGOLIAN extends Script(PangoScript.PANGO_SCRIPT_MONGOLIAN)

  /** Myanmar
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MYANMAR extends Script(PangoScript.PANGO_SCRIPT_MYANMAR)

  /** Ogham
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OGHAM extends Script(PangoScript.PANGO_SCRIPT_OGHAM)

  /** Old Italic
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OLD_ITALIC extends Script(PangoScript.PANGO_SCRIPT_OLD_ITALIC)

  /** Oriya
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ORIYA extends Script(PangoScript.PANGO_SCRIPT_ORIYA)

  /** Runic
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RUNIC extends Script(PangoScript.PANGO_SCRIPT_RUNIC)

  /** Sinhala
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SINHALA extends Script(PangoScript.PANGO_SCRIPT_SINHALA)

  /** Syriac
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SYRIAC extends Script(PangoScript.PANGO_SCRIPT_SYRIAC)

  /** Tamil
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TAMIL extends Script(PangoScript.PANGO_SCRIPT_TAMIL)

  /** Telugu
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TELUGU extends Script(PangoScript.PANGO_SCRIPT_TELUGU)

  /** Thaana
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case THAANA extends Script(PangoScript.PANGO_SCRIPT_THAANA)

  /** Thai
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case THAI extends Script(PangoScript.PANGO_SCRIPT_THAI)

  /** Tibetan
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TIBETAN extends Script(PangoScript.PANGO_SCRIPT_TIBETAN)

  /** Canadian Aboriginal
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CANADIAN_ABORIGINAL
      extends Script(PangoScript.PANGO_SCRIPT_CANADIAN_ABORIGINAL)

  /** Yi
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case YI extends Script(PangoScript.PANGO_SCRIPT_YI)

  /** Tagalog
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TAGALOG extends Script(PangoScript.PANGO_SCRIPT_TAGALOG)

  /** Hanunoo
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HANUNOO extends Script(PangoScript.PANGO_SCRIPT_HANUNOO)

  /** Buhid
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BUHID extends Script(PangoScript.PANGO_SCRIPT_BUHID)

  /** Tagbanwa
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TAGBANWA extends Script(PangoScript.PANGO_SCRIPT_TAGBANWA)

  /** Braille
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BRAILLE extends Script(PangoScript.PANGO_SCRIPT_BRAILLE)

  /** Cypriot
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CYPRIOT extends Script(PangoScript.PANGO_SCRIPT_CYPRIOT)

  /** Limbu
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LIMBU extends Script(PangoScript.PANGO_SCRIPT_LIMBU)

  /** Osmanya
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OSMANYA extends Script(PangoScript.PANGO_SCRIPT_OSMANYA)

  /** Shavian
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SHAVIAN extends Script(PangoScript.PANGO_SCRIPT_SHAVIAN)

  /** Linear B
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LINEAR_B extends Script(PangoScript.PANGO_SCRIPT_LINEAR_B)

  /** Tai Le
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TAI_LE extends Script(PangoScript.PANGO_SCRIPT_TAI_LE)

  /** Ugaritic
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UGARITIC extends Script(PangoScript.PANGO_SCRIPT_UGARITIC)

  /** New Tai Lue. Since 1.10
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NEW_TAI_LUE extends Script(PangoScript.PANGO_SCRIPT_NEW_TAI_LUE)

  /** Buginese. Since 1.10
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BUGINESE extends Script(PangoScript.PANGO_SCRIPT_BUGINESE)

  /** Glagolitic. Since 1.10
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GLAGOLITIC extends Script(PangoScript.PANGO_SCRIPT_GLAGOLITIC)

  /** Tifinagh. Since 1.10
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TIFINAGH extends Script(PangoScript.PANGO_SCRIPT_TIFINAGH)

  /** Syloti Nagri. Since 1.10
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SYLOTI_NAGRI extends Script(PangoScript.PANGO_SCRIPT_SYLOTI_NAGRI)

  /** Old Persian. Since 1.10
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OLD_PERSIAN extends Script(PangoScript.PANGO_SCRIPT_OLD_PERSIAN)

  /** Kharoshthi. Since 1.10
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case KHAROSHTHI extends Script(PangoScript.PANGO_SCRIPT_KHAROSHTHI)

  /** an unassigned code point. Since 1.14
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN extends Script(PangoScript.PANGO_SCRIPT_UNKNOWN)

  /** Balinese. Since 1.14
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BALINESE extends Script(PangoScript.PANGO_SCRIPT_BALINESE)

  /** Cuneiform. Since 1.14
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CUNEIFORM extends Script(PangoScript.PANGO_SCRIPT_CUNEIFORM)

  /** Phoenician. Since 1.14
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PHOENICIAN extends Script(PangoScript.PANGO_SCRIPT_PHOENICIAN)

  /** Phags-pa. Since 1.14
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PHAGS_PA extends Script(PangoScript.PANGO_SCRIPT_PHAGS_PA)

  /** N'Ko. Since 1.14
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NKO extends Script(PangoScript.PANGO_SCRIPT_NKO)

  /** Kayah Li. Since 1.20.1
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case KAYAH_LI extends Script(PangoScript.PANGO_SCRIPT_KAYAH_LI)

  /** Lepcha. Since 1.20.1
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LEPCHA extends Script(PangoScript.PANGO_SCRIPT_LEPCHA)

  /** Rejang. Since 1.20.1
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case REJANG extends Script(PangoScript.PANGO_SCRIPT_REJANG)

  /** Sundanese. Since 1.20.1
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SUNDANESE extends Script(PangoScript.PANGO_SCRIPT_SUNDANESE)

  /** Saurashtra. Since 1.20.1
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SAURASHTRA extends Script(PangoScript.PANGO_SCRIPT_SAURASHTRA)

  /** Cham. Since 1.20.1
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CHAM extends Script(PangoScript.PANGO_SCRIPT_CHAM)

  /** Ol Chiki. Since 1.20.1
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OL_CHIKI extends Script(PangoScript.PANGO_SCRIPT_OL_CHIKI)

  /** Vai. Since 1.20.1
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VAI extends Script(PangoScript.PANGO_SCRIPT_VAI)

  /** Carian. Since 1.20.1
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CARIAN extends Script(PangoScript.PANGO_SCRIPT_CARIAN)

  /** Lycian. Since 1.20.1
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LYCIAN extends Script(PangoScript.PANGO_SCRIPT_LYCIAN)

  /** Lydian. Since 1.20.1
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LYDIAN extends Script(PangoScript.PANGO_SCRIPT_LYDIAN)

  /** Batak. Since 1.32
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BATAK extends Script(PangoScript.PANGO_SCRIPT_BATAK)

  /** Brahmi. Since 1.32
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BRAHMI extends Script(PangoScript.PANGO_SCRIPT_BRAHMI)

  /** Mandaic. Since 1.32
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MANDAIC extends Script(PangoScript.PANGO_SCRIPT_MANDAIC)

  /** Chakma. Since: 1.32
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CHAKMA extends Script(PangoScript.PANGO_SCRIPT_CHAKMA)

  /** Meroitic Cursive. Since: 1.32
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MEROITIC_CURSIVE
      extends Script(PangoScript.PANGO_SCRIPT_MEROITIC_CURSIVE)

  /** Meroitic Hieroglyphs. Since: 1.32
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MEROITIC_HIEROGLYPHS
      extends Script(PangoScript.PANGO_SCRIPT_MEROITIC_HIEROGLYPHS)

  /** Miao. Since: 1.32
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MIAO extends Script(PangoScript.PANGO_SCRIPT_MIAO)

  /** Sharada. Since: 1.32
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SHARADA extends Script(PangoScript.PANGO_SCRIPT_SHARADA)

  /** Sora Sompeng. Since: 1.32
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SORA_SOMPENG extends Script(PangoScript.PANGO_SCRIPT_SORA_SOMPENG)

  /** Takri. Since: 1.32
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TAKRI extends Script(PangoScript.PANGO_SCRIPT_TAKRI)

  /** Bassa. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BASSA_VAH extends Script(PangoScript.PANGO_SCRIPT_BASSA_VAH)

  /** Caucasian Albanian. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CAUCASIAN_ALBANIAN
      extends Script(PangoScript.PANGO_SCRIPT_CAUCASIAN_ALBANIAN)

  /** Duployan. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DUPLOYAN extends Script(PangoScript.PANGO_SCRIPT_DUPLOYAN)

  /** Elbasan. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ELBASAN extends Script(PangoScript.PANGO_SCRIPT_ELBASAN)

  /** Grantha. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GRANTHA extends Script(PangoScript.PANGO_SCRIPT_GRANTHA)

  /** Kjohki. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case KHOJKI extends Script(PangoScript.PANGO_SCRIPT_KHOJKI)

  /** Khudawadi, Sindhi. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case KHUDAWADI extends Script(PangoScript.PANGO_SCRIPT_KHUDAWADI)

  /** Linear A. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LINEAR_A extends Script(PangoScript.PANGO_SCRIPT_LINEAR_A)

  /** Mahajani. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MAHAJANI extends Script(PangoScript.PANGO_SCRIPT_MAHAJANI)

  /** Manichaean. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MANICHAEAN extends Script(PangoScript.PANGO_SCRIPT_MANICHAEAN)

  /** Mende Kikakui. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MENDE_KIKAKUI extends Script(PangoScript.PANGO_SCRIPT_MENDE_KIKAKUI)

  /** Modi. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MODI extends Script(PangoScript.PANGO_SCRIPT_MODI)

  /** Mro. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MRO extends Script(PangoScript.PANGO_SCRIPT_MRO)

  /** Nabataean. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NABATAEAN extends Script(PangoScript.PANGO_SCRIPT_NABATAEAN)

  /** Old North Arabian. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OLD_NORTH_ARABIAN
      extends Script(PangoScript.PANGO_SCRIPT_OLD_NORTH_ARABIAN)

  /** Old Permic. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OLD_PERMIC extends Script(PangoScript.PANGO_SCRIPT_OLD_PERMIC)

  /** Pahawh Hmong. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PAHAWH_HMONG extends Script(PangoScript.PANGO_SCRIPT_PAHAWH_HMONG)

  /** Palmyrene. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PALMYRENE extends Script(PangoScript.PANGO_SCRIPT_PALMYRENE)

  /** Pau Cin Hau. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PAU_CIN_HAU extends Script(PangoScript.PANGO_SCRIPT_PAU_CIN_HAU)

  /** Psalter Pahlavi. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PSALTER_PAHLAVI extends Script(PangoScript.PANGO_SCRIPT_PSALTER_PAHLAVI)

  /** Siddham. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SIDDHAM extends Script(PangoScript.PANGO_SCRIPT_SIDDHAM)

  /** Tirhuta. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TIRHUTA extends Script(PangoScript.PANGO_SCRIPT_TIRHUTA)

  /** Warang Citi. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WARANG_CITI extends Script(PangoScript.PANGO_SCRIPT_WARANG_CITI)

  /** Ahom. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case AHOM extends Script(PangoScript.PANGO_SCRIPT_AHOM)

  /** Anatolian Hieroglyphs. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ANATOLIAN_HIEROGLYPHS
      extends Script(PangoScript.PANGO_SCRIPT_ANATOLIAN_HIEROGLYPHS)

  /** Hatran. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HATRAN extends Script(PangoScript.PANGO_SCRIPT_HATRAN)

  /** Multani. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MULTANI extends Script(PangoScript.PANGO_SCRIPT_MULTANI)

  /** Old Hungarian. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OLD_HUNGARIAN extends Script(PangoScript.PANGO_SCRIPT_OLD_HUNGARIAN)

  /** Signwriting. Since: 1.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SIGNWRITING extends Script(PangoScript.PANGO_SCRIPT_SIGNWRITING)
end Script

object Script:
  def fromRaw(raw: PangoScript): Script =
    raw match
      case PangoScript.PANGO_SCRIPT_INVALID_CODE        => Script.INVALID_CODE
      case PangoScript.PANGO_SCRIPT_COMMON              => Script.COMMON
      case PangoScript.PANGO_SCRIPT_INHERITED           => Script.INHERITED
      case PangoScript.PANGO_SCRIPT_ARABIC              => Script.ARABIC
      case PangoScript.PANGO_SCRIPT_ARMENIAN            => Script.ARMENIAN
      case PangoScript.PANGO_SCRIPT_BENGALI             => Script.BENGALI
      case PangoScript.PANGO_SCRIPT_BOPOMOFO            => Script.BOPOMOFO
      case PangoScript.PANGO_SCRIPT_CHEROKEE            => Script.CHEROKEE
      case PangoScript.PANGO_SCRIPT_COPTIC              => Script.COPTIC
      case PangoScript.PANGO_SCRIPT_CYRILLIC            => Script.CYRILLIC
      case PangoScript.PANGO_SCRIPT_DESERET             => Script.DESERET
      case PangoScript.PANGO_SCRIPT_DEVANAGARI          => Script.DEVANAGARI
      case PangoScript.PANGO_SCRIPT_ETHIOPIC            => Script.ETHIOPIC
      case PangoScript.PANGO_SCRIPT_GEORGIAN            => Script.GEORGIAN
      case PangoScript.PANGO_SCRIPT_GOTHIC              => Script.GOTHIC
      case PangoScript.PANGO_SCRIPT_GREEK               => Script.GREEK
      case PangoScript.PANGO_SCRIPT_GUJARATI            => Script.GUJARATI
      case PangoScript.PANGO_SCRIPT_GURMUKHI            => Script.GURMUKHI
      case PangoScript.PANGO_SCRIPT_HAN                 => Script.HAN
      case PangoScript.PANGO_SCRIPT_HANGUL              => Script.HANGUL
      case PangoScript.PANGO_SCRIPT_HEBREW              => Script.HEBREW
      case PangoScript.PANGO_SCRIPT_HIRAGANA            => Script.HIRAGANA
      case PangoScript.PANGO_SCRIPT_KANNADA             => Script.KANNADA
      case PangoScript.PANGO_SCRIPT_KATAKANA            => Script.KATAKANA
      case PangoScript.PANGO_SCRIPT_KHMER               => Script.KHMER
      case PangoScript.PANGO_SCRIPT_LAO                 => Script.LAO
      case PangoScript.PANGO_SCRIPT_LATIN               => Script.LATIN
      case PangoScript.PANGO_SCRIPT_MALAYALAM           => Script.MALAYALAM
      case PangoScript.PANGO_SCRIPT_MONGOLIAN           => Script.MONGOLIAN
      case PangoScript.PANGO_SCRIPT_MYANMAR             => Script.MYANMAR
      case PangoScript.PANGO_SCRIPT_OGHAM               => Script.OGHAM
      case PangoScript.PANGO_SCRIPT_OLD_ITALIC          => Script.OLD_ITALIC
      case PangoScript.PANGO_SCRIPT_ORIYA               => Script.ORIYA
      case PangoScript.PANGO_SCRIPT_RUNIC               => Script.RUNIC
      case PangoScript.PANGO_SCRIPT_SINHALA             => Script.SINHALA
      case PangoScript.PANGO_SCRIPT_SYRIAC              => Script.SYRIAC
      case PangoScript.PANGO_SCRIPT_TAMIL               => Script.TAMIL
      case PangoScript.PANGO_SCRIPT_TELUGU              => Script.TELUGU
      case PangoScript.PANGO_SCRIPT_THAANA              => Script.THAANA
      case PangoScript.PANGO_SCRIPT_THAI                => Script.THAI
      case PangoScript.PANGO_SCRIPT_TIBETAN             => Script.TIBETAN
      case PangoScript.PANGO_SCRIPT_CANADIAN_ABORIGINAL =>
        Script.CANADIAN_ABORIGINAL
      case PangoScript.PANGO_SCRIPT_YI               => Script.YI
      case PangoScript.PANGO_SCRIPT_TAGALOG          => Script.TAGALOG
      case PangoScript.PANGO_SCRIPT_HANUNOO          => Script.HANUNOO
      case PangoScript.PANGO_SCRIPT_BUHID            => Script.BUHID
      case PangoScript.PANGO_SCRIPT_TAGBANWA         => Script.TAGBANWA
      case PangoScript.PANGO_SCRIPT_BRAILLE          => Script.BRAILLE
      case PangoScript.PANGO_SCRIPT_CYPRIOT          => Script.CYPRIOT
      case PangoScript.PANGO_SCRIPT_LIMBU            => Script.LIMBU
      case PangoScript.PANGO_SCRIPT_OSMANYA          => Script.OSMANYA
      case PangoScript.PANGO_SCRIPT_SHAVIAN          => Script.SHAVIAN
      case PangoScript.PANGO_SCRIPT_LINEAR_B         => Script.LINEAR_B
      case PangoScript.PANGO_SCRIPT_TAI_LE           => Script.TAI_LE
      case PangoScript.PANGO_SCRIPT_UGARITIC         => Script.UGARITIC
      case PangoScript.PANGO_SCRIPT_NEW_TAI_LUE      => Script.NEW_TAI_LUE
      case PangoScript.PANGO_SCRIPT_BUGINESE         => Script.BUGINESE
      case PangoScript.PANGO_SCRIPT_GLAGOLITIC       => Script.GLAGOLITIC
      case PangoScript.PANGO_SCRIPT_TIFINAGH         => Script.TIFINAGH
      case PangoScript.PANGO_SCRIPT_SYLOTI_NAGRI     => Script.SYLOTI_NAGRI
      case PangoScript.PANGO_SCRIPT_OLD_PERSIAN      => Script.OLD_PERSIAN
      case PangoScript.PANGO_SCRIPT_KHAROSHTHI       => Script.KHAROSHTHI
      case PangoScript.PANGO_SCRIPT_UNKNOWN          => Script.UNKNOWN
      case PangoScript.PANGO_SCRIPT_BALINESE         => Script.BALINESE
      case PangoScript.PANGO_SCRIPT_CUNEIFORM        => Script.CUNEIFORM
      case PangoScript.PANGO_SCRIPT_PHOENICIAN       => Script.PHOENICIAN
      case PangoScript.PANGO_SCRIPT_PHAGS_PA         => Script.PHAGS_PA
      case PangoScript.PANGO_SCRIPT_NKO              => Script.NKO
      case PangoScript.PANGO_SCRIPT_KAYAH_LI         => Script.KAYAH_LI
      case PangoScript.PANGO_SCRIPT_LEPCHA           => Script.LEPCHA
      case PangoScript.PANGO_SCRIPT_REJANG           => Script.REJANG
      case PangoScript.PANGO_SCRIPT_SUNDANESE        => Script.SUNDANESE
      case PangoScript.PANGO_SCRIPT_SAURASHTRA       => Script.SAURASHTRA
      case PangoScript.PANGO_SCRIPT_CHAM             => Script.CHAM
      case PangoScript.PANGO_SCRIPT_OL_CHIKI         => Script.OL_CHIKI
      case PangoScript.PANGO_SCRIPT_VAI              => Script.VAI
      case PangoScript.PANGO_SCRIPT_CARIAN           => Script.CARIAN
      case PangoScript.PANGO_SCRIPT_LYCIAN           => Script.LYCIAN
      case PangoScript.PANGO_SCRIPT_LYDIAN           => Script.LYDIAN
      case PangoScript.PANGO_SCRIPT_BATAK            => Script.BATAK
      case PangoScript.PANGO_SCRIPT_BRAHMI           => Script.BRAHMI
      case PangoScript.PANGO_SCRIPT_MANDAIC          => Script.MANDAIC
      case PangoScript.PANGO_SCRIPT_CHAKMA           => Script.CHAKMA
      case PangoScript.PANGO_SCRIPT_MEROITIC_CURSIVE => Script.MEROITIC_CURSIVE
      case PangoScript.PANGO_SCRIPT_MEROITIC_HIEROGLYPHS =>
        Script.MEROITIC_HIEROGLYPHS
      case PangoScript.PANGO_SCRIPT_MIAO               => Script.MIAO
      case PangoScript.PANGO_SCRIPT_SHARADA            => Script.SHARADA
      case PangoScript.PANGO_SCRIPT_SORA_SOMPENG       => Script.SORA_SOMPENG
      case PangoScript.PANGO_SCRIPT_TAKRI              => Script.TAKRI
      case PangoScript.PANGO_SCRIPT_BASSA_VAH          => Script.BASSA_VAH
      case PangoScript.PANGO_SCRIPT_CAUCASIAN_ALBANIAN =>
        Script.CAUCASIAN_ALBANIAN
      case PangoScript.PANGO_SCRIPT_DUPLOYAN          => Script.DUPLOYAN
      case PangoScript.PANGO_SCRIPT_ELBASAN           => Script.ELBASAN
      case PangoScript.PANGO_SCRIPT_GRANTHA           => Script.GRANTHA
      case PangoScript.PANGO_SCRIPT_KHOJKI            => Script.KHOJKI
      case PangoScript.PANGO_SCRIPT_KHUDAWADI         => Script.KHUDAWADI
      case PangoScript.PANGO_SCRIPT_LINEAR_A          => Script.LINEAR_A
      case PangoScript.PANGO_SCRIPT_MAHAJANI          => Script.MAHAJANI
      case PangoScript.PANGO_SCRIPT_MANICHAEAN        => Script.MANICHAEAN
      case PangoScript.PANGO_SCRIPT_MENDE_KIKAKUI     => Script.MENDE_KIKAKUI
      case PangoScript.PANGO_SCRIPT_MODI              => Script.MODI
      case PangoScript.PANGO_SCRIPT_MRO               => Script.MRO
      case PangoScript.PANGO_SCRIPT_NABATAEAN         => Script.NABATAEAN
      case PangoScript.PANGO_SCRIPT_OLD_NORTH_ARABIAN =>
        Script.OLD_NORTH_ARABIAN
      case PangoScript.PANGO_SCRIPT_OLD_PERMIC      => Script.OLD_PERMIC
      case PangoScript.PANGO_SCRIPT_PAHAWH_HMONG    => Script.PAHAWH_HMONG
      case PangoScript.PANGO_SCRIPT_PALMYRENE       => Script.PALMYRENE
      case PangoScript.PANGO_SCRIPT_PAU_CIN_HAU     => Script.PAU_CIN_HAU
      case PangoScript.PANGO_SCRIPT_PSALTER_PAHLAVI => Script.PSALTER_PAHLAVI
      case PangoScript.PANGO_SCRIPT_SIDDHAM         => Script.SIDDHAM
      case PangoScript.PANGO_SCRIPT_TIRHUTA         => Script.TIRHUTA
      case PangoScript.PANGO_SCRIPT_WARANG_CITI     => Script.WARANG_CITI
      case PangoScript.PANGO_SCRIPT_AHOM            => Script.AHOM
      case PangoScript.PANGO_SCRIPT_ANATOLIAN_HIEROGLYPHS =>
        Script.ANATOLIAN_HIEROGLYPHS
      case PangoScript.PANGO_SCRIPT_HATRAN        => Script.HATRAN
      case PangoScript.PANGO_SCRIPT_MULTANI       => Script.MULTANI
      case PangoScript.PANGO_SCRIPT_OLD_HUNGARIAN => Script.OLD_HUNGARIAN
      case PangoScript.PANGO_SCRIPT_SIGNWRITING   => Script.SIGNWRITING
  end fromRaw
end Script
