package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.fluent.RenderNode
import sn.gnome.gsk4.internal.GskTextNode
import sn.gnome.pango.fluent.Font

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
  @annotation.compileTimeOnly(
    "[method get_color/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.RGBA), @type -> DataRecord(const GdkRGBA*)))"
  )
  private def getColor__ = ???

  /** Returns the font used by the text @node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFont()(using Runtime): sn.gnome.pango.fluent.Font /* None */ =
    sn.gnome.pango.fluent.Font.applyUnsafe(
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
  @annotation.compileTimeOnly(
    "[method get_offset/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Graphene.Point), @type -> DataRecord(const graphene_point_t*)))"
  )
  private def getOffset__ = ???

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
  @annotation.compileTimeOnly(
    "[glyphs]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.GlyphString), @type -> DataRecord(PangoGlyphString*)))"
  )
  private def apply() = ???

end TextNode
