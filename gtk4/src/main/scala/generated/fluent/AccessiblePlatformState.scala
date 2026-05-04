package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkAccessiblePlatformState

/** The various platform states which can be queried using
  * [method@Gtk.Accessible.get_platform_state].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum AccessiblePlatformState(val raw: GtkAccessiblePlatformState):
  /** whether the accessible can be focused
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FOCUSABLE
      extends AccessiblePlatformState(
        GtkAccessiblePlatformState.GTK_ACCESSIBLE_PLATFORM_STATE_FOCUSABLE
      )

  /** whether the accessible has focus
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FOCUSED
      extends AccessiblePlatformState(
        GtkAccessiblePlatformState.GTK_ACCESSIBLE_PLATFORM_STATE_FOCUSED
      )

  /** whether the accessible is active
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
