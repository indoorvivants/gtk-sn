package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.internal.cairo_region_t
import sn.gnome.gdk4.fluent.Display
import sn.gnome.gdk4.fluent.Surface
import sn.gnome.gdk4.internal.GdkDrawContext
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

class DrawContext(raw: Ptr[GdkDrawContext]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def beginFrame(region: Ptr[cairo_region_t]): Unit =
    gdk_draw_context_begin_frame(this.raw.asInstanceOf, region)

  def endFrame(): Unit = gdk_draw_context_end_frame(this.raw.asInstanceOf)

  def getDisplay(): Display = new Display(
    gdk_draw_context_get_display(this.raw.asInstanceOf).asInstanceOf
  )

  def getFrameRegion(): Ptr[cairo_region_t] = gdk_draw_context_get_frame_region(
    this.raw.asInstanceOf
  )

  def getSurface(): Surface = new Surface(
    gdk_draw_context_get_surface(this.raw.asInstanceOf).asInstanceOf
  )

  def isInFrame(): Boolean =
    gdk_draw_context_is_in_frame(this.raw.asInstanceOf).value.!=(0)

end DrawContext
