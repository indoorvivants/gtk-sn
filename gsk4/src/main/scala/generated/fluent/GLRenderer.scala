package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.fluent.Renderer
import sn.gnome.gsk4.internal.GskGLRenderer

class GLRenderer(raw: Ptr[GskGLRenderer]) extends Renderer(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end GLRenderer

object GLRenderer:
  /** Creates a new `GskRenderer` using the new OpenGL renderer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): GLRenderer =
    val raw: Ptr[Byte] = gsk_gl_renderer_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[GLRenderer](raw, r => new GLRenderer(r.asInstanceOf))
  end apply
end GLRenderer
