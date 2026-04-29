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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkGLArea` is a widget that allows drawing with OpenGL.
  *
  * ![An example GtkGLArea](glarea.png)
  *
  * `GtkGLArea` sets up its own [class@Gdk.GLContext], and creates a custom GL
  * framebuffer that the widget will do GL rendering onto. It also ensures that
  * this framebuffer is the default GL rendering target when rendering.
  *
  * In order to draw, you have to connect to the [signal@Gtk.GLArea::render]
  * signal, or subclass `GtkGLArea` and override the GtkGLAreaClass.render
  * virtual function.
  *
  * The `GtkGLArea` widget ensures that the `GdkGLContext` is associated with
  * the widget's drawing area, and it is kept updated when the size and position
  * of the drawing area changes.
  *
  * ## Drawing with GtkGLArea
  *
  * The simplest way to draw using OpenGL commands in a `GtkGLArea` is to create
  * a widget instance and connect to the [signal@Gtk.GLArea::render] signal:
  *
  * The `render()` function will be called when the `GtkGLArea` is ready for you
  * to draw its content:
  *
  * ```c
  * static gboolean
  * render (GtkGLArea *area, GdkGLContext *context)
  * {
  *   // inside this function it's safe to use GL; the given
  *   // GdkGLContext has been made current to the drawable
  *   // surface used by the `GtkGLArea` and the viewport has
  *   // already been set to be the size of the allocation
  *
  *   // we can start by clearing the buffer
  *   glClearColor (0, 0, 0, 0);
  *   glClear (GL_COLOR_BUFFER_BIT);
  *
  *   // draw your object
  *   // draw_an_object ();
  *
  *   // we completed our drawing; the draw commands will be
  *   // flushed at the end of the signal emission chain, and
  *   // the buffers will be drawn on the window
  *   return TRUE;
  * }
  *
  * void setup_glarea (void)
  * {
  *   // create a GtkGLArea instance
  *   GtkWidget *gl_area = gtk_gl_area_new ();
  *
  *   // connect to the "render" signal
  *   g_signal_connect (gl_area, "render", G_CALLBACK (render), NULL);
  * }
  * ```
  *
  * If you need to initialize OpenGL state, e.g. buffer objects or shaders, you
  * should use the [signal@Gtk.Widget::realize] signal; you can use the
  * [signal@Gtk.Widget::unrealize] signal to clean up. Since the `GdkGLContext`
  * creation and initialization may fail, you will need to check for errors,
  * using [method@Gtk.GLArea.get_error].
  *
  * An example of how to safely initialize the GL state is:
  *
  * ```c
  * static void
  * on_realize (GtkGLarea *area)
  * {
  *   // We need to make the context current if we want to
  *   // call GL API
  *   gtk_gl_area_make_current (area);
  *
  *   // If there were errors during the initialization or
  *   // when trying to make the context current, this
  *   // function will return a GError for you to catch
  *   if (gtk_gl_area_get_error (area) != NULL)
  *     return;
  *
  *   // You can also use gtk_gl_area_set_error() in order
  *   // to show eventual initialization errors on the
  *   // GtkGLArea widget itself
  *   GError *internal_error = NULL;
  *   init_buffer_objects (&error);
  *   if (error != NULL)
  *     {
  *       gtk_gl_area_set_error (area, error);
  *       g_error_free (error);
  *       return;
  *     }
  *
  *   init_shaders (&error);
  *   if (error != NULL)
  *     {
  *       gtk_gl_area_set_error (area, error);
  *       g_error_free (error);
  *       return;
  *     }
  * }
  * ```
  *
  * If you need to change the options for creating the `GdkGLContext` you should
  * use the [signal@Gtk.GLArea::create-context] signal.
  */
class GLArea(raw: Ptr[GtkGLArea])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Binds buffers to the framebuffer.
    *
    * Ensures that the @area framebuffer object is made the current draw and
    * read target, and that all the required buffers for the @area are created
    * and bound to the framebuffer.
    *
    * This function is automatically called before emitting the
    * [signal@Gtk.GLArea::render] signal, and doesn't normally need to be called
    * by application code.
    */
  def attachBuffers(): Unit = gtk_gl_area_attach_buffers(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the allowed APIs.
    *
    * See [method@Gtk.GLArea.set_allowed_apis].
    */
  def getAllowedApis(): GdkGLAPI = gtk_gl_area_get_allowed_apis(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the API that is currently in use.
    *
    * If the GL area has not been realized yet, 0 is returned.
    */
  def getApi(): GdkGLAPI = gtk_gl_area_get_api(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the area is in auto render mode or not.
    */
  def getAutoRender(): Boolean =
    gtk_gl_area_get_auto_render(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the `GdkGLContext` used by @area.
    */
  def getContext(): GLContext = new GLContext(
    gtk_gl_area_get_context(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the current error set on the @area.
    */
  def getError(): Ptr[GError] = gtk_gl_area_get_error(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the area has a depth buffer.
    */
  def getHasDepthBuffer(): Boolean =
    gtk_gl_area_get_has_depth_buffer(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the area has a stencil buffer.
    */
  def getHasStencilBuffer(): Boolean =
    gtk_gl_area_get_has_stencil_buffer(this.raw.asInstanceOf).value.!=(0)

  @annotation.compileTimeOnly(
    "Method get_required_version contains an OUT parameter, which is not supported yet"
  )
  def getRequiredVersion(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the `GtkGLArea` should use OpenGL ES.
    *
    * See [method@Gtk.GLArea.set_use_es].
    */
  def getUseEs(): Boolean =
    gtk_gl_area_get_use_es(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ensures that the `GdkGLContext` used by @area is associated with the
    * `GtkGLArea`.
    *
    * This function is automatically called before emitting the
    * [signal@Gtk.GLArea::render] signal, and doesn't normally need to be called
    * by application code.
    */
  def makeCurrent(): Unit = gtk_gl_area_make_current(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Marks the currently rendered data (if any) as invalid, and queues a redraw
    * of the widget.
    *
    * This ensures that the [signal@Gtk.GLArea::render] signal is emitted during
    * the draw.
    *
    * This is only needed when [method@Gtk.GLArea.set_auto_render] has been
    * called with a %FALSE value. The default behaviour is to emit
    * [signal@Gtk.GLArea::render] on each draw.
    */
  def queueRender(): Unit = gtk_gl_area_queue_render(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the allowed APIs to create a context with.
    *
    * You should check [property@Gtk.GLArea:api] before drawing with either API.
    *
    * By default, all APIs are allowed.
    */
  def setAllowedApis(apis: GdkGLAPI): Unit =
    gtk_gl_area_set_allowed_apis(this.raw.asInstanceOf, apis)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the `GtkGLArea` is in auto render mode.
    *
    * If @auto_render is %TRUE the [signal@Gtk.GLArea::render] signal will be
    * emitted every time the widget draws. This is the default and is useful if
    * drawing the widget is faster.
    *
    * If @auto_render is %FALSE the data from previous rendering is kept around
    * and will be used for drawing the widget the next time, unless the window
    * is resized. In order to force a rendering [method@Gtk.GLArea.queue_render]
    * must be called. This mode is useful when the scene changes seldom, but
    * takes a long time to redraw.
    */
  def setAutoRender(auto_render: Boolean): Unit = gtk_gl_area_set_auto_render(
    this.raw.asInstanceOf,
    gboolean(gint((if auto_render == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets an error on the area which will be shown instead of the GL rendering.
    *
    * This is useful in the [signal@Gtk.GLArea::create-context] signal if GL
    * context creation fails.
    */
  def setError(error: Ptr[GError]): Unit =
    gtk_gl_area_set_error(this.raw.asInstanceOf, error)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the `GtkGLArea` should use a depth buffer.
    *
    * If @has_depth_buffer is %TRUE the widget will allocate and enable a depth
    * buffer for the target framebuffer. Otherwise there will be none.
    */
  def setHasDepthBuffer(has_depth_buffer: Boolean): Unit =
    gtk_gl_area_set_has_depth_buffer(
      this.raw.asInstanceOf,
      gboolean(gint((if has_depth_buffer == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the `GtkGLArea` should use a stencil buffer.
    *
    * If @has_stencil_buffer is %TRUE the widget will allocate and enable a
    * stencil buffer for the target framebuffer. Otherwise there will be none.
    */
  def setHasStencilBuffer(has_stencil_buffer: Boolean): Unit =
    gtk_gl_area_set_has_stencil_buffer(
      this.raw.asInstanceOf,
      gboolean(gint((if has_stencil_buffer == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the required version of OpenGL to be used when creating the context
    * for the widget.
    *
    * This function must be called before the area has been realized.
    */
  def setRequiredVersion(major: Int, minor: Int): Unit =
    gtk_gl_area_set_required_version(this.raw.asInstanceOf, major, minor)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the @area should create an OpenGL or an OpenGL ES context.
    *
    * You should check the capabilities of the `GdkGLContext` before drawing
    * with either API.
    */
  def setUseEs(use_es: Boolean): Unit = gtk_gl_area_set_use_es(
    this.raw.asInstanceOf,
    gboolean(gint((if use_es == true then 1 else 0)))
  )

end GLArea

object GLArea:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkGLArea` widget.
    */
  def apply(): GLArea = new GLArea(gtk_gl_area_new().asInstanceOf)
end GLArea
