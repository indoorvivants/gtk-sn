package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoStretch

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An enumeration specifying the width of the font relative to other designs
  * within a family.
  */
enum Stretch(val raw: PangoStretch):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * ultra condensed width
    */
  case ULTRA_CONDENSED
      extends Stretch(PangoStretch.PANGO_STRETCH_ULTRA_CONDENSED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * extra condensed width
    */
  case EXTRA_CONDENSED
      extends Stretch(PangoStretch.PANGO_STRETCH_EXTRA_CONDENSED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * condensed width
    */
  case CONDENSED extends Stretch(PangoStretch.PANGO_STRETCH_CONDENSED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * semi condensed width
    */
  case SEMI_CONDENSED extends Stretch(PangoStretch.PANGO_STRETCH_SEMI_CONDENSED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the normal width
    */
  case NORMAL extends Stretch(PangoStretch.PANGO_STRETCH_NORMAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * semi expanded width
    */
  case SEMI_EXPANDED extends Stretch(PangoStretch.PANGO_STRETCH_SEMI_EXPANDED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * expanded width
    */
  case EXPANDED extends Stretch(PangoStretch.PANGO_STRETCH_EXPANDED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * extra expanded width
    */
  case EXTRA_EXPANDED extends Stretch(PangoStretch.PANGO_STRETCH_EXTRA_EXPANDED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * ultra expanded width
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
