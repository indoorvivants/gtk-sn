package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_font_t

/** Data type for holding fonts.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class font_t private[gnome] (raw: Ptr[hb_font_t]):

  def getUnsafeRawPointer(): Ptr[hb_font_t] = this.raw
end font_t

object font_t:
  def fromRaw(ptr: Ptr[hb_font_t]): font_t = new font_t(ptr)
end font_t
