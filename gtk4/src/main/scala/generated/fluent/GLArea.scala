package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.GLContext
import sn.gnome.gdk4.internal.GdkGLAPI
import sn.gnome.glib.internal.GError
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkGLArea

class GLArea(raw: Ptr[GtkGLArea])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def attachBuffers(): Unit = gtk_gl_area_attach_buffers(this.raw.asInstanceOf)

  def getAllowedApis(): GdkGLAPI = gtk_gl_area_get_allowed_apis(
    this.raw.asInstanceOf
  )

  def getApi(): GdkGLAPI = gtk_gl_area_get_api(this.raw.asInstanceOf)

  def getAutoRender(): Boolean =
    gtk_gl_area_get_auto_render(this.raw.asInstanceOf).value.!=(0)

  def getContext(): GLContext = new GLContext(
    gtk_gl_area_get_context(this.raw.asInstanceOf).asInstanceOf
  )

  def getError(): Ptr[GError] = gtk_gl_area_get_error(this.raw.asInstanceOf)

  def getHasDepthBuffer(): Boolean =
    gtk_gl_area_get_has_depth_buffer(this.raw.asInstanceOf).value.!=(0)

  def getHasStencilBuffer(): Boolean =
    gtk_gl_area_get_has_stencil_buffer(this.raw.asInstanceOf).value.!=(0)

  // Method get_required_version contains an OUT parameter, which is not supported yet

  def getUseEs(): Boolean =
    gtk_gl_area_get_use_es(this.raw.asInstanceOf).value.!=(0)

  def makeCurrent(): Unit = gtk_gl_area_make_current(this.raw.asInstanceOf)

  def queueRender(): Unit = gtk_gl_area_queue_render(this.raw.asInstanceOf)

  def setAllowedApis(apis: GdkGLAPI): Unit =
    gtk_gl_area_set_allowed_apis(this.raw.asInstanceOf, apis)

  def setAutoRender(auto_render: Boolean): Unit = gtk_gl_area_set_auto_render(
    this.raw.asInstanceOf,
    gboolean(gint((if auto_render == true then 1 else 0)))
  )

  def setError(error: Ptr[GError]): Unit =
    gtk_gl_area_set_error(this.raw.asInstanceOf, error)

  def setHasDepthBuffer(has_depth_buffer: Boolean): Unit =
    gtk_gl_area_set_has_depth_buffer(
      this.raw.asInstanceOf,
      gboolean(gint((if has_depth_buffer == true then 1 else 0)))
    )

  def setHasStencilBuffer(has_stencil_buffer: Boolean): Unit =
    gtk_gl_area_set_has_stencil_buffer(
      this.raw.asInstanceOf,
      gboolean(gint((if has_stencil_buffer == true then 1 else 0)))
    )

  def setRequiredVersion(major: Int, minor: Int): Unit =
    gtk_gl_area_set_required_version(this.raw.asInstanceOf, major, minor)

  def setUseEs(use_es: Boolean): Unit = gtk_gl_area_set_use_es(
    this.raw.asInstanceOf,
    gboolean(gint((if use_es == true then 1 else 0)))
  )

end GLArea

object GLArea:
  def apply(): GLArea = new GLArea(gtk_gl_area_new().asInstanceOf)
end GLArea
