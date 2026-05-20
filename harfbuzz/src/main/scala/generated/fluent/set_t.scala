package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_set_t

/** Data type for holding a set of integers. #hb_set_t's are used to gather and
  * contain glyph IDs, Unicode code points, and various other collections of
  * discrete values.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class set_t private[gnome] (raw: Ptr[hb_set_t]):

  def getUnsafeRawPointer(): Ptr[hb_set_t] = this.raw
end set_t

object set_t:
  def fromRaw(ptr: Ptr[hb_set_t]): set_t = new set_t(ptr)
end set_t
