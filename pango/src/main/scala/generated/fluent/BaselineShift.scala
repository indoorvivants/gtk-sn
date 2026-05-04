package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoBaselineShift

/** An enumeration that affects baseline shifts between runs.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum BaselineShift(val raw: PangoBaselineShift):
  /** Leave the baseline unchanged
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends BaselineShift(PangoBaselineShift.PANGO_BASELINE_SHIFT_NONE)

  /** Shift the baseline to the superscript position, relative to the previous
    * run
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SUPERSCRIPT
      extends BaselineShift(PangoBaselineShift.PANGO_BASELINE_SHIFT_SUPERSCRIPT)

  /** Shift the baseline to the subscript position, relative to the previous run
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SUBSCRIPT
      extends BaselineShift(PangoBaselineShift.PANGO_BASELINE_SHIFT_SUBSCRIPT)
end BaselineShift

object BaselineShift:
  def fromRaw(raw: PangoBaselineShift): BaselineShift =
    raw match
      case PangoBaselineShift.PANGO_BASELINE_SHIFT_NONE => BaselineShift.NONE
      case PangoBaselineShift.PANGO_BASELINE_SHIFT_SUPERSCRIPT =>
        BaselineShift.SUPERSCRIPT
      case PangoBaselineShift.PANGO_BASELINE_SHIFT_SUBSCRIPT =>
        BaselineShift.SUBSCRIPT
  end fromRaw
end BaselineShift
