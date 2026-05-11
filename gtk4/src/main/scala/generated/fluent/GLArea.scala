package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.{GLAPI, GLContext}
import sn.gnome.gdk4.internal.GdkGLContext
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{Accessible, Buildable, ConstraintTarget, Widget}
import sn.gnome.gtk4.internal.GtkGLArea
import sn.gnome.runtime.*

/** `GtkGLArea` is a widget that allows drawing with OpenGL.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class GLArea private[gnome] (raw: Ptr[GtkGLArea])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Binds buffers to the framebuffer.
    *
    * Ensures that the @area framebuffer object is made the current draw and
    * read target, and that all the required buffers for the @area are created
    * and bound to the framebuffer.
    *
    * This function is automatically called before emitting the
    * [signal@Gtk.GLArea::render] signal, and doesn't normally need to be called
    * by application code.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attachBuffers(): Unit /* None */ =
    gtk_gl_area_attach_buffers(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGLArea]]
    )
  end attachBuffers

  /** Gets the allowed APIs.
    *
    * See [method@Gtk.GLArea.set_allowed_apis].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAllowedApis(): GLAPI /* None */ =
    GLAPI.fromRaw(
      gtk_gl_area_get_allowed_apis(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGLArea]]
      )
    )
  end getAllowedApis

  /** Gets the API that is currently in use.
    *
    * If the GL area has not been realized yet, 0 is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getApi(): GLAPI /* None */ =
    GLAPI.fromRaw(
      gtk_gl_area_get_api(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGLArea]]
      )
    )
  end getApi

  /** Returns whether the area is in auto render mode or not.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAutoRender(): Boolean /* None */ =
    gtk_gl_area_get_auto_render(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGLArea]]
    ).value.!=(0)
  end getAutoRender

  /** Retrieves the `GdkGLContext` used by @area.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getContext()(using Runtime): sn.gnome.gdk4.fluent.GLContext /* None */ =
    sn.gnome.gdk4.fluent.GLContext.applyUnsafe(
      gtk_gl_area_get_context(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGLArea]]
      ).asInstanceOf
    )
  end getContext

  /** Gets the current error set on the @area.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_error/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(GError*)))"
  )
  private def getError__ = ???

  /** Returns whether the area has a depth buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHasDepthBuffer(): Boolean /* None */ =
    gtk_gl_area_get_has_depth_buffer(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGLArea]]
    ).value.!=(0)
  end getHasDepthBuffer

  /** Returns whether the area has a stencil buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHasStencilBuffer(): Boolean /* None */ =
    gtk_gl_area_get_has_stencil_buffer(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGLArea]]
    ).value.!=(0)
  end getHasStencilBuffer

  /** Retrieves the required version of OpenGL.
    *
    * See [method@Gtk.GLArea.set_required_version].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_required_version]: Method get_required_version contains an OUT parameter, which is not supported yet"
  )
  private def getRequiredVersion__ = ???

  /** Returns whether the `GtkGLArea` should use OpenGL ES.
    *
    * See [method@Gtk.GLArea.set_use_es].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUseEs(): Boolean /* None */ =
    gtk_gl_area_get_use_es(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGLArea]]
    ).value.!=(0)
  end getUseEs

  /** Ensures that the `GdkGLContext` used by @area is associated with the
    * `GtkGLArea`.
    *
    * This function is automatically called before emitting the
    * [signal@Gtk.GLArea::render] signal, and doesn't normally need to be called
    * by application code.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def makeCurrent(): Unit /* None */ =
    gtk_gl_area_make_current(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGLArea]]
    )
  end makeCurrent

  /** Marks the currently rendered data (if any) as invalid, and queues a redraw
    * of the widget.
    *
    * This ensures that the [signal@Gtk.GLArea::render] signal is emitted during
    * the draw.
    *
    * This is only needed when [method@Gtk.GLArea.set_auto_render] has been
    * called with a %FALSE value. The default behaviour is to emit
    * [signal@Gtk.GLArea::render] on each draw.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def queueRender(): Unit /* None */ =
    gtk_gl_area_queue_render(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGLArea]]
    )
  end queueRender

  /** Sets the allowed APIs to create a context with.
    *
    * You should check [property@Gtk.GLArea:api] before drawing with either API.
    *
    * By default, all APIs are allowed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAllowedApis(
      apis: GLAPI /* Some(_root_.sn.gnome.gdk4.internal.GdkGLAPI) */
  ): Unit /* None */ =
    gtk_gl_area_set_allowed_apis(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGLArea]],
      apis.raw
    )
  end setAllowedApis

  /** Sets whether the `GtkGLArea` is in auto render mode.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAutoRender(
      auto_render: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_gl_area_set_auto_render(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGLArea]],
      gboolean(gint((if auto_render == true then 1 else 0)))
    )
  end setAutoRender

  /** Sets an error on the area which will be shown instead of the GL rendering.
    *
    * This is useful in the [signal@Gtk.GLArea::create-context] signal if GL
    * context creation fails.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_error/<method parameters>/error]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(const GError*)))"
  )
  private def setError__ = ???

  /** Sets whether the `GtkGLArea` should use a depth buffer.
    *
    * If @has_depth_buffer is %TRUE the widget will allocate and enable a depth
    * buffer for the target framebuffer. Otherwise there will be none.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHasDepthBuffer(
      has_depth_buffer: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_gl_area_set_has_depth_buffer(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGLArea]],
      gboolean(gint((if has_depth_buffer == true then 1 else 0)))
    )
  end setHasDepthBuffer

  /** Sets whether the `GtkGLArea` should use a stencil buffer.
    *
    * If @has_stencil_buffer is %TRUE the widget will allocate and enable a
    * stencil buffer for the target framebuffer. Otherwise there will be none.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHasStencilBuffer(
      has_stencil_buffer: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_gl_area_set_has_stencil_buffer(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGLArea]],
      gboolean(gint((if has_stencil_buffer == true then 1 else 0)))
    )
  end setHasStencilBuffer

  /** Sets the required version of OpenGL to be used when creating the context
    * for the widget.
    *
    * This function must be called before the area has been realized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRequiredVersion(
      major: Int /* Some(CInt) */,
      minor: Int /* Some(CInt) */
  ): Unit /* None */ =
    gtk_gl_area_set_required_version(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGLArea]],
      major,
      minor
    )
  end setRequiredVersion

  /** Sets whether the @area should create an OpenGL or an OpenGL ES context.
    *
    * You should check the capabilities of the `GdkGLContext` before drawing
    * with either API.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUseEs(
      use_es: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_gl_area_set_use_es(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGLArea]],
      gboolean(gint((if use_es == true then 1 else 0)))
    )
  end setUseEs

  /** Emitted when the widget is being realized.
    *
    * This allows you to override how the GL context is created. This is useful
    * when you want to reuse an existing GL context, or if you want to try
    * creating different kinds of GL options.
    *
    * If context creation fails then the signal handler can use
    * [method@Gtk.GLArea.set_error] to register a more detailed error of how the
    * construction failed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onCreateContext(handler: => GLContext)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, EmptyTuple.type, GLContext]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkGLArea],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"create-context"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onCreateContext

  /** Emitted every time the contents of the `GtkGLArea` should be redrawn.
    *
    * The @context is bound to the @area prior to emitting this function, and
    * the buffers are painted to the window once the emission terminates.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onRender(handler: ((context: GLContext)) => Boolean)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (context: GLContext), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkGLArea],
          context: Ptr[GdkGLContext] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (context = sr.runtime.get[GLContext](context.asInstanceOf[Ptr[Byte]]))
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"render"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onRender

  /** Emitted once when the widget is realized, and then each time the widget is
    * changed while realized.
    *
    * This is useful in order to keep GL state up to date with the widget size,
    * like for instance camera properties which may depend on the width/height
    * ratio.
    *
    * The GL context for the area is guaranteed to be current when this signal
    * is emitted.
    *
    * The default handler sets up the GL viewport.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onResize(handler: ((width: Int, height: Int)) => Unit)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (width: Int, height: Int), Unit]
    val c_handler = CFuncPtr4.fromScalaFunction {
      (
          self: Ptr[GtkGLArea],
          width: Int /* param */,
          height: Int /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((width = width, height = height))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"resize"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onResize
end GLArea

object GLArea:
  def applyUnsafe(ptr: Ptr[GtkGLArea])(using Runtime) = summon[Runtime]
    .getOrCreate[GLArea](ptr.asInstanceOf[Ptr[Byte]], p => new GLArea(ptr))

  /** Creates a new `GtkGLArea` widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): GLArea =
    val raw: Ptr[Byte] = gtk_gl_area_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[GLArea](raw, r => GLArea.applyUnsafe(r.asInstanceOf))
  end apply
end GLArea
