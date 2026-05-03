package sn.gnome.harfbuzz.fluent

import _root_.sn.gnome.harfbuzz.internal.hb_script_t

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Data type for scripts. Each #hb_script_t's value is an #hb_tag_t
  * corresponding to the four-letter values defined by [ISO
  * 15924](https://unicode.org/iso15924/).
  *
  * See also the Script (sc) property of the Unicode Character Database.
  */
enum script_t(val raw: hb_script_t):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Zyyy`
    */
  case COMMON extends script_t(hb_script_t.HB_SCRIPT_COMMON)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Zinh`
    */
  case INHERITED extends script_t(hb_script_t.HB_SCRIPT_INHERITED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Zzzz`
    */
  case UNKNOWN extends script_t(hb_script_t.HB_SCRIPT_UNKNOWN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Arab`
    */
  case ARABIC extends script_t(hb_script_t.HB_SCRIPT_ARABIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Armn`
    */
  case ARMENIAN extends script_t(hb_script_t.HB_SCRIPT_ARMENIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Beng`
    */
  case BENGALI extends script_t(hb_script_t.HB_SCRIPT_BENGALI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Cyrl`
    */
  case CYRILLIC extends script_t(hb_script_t.HB_SCRIPT_CYRILLIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Deva`
    */
  case DEVANAGARI extends script_t(hb_script_t.HB_SCRIPT_DEVANAGARI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Geor`
    */
  case GEORGIAN extends script_t(hb_script_t.HB_SCRIPT_GEORGIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Grek`
    */
  case GREEK extends script_t(hb_script_t.HB_SCRIPT_GREEK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Gujr`
    */
  case GUJARATI extends script_t(hb_script_t.HB_SCRIPT_GUJARATI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Guru`
    */
  case GURMUKHI extends script_t(hb_script_t.HB_SCRIPT_GURMUKHI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Hang`
    */
  case HANGUL extends script_t(hb_script_t.HB_SCRIPT_HANGUL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Hani`
    */
  case HAN extends script_t(hb_script_t.HB_SCRIPT_HAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Hebr`
    */
  case HEBREW extends script_t(hb_script_t.HB_SCRIPT_HEBREW)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Hira`
    */
  case HIRAGANA extends script_t(hb_script_t.HB_SCRIPT_HIRAGANA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Knda`
    */
  case KANNADA extends script_t(hb_script_t.HB_SCRIPT_KANNADA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Kana`
    */
  case KATAKANA extends script_t(hb_script_t.HB_SCRIPT_KATAKANA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Laoo`
    */
  case LAO extends script_t(hb_script_t.HB_SCRIPT_LAO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Latn`
    */
  case LATIN extends script_t(hb_script_t.HB_SCRIPT_LATIN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Mlym`
    */
  case MALAYALAM extends script_t(hb_script_t.HB_SCRIPT_MALAYALAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Orya`
    */
  case ORIYA extends script_t(hb_script_t.HB_SCRIPT_ORIYA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Taml`
    */
  case TAMIL extends script_t(hb_script_t.HB_SCRIPT_TAMIL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Telu`
    */
  case TELUGU extends script_t(hb_script_t.HB_SCRIPT_TELUGU)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Thai`
    */
  case THAI extends script_t(hb_script_t.HB_SCRIPT_THAI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Tibt`
    */
  case TIBETAN extends script_t(hb_script_t.HB_SCRIPT_TIBETAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Bopo`
    */
  case BOPOMOFO extends script_t(hb_script_t.HB_SCRIPT_BOPOMOFO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Brai`
    */
  case BRAILLE extends script_t(hb_script_t.HB_SCRIPT_BRAILLE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Cans`
    */
  case CANADIAN_SYLLABICS
      extends script_t(hb_script_t.HB_SCRIPT_CANADIAN_SYLLABICS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Cher`
    */
  case CHEROKEE extends script_t(hb_script_t.HB_SCRIPT_CHEROKEE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Ethi`
    */
  case ETHIOPIC extends script_t(hb_script_t.HB_SCRIPT_ETHIOPIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Khmr`
    */
  case KHMER extends script_t(hb_script_t.HB_SCRIPT_KHMER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Mong`
    */
  case MONGOLIAN extends script_t(hb_script_t.HB_SCRIPT_MONGOLIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Mymr`
    */
  case MYANMAR extends script_t(hb_script_t.HB_SCRIPT_MYANMAR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Ogam`
    */
  case OGHAM extends script_t(hb_script_t.HB_SCRIPT_OGHAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Runr`
    */
  case RUNIC extends script_t(hb_script_t.HB_SCRIPT_RUNIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Sinh`
    */
  case SINHALA extends script_t(hb_script_t.HB_SCRIPT_SINHALA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Syrc`
    */
  case SYRIAC extends script_t(hb_script_t.HB_SCRIPT_SYRIAC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Thaa`
    */
  case THAANA extends script_t(hb_script_t.HB_SCRIPT_THAANA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Yiii`
    */
  case YI extends script_t(hb_script_t.HB_SCRIPT_YI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Dsrt`
    */
  case DESERET extends script_t(hb_script_t.HB_SCRIPT_DESERET)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Goth`
    */
  case GOTHIC extends script_t(hb_script_t.HB_SCRIPT_GOTHIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Ital`
    */
  case OLD_ITALIC extends script_t(hb_script_t.HB_SCRIPT_OLD_ITALIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Buhd`
    */
  case BUHID extends script_t(hb_script_t.HB_SCRIPT_BUHID)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Hano`
    */
  case HANUNOO extends script_t(hb_script_t.HB_SCRIPT_HANUNOO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Tglg`
    */
  case TAGALOG extends script_t(hb_script_t.HB_SCRIPT_TAGALOG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Tagb`
    */
  case TAGBANWA extends script_t(hb_script_t.HB_SCRIPT_TAGBANWA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Cprt`
    */
  case CYPRIOT extends script_t(hb_script_t.HB_SCRIPT_CYPRIOT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Limb`
    */
  case LIMBU extends script_t(hb_script_t.HB_SCRIPT_LIMBU)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Linb`
    */
  case LINEAR_B extends script_t(hb_script_t.HB_SCRIPT_LINEAR_B)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Osma`
    */
  case OSMANYA extends script_t(hb_script_t.HB_SCRIPT_OSMANYA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Shaw`
    */
  case SHAVIAN extends script_t(hb_script_t.HB_SCRIPT_SHAVIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Tale`
    */
  case TAI_LE extends script_t(hb_script_t.HB_SCRIPT_TAI_LE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Ugar`
    */
  case UGARITIC extends script_t(hb_script_t.HB_SCRIPT_UGARITIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Bugi`
    */
  case BUGINESE extends script_t(hb_script_t.HB_SCRIPT_BUGINESE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Copt`
    */
  case COPTIC extends script_t(hb_script_t.HB_SCRIPT_COPTIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Glag`
    */
  case GLAGOLITIC extends script_t(hb_script_t.HB_SCRIPT_GLAGOLITIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Khar`
    */
  case KHAROSHTHI extends script_t(hb_script_t.HB_SCRIPT_KHAROSHTHI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Talu`
    */
  case NEW_TAI_LUE extends script_t(hb_script_t.HB_SCRIPT_NEW_TAI_LUE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Xpeo`
    */
  case OLD_PERSIAN extends script_t(hb_script_t.HB_SCRIPT_OLD_PERSIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Sylo`
    */
  case SYLOTI_NAGRI extends script_t(hb_script_t.HB_SCRIPT_SYLOTI_NAGRI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Tfng`
    */
  case TIFINAGH extends script_t(hb_script_t.HB_SCRIPT_TIFINAGH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Bali`
    */
  case BALINESE extends script_t(hb_script_t.HB_SCRIPT_BALINESE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Xsux`
    */
  case CUNEIFORM extends script_t(hb_script_t.HB_SCRIPT_CUNEIFORM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Nkoo`
    */
  case NKO extends script_t(hb_script_t.HB_SCRIPT_NKO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Phag`
    */
  case PHAGS_PA extends script_t(hb_script_t.HB_SCRIPT_PHAGS_PA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Phnx`
    */
  case PHOENICIAN extends script_t(hb_script_t.HB_SCRIPT_PHOENICIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Cari`
    */
  case CARIAN extends script_t(hb_script_t.HB_SCRIPT_CARIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Cham`
    */
  case CHAM extends script_t(hb_script_t.HB_SCRIPT_CHAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Kali`
    */
  case KAYAH_LI extends script_t(hb_script_t.HB_SCRIPT_KAYAH_LI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Lepc`
    */
  case LEPCHA extends script_t(hb_script_t.HB_SCRIPT_LEPCHA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Lyci`
    */
  case LYCIAN extends script_t(hb_script_t.HB_SCRIPT_LYCIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Lydi`
    */
  case LYDIAN extends script_t(hb_script_t.HB_SCRIPT_LYDIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Olck`
    */
  case OL_CHIKI extends script_t(hb_script_t.HB_SCRIPT_OL_CHIKI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Rjng`
    */
  case REJANG extends script_t(hb_script_t.HB_SCRIPT_REJANG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Saur`
    */
  case SAURASHTRA extends script_t(hb_script_t.HB_SCRIPT_SAURASHTRA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Sund`
    */
  case SUNDANESE extends script_t(hb_script_t.HB_SCRIPT_SUNDANESE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Vaii`
    */
  case VAI extends script_t(hb_script_t.HB_SCRIPT_VAI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Avst`
    */
  case AVESTAN extends script_t(hb_script_t.HB_SCRIPT_AVESTAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Bamu`
    */
  case BAMUM extends script_t(hb_script_t.HB_SCRIPT_BAMUM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Egyp`
    */
  case EGYPTIAN_HIEROGLYPHS
      extends script_t(hb_script_t.HB_SCRIPT_EGYPTIAN_HIEROGLYPHS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Armi`
    */
  case IMPERIAL_ARAMAIC extends script_t(hb_script_t.HB_SCRIPT_IMPERIAL_ARAMAIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Phli`
    */
  case INSCRIPTIONAL_PAHLAVI
      extends script_t(hb_script_t.HB_SCRIPT_INSCRIPTIONAL_PAHLAVI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Prti`
    */
  case INSCRIPTIONAL_PARTHIAN
      extends script_t(hb_script_t.HB_SCRIPT_INSCRIPTIONAL_PARTHIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Java`
    */
  case JAVANESE extends script_t(hb_script_t.HB_SCRIPT_JAVANESE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Kthi`
    */
  case KAITHI extends script_t(hb_script_t.HB_SCRIPT_KAITHI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Lisu`
    */
  case LISU extends script_t(hb_script_t.HB_SCRIPT_LISU)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Mtei`
    */
  case MEETEI_MAYEK extends script_t(hb_script_t.HB_SCRIPT_MEETEI_MAYEK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Sarb`
    */
  case OLD_SOUTH_ARABIAN
      extends script_t(hb_script_t.HB_SCRIPT_OLD_SOUTH_ARABIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Orkh`
    */
  case OLD_TURKIC extends script_t(hb_script_t.HB_SCRIPT_OLD_TURKIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Samr`
    */
  case SAMARITAN extends script_t(hb_script_t.HB_SCRIPT_SAMARITAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Lana`
    */
  case TAI_THAM extends script_t(hb_script_t.HB_SCRIPT_TAI_THAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Tavt`
    */
  case TAI_VIET extends script_t(hb_script_t.HB_SCRIPT_TAI_VIET)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Batk`
    */
  case BATAK extends script_t(hb_script_t.HB_SCRIPT_BATAK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Brah`
    */
  case BRAHMI extends script_t(hb_script_t.HB_SCRIPT_BRAHMI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Mand`
    */
  case MANDAIC extends script_t(hb_script_t.HB_SCRIPT_MANDAIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Cakm`
    */
  case CHAKMA extends script_t(hb_script_t.HB_SCRIPT_CHAKMA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Merc`
    */
  case MEROITIC_CURSIVE extends script_t(hb_script_t.HB_SCRIPT_MEROITIC_CURSIVE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Mero`
    */
  case MEROITIC_HIEROGLYPHS
      extends script_t(hb_script_t.HB_SCRIPT_MEROITIC_HIEROGLYPHS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Plrd`
    */
  case MIAO extends script_t(hb_script_t.HB_SCRIPT_MIAO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Shrd`
    */
  case SHARADA extends script_t(hb_script_t.HB_SCRIPT_SHARADA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Sora`
    */
  case SORA_SOMPENG extends script_t(hb_script_t.HB_SCRIPT_SORA_SOMPENG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Takr`
    */
  case TAKRI extends script_t(hb_script_t.HB_SCRIPT_TAKRI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Bass`, Since: 0.9.30
    */
  case BASSA_VAH extends script_t(hb_script_t.HB_SCRIPT_BASSA_VAH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Aghb`, Since: 0.9.30
    */
  case CAUCASIAN_ALBANIAN
      extends script_t(hb_script_t.HB_SCRIPT_CAUCASIAN_ALBANIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Dupl`, Since: 0.9.30
    */
  case DUPLOYAN extends script_t(hb_script_t.HB_SCRIPT_DUPLOYAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Elba`, Since: 0.9.30
    */
  case ELBASAN extends script_t(hb_script_t.HB_SCRIPT_ELBASAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Gran`, Since: 0.9.30
    */
  case GRANTHA extends script_t(hb_script_t.HB_SCRIPT_GRANTHA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Khoj`, Since: 0.9.30
    */
  case KHOJKI extends script_t(hb_script_t.HB_SCRIPT_KHOJKI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Sind`, Since: 0.9.30
    */
  case KHUDAWADI extends script_t(hb_script_t.HB_SCRIPT_KHUDAWADI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Lina`, Since: 0.9.30
    */
  case LINEAR_A extends script_t(hb_script_t.HB_SCRIPT_LINEAR_A)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Mahj`, Since: 0.9.30
    */
  case MAHAJANI extends script_t(hb_script_t.HB_SCRIPT_MAHAJANI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Mani`, Since: 0.9.30
    */
  case MANICHAEAN extends script_t(hb_script_t.HB_SCRIPT_MANICHAEAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Mend`, Since: 0.9.30
    */
  case MENDE_KIKAKUI extends script_t(hb_script_t.HB_SCRIPT_MENDE_KIKAKUI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Modi`, Since: 0.9.30
    */
  case MODI extends script_t(hb_script_t.HB_SCRIPT_MODI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Mroo`, Since: 0.9.30
    */
  case MRO extends script_t(hb_script_t.HB_SCRIPT_MRO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Nbat`, Since: 0.9.30
    */
  case NABATAEAN extends script_t(hb_script_t.HB_SCRIPT_NABATAEAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Narb`, Since: 0.9.30
    */
  case OLD_NORTH_ARABIAN
      extends script_t(hb_script_t.HB_SCRIPT_OLD_NORTH_ARABIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Perm`, Since: 0.9.30
    */
  case OLD_PERMIC extends script_t(hb_script_t.HB_SCRIPT_OLD_PERMIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Hmng`, Since: 0.9.30
    */
  case PAHAWH_HMONG extends script_t(hb_script_t.HB_SCRIPT_PAHAWH_HMONG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Palm`, Since: 0.9.30
    */
  case PALMYRENE extends script_t(hb_script_t.HB_SCRIPT_PALMYRENE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Pauc`, Since: 0.9.30
    */
  case PAU_CIN_HAU extends script_t(hb_script_t.HB_SCRIPT_PAU_CIN_HAU)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Phlp`, Since: 0.9.30
    */
  case PSALTER_PAHLAVI extends script_t(hb_script_t.HB_SCRIPT_PSALTER_PAHLAVI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Sidd`, Since: 0.9.30
    */
  case SIDDHAM extends script_t(hb_script_t.HB_SCRIPT_SIDDHAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Tirh`, Since: 0.9.30
    */
  case TIRHUTA extends script_t(hb_script_t.HB_SCRIPT_TIRHUTA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Wara`, Since: 0.9.30
    */
  case WARANG_CITI extends script_t(hb_script_t.HB_SCRIPT_WARANG_CITI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Ahom`, Since: 0.9.30
    */
  case AHOM extends script_t(hb_script_t.HB_SCRIPT_AHOM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Hluw`, Since: 0.9.30
    */
  case ANATOLIAN_HIEROGLYPHS
      extends script_t(hb_script_t.HB_SCRIPT_ANATOLIAN_HIEROGLYPHS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Hatr`, Since: 0.9.30
    */
  case HATRAN extends script_t(hb_script_t.HB_SCRIPT_HATRAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Mult`, Since: 0.9.30
    */
  case MULTANI extends script_t(hb_script_t.HB_SCRIPT_MULTANI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Hung`, Since: 0.9.30
    */
  case OLD_HUNGARIAN extends script_t(hb_script_t.HB_SCRIPT_OLD_HUNGARIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Sgnw`, Since: 0.9.30
    */
  case SIGNWRITING extends script_t(hb_script_t.HB_SCRIPT_SIGNWRITING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Adlm`, Since: 1.3.0
    */
  case ADLAM extends script_t(hb_script_t.HB_SCRIPT_ADLAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Bhks`, Since: 1.3.0
    */
  case BHAIKSUKI extends script_t(hb_script_t.HB_SCRIPT_BHAIKSUKI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Marc`, Since: 1.3.0
    */
  case MARCHEN extends script_t(hb_script_t.HB_SCRIPT_MARCHEN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Osge`, Since: 1.3.0
    */
  case OSAGE extends script_t(hb_script_t.HB_SCRIPT_OSAGE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Tang`, Since: 1.3.0
    */
  case TANGUT extends script_t(hb_script_t.HB_SCRIPT_TANGUT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Newa`, Since: 1.3.0
    */
  case NEWA extends script_t(hb_script_t.HB_SCRIPT_NEWA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Gonm`, Since: 1.6.0
    */
  case MASARAM_GONDI extends script_t(hb_script_t.HB_SCRIPT_MASARAM_GONDI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Nshu`, Since: 1.6.0
    */
  case NUSHU extends script_t(hb_script_t.HB_SCRIPT_NUSHU)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Soyo`, Since: 1.6.0
    */
  case SOYOMBO extends script_t(hb_script_t.HB_SCRIPT_SOYOMBO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Zanb`, Since: 1.6.0
    */
  case ZANABAZAR_SQUARE extends script_t(hb_script_t.HB_SCRIPT_ZANABAZAR_SQUARE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Dogr`, Since: 1.8.0
    */
  case DOGRA extends script_t(hb_script_t.HB_SCRIPT_DOGRA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Gong`, Since: 1.8.0
    */
  case GUNJALA_GONDI extends script_t(hb_script_t.HB_SCRIPT_GUNJALA_GONDI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Rohg`, Since: 1.8.0
    */
  case HANIFI_ROHINGYA extends script_t(hb_script_t.HB_SCRIPT_HANIFI_ROHINGYA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Maka`, Since: 1.8.0
    */
  case MAKASAR extends script_t(hb_script_t.HB_SCRIPT_MAKASAR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Medf`, Since: 1.8.0
    */
  case MEDEFAIDRIN extends script_t(hb_script_t.HB_SCRIPT_MEDEFAIDRIN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Sogo`, Since: 1.8.0
    */
  case OLD_SOGDIAN extends script_t(hb_script_t.HB_SCRIPT_OLD_SOGDIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Sogd`, Since: 1.8.0
    */
  case SOGDIAN extends script_t(hb_script_t.HB_SCRIPT_SOGDIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Elym`, Since: 2.4.0
    */
  case ELYMAIC extends script_t(hb_script_t.HB_SCRIPT_ELYMAIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Nand`, Since: 2.4.0
    */
  case NANDINAGARI extends script_t(hb_script_t.HB_SCRIPT_NANDINAGARI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Hmnp`, Since: 2.4.0
    */
  case NYIAKENG_PUACHUE_HMONG
      extends script_t(hb_script_t.HB_SCRIPT_NYIAKENG_PUACHUE_HMONG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Wcho`, Since: 2.4.0
    */
  case WANCHO extends script_t(hb_script_t.HB_SCRIPT_WANCHO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Chrs`, Since: 2.6.7
    */
  case CHORASMIAN extends script_t(hb_script_t.HB_SCRIPT_CHORASMIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Diak`, Since: 2.6.7
    */
  case DIVES_AKURU extends script_t(hb_script_t.HB_SCRIPT_DIVES_AKURU)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Kits`, Since: 2.6.7
    */
  case KHITAN_SMALL_SCRIPT
      extends script_t(hb_script_t.HB_SCRIPT_KHITAN_SMALL_SCRIPT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Yezi`, Since: 2.6.7
    */
  case YEZIDI extends script_t(hb_script_t.HB_SCRIPT_YEZIDI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Cpmn`, Since: 3.0.0
    */
  case CYPRO_MINOAN extends script_t(hb_script_t.HB_SCRIPT_CYPRO_MINOAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Ougr`, Since: 3.0.0
    */
  case OLD_UYGHUR extends script_t(hb_script_t.HB_SCRIPT_OLD_UYGHUR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Tnsa`, Since: 3.0.0
    */
  case TANGSA extends script_t(hb_script_t.HB_SCRIPT_TANGSA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Toto`, Since: 3.0.0
    */
  case TOTO extends script_t(hb_script_t.HB_SCRIPT_TOTO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Vith`, Since: 3.0.0
    */
  case VITHKUQI extends script_t(hb_script_t.HB_SCRIPT_VITHKUQI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Zmth`, Since: 3.4.0
    */
  case MATH extends script_t(hb_script_t.HB_SCRIPT_MATH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Kawi`, Since: 5.2.0
    */
  case KAWI extends script_t(hb_script_t.HB_SCRIPT_KAWI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Nagm`, Since: 5.2.0
    */
  case NAG_MUNDARI extends script_t(hb_script_t.HB_SCRIPT_NAG_MUNDARI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No script set
    */
  case INVALID extends script_t(hb_script_t.HB_SCRIPT_INVALID)
end script_t

object script_t:
  def fromRaw(raw: hb_script_t): script_t =
    raw match
      case hb_script_t.HB_SCRIPT_COMMON             => script_t.COMMON
      case hb_script_t.HB_SCRIPT_INHERITED          => script_t.INHERITED
      case hb_script_t.HB_SCRIPT_UNKNOWN            => script_t.UNKNOWN
      case hb_script_t.HB_SCRIPT_ARABIC             => script_t.ARABIC
      case hb_script_t.HB_SCRIPT_ARMENIAN           => script_t.ARMENIAN
      case hb_script_t.HB_SCRIPT_BENGALI            => script_t.BENGALI
      case hb_script_t.HB_SCRIPT_CYRILLIC           => script_t.CYRILLIC
      case hb_script_t.HB_SCRIPT_DEVANAGARI         => script_t.DEVANAGARI
      case hb_script_t.HB_SCRIPT_GEORGIAN           => script_t.GEORGIAN
      case hb_script_t.HB_SCRIPT_GREEK              => script_t.GREEK
      case hb_script_t.HB_SCRIPT_GUJARATI           => script_t.GUJARATI
      case hb_script_t.HB_SCRIPT_GURMUKHI           => script_t.GURMUKHI
      case hb_script_t.HB_SCRIPT_HANGUL             => script_t.HANGUL
      case hb_script_t.HB_SCRIPT_HAN                => script_t.HAN
      case hb_script_t.HB_SCRIPT_HEBREW             => script_t.HEBREW
      case hb_script_t.HB_SCRIPT_HIRAGANA           => script_t.HIRAGANA
      case hb_script_t.HB_SCRIPT_KANNADA            => script_t.KANNADA
      case hb_script_t.HB_SCRIPT_KATAKANA           => script_t.KATAKANA
      case hb_script_t.HB_SCRIPT_LAO                => script_t.LAO
      case hb_script_t.HB_SCRIPT_LATIN              => script_t.LATIN
      case hb_script_t.HB_SCRIPT_MALAYALAM          => script_t.MALAYALAM
      case hb_script_t.HB_SCRIPT_ORIYA              => script_t.ORIYA
      case hb_script_t.HB_SCRIPT_TAMIL              => script_t.TAMIL
      case hb_script_t.HB_SCRIPT_TELUGU             => script_t.TELUGU
      case hb_script_t.HB_SCRIPT_THAI               => script_t.THAI
      case hb_script_t.HB_SCRIPT_TIBETAN            => script_t.TIBETAN
      case hb_script_t.HB_SCRIPT_BOPOMOFO           => script_t.BOPOMOFO
      case hb_script_t.HB_SCRIPT_BRAILLE            => script_t.BRAILLE
      case hb_script_t.HB_SCRIPT_CANADIAN_SYLLABICS =>
        script_t.CANADIAN_SYLLABICS
      case hb_script_t.HB_SCRIPT_CHEROKEE             => script_t.CHEROKEE
      case hb_script_t.HB_SCRIPT_ETHIOPIC             => script_t.ETHIOPIC
      case hb_script_t.HB_SCRIPT_KHMER                => script_t.KHMER
      case hb_script_t.HB_SCRIPT_MONGOLIAN            => script_t.MONGOLIAN
      case hb_script_t.HB_SCRIPT_MYANMAR              => script_t.MYANMAR
      case hb_script_t.HB_SCRIPT_OGHAM                => script_t.OGHAM
      case hb_script_t.HB_SCRIPT_RUNIC                => script_t.RUNIC
      case hb_script_t.HB_SCRIPT_SINHALA              => script_t.SINHALA
      case hb_script_t.HB_SCRIPT_SYRIAC               => script_t.SYRIAC
      case hb_script_t.HB_SCRIPT_THAANA               => script_t.THAANA
      case hb_script_t.HB_SCRIPT_YI                   => script_t.YI
      case hb_script_t.HB_SCRIPT_DESERET              => script_t.DESERET
      case hb_script_t.HB_SCRIPT_GOTHIC               => script_t.GOTHIC
      case hb_script_t.HB_SCRIPT_OLD_ITALIC           => script_t.OLD_ITALIC
      case hb_script_t.HB_SCRIPT_BUHID                => script_t.BUHID
      case hb_script_t.HB_SCRIPT_HANUNOO              => script_t.HANUNOO
      case hb_script_t.HB_SCRIPT_TAGALOG              => script_t.TAGALOG
      case hb_script_t.HB_SCRIPT_TAGBANWA             => script_t.TAGBANWA
      case hb_script_t.HB_SCRIPT_CYPRIOT              => script_t.CYPRIOT
      case hb_script_t.HB_SCRIPT_LIMBU                => script_t.LIMBU
      case hb_script_t.HB_SCRIPT_LINEAR_B             => script_t.LINEAR_B
      case hb_script_t.HB_SCRIPT_OSMANYA              => script_t.OSMANYA
      case hb_script_t.HB_SCRIPT_SHAVIAN              => script_t.SHAVIAN
      case hb_script_t.HB_SCRIPT_TAI_LE               => script_t.TAI_LE
      case hb_script_t.HB_SCRIPT_UGARITIC             => script_t.UGARITIC
      case hb_script_t.HB_SCRIPT_BUGINESE             => script_t.BUGINESE
      case hb_script_t.HB_SCRIPT_COPTIC               => script_t.COPTIC
      case hb_script_t.HB_SCRIPT_GLAGOLITIC           => script_t.GLAGOLITIC
      case hb_script_t.HB_SCRIPT_KHAROSHTHI           => script_t.KHAROSHTHI
      case hb_script_t.HB_SCRIPT_NEW_TAI_LUE          => script_t.NEW_TAI_LUE
      case hb_script_t.HB_SCRIPT_OLD_PERSIAN          => script_t.OLD_PERSIAN
      case hb_script_t.HB_SCRIPT_SYLOTI_NAGRI         => script_t.SYLOTI_NAGRI
      case hb_script_t.HB_SCRIPT_TIFINAGH             => script_t.TIFINAGH
      case hb_script_t.HB_SCRIPT_BALINESE             => script_t.BALINESE
      case hb_script_t.HB_SCRIPT_CUNEIFORM            => script_t.CUNEIFORM
      case hb_script_t.HB_SCRIPT_NKO                  => script_t.NKO
      case hb_script_t.HB_SCRIPT_PHAGS_PA             => script_t.PHAGS_PA
      case hb_script_t.HB_SCRIPT_PHOENICIAN           => script_t.PHOENICIAN
      case hb_script_t.HB_SCRIPT_CARIAN               => script_t.CARIAN
      case hb_script_t.HB_SCRIPT_CHAM                 => script_t.CHAM
      case hb_script_t.HB_SCRIPT_KAYAH_LI             => script_t.KAYAH_LI
      case hb_script_t.HB_SCRIPT_LEPCHA               => script_t.LEPCHA
      case hb_script_t.HB_SCRIPT_LYCIAN               => script_t.LYCIAN
      case hb_script_t.HB_SCRIPT_LYDIAN               => script_t.LYDIAN
      case hb_script_t.HB_SCRIPT_OL_CHIKI             => script_t.OL_CHIKI
      case hb_script_t.HB_SCRIPT_REJANG               => script_t.REJANG
      case hb_script_t.HB_SCRIPT_SAURASHTRA           => script_t.SAURASHTRA
      case hb_script_t.HB_SCRIPT_SUNDANESE            => script_t.SUNDANESE
      case hb_script_t.HB_SCRIPT_VAI                  => script_t.VAI
      case hb_script_t.HB_SCRIPT_AVESTAN              => script_t.AVESTAN
      case hb_script_t.HB_SCRIPT_BAMUM                => script_t.BAMUM
      case hb_script_t.HB_SCRIPT_EGYPTIAN_HIEROGLYPHS =>
        script_t.EGYPTIAN_HIEROGLYPHS
      case hb_script_t.HB_SCRIPT_IMPERIAL_ARAMAIC => script_t.IMPERIAL_ARAMAIC
      case hb_script_t.HB_SCRIPT_INSCRIPTIONAL_PAHLAVI =>
        script_t.INSCRIPTIONAL_PAHLAVI
      case hb_script_t.HB_SCRIPT_INSCRIPTIONAL_PARTHIAN =>
        script_t.INSCRIPTIONAL_PARTHIAN
      case hb_script_t.HB_SCRIPT_JAVANESE          => script_t.JAVANESE
      case hb_script_t.HB_SCRIPT_KAITHI            => script_t.KAITHI
      case hb_script_t.HB_SCRIPT_LISU              => script_t.LISU
      case hb_script_t.HB_SCRIPT_MEETEI_MAYEK      => script_t.MEETEI_MAYEK
      case hb_script_t.HB_SCRIPT_OLD_SOUTH_ARABIAN => script_t.OLD_SOUTH_ARABIAN
      case hb_script_t.HB_SCRIPT_OLD_TURKIC        => script_t.OLD_TURKIC
      case hb_script_t.HB_SCRIPT_SAMARITAN         => script_t.SAMARITAN
      case hb_script_t.HB_SCRIPT_TAI_THAM          => script_t.TAI_THAM
      case hb_script_t.HB_SCRIPT_TAI_VIET          => script_t.TAI_VIET
      case hb_script_t.HB_SCRIPT_BATAK             => script_t.BATAK
      case hb_script_t.HB_SCRIPT_BRAHMI            => script_t.BRAHMI
      case hb_script_t.HB_SCRIPT_MANDAIC           => script_t.MANDAIC
      case hb_script_t.HB_SCRIPT_CHAKMA            => script_t.CHAKMA
      case hb_script_t.HB_SCRIPT_MEROITIC_CURSIVE  => script_t.MEROITIC_CURSIVE
      case hb_script_t.HB_SCRIPT_MEROITIC_HIEROGLYPHS =>
        script_t.MEROITIC_HIEROGLYPHS
      case hb_script_t.HB_SCRIPT_MIAO               => script_t.MIAO
      case hb_script_t.HB_SCRIPT_SHARADA            => script_t.SHARADA
      case hb_script_t.HB_SCRIPT_SORA_SOMPENG       => script_t.SORA_SOMPENG
      case hb_script_t.HB_SCRIPT_TAKRI              => script_t.TAKRI
      case hb_script_t.HB_SCRIPT_BASSA_VAH          => script_t.BASSA_VAH
      case hb_script_t.HB_SCRIPT_CAUCASIAN_ALBANIAN =>
        script_t.CAUCASIAN_ALBANIAN
      case hb_script_t.HB_SCRIPT_DUPLOYAN          => script_t.DUPLOYAN
      case hb_script_t.HB_SCRIPT_ELBASAN           => script_t.ELBASAN
      case hb_script_t.HB_SCRIPT_GRANTHA           => script_t.GRANTHA
      case hb_script_t.HB_SCRIPT_KHOJKI            => script_t.KHOJKI
      case hb_script_t.HB_SCRIPT_KHUDAWADI         => script_t.KHUDAWADI
      case hb_script_t.HB_SCRIPT_LINEAR_A          => script_t.LINEAR_A
      case hb_script_t.HB_SCRIPT_MAHAJANI          => script_t.MAHAJANI
      case hb_script_t.HB_SCRIPT_MANICHAEAN        => script_t.MANICHAEAN
      case hb_script_t.HB_SCRIPT_MENDE_KIKAKUI     => script_t.MENDE_KIKAKUI
      case hb_script_t.HB_SCRIPT_MODI              => script_t.MODI
      case hb_script_t.HB_SCRIPT_MRO               => script_t.MRO
      case hb_script_t.HB_SCRIPT_NABATAEAN         => script_t.NABATAEAN
      case hb_script_t.HB_SCRIPT_OLD_NORTH_ARABIAN => script_t.OLD_NORTH_ARABIAN
      case hb_script_t.HB_SCRIPT_OLD_PERMIC        => script_t.OLD_PERMIC
      case hb_script_t.HB_SCRIPT_PAHAWH_HMONG      => script_t.PAHAWH_HMONG
      case hb_script_t.HB_SCRIPT_PALMYRENE         => script_t.PALMYRENE
      case hb_script_t.HB_SCRIPT_PAU_CIN_HAU       => script_t.PAU_CIN_HAU
      case hb_script_t.HB_SCRIPT_PSALTER_PAHLAVI   => script_t.PSALTER_PAHLAVI
      case hb_script_t.HB_SCRIPT_SIDDHAM           => script_t.SIDDHAM
      case hb_script_t.HB_SCRIPT_TIRHUTA           => script_t.TIRHUTA
      case hb_script_t.HB_SCRIPT_WARANG_CITI       => script_t.WARANG_CITI
      case hb_script_t.HB_SCRIPT_AHOM              => script_t.AHOM
      case hb_script_t.HB_SCRIPT_ANATOLIAN_HIEROGLYPHS =>
        script_t.ANATOLIAN_HIEROGLYPHS
      case hb_script_t.HB_SCRIPT_HATRAN           => script_t.HATRAN
      case hb_script_t.HB_SCRIPT_MULTANI          => script_t.MULTANI
      case hb_script_t.HB_SCRIPT_OLD_HUNGARIAN    => script_t.OLD_HUNGARIAN
      case hb_script_t.HB_SCRIPT_SIGNWRITING      => script_t.SIGNWRITING
      case hb_script_t.HB_SCRIPT_ADLAM            => script_t.ADLAM
      case hb_script_t.HB_SCRIPT_BHAIKSUKI        => script_t.BHAIKSUKI
      case hb_script_t.HB_SCRIPT_MARCHEN          => script_t.MARCHEN
      case hb_script_t.HB_SCRIPT_OSAGE            => script_t.OSAGE
      case hb_script_t.HB_SCRIPT_TANGUT           => script_t.TANGUT
      case hb_script_t.HB_SCRIPT_NEWA             => script_t.NEWA
      case hb_script_t.HB_SCRIPT_MASARAM_GONDI    => script_t.MASARAM_GONDI
      case hb_script_t.HB_SCRIPT_NUSHU            => script_t.NUSHU
      case hb_script_t.HB_SCRIPT_SOYOMBO          => script_t.SOYOMBO
      case hb_script_t.HB_SCRIPT_ZANABAZAR_SQUARE => script_t.ZANABAZAR_SQUARE
      case hb_script_t.HB_SCRIPT_DOGRA            => script_t.DOGRA
      case hb_script_t.HB_SCRIPT_GUNJALA_GONDI    => script_t.GUNJALA_GONDI
      case hb_script_t.HB_SCRIPT_HANIFI_ROHINGYA  => script_t.HANIFI_ROHINGYA
      case hb_script_t.HB_SCRIPT_MAKASAR          => script_t.MAKASAR
      case hb_script_t.HB_SCRIPT_MEDEFAIDRIN      => script_t.MEDEFAIDRIN
      case hb_script_t.HB_SCRIPT_OLD_SOGDIAN      => script_t.OLD_SOGDIAN
      case hb_script_t.HB_SCRIPT_SOGDIAN          => script_t.SOGDIAN
      case hb_script_t.HB_SCRIPT_ELYMAIC          => script_t.ELYMAIC
      case hb_script_t.HB_SCRIPT_NANDINAGARI      => script_t.NANDINAGARI
      case hb_script_t.HB_SCRIPT_NYIAKENG_PUACHUE_HMONG =>
        script_t.NYIAKENG_PUACHUE_HMONG
      case hb_script_t.HB_SCRIPT_WANCHO              => script_t.WANCHO
      case hb_script_t.HB_SCRIPT_CHORASMIAN          => script_t.CHORASMIAN
      case hb_script_t.HB_SCRIPT_DIVES_AKURU         => script_t.DIVES_AKURU
      case hb_script_t.HB_SCRIPT_KHITAN_SMALL_SCRIPT =>
        script_t.KHITAN_SMALL_SCRIPT
      case hb_script_t.HB_SCRIPT_YEZIDI       => script_t.YEZIDI
      case hb_script_t.HB_SCRIPT_CYPRO_MINOAN => script_t.CYPRO_MINOAN
      case hb_script_t.HB_SCRIPT_OLD_UYGHUR   => script_t.OLD_UYGHUR
      case hb_script_t.HB_SCRIPT_TANGSA       => script_t.TANGSA
      case hb_script_t.HB_SCRIPT_TOTO         => script_t.TOTO
      case hb_script_t.HB_SCRIPT_VITHKUQI     => script_t.VITHKUQI
      case hb_script_t.HB_SCRIPT_MATH         => script_t.MATH
      case hb_script_t.HB_SCRIPT_KAWI         => script_t.KAWI
      case hb_script_t.HB_SCRIPT_NAG_MUNDARI  => script_t.NAG_MUNDARI
      case hb_script_t.HB_SCRIPT_INVALID      => script_t.INVALID
  end fromRaw
end script_t
