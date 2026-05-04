package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoStretch

/** An enumeration specifying the width of the font relative to other designs
  * within a family.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Stretch(val raw: PangoStretch):
  /** ultra condensed width
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ULTRA_CONDENSED
      extends Stretch(PangoStretch.PANGO_STRETCH_ULTRA_CONDENSED)

  /** extra condensed width
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EXTRA_CONDENSED
      extends Stretch(PangoStretch.PANGO_STRETCH_EXTRA_CONDENSED)

  /** condensed width
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CONDENSED extends Stretch(PangoStretch.PANGO_STRETCH_CONDENSED)

  /** semi condensed width
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SEMI_CONDENSED extends Stretch(PangoStretch.PANGO_STRETCH_SEMI_CONDENSED)

  /** the normal width
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NORMAL extends Stretch(PangoStretch.PANGO_STRETCH_NORMAL)

  /** semi expanded width
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SEMI_EXPANDED extends Stretch(PangoStretch.PANGO_STRETCH_SEMI_EXPANDED)

  /** expanded width
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EXPANDED extends Stretch(PangoStretch.PANGO_STRETCH_EXPANDED)

  /** extra expanded width
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EXTRA_EXPANDED extends Stretch(PangoStretch.PANGO_STRETCH_EXTRA_EXPANDED)

  /** ultra expanded width
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ULTRA_EXPANDED extends Stretch(PangoStretch.PANGO_STRETCH_ULTRA_EXPANDED)
end Stretch

object Stretch:
  def fromRaw(raw: PangoStretch): Stretch =
    raw match
      case PangoStretch.PANGO_STRETCH_ULTRA_CONDENSED => Stretch.ULTRA_CONDENSED
      case PangoStretch.PANGO_STRETCH_EXTRA_CONDENSED => Stretch.EXTRA_CONDENSED
      case PangoStretch.PANGO_STRETCH_CONDENSED       => Stretch.CONDENSED
      case PangoStretch.PANGO_STRETCH_SEMI_CONDENSED  => Stretch.SEMI_CONDENSED
      case PangoStretch.PANGO_STRETCH_NORMAL          => Stretch.NORMAL
      case PangoStretch.PANGO_STRETCH_SEMI_EXPANDED   => Stretch.SEMI_EXPANDED
      case PangoStretch.PANGO_STRETCH_EXPANDED        => Stretch.EXPANDED
      case PangoStretch.PANGO_STRETCH_EXTRA_EXPANDED  => Stretch.EXTRA_EXPANDED
      case PangoStretch.PANGO_STRETCH_ULTRA_EXPANDED  => Stretch.ULTRA_EXPANDED
  end fromRaw
end Stretch
