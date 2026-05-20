package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_color_stop_t

/** Information about a color stop on a color line.
  *
  * Color lines typically have offsets ranging between 0 and 1, but that is not
  * required.
  *
  * Note: despite @color being unpremultiplied here, interpolation in gradients
  * shall happen in premultiplied space. See the OpenType spec
  * [COLR](https://learn.microsoft.com/en-us/typography/opentype/spec/colr)
  * section for details.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class color_stop_t private[gnome] (raw: Ptr[hb_color_stop_t]):

  def getUnsafeRawPointer(): Ptr[hb_color_stop_t] = this.raw

  /** the offset of the color stop
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def offset: Float /* None */ = (!raw).offset.asInstanceOf[Float]

  /** the offset of the color stop
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def offset_=(value: Float /* None */ ): Unit =
    (!raw).offset_=(value.asInstanceOf.asInstanceOf[Float])

  /** whether the color is the foreground
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field is_foreground]: Cannot render type Type(List(),ListMap(@name -> DataRecord(bool_t), @type -> DataRecord(hb_bool_t)))"
  )
  private def isForeground__ = ???

  /** the color, unpremultiplied
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field color]: Cannot render type Type(List(),ListMap(@name -> DataRecord(color_t), @type -> DataRecord(hb_color_t)))"
  )
  private def color__ = ???
end color_stop_t

object color_stop_t:
  def fromRaw(ptr: Ptr[hb_color_stop_t]): color_stop_t = new color_stop_t(ptr)
end color_stop_t
