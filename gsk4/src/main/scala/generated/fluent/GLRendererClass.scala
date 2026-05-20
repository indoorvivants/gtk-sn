package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.internal.GskGLRendererClass

class GLRendererClass private[gnome] (raw: Ptr[GskGLRendererClass]):

  def getUnsafeRawPointer(): Ptr[GskGLRendererClass] = this.raw
end GLRendererClass

object GLRendererClass:
  def fromRaw(ptr: Ptr[GskGLRendererClass]): GLRendererClass =
    new GLRendererClass(ptr)
end GLRendererClass
