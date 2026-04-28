package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Display
import sn.gnome.gdk4.fluent.DrawContext
import sn.gnome.gdk4.fluent.GLContext
import sn.gnome.gdk4.fluent.Surface
import sn.gnome.gdk4.internal.GdkGLAPI
import sn.gnome.gdk4.internal.GdkGLContext
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint

class GLContext(raw: Ptr[GdkGLContext]) extends DrawContext(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAllowedApis(): GdkGLAPI = gdk_gl_context_get_allowed_apis(
    this.raw.asInstanceOf
  )

  def getApi(): GdkGLAPI = gdk_gl_context_get_api(this.raw.asInstanceOf)

  def getDebugEnabled(): Boolean =
    gdk_gl_context_get_debug_enabled(this.raw.asInstanceOf).value.!=(0)

  override def getDisplay(): Display = new Display(
    gdk_gl_context_get_display(this.raw.asInstanceOf).asInstanceOf
  )

  def getForwardCompatible(): Boolean =
    gdk_gl_context_get_forward_compatible(this.raw.asInstanceOf).value.!=(0)

  // Method get_required_version contains an OUT parameter, which is not supported yet

  def getSharedContext(): GLContext = new GLContext(
    gdk_gl_context_get_shared_context(this.raw.asInstanceOf).asInstanceOf
  )

  override def getSurface(): Surface = new Surface(
    gdk_gl_context_get_surface(this.raw.asInstanceOf).asInstanceOf
  )

  def getUseEs(): Boolean =
    gdk_gl_context_get_use_es(this.raw.asInstanceOf).value.!=(0)

  // Method get_version contains an OUT parameter, which is not supported yet

  def isLegacy(): Boolean =
    gdk_gl_context_is_legacy(this.raw.asInstanceOf).value.!=(0)

  def isShared(other: GLContext): Boolean = gdk_gl_context_is_shared(
    this.raw.asInstanceOf,
    other.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def makeCurrent(): Unit = gdk_gl_context_make_current(this.raw.asInstanceOf)

  def realize(): GResult[Boolean] = GResult.wrap(__errorPtr =>
    gdk_gl_context_realize(this.raw.asInstanceOf, __errorPtr).value.!=(0)
  )

  def setAllowedApis(apis: GdkGLAPI): Unit =
    gdk_gl_context_set_allowed_apis(this.raw.asInstanceOf, apis)

  def setDebugEnabled(enabled: Boolean): Unit =
    gdk_gl_context_set_debug_enabled(
      this.raw.asInstanceOf,
      gboolean(gint((if enabled == true then 1 else 0)))
    )

  def setForwardCompatible(compatible: Boolean): Unit =
    gdk_gl_context_set_forward_compatible(
      this.raw.asInstanceOf,
      gboolean(gint((if compatible == true then 1 else 0)))
    )

  def setRequiredVersion(major: Int, minor: Int): Unit =
    gdk_gl_context_set_required_version(this.raw.asInstanceOf, major, minor)

  def setUseEs(use_es: Int): Unit =
    gdk_gl_context_set_use_es(this.raw.asInstanceOf, use_es)

end GLContext
