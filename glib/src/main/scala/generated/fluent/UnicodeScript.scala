package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GUnicodeScript

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The #GUnicodeScript enumeration identifies different writing systems. The
  * values correspond to the names as defined in the Unicode standard. The
  * enumeration has been added in GLib 2.14, and is interchangeable with
  * #PangoScript.
  *
  * Note that new types may be added in the future. Applications should be ready
  * to handle unknown values. See [Unicode Standard Annex #24: Script
  * names](http://www.unicode.org/reports/tr24/).
  */
enum UnicodeScript(val raw: GUnicodeScript):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a value never returned from g_unichar_get_script()
    */
  case INVALID_CODE
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_INVALID_CODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a character used by multiple different scripts
    */
  case COMMON extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_COMMON)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a mark glyph that takes its script from the base glyph to which it is
    * attached
    */
  case INHERITED
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_INHERITED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Arabic
    */
  case ARABIC extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_ARABIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Armenian
    */
  case ARMENIAN extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_ARMENIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Bengali
    */
  case BENGALI extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_BENGALI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Bopomofo
    */
  case BOPOMOFO extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_BOPOMOFO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Cherokee
    */
  case CHEROKEE extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_CHEROKEE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Coptic
    */
  case COPTIC extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_COPTIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Cyrillic
    */
  case CYRILLIC extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_CYRILLIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Deseret
    */
  case DESERET extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_DESERET)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Devanagari
    */
  case DEVANAGARI
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_DEVANAGARI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ethiopic
    */
  case ETHIOPIC extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_ETHIOPIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Georgian
    */
  case GEORGIAN extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_GEORGIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gothic
    */
  case GOTHIC extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_GOTHIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Greek
    */
  case GREEK extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_GREEK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gujarati
    */
  case GUJARATI extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_GUJARATI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gurmukhi
    */
  case GURMUKHI extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_GURMUKHI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Han
    */
  case HAN extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_HAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hangul
    */
  case HANGUL extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_HANGUL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hebrew
    */
  case HEBREW extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_HEBREW)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hiragana
    */
  case HIRAGANA extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_HIRAGANA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Kannada
    */
  case KANNADA extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_KANNADA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Katakana
    */
  case KATAKANA extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_KATAKANA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Khmer
    */
  case KHMER extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_KHMER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Lao
    */
  case LAO extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_LAO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Latin
    */
  case LATIN extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_LATIN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Malayalam
    */
  case MALAYALAM
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_MALAYALAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Mongolian
    */
  case MONGOLIAN
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_MONGOLIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Myanmar
    */
  case MYANMAR extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_MYANMAR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ogham
    */
  case OGHAM extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_OGHAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Old Italic
    */
  case OLD_ITALIC
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_OLD_ITALIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Oriya
    */
  case ORIYA extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_ORIYA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Runic
    */
  case RUNIC extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_RUNIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sinhala
    */
  case SINHALA extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_SINHALA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Syriac
    */
  case SYRIAC extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_SYRIAC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tamil
    */
  case TAMIL extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_TAMIL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Telugu
    */
  case TELUGU extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_TELUGU)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Thaana
    */
  case THAANA extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_THAANA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Thai
    */
  case THAI extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_THAI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tibetan
    */
  case TIBETAN extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_TIBETAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Canadian Aboriginal
    */
  case CANADIAN_ABORIGINAL
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_CANADIAN_ABORIGINAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Yi
    */
  case YI extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_YI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tagalog
    */
  case TAGALOG extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_TAGALOG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hanunoo
    */
  case HANUNOO extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_HANUNOO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Buhid
    */
  case BUHID extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_BUHID)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tagbanwa
    */
  case TAGBANWA extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_TAGBANWA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Braille
    */
  case BRAILLE extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_BRAILLE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Cypriot
    */
  case CYPRIOT extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_CYPRIOT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Limbu
    */
  case LIMBU extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_LIMBU)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Osmanya
    */
  case OSMANYA extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_OSMANYA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Shavian
    */
  case SHAVIAN extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_SHAVIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Linear B
    */
  case LINEAR_B extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_LINEAR_B)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tai Le
    */
  case TAI_LE extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_TAI_LE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ugaritic
    */
  case UGARITIC extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_UGARITIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * New Tai Lue
    */
  case NEW_TAI_LUE
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_NEW_TAI_LUE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Buginese
    */
  case BUGINESE extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_BUGINESE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Glagolitic
    */
  case GLAGOLITIC
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_GLAGOLITIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tifinagh
    */
  case TIFINAGH extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_TIFINAGH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Syloti Nagri
    */
  case SYLOTI_NAGRI
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_SYLOTI_NAGRI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Old Persian
    */
  case OLD_PERSIAN
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_OLD_PERSIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Kharoshthi
    */
  case KHAROSHTHI
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_KHAROSHTHI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * an unassigned code point
    */
  case UNKNOWN extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_UNKNOWN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Balinese
    */
  case BALINESE extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_BALINESE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Cuneiform
    */
  case CUNEIFORM
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_CUNEIFORM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Phoenician
    */
  case PHOENICIAN
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_PHOENICIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Phags-pa
    */
  case PHAGS_PA extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_PHAGS_PA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * N'Ko
    */
  case NKO extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_NKO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Kayah Li. Since 2.16.3
    */
  case KAYAH_LI extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_KAYAH_LI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Lepcha. Since 2.16.3
    */
  case LEPCHA extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_LEPCHA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Rejang. Since 2.16.3
    */
  case REJANG extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_REJANG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sundanese. Since 2.16.3
    */
  case SUNDANESE
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_SUNDANESE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Saurashtra. Since 2.16.3
    */
  case SAURASHTRA
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_SAURASHTRA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Cham. Since 2.16.3
    */
  case CHAM extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_CHAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ol Chiki. Since 2.16.3
    */
  case OL_CHIKI extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_OL_CHIKI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Vai. Since 2.16.3
    */
  case VAI extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_VAI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Carian. Since 2.16.3
    */
  case CARIAN extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_CARIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Lycian. Since 2.16.3
    */
  case LYCIAN extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_LYCIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Lydian. Since 2.16.3
    */
  case LYDIAN extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_LYDIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Avestan. Since 2.26
    */
  case AVESTAN extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_AVESTAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Bamum. Since 2.26
    */
  case BAMUM extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_BAMUM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Egyptian Hieroglpyhs. Since 2.26
    */
  case EGYPTIAN_HIEROGLYPHS
      extends UnicodeScript(
        GUnicodeScript.G_UNICODE_SCRIPT_EGYPTIAN_HIEROGLYPHS
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Imperial Aramaic. Since 2.26
    */
  case IMPERIAL_ARAMAIC
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_IMPERIAL_ARAMAIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inscriptional Pahlavi. Since 2.26
    */
  case INSCRIPTIONAL_PAHLAVI
      extends UnicodeScript(
        GUnicodeScript.G_UNICODE_SCRIPT_INSCRIPTIONAL_PAHLAVI
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inscriptional Parthian. Since 2.26
    */
  case INSCRIPTIONAL_PARTHIAN
      extends UnicodeScript(
        GUnicodeScript.G_UNICODE_SCRIPT_INSCRIPTIONAL_PARTHIAN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Javanese. Since 2.26
    */
  case JAVANESE extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_JAVANESE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Kaithi. Since 2.26
    */
  case KAITHI extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_KAITHI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Lisu. Since 2.26
    */
  case LISU extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_LISU)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Meetei Mayek. Since 2.26
    */
  case MEETEI_MAYEK
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_MEETEI_MAYEK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Old South Arabian. Since 2.26
    */
  case OLD_SOUTH_ARABIAN
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_OLD_SOUTH_ARABIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Old Turkic. Since 2.28
    */
  case OLD_TURKIC
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_OLD_TURKIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Samaritan. Since 2.26
    */
  case SAMARITAN
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_SAMARITAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tai Tham. Since 2.26
    */
  case TAI_THAM extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_TAI_THAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tai Viet. Since 2.26
    */
  case TAI_VIET extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_TAI_VIET)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Batak. Since 2.28
    */
  case BATAK extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_BATAK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Brahmi. Since 2.28
    */
  case BRAHMI extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_BRAHMI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Mandaic. Since 2.28
    */
  case MANDAIC extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_MANDAIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Chakma. Since: 2.32
    */
  case CHAKMA extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_CHAKMA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Meroitic Cursive. Since: 2.32
    */
  case MEROITIC_CURSIVE
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_MEROITIC_CURSIVE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Meroitic Hieroglyphs. Since: 2.32
    */
  case MEROITIC_HIEROGLYPHS
      extends UnicodeScript(
        GUnicodeScript.G_UNICODE_SCRIPT_MEROITIC_HIEROGLYPHS
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Miao. Since: 2.32
    */
  case MIAO extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_MIAO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sharada. Since: 2.32
    */
  case SHARADA extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_SHARADA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sora Sompeng. Since: 2.32
    */
  case SORA_SOMPENG
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_SORA_SOMPENG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Takri. Since: 2.32
    */
  case TAKRI extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_TAKRI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Bassa. Since: 2.42
    */
  case BASSA_VAH
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_BASSA_VAH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Caucasian Albanian. Since: 2.42
    */
  case CAUCASIAN_ALBANIAN
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_CAUCASIAN_ALBANIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Duployan. Since: 2.42
    */
  case DUPLOYAN extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_DUPLOYAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Elbasan. Since: 2.42
    */
  case ELBASAN extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_ELBASAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Grantha. Since: 2.42
    */
  case GRANTHA extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_GRANTHA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Kjohki. Since: 2.42
    */
  case KHOJKI extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_KHOJKI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Khudawadi, Sindhi. Since: 2.42
    */
  case KHUDAWADI
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_KHUDAWADI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Linear A. Since: 2.42
    */
  case LINEAR_A extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_LINEAR_A)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Mahajani. Since: 2.42
    */
  case MAHAJANI extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_MAHAJANI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Manichaean. Since: 2.42
    */
  case MANICHAEAN
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_MANICHAEAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Mende Kikakui. Since: 2.42
    */
  case MENDE_KIKAKUI
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_MENDE_KIKAKUI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Modi. Since: 2.42
    */
  case MODI extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_MODI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Mro. Since: 2.42
    */
  case MRO extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_MRO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Nabataean. Since: 2.42
    */
  case NABATAEAN
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_NABATAEAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Old North Arabian. Since: 2.42
    */
  case OLD_NORTH_ARABIAN
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_OLD_NORTH_ARABIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Old Permic. Since: 2.42
    */
  case OLD_PERMIC
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_OLD_PERMIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pahawh Hmong. Since: 2.42
    */
  case PAHAWH_HMONG
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_PAHAWH_HMONG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Palmyrene. Since: 2.42
    */
  case PALMYRENE
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_PALMYRENE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pau Cin Hau. Since: 2.42
    */
  case PAU_CIN_HAU
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_PAU_CIN_HAU)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Psalter Pahlavi. Since: 2.42
    */
  case PSALTER_PAHLAVI
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_PSALTER_PAHLAVI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Siddham. Since: 2.42
    */
  case SIDDHAM extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_SIDDHAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tirhuta. Since: 2.42
    */
  case TIRHUTA extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_TIRHUTA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Warang Citi. Since: 2.42
    */
  case WARANG_CITI
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_WARANG_CITI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ahom. Since: 2.48
    */
  case AHOM extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_AHOM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Anatolian Hieroglyphs. Since: 2.48
    */
  case ANATOLIAN_HIEROGLYPHS
      extends UnicodeScript(
        GUnicodeScript.G_UNICODE_SCRIPT_ANATOLIAN_HIEROGLYPHS
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hatran. Since: 2.48
    */
  case HATRAN extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_HATRAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Multani. Since: 2.48
    */
  case MULTANI extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_MULTANI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Old Hungarian. Since: 2.48
    */
  case OLD_HUNGARIAN
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_OLD_HUNGARIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Signwriting. Since: 2.48
    */
  case SIGNWRITING
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_SIGNWRITING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adlam. Since: 2.50
    */
  case ADLAM extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_ADLAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Bhaiksuki. Since: 2.50
    */
  case BHAIKSUKI
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_BHAIKSUKI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Marchen. Since: 2.50
    */
  case MARCHEN extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_MARCHEN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Newa. Since: 2.50
    */
  case NEWA extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_NEWA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Osage. Since: 2.50
    */
  case OSAGE extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_OSAGE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tangut. Since: 2.50
    */
  case TANGUT extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_TANGUT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Masaram Gondi. Since: 2.54
    */
  case MASARAM_GONDI
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_MASARAM_GONDI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Nushu. Since: 2.54
    */
  case NUSHU extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_NUSHU)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Soyombo. Since: 2.54
    */
  case SOYOMBO extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_SOYOMBO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Zanabazar Square. Since: 2.54
    */
  case ZANABAZAR_SQUARE
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_ZANABAZAR_SQUARE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Dogra. Since: 2.58
    */
  case DOGRA extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_DOGRA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gunjala Gondi. Since: 2.58
    */
  case GUNJALA_GONDI
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_GUNJALA_GONDI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hanifi Rohingya. Since: 2.58
    */
  case HANIFI_ROHINGYA
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_HANIFI_ROHINGYA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makasar. Since: 2.58
    */
  case MAKASAR extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_MAKASAR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Medefaidrin. Since: 2.58
    */
  case MEDEFAIDRIN
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_MEDEFAIDRIN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Old Sogdian. Since: 2.58
    */
  case OLD_SOGDIAN
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_OLD_SOGDIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sogdian. Since: 2.58
    */
  case SOGDIAN extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_SOGDIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Elym. Since: 2.62
    */
  case ELYMAIC extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_ELYMAIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Nand. Since: 2.62
    */
  case NANDINAGARI
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_NANDINAGARI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Rohg. Since: 2.62
    */
  case NYIAKENG_PUACHUE_HMONG
      extends UnicodeScript(
        GUnicodeScript.G_UNICODE_SCRIPT_NYIAKENG_PUACHUE_HMONG
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Wcho. Since: 2.62
    */
  case WANCHO extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_WANCHO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Chorasmian. Since: 2.66
    */
  case CHORASMIAN
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_CHORASMIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Dives Akuru. Since: 2.66
    */
  case DIVES_AKURU
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_DIVES_AKURU)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Khitan small script. Since: 2.66
    */
  case KHITAN_SMALL_SCRIPT
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_KHITAN_SMALL_SCRIPT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Yezidi. Since: 2.66
    */
  case YEZIDI extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_YEZIDI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Cypro-Minoan. Since: 2.72
    */
  case CYPRO_MINOAN
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_CYPRO_MINOAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Old Uyghur. Since: 2.72
    */
  case OLD_UYGHUR
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_OLD_UYGHUR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tangsa. Since: 2.72
    */
  case TANGSA extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_TANGSA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Toto. Since: 2.72
    */
  case TOTO extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_TOTO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Vithkuqi. Since: 2.72
    */
  case VITHKUQI extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_VITHKUQI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Mathematical notation. Since: 2.72
    */
  case MATH extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_MATH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Kawi. Since 2.74
    */
  case KAWI extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_KAWI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Nag Mundari. Since 2.74
    */
  case NAG_MUNDARI
      extends UnicodeScript(GUnicodeScript.G_UNICODE_SCRIPT_NAG_MUNDARI)
end UnicodeScript

object UnicodeScript:
  def fromRaw(raw: GUnicodeScript): UnicodeScript =
    raw match
      case GUnicodeScript.G_UNICODE_SCRIPT_INVALID_CODE =>
        UnicodeScript.INVALID_CODE
      case GUnicodeScript.G_UNICODE_SCRIPT_COMMON     => UnicodeScript.COMMON
      case GUnicodeScript.G_UNICODE_SCRIPT_INHERITED  => UnicodeScript.INHERITED
      case GUnicodeScript.G_UNICODE_SCRIPT_ARABIC     => UnicodeScript.ARABIC
      case GUnicodeScript.G_UNICODE_SCRIPT_ARMENIAN   => UnicodeScript.ARMENIAN
      case GUnicodeScript.G_UNICODE_SCRIPT_BENGALI    => UnicodeScript.BENGALI
      case GUnicodeScript.G_UNICODE_SCRIPT_BOPOMOFO   => UnicodeScript.BOPOMOFO
      case GUnicodeScript.G_UNICODE_SCRIPT_CHEROKEE   => UnicodeScript.CHEROKEE
      case GUnicodeScript.G_UNICODE_SCRIPT_COPTIC     => UnicodeScript.COPTIC
      case GUnicodeScript.G_UNICODE_SCRIPT_CYRILLIC   => UnicodeScript.CYRILLIC
      case GUnicodeScript.G_UNICODE_SCRIPT_DESERET    => UnicodeScript.DESERET
      case GUnicodeScript.G_UNICODE_SCRIPT_DEVANAGARI =>
        UnicodeScript.DEVANAGARI
      case GUnicodeScript.G_UNICODE_SCRIPT_ETHIOPIC   => UnicodeScript.ETHIOPIC
      case GUnicodeScript.G_UNICODE_SCRIPT_GEORGIAN   => UnicodeScript.GEORGIAN
      case GUnicodeScript.G_UNICODE_SCRIPT_GOTHIC     => UnicodeScript.GOTHIC
      case GUnicodeScript.G_UNICODE_SCRIPT_GREEK      => UnicodeScript.GREEK
      case GUnicodeScript.G_UNICODE_SCRIPT_GUJARATI   => UnicodeScript.GUJARATI
      case GUnicodeScript.G_UNICODE_SCRIPT_GURMUKHI   => UnicodeScript.GURMUKHI
      case GUnicodeScript.G_UNICODE_SCRIPT_HAN        => UnicodeScript.HAN
      case GUnicodeScript.G_UNICODE_SCRIPT_HANGUL     => UnicodeScript.HANGUL
      case GUnicodeScript.G_UNICODE_SCRIPT_HEBREW     => UnicodeScript.HEBREW
      case GUnicodeScript.G_UNICODE_SCRIPT_HIRAGANA   => UnicodeScript.HIRAGANA
      case GUnicodeScript.G_UNICODE_SCRIPT_KANNADA    => UnicodeScript.KANNADA
      case GUnicodeScript.G_UNICODE_SCRIPT_KATAKANA   => UnicodeScript.KATAKANA
      case GUnicodeScript.G_UNICODE_SCRIPT_KHMER      => UnicodeScript.KHMER
      case GUnicodeScript.G_UNICODE_SCRIPT_LAO        => UnicodeScript.LAO
      case GUnicodeScript.G_UNICODE_SCRIPT_LATIN      => UnicodeScript.LATIN
      case GUnicodeScript.G_UNICODE_SCRIPT_MALAYALAM  => UnicodeScript.MALAYALAM
      case GUnicodeScript.G_UNICODE_SCRIPT_MONGOLIAN  => UnicodeScript.MONGOLIAN
      case GUnicodeScript.G_UNICODE_SCRIPT_MYANMAR    => UnicodeScript.MYANMAR
      case GUnicodeScript.G_UNICODE_SCRIPT_OGHAM      => UnicodeScript.OGHAM
      case GUnicodeScript.G_UNICODE_SCRIPT_OLD_ITALIC =>
        UnicodeScript.OLD_ITALIC
      case GUnicodeScript.G_UNICODE_SCRIPT_ORIYA   => UnicodeScript.ORIYA
      case GUnicodeScript.G_UNICODE_SCRIPT_RUNIC   => UnicodeScript.RUNIC
      case GUnicodeScript.G_UNICODE_SCRIPT_SINHALA => UnicodeScript.SINHALA
      case GUnicodeScript.G_UNICODE_SCRIPT_SYRIAC  => UnicodeScript.SYRIAC
      case GUnicodeScript.G_UNICODE_SCRIPT_TAMIL   => UnicodeScript.TAMIL
      case GUnicodeScript.G_UNICODE_SCRIPT_TELUGU  => UnicodeScript.TELUGU
      case GUnicodeScript.G_UNICODE_SCRIPT_THAANA  => UnicodeScript.THAANA
      case GUnicodeScript.G_UNICODE_SCRIPT_THAI    => UnicodeScript.THAI
      case GUnicodeScript.G_UNICODE_SCRIPT_TIBETAN => UnicodeScript.TIBETAN
      case GUnicodeScript.G_UNICODE_SCRIPT_CANADIAN_ABORIGINAL =>
        UnicodeScript.CANADIAN_ABORIGINAL
      case GUnicodeScript.G_UNICODE_SCRIPT_YI          => UnicodeScript.YI
      case GUnicodeScript.G_UNICODE_SCRIPT_TAGALOG     => UnicodeScript.TAGALOG
      case GUnicodeScript.G_UNICODE_SCRIPT_HANUNOO     => UnicodeScript.HANUNOO
      case GUnicodeScript.G_UNICODE_SCRIPT_BUHID       => UnicodeScript.BUHID
      case GUnicodeScript.G_UNICODE_SCRIPT_TAGBANWA    => UnicodeScript.TAGBANWA
      case GUnicodeScript.G_UNICODE_SCRIPT_BRAILLE     => UnicodeScript.BRAILLE
      case GUnicodeScript.G_UNICODE_SCRIPT_CYPRIOT     => UnicodeScript.CYPRIOT
      case GUnicodeScript.G_UNICODE_SCRIPT_LIMBU       => UnicodeScript.LIMBU
      case GUnicodeScript.G_UNICODE_SCRIPT_OSMANYA     => UnicodeScript.OSMANYA
      case GUnicodeScript.G_UNICODE_SCRIPT_SHAVIAN     => UnicodeScript.SHAVIAN
      case GUnicodeScript.G_UNICODE_SCRIPT_LINEAR_B    => UnicodeScript.LINEAR_B
      case GUnicodeScript.G_UNICODE_SCRIPT_TAI_LE      => UnicodeScript.TAI_LE
      case GUnicodeScript.G_UNICODE_SCRIPT_UGARITIC    => UnicodeScript.UGARITIC
      case GUnicodeScript.G_UNICODE_SCRIPT_NEW_TAI_LUE =>
        UnicodeScript.NEW_TAI_LUE
      case GUnicodeScript.G_UNICODE_SCRIPT_BUGINESE   => UnicodeScript.BUGINESE
      case GUnicodeScript.G_UNICODE_SCRIPT_GLAGOLITIC =>
        UnicodeScript.GLAGOLITIC
      case GUnicodeScript.G_UNICODE_SCRIPT_TIFINAGH => UnicodeScript.TIFINAGH
      case GUnicodeScript.G_UNICODE_SCRIPT_SYLOTI_NAGRI =>
        UnicodeScript.SYLOTI_NAGRI
      case GUnicodeScript.G_UNICODE_SCRIPT_OLD_PERSIAN =>
        UnicodeScript.OLD_PERSIAN
      case GUnicodeScript.G_UNICODE_SCRIPT_KHAROSHTHI =>
        UnicodeScript.KHAROSHTHI
      case GUnicodeScript.G_UNICODE_SCRIPT_UNKNOWN    => UnicodeScript.UNKNOWN
      case GUnicodeScript.G_UNICODE_SCRIPT_BALINESE   => UnicodeScript.BALINESE
      case GUnicodeScript.G_UNICODE_SCRIPT_CUNEIFORM  => UnicodeScript.CUNEIFORM
      case GUnicodeScript.G_UNICODE_SCRIPT_PHOENICIAN =>
        UnicodeScript.PHOENICIAN
      case GUnicodeScript.G_UNICODE_SCRIPT_PHAGS_PA   => UnicodeScript.PHAGS_PA
      case GUnicodeScript.G_UNICODE_SCRIPT_NKO        => UnicodeScript.NKO
      case GUnicodeScript.G_UNICODE_SCRIPT_KAYAH_LI   => UnicodeScript.KAYAH_LI
      case GUnicodeScript.G_UNICODE_SCRIPT_LEPCHA     => UnicodeScript.LEPCHA
      case GUnicodeScript.G_UNICODE_SCRIPT_REJANG     => UnicodeScript.REJANG
      case GUnicodeScript.G_UNICODE_SCRIPT_SUNDANESE  => UnicodeScript.SUNDANESE
      case GUnicodeScript.G_UNICODE_SCRIPT_SAURASHTRA =>
        UnicodeScript.SAURASHTRA
      case GUnicodeScript.G_UNICODE_SCRIPT_CHAM     => UnicodeScript.CHAM
      case GUnicodeScript.G_UNICODE_SCRIPT_OL_CHIKI => UnicodeScript.OL_CHIKI
      case GUnicodeScript.G_UNICODE_SCRIPT_VAI      => UnicodeScript.VAI
      case GUnicodeScript.G_UNICODE_SCRIPT_CARIAN   => UnicodeScript.CARIAN
      case GUnicodeScript.G_UNICODE_SCRIPT_LYCIAN   => UnicodeScript.LYCIAN
      case GUnicodeScript.G_UNICODE_SCRIPT_LYDIAN   => UnicodeScript.LYDIAN
      case GUnicodeScript.G_UNICODE_SCRIPT_AVESTAN  => UnicodeScript.AVESTAN
      case GUnicodeScript.G_UNICODE_SCRIPT_BAMUM    => UnicodeScript.BAMUM
      case GUnicodeScript.G_UNICODE_SCRIPT_EGYPTIAN_HIEROGLYPHS =>
        UnicodeScript.EGYPTIAN_HIEROGLYPHS
      case GUnicodeScript.G_UNICODE_SCRIPT_IMPERIAL_ARAMAIC =>
        UnicodeScript.IMPERIAL_ARAMAIC
      case GUnicodeScript.G_UNICODE_SCRIPT_INSCRIPTIONAL_PAHLAVI =>
        UnicodeScript.INSCRIPTIONAL_PAHLAVI
      case GUnicodeScript.G_UNICODE_SCRIPT_INSCRIPTIONAL_PARTHIAN =>
        UnicodeScript.INSCRIPTIONAL_PARTHIAN
      case GUnicodeScript.G_UNICODE_SCRIPT_JAVANESE => UnicodeScript.JAVANESE
      case GUnicodeScript.G_UNICODE_SCRIPT_KAITHI   => UnicodeScript.KAITHI
      case GUnicodeScript.G_UNICODE_SCRIPT_LISU     => UnicodeScript.LISU
      case GUnicodeScript.G_UNICODE_SCRIPT_MEETEI_MAYEK =>
        UnicodeScript.MEETEI_MAYEK
      case GUnicodeScript.G_UNICODE_SCRIPT_OLD_SOUTH_ARABIAN =>
        UnicodeScript.OLD_SOUTH_ARABIAN
      case GUnicodeScript.G_UNICODE_SCRIPT_OLD_TURKIC =>
        UnicodeScript.OLD_TURKIC
      case GUnicodeScript.G_UNICODE_SCRIPT_SAMARITAN => UnicodeScript.SAMARITAN
      case GUnicodeScript.G_UNICODE_SCRIPT_TAI_THAM  => UnicodeScript.TAI_THAM
      case GUnicodeScript.G_UNICODE_SCRIPT_TAI_VIET  => UnicodeScript.TAI_VIET
      case GUnicodeScript.G_UNICODE_SCRIPT_BATAK     => UnicodeScript.BATAK
      case GUnicodeScript.G_UNICODE_SCRIPT_BRAHMI    => UnicodeScript.BRAHMI
      case GUnicodeScript.G_UNICODE_SCRIPT_MANDAIC   => UnicodeScript.MANDAIC
      case GUnicodeScript.G_UNICODE_SCRIPT_CHAKMA    => UnicodeScript.CHAKMA
      case GUnicodeScript.G_UNICODE_SCRIPT_MEROITIC_CURSIVE =>
        UnicodeScript.MEROITIC_CURSIVE
      case GUnicodeScript.G_UNICODE_SCRIPT_MEROITIC_HIEROGLYPHS =>
        UnicodeScript.MEROITIC_HIEROGLYPHS
      case GUnicodeScript.G_UNICODE_SCRIPT_MIAO         => UnicodeScript.MIAO
      case GUnicodeScript.G_UNICODE_SCRIPT_SHARADA      => UnicodeScript.SHARADA
      case GUnicodeScript.G_UNICODE_SCRIPT_SORA_SOMPENG =>
        UnicodeScript.SORA_SOMPENG
      case GUnicodeScript.G_UNICODE_SCRIPT_TAKRI     => UnicodeScript.TAKRI
      case GUnicodeScript.G_UNICODE_SCRIPT_BASSA_VAH => UnicodeScript.BASSA_VAH
      case GUnicodeScript.G_UNICODE_SCRIPT_CAUCASIAN_ALBANIAN =>
        UnicodeScript.CAUCASIAN_ALBANIAN
      case GUnicodeScript.G_UNICODE_SCRIPT_DUPLOYAN   => UnicodeScript.DUPLOYAN
      case GUnicodeScript.G_UNICODE_SCRIPT_ELBASAN    => UnicodeScript.ELBASAN
      case GUnicodeScript.G_UNICODE_SCRIPT_GRANTHA    => UnicodeScript.GRANTHA
      case GUnicodeScript.G_UNICODE_SCRIPT_KHOJKI     => UnicodeScript.KHOJKI
      case GUnicodeScript.G_UNICODE_SCRIPT_KHUDAWADI  => UnicodeScript.KHUDAWADI
      case GUnicodeScript.G_UNICODE_SCRIPT_LINEAR_A   => UnicodeScript.LINEAR_A
      case GUnicodeScript.G_UNICODE_SCRIPT_MAHAJANI   => UnicodeScript.MAHAJANI
      case GUnicodeScript.G_UNICODE_SCRIPT_MANICHAEAN =>
        UnicodeScript.MANICHAEAN
      case GUnicodeScript.G_UNICODE_SCRIPT_MENDE_KIKAKUI =>
        UnicodeScript.MENDE_KIKAKUI
      case GUnicodeScript.G_UNICODE_SCRIPT_MODI      => UnicodeScript.MODI
      case GUnicodeScript.G_UNICODE_SCRIPT_MRO       => UnicodeScript.MRO
      case GUnicodeScript.G_UNICODE_SCRIPT_NABATAEAN => UnicodeScript.NABATAEAN
      case GUnicodeScript.G_UNICODE_SCRIPT_OLD_NORTH_ARABIAN =>
        UnicodeScript.OLD_NORTH_ARABIAN
      case GUnicodeScript.G_UNICODE_SCRIPT_OLD_PERMIC =>
        UnicodeScript.OLD_PERMIC
      case GUnicodeScript.G_UNICODE_SCRIPT_PAHAWH_HMONG =>
        UnicodeScript.PAHAWH_HMONG
      case GUnicodeScript.G_UNICODE_SCRIPT_PALMYRENE => UnicodeScript.PALMYRENE
      case GUnicodeScript.G_UNICODE_SCRIPT_PAU_CIN_HAU =>
        UnicodeScript.PAU_CIN_HAU
      case GUnicodeScript.G_UNICODE_SCRIPT_PSALTER_PAHLAVI =>
        UnicodeScript.PSALTER_PAHLAVI
      case GUnicodeScript.G_UNICODE_SCRIPT_SIDDHAM     => UnicodeScript.SIDDHAM
      case GUnicodeScript.G_UNICODE_SCRIPT_TIRHUTA     => UnicodeScript.TIRHUTA
      case GUnicodeScript.G_UNICODE_SCRIPT_WARANG_CITI =>
        UnicodeScript.WARANG_CITI
      case GUnicodeScript.G_UNICODE_SCRIPT_AHOM => UnicodeScript.AHOM
      case GUnicodeScript.G_UNICODE_SCRIPT_ANATOLIAN_HIEROGLYPHS =>
        UnicodeScript.ANATOLIAN_HIEROGLYPHS
      case GUnicodeScript.G_UNICODE_SCRIPT_HATRAN  => UnicodeScript.HATRAN
      case GUnicodeScript.G_UNICODE_SCRIPT_MULTANI => UnicodeScript.MULTANI
      case GUnicodeScript.G_UNICODE_SCRIPT_OLD_HUNGARIAN =>
        UnicodeScript.OLD_HUNGARIAN
      case GUnicodeScript.G_UNICODE_SCRIPT_SIGNWRITING =>
        UnicodeScript.SIGNWRITING
      case GUnicodeScript.G_UNICODE_SCRIPT_ADLAM     => UnicodeScript.ADLAM
      case GUnicodeScript.G_UNICODE_SCRIPT_BHAIKSUKI => UnicodeScript.BHAIKSUKI
      case GUnicodeScript.G_UNICODE_SCRIPT_MARCHEN   => UnicodeScript.MARCHEN
      case GUnicodeScript.G_UNICODE_SCRIPT_NEWA      => UnicodeScript.NEWA
      case GUnicodeScript.G_UNICODE_SCRIPT_OSAGE     => UnicodeScript.OSAGE
      case GUnicodeScript.G_UNICODE_SCRIPT_TANGUT    => UnicodeScript.TANGUT
      case GUnicodeScript.G_UNICODE_SCRIPT_MASARAM_GONDI =>
        UnicodeScript.MASARAM_GONDI
      case GUnicodeScript.G_UNICODE_SCRIPT_NUSHU   => UnicodeScript.NUSHU
      case GUnicodeScript.G_UNICODE_SCRIPT_SOYOMBO => UnicodeScript.SOYOMBO
      case GUnicodeScript.G_UNICODE_SCRIPT_ZANABAZAR_SQUARE =>
        UnicodeScript.ZANABAZAR_SQUARE
      case GUnicodeScript.G_UNICODE_SCRIPT_DOGRA         => UnicodeScript.DOGRA
      case GUnicodeScript.G_UNICODE_SCRIPT_GUNJALA_GONDI =>
        UnicodeScript.GUNJALA_GONDI
      case GUnicodeScript.G_UNICODE_SCRIPT_HANIFI_ROHINGYA =>
        UnicodeScript.HANIFI_ROHINGYA
      case GUnicodeScript.G_UNICODE_SCRIPT_MAKASAR     => UnicodeScript.MAKASAR
      case GUnicodeScript.G_UNICODE_SCRIPT_MEDEFAIDRIN =>
        UnicodeScript.MEDEFAIDRIN
      case GUnicodeScript.G_UNICODE_SCRIPT_OLD_SOGDIAN =>
        UnicodeScript.OLD_SOGDIAN
      case GUnicodeScript.G_UNICODE_SCRIPT_SOGDIAN     => UnicodeScript.SOGDIAN
      case GUnicodeScript.G_UNICODE_SCRIPT_ELYMAIC     => UnicodeScript.ELYMAIC
      case GUnicodeScript.G_UNICODE_SCRIPT_NANDINAGARI =>
        UnicodeScript.NANDINAGARI
      case GUnicodeScript.G_UNICODE_SCRIPT_NYIAKENG_PUACHUE_HMONG =>
        UnicodeScript.NYIAKENG_PUACHUE_HMONG
      case GUnicodeScript.G_UNICODE_SCRIPT_WANCHO     => UnicodeScript.WANCHO
      case GUnicodeScript.G_UNICODE_SCRIPT_CHORASMIAN =>
        UnicodeScript.CHORASMIAN
      case GUnicodeScript.G_UNICODE_SCRIPT_DIVES_AKURU =>
        UnicodeScript.DIVES_AKURU
      case GUnicodeScript.G_UNICODE_SCRIPT_KHITAN_SMALL_SCRIPT =>
        UnicodeScript.KHITAN_SMALL_SCRIPT
      case GUnicodeScript.G_UNICODE_SCRIPT_YEZIDI       => UnicodeScript.YEZIDI
      case GUnicodeScript.G_UNICODE_SCRIPT_CYPRO_MINOAN =>
        UnicodeScript.CYPRO_MINOAN
      case GUnicodeScript.G_UNICODE_SCRIPT_OLD_UYGHUR =>
        UnicodeScript.OLD_UYGHUR
      case GUnicodeScript.G_UNICODE_SCRIPT_TANGSA      => UnicodeScript.TANGSA
      case GUnicodeScript.G_UNICODE_SCRIPT_TOTO        => UnicodeScript.TOTO
      case GUnicodeScript.G_UNICODE_SCRIPT_VITHKUQI    => UnicodeScript.VITHKUQI
      case GUnicodeScript.G_UNICODE_SCRIPT_MATH        => UnicodeScript.MATH
      case GUnicodeScript.G_UNICODE_SCRIPT_KAWI        => UnicodeScript.KAWI
      case GUnicodeScript.G_UNICODE_SCRIPT_NAG_MUNDARI =>
        UnicodeScript.NAG_MUNDARI
  end fromRaw
end UnicodeScript
