package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gsk4.internal.GskGLShaderClass

class GLShaderClass private[gnome] (raw: Ptr[GskGLShaderClass]):

  def getUnsafeRawPointer(): Ptr[GskGLShaderClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end GLShaderClass

object GLShaderClass:
  def fromRaw(ptr: Ptr[GskGLShaderClass]): GLShaderClass = new GLShaderClass(
    ptr
  )
end GLShaderClass
