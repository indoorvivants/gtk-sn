package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.pango.internal.PangoRendererClass

/** Class structure for `PangoRenderer`.
  *
  * The following vfuncs take user space coordinates in Pango units and have
  * default implementations:
  *   - draw_glyphs
  *   - draw_rectangle
  *   - draw_error_underline
  *   - draw_shape
  *   - draw_glyph_item
  *
  * The default draw_shape implementation draws nothing.
  *
  * The following vfuncs take device space coordinates as doubles and must be
  * implemented:
  *   - draw_trapezoid
  *   - draw_glyph
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class RendererClass private[gnome] (raw: Ptr[PangoRendererClass]):

  def getUnsafeRawPointer(): Ptr[PangoRendererClass] = this.raw

  @annotation.compileTimeOnly("[field draw_glyphs]: Field is missing <type>")
  private def drawGlyphs__ = ???
  @annotation.compileTimeOnly("[field draw_rectangle]: Field is missing <type>")
  private def drawRectangle__ = ???
  @annotation.compileTimeOnly(
    "[field draw_error_underline]: Field is missing <type>"
  )
  private def drawErrorUnderline__ = ???
  @annotation.compileTimeOnly("[field draw_shape]: Field is missing <type>")
  private def drawShape__ = ???
  @annotation.compileTimeOnly("[field draw_trapezoid]: Field is missing <type>")
  private def drawTrapezoid__ = ???
  @annotation.compileTimeOnly("[field draw_glyph]: Field is missing <type>")
  private def drawGlyph__ = ???
  @annotation.compileTimeOnly("[field part_changed]: Field is missing <type>")
  private def partChanged__ = ???
  @annotation.compileTimeOnly("[field begin]: Field is missing <type>")
  private def begin__ = ???
  @annotation.compileTimeOnly("[field end]: Field is missing <type>")
  private def end__ = ???
  @annotation.compileTimeOnly("[field prepare_run]: Field is missing <type>")
  private def prepareRun__ = ???
  @annotation.compileTimeOnly(
    "[field draw_glyph_item]: Field is missing <type>"
  )
  private def drawGlyphItem__ = ???
  @annotation.compileTimeOnly(
    "[field _pango_reserved2]: Field is missing <type>"
  )
  private def PangoReserved2__ = ???
  @annotation.compileTimeOnly(
    "[field _pango_reserved3]: Field is missing <type>"
  )
  private def PangoReserved3__ = ???
  @annotation.compileTimeOnly(
    "[field _pango_reserved4]: Field is missing <type>"
  )
  private def PangoReserved4__ = ???
end RendererClass

object RendererClass:
  def fromRaw(ptr: Ptr[PangoRendererClass]): RendererClass = new RendererClass(
    ptr
  )
end RendererClass
