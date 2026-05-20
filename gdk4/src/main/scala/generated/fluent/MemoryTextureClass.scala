package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkMemoryTextureClass

class MemoryTextureClass private[gnome] (raw: Ptr[GdkMemoryTextureClass]):

  def getUnsafeRawPointer(): Ptr[GdkMemoryTextureClass] = this.raw
end MemoryTextureClass

object MemoryTextureClass:
  def fromRaw(ptr: Ptr[GdkMemoryTextureClass]): MemoryTextureClass =
    new MemoryTextureClass(ptr)
end MemoryTextureClass
