package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoCoverageLevel

/** `PangoCoverageLevel` is used to indicate how well a font can represent a
  * particular Unicode character for a particular script.
  *
  * Since 1.44, only %PANGO_COVERAGE_NONE and %PANGO_COVERAGE_EXACT will be
  * returned.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum CoverageLevel(val raw: PangoCoverageLevel):
  /** The character is not representable with the font.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends CoverageLevel(PangoCoverageLevel.PANGO_COVERAGE_NONE)

  /** The character is represented in a way that may be comprehensible but is
    * not the correct graphical form. For instance, a Hangul character
    * represented as a a sequence of Jamos, or a Latin transliteration of a
    * Cyrillic word.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FALLBACK
      extends CoverageLevel(PangoCoverageLevel.PANGO_COVERAGE_FALLBACK)

  /** The character is represented as basically the correct graphical form, but
    * with a stylistic variant inappropriate for the current script.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case APPROXIMATE
      extends CoverageLevel(PangoCoverageLevel.PANGO_COVERAGE_APPROXIMATE)

  /** The character is represented as the correct graphical form.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EXACT extends CoverageLevel(PangoCoverageLevel.PANGO_COVERAGE_EXACT)
end CoverageLevel

object CoverageLevel:
  def fromRaw(raw: PangoCoverageLevel): CoverageLevel =
    raw match
      case PangoCoverageLevel.PANGO_COVERAGE_NONE     => CoverageLevel.NONE
      case PangoCoverageLevel.PANGO_COVERAGE_FALLBACK => CoverageLevel.FALLBACK
      case PangoCoverageLevel.PANGO_COVERAGE_APPROXIMATE =>
        CoverageLevel.APPROXIMATE
      case PangoCoverageLevel.PANGO_COVERAGE_EXACT => CoverageLevel.EXACT
  end fromRaw
end CoverageLevel
