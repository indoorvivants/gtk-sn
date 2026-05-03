package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkCornerType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Specifies which corner a child widget should be placed in when packed into a
  * `GtkScrolledWindow.`
  *
  * This is effectively the opposite of where the scroll bars are placed.
  */
enum CornerType(val raw: GtkCornerType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Place the scrollbars on the right and bottom of the widget (default
    * behaviour).
    */
  case TOP_LEFT extends CornerType(GtkCornerType.GTK_CORNER_TOP_LEFT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Place the scrollbars on the top and right of the widget.
    */
  case BOTTOM_LEFT extends CornerType(GtkCornerType.GTK_CORNER_BOTTOM_LEFT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Place the scrollbars on the left and bottom of the widget.
    */
  case TOP_RIGHT extends CornerType(GtkCornerType.GTK_CORNER_TOP_RIGHT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Place the scrollbars on the top and left of the widget.
    */
  case BOTTOM_RIGHT extends CornerType(GtkCornerType.GTK_CORNER_BOTTOM_RIGHT)
end CornerType

object CornerType:
  def fromRaw(raw: GtkCornerType): CornerType =
    raw match
      case GtkCornerType.GTK_CORNER_TOP_LEFT     => CornerType.TOP_LEFT
      case GtkCornerType.GTK_CORNER_BOTTOM_LEFT  => CornerType.BOTTOM_LEFT
      case GtkCornerType.GTK_CORNER_TOP_RIGHT    => CornerType.TOP_RIGHT
      case GtkCornerType.GTK_CORNER_BOTTOM_RIGHT => CornerType.BOTTOM_RIGHT
  end fromRaw
end CornerType
