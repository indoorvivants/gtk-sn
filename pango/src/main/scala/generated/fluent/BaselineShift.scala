package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoBaselineShift

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An enumeration that affects baseline shifts between runs.
  */
enum BaselineShift(val raw: PangoBaselineShift):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Leave the baseline unchanged
    */
  case NONE extends BaselineShift(PangoBaselineShift.PANGO_BASELINE_SHIFT_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Shift the baseline to the superscript position, relative to the previous
    * run
    */
  case SUPERSCRIPT
      extends BaselineShift(PangoBaselineShift.PANGO_BASELINE_SHIFT_SUPERSCRIPT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Shift the baseline to the subscript position, relative to the previous run
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
