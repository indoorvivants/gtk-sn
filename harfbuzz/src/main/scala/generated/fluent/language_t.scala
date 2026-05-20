package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_language_t

/** Data type for languages. Each #hb_language_t corresponds to a BCP 47
  * language tag.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class language_t private[gnome] (raw: Ptr[hb_language_t]):

  def getUnsafeRawPointer(): Ptr[hb_language_t] = this.raw

  /** Converts an #hb_language_t to a string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def String(): String /* None */ =
    fromCString(
      hb_language_to_string(
        this.getUnsafeRawPointer().asInstanceOf[hb_language_t]
      ).asInstanceOf
    )
  end String

end language_t
object language_t:
  def fromRaw(ptr: Ptr[hb_language_t]): language_t = new language_t(ptr)
end language_t
