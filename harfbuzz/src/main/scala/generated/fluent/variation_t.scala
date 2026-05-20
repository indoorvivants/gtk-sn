package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_variation_t

/** Data type for holding variation data. Registered OpenType variation-axis
  * tags are listed in [OpenType Axis Tag
  * Registry](https://docs.microsoft.com/en-us/typography/opentype/spec/dvaraxisreg).
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class variation_t private[gnome] (raw: Ptr[hb_variation_t]):

  def getUnsafeRawPointer(): Ptr[hb_variation_t] = this.raw

  /** The #hb_tag_t tag of the variation-axis name
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field tag]: Cannot render type Type(List(),ListMap(@name -> DataRecord(tag_t), @type -> DataRecord(hb_tag_t)))"
  )
  private def tag__ = ???

  /** The value of the variation axis
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def value: Float /* None */ = (!raw).value.asInstanceOf[Float]

  /** The value of the variation axis
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def value_=(value: Float /* None */ ): Unit =
    (!raw).value_=(value.asInstanceOf.asInstanceOf[Float])

  /** Converts an #hb_variation_t into a `NULL`-terminated string in the format
    * understood by hb_variation_from_string(). The client in responsible for
    * allocating big enough size for @buf, 128 bytes is more than enough.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method _string]: Method _string contains an OUT parameter, which is not supported yet"
  )
  private def String__ = ???

end variation_t

object variation_t:
  def fromRaw(ptr: Ptr[hb_variation_t]): variation_t = new variation_t(ptr)
end variation_t
