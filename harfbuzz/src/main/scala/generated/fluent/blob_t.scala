package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_blob_t

/** Data type for blobs. A blob wraps a chunk of binary data and facilitates its
  * lifecycle management between a client program and HarfBuzz.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class blob_t private[gnome] (raw: Ptr[hb_blob_t]):

  def getUnsafeRawPointer(): Ptr[hb_blob_t] = this.raw
end blob_t

object blob_t:
  def fromRaw(ptr: Ptr[hb_blob_t]): blob_t = new blob_t(ptr)
end blob_t
