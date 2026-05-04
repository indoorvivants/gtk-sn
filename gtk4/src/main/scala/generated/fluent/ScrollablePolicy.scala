package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkScrollablePolicy

/** Defines the policy to be used in a scrollable widget when updating the
  * scrolled window adjustments in a given orientation.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ScrollablePolicy(val raw: GtkScrollablePolicy):
  /** Scrollable adjustments are based on the minimum size
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MINIMUM extends ScrollablePolicy(GtkScrollablePolicy.GTK_SCROLL_MINIMUM)

  /** Scrollable adjustments are based on the natural size
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NATURAL extends ScrollablePolicy(GtkScrollablePolicy.GTK_SCROLL_NATURAL)
end ScrollablePolicy

object ScrollablePolicy:
  def fromRaw(raw: GtkScrollablePolicy): ScrollablePolicy =
    raw match
      case GtkScrollablePolicy.GTK_SCROLL_MINIMUM => ScrollablePolicy.MINIMUM
      case GtkScrollablePolicy.GTK_SCROLL_NATURAL => ScrollablePolicy.NATURAL
  end fromRaw
end ScrollablePolicy
