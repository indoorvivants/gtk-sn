package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_face_t

/** Data type for holding font faces.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class face_t private[gnome] (raw: Ptr[hb_face_t]):

  def getUnsafeRawPointer(): Ptr[hb_face_t] = this.raw
end face_t

object face_t:
  def fromRaw(ptr: Ptr[hb_face_t]): face_t = new face_t(ptr)
end face_t
