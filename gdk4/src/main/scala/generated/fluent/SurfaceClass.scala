package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkSurfaceClass

class SurfaceClass private[gnome] (raw: Ptr[GdkSurfaceClass]):

  def getUnsafeRawPointer(): Ptr[GdkSurfaceClass] = this.raw
end SurfaceClass

object SurfaceClass:
  def fromRaw(ptr: Ptr[GdkSurfaceClass]): SurfaceClass = new SurfaceClass(ptr)
end SurfaceClass
