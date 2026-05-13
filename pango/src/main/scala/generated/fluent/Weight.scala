package sn.gnome.pango

import _root_.sn.gnome.pango.internal.PangoWeight

/** An enumeration specifying the weight (boldness) of a font.
  *
  * Weight is specified as a numeric value ranging from 100 to 1000. This
  * enumeration simply provides some common, predefined values.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Weight(val raw: PangoWeight):
  /** the thin weight (= 100) Since: 1.24
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case THIN extends Weight(PangoWeight.PANGO_WEIGHT_THIN)

  /** the ultralight weight (= 200)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ULTRALIGHT extends Weight(PangoWeight.PANGO_WEIGHT_ULTRALIGHT)

  /** the light weight (= 300)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LIGHT extends Weight(PangoWeight.PANGO_WEIGHT_LIGHT)

  /** the semilight weight (= 350) Since: 1.36.7
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SEMILIGHT extends Weight(PangoWeight.PANGO_WEIGHT_SEMILIGHT)

  /** the book weight (= 380) Since: 1.24)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BOOK extends Weight(PangoWeight.PANGO_WEIGHT_BOOK)

  /** the default weight (= 400)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NORMAL extends Weight(PangoWeight.PANGO_WEIGHT_NORMAL)

  /** the medium weight (= 500) Since: 1.24
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MEDIUM extends Weight(PangoWeight.PANGO_WEIGHT_MEDIUM)

  /** the semibold weight (= 600)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SEMIBOLD extends Weight(PangoWeight.PANGO_WEIGHT_SEMIBOLD)

  /** the bold weight (= 700)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BOLD extends Weight(PangoWeight.PANGO_WEIGHT_BOLD)

  /** the ultrabold weight (= 800)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ULTRABOLD extends Weight(PangoWeight.PANGO_WEIGHT_ULTRABOLD)

  /** the heavy weight (= 900)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HEAVY extends Weight(PangoWeight.PANGO_WEIGHT_HEAVY)

  /** the ultraheavy weight (= 1000) Since: 1.24
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ULTRAHEAVY extends Weight(PangoWeight.PANGO_WEIGHT_ULTRAHEAVY)
end Weight

object Weight:
  def fromRaw(raw: PangoWeight): Weight =
    raw match
      case PangoWeight.PANGO_WEIGHT_THIN       => Weight.THIN
      case PangoWeight.PANGO_WEIGHT_ULTRALIGHT => Weight.ULTRALIGHT
      case PangoWeight.PANGO_WEIGHT_LIGHT      => Weight.LIGHT
      case PangoWeight.PANGO_WEIGHT_SEMILIGHT  => Weight.SEMILIGHT
      case PangoWeight.PANGO_WEIGHT_BOOK       => Weight.BOOK
      case PangoWeight.PANGO_WEIGHT_NORMAL     => Weight.NORMAL
      case PangoWeight.PANGO_WEIGHT_MEDIUM     => Weight.MEDIUM
      case PangoWeight.PANGO_WEIGHT_SEMIBOLD   => Weight.SEMIBOLD
      case PangoWeight.PANGO_WEIGHT_BOLD       => Weight.BOLD
      case PangoWeight.PANGO_WEIGHT_ULTRABOLD  => Weight.ULTRABOLD
      case PangoWeight.PANGO_WEIGHT_HEAVY      => Weight.HEAVY
      case PangoWeight.PANGO_WEIGHT_ULTRAHEAVY => Weight.ULTRAHEAVY
  end fromRaw
end Weight
