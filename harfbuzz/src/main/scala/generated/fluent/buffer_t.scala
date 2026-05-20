package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_buffer_t

/** The main structure holding the input text and its properties before shaping,
  * and output glyphs and their information after shaping.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class buffer_t private[gnome] (raw: Ptr[hb_buffer_t]):

  def getUnsafeRawPointer(): Ptr[hb_buffer_t] = this.raw
end buffer_t

object buffer_t:
  def fromRaw(ptr: Ptr[hb_buffer_t]): buffer_t = new buffer_t(ptr)
end buffer_t
