package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_paint_funcs_t

/** Glyph paint callbacks.
  *
  * The callbacks assume that the caller maintains a stack of current
  * transforms, clips and intermediate surfaces, as evidenced by the pairs of
  * push/pop callbacks. The push/pop calls will be properly nested, so it is
  * fine to store the different kinds of object on a single stack.
  *
  * Not all callbacks are required for all kinds of glyphs. For rendering COLRv0
  * or non-color outline glyphs, the gradient callbacks are not needed, and the
  * composite callback only needs to handle simple alpha compositing
  * (#HB_PAINT_COMPOSITE_MODE_SRC_OVER).
  *
  * The paint-image callback is only needed for glyphs with image blobs in the
  * CBDT, sbix or SVG tables.
  *
  * The custom-palette-color callback is only necessary if you want to override
  * colors from the font palette with custom colors.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class paint_funcs_t private[gnome] (raw: Ptr[hb_paint_funcs_t]):

  def getUnsafeRawPointer(): Ptr[hb_paint_funcs_t] = this.raw
end paint_funcs_t

object paint_funcs_t:
  def fromRaw(ptr: Ptr[hb_paint_funcs_t]): paint_funcs_t = new paint_funcs_t(
    ptr
  )
end paint_funcs_t
