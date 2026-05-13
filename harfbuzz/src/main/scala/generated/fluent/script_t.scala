package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.hb_script_t

/** Data type for scripts. Each #hb_script_t's value is an #hb_tag_t
  * corresponding to the four-letter values defined by [ISO
  * 15924](https://unicode.org/iso15924/).
  *
  * See also the Script (sc) property of the Unicode Character Database.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Script_t(val raw: hb_script_t):
  /** `Zyyy`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COMMON extends Script_t(hb_script_t.HB_SCRIPT_COMMON)

  /** `Zinh`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INHERITED extends Script_t(hb_script_t.HB_SCRIPT_INHERITED)

  /** `Zzzz`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN extends Script_t(hb_script_t.HB_SCRIPT_UNKNOWN)

  /** `Arab`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ARABIC extends Script_t(hb_script_t.HB_SCRIPT_ARABIC)

  /** `Armn`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ARMENIAN extends Script_t(hb_script_t.HB_SCRIPT_ARMENIAN)

  /** `Beng`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BENGALI extends Script_t(hb_script_t.HB_SCRIPT_BENGALI)

  /** `Cyrl`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CYRILLIC extends Script_t(hb_script_t.HB_SCRIPT_CYRILLIC)

  /** `Deva`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DEVANAGARI extends Script_t(hb_script_t.HB_SCRIPT_DEVANAGARI)

  /** `Geor`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GEORGIAN extends Script_t(hb_script_t.HB_SCRIPT_GEORGIAN)

  /** `Grek`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GREEK extends Script_t(hb_script_t.HB_SCRIPT_GREEK)

  /** `Gujr`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GUJARATI extends Script_t(hb_script_t.HB_SCRIPT_GUJARATI)

  /** `Guru`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GURMUKHI extends Script_t(hb_script_t.HB_SCRIPT_GURMUKHI)

  /** `Hang`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HANGUL extends Script_t(hb_script_t.HB_SCRIPT_HANGUL)

  /** `Hani`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HAN extends Script_t(hb_script_t.HB_SCRIPT_HAN)

  /** `Hebr`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HEBREW extends Script_t(hb_script_t.HB_SCRIPT_HEBREW)

  /** `Hira`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HIRAGANA extends Script_t(hb_script_t.HB_SCRIPT_HIRAGANA)

  /** `Knda`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case KANNADA extends Script_t(hb_script_t.HB_SCRIPT_KANNADA)

  /** `Kana`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case KATAKANA extends Script_t(hb_script_t.HB_SCRIPT_KATAKANA)

  /** `Laoo`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LAO extends Script_t(hb_script_t.HB_SCRIPT_LAO)

  /** `Latn`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LATIN extends Script_t(hb_script_t.HB_SCRIPT_LATIN)

  /** `Mlym`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MALAYALAM extends Script_t(hb_script_t.HB_SCRIPT_MALAYALAM)

  /** `Orya`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ORIYA extends Script_t(hb_script_t.HB_SCRIPT_ORIYA)

  /** `Taml`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TAMIL extends Script_t(hb_script_t.HB_SCRIPT_TAMIL)

  /** `Telu`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TELUGU extends Script_t(hb_script_t.HB_SCRIPT_TELUGU)

  /** `Thai`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case THAI extends Script_t(hb_script_t.HB_SCRIPT_THAI)

  /** `Tibt`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TIBETAN extends Script_t(hb_script_t.HB_SCRIPT_TIBETAN)

  /** `Bopo`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BOPOMOFO extends Script_t(hb_script_t.HB_SCRIPT_BOPOMOFO)

  /** `Brai`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BRAILLE extends Script_t(hb_script_t.HB_SCRIPT_BRAILLE)

  /** `Cans`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CANADIAN_SYLLABICS
      extends Script_t(hb_script_t.HB_SCRIPT_CANADIAN_SYLLABICS)

  /** `Cher`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CHEROKEE extends Script_t(hb_script_t.HB_SCRIPT_CHEROKEE)

  /** `Ethi`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ETHIOPIC extends Script_t(hb_script_t.HB_SCRIPT_ETHIOPIC)

  /** `Khmr`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case KHMER extends Script_t(hb_script_t.HB_SCRIPT_KHMER)

  /** `Mong`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MONGOLIAN extends Script_t(hb_script_t.HB_SCRIPT_MONGOLIAN)

  /** `Mymr`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MYANMAR extends Script_t(hb_script_t.HB_SCRIPT_MYANMAR)

  /** `Ogam`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OGHAM extends Script_t(hb_script_t.HB_SCRIPT_OGHAM)

  /** `Runr`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RUNIC extends Script_t(hb_script_t.HB_SCRIPT_RUNIC)

  /** `Sinh`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SINHALA extends Script_t(hb_script_t.HB_SCRIPT_SINHALA)

  /** `Syrc`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SYRIAC extends Script_t(hb_script_t.HB_SCRIPT_SYRIAC)

  /** `Thaa`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case THAANA extends Script_t(hb_script_t.HB_SCRIPT_THAANA)

  /** `Yiii`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case YI extends Script_t(hb_script_t.HB_SCRIPT_YI)

  /** `Dsrt`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DESERET extends Script_t(hb_script_t.HB_SCRIPT_DESERET)

  /** `Goth`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GOTHIC extends Script_t(hb_script_t.HB_SCRIPT_GOTHIC)

  /** `Ital`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OLD_ITALIC extends Script_t(hb_script_t.HB_SCRIPT_OLD_ITALIC)

  /** `Buhd`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BUHID extends Script_t(hb_script_t.HB_SCRIPT_BUHID)

  /** `Hano`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HANUNOO extends Script_t(hb_script_t.HB_SCRIPT_HANUNOO)

  /** `Tglg`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TAGALOG extends Script_t(hb_script_t.HB_SCRIPT_TAGALOG)

  /** `Tagb`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TAGBANWA extends Script_t(hb_script_t.HB_SCRIPT_TAGBANWA)

  /** `Cprt`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CYPRIOT extends Script_t(hb_script_t.HB_SCRIPT_CYPRIOT)

  /** `Limb`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LIMBU extends Script_t(hb_script_t.HB_SCRIPT_LIMBU)

  /** `Linb`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LINEAR_B extends Script_t(hb_script_t.HB_SCRIPT_LINEAR_B)

  /** `Osma`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OSMANYA extends Script_t(hb_script_t.HB_SCRIPT_OSMANYA)

  /** `Shaw`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SHAVIAN extends Script_t(hb_script_t.HB_SCRIPT_SHAVIAN)

  /** `Tale`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TAI_LE extends Script_t(hb_script_t.HB_SCRIPT_TAI_LE)

  /** `Ugar`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UGARITIC extends Script_t(hb_script_t.HB_SCRIPT_UGARITIC)

  /** `Bugi`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BUGINESE extends Script_t(hb_script_t.HB_SCRIPT_BUGINESE)

  /** `Copt`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COPTIC extends Script_t(hb_script_t.HB_SCRIPT_COPTIC)

  /** `Glag`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GLAGOLITIC extends Script_t(hb_script_t.HB_SCRIPT_GLAGOLITIC)

  /** `Khar`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case KHAROSHTHI extends Script_t(hb_script_t.HB_SCRIPT_KHAROSHTHI)

  /** `Talu`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NEW_TAI_LUE extends Script_t(hb_script_t.HB_SCRIPT_NEW_TAI_LUE)

  /** `Xpeo`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OLD_PERSIAN extends Script_t(hb_script_t.HB_SCRIPT_OLD_PERSIAN)

  /** `Sylo`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SYLOTI_NAGRI extends Script_t(hb_script_t.HB_SCRIPT_SYLOTI_NAGRI)

  /** `Tfng`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TIFINAGH extends Script_t(hb_script_t.HB_SCRIPT_TIFINAGH)

  /** `Bali`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BALINESE extends Script_t(hb_script_t.HB_SCRIPT_BALINESE)

  /** `Xsux`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CUNEIFORM extends Script_t(hb_script_t.HB_SCRIPT_CUNEIFORM)

  /** `Nkoo`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NKO extends Script_t(hb_script_t.HB_SCRIPT_NKO)

  /** `Phag`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PHAGS_PA extends Script_t(hb_script_t.HB_SCRIPT_PHAGS_PA)

  /** `Phnx`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PHOENICIAN extends Script_t(hb_script_t.HB_SCRIPT_PHOENICIAN)

  /** `Cari`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CARIAN extends Script_t(hb_script_t.HB_SCRIPT_CARIAN)

  /** `Cham`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CHAM extends Script_t(hb_script_t.HB_SCRIPT_CHAM)

  /** `Kali`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case KAYAH_LI extends Script_t(hb_script_t.HB_SCRIPT_KAYAH_LI)

  /** `Lepc`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LEPCHA extends Script_t(hb_script_t.HB_SCRIPT_LEPCHA)

  /** `Lyci`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LYCIAN extends Script_t(hb_script_t.HB_SCRIPT_LYCIAN)

  /** `Lydi`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LYDIAN extends Script_t(hb_script_t.HB_SCRIPT_LYDIAN)

  /** `Olck`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OL_CHIKI extends Script_t(hb_script_t.HB_SCRIPT_OL_CHIKI)

  /** `Rjng`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case REJANG extends Script_t(hb_script_t.HB_SCRIPT_REJANG)

  /** `Saur`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SAURASHTRA extends Script_t(hb_script_t.HB_SCRIPT_SAURASHTRA)

  /** `Sund`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SUNDANESE extends Script_t(hb_script_t.HB_SCRIPT_SUNDANESE)

  /** `Vaii`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VAI extends Script_t(hb_script_t.HB_SCRIPT_VAI)

  /** `Avst`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case AVESTAN extends Script_t(hb_script_t.HB_SCRIPT_AVESTAN)

  /** `Bamu`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BAMUM extends Script_t(hb_script_t.HB_SCRIPT_BAMUM)

  /** `Egyp`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EGYPTIAN_HIEROGLYPHS
      extends Script_t(hb_script_t.HB_SCRIPT_EGYPTIAN_HIEROGLYPHS)

  /** `Armi`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case IMPERIAL_ARAMAIC extends Script_t(hb_script_t.HB_SCRIPT_IMPERIAL_ARAMAIC)

  /** `Phli`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INSCRIPTIONAL_PAHLAVI
      extends Script_t(hb_script_t.HB_SCRIPT_INSCRIPTIONAL_PAHLAVI)

  /** `Prti`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INSCRIPTIONAL_PARTHIAN
      extends Script_t(hb_script_t.HB_SCRIPT_INSCRIPTIONAL_PARTHIAN)

  /** `Java`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case JAVANESE extends Script_t(hb_script_t.HB_SCRIPT_JAVANESE)

  /** `Kthi`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case KAITHI extends Script_t(hb_script_t.HB_SCRIPT_KAITHI)

  /** `Lisu`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LISU extends Script_t(hb_script_t.HB_SCRIPT_LISU)

  /** `Mtei`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MEETEI_MAYEK extends Script_t(hb_script_t.HB_SCRIPT_MEETEI_MAYEK)

  /** `Sarb`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OLD_SOUTH_ARABIAN
      extends Script_t(hb_script_t.HB_SCRIPT_OLD_SOUTH_ARABIAN)

  /** `Orkh`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OLD_TURKIC extends Script_t(hb_script_t.HB_SCRIPT_OLD_TURKIC)

  /** `Samr`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SAMARITAN extends Script_t(hb_script_t.HB_SCRIPT_SAMARITAN)

  /** `Lana`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TAI_THAM extends Script_t(hb_script_t.HB_SCRIPT_TAI_THAM)

  /** `Tavt`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TAI_VIET extends Script_t(hb_script_t.HB_SCRIPT_TAI_VIET)

  /** `Batk`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BATAK extends Script_t(hb_script_t.HB_SCRIPT_BATAK)

  /** `Brah`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BRAHMI extends Script_t(hb_script_t.HB_SCRIPT_BRAHMI)

  /** `Mand`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MANDAIC extends Script_t(hb_script_t.HB_SCRIPT_MANDAIC)

  /** `Cakm`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CHAKMA extends Script_t(hb_script_t.HB_SCRIPT_CHAKMA)

  /** `Merc`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MEROITIC_CURSIVE extends Script_t(hb_script_t.HB_SCRIPT_MEROITIC_CURSIVE)

  /** `Mero`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MEROITIC_HIEROGLYPHS
      extends Script_t(hb_script_t.HB_SCRIPT_MEROITIC_HIEROGLYPHS)

  /** `Plrd`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MIAO extends Script_t(hb_script_t.HB_SCRIPT_MIAO)

  /** `Shrd`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SHARADA extends Script_t(hb_script_t.HB_SCRIPT_SHARADA)

  /** `Sora`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SORA_SOMPENG extends Script_t(hb_script_t.HB_SCRIPT_SORA_SOMPENG)

  /** `Takr`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TAKRI extends Script_t(hb_script_t.HB_SCRIPT_TAKRI)

  /** `Bass`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BASSA_VAH extends Script_t(hb_script_t.HB_SCRIPT_BASSA_VAH)

  /** `Aghb`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CAUCASIAN_ALBANIAN
      extends Script_t(hb_script_t.HB_SCRIPT_CAUCASIAN_ALBANIAN)

  /** `Dupl`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DUPLOYAN extends Script_t(hb_script_t.HB_SCRIPT_DUPLOYAN)

  /** `Elba`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ELBASAN extends Script_t(hb_script_t.HB_SCRIPT_ELBASAN)

  /** `Gran`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GRANTHA extends Script_t(hb_script_t.HB_SCRIPT_GRANTHA)

  /** `Khoj`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case KHOJKI extends Script_t(hb_script_t.HB_SCRIPT_KHOJKI)

  /** `Sind`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case KHUDAWADI extends Script_t(hb_script_t.HB_SCRIPT_KHUDAWADI)

  /** `Lina`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LINEAR_A extends Script_t(hb_script_t.HB_SCRIPT_LINEAR_A)

  /** `Mahj`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MAHAJANI extends Script_t(hb_script_t.HB_SCRIPT_MAHAJANI)

  /** `Mani`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MANICHAEAN extends Script_t(hb_script_t.HB_SCRIPT_MANICHAEAN)

  /** `Mend`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MENDE_KIKAKUI extends Script_t(hb_script_t.HB_SCRIPT_MENDE_KIKAKUI)

  /** `Modi`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MODI extends Script_t(hb_script_t.HB_SCRIPT_MODI)

  /** `Mroo`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MRO extends Script_t(hb_script_t.HB_SCRIPT_MRO)

  /** `Nbat`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NABATAEAN extends Script_t(hb_script_t.HB_SCRIPT_NABATAEAN)

  /** `Narb`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OLD_NORTH_ARABIAN
      extends Script_t(hb_script_t.HB_SCRIPT_OLD_NORTH_ARABIAN)

  /** `Perm`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OLD_PERMIC extends Script_t(hb_script_t.HB_SCRIPT_OLD_PERMIC)

  /** `Hmng`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PAHAWH_HMONG extends Script_t(hb_script_t.HB_SCRIPT_PAHAWH_HMONG)

  /** `Palm`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PALMYRENE extends Script_t(hb_script_t.HB_SCRIPT_PALMYRENE)

  /** `Pauc`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PAU_CIN_HAU extends Script_t(hb_script_t.HB_SCRIPT_PAU_CIN_HAU)

  /** `Phlp`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PSALTER_PAHLAVI extends Script_t(hb_script_t.HB_SCRIPT_PSALTER_PAHLAVI)

  /** `Sidd`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SIDDHAM extends Script_t(hb_script_t.HB_SCRIPT_SIDDHAM)

  /** `Tirh`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TIRHUTA extends Script_t(hb_script_t.HB_SCRIPT_TIRHUTA)

  /** `Wara`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WARANG_CITI extends Script_t(hb_script_t.HB_SCRIPT_WARANG_CITI)

  /** `Ahom`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case AHOM extends Script_t(hb_script_t.HB_SCRIPT_AHOM)

  /** `Hluw`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ANATOLIAN_HIEROGLYPHS
      extends Script_t(hb_script_t.HB_SCRIPT_ANATOLIAN_HIEROGLYPHS)

  /** `Hatr`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HATRAN extends Script_t(hb_script_t.HB_SCRIPT_HATRAN)

  /** `Mult`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MULTANI extends Script_t(hb_script_t.HB_SCRIPT_MULTANI)

  /** `Hung`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OLD_HUNGARIAN extends Script_t(hb_script_t.HB_SCRIPT_OLD_HUNGARIAN)

  /** `Sgnw`, Since: 0.9.30
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SIGNWRITING extends Script_t(hb_script_t.HB_SCRIPT_SIGNWRITING)

  /** `Adlm`, Since: 1.3.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ADLAM extends Script_t(hb_script_t.HB_SCRIPT_ADLAM)

  /** `Bhks`, Since: 1.3.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BHAIKSUKI extends Script_t(hb_script_t.HB_SCRIPT_BHAIKSUKI)

  /** `Marc`, Since: 1.3.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MARCHEN extends Script_t(hb_script_t.HB_SCRIPT_MARCHEN)

  /** `Osge`, Since: 1.3.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OSAGE extends Script_t(hb_script_t.HB_SCRIPT_OSAGE)

  /** `Tang`, Since: 1.3.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TANGUT extends Script_t(hb_script_t.HB_SCRIPT_TANGUT)

  /** `Newa`, Since: 1.3.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NEWA extends Script_t(hb_script_t.HB_SCRIPT_NEWA)

  /** `Gonm`, Since: 1.6.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MASARAM_GONDI extends Script_t(hb_script_t.HB_SCRIPT_MASARAM_GONDI)

  /** `Nshu`, Since: 1.6.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NUSHU extends Script_t(hb_script_t.HB_SCRIPT_NUSHU)

  /** `Soyo`, Since: 1.6.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SOYOMBO extends Script_t(hb_script_t.HB_SCRIPT_SOYOMBO)

  /** `Zanb`, Since: 1.6.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ZANABAZAR_SQUARE extends Script_t(hb_script_t.HB_SCRIPT_ZANABAZAR_SQUARE)

  /** `Dogr`, Since: 1.8.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DOGRA extends Script_t(hb_script_t.HB_SCRIPT_DOGRA)

  /** `Gong`, Since: 1.8.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GUNJALA_GONDI extends Script_t(hb_script_t.HB_SCRIPT_GUNJALA_GONDI)

  /** `Rohg`, Since: 1.8.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HANIFI_ROHINGYA extends Script_t(hb_script_t.HB_SCRIPT_HANIFI_ROHINGYA)

  /** `Maka`, Since: 1.8.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MAKASAR extends Script_t(hb_script_t.HB_SCRIPT_MAKASAR)

  /** `Medf`, Since: 1.8.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MEDEFAIDRIN extends Script_t(hb_script_t.HB_SCRIPT_MEDEFAIDRIN)

  /** `Sogo`, Since: 1.8.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OLD_SOGDIAN extends Script_t(hb_script_t.HB_SCRIPT_OLD_SOGDIAN)

  /** `Sogd`, Since: 1.8.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SOGDIAN extends Script_t(hb_script_t.HB_SCRIPT_SOGDIAN)

  /** `Elym`, Since: 2.4.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ELYMAIC extends Script_t(hb_script_t.HB_SCRIPT_ELYMAIC)

  /** `Nand`, Since: 2.4.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NANDINAGARI extends Script_t(hb_script_t.HB_SCRIPT_NANDINAGARI)

  /** `Hmnp`, Since: 2.4.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NYIAKENG_PUACHUE_HMONG
      extends Script_t(hb_script_t.HB_SCRIPT_NYIAKENG_PUACHUE_HMONG)

  /** `Wcho`, Since: 2.4.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WANCHO extends Script_t(hb_script_t.HB_SCRIPT_WANCHO)

  /** `Chrs`, Since: 2.6.7
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CHORASMIAN extends Script_t(hb_script_t.HB_SCRIPT_CHORASMIAN)

  /** `Diak`, Since: 2.6.7
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DIVES_AKURU extends Script_t(hb_script_t.HB_SCRIPT_DIVES_AKURU)

  /** `Kits`, Since: 2.6.7
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case KHITAN_SMALL_SCRIPT
      extends Script_t(hb_script_t.HB_SCRIPT_KHITAN_SMALL_SCRIPT)

  /** `Yezi`, Since: 2.6.7
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case YEZIDI extends Script_t(hb_script_t.HB_SCRIPT_YEZIDI)

  /** `Cpmn`, Since: 3.0.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CYPRO_MINOAN extends Script_t(hb_script_t.HB_SCRIPT_CYPRO_MINOAN)

  /** `Ougr`, Since: 3.0.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OLD_UYGHUR extends Script_t(hb_script_t.HB_SCRIPT_OLD_UYGHUR)

  /** `Tnsa`, Since: 3.0.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TANGSA extends Script_t(hb_script_t.HB_SCRIPT_TANGSA)

  /** `Toto`, Since: 3.0.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOTO extends Script_t(hb_script_t.HB_SCRIPT_TOTO)

  /** `Vith`, Since: 3.0.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VITHKUQI extends Script_t(hb_script_t.HB_SCRIPT_VITHKUQI)

  /** `Zmth`, Since: 3.4.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MATH extends Script_t(hb_script_t.HB_SCRIPT_MATH)

  /** `Kawi`, Since: 5.2.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case KAWI extends Script_t(hb_script_t.HB_SCRIPT_KAWI)

  /** `Nagm`, Since: 5.2.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NAG_MUNDARI extends Script_t(hb_script_t.HB_SCRIPT_NAG_MUNDARI)

  /** No script set
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
