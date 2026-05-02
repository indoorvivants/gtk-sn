package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.fluent.Renderer
import sn.gnome.gsk4.internal.GskCairoRenderer

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A GSK renderer that is using cairo.
  *
  * Since it is using cairo, this renderer cannot support 3D transformations.
  */
class CairoRenderer(raw: Ptr[GskCairoRenderer])
    extends Renderer(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CairoRenderer

object CairoRenderer:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new Cairo renderer.
    *
    * The Cairo renderer is the fallback renderer drawing in ways similar to how
    * GTK 3 drew its content. Its primary use is as comparison tool.
    *
    * The Cairo renderer is incomplete. It cannot render 3D transformed content
    * and will instead render an error marker. Its usage should be avoided.
    */
  def apply(): CairoRenderer = new CairoRenderer(
    gsk_cairo_renderer_new().asInstanceOf
  )
end CairoRenderer
