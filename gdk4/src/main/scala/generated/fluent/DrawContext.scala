package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.{Display, Surface}
import sn.gnome.gdk4.internal.GdkDrawContext
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** Base class for objects implementing different rendering methods.
  *
  * `GdkDrawContext` is the base object used by contexts implementing different
  * rendering methods, such as [class@Gdk.CairoContext] or
  * [class@Gdk.GLContext]. It provides shared functionality between those
  * contexts.
  *
  * You will always interact with one of those subclasses.
  *
  * A `GdkDrawContext` is always associated with a single toplevel surface.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DrawContext private[gnome] (raw: Ptr[GdkDrawContext])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Indicates that you are beginning the process of redrawing @region on the @context's
    * surface.
    *
    * Calling this function begins a drawing operation using @context on the
    * surface that @context was created from. The actual requirements and
    * guarantees for the drawing operation vary for different implementations of
    * drawing, so a [class@Gdk.CairoContext] and a [class@Gdk.GLContext] need to
    * be treated differently.
    *
    * A call to this function is a requirement for drawing and must be followed
    * by a call to [method@Gdk.DrawContext.end_frame], which will complete the
    * drawing operation and ensure the contents become visible on screen.
    *
    * Note that the @region passed to this function is the minimum region that
    * needs to be drawn and depending on implementation, windowing system and
    * hardware in use, it might be necessary to draw a larger region. Drawing
    * implementation must use [method@Gdk.DrawContext.get_frame_region] to query
    * the region that must be drawn.
    *
    * When using GTK, the widget system automatically places calls to
    * gdk_draw_context_begin_frame() and gdk_draw_context_end_frame() via the
    * use of [class@Gsk.Renderer]s, so application code does not need to call
    * these functions explicitly.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method begin_frame/<method parameters>/region]: Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Region), @type -> DataRecord(const cairo_region_t*)))"
  )
  private def beginFrame__ = ???

  /** Ends a drawing operation started with gdk_draw_context_begin_frame().
    *
    * This makes the drawing available on screen. See
    * [method@Gdk.DrawContext.begin_frame] for more details about drawing.
    *
    * When using a [class@Gdk.GLContext], this function may call `glFlush()`
    * implicitly before returning; it is not recommended to call `glFlush()`
    * explicitly before calling this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def endFrame(): Unit /* None */ =
    gdk_draw_context_end_frame(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDrawContext]]
    )
  end endFrame

  /** Retrieves the `GdkDisplay` the @context is created for
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDisplay()(using Runtime): sn.gnome.gdk4.Display /* None */ =
    sn.gnome.gdk4.Display.applyUnsafe(
      gdk_draw_context_get_display(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDrawContext]]
      ).asInstanceOf
    )
  end getDisplay

  /** Retrieves the region that is currently being repainted.
    *
    * After a call to [method@Gdk.DrawContext.begin_frame] this function will
    * return a union of the region passed to that function and the area of the
    * surface that the @context determined needs to be repainted.
    *
    * If @context is not in between calls to
    * [method@Gdk.DrawContext.begin_frame] and
    * [method@Gdk.DrawContext.end_frame], %NULL will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_frame_region/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Region), @type -> DataRecord(const cairo_region_t*)))"
  )
  private def getFrameRegion__ = ???

  /** Retrieves the surface that @context is bound to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSurface()(using Runtime): sn.gnome.gdk4.Surface /* None */ =
    sn.gnome.gdk4.Surface.applyUnsafe(
      gdk_draw_context_get_surface(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDrawContext]]
      ).asInstanceOf
    )
  end getSurface

  /** Returns %TRUE if @context is in the process of drawing to its surface.
    *
    * This is the case between calls to [method@Gdk.DrawContext.begin_frame] and
    * [method@Gdk.DrawContext.end_frame]. In this situation, drawing commands
    * may be effecting the contents of the @context's surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isInFrame(): Boolean /* None */ =
    gdk_draw_context_is_in_frame(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDrawContext]]
    ).value.!=(0)
  end isInFrame

end DrawContext

object DrawContext:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkDrawContext])(using Runtime) =
    summon[Runtime].getOrCreate[DrawContext](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new DrawContext(ptr)
    )

end DrawContext
