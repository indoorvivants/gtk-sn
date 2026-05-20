package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkGLTextureBuilderClass

class GLTextureBuilderClass private[gnome] (raw: Ptr[GdkGLTextureBuilderClass]):

  def getUnsafeRawPointer(): Ptr[GdkGLTextureBuilderClass] = this.raw
end GLTextureBuilderClass

object GLTextureBuilderClass:
  def fromRaw(ptr: Ptr[GdkGLTextureBuilderClass]): GLTextureBuilderClass =
    new GLTextureBuilderClass(ptr)
end GLTextureBuilderClass
