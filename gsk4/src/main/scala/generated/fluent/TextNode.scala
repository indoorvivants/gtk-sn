package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskTextNode
import sn.gnome.pango.fluent.Font

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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))"
  )
  def getColor__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the font used by the text @node.
    */
  def getFont(): Font /* None */ = new Font(
    gsk_text_node_get_font(
      this.raw.asInstanceOf[Ptr[GskRenderNode]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the glyph information in the @node.
    */
  @annotation.compileTimeOnly(
    "Method get_glyphs contains an OUT parameter, which is not supported yet"
  )
  def getGlyphs__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the number of glyphs in the text node.
    */
  def getNumGlyphs(): UInt /* None */ = gsk_text_node_get_num_glyphs(
    this.raw.asInstanceOf[Ptr[GskRenderNode]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the offset applied to the text.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Point), @type -> DataRecord(const graphene_point_t*)))"
  )
  def getOffset__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the text @node has color glyphs.
    */
  def hasColorGlyphs(): Boolean /* None */ = gsk_text_node_has_color_glyphs(
    this.raw.asInstanceOf[Ptr[GskRenderNode]]
  ).value.!=(0)

end TextNode

object TextNode:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a render node that renders the given glyphs.
    *
    * Note that @color may not be used if the font contains color glyphs.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.GlyphString), @type -> DataRecord(PangoGlyphString*)))"
  )
  def `new`() = ???

end TextNode
