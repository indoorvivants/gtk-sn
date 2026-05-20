package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkTextureClass

class TextureClass private[gnome] (raw: Ptr[GdkTextureClass]):

  def getUnsafeRawPointer(): Ptr[GdkTextureClass] = this.raw
end TextureClass

object TextureClass:
  def fromRaw(ptr: Ptr[GdkTextureClass]): TextureClass = new TextureClass(ptr)
end TextureClass
