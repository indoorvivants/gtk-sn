package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkRevealerTransitionType

/** These enumeration values describe the possible transitions when the child of
  * a `GtkRevealer` widget is shown or hidden.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum RevealerTransitionType(val raw: GtkRevealerTransitionType):
  /** No transition
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE
      extends RevealerTransitionType(
        GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_NONE
      )

  /** Fade in
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CROSSFADE
      extends RevealerTransitionType(
        GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_CROSSFADE
      )

  /** Slide in from the left
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SLIDE_RIGHT
      extends RevealerTransitionType(
        GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_RIGHT
      )

  /** Slide in from the right
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SLIDE_LEFT
      extends RevealerTransitionType(
        GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_LEFT
      )

  /** Slide in from the bottom
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SLIDE_UP
      extends RevealerTransitionType(
        GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_UP
      )

  /** Slide in from the top
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SLIDE_DOWN
      extends RevealerTransitionType(
        GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SLIDE_DOWN
      )

  /** Floop in from the left
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SWING_RIGHT
      extends RevealerTransitionType(
        GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SWING_RIGHT
      )

  /** Floop in from the right
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SWING_LEFT
      extends RevealerTransitionType(
        GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SWING_LEFT
      )

  /** Floop in from the bottom
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SWING_UP
      extends RevealerTransitionType(
        GtkRevealerTransitionType.GTK_REVEALER_TRANSITION_TYPE_SWING_UP
      )

  /** Floop in from the top
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
