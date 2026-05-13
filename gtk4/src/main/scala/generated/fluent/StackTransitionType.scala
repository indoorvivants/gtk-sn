package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkStackTransitionType

/** Possible transitions between pages in a `GtkStack` widget.
  *
  * New values may be added to this enumeration over time.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum StackTransitionType(val raw: GtkStackTransitionType):
  /** No transition
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_NONE
      )

  /** A cross-fade
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CROSSFADE
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_CROSSFADE
      )

  /** Slide from left to right
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SLIDE_RIGHT
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_RIGHT
      )

  /** Slide from right to left
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SLIDE_LEFT
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_LEFT
      )

  /** Slide from bottom up
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SLIDE_UP
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_UP
      )

  /** Slide from top down
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SLIDE_DOWN
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_DOWN
      )

  /** Slide from left or right according to the children order
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SLIDE_LEFT_RIGHT
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_LEFT_RIGHT
      )

  /** Slide from top down or bottom up according to the order
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SLIDE_UP_DOWN
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_SLIDE_UP_DOWN
      )

  /** Cover the old page by sliding up
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OVER_UP
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_UP
      )

  /** Cover the old page by sliding down
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OVER_DOWN
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_DOWN
      )

  /** Cover the old page by sliding to the left
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OVER_LEFT
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_LEFT
      )

  /** Cover the old page by sliding to the right
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OVER_RIGHT
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_RIGHT
      )

  /** Uncover the new page by sliding up
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNDER_UP
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_UNDER_UP
      )

  /** Uncover the new page by sliding down
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNDER_DOWN
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_UNDER_DOWN
      )

  /** Uncover the new page by sliding to the left
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNDER_LEFT
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_UNDER_LEFT
      )

  /** Uncover the new page by sliding to the right
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNDER_RIGHT
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_UNDER_RIGHT
      )

  /** Cover the old page sliding up or uncover the new page sliding down,
    * according to order
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OVER_UP_DOWN
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_UP_DOWN
      )

  /** Cover the old page sliding down or uncover the new page sliding up,
    * according to order
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OVER_DOWN_UP
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_DOWN_UP
      )

  /** Cover the old page sliding left or uncover the new page sliding right,
    * according to order
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OVER_LEFT_RIGHT
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_LEFT_RIGHT
      )

  /** Cover the old page sliding right or uncover the new page sliding left,
    * according to order
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OVER_RIGHT_LEFT
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_OVER_RIGHT_LEFT
      )

  /** Pretend the pages are sides of a cube and rotate that cube to the left
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ROTATE_LEFT
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_ROTATE_LEFT
      )

  /** Pretend the pages are sides of a cube and rotate that cube to the right
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ROTATE_RIGHT
      extends StackTransitionType(
        GtkStackTransitionType.GTK_STACK_TRANSITION_TYPE_ROTATE_RIGHT
      )

  /** Pretend the pages are sides of a cube and rotate that cube to the left or
    * right according to the children order
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
