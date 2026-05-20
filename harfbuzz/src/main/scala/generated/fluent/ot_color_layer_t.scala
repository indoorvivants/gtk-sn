package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_ot_color_layer_t

/** Pairs of glyph and color index.
  *
  * A color index of 0xFFFF does not refer to a palette color, but indicates
  * that the foreground color should be used.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ot_color_layer_t private[gnome] (raw: Ptr[hb_ot_color_layer_t]):

  def getUnsafeRawPointer(): Ptr[hb_ot_color_layer_t] = this.raw

  /** the glyph ID of the layer
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field glyph]: Cannot render type Type(List(),ListMap(@name -> DataRecord(codepoint_t), @type -> DataRecord(hb_codepoint_t)))"
  )
  private def glyph__ = ???

  /** the palette color index of the layer
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field color_index]: Cannot render type Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(unsigned int)))"
  )
  private def colorIndex__ = ???
end ot_color_layer_t
object ot_color_layer_t:
  def fromRaw(ptr: Ptr[hb_ot_color_layer_t]): ot_color_layer_t =
    new ot_color_layer_t(ptr)
end ot_color_layer_t
