package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait DragSurface:
  def getUnsafeRawPointer(): Ptr[Byte]
end DragSurface

object DragSurface:
  class Abstract(raw: Ptr[Byte]) extends DragSurface:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end DragSurface
