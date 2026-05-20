package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_draw_funcs_t

/** Glyph draw callbacks.
  *
  * #hb_draw_move_to_func_t, #hb_draw_line_to_func_t and
  * #hb_draw_cubic_to_func_t calls are necessary to be defined but we translate
  * #hb_draw_quadratic_to_func_t calls to #hb_draw_cubic_to_func_t if the
  * callback isn't defined.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class draw_funcs_t private[gnome] (raw: Ptr[hb_draw_funcs_t]):

  def getUnsafeRawPointer(): Ptr[hb_draw_funcs_t] = this.raw
end draw_funcs_t

object draw_funcs_t:
  def fromRaw(ptr: Ptr[hb_draw_funcs_t]): draw_funcs_t = new draw_funcs_t(ptr)
end draw_funcs_t
