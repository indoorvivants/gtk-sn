package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkDragSurfaceInterface

/** The `GdkDragSurfaceInterface` implementation is private to GDK.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DragSurfaceInterface private[gnome] (raw: Ptr[GdkDragSurfaceInterface]):

  def getUnsafeRawPointer(): Ptr[GdkDragSurfaceInterface] = this.raw
end DragSurfaceInterface

object DragSurfaceInterface:
  def fromRaw(ptr: Ptr[GdkDragSurfaceInterface]): DragSurfaceInterface =
    new DragSurfaceInterface(ptr)
end DragSurfaceInterface
