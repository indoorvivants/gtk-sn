package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.Renderer
import sn.gnome.gsk4.internal.GskCairoRenderer

class CairoRenderer(raw: Ptr[GskCairoRenderer])
    extends Renderer(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CairoRenderer

object CairoRenderer:
  def apply(): CairoRenderer = new CairoRenderer(
    gsk_cairo_renderer_new().asInstanceOf
  )
end CairoRenderer
