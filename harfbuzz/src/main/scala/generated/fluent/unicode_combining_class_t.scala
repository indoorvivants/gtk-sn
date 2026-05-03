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
enum unicode_combining_class_t(val raw: hb_unicode_combining_class_t):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Spacing and enclosing marks; also many vowel and consonant signs, even if
    * nonspacing
    */
  case NOT_REORDERED
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_NOT_REORDERED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Marks which overlay a base letter or symbol
    */
  case OVERLAY
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_OVERLAY
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Diacritic nukta marks in Brahmi-derived scripts
    */
  case NUKTA
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_NUKTA
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Hiragana/Katakana voicing marks
    */
  case KANA_VOICING
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_KANA_VOICING
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Viramas
    */
  case VIRAMA
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_VIRAMA
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC10
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC10
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC11
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC11
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC12
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC12
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC13
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC13
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC14
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC14
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC15
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC15
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC16
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC16
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC17
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC17
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC18
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC18
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC19
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC19
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC20
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC20
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC21
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC21
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC22
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC22
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC23
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC23
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC24
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC24
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC25
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC25
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Hebrew]
    */
  case CCC26
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC26
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Arabic]
    */
  case CCC27
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC27
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Arabic]
    */
  case CCC28
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC28
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Arabic]
    */
  case CCC29
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC29
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Arabic]
    */
  case CCC30
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC30
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Arabic]
    */
  case CCC31
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC31
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Arabic]
    */
  case CCC32
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC32
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Arabic]
    */
  case CCC33
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC33
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Arabic]
    */
  case CCC34
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC34
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Arabic]
    */
  case CCC35
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC35
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Syriac]
    */
  case CCC36
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC36
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Telugu]
    */
  case CCC84
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC84
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Telugu]
    */
  case CCC91
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC91
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Thai]
    */
  case CCC103
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC103
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Thai]
    */
  case CCC107
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC107
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Lao]
    */
  case CCC118
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC118
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Lao]
    */
  case CCC122
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC122
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Tibetan]
    */
  case CCC129
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC129
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Tibetan]
    */
  case CCC130
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC130
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [Tibetan] Since: 7.2.0
    */
  case CCC132
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC132
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Marks attached at the bottom left
    */
  case ATTACHED_BELOW_LEFT
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW_LEFT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Marks attached directly below
    */
  case ATTACHED_BELOW
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Marks attached directly above
    */
  case ATTACHED_ABOVE
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Marks attached at the top right
    */
  case ATTACHED_ABOVE_RIGHT
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE_RIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Distinct marks at the bottom left
    */
  case BELOW_LEFT
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_BELOW_LEFT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Distinct marks directly below
    */
  case BELOW
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_BELOW
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Distinct marks at the bottom right
    */
  case BELOW_RIGHT
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_BELOW_RIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Distinct marks to the left
    */
  case LEFT
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_LEFT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Distinct marks to the right
    */
  case RIGHT
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_RIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Distinct marks at the top left
    */
  case ABOVE_LEFT
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ABOVE_LEFT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Distinct marks directly above
    */
  case ABOVE
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ABOVE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Distinct marks at the top right
    */
  case ABOVE_RIGHT
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ABOVE_RIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Distinct marks subtending two bases
    */
  case DOUBLE_BELOW
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_DOUBLE_BELOW
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Distinct marks extending above two bases
    */
  case DOUBLE_ABOVE
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_DOUBLE_ABOVE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Greek iota subscript only
    */
  case IOTA_SUBSCRIPT
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_IOTA_SUBSCRIPT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Invalid combining class
    */
  case INVALID
      extends unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_INVALID
      )
end unicode_combining_class_t

object unicode_combining_class_t:
  def fromRaw(raw: hb_unicode_combining_class_t): unicode_combining_class_t =
    raw match
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_NOT_REORDERED =>
        unicode_combining_class_t.NOT_REORDERED
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_OVERLAY =>
        unicode_combining_class_t.OVERLAY
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_NUKTA =>
        unicode_combining_class_t.NUKTA
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_KANA_VOICING =>
        unicode_combining_class_t.KANA_VOICING
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_VIRAMA =>
        unicode_combining_class_t.VIRAMA
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC10 =>
        unicode_combining_class_t.CCC10
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC11 =>
        unicode_combining_class_t.CCC11
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC12 =>
        unicode_combining_class_t.CCC12
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC13 =>
        unicode_combining_class_t.CCC13
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC14 =>
        unicode_combining_class_t.CCC14
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC15 =>
        unicode_combining_class_t.CCC15
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC16 =>
        unicode_combining_class_t.CCC16
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC17 =>
        unicode_combining_class_t.CCC17
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC18 =>
        unicode_combining_class_t.CCC18
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC19 =>
        unicode_combining_class_t.CCC19
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC20 =>
        unicode_combining_class_t.CCC20
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC21 =>
        unicode_combining_class_t.CCC21
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC22 =>
        unicode_combining_class_t.CCC22
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC23 =>
        unicode_combining_class_t.CCC23
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC24 =>
        unicode_combining_class_t.CCC24
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC25 =>
        unicode_combining_class_t.CCC25
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC26 =>
        unicode_combining_class_t.CCC26
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC27 =>
        unicode_combining_class_t.CCC27
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC28 =>
        unicode_combining_class_t.CCC28
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC29 =>
        unicode_combining_class_t.CCC29
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC30 =>
        unicode_combining_class_t.CCC30
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC31 =>
        unicode_combining_class_t.CCC31
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC32 =>
        unicode_combining_class_t.CCC32
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC33 =>
        unicode_combining_class_t.CCC33
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC34 =>
        unicode_combining_class_t.CCC34
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC35 =>
        unicode_combining_class_t.CCC35
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC36 =>
        unicode_combining_class_t.CCC36
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC84 =>
        unicode_combining_class_t.CCC84
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC91 =>
        unicode_combining_class_t.CCC91
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC103 =>
        unicode_combining_class_t.CCC103
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC107 =>
        unicode_combining_class_t.CCC107
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC118 =>
        unicode_combining_class_t.CCC118
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC122 =>
        unicode_combining_class_t.CCC122
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC129 =>
        unicode_combining_class_t.CCC129
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC130 =>
        unicode_combining_class_t.CCC130
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC132 =>
        unicode_combining_class_t.CCC132
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW_LEFT =>
        unicode_combining_class_t.ATTACHED_BELOW_LEFT
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW =>
        unicode_combining_class_t.ATTACHED_BELOW
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE =>
        unicode_combining_class_t.ATTACHED_ABOVE
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE_RIGHT =>
        unicode_combining_class_t.ATTACHED_ABOVE_RIGHT
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_BELOW_LEFT =>
        unicode_combining_class_t.BELOW_LEFT
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_BELOW =>
        unicode_combining_class_t.BELOW
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_BELOW_RIGHT =>
        unicode_combining_class_t.BELOW_RIGHT
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_LEFT =>
        unicode_combining_class_t.LEFT
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_RIGHT =>
        unicode_combining_class_t.RIGHT
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ABOVE_LEFT =>
        unicode_combining_class_t.ABOVE_LEFT
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ABOVE =>
        unicode_combining_class_t.ABOVE
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ABOVE_RIGHT =>
        unicode_combining_class_t.ABOVE_RIGHT
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_DOUBLE_BELOW =>
        unicode_combining_class_t.DOUBLE_BELOW
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_DOUBLE_ABOVE =>
        unicode_combining_class_t.DOUBLE_ABOVE
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_IOTA_SUBSCRIPT =>
        unicode_combining_class_t.IOTA_SUBSCRIPT
      case hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_INVALID =>
        unicode_combining_class_t.INVALID
  end fromRaw
end unicode_combining_class_t
