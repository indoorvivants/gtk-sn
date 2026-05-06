package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.{
  CairoContext,
  Cursor,
  Device,
  Display,
  Event,
  FrameClock,
  GLContext,
  Monitor,
  Surface,
  VulkanContext
}
import sn.gnome.gdk4.internal.{GdkEvent, GdkMonitor, GdkSurface}
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*

/** A `GdkSurface` is a rectangular region on the screen.
  *
  * It’s a low-level object, used to implement high-level objects such as
  * [class@Gtk.Window] or [class@Gtk.Dialog] in GTK.
  *
  * The surfaces you see in practice are either [iface@Gdk.Toplevel] or
  * [iface@Gdk.Popup], and those interfaces provide much of the required API to
  * interact with these surfaces. Other, more specialized surface types exist,
  * but you will rarely interact with them directly.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Surface(raw: Ptr[GdkSurface]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Emits a short beep associated to @surface.
    *
    * If the display of @surface does not support per-surface beeps, emits a
    * short beep on the display just as [method@Gdk.Display.beep].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def beep(): Unit /* None */ = gdk_surface_beep(
    this.raw.asInstanceOf[Ptr[GdkSurface]]
  )

  /** Creates a new `GdkCairoContext` for rendering on @surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def createCairoContext(): CairoContext /* None */ = new CairoContext(
    gdk_surface_create_cairo_context(
      this.raw.asInstanceOf[Ptr[GdkSurface]]
    ).asInstanceOf
  )

  /** Creates a new `GdkGLContext` for the `GdkSurface`.
    *
    * The context is disconnected from any particular surface or surface. If the
    * creation of the `GdkGLContext` failed, @error will be set. Before using
    * the returned `GdkGLContext`, you will need to call
    * [method@Gdk.GLContext.make_current] or [method@Gdk.GLContext.realize].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def createGlContext(): GResult[GLContext /* None */ ] =
    GResult.wrap(__errorPtr =>
      new GLContext(
        gdk_surface_create_gl_context(
          this.raw.asInstanceOf[Ptr[GdkSurface]],
          __errorPtr
        ).asInstanceOf
      )
    )

  /** Create a new Cairo surface that is as compatible as possible with the
    * given @surface.
    *
    * For example the new surface will have the same fallback resolution and
    * font options as @surface. Generally, the new surface will also use the
    * same backend as @surface, unless that is not possible for some reason. The
    * type of the returned surface may be examined with
    * cairo_surface_get_type().
    *
    * Initially the surface contents are all 0 (transparent if contents have
    * transparency, black otherwise.)
    *
    * This function always returns a valid pointer, but it will return a pointer
    * to a “nil” surface if @other is already in an error state or any other
    * error occurs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method create_similar_surface/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Surface), @type -> DataRecord(cairo_surface_t*)))"
  )
  private def createSimilarSurface__ = ???

  /** Creates a new `GdkVulkanContext` for rendering on @surface.
    *
    * If the creation of the `GdkVulkanContext` failed, @error will be set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def createVulkanContext(): GResult[VulkanContext /* None */ ] =
    GResult.wrap(__errorPtr =>
      new VulkanContext(
        gdk_surface_create_vulkan_context(
          this.raw.asInstanceOf[Ptr[GdkSurface]],
          __errorPtr
        ).asInstanceOf
      )
    )

  /** Destroys the window system resources associated with @surface and
    * decrements @surface's reference count.
    *
    * The window system resources for all children of @surface are also
    * destroyed, but the children’s reference counts are not decremented.
    *
    * Note that a surface will not be destroyed automatically when its reference
    * count reaches zero. You must call this function yourself before that
    * happens.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def destroy(): Unit /* None */ = gdk_surface_destroy(
    this.raw.asInstanceOf[Ptr[GdkSurface]]
  )

  /** Retrieves a `GdkCursor` pointer for the cursor currently set on the
    * `GdkSurface`.
    *
    * If the return value is %NULL then there is no custom cursor set on the
    * surface, and it is using the cursor for its parent surface.
    *
    * Use [method@Gdk.Surface.set_cursor] to unset the cursor of the surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCursor(): Cursor /* None */ = new Cursor(
    gdk_surface_get_cursor(this.raw.asInstanceOf[Ptr[GdkSurface]]).asInstanceOf
  )

  /** Retrieves a `GdkCursor` pointer for the @device currently set on the
    * specified `GdkSurface`.
    *
    * If the return value is %NULL then there is no custom cursor set on the
    * specified surface, and it is using the cursor for its parent surface.
    *
    * Use [method@Gdk.Surface.set_cursor] to unset the cursor of the surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDeviceCursor(
      device: Device /* Some(Ptr[GdkDevice]) */
  ): Cursor /* None */ = new Cursor(
    gdk_surface_get_device_cursor(
      this.raw.asInstanceOf[Ptr[GdkSurface]],
      device.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** Obtains the current device position and modifier state.
    *
    * The position is given in coordinates relative to the upper left corner of @surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_device_position]: Method get_device_position contains an OUT parameter, which is not supported yet"
  )
  private def getDevicePosition__ = ???

  /** Gets the `GdkDisplay` associated with a `GdkSurface`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDisplay(): Display /* None */ = new Display(
    gdk_surface_get_display(this.raw.asInstanceOf[Ptr[GdkSurface]]).asInstanceOf
  )

  /** Gets the frame clock for the surface.
    *
    * The frame clock for a surface never changes unless the surface is
    * reparented to a new toplevel surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFrameClock(): FrameClock /* None */ = new FrameClock(
    gdk_surface_get_frame_clock(
      this.raw.asInstanceOf[Ptr[GdkSurface]]
    ).asInstanceOf
  )

  /** Returns the height of the given @surface.
    *
    * Surface size is reported in ”application pixels”, not ”device pixels” (see
    * [method@Gdk.Surface.get_scale_factor]).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHeight(): Int /* None */ = gdk_surface_get_height(
    this.raw.asInstanceOf[Ptr[GdkSurface]]
  )

  /** Checks whether the surface has been mapped.
    *
    * A surface is mapped with [method@Gdk.Toplevel.present] or
    * [method@Gdk.Popup.present].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMapped(): Boolean /* None */ =
    gdk_surface_get_mapped(this.raw.asInstanceOf[Ptr[GdkSurface]]).value.!=(0)

  /** Returns the internal scale that maps from surface coordinates to the
    * actual device pixels.
    *
    * When the scale is bigger than 1, the windowing system prefers to get
    * buffers with a resolution that is bigger than the surface size (e.g. to
    * show the surface on a high-resolution display, or in a magnifier).
    *
    * Compare with [method@Gdk.Surface.get_scale_factor], which returns the next
    * larger integer.
    *
    * The scale may change during the lifetime of the surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getScale(): Double /* None */ = gdk_surface_get_scale(
    this.raw.asInstanceOf[Ptr[GdkSurface]]
  )

  /** Returns the internal scale factor that maps from surface coordinates to
    * the actual device pixels.
    *
    * On traditional systems this is 1, but on very high density outputs this
    * can be a higher value (often 2). A higher value means that drawing is
    * automatically scaled up to a higher resolution, so any code doing drawing
    * will automatically look nicer. However, if you are supplying pixel-based
    * data the scale value can be used to determine whether to use a pixel
    * resource with higher resolution data.
    *
    * The scale factor may change during the lifetime of the surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getScaleFactor(): Int /* None */ = gdk_surface_get_scale_factor(
    this.raw.asInstanceOf[Ptr[GdkSurface]]
  )

  /** Returns the width of the given @surface.
    *
    * Surface size is reported in ”application pixels”, not ”device pixels” (see
    * [method@Gdk.Surface.get_scale_factor]).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWidth(): Int /* None */ = gdk_surface_get_width(
    this.raw.asInstanceOf[Ptr[GdkSurface]]
  )

  /** Hide the surface.
    *
    * For toplevel surfaces, withdraws them, so they will no longer be known to
    * the window manager; for all surfaces, unmaps them, so they won’t be
    * displayed. Normally done automatically as part of
    * [method@Gtk.Widget.hide].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hide(): Unit /* None */ = gdk_surface_hide(
    this.raw.asInstanceOf[Ptr[GdkSurface]]
  )

  /** Check to see if a surface is destroyed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isDestroyed(): Boolean /* None */ =
    gdk_surface_is_destroyed(this.raw.asInstanceOf[Ptr[GdkSurface]]).value.!=(0)

  /** Forces a [signal@Gdk.Surface::render] signal emission for @surface to be
    * scheduled.
    *
    * This function is useful for implementations that track invalid regions on
    * their own.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def queueRender(): Unit /* None */ = gdk_surface_queue_render(
    this.raw.asInstanceOf[Ptr[GdkSurface]]
  )

  /** Request a layout phase from the surface's frame clock.
    *
    * See [method@Gdk.FrameClock.request_phase].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def requestLayout(): Unit /* None */ = gdk_surface_request_layout(
    this.raw.asInstanceOf[Ptr[GdkSurface]]
  )

  /** Sets the default mouse pointer for a `GdkSurface`.
    *
    * Passing %NULL for the @cursor argument means that @surface will use the
    * cursor of its parent surface. Most surfaces should use this default. Note
    * that @cursor must be for the same display as @surface.
    *
    * Use [ctor@Gdk.Cursor.new_from_name] or [ctor@Gdk.Cursor.new_from_texture]
    * to create the cursor. To make the cursor invisible, use %GDK_BLANK_CURSOR.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCursor(
      cursor: Option[Cursor /* Some(Ptr[GdkCursor]) */ ]
  ): Unit /* None */ = gdk_surface_set_cursor(
    this.raw.asInstanceOf[Ptr[GdkSurface]],
    cursor
      .map[Ptr[GdkCursor]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GdkCursor]])
  )

  /** Sets a specific `GdkCursor` for a given device when it gets inside @surface.
    *
    * Passing %NULL for the @cursor argument means that @surface will use the
    * cursor of its parent surface. Most surfaces should use this default.
    *
    * Use [ctor@Gdk.Cursor.new_from_name] or [ctor@Gdk.Cursor.new_from_texture]
    * to create the cursor. To make the cursor invisible, use %GDK_BLANK_CURSOR.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDeviceCursor(
      device: Device /* Some(Ptr[GdkDevice]) */,
      cursor: Cursor /* Some(Ptr[GdkCursor]) */
  ): Unit /* None */ = gdk_surface_set_device_cursor(
    this.raw.asInstanceOf[Ptr[GdkSurface]],
    device.getUnsafeRawPointer().asInstanceOf,
    cursor.getUnsafeRawPointer().asInstanceOf
  )

  /** Apply the region to the surface for the purpose of event handling.
    *
    * Mouse events which happen while the pointer position corresponds to an
    * unset bit in the mask will be passed on the surface below
    * @surface.
    *
    * An input region is typically used with RGBA surfaces. The alpha channel of
    * the surface defines which pixels are invisible and allows for nicely
    * antialiased borders, and the input region controls where the surface is
    * “clickable”.
    *
    * Use [method@Gdk.Display.supports_input_shapes] to find out if a particular
    * backend supports input regions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_input_region/<method parameters>/region]: Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Region), @type -> DataRecord(cairo_region_t*)))"
  )
  private def setInputRegion__ = ???

  /** Marks a region of the `GdkSurface` as opaque.
    *
    * For optimisation purposes, compositing window managers may like to not
    * draw obscured regions of surfaces, or turn off blending during for these
    * regions. With RGB windows with no transparency, this is just the shape of
    * the window, but with ARGB32 windows, the compositor does not know what
    * regions of the window are transparent or not.
    *
    * This function only works for toplevel surfaces.
    *
    * GTK will update this property automatically if the @surface background is
    * opaque, as we know where the opaque regions are. If your surface
    * background is not opaque, please update this property in your
    * [vfunc@Gtk.Widget.css_changed] handler.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_opaque_region/<method parameters>/region]: Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Region), @type -> DataRecord(cairo_region_t*)))"
  )
  private def setOpaqueRegion__ = ???

  /** Translates coordinates between two surfaces.
    *
    * Note that this only works if @to and @from are popups or transient-for to
    * the same toplevel (directly or indirectly).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method translate_coordinates]: Method translate_coordinates contains an INOUT parameter, which is not supported yet"
  )
  private def translateCoordinates__ = ???

  /** Emitted when @surface starts being present on the monitor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onEnterMonitor(handler: ((monitor: Monitor)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (monitor: Monitor), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GdkSurface],
          monitor: Ptr[GdkMonitor] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (monitor = sr.runtime.get[Monitor](monitor.asInstanceOf[Ptr[Byte]]))
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
    val signal = c"enter-monitor"
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
  end onEnterMonitor

  /** Emitted when GDK receives an input event for @surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onEvent(handler: ((event: Event)) => Boolean)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (event: Event), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GdkSurface],
          event: Ptr[GdkEvent] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (event = sr.runtime.get[Event](event.asInstanceOf[Ptr[Byte]]))
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
    val signal = c"event"
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
  end onEvent

  /** Emitted when the size of @surface is changed, or when relayout should be
    * performed.
    *
    * Surface size is reported in ”application pixels”, not ”device pixels” (see
    * gdk_surface_get_scale_factor()).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onLayout(handler: ((width: Int, height: Int)) => Unit)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (width: Int, height: Int), Unit]
    val c_handler = CFuncPtr4.fromScalaFunction {
      (
          self: Ptr[GdkSurface],
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
    val signal = c"layout"
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
  end onLayout

  /** Emitted when @surface stops being present on the monitor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onLeaveMonitor(handler: ((monitor: Monitor)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (monitor: Monitor), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GdkSurface],
          monitor: Ptr[GdkMonitor] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (monitor = sr.runtime.get[Monitor](monitor.asInstanceOf[Ptr[Byte]]))
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
    val signal = c"leave-monitor"
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
  end onLeaveMonitor

  /** Emitted when part of the surface needs to be redrawn.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal render]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(cairo.Region)))"
  )
  private def onRender = ???

end Surface

object Surface:
  /** Create a new popup surface.
    *
    * The surface will be attached to @parent and can be positioned relative to
    * it using [method@Gdk.Popup.present].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def popup(
      parent: Surface /* Some(Ptr[GdkSurface]) */,
      autohide: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Surface = new Surface(
    gdk_surface_new_popup(
      parent.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if autohide == true then 1 else 0)))
    ).asInstanceOf
  )

  /** Creates a new toplevel surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toplevel(display: Display /* Some(Ptr[GdkDisplay]) */ ): Surface =
    new Surface(
      gdk_surface_new_toplevel(
        display.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
end Surface
