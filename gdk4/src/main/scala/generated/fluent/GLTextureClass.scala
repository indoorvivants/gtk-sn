package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkGLTextureClass

class GLTextureClass private[gnome] (raw: Ptr[GdkGLTextureClass]):

  def getUnsafeRawPointer(): Ptr[GdkGLTextureClass] = this.raw
end GLTextureClass

object GLTextureClass:
  def fromRaw(ptr: Ptr[GdkGLTextureClass]): GLTextureClass = new GLTextureClass(
    ptr
  )
end GLTextureClass
