package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoWeight

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An enumeration specifying the weight (boldness) of a font.
  *
  * Weight is specified as a numeric value ranging from 100 to 1000. This
  * enumeration simply provides some common, predefined values.
  */
enum Weight(val raw: PangoWeight):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the thin weight (= 100) Since: 1.24
    */
  case THIN extends Weight(PangoWeight.PANGO_WEIGHT_THIN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the ultralight weight (= 200)
    */
  case ULTRALIGHT extends Weight(PangoWeight.PANGO_WEIGHT_ULTRALIGHT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the light weight (= 300)
    */
  case LIGHT extends Weight(PangoWeight.PANGO_WEIGHT_LIGHT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the semilight weight (= 350) Since: 1.36.7
    */
  case SEMILIGHT extends Weight(PangoWeight.PANGO_WEIGHT_SEMILIGHT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the book weight (= 380) Since: 1.24)
    */
  case BOOK extends Weight(PangoWeight.PANGO_WEIGHT_BOOK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the default weight (= 400)
    */
  case NORMAL extends Weight(PangoWeight.PANGO_WEIGHT_NORMAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the medium weight (= 500) Since: 1.24
    */
  case MEDIUM extends Weight(PangoWeight.PANGO_WEIGHT_MEDIUM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the semibold weight (= 600)
    */
  case SEMIBOLD extends Weight(PangoWeight.PANGO_WEIGHT_SEMIBOLD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the bold weight (= 700)
    */
  case BOLD extends Weight(PangoWeight.PANGO_WEIGHT_BOLD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the ultrabold weight (= 800)
    */
  case ULTRABOLD extends Weight(PangoWeight.PANGO_WEIGHT_ULTRABOLD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the heavy weight (= 900)
    */
  case HEAVY extends Weight(PangoWeight.PANGO_WEIGHT_HEAVY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the ultraheavy weight (= 1000) Since: 1.24
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
