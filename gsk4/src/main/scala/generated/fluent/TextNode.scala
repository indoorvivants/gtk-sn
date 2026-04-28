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

class TextNode(raw: Ptr[GskTextNode]) extends RenderNode(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getColor(): Ptr[GdkRGBA] = gsk_text_node_get_color(this.raw.asInstanceOf)

  def getFont(): Font = new Font(
    gsk_text_node_get_font(this.raw.asInstanceOf).asInstanceOf
  )

  // Method get_glyphs contains an OUT parameter, which is not supported yet

  def getNumGlyphs(): UInt = gsk_text_node_get_num_glyphs(
    this.raw.asInstanceOf
  ).value

  def getOffset(): Ptr[graphene_point_t] = gsk_text_node_get_offset(
    this.raw.asInstanceOf
  )

  def hasColorGlyphs(): Boolean =
    gsk_text_node_has_color_glyphs(this.raw.asInstanceOf).value.!=(0)

end TextNode

object TextNode:
  def apply(
      font: Font,
      glyphs: Ptr[PangoGlyphString],
      color: Ptr[GdkRGBA],
      offset: Ptr[graphene_point_t]
  ): TextNode = new TextNode(
    gsk_text_node_new(
      font.getUnsafeRawPointer().asInstanceOf,
      glyphs,
      color,
      offset
    ).asInstanceOf
  )
end TextNode
