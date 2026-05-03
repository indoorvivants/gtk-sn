package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkAccessiblePlatformState

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The various platform states which can be queried using
  * [method@Gtk.Accessible.get_platform_state].
  */
enum AccessiblePlatformState(val raw: GtkAccessiblePlatformState):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * whether the accessible can be focused
    */
  case FOCUSABLE
      extends AccessiblePlatformState(
        GtkAccessiblePlatformState.GTK_ACCESSIBLE_PLATFORM_STATE_FOCUSABLE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * whether the accessible has focus
    */
  case FOCUSED
      extends AccessiblePlatformState(
        GtkAccessiblePlatformState.GTK_ACCESSIBLE_PLATFORM_STATE_FOCUSED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * whether the accessible is active
    */
  case ACTIVE
      extends AccessiblePlatformState(
        GtkAccessiblePlatformState.GTK_ACCESSIBLE_PLATFORM_STATE_ACTIVE
      )
end AccessiblePlatformState

object AccessiblePlatformState:
  def fromRaw(raw: GtkAccessiblePlatformState): AccessiblePlatformState =
    raw match
      case GtkAccessiblePlatformState.GTK_ACCESSIBLE_PLATFORM_STATE_FOCUSABLE =>
        AccessiblePlatformState.FOCUSABLE
      case GtkAccessiblePlatformState.GTK_ACCESSIBLE_PLATFORM_STATE_FOCUSED =>
        AccessiblePlatformState.FOCUSED
      case GtkAccessiblePlatformState.GTK_ACCESSIBLE_PLATFORM_STATE_ACTIVE =>
        AccessiblePlatformState.ACTIVE
  end fromRaw
end AccessiblePlatformState
