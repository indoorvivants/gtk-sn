package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoScript

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `PangoScript` enumeration identifies different writing systems.
  *
  * The values correspond to the names as defined in the Unicode standard. See
  * [Unicode Standard Annex 24: Script
  * names](http://www.unicode.org/reports/tr24/)
  *
  * Note that this enumeration is deprecated and will not be updated to include
  * values in newer versions of the Unicode standard. Applications should use
  * the [enum@GLib.UnicodeScript] enumeration instead, whose values are
  * interchangeable with `PangoScript`.
  */
enum Script(val raw: PangoScript):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a value never returned from pango_script_for_unichar()
    */
  case INVALID_CODE extends Script(PangoScript.PANGO_SCRIPT_INVALID_CODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a character used by multiple different scripts
    */
  case COMMON extends Script(PangoScript.PANGO_SCRIPT_COMMON)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a mark glyph that takes its script from the base glyph to which it is
    * attached
    */
  case INHERITED extends Script(PangoScript.PANGO_SCRIPT_INHERITED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Arabic
    */
  case ARABIC extends Script(PangoScript.PANGO_SCRIPT_ARABIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Armenian
    */
  case ARMENIAN extends Script(PangoScript.PANGO_SCRIPT_ARMENIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Bengali
    */
  case BENGALI extends Script(PangoScript.PANGO_SCRIPT_BENGALI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Bopomofo
    */
  case BOPOMOFO extends Script(PangoScript.PANGO_SCRIPT_BOPOMOFO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Cherokee
    */
  case CHEROKEE extends Script(PangoScript.PANGO_SCRIPT_CHEROKEE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Coptic
    */
  case COPTIC extends Script(PangoScript.PANGO_SCRIPT_COPTIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Cyrillic
    */
  case CYRILLIC extends Script(PangoScript.PANGO_SCRIPT_CYRILLIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Deseret
    */
  case DESERET extends Script(PangoScript.PANGO_SCRIPT_DESERET)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Devanagari
    */
  case DEVANAGARI extends Script(PangoScript.PANGO_SCRIPT_DEVANAGARI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ethiopic
    */
  case ETHIOPIC extends Script(PangoScript.PANGO_SCRIPT_ETHIOPIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Georgian
    */
  case GEORGIAN extends Script(PangoScript.PANGO_SCRIPT_GEORGIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gothic
    */
  case GOTHIC extends Script(PangoScript.PANGO_SCRIPT_GOTHIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Greek
    */
  case GREEK extends Script(PangoScript.PANGO_SCRIPT_GREEK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gujarati
    */
  case GUJARATI extends Script(PangoScript.PANGO_SCRIPT_GUJARATI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gurmukhi
    */
  case GURMUKHI extends Script(PangoScript.PANGO_SCRIPT_GURMUKHI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Han
    */
  case HAN extends Script(PangoScript.PANGO_SCRIPT_HAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hangul
    */
  case HANGUL extends Script(PangoScript.PANGO_SCRIPT_HANGUL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hebrew
    */
  case HEBREW extends Script(PangoScript.PANGO_SCRIPT_HEBREW)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hiragana
    */
  case HIRAGANA extends Script(PangoScript.PANGO_SCRIPT_HIRAGANA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Kannada
    */
  case KANNADA extends Script(PangoScript.PANGO_SCRIPT_KANNADA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Katakana
    */
  case KATAKANA extends Script(PangoScript.PANGO_SCRIPT_KATAKANA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Khmer
    */
  case KHMER extends Script(PangoScript.PANGO_SCRIPT_KHMER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Lao
    */
  case LAO extends Script(PangoScript.PANGO_SCRIPT_LAO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Latin
    */
  case LATIN extends Script(PangoScript.PANGO_SCRIPT_LATIN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Malayalam
    */
  case MALAYALAM extends Script(PangoScript.PANGO_SCRIPT_MALAYALAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Mongolian
    */
  case MONGOLIAN extends Script(PangoScript.PANGO_SCRIPT_MONGOLIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Myanmar
    */
  case MYANMAR extends Script(PangoScript.PANGO_SCRIPT_MYANMAR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ogham
    */
  case OGHAM extends Script(PangoScript.PANGO_SCRIPT_OGHAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Old Italic
    */
  case OLD_ITALIC extends Script(PangoScript.PANGO_SCRIPT_OLD_ITALIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Oriya
    */
  case ORIYA extends Script(PangoScript.PANGO_SCRIPT_ORIYA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Runic
    */
  case RUNIC extends Script(PangoScript.PANGO_SCRIPT_RUNIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sinhala
    */
  case SINHALA extends Script(PangoScript.PANGO_SCRIPT_SINHALA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Syriac
    */
  case SYRIAC extends Script(PangoScript.PANGO_SCRIPT_SYRIAC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tamil
    */
  case TAMIL extends Script(PangoScript.PANGO_SCRIPT_TAMIL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Telugu
    */
  case TELUGU extends Script(PangoScript.PANGO_SCRIPT_TELUGU)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Thaana
    */
  case THAANA extends Script(PangoScript.PANGO_SCRIPT_THAANA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Thai
    */
  case THAI extends Script(PangoScript.PANGO_SCRIPT_THAI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tibetan
    */
  case TIBETAN extends Script(PangoScript.PANGO_SCRIPT_TIBETAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Canadian Aboriginal
    */
  case CANADIAN_ABORIGINAL
      extends Script(PangoScript.PANGO_SCRIPT_CANADIAN_ABORIGINAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Yi
    */
  case YI extends Script(PangoScript.PANGO_SCRIPT_YI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tagalog
    */
  case TAGALOG extends Script(PangoScript.PANGO_SCRIPT_TAGALOG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hanunoo
    */
  case HANUNOO extends Script(PangoScript.PANGO_SCRIPT_HANUNOO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Buhid
    */
  case BUHID extends Script(PangoScript.PANGO_SCRIPT_BUHID)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tagbanwa
    */
  case TAGBANWA extends Script(PangoScript.PANGO_SCRIPT_TAGBANWA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Braille
    */
  case BRAILLE extends Script(PangoScript.PANGO_SCRIPT_BRAILLE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Cypriot
    */
  case CYPRIOT extends Script(PangoScript.PANGO_SCRIPT_CYPRIOT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Limbu
    */
  case LIMBU extends Script(PangoScript.PANGO_SCRIPT_LIMBU)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Osmanya
    */
  case OSMANYA extends Script(PangoScript.PANGO_SCRIPT_OSMANYA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Shavian
    */
  case SHAVIAN extends Script(PangoScript.PANGO_SCRIPT_SHAVIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Linear B
    */
  case LINEAR_B extends Script(PangoScript.PANGO_SCRIPT_LINEAR_B)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tai Le
    */
  case TAI_LE extends Script(PangoScript.PANGO_SCRIPT_TAI_LE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ugaritic
    */
  case UGARITIC extends Script(PangoScript.PANGO_SCRIPT_UGARITIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * New Tai Lue. Since 1.10
    */
  case NEW_TAI_LUE extends Script(PangoScript.PANGO_SCRIPT_NEW_TAI_LUE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Buginese. Since 1.10
    */
  case BUGINESE extends Script(PangoScript.PANGO_SCRIPT_BUGINESE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Glagolitic. Since 1.10
    */
  case GLAGOLITIC extends Script(PangoScript.PANGO_SCRIPT_GLAGOLITIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tifinagh. Since 1.10
    */
  case TIFINAGH extends Script(PangoScript.PANGO_SCRIPT_TIFINAGH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Syloti Nagri. Since 1.10
    */
  case SYLOTI_NAGRI extends Script(PangoScript.PANGO_SCRIPT_SYLOTI_NAGRI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Old Persian. Since 1.10
    */
  case OLD_PERSIAN extends Script(PangoScript.PANGO_SCRIPT_OLD_PERSIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Kharoshthi. Since 1.10
    */
  case KHAROSHTHI extends Script(PangoScript.PANGO_SCRIPT_KHAROSHTHI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * an unassigned code point. Since 1.14
    */
  case UNKNOWN extends Script(PangoScript.PANGO_SCRIPT_UNKNOWN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Balinese. Since 1.14
    */
  case BALINESE extends Script(PangoScript.PANGO_SCRIPT_BALINESE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Cuneiform. Since 1.14
    */
  case CUNEIFORM extends Script(PangoScript.PANGO_SCRIPT_CUNEIFORM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Phoenician. Since 1.14
    */
  case PHOENICIAN extends Script(PangoScript.PANGO_SCRIPT_PHOENICIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Phags-pa. Since 1.14
    */
  case PHAGS_PA extends Script(PangoScript.PANGO_SCRIPT_PHAGS_PA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * N'Ko. Since 1.14
    */
  case NKO extends Script(PangoScript.PANGO_SCRIPT_NKO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Kayah Li. Since 1.20.1
    */
  case KAYAH_LI extends Script(PangoScript.PANGO_SCRIPT_KAYAH_LI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Lepcha. Since 1.20.1
    */
  case LEPCHA extends Script(PangoScript.PANGO_SCRIPT_LEPCHA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Rejang. Since 1.20.1
    */
  case REJANG extends Script(PangoScript.PANGO_SCRIPT_REJANG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sundanese. Since 1.20.1
    */
  case SUNDANESE extends Script(PangoScript.PANGO_SCRIPT_SUNDANESE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Saurashtra. Since 1.20.1
    */
  case SAURASHTRA extends Script(PangoScript.PANGO_SCRIPT_SAURASHTRA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Cham. Since 1.20.1
    */
  case CHAM extends Script(PangoScript.PANGO_SCRIPT_CHAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ol Chiki. Since 1.20.1
    */
  case OL_CHIKI extends Script(PangoScript.PANGO_SCRIPT_OL_CHIKI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Vai. Since 1.20.1
    */
  case VAI extends Script(PangoScript.PANGO_SCRIPT_VAI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Carian. Since 1.20.1
    */
  case CARIAN extends Script(PangoScript.PANGO_SCRIPT_CARIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Lycian. Since 1.20.1
    */
  case LYCIAN extends Script(PangoScript.PANGO_SCRIPT_LYCIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Lydian. Since 1.20.1
    */
  case LYDIAN extends Script(PangoScript.PANGO_SCRIPT_LYDIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Batak. Since 1.32
    */
  case BATAK extends Script(PangoScript.PANGO_SCRIPT_BATAK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Brahmi. Since 1.32
    */
  case BRAHMI extends Script(PangoScript.PANGO_SCRIPT_BRAHMI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Mandaic. Since 1.32
    */
  case MANDAIC extends Script(PangoScript.PANGO_SCRIPT_MANDAIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Chakma. Since: 1.32
    */
  case CHAKMA extends Script(PangoScript.PANGO_SCRIPT_CHAKMA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Meroitic Cursive. Since: 1.32
    */
  case MEROITIC_CURSIVE
      extends Script(PangoScript.PANGO_SCRIPT_MEROITIC_CURSIVE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Meroitic Hieroglyphs. Since: 1.32
    */
  case MEROITIC_HIEROGLYPHS
      extends Script(PangoScript.PANGO_SCRIPT_MEROITIC_HIEROGLYPHS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Miao. Since: 1.32
    */
  case MIAO extends Script(PangoScript.PANGO_SCRIPT_MIAO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sharada. Since: 1.32
    */
  case SHARADA extends Script(PangoScript.PANGO_SCRIPT_SHARADA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sora Sompeng. Since: 1.32
    */
  case SORA_SOMPENG extends Script(PangoScript.PANGO_SCRIPT_SORA_SOMPENG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Takri. Since: 1.32
    */
  case TAKRI extends Script(PangoScript.PANGO_SCRIPT_TAKRI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Bassa. Since: 1.40
    */
  case BASSA_VAH extends Script(PangoScript.PANGO_SCRIPT_BASSA_VAH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Caucasian Albanian. Since: 1.40
    */
  case CAUCASIAN_ALBANIAN
      extends Script(PangoScript.PANGO_SCRIPT_CAUCASIAN_ALBANIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Duployan. Since: 1.40
    */
  case DUPLOYAN extends Script(PangoScript.PANGO_SCRIPT_DUPLOYAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Elbasan. Since: 1.40
    */
  case ELBASAN extends Script(PangoScript.PANGO_SCRIPT_ELBASAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Grantha. Since: 1.40
    */
  case GRANTHA extends Script(PangoScript.PANGO_SCRIPT_GRANTHA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Kjohki. Since: 1.40
    */
  case KHOJKI extends Script(PangoScript.PANGO_SCRIPT_KHOJKI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Khudawadi, Sindhi. Since: 1.40
    */
  case KHUDAWADI extends Script(PangoScript.PANGO_SCRIPT_KHUDAWADI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Linear A. Since: 1.40
    */
  case LINEAR_A extends Script(PangoScript.PANGO_SCRIPT_LINEAR_A)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Mahajani. Since: 1.40
    */
  case MAHAJANI extends Script(PangoScript.PANGO_SCRIPT_MAHAJANI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Manichaean. Since: 1.40
    */
  case MANICHAEAN extends Script(PangoScript.PANGO_SCRIPT_MANICHAEAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Mende Kikakui. Since: 1.40
    */
  case MENDE_KIKAKUI extends Script(PangoScript.PANGO_SCRIPT_MENDE_KIKAKUI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Modi. Since: 1.40
    */
  case MODI extends Script(PangoScript.PANGO_SCRIPT_MODI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Mro. Since: 1.40
    */
  case MRO extends Script(PangoScript.PANGO_SCRIPT_MRO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Nabataean. Since: 1.40
    */
  case NABATAEAN extends Script(PangoScript.PANGO_SCRIPT_NABATAEAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Old North Arabian. Since: 1.40
    */
  case OLD_NORTH_ARABIAN
      extends Script(PangoScript.PANGO_SCRIPT_OLD_NORTH_ARABIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Old Permic. Since: 1.40
    */
  case OLD_PERMIC extends Script(PangoScript.PANGO_SCRIPT_OLD_PERMIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pahawh Hmong. Since: 1.40
    */
  case PAHAWH_HMONG extends Script(PangoScript.PANGO_SCRIPT_PAHAWH_HMONG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Palmyrene. Since: 1.40
    */
  case PALMYRENE extends Script(PangoScript.PANGO_SCRIPT_PALMYRENE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pau Cin Hau. Since: 1.40
    */
  case PAU_CIN_HAU extends Script(PangoScript.PANGO_SCRIPT_PAU_CIN_HAU)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Psalter Pahlavi. Since: 1.40
    */
  case PSALTER_PAHLAVI extends Script(PangoScript.PANGO_SCRIPT_PSALTER_PAHLAVI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Siddham. Since: 1.40
    */
  case SIDDHAM extends Script(PangoScript.PANGO_SCRIPT_SIDDHAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tirhuta. Since: 1.40
    */
  case TIRHUTA extends Script(PangoScript.PANGO_SCRIPT_TIRHUTA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Warang Citi. Since: 1.40
    */
  case WARANG_CITI extends Script(PangoScript.PANGO_SCRIPT_WARANG_CITI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ahom. Since: 1.40
    */
  case AHOM extends Script(PangoScript.PANGO_SCRIPT_AHOM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Anatolian Hieroglyphs. Since: 1.40
    */
  case ANATOLIAN_HIEROGLYPHS
      extends Script(PangoScript.PANGO_SCRIPT_ANATOLIAN_HIEROGLYPHS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hatran. Since: 1.40
    */
  case HATRAN extends Script(PangoScript.PANGO_SCRIPT_HATRAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Multani. Since: 1.40
    */
  case MULTANI extends Script(PangoScript.PANGO_SCRIPT_MULTANI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Old Hungarian. Since: 1.40
    */
  case OLD_HUNGARIAN extends Script(PangoScript.PANGO_SCRIPT_OLD_HUNGARIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Signwriting. Since: 1.40
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
