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
enum Script_t(val raw: hb_script_t):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Zyyy`
    */
  case COMMON extends Script_t(hb_script_t.HB_SCRIPT_COMMON)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Zinh`
    */
  case INHERITED extends Script_t(hb_script_t.HB_SCRIPT_INHERITED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Zzzz`
    */
  case UNKNOWN extends Script_t(hb_script_t.HB_SCRIPT_UNKNOWN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Arab`
    */
  case ARABIC extends Script_t(hb_script_t.HB_SCRIPT_ARABIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Armn`
    */
  case ARMENIAN extends Script_t(hb_script_t.HB_SCRIPT_ARMENIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Beng`
    */
  case BENGALI extends Script_t(hb_script_t.HB_SCRIPT_BENGALI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Cyrl`
    */
  case CYRILLIC extends Script_t(hb_script_t.HB_SCRIPT_CYRILLIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Deva`
    */
  case DEVANAGARI extends Script_t(hb_script_t.HB_SCRIPT_DEVANAGARI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Geor`
    */
  case GEORGIAN extends Script_t(hb_script_t.HB_SCRIPT_GEORGIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Grek`
    */
  case GREEK extends Script_t(hb_script_t.HB_SCRIPT_GREEK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Gujr`
    */
  case GUJARATI extends Script_t(hb_script_t.HB_SCRIPT_GUJARATI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Guru`
    */
  case GURMUKHI extends Script_t(hb_script_t.HB_SCRIPT_GURMUKHI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Hang`
    */
  case HANGUL extends Script_t(hb_script_t.HB_SCRIPT_HANGUL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Hani`
    */
  case HAN extends Script_t(hb_script_t.HB_SCRIPT_HAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Hebr`
    */
  case HEBREW extends Script_t(hb_script_t.HB_SCRIPT_HEBREW)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Hira`
    */
  case HIRAGANA extends Script_t(hb_script_t.HB_SCRIPT_HIRAGANA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Knda`
    */
  case KANNADA extends Script_t(hb_script_t.HB_SCRIPT_KANNADA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Kana`
    */
  case KATAKANA extends Script_t(hb_script_t.HB_SCRIPT_KATAKANA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Laoo`
    */
  case LAO extends Script_t(hb_script_t.HB_SCRIPT_LAO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Latn`
    */
  case LATIN extends Script_t(hb_script_t.HB_SCRIPT_LATIN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Mlym`
    */
  case MALAYALAM extends Script_t(hb_script_t.HB_SCRIPT_MALAYALAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Orya`
    */
  case ORIYA extends Script_t(hb_script_t.HB_SCRIPT_ORIYA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Taml`
    */
  case TAMIL extends Script_t(hb_script_t.HB_SCRIPT_TAMIL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Telu`
    */
  case TELUGU extends Script_t(hb_script_t.HB_SCRIPT_TELUGU)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Thai`
    */
  case THAI extends Script_t(hb_script_t.HB_SCRIPT_THAI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Tibt`
    */
  case TIBETAN extends Script_t(hb_script_t.HB_SCRIPT_TIBETAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Bopo`
    */
  case BOPOMOFO extends Script_t(hb_script_t.HB_SCRIPT_BOPOMOFO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Brai`
    */
  case BRAILLE extends Script_t(hb_script_t.HB_SCRIPT_BRAILLE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Cans`
    */
  case CANADIAN_SYLLABICS
      extends Script_t(hb_script_t.HB_SCRIPT_CANADIAN_SYLLABICS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Cher`
    */
  case CHEROKEE extends Script_t(hb_script_t.HB_SCRIPT_CHEROKEE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Ethi`
    */
  case ETHIOPIC extends Script_t(hb_script_t.HB_SCRIPT_ETHIOPIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Khmr`
    */
  case KHMER extends Script_t(hb_script_t.HB_SCRIPT_KHMER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Mong`
    */
  case MONGOLIAN extends Script_t(hb_script_t.HB_SCRIPT_MONGOLIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Mymr`
    */
  case MYANMAR extends Script_t(hb_script_t.HB_SCRIPT_MYANMAR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Ogam`
    */
  case OGHAM extends Script_t(hb_script_t.HB_SCRIPT_OGHAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Runr`
    */
  case RUNIC extends Script_t(hb_script_t.HB_SCRIPT_RUNIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Sinh`
    */
  case SINHALA extends Script_t(hb_script_t.HB_SCRIPT_SINHALA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Syrc`
    */
  case SYRIAC extends Script_t(hb_script_t.HB_SCRIPT_SYRIAC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Thaa`
    */
  case THAANA extends Script_t(hb_script_t.HB_SCRIPT_THAANA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Yiii`
    */
  case YI extends Script_t(hb_script_t.HB_SCRIPT_YI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Dsrt`
    */
  case DESERET extends Script_t(hb_script_t.HB_SCRIPT_DESERET)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Goth`
    */
  case GOTHIC extends Script_t(hb_script_t.HB_SCRIPT_GOTHIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Ital`
    */
  case OLD_ITALIC extends Script_t(hb_script_t.HB_SCRIPT_OLD_ITALIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Buhd`
    */
  case BUHID extends Script_t(hb_script_t.HB_SCRIPT_BUHID)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Hano`
    */
  case HANUNOO extends Script_t(hb_script_t.HB_SCRIPT_HANUNOO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Tglg`
    */
  case TAGALOG extends Script_t(hb_script_t.HB_SCRIPT_TAGALOG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Tagb`
    */
  case TAGBANWA extends Script_t(hb_script_t.HB_SCRIPT_TAGBANWA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Cprt`
    */
  case CYPRIOT extends Script_t(hb_script_t.HB_SCRIPT_CYPRIOT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Limb`
    */
  case LIMBU extends Script_t(hb_script_t.HB_SCRIPT_LIMBU)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Linb`
    */
  case LINEAR_B extends Script_t(hb_script_t.HB_SCRIPT_LINEAR_B)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Osma`
    */
  case OSMANYA extends Script_t(hb_script_t.HB_SCRIPT_OSMANYA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Shaw`
    */
  case SHAVIAN extends Script_t(hb_script_t.HB_SCRIPT_SHAVIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Tale`
    */
  case TAI_LE extends Script_t(hb_script_t.HB_SCRIPT_TAI_LE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Ugar`
    */
  case UGARITIC extends Script_t(hb_script_t.HB_SCRIPT_UGARITIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Bugi`
    */
  case BUGINESE extends Script_t(hb_script_t.HB_SCRIPT_BUGINESE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Copt`
    */
  case COPTIC extends Script_t(hb_script_t.HB_SCRIPT_COPTIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Glag`
    */
  case GLAGOLITIC extends Script_t(hb_script_t.HB_SCRIPT_GLAGOLITIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Khar`
    */
  case KHAROSHTHI extends Script_t(hb_script_t.HB_SCRIPT_KHAROSHTHI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Talu`
    */
  case NEW_TAI_LUE extends Script_t(hb_script_t.HB_SCRIPT_NEW_TAI_LUE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Xpeo`
    */
  case OLD_PERSIAN extends Script_t(hb_script_t.HB_SCRIPT_OLD_PERSIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Sylo`
    */
  case SYLOTI_NAGRI extends Script_t(hb_script_t.HB_SCRIPT_SYLOTI_NAGRI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Tfng`
    */
  case TIFINAGH extends Script_t(hb_script_t.HB_SCRIPT_TIFINAGH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Bali`
    */
  case BALINESE extends Script_t(hb_script_t.HB_SCRIPT_BALINESE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Xsux`
    */
  case CUNEIFORM extends Script_t(hb_script_t.HB_SCRIPT_CUNEIFORM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Nkoo`
    */
  case NKO extends Script_t(hb_script_t.HB_SCRIPT_NKO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Phag`
    */
  case PHAGS_PA extends Script_t(hb_script_t.HB_SCRIPT_PHAGS_PA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Phnx`
    */
  case PHOENICIAN extends Script_t(hb_script_t.HB_SCRIPT_PHOENICIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Cari`
    */
  case CARIAN extends Script_t(hb_script_t.HB_SCRIPT_CARIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Cham`
    */
  case CHAM extends Script_t(hb_script_t.HB_SCRIPT_CHAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Kali`
    */
  case KAYAH_LI extends Script_t(hb_script_t.HB_SCRIPT_KAYAH_LI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Lepc`
    */
  case LEPCHA extends Script_t(hb_script_t.HB_SCRIPT_LEPCHA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Lyci`
    */
  case LYCIAN extends Script_t(hb_script_t.HB_SCRIPT_LYCIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Lydi`
    */
  case LYDIAN extends Script_t(hb_script_t.HB_SCRIPT_LYDIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Olck`
    */
  case OL_CHIKI extends Script_t(hb_script_t.HB_SCRIPT_OL_CHIKI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Rjng`
    */
  case REJANG extends Script_t(hb_script_t.HB_SCRIPT_REJANG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Saur`
    */
  case SAURASHTRA extends Script_t(hb_script_t.HB_SCRIPT_SAURASHTRA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Sund`
    */
  case SUNDANESE extends Script_t(hb_script_t.HB_SCRIPT_SUNDANESE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Vaii`
    */
  case VAI extends Script_t(hb_script_t.HB_SCRIPT_VAI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Avst`
    */
  case AVESTAN extends Script_t(hb_script_t.HB_SCRIPT_AVESTAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Bamu`
    */
  case BAMUM extends Script_t(hb_script_t.HB_SCRIPT_BAMUM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Egyp`
    */
  case EGYPTIAN_HIEROGLYPHS
      extends Script_t(hb_script_t.HB_SCRIPT_EGYPTIAN_HIEROGLYPHS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Armi`
    */
  case IMPERIAL_ARAMAIC extends Script_t(hb_script_t.HB_SCRIPT_IMPERIAL_ARAMAIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Phli`
    */
  case INSCRIPTIONAL_PAHLAVI
      extends Script_t(hb_script_t.HB_SCRIPT_INSCRIPTIONAL_PAHLAVI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Prti`
    */
  case INSCRIPTIONAL_PARTHIAN
      extends Script_t(hb_script_t.HB_SCRIPT_INSCRIPTIONAL_PARTHIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Java`
    */
  case JAVANESE extends Script_t(hb_script_t.HB_SCRIPT_JAVANESE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Kthi`
    */
  case KAITHI extends Script_t(hb_script_t.HB_SCRIPT_KAITHI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Lisu`
    */
  case LISU extends Script_t(hb_script_t.HB_SCRIPT_LISU)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Mtei`
    */
  case MEETEI_MAYEK extends Script_t(hb_script_t.HB_SCRIPT_MEETEI_MAYEK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Sarb`
    */
  case OLD_SOUTH_ARABIAN
      extends Script_t(hb_script_t.HB_SCRIPT_OLD_SOUTH_ARABIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Orkh`
    */
  case OLD_TURKIC extends Script_t(hb_script_t.HB_SCRIPT_OLD_TURKIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Samr`
    */
  case SAMARITAN extends Script_t(hb_script_t.HB_SCRIPT_SAMARITAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Lana`
    */
  case TAI_THAM extends Script_t(hb_script_t.HB_SCRIPT_TAI_THAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Tavt`
    */
  case TAI_VIET extends Script_t(hb_script_t.HB_SCRIPT_TAI_VIET)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Batk`
    */
  case BATAK extends Script_t(hb_script_t.HB_SCRIPT_BATAK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Brah`
    */
  case BRAHMI extends Script_t(hb_script_t.HB_SCRIPT_BRAHMI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Mand`
    */
  case MANDAIC extends Script_t(hb_script_t.HB_SCRIPT_MANDAIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Cakm`
    */
  case CHAKMA extends Script_t(hb_script_t.HB_SCRIPT_CHAKMA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Merc`
    */
  case MEROITIC_CURSIVE extends Script_t(hb_script_t.HB_SCRIPT_MEROITIC_CURSIVE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Mero`
    */
  case MEROITIC_HIEROGLYPHS
      extends Script_t(hb_script_t.HB_SCRIPT_MEROITIC_HIEROGLYPHS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Plrd`
    */
  case MIAO extends Script_t(hb_script_t.HB_SCRIPT_MIAO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Shrd`
    */
  case SHARADA extends Script_t(hb_script_t.HB_SCRIPT_SHARADA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Sora`
    */
  case SORA_SOMPENG extends Script_t(hb_script_t.HB_SCRIPT_SORA_SOMPENG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Takr`
    */
  case TAKRI extends Script_t(hb_script_t.HB_SCRIPT_TAKRI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Bass`, Since: 0.9.30
    */
  case BASSA_VAH extends Script_t(hb_script_t.HB_SCRIPT_BASSA_VAH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Aghb`, Since: 0.9.30
    */
  case CAUCASIAN_ALBANIAN
      extends Script_t(hb_script_t.HB_SCRIPT_CAUCASIAN_ALBANIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Dupl`, Since: 0.9.30
    */
  case DUPLOYAN extends Script_t(hb_script_t.HB_SCRIPT_DUPLOYAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Elba`, Since: 0.9.30
    */
  case ELBASAN extends Script_t(hb_script_t.HB_SCRIPT_ELBASAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Gran`, Since: 0.9.30
    */
  case GRANTHA extends Script_t(hb_script_t.HB_SCRIPT_GRANTHA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Khoj`, Since: 0.9.30
    */
  case KHOJKI extends Script_t(hb_script_t.HB_SCRIPT_KHOJKI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Sind`, Since: 0.9.30
    */
  case KHUDAWADI extends Script_t(hb_script_t.HB_SCRIPT_KHUDAWADI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Lina`, Since: 0.9.30
    */
  case LINEAR_A extends Script_t(hb_script_t.HB_SCRIPT_LINEAR_A)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Mahj`, Since: 0.9.30
    */
  case MAHAJANI extends Script_t(hb_script_t.HB_SCRIPT_MAHAJANI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Mani`, Since: 0.9.30
    */
  case MANICHAEAN extends Script_t(hb_script_t.HB_SCRIPT_MANICHAEAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Mend`, Since: 0.9.30
    */
  case MENDE_KIKAKUI extends Script_t(hb_script_t.HB_SCRIPT_MENDE_KIKAKUI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Modi`, Since: 0.9.30
    */
  case MODI extends Script_t(hb_script_t.HB_SCRIPT_MODI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Mroo`, Since: 0.9.30
    */
  case MRO extends Script_t(hb_script_t.HB_SCRIPT_MRO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Nbat`, Since: 0.9.30
    */
  case NABATAEAN extends Script_t(hb_script_t.HB_SCRIPT_NABATAEAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Narb`, Since: 0.9.30
    */
  case OLD_NORTH_ARABIAN
      extends Script_t(hb_script_t.HB_SCRIPT_OLD_NORTH_ARABIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Perm`, Since: 0.9.30
    */
  case OLD_PERMIC extends Script_t(hb_script_t.HB_SCRIPT_OLD_PERMIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Hmng`, Since: 0.9.30
    */
  case PAHAWH_HMONG extends Script_t(hb_script_t.HB_SCRIPT_PAHAWH_HMONG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Palm`, Since: 0.9.30
    */
  case PALMYRENE extends Script_t(hb_script_t.HB_SCRIPT_PALMYRENE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Pauc`, Since: 0.9.30
    */
  case PAU_CIN_HAU extends Script_t(hb_script_t.HB_SCRIPT_PAU_CIN_HAU)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Phlp`, Since: 0.9.30
    */
  case PSALTER_PAHLAVI extends Script_t(hb_script_t.HB_SCRIPT_PSALTER_PAHLAVI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Sidd`, Since: 0.9.30
    */
  case SIDDHAM extends Script_t(hb_script_t.HB_SCRIPT_SIDDHAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Tirh`, Since: 0.9.30
    */
  case TIRHUTA extends Script_t(hb_script_t.HB_SCRIPT_TIRHUTA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Wara`, Since: 0.9.30
    */
  case WARANG_CITI extends Script_t(hb_script_t.HB_SCRIPT_WARANG_CITI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Ahom`, Since: 0.9.30
    */
  case AHOM extends Script_t(hb_script_t.HB_SCRIPT_AHOM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Hluw`, Since: 0.9.30
    */
  case ANATOLIAN_HIEROGLYPHS
      extends Script_t(hb_script_t.HB_SCRIPT_ANATOLIAN_HIEROGLYPHS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Hatr`, Since: 0.9.30
    */
  case HATRAN extends Script_t(hb_script_t.HB_SCRIPT_HATRAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Mult`, Since: 0.9.30
    */
  case MULTANI extends Script_t(hb_script_t.HB_SCRIPT_MULTANI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Hung`, Since: 0.9.30
    */
  case OLD_HUNGARIAN extends Script_t(hb_script_t.HB_SCRIPT_OLD_HUNGARIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Sgnw`, Since: 0.9.30
    */
  case SIGNWRITING extends Script_t(hb_script_t.HB_SCRIPT_SIGNWRITING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Adlm`, Since: 1.3.0
    */
  case ADLAM extends Script_t(hb_script_t.HB_SCRIPT_ADLAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Bhks`, Since: 1.3.0
    */
  case BHAIKSUKI extends Script_t(hb_script_t.HB_SCRIPT_BHAIKSUKI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Marc`, Since: 1.3.0
    */
  case MARCHEN extends Script_t(hb_script_t.HB_SCRIPT_MARCHEN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Osge`, Since: 1.3.0
    */
  case OSAGE extends Script_t(hb_script_t.HB_SCRIPT_OSAGE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Tang`, Since: 1.3.0
    */
  case TANGUT extends Script_t(hb_script_t.HB_SCRIPT_TANGUT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Newa`, Since: 1.3.0
    */
  case NEWA extends Script_t(hb_script_t.HB_SCRIPT_NEWA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Gonm`, Since: 1.6.0
    */
  case MASARAM_GONDI extends Script_t(hb_script_t.HB_SCRIPT_MASARAM_GONDI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Nshu`, Since: 1.6.0
    */
  case NUSHU extends Script_t(hb_script_t.HB_SCRIPT_NUSHU)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Soyo`, Since: 1.6.0
    */
  case SOYOMBO extends Script_t(hb_script_t.HB_SCRIPT_SOYOMBO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Zanb`, Since: 1.6.0
    */
  case ZANABAZAR_SQUARE extends Script_t(hb_script_t.HB_SCRIPT_ZANABAZAR_SQUARE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Dogr`, Since: 1.8.0
    */
  case DOGRA extends Script_t(hb_script_t.HB_SCRIPT_DOGRA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Gong`, Since: 1.8.0
    */
  case GUNJALA_GONDI extends Script_t(hb_script_t.HB_SCRIPT_GUNJALA_GONDI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Rohg`, Since: 1.8.0
    */
  case HANIFI_ROHINGYA extends Script_t(hb_script_t.HB_SCRIPT_HANIFI_ROHINGYA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Maka`, Since: 1.8.0
    */
  case MAKASAR extends Script_t(hb_script_t.HB_SCRIPT_MAKASAR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Medf`, Since: 1.8.0
    */
  case MEDEFAIDRIN extends Script_t(hb_script_t.HB_SCRIPT_MEDEFAIDRIN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Sogo`, Since: 1.8.0
    */
  case OLD_SOGDIAN extends Script_t(hb_script_t.HB_SCRIPT_OLD_SOGDIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Sogd`, Since: 1.8.0
    */
  case SOGDIAN extends Script_t(hb_script_t.HB_SCRIPT_SOGDIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Elym`, Since: 2.4.0
    */
  case ELYMAIC extends Script_t(hb_script_t.HB_SCRIPT_ELYMAIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Nand`, Since: 2.4.0
    */
  case NANDINAGARI extends Script_t(hb_script_t.HB_SCRIPT_NANDINAGARI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Hmnp`, Since: 2.4.0
    */
  case NYIAKENG_PUACHUE_HMONG
      extends Script_t(hb_script_t.HB_SCRIPT_NYIAKENG_PUACHUE_HMONG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Wcho`, Since: 2.4.0
    */
  case WANCHO extends Script_t(hb_script_t.HB_SCRIPT_WANCHO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Chrs`, Since: 2.6.7
    */
  case CHORASMIAN extends Script_t(hb_script_t.HB_SCRIPT_CHORASMIAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Diak`, Since: 2.6.7
    */
  case DIVES_AKURU extends Script_t(hb_script_t.HB_SCRIPT_DIVES_AKURU)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Kits`, Since: 2.6.7
    */
  case KHITAN_SMALL_SCRIPT
      extends Script_t(hb_script_t.HB_SCRIPT_KHITAN_SMALL_SCRIPT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Yezi`, Since: 2.6.7
    */
  case YEZIDI extends Script_t(hb_script_t.HB_SCRIPT_YEZIDI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Cpmn`, Since: 3.0.0
    */
  case CYPRO_MINOAN extends Script_t(hb_script_t.HB_SCRIPT_CYPRO_MINOAN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Ougr`, Since: 3.0.0
    */
  case OLD_UYGHUR extends Script_t(hb_script_t.HB_SCRIPT_OLD_UYGHUR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Tnsa`, Since: 3.0.0
    */
  case TANGSA extends Script_t(hb_script_t.HB_SCRIPT_TANGSA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Toto`, Since: 3.0.0
    */
  case TOTO extends Script_t(hb_script_t.HB_SCRIPT_TOTO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Vith`, Since: 3.0.0
    */
  case VITHKUQI extends Script_t(hb_script_t.HB_SCRIPT_VITHKUQI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Zmth`, Since: 3.4.0
    */
  case MATH extends Script_t(hb_script_t.HB_SCRIPT_MATH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Kawi`, Since: 5.2.0
    */
  case KAWI extends Script_t(hb_script_t.HB_SCRIPT_KAWI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * `Nagm`, Since: 5.2.0
    */
  case NAG_MUNDARI extends Script_t(hb_script_t.HB_SCRIPT_NAG_MUNDARI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No script set
    */
  case INVALID extends Script_t(hb_script_t.HB_SCRIPT_INVALID)
end Script_t

object Script_t:
  def fromRaw(raw: hb_script_t): Script_t =
    raw match
      case hb_script_t.HB_SCRIPT_COMMON             => Script_t.COMMON
      case hb_script_t.HB_SCRIPT_INHERITED          => Script_t.INHERITED
      case hb_script_t.HB_SCRIPT_UNKNOWN            => Script_t.UNKNOWN
      case hb_script_t.HB_SCRIPT_ARABIC             => Script_t.ARABIC
      case hb_script_t.HB_SCRIPT_ARMENIAN           => Script_t.ARMENIAN
      case hb_script_t.HB_SCRIPT_BENGALI            => Script_t.BENGALI
      case hb_script_t.HB_SCRIPT_CYRILLIC           => Script_t.CYRILLIC
      case hb_script_t.HB_SCRIPT_DEVANAGARI         => Script_t.DEVANAGARI
      case hb_script_t.HB_SCRIPT_GEORGIAN           => Script_t.GEORGIAN
      case hb_script_t.HB_SCRIPT_GREEK              => Script_t.GREEK
      case hb_script_t.HB_SCRIPT_GUJARATI           => Script_t.GUJARATI
      case hb_script_t.HB_SCRIPT_GURMUKHI           => Script_t.GURMUKHI
      case hb_script_t.HB_SCRIPT_HANGUL             => Script_t.HANGUL
      case hb_script_t.HB_SCRIPT_HAN                => Script_t.HAN
      case hb_script_t.HB_SCRIPT_HEBREW             => Script_t.HEBREW
      case hb_script_t.HB_SCRIPT_HIRAGANA           => Script_t.HIRAGANA
      case hb_script_t.HB_SCRIPT_KANNADA            => Script_t.KANNADA
      case hb_script_t.HB_SCRIPT_KATAKANA           => Script_t.KATAKANA
      case hb_script_t.HB_SCRIPT_LAO                => Script_t.LAO
      case hb_script_t.HB_SCRIPT_LATIN              => Script_t.LATIN
      case hb_script_t.HB_SCRIPT_MALAYALAM          => Script_t.MALAYALAM
      case hb_script_t.HB_SCRIPT_ORIYA              => Script_t.ORIYA
      case hb_script_t.HB_SCRIPT_TAMIL              => Script_t.TAMIL
      case hb_script_t.HB_SCRIPT_TELUGU             => Script_t.TELUGU
      case hb_script_t.HB_SCRIPT_THAI               => Script_t.THAI
      case hb_script_t.HB_SCRIPT_TIBETAN            => Script_t.TIBETAN
      case hb_script_t.HB_SCRIPT_BOPOMOFO           => Script_t.BOPOMOFO
      case hb_script_t.HB_SCRIPT_BRAILLE            => Script_t.BRAILLE
      case hb_script_t.HB_SCRIPT_CANADIAN_SYLLABICS =>
        Script_t.CANADIAN_SYLLABICS
      case hb_script_t.HB_SCRIPT_CHEROKEE             => Script_t.CHEROKEE
      case hb_script_t.HB_SCRIPT_ETHIOPIC             => Script_t.ETHIOPIC
      case hb_script_t.HB_SCRIPT_KHMER                => Script_t.KHMER
      case hb_script_t.HB_SCRIPT_MONGOLIAN            => Script_t.MONGOLIAN
      case hb_script_t.HB_SCRIPT_MYANMAR              => Script_t.MYANMAR
      case hb_script_t.HB_SCRIPT_OGHAM                => Script_t.OGHAM
      case hb_script_t.HB_SCRIPT_RUNIC                => Script_t.RUNIC
      case hb_script_t.HB_SCRIPT_SINHALA              => Script_t.SINHALA
      case hb_script_t.HB_SCRIPT_SYRIAC               => Script_t.SYRIAC
      case hb_script_t.HB_SCRIPT_THAANA               => Script_t.THAANA
      case hb_script_t.HB_SCRIPT_YI                   => Script_t.YI
      case hb_script_t.HB_SCRIPT_DESERET              => Script_t.DESERET
      case hb_script_t.HB_SCRIPT_GOTHIC               => Script_t.GOTHIC
      case hb_script_t.HB_SCRIPT_OLD_ITALIC           => Script_t.OLD_ITALIC
      case hb_script_t.HB_SCRIPT_BUHID                => Script_t.BUHID
      case hb_script_t.HB_SCRIPT_HANUNOO              => Script_t.HANUNOO
      case hb_script_t.HB_SCRIPT_TAGALOG              => Script_t.TAGALOG
      case hb_script_t.HB_SCRIPT_TAGBANWA             => Script_t.TAGBANWA
      case hb_script_t.HB_SCRIPT_CYPRIOT              => Script_t.CYPRIOT
      case hb_script_t.HB_SCRIPT_LIMBU                => Script_t.LIMBU
      case hb_script_t.HB_SCRIPT_LINEAR_B             => Script_t.LINEAR_B
      case hb_script_t.HB_SCRIPT_OSMANYA              => Script_t.OSMANYA
      case hb_script_t.HB_SCRIPT_SHAVIAN              => Script_t.SHAVIAN
      case hb_script_t.HB_SCRIPT_TAI_LE               => Script_t.TAI_LE
      case hb_script_t.HB_SCRIPT_UGARITIC             => Script_t.UGARITIC
      case hb_script_t.HB_SCRIPT_BUGINESE             => Script_t.BUGINESE
      case hb_script_t.HB_SCRIPT_COPTIC               => Script_t.COPTIC
      case hb_script_t.HB_SCRIPT_GLAGOLITIC           => Script_t.GLAGOLITIC
      case hb_script_t.HB_SCRIPT_KHAROSHTHI           => Script_t.KHAROSHTHI
      case hb_script_t.HB_SCRIPT_NEW_TAI_LUE          => Script_t.NEW_TAI_LUE
      case hb_script_t.HB_SCRIPT_OLD_PERSIAN          => Script_t.OLD_PERSIAN
      case hb_script_t.HB_SCRIPT_SYLOTI_NAGRI         => Script_t.SYLOTI_NAGRI
      case hb_script_t.HB_SCRIPT_TIFINAGH             => Script_t.TIFINAGH
      case hb_script_t.HB_SCRIPT_BALINESE             => Script_t.BALINESE
      case hb_script_t.HB_SCRIPT_CUNEIFORM            => Script_t.CUNEIFORM
      case hb_script_t.HB_SCRIPT_NKO                  => Script_t.NKO
      case hb_script_t.HB_SCRIPT_PHAGS_PA             => Script_t.PHAGS_PA
      case hb_script_t.HB_SCRIPT_PHOENICIAN           => Script_t.PHOENICIAN
      case hb_script_t.HB_SCRIPT_CARIAN               => Script_t.CARIAN
      case hb_script_t.HB_SCRIPT_CHAM                 => Script_t.CHAM
      case hb_script_t.HB_SCRIPT_KAYAH_LI             => Script_t.KAYAH_LI
      case hb_script_t.HB_SCRIPT_LEPCHA               => Script_t.LEPCHA
      case hb_script_t.HB_SCRIPT_LYCIAN               => Script_t.LYCIAN
      case hb_script_t.HB_SCRIPT_LYDIAN               => Script_t.LYDIAN
      case hb_script_t.HB_SCRIPT_OL_CHIKI             => Script_t.OL_CHIKI
      case hb_script_t.HB_SCRIPT_REJANG               => Script_t.REJANG
      case hb_script_t.HB_SCRIPT_SAURASHTRA           => Script_t.SAURASHTRA
      case hb_script_t.HB_SCRIPT_SUNDANESE            => Script_t.SUNDANESE
      case hb_script_t.HB_SCRIPT_VAI                  => Script_t.VAI
      case hb_script_t.HB_SCRIPT_AVESTAN              => Script_t.AVESTAN
      case hb_script_t.HB_SCRIPT_BAMUM                => Script_t.BAMUM
      case hb_script_t.HB_SCRIPT_EGYPTIAN_HIEROGLYPHS =>
        Script_t.EGYPTIAN_HIEROGLYPHS
      case hb_script_t.HB_SCRIPT_IMPERIAL_ARAMAIC => Script_t.IMPERIAL_ARAMAIC
      case hb_script_t.HB_SCRIPT_INSCRIPTIONAL_PAHLAVI =>
        Script_t.INSCRIPTIONAL_PAHLAVI
      case hb_script_t.HB_SCRIPT_INSCRIPTIONAL_PARTHIAN =>
        Script_t.INSCRIPTIONAL_PARTHIAN
      case hb_script_t.HB_SCRIPT_JAVANESE          => Script_t.JAVANESE
      case hb_script_t.HB_SCRIPT_KAITHI            => Script_t.KAITHI
      case hb_script_t.HB_SCRIPT_LISU              => Script_t.LISU
      case hb_script_t.HB_SCRIPT_MEETEI_MAYEK      => Script_t.MEETEI_MAYEK
      case hb_script_t.HB_SCRIPT_OLD_SOUTH_ARABIAN => Script_t.OLD_SOUTH_ARABIAN
      case hb_script_t.HB_SCRIPT_OLD_TURKIC        => Script_t.OLD_TURKIC
      case hb_script_t.HB_SCRIPT_SAMARITAN         => Script_t.SAMARITAN
      case hb_script_t.HB_SCRIPT_TAI_THAM          => Script_t.TAI_THAM
      case hb_script_t.HB_SCRIPT_TAI_VIET          => Script_t.TAI_VIET
      case hb_script_t.HB_SCRIPT_BATAK             => Script_t.BATAK
      case hb_script_t.HB_SCRIPT_BRAHMI            => Script_t.BRAHMI
      case hb_script_t.HB_SCRIPT_MANDAIC           => Script_t.MANDAIC
      case hb_script_t.HB_SCRIPT_CHAKMA            => Script_t.CHAKMA
      case hb_script_t.HB_SCRIPT_MEROITIC_CURSIVE  => Script_t.MEROITIC_CURSIVE
      case hb_script_t.HB_SCRIPT_MEROITIC_HIEROGLYPHS =>
        Script_t.MEROITIC_HIEROGLYPHS
      case hb_script_t.HB_SCRIPT_MIAO               => Script_t.MIAO
      case hb_script_t.HB_SCRIPT_SHARADA            => Script_t.SHARADA
      case hb_script_t.HB_SCRIPT_SORA_SOMPENG       => Script_t.SORA_SOMPENG
      case hb_script_t.HB_SCRIPT_TAKRI              => Script_t.TAKRI
      case hb_script_t.HB_SCRIPT_BASSA_VAH          => Script_t.BASSA_VAH
      case hb_script_t.HB_SCRIPT_CAUCASIAN_ALBANIAN =>
        Script_t.CAUCASIAN_ALBANIAN
      case hb_script_t.HB_SCRIPT_DUPLOYAN          => Script_t.DUPLOYAN
      case hb_script_t.HB_SCRIPT_ELBASAN           => Script_t.ELBASAN
      case hb_script_t.HB_SCRIPT_GRANTHA           => Script_t.GRANTHA
      case hb_script_t.HB_SCRIPT_KHOJKI            => Script_t.KHOJKI
      case hb_script_t.HB_SCRIPT_KHUDAWADI         => Script_t.KHUDAWADI
      case hb_script_t.HB_SCRIPT_LINEAR_A          => Script_t.LINEAR_A
      case hb_script_t.HB_SCRIPT_MAHAJANI          => Script_t.MAHAJANI
      case hb_script_t.HB_SCRIPT_MANICHAEAN        => Script_t.MANICHAEAN
      case hb_script_t.HB_SCRIPT_MENDE_KIKAKUI     => Script_t.MENDE_KIKAKUI
      case hb_script_t.HB_SCRIPT_MODI              => Script_t.MODI
      case hb_script_t.HB_SCRIPT_MRO               => Script_t.MRO
      case hb_script_t.HB_SCRIPT_NABATAEAN         => Script_t.NABATAEAN
      case hb_script_t.HB_SCRIPT_OLD_NORTH_ARABIAN => Script_t.OLD_NORTH_ARABIAN
      case hb_script_t.HB_SCRIPT_OLD_PERMIC        => Script_t.OLD_PERMIC
      case hb_script_t.HB_SCRIPT_PAHAWH_HMONG      => Script_t.PAHAWH_HMONG
      case hb_script_t.HB_SCRIPT_PALMYRENE         => Script_t.PALMYRENE
      case hb_script_t.HB_SCRIPT_PAU_CIN_HAU       => Script_t.PAU_CIN_HAU
      case hb_script_t.HB_SCRIPT_PSALTER_PAHLAVI   => Script_t.PSALTER_PAHLAVI
      case hb_script_t.HB_SCRIPT_SIDDHAM           => Script_t.SIDDHAM
      case hb_script_t.HB_SCRIPT_TIRHUTA           => Script_t.TIRHUTA
      case hb_script_t.HB_SCRIPT_WARANG_CITI       => Script_t.WARANG_CITI
      case hb_script_t.HB_SCRIPT_AHOM              => Script_t.AHOM
      case hb_script_t.HB_SCRIPT_ANATOLIAN_HIEROGLYPHS =>
        Script_t.ANATOLIAN_HIEROGLYPHS
      case hb_script_t.HB_SCRIPT_HATRAN           => Script_t.HATRAN
      case hb_script_t.HB_SCRIPT_MULTANI          => Script_t.MULTANI
      case hb_script_t.HB_SCRIPT_OLD_HUNGARIAN    => Script_t.OLD_HUNGARIAN
      case hb_script_t.HB_SCRIPT_SIGNWRITING      => Script_t.SIGNWRITING
      case hb_script_t.HB_SCRIPT_ADLAM            => Script_t.ADLAM
      case hb_script_t.HB_SCRIPT_BHAIKSUKI        => Script_t.BHAIKSUKI
      case hb_script_t.HB_SCRIPT_MARCHEN          => Script_t.MARCHEN
      case hb_script_t.HB_SCRIPT_OSAGE            => Script_t.OSAGE
      case hb_script_t.HB_SCRIPT_TANGUT           => Script_t.TANGUT
      case hb_script_t.HB_SCRIPT_NEWA             => Script_t.NEWA
      case hb_script_t.HB_SCRIPT_MASARAM_GONDI    => Script_t.MASARAM_GONDI
      case hb_script_t.HB_SCRIPT_NUSHU            => Script_t.NUSHU
      case hb_script_t.HB_SCRIPT_SOYOMBO          => Script_t.SOYOMBO
      case hb_script_t.HB_SCRIPT_ZANABAZAR_SQUARE => Script_t.ZANABAZAR_SQUARE
      case hb_script_t.HB_SCRIPT_DOGRA            => Script_t.DOGRA
      case hb_script_t.HB_SCRIPT_GUNJALA_GONDI    => Script_t.GUNJALA_GONDI
      case hb_script_t.HB_SCRIPT_HANIFI_ROHINGYA  => Script_t.HANIFI_ROHINGYA
      case hb_script_t.HB_SCRIPT_MAKASAR          => Script_t.MAKASAR
      case hb_script_t.HB_SCRIPT_MEDEFAIDRIN      => Script_t.MEDEFAIDRIN
      case hb_script_t.HB_SCRIPT_OLD_SOGDIAN      => Script_t.OLD_SOGDIAN
      case hb_script_t.HB_SCRIPT_SOGDIAN          => Script_t.SOGDIAN
      case hb_script_t.HB_SCRIPT_ELYMAIC          => Script_t.ELYMAIC
      case hb_script_t.HB_SCRIPT_NANDINAGARI      => Script_t.NANDINAGARI
      case hb_script_t.HB_SCRIPT_NYIAKENG_PUACHUE_HMONG =>
        Script_t.NYIAKENG_PUACHUE_HMONG
      case hb_script_t.HB_SCRIPT_WANCHO              => Script_t.WANCHO
      case hb_script_t.HB_SCRIPT_CHORASMIAN          => Script_t.CHORASMIAN
      case hb_script_t.HB_SCRIPT_DIVES_AKURU         => Script_t.DIVES_AKURU
      case hb_script_t.HB_SCRIPT_KHITAN_SMALL_SCRIPT =>
        Script_t.KHITAN_SMALL_SCRIPT
      case hb_script_t.HB_SCRIPT_YEZIDI       => Script_t.YEZIDI
      case hb_script_t.HB_SCRIPT_CYPRO_MINOAN => Script_t.CYPRO_MINOAN
      case hb_script_t.HB_SCRIPT_OLD_UYGHUR   => Script_t.OLD_UYGHUR
      case hb_script_t.HB_SCRIPT_TANGSA       => Script_t.TANGSA
      case hb_script_t.HB_SCRIPT_TOTO         => Script_t.TOTO
      case hb_script_t.HB_SCRIPT_VITHKUQI     => Script_t.VITHKUQI
      case hb_script_t.HB_SCRIPT_MATH         => Script_t.MATH
      case hb_script_t.HB_SCRIPT_KAWI         => Script_t.KAWI
      case hb_script_t.HB_SCRIPT_NAG_MUNDARI  => Script_t.NAG_MUNDARI
      case hb_script_t.HB_SCRIPT_INVALID      => Script_t.INVALID
  end fromRaw
end Script_t
