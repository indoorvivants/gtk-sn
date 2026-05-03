package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkBaselinePosition

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Baseline position in a row of widgets.
  *
  * Whenever a container has some form of natural row it may align children in
  * that row along a common typographical baseline. If the amount of vertical
  * space in the row is taller than the total requested height of the
  * baseline-aligned children then it can use a `GtkBaselinePosition` to select
  * where to put the baseline inside the extra available space.
  */
enum BaselinePosition(val raw: GtkBaselinePosition):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Align the baseline at the top
    */
  case TOP
      extends BaselinePosition(GtkBaselinePosition.GTK_BASELINE_POSITION_TOP)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Center the baseline
    */
  case CENTER
      extends BaselinePosition(GtkBaselinePosition.GTK_BASELINE_POSITION_CENTER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Align the baseline at the bottom
    */
  case BOTTOM
      extends BaselinePosition(GtkBaselinePosition.GTK_BASELINE_POSITION_BOTTOM)
end BaselinePosition

object BaselinePosition:
  def fromRaw(raw: GtkBaselinePosition): BaselinePosition =
    raw match
      case GtkBaselinePosition.GTK_BASELINE_POSITION_TOP => BaselinePosition.TOP
      case GtkBaselinePosition.GTK_BASELINE_POSITION_CENTER =>
        BaselinePosition.CENTER
      case GtkBaselinePosition.GTK_BASELINE_POSITION_BOTTOM =>
        BaselinePosition.BOTTOM
  end fromRaw
end BaselinePosition
