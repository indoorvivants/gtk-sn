package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GData

/** An opaque data structure that represents a keyed data list.
  *
  * See also: [Keyed data lists][glib-Keyed-Data-Lists].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Data private[gnome] (raw: Ptr[GData]):

  def getUnsafeRawPointer(): Ptr[GData] = this.raw
end Data

object Data:
  def fromRaw(ptr: Ptr[GData]): Data = new Data(ptr)
end Data
