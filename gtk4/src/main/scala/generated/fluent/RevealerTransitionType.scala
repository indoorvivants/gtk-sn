package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkRevealerTransitionType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * These enumeration values describe the possible transitions when the child of
  * a `GtkRevealer` widget is shown or hidden.
  */
enum RevealerTransitionType(val raw: GtkRevealerTransitionType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No transition
    */
  case NONE
      extends RevealerTransitionType(
        GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_NONE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fade in
    */
  case CROSSFADE
      extends RevealerTransitionType(
        GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_CROSSFADE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Slide in from the left
    */
  case SLIDE_RIGHT
      extends RevealerTransitionType(
        GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_RIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Slide in from the right
    */
  case SLIDE_LEFT
      extends RevealerTransitionType(
        GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_LEFT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Slide in from the bottom
    */
  case SLIDE_UP
      extends RevealerTransitionType(
        GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_UP
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Slide in from the top
    */
  case SLIDE_DOWN
      extends RevealerTransitionType(
        GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_DOWN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Floop in from the left
    */
  case SWING_RIGHT
      extends RevealerTransitionType(
        GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SWING_RIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Floop in from the right
    */
  case SWING_LEFT
      extends RevealerTransitionType(
        GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SWING_LEFT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Floop in from the bottom
    */
  case SWING_UP
      extends RevealerTransitionType(
        GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SWING_UP
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Floop in from the top
    */
  case SWING_DOWN
      extends RevealerTransitionType(
        GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SWING_DOWN
      )
end RevealerTransitionType

object RevealerTransitionType:
  def fromRaw(raw: GtkRevealerTransitionType): RevealerTransitionType =
    raw match
      case GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_NONE =>
        RevealerTransitionType.NONE
      case GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_CROSSFADE =>
        RevealerTransitionType.CROSSFADE
      case GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_RIGHT =>
        RevealerTransitionType.SLIDE_RIGHT
      case GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_LEFT =>
        RevealerTransitionType.SLIDE_LEFT
      case GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_UP =>
        RevealerTransitionType.SLIDE_UP
      case GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_DOWN =>
        RevealerTransitionType.SLIDE_DOWN
      case GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SWING_RIGHT =>
        RevealerTransitionType.SWING_RIGHT
      case GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SWING_LEFT =>
        RevealerTransitionType.SWING_LEFT
      case GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SWING_UP =>
        RevealerTransitionType.SWING_UP
      case GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SWING_DOWN =>
        RevealerTransitionType.SWING_DOWN
  end fromRaw
end RevealerTransitionType
