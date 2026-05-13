package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkScrollType

/** Scrolling types.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ScrollType(val raw: GtkScrollType):
  /** No scrolling.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends ScrollType(GtkScrollType.GTK_SCROLL_NONE)

  /** Jump to new location.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case JUMP extends ScrollType(GtkScrollType.GTK_SCROLL_JUMP)

  /** Step backward.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STEP_BACKWARD extends ScrollType(GtkScrollType.GTK_SCROLL_STEP_BACKWARD)

  /** Step forward.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STEP_FORWARD extends ScrollType(GtkScrollType.GTK_SCROLL_STEP_FORWARD)

  /** Page backward.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PAGE_BACKWARD extends ScrollType(GtkScrollType.GTK_SCROLL_PAGE_BACKWARD)

  /** Page forward.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PAGE_FORWARD extends ScrollType(GtkScrollType.GTK_SCROLL_PAGE_FORWARD)

  /** Step up.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STEP_UP extends ScrollType(GtkScrollType.GTK_SCROLL_STEP_UP)

  /** Step down.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STEP_DOWN extends ScrollType(GtkScrollType.GTK_SCROLL_STEP_DOWN)

  /** Page up.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PAGE_UP extends ScrollType(GtkScrollType.GTK_SCROLL_PAGE_UP)

  /** Page down.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PAGE_DOWN extends ScrollType(GtkScrollType.GTK_SCROLL_PAGE_DOWN)

  /** Step to the left.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STEP_LEFT extends ScrollType(GtkScrollType.GTK_SCROLL_STEP_LEFT)

  /** Step to the right.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STEP_RIGHT extends ScrollType(GtkScrollType.GTK_SCROLL_STEP_RIGHT)

  /** Page to the left.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PAGE_LEFT extends ScrollType(GtkScrollType.GTK_SCROLL_PAGE_LEFT)

  /** Page to the right.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PAGE_RIGHT extends ScrollType(GtkScrollType.GTK_SCROLL_PAGE_RIGHT)

  /** Scroll to start.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case START extends ScrollType(GtkScrollType.GTK_SCROLL_START)

  /** Scroll to end.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case END extends ScrollType(GtkScrollType.GTK_SCROLL_END)
end ScrollType

object ScrollType:
  def fromRaw(raw: GtkScrollType): ScrollType =
    raw match
      case GtkScrollType.GTK_SCROLL_NONE          => ScrollType.NONE
      case GtkScrollType.GTK_SCROLL_JUMP          => ScrollType.JUMP
      case GtkScrollType.GTK_SCROLL_STEP_BACKWARD => ScrollType.STEP_BACKWARD
      case GtkScrollType.GTK_SCROLL_STEP_FORWARD  => ScrollType.STEP_FORWARD
      case GtkScrollType.GTK_SCROLL_PAGE_BACKWARD => ScrollType.PAGE_BACKWARD
      case GtkScrollType.GTK_SCROLL_PAGE_FORWARD  => ScrollType.PAGE_FORWARD
      case GtkScrollType.GTK_SCROLL_STEP_UP       => ScrollType.STEP_UP
      case GtkScrollType.GTK_SCROLL_STEP_DOWN     => ScrollType.STEP_DOWN
      case GtkScrollType.GTK_SCROLL_PAGE_UP       => ScrollType.PAGE_UP
      case GtkScrollType.GTK_SCROLL_PAGE_DOWN     => ScrollType.PAGE_DOWN
      case GtkScrollType.GTK_SCROLL_STEP_LEFT     => ScrollType.STEP_LEFT
      case GtkScrollType.GTK_SCROLL_STEP_RIGHT    => ScrollType.STEP_RIGHT
      case GtkScrollType.GTK_SCROLL_PAGE_LEFT     => ScrollType.PAGE_LEFT
      case GtkScrollType.GTK_SCROLL_PAGE_RIGHT    => ScrollType.PAGE_RIGHT
      case GtkScrollType.GTK_SCROLL_START         => ScrollType.START
      case GtkScrollType.GTK_SCROLL_END           => ScrollType.END
  end fromRaw
end ScrollType
