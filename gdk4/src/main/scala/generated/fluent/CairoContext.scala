package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.DrawContext
import sn.gnome.gdk4.internal.GdkCairoContext

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GdkCairoContext` is an object representing the platform-specific draw
  * context.
  *
  * `GdkCairoContext`s are created for a surface using
  * [method@Gdk.Surface.create_cairo_context], and the context can then be used
  * to draw on that surface.
  */
class CairoContext(raw: Ptr[GdkCairoContext])
    extends DrawContext(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves a Cairo context to be used to draw on the `GdkSurface` of @context.
    *
    * A call to [method@Gdk.DrawContext.begin_frame] with this
    * @context
    *   must have been done or this function will return %NULL.
    *
    * The returned context is guaranteed to be valid until
    * [method@Gdk.DrawContext.end_frame] is called.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  def cairoCreate__ = ???

end CairoContext
