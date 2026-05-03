package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkTitlebarGesture

enum TitlebarGesture(val raw: GdkTitlebarGesture):
  case DOUBLE_CLICK
      extends TitlebarGesture(
        GdkTitlebarGesture.GDK_TITLEBAR_GESTURE_DOUBLE_CLICK
      )
  case RIGHT_CLICK
      extends TitlebarGesture(
        GdkTitlebarGesture.GDK_TITLEBAR_GESTURE_RIGHT_CLICK
      )
  case MIDDLE_CLICK
      extends TitlebarGesture(
        GdkTitlebarGesture.GDK_TITLEBAR_GESTURE_MIDDLE_CLICK
      )
end TitlebarGesture

object TitlebarGesture:
  def fromRaw(raw: GdkTitlebarGesture): TitlebarGesture =
    raw match
      case GdkTitlebarGesture.GDK_TITLEBAR_GESTURE_DOUBLE_CLICK =>
        TitlebarGesture.DOUBLE_CLICK
      case GdkTitlebarGesture.GDK_TITLEBAR_GESTURE_RIGHT_CLICK =>
        TitlebarGesture.RIGHT_CLICK
      case GdkTitlebarGesture.GDK_TITLEBAR_GESTURE_MIDDLE_CLICK =>
        TitlebarGesture.MIDDLE_CLICK
  end fromRaw
end TitlebarGesture
