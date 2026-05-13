package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.GdkFullscreenMode

/** Indicates which monitor a surface should span over when in fullscreen mode.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum FullscreenMode(val raw: GdkFullscreenMode):
  /** Fullscreen on current monitor only.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CURRENT_MONITOR
      extends FullscreenMode(
        GdkFullscreenMode.GDK_FULLSCREEN_ON_CURRENT_MONITOR
      )

  /** Span across all monitors when fullscreen.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ALL_MONITORS
      extends FullscreenMode(GdkFullscreenMode.GDK_FULLSCREEN_ON_ALL_MONITORS)
end FullscreenMode

object FullscreenMode:
  def fromRaw(raw: GdkFullscreenMode): FullscreenMode =
    raw match
      case GdkFullscreenMode.GDK_FULLSCREEN_ON_CURRENT_MONITOR =>
        FullscreenMode.CURRENT_MONITOR
      case GdkFullscreenMode.GDK_FULLSCREEN_ON_ALL_MONITORS =>
        FullscreenMode.ALL_MONITORS
  end fromRaw
end FullscreenMode
