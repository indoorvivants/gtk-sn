package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.GdkDragCancelReason

/** Used in `GdkDrag` to the reason of a cancelled DND operation.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum DragCancelReason(val raw: GdkDragCancelReason):
  /** There is no suitable drop target.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NO_TARGET
      extends DragCancelReason(GdkDragCancelReason.GDK_DRAG_CANCEL_NO_TARGET)

  /** Drag cancelled by the user
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case USER_CANCELLED
      extends DragCancelReason(
        GdkDragCancelReason.GDK_DRAG_CANCEL_USER_CANCELLED
      )

  /** Unspecified error.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
