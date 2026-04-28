package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.internal.cairo_t
import sn.gnome.gdk4.fluent.DrawContext
import sn.gnome.gdk4.internal.GdkCairoContext

class CairoContext(raw: Ptr[GdkCairoContext])
    extends DrawContext(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def cairoCreate(): Ptr[cairo_t] = gdk_cairo_context_cairo_create(
    this.raw.asInstanceOf
  )

end CairoContext
