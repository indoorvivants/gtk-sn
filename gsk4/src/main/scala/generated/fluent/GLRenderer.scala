package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.Renderer
import sn.gnome.gsk4.internal.GskGLRenderer

class GLRenderer(raw: Ptr[GskGLRenderer]) extends Renderer(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end GLRenderer

object GLRenderer:
  def apply(): GLRenderer = new GLRenderer(gsk_gl_renderer_new().asInstanceOf)
end GLRenderer
