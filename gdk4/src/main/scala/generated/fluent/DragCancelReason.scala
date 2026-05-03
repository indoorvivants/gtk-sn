package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkDragCancelReason

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Used in `GdkDrag` to the reason of a cancelled DND operation.
  */
enum DragCancelReason(val raw: GdkDragCancelReason):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * There is no suitable drop target.
    */
  case NO_TARGET
      extends DragCancelReason(GdkDragCancelReason.GDK_DRAG_CANCEL_NO_TARGET)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Drag cancelled by the user
    */
  case USER_CANCELLED
      extends DragCancelReason(
        GdkDragCancelReason.GDK_DRAG_CANCEL_USER_CANCELLED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unspecified error.
    */
  case ERROR extends DragCancelReason(GdkDragCancelReason.GDK_DRAG_CANCEL_ERROR)
end DragCancelReason

object DragCancelReason:
  def fromRaw(raw: GdkDragCancelReason): DragCancelReason =
    raw match
      case GdkDragCancelReason.GDK_DRAG_CANCEL_NO_TARGET =>
        DragCancelReason.NO_TARGET
      case GdkDragCancelReason.GDK_DRAG_CANCEL_USER_CANCELLED =>
        DragCancelReason.USER_CANCELLED
      case GdkDragCancelReason.GDK_DRAG_CANCEL_ERROR => DragCancelReason.ERROR
  end fromRaw
end DragCancelReason
