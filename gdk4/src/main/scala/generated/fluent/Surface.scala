package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.internal.cairo_content_t
import sn.gnome.cairo.internal.cairo_region_t
import sn.gnome.cairo.internal.cairo_surface_t
import sn.gnome.gdk4.fluent.CairoContext
import sn.gnome.gdk4.fluent.Cursor
import sn.gnome.gdk4.fluent.Device
import sn.gnome.gdk4.fluent.Display
import sn.gnome.gdk4.fluent.FrameClock
import sn.gnome.gdk4.fluent.GLContext
import sn.gnome.gdk4.fluent.Surface
import sn.gnome.gdk4.fluent.VulkanContext
import sn.gnome.gdk4.internal.GdkSurface
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

class Surface(raw: Ptr[GdkSurface]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def beep(): Unit = gdk_surface_beep(this.raw.asInstanceOf)

  def createCairoContext(): CairoContext = new CairoContext(
    gdk_surface_create_cairo_context(this.raw.asInstanceOf).asInstanceOf
  )

  def createGlContext(): GResult[GLContext] = GResult.wrap(__errorPtr =>
    new GLContext(
      gdk_surface_create_gl_context(
        this.raw.asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  def createSimilarSurface(
      content: cairo_content_t,
      width: Int,
      height: Int
  ): Ptr[cairo_surface_t] = gdk_surface_create_similar_surface(
    this.raw.asInstanceOf,
    content,
    width,
    height
  )

  def createVulkanContext(): GResult[VulkanContext] = GResult.wrap(__errorPtr =>
    new VulkanContext(
      gdk_surface_create_vulkan_context(
        this.raw.asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  def destroy(): Unit = gdk_surface_destroy(this.raw.asInstanceOf)

  def getCursor(): Cursor = new Cursor(
    gdk_surface_get_cursor(this.raw.asInstanceOf).asInstanceOf
  )

  def getDeviceCursor(device: Device): Cursor = new Cursor(
    gdk_surface_get_device_cursor(
      this.raw.asInstanceOf,
      device.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  // Method get_device_position contains an OUT parameter, which is not supported yet

  def getDisplay(): Display = new Display(
    gdk_surface_get_display(this.raw.asInstanceOf).asInstanceOf
  )

  def getFrameClock(): FrameClock = new FrameClock(
    gdk_surface_get_frame_clock(this.raw.asInstanceOf).asInstanceOf
  )

  def getHeight(): Int = gdk_surface_get_height(this.raw.asInstanceOf)

  def getMapped(): Boolean =
    gdk_surface_get_mapped(this.raw.asInstanceOf).value.!=(0)

  def getScale(): Double = gdk_surface_get_scale(this.raw.asInstanceOf)

  def getScaleFactor(): Int = gdk_surface_get_scale_factor(
    this.raw.asInstanceOf
  )

  def getWidth(): Int = gdk_surface_get_width(this.raw.asInstanceOf)

  def hide(): Unit = gdk_surface_hide(this.raw.asInstanceOf)

  def isDestroyed(): Boolean =
    gdk_surface_is_destroyed(this.raw.asInstanceOf).value.!=(0)

  def queueRender(): Unit = gdk_surface_queue_render(this.raw.asInstanceOf)

  def requestLayout(): Unit = gdk_surface_request_layout(this.raw.asInstanceOf)

  def setCursor(cursor: Cursor): Unit = gdk_surface_set_cursor(
    this.raw.asInstanceOf,
    cursor.getUnsafeRawPointer().asInstanceOf
  )

  def setDeviceCursor(device: Device, cursor: Cursor): Unit =
    gdk_surface_set_device_cursor(
      this.raw.asInstanceOf,
      device.getUnsafeRawPointer().asInstanceOf,
      cursor.getUnsafeRawPointer().asInstanceOf
    )

  def setInputRegion(region: Ptr[cairo_region_t]): Unit =
    gdk_surface_set_input_region(this.raw.asInstanceOf, region)

  def setOpaqueRegion(region: Ptr[cairo_region_t]): Unit =
    gdk_surface_set_opaque_region(this.raw.asInstanceOf, region)

  // Method translate_coordinates contains an INOUT parameter, which is not supported yet

end Surface

object Surface:
  def popup(parent: Surface, autohide: Boolean): Surface = new Surface(
    gdk_surface_new_popup(
      parent.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if autohide == true then 1 else 0)))
    ).asInstanceOf
  )
  def toplevel(display: Display): Surface = new Surface(
    gdk_surface_new_toplevel(
      display.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end Surface
