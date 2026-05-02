package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.internal.GdkRGBA
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.graphene.internal.graphene_point_t
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskTextNode
import sn.gnome.pango.fluent.Font
import sn.gnome.pango.internal.PangoGlyphString

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A render node drawing a set of glyphs.
  */
class TextNode(raw: Ptr[GskTextNode]) extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the color used by the text @node.
    */
  def getColor(): Ptr[GdkRGBA] /* None */ = gsk_text_node_get_color(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the font used by the text @node.
    */
  def getFont(): Font /* None */ = new Font(
    gsk_text_node_get_font(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the glyph information in the @node.
    */
  @annotation.compileTimeOnly(
    "Method get_glyphs contains an OUT parameter, which is not supported yet"
  )
  private def getGlyphs__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the number of glyphs in the text node.
    */
  def getNumGlyphs(): UInt /* None */ = gsk_text_node_get_num_glyphs(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the offset applied to the text.
    */
  def getOffset(): Ptr[graphene_point_t] /* None */ = gsk_text_node_get_offset(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the text @node has color glyphs.
    */
  def hasColorGlyphs(): Boolean /* None */ =
    gsk_text_node_has_color_glyphs(this.raw.asInstanceOf).value.!=(0)

end TextNode

object TextNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a render node that renders the given glyphs.
    *
    * Note that @color may not be used if the font contains color glyphs.
    */
  def apply(
      font: Font /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoFont]) */,
      glyphs: Ptr[
        PangoGlyphString
      ] /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoGlyphString]) */,
      color: Ptr[
        GdkRGBA
      ] /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkRGBA]) */,
      offset: Ptr[
        graphene_point_t
      ] /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_point_t]) */
  ): TextNode = new TextNode(
    gsk_text_node_new(
      font.getUnsafeRawPointer().asInstanceOf,
      glyphs,
      color,
      offset
    ).asInstanceOf
  )
end TextNode
