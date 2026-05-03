package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkScrollStep

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Passed as argument to various keybinding signals.
  */
enum ScrollStep(val raw: GtkScrollStep):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scroll in steps.
    */
  case STEPS extends ScrollStep(GtkScrollStep.GTK_SCROLL_STEPS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scroll by pages.
    */
  case PAGES extends ScrollStep(GtkScrollStep.GTK_SCROLL_PAGES)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scroll to ends.
    */
  case ENDS extends ScrollStep(GtkScrollStep.GTK_SCROLL_ENDS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scroll in horizontal steps.
    */
  case HORIZONTAL_STEPS
      extends ScrollStep(GtkScrollStep.GTK_SCROLL_HORIZONTAL_STEPS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scroll by horizontal pages.
    */
  case HORIZONTAL_PAGES
      extends ScrollStep(GtkScrollStep.GTK_SCROLL_HORIZONTAL_PAGES)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scroll to the horizontal ends.
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
