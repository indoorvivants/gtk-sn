package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkScrollablePolicy

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Defines the policy to be used in a scrollable widget when updating the
  * scrolled window adjustments in a given orientation.
  */
enum ScrollablePolicy(val raw: GtkScrollablePolicy):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scrollable adjustments are based on the minimum size
    */
  case MINIMUM extends ScrollablePolicy(GtkScrollablePolicy.GTK_SCROLL_MINIMUM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scrollable adjustments are based on the natural size
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
