package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.fluent.Renderer
import sn.gnome.gsk4.internal.GskCairoRenderer

/** A GSK renderer that is using cairo.
  *
  * Since it is using cairo, this renderer cannot support 3D transformations.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CairoRenderer private[gnome] (raw: Ptr[GskCairoRenderer])
    extends Renderer(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CairoRenderer

object CairoRenderer:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskCairoRenderer])(using Runtime) =
    summon[Runtime].getOrCreate[CairoRenderer](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new CairoRenderer(ptr)
    )

  /** Creates a new Cairo renderer.
    *
    * The Cairo renderer is the fallback renderer drawing in ways similar to how
    * GTK 3 drew its content. Its primary use is as comparison tool.
    *
    * The Cairo renderer is incomplete. It cannot render 3D transformed content
    * and will instead render an error marker. Its usage should be avoided.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): CairoRenderer =
    val raw: Ptr[Byte] = gsk_cairo_renderer_new().asInstanceOf
    summon[Runtime].getOrCreate[CairoRenderer](
      raw,
      r => CairoRenderer.applyUnsafe(r.asInstanceOf)
    )
  end apply
end CairoRenderer
