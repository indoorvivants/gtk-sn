package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_map_t

/** Data type for holding integer-to-integer hash maps.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class map_t private[gnome] (raw: Ptr[hb_map_t]):

  def getUnsafeRawPointer(): Ptr[hb_map_t] = this.raw
end map_t

object map_t:
  def fromRaw(ptr: Ptr[hb_map_t]): map_t = new map_t(ptr)
end map_t
