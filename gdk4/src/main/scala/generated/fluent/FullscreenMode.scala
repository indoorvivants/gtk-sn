package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkFullscreenMode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Indicates which monitor a surface should span over when in fullscreen mode.
  */
enum FullscreenMode(val raw: GdkFullscreenMode):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fullscreen on current monitor only.
    */
  case CURRENT_MONITOR
      extends FullscreenMode(
        GdkFullscreenMode.GDK_FULLSCREEN_ON_CURRENT_MONITOR
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Span across all monitors when fullscreen.
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
