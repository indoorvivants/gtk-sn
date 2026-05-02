package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint16
import sn.gnome.gobject.fluent.Object
import sn.gnome.pango.fluent.Font
import sn.gnome.pango.fluent.Layout
import sn.gnome.pango.internal.PangoColor
import sn.gnome.pango.internal.PangoGlyph
import sn.gnome.pango.internal.PangoGlyphItem
import sn.gnome.pango.internal.PangoGlyphString
import sn.gnome.pango.internal.PangoLayoutLine
import sn.gnome.pango.internal.PangoMatrix
import sn.gnome.pango.internal.PangoRenderPart
import sn.gnome.pango.internal.PangoRenderer

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `PangoRenderer` is a base class for objects that can render text provided as
  * `PangoGlyphString` or `PangoLayout`.
  *
  * By subclassing `PangoRenderer` and overriding operations such as
  * @draw_glyphs
  *   and @draw_rectangle, renderers for particular font backends and
  *   destinations can be created.
  */
class Renderer(raw: Ptr[PangoRenderer]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Does initial setup before rendering operations on @renderer.
    *
    * [method@Pango.Renderer.deactivate] should be called when done drawing.
    * Calls such as [method@Pango.Renderer.draw_layout] automatically activate
    * the layout before drawing on it.
    *
    * Calls to [method@Pango.Renderer.activate] and
    * [method@Pango.Renderer.deactivate] can be nested and the renderer will
    * only be initialized and deinitialized once.
    */
  def activate(): Unit /* None */ = pango_renderer_activate(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Cleans up after rendering operations on @renderer.
    *
    * See docs for [method@Pango.Renderer.activate].
    */
  def deactivate(): Unit /* None */ = pango_renderer_deactivate(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Draw a squiggly line that approximately covers the given rectangle in the
    * style of an underline used to indicate a spelling error.
    *
    * The width of the underline is rounded to an integer number of up/down
    * segments and the resulting rectangle is centered in the original
    * rectangle.
    *
    * This should be called while @renderer is already active. Use
    * [method@Pango.Renderer.activate] to activate a renderer.
    */
  def drawErrorUnderline(
      x: Int /* Some(CInt) */,
      y: Int /* Some(CInt) */,
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  ): Unit /* None */ = pango_renderer_draw_error_underline(
    this.raw.asInstanceOf,
    x,
    y,
    width,
    height
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Draws a single glyph with coordinates in device space.
    */
  def drawGlyph(
      font: Font /* Some(Ptr[PangoFont]) */,
      glyph: PangoGlyph /* Some(PangoGlyph) */,
      x: Double /* Some(Double) */,
      y: Double /* Some(Double) */
  ): Unit /* None */ = pango_renderer_draw_glyph(
    this.raw.asInstanceOf,
    font.getUnsafeRawPointer().asInstanceOf,
    glyph,
    x,
    y
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Draws the glyphs in @glyph_item with the specified `PangoRenderer`,
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
    */
  def drawGlyphItem(
      text: Option[String | CString /* Some(CString) */ ],
      glyph_item: Ptr[PangoGlyphItem] /* Some(Ptr[PangoGlyphItem]) */,
      x: Int /* Some(CInt) */,
      y: Int /* Some(CInt) */
  )(using Zone): Unit /* None */ = pango_renderer_draw_glyph_item(
    this.raw.asInstanceOf,
    text
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString]),
    glyph_item,
    x,
    y
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Draws the glyphs in @glyphs with the specified `PangoRenderer`.
    */
  def drawGlyphs(
      font: Font /* Some(Ptr[PangoFont]) */,
      glyphs: Ptr[PangoGlyphString] /* Some(Ptr[PangoGlyphString]) */,
      x: Int /* Some(CInt) */,
      y: Int /* Some(CInt) */
  ): Unit /* None */ = pango_renderer_draw_glyphs(
    this.raw.asInstanceOf,
    font.getUnsafeRawPointer().asInstanceOf,
    glyphs,
    x,
    y
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Draws @layout with the specified `PangoRenderer`.
    *
    * This is equivalent to drawing the lines of the layout, at their respective
    * positions relative to @x, @y.
    */
  def drawLayout(
      layout: Layout /* Some(Ptr[PangoLayout]) */,
      x: Int /* Some(CInt) */,
      y: Int /* Some(CInt) */
  ): Unit /* None */ = pango_renderer_draw_layout(
    this.raw.asInstanceOf,
    layout.getUnsafeRawPointer().asInstanceOf,
    x,
    y
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Draws @line with the specified `PangoRenderer`.
    *
    * This draws the glyph items that make up the line, as well as shapes,
    * backgrounds and lines that are specified by the attributes of those items.
    */
  def drawLayoutLine(
      line: Ptr[PangoLayoutLine] /* Some(Ptr[PangoLayoutLine]) */,
      x: Int /* Some(CInt) */,
      y: Int /* Some(CInt) */
  ): Unit /* None */ =
    pango_renderer_draw_layout_line(this.raw.asInstanceOf, line, x, y)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Draws an axis-aligned rectangle in user space coordinates with the
    * specified `PangoRenderer`.
    *
    * This should be called while @renderer is already active. Use
    * [method@Pango.Renderer.activate] to activate a renderer.
    */
  def drawRectangle(
      part: PangoRenderPart /* Some(PangoRenderPart) */,
      x: Int /* Some(CInt) */,
      y: Int /* Some(CInt) */,
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  ): Unit /* None */ = pango_renderer_draw_rectangle(
    this.raw.asInstanceOf,
    part,
    x,
    y,
    width,
    height
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Draws a trapezoid with the parallel sides aligned with the X axis using
    * the given `PangoRenderer`; coordinates are in device space.
    */
  def drawTrapezoid(
      part: PangoRenderPart /* Some(PangoRenderPart) */,
      `y1_`: Double /* Some(Double) */,
      x11: Double /* Some(Double) */,
      x21: Double /* Some(Double) */,
      y2: Double /* Some(Double) */,
      x12: Double /* Some(Double) */,
      x22: Double /* Some(Double) */
  ): Unit /* None */ = pango_renderer_draw_trapezoid(
    this.raw.asInstanceOf,
    part,
    `y1_`,
    x11,
    x21,
    y2,
    x12,
    x22
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the current alpha for the specified part.
    */
  def getAlpha(
      part: PangoRenderPart /* Some(PangoRenderPart) */
  ): UShort /* None */ =
    pango_renderer_get_alpha(this.raw.asInstanceOf, part).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the current rendering color for the specified part.
    */
  def getColor(
      part: PangoRenderPart /* Some(PangoRenderPart) */
  ): Ptr[PangoColor] /* None */ =
    pango_renderer_get_color(this.raw.asInstanceOf, part)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the layout currently being rendered using @renderer.
    *
    * Calling this function only makes sense from inside a subclass's methods,
    * like in its draw_shape vfunc, for example.
    *
    * The returned layout should not be modified while still being rendered.
    */
  def getLayout(): Layout /* None */ = new Layout(
    pango_renderer_get_layout(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the layout line currently being rendered using @renderer.
    *
    * Calling this function only makes sense from inside a subclass's methods,
    * like in its draw_shape vfunc, for example.
    *
    * The returned layout line should not be modified while still being
    * rendered.
    */
  def getLayoutLine(): Ptr[PangoLayoutLine] /* None */ =
    pango_renderer_get_layout_line(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the transformation matrix that will be applied when rendering.
    *
    * See [method@Pango.Renderer.set_matrix].
    */
  def getMatrix(): Ptr[PangoMatrix] /* None */ = pango_renderer_get_matrix(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Informs Pango that the way that the rendering is done for @part has
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
    */
  def partChanged(
      part: PangoRenderPart /* Some(PangoRenderPart) */
  ): Unit /* None */ = pango_renderer_part_changed(this.raw.asInstanceOf, part)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the alpha for part of the rendering.
    *
    * Note that the alpha may only be used if a color is specified for @part as
    * well.
    */
  def setAlpha(
      part: PangoRenderPart /* Some(PangoRenderPart) */,
      alpha: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */
  ): Unit /* None */ =
    pango_renderer_set_alpha(this.raw.asInstanceOf, part, guint16(alpha))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the color for part of the rendering.
    *
    * Also see [method@Pango.Renderer.set_alpha].
    */
  def setColor(
      part: PangoRenderPart /* Some(PangoRenderPart) */,
      color: Option[Ptr[PangoColor] /* Some(Ptr[PangoColor]) */ ]
  ): Unit /* None */ = pango_renderer_set_color(
    this.raw.asInstanceOf,
    part,
    color
      .map[Ptr[PangoColor]](o => o)
      .getOrElse(null.asInstanceOf[Ptr[PangoColor]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the transformation matrix that will be applied when rendering.
    */
  def setMatrix(
      matrix: Option[Ptr[PangoMatrix] /* Some(Ptr[PangoMatrix]) */ ]
  ): Unit /* None */ = pango_renderer_set_matrix(
    this.raw.asInstanceOf,
    matrix
      .map[Ptr[PangoMatrix]](o => o)
      .getOrElse(null.asInstanceOf[Ptr[PangoMatrix]])
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Renderer
