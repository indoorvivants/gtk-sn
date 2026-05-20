package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_font_funcs_t

/** Data type containing a set of virtual methods used for working on #hb_font_t
  * font objects.
  *
  * HarfBuzz provides a lightweight default function for each of the methods in
  * #hb_font_funcs_t. Client programs can implement their own replacements for
  * the individual font functions, as needed, and replace the default by calling
  * the setter for a method.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class font_funcs_t private[gnome] (raw: Ptr[hb_font_funcs_t]):

  def getUnsafeRawPointer(): Ptr[hb_font_funcs_t] = this.raw
end font_funcs_t

object font_funcs_t:
  def fromRaw(ptr: Ptr[hb_font_funcs_t]): font_funcs_t = new font_funcs_t(ptr)
end font_funcs_t
