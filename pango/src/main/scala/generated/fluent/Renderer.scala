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

class Renderer(raw: Ptr[PangoRenderer]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def activate(): Unit = pango_renderer_activate(this.raw.asInstanceOf)

  def deactivate(): Unit = pango_renderer_deactivate(this.raw.asInstanceOf)

  def drawErrorUnderline(x: Int, y: Int, width: Int, height: Int): Unit =
    pango_renderer_draw_error_underline(
      this.raw.asInstanceOf,
      x,
      y,
      width,
      height
    )

  def drawGlyph(font: Font, glyph: PangoGlyph, x: Double, y: Double): Unit =
    pango_renderer_draw_glyph(
      this.raw.asInstanceOf,
      font.getUnsafeRawPointer().asInstanceOf,
      glyph,
      x,
      y
    )

  def drawGlyphItem(
      text: String | CString,
      glyph_item: Ptr[PangoGlyphItem],
      x: Int,
      y: Int
  )(using Zone): Unit = pango_renderer_draw_glyph_item(
    this.raw.asInstanceOf,
    __sn_extract_string(text),
    glyph_item,
    x,
    y
  )

  def drawGlyphs(
      font: Font,
      glyphs: Ptr[PangoGlyphString],
      x: Int,
      y: Int
  ): Unit = pango_renderer_draw_glyphs(
    this.raw.asInstanceOf,
    font.getUnsafeRawPointer().asInstanceOf,
    glyphs,
    x,
    y
  )

  def drawLayout(layout: Layout, x: Int, y: Int): Unit =
    pango_renderer_draw_layout(
      this.raw.asInstanceOf,
      layout.getUnsafeRawPointer().asInstanceOf,
      x,
      y
    )

  def drawLayoutLine(line: Ptr[PangoLayoutLine], x: Int, y: Int): Unit =
    pango_renderer_draw_layout_line(this.raw.asInstanceOf, line, x, y)

  def drawRectangle(
      part: PangoRenderPart,
      x: Int,
      y: Int,
      width: Int,
      height: Int
  ): Unit = pango_renderer_draw_rectangle(
    this.raw.asInstanceOf,
    part,
    x,
    y,
    width,
    height
  )

  def drawTrapezoid(
      part: PangoRenderPart,
      `y1_`: Double,
      x11: Double,
      x21: Double,
      y2: Double,
      x12: Double,
      x22: Double
  ): Unit = pango_renderer_draw_trapezoid(
    this.raw.asInstanceOf,
    part,
    `y1_`,
    x11,
    x21,
    y2,
    x12,
    x22
  )

  def getAlpha(part: PangoRenderPart): UShort =
    pango_renderer_get_alpha(this.raw.asInstanceOf, part).value

  def getColor(part: PangoRenderPart): Ptr[PangoColor] =
    pango_renderer_get_color(this.raw.asInstanceOf, part)

  def getLayout(): Layout = new Layout(
    pango_renderer_get_layout(this.raw.asInstanceOf).asInstanceOf
  )

  def getLayoutLine(): Ptr[PangoLayoutLine] = pango_renderer_get_layout_line(
    this.raw.asInstanceOf
  )

  def getMatrix(): Ptr[PangoMatrix] = pango_renderer_get_matrix(
    this.raw.asInstanceOf
  )

  def partChanged(part: PangoRenderPart): Unit =
    pango_renderer_part_changed(this.raw.asInstanceOf, part)

  def setAlpha(part: PangoRenderPart, alpha: UShort): Unit =
    pango_renderer_set_alpha(this.raw.asInstanceOf, part, guint16(alpha))

  def setColor(part: PangoRenderPart, color: Ptr[PangoColor]): Unit =
    pango_renderer_set_color(this.raw.asInstanceOf, part, color)

  def setMatrix(matrix: Ptr[PangoMatrix]): Unit =
    pango_renderer_set_matrix(this.raw.asInstanceOf, matrix)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Renderer
