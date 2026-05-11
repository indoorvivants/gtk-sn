package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}

trait DragSurface:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Present @drag_surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def present(
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  ): Boolean /* None */ =
    gdk_drag_surface_present(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDragSurface]],
      width,
      height
    ).value.!=(0)
  end present

end DragSurface

object DragSurface:
  class Abstract(raw: Ptr[Byte]) extends DragSurface:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end DragSurface
