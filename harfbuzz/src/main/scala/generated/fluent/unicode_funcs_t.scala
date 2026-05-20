package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_unicode_funcs_t

/** Data type containing a set of virtual methods used for accessing various
  * Unicode character properties.
  *
  * HarfBuzz provides a default function for each of the methods in
  * #hb_unicode_funcs_t. Client programs can implement their own replacements
  * for the individual Unicode functions, as needed, and replace the default by
  * calling the setter for a method.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class unicode_funcs_t private[gnome] (raw: Ptr[hb_unicode_funcs_t]):

  def getUnsafeRawPointer(): Ptr[hb_unicode_funcs_t] = this.raw
end unicode_funcs_t

object unicode_funcs_t:
  def fromRaw(ptr: Ptr[hb_unicode_funcs_t]): unicode_funcs_t =
    new unicode_funcs_t(ptr)
end unicode_funcs_t
