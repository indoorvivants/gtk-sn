package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkDragSurfaceSize

/** The `GdkDragSurfaceSize` struct contains information that is useful to
  * compute the size of a drag surface.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DragSurfaceSize private[gnome] (raw: Ptr[GdkDragSurfaceSize]):

  def getUnsafeRawPointer(): Ptr[GdkDragSurfaceSize] = this.raw

  /** Sets the size the drag surface prefers to be resized to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSize(
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  ): Unit /* None */ =
    gdk_drag_surface_size_set_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDragSurfaceSize]],
      width,
      height
    )
  end setSize

end DragSurfaceSize

object DragSurfaceSize:
  def fromRaw(ptr: Ptr[GdkDragSurfaceSize]): DragSurfaceSize =
    new DragSurfaceSize(ptr)
end DragSurfaceSize
