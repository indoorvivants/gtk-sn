package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkStackTransitionType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Possible transitions between pages in a `GtkStack` widget.
  *
  * New values may be added to this enumeration over time.
  */
enum StackTransitionType(val raw: GtkStackTransitionType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No transition
    */
  case NONE
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_NONE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A cross-fade
    */
  case CROSSFADE
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_CROSSFADE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Slide from left to right
    */
  case SLIDE_RIGHT
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_RIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Slide from right to left
    */
  case SLIDE_LEFT
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_LEFT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Slide from bottom up
    */
  case SLIDE_UP
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_UP
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Slide from top down
    */
  case SLIDE_DOWN
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_DOWN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Slide from left or right according to the children order
    */
  case SLIDE_LEFT_RIGHT
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_LEFT_RIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Slide from top down or bottom up according to the order
    */
  case SLIDE_UP_DOWN
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_UP_DOWN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Cover the old page by sliding up
    */
  case OVER_UP
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_UP
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Cover the old page by sliding down
    */
  case OVER_DOWN
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_DOWN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Cover the old page by sliding to the left
    */
  case OVER_LEFT
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_LEFT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Cover the old page by sliding to the right
    */
  case OVER_RIGHT
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_RIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Uncover the new page by sliding up
    */
  case UNDER_UP
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_UNDER_UP
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Uncover the new page by sliding down
    */
  case UNDER_DOWN
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_UNDER_DOWN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Uncover the new page by sliding to the left
    */
  case UNDER_LEFT
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_UNDER_LEFT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Uncover the new page by sliding to the right
    */
  case UNDER_RIGHT
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_UNDER_RIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Cover the old page sliding up or uncover the new page sliding down,
    * according to order
    */
  case OVER_UP_DOWN
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_UP_DOWN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Cover the old page sliding down or uncover the new page sliding up,
    * according to order
    */
  case OVER_DOWN_UP
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_DOWN_UP
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Cover the old page sliding left or uncover the new page sliding right,
    * according to order
    */
  case OVER_LEFT_RIGHT
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_LEFT_RIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Cover the old page sliding right or uncover the new page sliding left,
    * according to order
    */
  case OVER_RIGHT_LEFT
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_RIGHT_LEFT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pretend the pages are sides of a cube and rotate that cube to the left
    */
  case ROTATE_LEFT
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_ROTATE_LEFT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pretend the pages are sides of a cube and rotate that cube to the right
    */
  case ROTATE_RIGHT
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_ROTATE_RIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pretend the pages are sides of a cube and rotate that cube to the left or
    * right according to the children order
    */
  case ROTATE_LEFT_RIGHT
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_ROTATE_LEFT_RIGHT
      )
end StackTransitionType

object StackTransitionType:
  def fromRaw(raw: GtkStackTransitionType): StackTransitionType =
    raw match
      case GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_NONE =>
        StackTransitionType.NONE
      case GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_CROSSFADE =>
        StackTransitionType.CROSSFADE
      case GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_RIGHT =>
        StackTransitionType.SLIDE_RIGHT
      case GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_LEFT =>
        StackTransitionType.SLIDE_LEFT
      case GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_UP =>
        StackTransitionType.SLIDE_UP
      case GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_DOWN =>
        StackTransitionType.SLIDE_DOWN
      case GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_LEFT_RIGHT =>
        StackTransitionType.SLIDE_LEFT_RIGHT
      case GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_UP_DOWN =>
        StackTransitionType.SLIDE_UP_DOWN
      case GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_UP =>
        StackTransitionType.OVER_UP
      case GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_DOWN =>
        StackTransitionType.OVER_DOWN
      case GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_LEFT =>
        StackTransitionType.OVER_LEFT
      case GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_RIGHT =>
        StackTransitionType.OVER_RIGHT
      case GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_UNDER_UP =>
        StackTransitionType.UNDER_UP
      case GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_UNDER_DOWN =>
        StackTransitionType.UNDER_DOWN
      case GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_UNDER_LEFT =>
        StackTransitionType.UNDER_LEFT
      case GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_UNDER_RIGHT =>
        StackTransitionType.UNDER_RIGHT
      case GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_UP_DOWN =>
        StackTransitionType.OVER_UP_DOWN
      case GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_DOWN_UP =>
        StackTransitionType.OVER_DOWN_UP
      case GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_LEFT_RIGHT =>
        StackTransitionType.OVER_LEFT_RIGHT
      case GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_RIGHT_LEFT =>
        StackTransitionType.OVER_RIGHT_LEFT
      case GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_ROTATE_LEFT =>
        StackTransitionType.ROTATE_LEFT
      case GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_ROTATE_RIGHT =>
        StackTransitionType.ROTATE_RIGHT
      case GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_ROTATE_LEFT_RIGHT =>
        StackTransitionType.ROTATE_LEFT_RIGHT
  end fromRaw
end StackTransitionType
