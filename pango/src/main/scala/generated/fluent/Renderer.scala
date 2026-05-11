package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint16
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.pango.fluent.{Layout, RenderPart}
import sn.gnome.pango.internal.PangoRenderer

/** `PangoRenderer` is a base class for objects that can render text provided as
  * `PangoGlyphString` or `PangoLayout`.
  *
  * By subclassing `PangoRenderer` and overriding operations such as
  * @draw_glyphs
  *   and @draw_rectangle, renderers for particular font backends and
  *   destinations can be created.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Renderer private[gnome] (raw: Ptr[PangoRenderer])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Does initial setup before rendering operations on @renderer.
    *
    * [method@Pango.Renderer.deactivate] should be called when done drawing.
    * Calls such as [method@Pango.Renderer.draw_layout] automatically activate
    * the layout before drawing on it.
    *
    * Calls to [method@Pango.Renderer.activate] and
    * [method@Pango.Renderer.deactivate] can be nested and the renderer will
    * only be initialized and deinitialized once.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def activate(): Unit /* None */ =
    pango_renderer_activate(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoRenderer]]
    )
  end activate

  /** Cleans up after rendering operations on @renderer.
    *
    * See docs for [method@Pango.Renderer.activate].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def deactivate(): Unit /* None */ =
    pango_renderer_deactivate(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoRenderer]]
    )
  end deactivate

  /** Draw a squiggly line that approximately covers the given rectangle in the
    * style of an underline used to indicate a spelling error.
    *
    * The width of the underline is rounded to an integer number of up/down
    * segments and the resulting rectangle is centered in the original
    * rectangle.
    *
    * This should be called while @renderer is already active. Use
    * [method@Pango.Renderer.activate] to activate a renderer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def drawErrorUnderline(
      x: Int /* Some(CInt) */,
      y: Int /* Some(CInt) */,
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  ): Unit /* None */ =
    pango_renderer_draw_error_underline(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoRenderer]],
      x,
      y,
      width,
      height
    )
  end drawErrorUnderline

  /** Draws a single glyph with coordinates in device space.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method draw_glyph/<method parameters>/glyph]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Glyph), @type -> DataRecord(PangoGlyph)))"
  )
  private def drawGlyph__ = ???

  /** Draws the glyphs in @glyph_item with the specified `PangoRenderer`,
    * embedding the text associated with the glyphs in the output if the output
    * format supports it.
    *
    * This is useful for rendering text in PDF.
    *
    * Note that this method does not handle attributes in @glyph_item. If you
    * want colors, shapes and lines handled automatically according to those
    * attributes, you need to use pango_renderer_draw_layout_line() or
    * pango_renderer_draw_layout().
    *
    * Note that @text is the start of the text for layout, which is then indexed
    * by `glyph_item->item->offset`.
    *
    * If @text is %NULL, this simply calls [method@Pango.Renderer.draw_glyphs].
    *
    * The default implementation of this method simply falls back to
    * [method@Pango.Renderer.draw_glyphs].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method draw_glyph_item/<method parameters>/glyph_item]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GlyphItem), @type -> DataRecord(PangoGlyphItem*)))"
  )
  private def drawGlyphItem__ = ???

  /** Draws the glyphs in @glyphs with the specified `PangoRenderer`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method draw_glyphs/<method parameters>/glyphs]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GlyphString), @type -> DataRecord(PangoGlyphString*)))"
  )
  private def drawGlyphs__ = ???

  /** Draws @layout with the specified `PangoRenderer`.
    *
    * This is equivalent to drawing the lines of the layout, at their respective
    * positions relative to @x, @y.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def drawLayout(
      layout: sn.gnome.pango.fluent.Layout /* Some(Ptr[PangoLayout]) */,
      x: Int /* Some(CInt) */,
      y: Int /* Some(CInt) */
  )(using Runtime): Unit /* None */ =
    pango_renderer_draw_layout(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoRenderer]],
      layout.getUnsafeRawPointer().asInstanceOf,
      x,
      y
    )
  end drawLayout

  /** Draws @line with the specified `PangoRenderer`.
    *
    * This draws the glyph items that make up the line, as well as shapes,
    * backgrounds and lines that are specified by the attributes of those items.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method draw_layout_line/<method parameters>/line]: Cannot render type Type(List(),ListMap(@name -> DataRecord(LayoutLine), @type -> DataRecord(PangoLayoutLine*)))"
  )
  private def drawLayoutLine__ = ???

  /** Draws an axis-aligned rectangle in user space coordinates with the
    * specified `PangoRenderer`.
    *
    * This should be called while @renderer is already active. Use
    * [method@Pango.Renderer.activate] to activate a renderer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def drawRectangle(
      part: RenderPart /* Some(PangoRenderPart) */,
      x: Int /* Some(CInt) */,
      y: Int /* Some(CInt) */,
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  ): Unit /* None */ =
    pango_renderer_draw_rectangle(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoRenderer]],
      part.raw,
      x,
      y,
      width,
      height
    )
  end drawRectangle

  /** Draws a trapezoid with the parallel sides aligned with the X axis using
    * the given `PangoRenderer`; coordinates are in device space.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def drawTrapezoid(
      part: RenderPart /* Some(PangoRenderPart) */,
      `y1_`: Double /* Some(Double) */,
      x11: Double /* Some(Double) */,
      x21: Double /* Some(Double) */,
      y2: Double /* Some(Double) */,
      x12: Double /* Some(Double) */,
      x22: Double /* Some(Double) */
  ): Unit /* None */ =
    pango_renderer_draw_trapezoid(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoRenderer]],
      part.raw,
      `y1_`,
      x11,
      x21,
      y2,
      x12,
      x22
    )
  end drawTrapezoid

  /** Gets the current alpha for the specified part.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAlpha(
      part: RenderPart /* Some(PangoRenderPart) */
  ): UShort /* None */ =
    pango_renderer_get_alpha(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoRenderer]],
      part.raw
    ).value
  end getAlpha

  /** Gets the current rendering color for the specified part.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_color/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Color), @type -> DataRecord(PangoColor*)))"
  )
  private def getColor__ = ???

  /** Gets the layout currently being rendered using @renderer.
    *
    * Calling this function only makes sense from inside a subclass's methods,
    * like in its draw_shape vfunc, for example.
    *
    * The returned layout should not be modified while still being rendered.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLayout()(using Runtime): sn.gnome.pango.fluent.Layout /* None */ =
    sn.gnome.pango.fluent.Layout.applyUnsafe(
      pango_renderer_get_layout(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoRenderer]]
      ).asInstanceOf
    )
  end getLayout

  /** Gets the layout line currently being rendered using @renderer.
    *
    * Calling this function only makes sense from inside a subclass's methods,
    * like in its draw_shape vfunc, for example.
    *
    * The returned layout line should not be modified while still being
    * rendered.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_layout_line/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(LayoutLine), @type -> DataRecord(PangoLayoutLine*)))"
  )
  private def getLayoutLine__ = ???

  /** Gets the transformation matrix that will be applied when rendering.
    *
    * See [method@Pango.Renderer.set_matrix].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_matrix/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Matrix), @type -> DataRecord(const PangoMatrix*)))"
  )
  private def getMatrix__ = ???

  /** Informs Pango that the way that the rendering is done for @part has
    * changed.
    *
    * This should be called if the rendering changes in a way that would prevent
    * multiple pieces being joined together into one drawing call. For instance,
    * if a subclass of `PangoRenderer` was to add a stipple option for drawing
    * underlines, it needs to call
    *
    * ```
    * pango_renderer_part_changed (render, PANGO_RENDER_PART_UNDERLINE);
    * ```
    *
    * When the stipple changes or underlines with different stipples might be
    * joined together. Pango automatically calls this for changes to colors.
    * (See [method@Pango.Renderer.set_color])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def partChanged(
      part: RenderPart /* Some(PangoRenderPart) */
  ): Unit /* None */ =
    pango_renderer_part_changed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoRenderer]],
      part.raw
    )
  end partChanged

  /** Sets the alpha for part of the rendering.
    *
    * Note that the alpha may only be used if a color is specified for @part as
    * well.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAlpha(
      part: RenderPart /* Some(PangoRenderPart) */,
      alpha: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */
  ): Unit /* None */ =
    pango_renderer_set_alpha(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoRenderer]],
      part.raw,
      guint16(alpha)
    )
  end setAlpha

  /** Sets the color for part of the rendering.
    *
    * Also see [method@Pango.Renderer.set_alpha].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_color/<method parameters>/color]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Color), @type -> DataRecord(const PangoColor*)))"
  )
  private def setColor__ = ???

  /** Sets the transformation matrix that will be applied when rendering.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_matrix/<method parameters>/matrix]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Matrix), @type -> DataRecord(const PangoMatrix*)))"
  )
  private def setMatrix__ = ???

end Renderer

object Renderer:
  def applyUnsafe(ptr: Ptr[PangoRenderer])(using Runtime) = summon[Runtime]
    .getOrCreate[Renderer](ptr.asInstanceOf[Ptr[Byte]], p => new Renderer(ptr))

end Renderer
