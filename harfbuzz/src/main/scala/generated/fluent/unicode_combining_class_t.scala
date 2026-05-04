package sn.gnome.harfbuzz.fluent

import _root_.sn.gnome.harfbuzz.internal.hb_unicode_combining_class_t

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Data type for the Canonical_Combining_Class (ccc) property from the Unicode
  * Character Database.
  *
  * <note>Note: newer versions of Unicode may add new values. Client programs
  * should be ready to handle any value in the 0..254 range being returned from
  * hb_unicode_combining_class().</note>
  */
enum Unicode_combining_class_t(val raw: hb_unicode_combining_class_t):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Spacing and enclosing marks; also many vowel and consonant signs, even if
    * nonspacing
    */
  case NOT_REORDERED
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_NOT_REORDERED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Marks which overlay a base letter or symbol
    */
  case OVERLAY
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_OVERLAY
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Diacritic nukta marks in Brahmi-derived scripts
    */
  case NUKTA
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_NUKTA
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hiragana/Katakana voicing marks
    */
  case KANA_VOICING
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_KANA_VOICING
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Viramas
    */
  case VIRAMA
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_VIRAMA
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC10
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC10
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC11
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC11
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC12
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC12
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC13
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC13
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC14
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC14
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC15
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC15
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC16
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC16
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC17
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC17
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC18
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC18
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC19
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC19
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC20
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC20
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC21
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC21
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC22
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC22
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC23
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC23
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC24
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC24
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC25
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC25
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC26
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC26
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Arabic]
    */
  case CCC27
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC27
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Arabic]
    */
  case CCC28
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC28
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Arabic]
    */
  case CCC29
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC29
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Arabic]
    */
  case CCC30
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC30
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Arabic]
    */
  case CCC31
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC31
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Arabic]
    */
  case CCC32
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC32
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Arabic]
    */
  case CCC33
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC33
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Arabic]
    */
  case CCC34
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC34
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Arabic]
    */
  case CCC35
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC35
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Syriac]
    */
  case CCC36
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC36
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Telugu]
    */
  case CCC84
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC84
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Telugu]
    */
  case CCC91
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC91
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Thai]
    */
  case CCC103
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC103
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Thai]
    */
  case CCC107
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC107
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Lao]
    */
  case CCC118
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC118
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Lao]
    */
  case CCC122
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC122
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Tibetan]
    */
  case CCC129
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC129
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Tibetan]
    */
  case CCC130
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC130
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Tibetan] Since: 7.2.0
    */
  case CCC132
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC132
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Marks attached at the bottom left
    */
  case ATTACHED_BELOW_LEFT
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW_LEFT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Marks attached directly below
    */
  case ATTACHED_BELOW
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Marks attached directly above
    */
  case ATTACHED_ABOVE
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Marks attached at the top right
    */
  case ATTACHED_ABOVE_RIGHT
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE_RIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Distinct marks at the bottom left
    */
  case BELOW_LEFT
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_BELOW_LEFT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Distinct marks directly below
    */
  case BELOW
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_BELOW
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Distinct marks at the bottom right
    */
  case BELOW_RIGHT
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_BELOW_RIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Distinct marks to the left
    */
  case LEFT
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_LEFT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Distinct marks to the right
    */
  case RIGHT
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_RIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Distinct marks at the top left
    */
  case ABOVE_LEFT
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ABOVE_LEFT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Distinct marks directly above
    */
  case ABOVE
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ABOVE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Distinct marks at the top right
    */
  case ABOVE_RIGHT
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ABOVE_RIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Distinct marks subtending two bases
    */
  case DOUBLE_BELOW
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_DOUBLE_BELOW
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Distinct marks extending above two bases
    */
  case DOUBLE_ABOVE
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_DOUBLE_ABOVE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Greek iota subscript only
    */
  case IOTA_SUBSCRIPT
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_IOTA_SUBSCRIPT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Invalid combining class
    */
  case INVALID
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_INVALID
      )
end Unicode_combining_class_t

object Unicode_combining_class_t:
  def fromRaw(raw: hb_unicode_combining_class_t): Unicode_combining_class_t =
    raw match
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_NOT_REORDERED =>
        Unicode_combining_class_t.NOT_REORDERED
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_OVERLAY =>
        Unicode_combining_class_t.OVERLAY
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_NUKTA =>
        Unicode_combining_class_t.NUKTA
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_KANA_VOICING =>
        Unicode_combining_class_t.KANA_VOICING
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_VIRAMA =>
        Unicode_combining_class_t.VIRAMA
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC10 =>
        Unicode_combining_class_t.CCC10
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC11 =>
        Unicode_combining_class_t.CCC11
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC12 =>
        Unicode_combining_class_t.CCC12
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC13 =>
        Unicode_combining_class_t.CCC13
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC14 =>
        Unicode_combining_class_t.CCC14
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC15 =>
        Unicode_combining_class_t.CCC15
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC16 =>
        Unicode_combining_class_t.CCC16
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC17 =>
        Unicode_combining_class_t.CCC17
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC18 =>
        Unicode_combining_class_t.CCC18
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC19 =>
        Unicode_combining_class_t.CCC19
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC20 =>
        Unicode_combining_class_t.CCC20
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC21 =>
        Unicode_combining_class_t.CCC21
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC22 =>
        Unicode_combining_class_t.CCC22
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC23 =>
        Unicode_combining_class_t.CCC23
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC24 =>
        Unicode_combining_class_t.CCC24
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC25 =>
        Unicode_combining_class_t.CCC25
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC26 =>
        Unicode_combining_class_t.CCC26
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC27 =>
        Unicode_combining_class_t.CCC27
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC28 =>
        Unicode_combining_class_t.CCC28
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC29 =>
        Unicode_combining_class_t.CCC29
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC30 =>
        Unicode_combining_class_t.CCC30
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC31 =>
        Unicode_combining_class_t.CCC31
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC32 =>
        Unicode_combining_class_t.CCC32
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC33 =>
        Unicode_combining_class_t.CCC33
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC34 =>
        Unicode_combining_class_t.CCC34
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC35 =>
        Unicode_combining_class_t.CCC35
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC36 =>
        Unicode_combining_class_t.CCC36
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC84 =>
        Unicode_combining_class_t.CCC84
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC91 =>
        Unicode_combining_class_t.CCC91
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC103 =>
        Unicode_combining_class_t.CCC103
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC107 =>
        Unicode_combining_class_t.CCC107
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC118 =>
        Unicode_combining_class_t.CCC118
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC122 =>
        Unicode_combining_class_t.CCC122
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC129 =>
        Unicode_combining_class_t.CCC129
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC130 =>
        Unicode_combining_class_t.CCC130
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC132 =>
        Unicode_combining_class_t.CCC132
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW_LEFT =>
        Unicode_combining_class_t.ATTACHED_BELOW_LEFT
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW =>
        Unicode_combining_class_t.ATTACHED_BELOW
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE =>
        Unicode_combining_class_t.ATTACHED_ABOVE
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE_RIGHT =>
        Unicode_combining_class_t.ATTACHED_ABOVE_RIGHT
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_BELOW_LEFT =>
        Unicode_combining_class_t.BELOW_LEFT
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_BELOW =>
        Unicode_combining_class_t.BELOW
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_BELOW_RIGHT =>
        Unicode_combining_class_t.BELOW_RIGHT
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_LEFT =>
        Unicode_combining_class_t.LEFT
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_RIGHT =>
        Unicode_combining_class_t.RIGHT
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ABOVE_LEFT =>
        Unicode_combining_class_t.ABOVE_LEFT
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ABOVE =>
        Unicode_combining_class_t.ABOVE
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ABOVE_RIGHT =>
        Unicode_combining_class_t.ABOVE_RIGHT
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_DOUBLE_BELOW =>
        Unicode_combining_class_t.DOUBLE_BELOW
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_DOUBLE_ABOVE =>
        Unicode_combining_class_t.DOUBLE_ABOVE
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_IOTA_SUBSCRIPT =>
        Unicode_combining_class_t.IOTA_SUBSCRIPT
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_INVALID =>
        Unicode_combining_class_t.INVALID
  end fromRaw
end Unicode_combining_class_t
