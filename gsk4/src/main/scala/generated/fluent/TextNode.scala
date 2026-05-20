package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.RGBA
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.runtime.*
import sn.gnome.graphene.Point
import sn.gnome.gsk4.RenderNode
import sn.gnome.gsk4.internal.GskTextNode
import sn.gnome.pango.{Font, GlyphString}

/** A render node drawing a set of glyphs.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TextNode private[gnome] (raw: Ptr[GskTextNode])
    extends RenderNode(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the color used by the text @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getColor(): sn.gnome.gdk4.RGBA /* None */ =
    sn.gnome.gdk4.RGBA.fromRaw(
      gsk_text_node_get_color(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      )
    )
  end getColor

  /** Returns the font used by the text @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFont()(using Runtime): sn.gnome.pango.Font /* None */ =
    sn.gnome.pango.Font.applyUnsafe(
      gsk_text_node_get_font(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      ).asInstanceOf
    )
  end getFont

  /** Retrieves the glyph information in the @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_glyphs]: Method get_glyphs contains an OUT parameter, which is not supported yet"
  )
  private def getGlyphs__ = ???

  /** Retrieves the number of glyphs in the text node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNumGlyphs(): UInt /* None */ =
    gsk_text_node_get_num_glyphs(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
    ).value
  end getNumGlyphs

  /** Retrieves the offset applied to the text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getOffset(): sn.gnome.graphene.Point /* None */ =
    sn.gnome.graphene.Point.fromRaw(
      gsk_text_node_get_offset(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
      )
    )
  end getOffset

  /** Checks whether the text @node has color glyphs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasColorGlyphs(): Boolean /* None */ =
    gsk_text_node_has_color_glyphs(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskRenderNode]]
    ).value.!=(0)
  end hasColorGlyphs

end TextNode

object TextNode:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GskTextNode])(using Runtime) = summon[Runtime]
    .getOrCreate[TextNode](ptr.asInstanceOf[Ptr[Byte]], p => new TextNode(ptr))

  /** Creates a render node that renders the given glyphs.
    *
    * Note that @color may not be used if the font contains color glyphs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      font: sn.gnome.pango.Font /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoFont]) */,
      glyphs: sn.gnome.pango.GlyphString /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoGlyphString]) */,
      color: sn.gnome.gdk4.RGBA /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkRGBA]) */,
      offset: sn.gnome.graphene.Point /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_point_t]) */
  )(using Runtime): TextNode =
    val raw: Ptr[Byte] = gsk_text_node_new(
      font.getUnsafeRawPointer().asInstanceOf,
      glyphs.getUnsafeRawPointer().asInstanceOf,
      color.getUnsafeRawPointer().asInstanceOf,
      offset.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[TextNode](raw, r => TextNode.applyUnsafe(r.asInstanceOf))
  end apply
end TextNode
