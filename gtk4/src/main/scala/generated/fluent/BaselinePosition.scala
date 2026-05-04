package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkBaselinePosition

/** Baseline position in a row of widgets.
  *
  * Whenever a container has some form of natural row it may align children in
  * that row along a common typographical baseline. If the amount of vertical
  * space in the row is taller than the total requested height of the
  * baseline-aligned children then it can use a `GtkBaselinePosition` to select
  * where to put the baseline inside the extra available space.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum BaselinePosition(val raw: GtkBaselinePosition):
  /** Align the baseline at the top
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOP
      extends BaselinePosition(GtkBaselinePosition.GTK_BASELINE_POSITION_TOP)

  /** Center the baseline
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CENTER
      extends BaselinePosition(GtkBaselinePosition.GTK_BASELINE_POSITION_CENTER)

  /** Align the baseline at the bottom
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
