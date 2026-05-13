package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.hb_unicode_combining_class_t

/** Data type for the Canonical_Combining_Class (ccc) property from the Unicode
  * Character Database.
  *
  * <note>Note: newer versions of Unicode may add new values. Client programs
  * should be ready to handle any value in the 0..254 range being returned from
  * hb_unicode_combining_class().</note>
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Unicode_combining_class_t(val raw: hb_unicode_combining_class_t):
  /** Spacing and enclosing marks; also many vowel and consonant signs, even if
    * nonspacing
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_REORDERED
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_NOT_REORDERED
      )

  /** Marks which overlay a base letter or symbol
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OVERLAY
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_OVERLAY
      )

  /** Diacritic nukta marks in Brahmi-derived scripts
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NUKTA
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_NUKTA
      )

  /** Hiragana/Katakana voicing marks
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case KANA_VOICING
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_KANA_VOICING
      )

  /** Viramas
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VIRAMA
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_VIRAMA
      )

  /** [Hebrew]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC10
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC10
      )

  /** [Hebrew]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC11
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC11
      )

  /** [Hebrew]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC12
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC12
      )

  /** [Hebrew]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC13
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC13
      )

  /** [Hebrew]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC14
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC14
      )

  /** [Hebrew]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC15
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC15
      )

  /** [Hebrew]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC16
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC16
      )

  /** [Hebrew]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC17
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC17
      )

  /** [Hebrew]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC18
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC18
      )

  /** [Hebrew]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC19
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC19
      )

  /** [Hebrew]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC20
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC20
      )

  /** [Hebrew]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC21
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC21
      )

  /** [Hebrew]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC22
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC22
      )

  /** [Hebrew]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC23
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC23
      )

  /** [Hebrew]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC24
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC24
      )

  /** [Hebrew]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC25
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC25
      )

  /** [Hebrew]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC26
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC26
      )

  /** [Arabic]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC27
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC27
      )

  /** [Arabic]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC28
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC28
      )

  /** [Arabic]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC29
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC29
      )

  /** [Arabic]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC30
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC30
      )

  /** [Arabic]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC31
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC31
      )

  /** [Arabic]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC32
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC32
      )

  /** [Arabic]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC33
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC33
      )

  /** [Arabic]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC34
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC34
      )

  /** [Arabic]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC35
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC35
      )

  /** [Syriac]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC36
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC36
      )

  /** [Telugu]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC84
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC84
      )

  /** [Telugu]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC91
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC91
      )

  /** [Thai]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC103
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC103
      )

  /** [Thai]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC107
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC107
      )

  /** [Lao]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC118
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC118
      )

  /** [Lao]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC122
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC122
      )

  /** [Tibetan]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC129
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC129
      )

  /** [Tibetan]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC130
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC130
      )

  /** [Tibetan] Since: 7.2.0
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CCC132
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_CCC132
      )

  /** Marks attached at the bottom left
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ATTACHED_BELOW_LEFT
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW_LEFT
      )

  /** Marks attached directly below
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ATTACHED_BELOW
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW
      )

  /** Marks attached directly above
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ATTACHED_ABOVE
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE
      )

  /** Marks attached at the top right
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ATTACHED_ABOVE_RIGHT
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE_RIGHT
      )

  /** Distinct marks at the bottom left
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BELOW_LEFT
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_BELOW_LEFT
      )

  /** Distinct marks directly below
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BELOW
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_BELOW
      )

  /** Distinct marks at the bottom right
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BELOW_RIGHT
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_BELOW_RIGHT
      )

  /** Distinct marks to the left
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LEFT
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_LEFT
      )

  /** Distinct marks to the right
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RIGHT
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_RIGHT
      )

  /** Distinct marks at the top left
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ABOVE_LEFT
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ABOVE_LEFT
      )

  /** Distinct marks directly above
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ABOVE
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ABOVE
      )

  /** Distinct marks at the top right
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ABOVE_RIGHT
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_ABOVE_RIGHT
      )

  /** Distinct marks subtending two bases
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DOUBLE_BELOW
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_DOUBLE_BELOW
      )

  /** Distinct marks extending above two bases
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DOUBLE_ABOVE
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_DOUBLE_ABOVE
      )

  /** Greek iota subscript only
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case IOTA_SUBSCRIPT
      extends Unicode_combining_class_t(
        hb_unicode_combining_class_t.HB_UNICODE_COMBINING_CLASS_IOTA_SUBSCRIPT
      )

  /** Invalid combining class
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
