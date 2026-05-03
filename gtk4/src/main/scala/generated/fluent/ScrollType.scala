package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkScrollType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Scrolling types.
  */
enum ScrollType(val raw: GtkScrollType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No scrolling.
    */
  case NONE extends ScrollType(GtkScrollType.GTK_SCROLL_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Jump to new location.
    */
  case JUMP extends ScrollType(GtkScrollType.GTK_SCROLL_JUMP)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Step backward.
    */
  case STEP_BACKWARD extends ScrollType(GtkScrollType.GTK_SCROLL_STEP_BACKWARD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Step forward.
    */
  case STEP_FORWARD extends ScrollType(GtkScrollType.GTK_SCROLL_STEP_FORWARD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Page backward.
    */
  case PAGE_BACKWARD extends ScrollType(GtkScrollType.GTK_SCROLL_PAGE_BACKWARD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Page forward.
    */
  case PAGE_FORWARD extends ScrollType(GtkScrollType.GTK_SCROLL_PAGE_FORWARD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Step up.
    */
  case STEP_UP extends ScrollType(GtkScrollType.GTK_SCROLL_STEP_UP)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Step down.
    */
  case STEP_DOWN extends ScrollType(GtkScrollType.GTK_SCROLL_STEP_DOWN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Page up.
    */
  case PAGE_UP extends ScrollType(GtkScrollType.GTK_SCROLL_PAGE_UP)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Page down.
    */
  case PAGE_DOWN extends ScrollType(GtkScrollType.GTK_SCROLL_PAGE_DOWN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Step to the left.
    */
  case STEP_LEFT extends ScrollType(GtkScrollType.GTK_SCROLL_STEP_LEFT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Step to the right.
    */
  case STEP_RIGHT extends ScrollType(GtkScrollType.GTK_SCROLL_STEP_RIGHT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Page to the left.
    */
  case PAGE_LEFT extends ScrollType(GtkScrollType.GTK_SCROLL_PAGE_LEFT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Page to the right.
    */
  case PAGE_RIGHT extends ScrollType(GtkScrollType.GTK_SCROLL_PAGE_RIGHT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scroll to start.
    */
  case START extends ScrollType(GtkScrollType.GTK_SCROLL_START)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scroll to end.
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
