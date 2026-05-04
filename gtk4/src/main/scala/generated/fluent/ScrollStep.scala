package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkScrollStep

/** Passed as argument to various keybinding signals.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ScrollStep(val raw: GtkScrollStep):
  /** Scroll in steps.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STEPS extends ScrollStep(GtkScrollStep.GTK_SCROLL_STEPS)

  /** Scroll by pages.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PAGES extends ScrollStep(GtkScrollStep.GTK_SCROLL_PAGES)

  /** Scroll to ends.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ENDS extends ScrollStep(GtkScrollStep.GTK_SCROLL_ENDS)

  /** Scroll in horizontal steps.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HORIZONTAL_STEPS
      extends ScrollStep(GtkScrollStep.GTK_SCROLL_HORIZONTAL_STEPS)

  /** Scroll by horizontal pages.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HORIZONTAL_PAGES
      extends ScrollStep(GtkScrollStep.GTK_SCROLL_HORIZONTAL_PAGES)

  /** Scroll to the horizontal ends.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HORIZONTAL_ENDS
      extends ScrollStep(GtkScrollStep.GTK_SCROLL_HORIZONTAL_ENDS)
end ScrollStep

object ScrollStep:
  def fromRaw(raw: GtkScrollStep): ScrollStep =
    raw match
      case GtkScrollStep.GTK_SCROLL_STEPS            => ScrollStep.STEPS
      case GtkScrollStep.GTK_SCROLL_PAGES            => ScrollStep.PAGES
      case GtkScrollStep.GTK_SCROLL_ENDS             => ScrollStep.ENDS
      case GtkScrollStep.GTK_SCROLL_HORIZONTAL_STEPS =>
        ScrollStep.HORIZONTAL_STEPS
      case GtkScrollStep.GTK_SCROLL_HORIZONTAL_PAGES =>
        ScrollStep.HORIZONTAL_PAGES
      case GtkScrollStep.GTK_SCROLL_HORIZONTAL_ENDS =>
        ScrollStep.HORIZONTAL_ENDS
  end fromRaw
end ScrollStep
