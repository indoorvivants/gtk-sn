package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.{Direction_t, Script_t, language_t}
import sn.gnome.harfbuzz.internal.hb_segment_properties_t

/** The structure that holds various text properties of an #hb_buffer_t. Can be
  * set and retrieved using hb_buffer_set_segment_properties() and
  * hb_buffer_get_segment_properties(), respectively.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class segment_properties_t private[gnome] (raw: Ptr[hb_segment_properties_t]):

  def getUnsafeRawPointer(): Ptr[hb_segment_properties_t] = this.raw

  /** the #hb_direction_t of the buffer, see hb_buffer_set_direction().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def direction: sn.gnome.harfbuzz.Direction_t /* None */ =
    (!raw).direction.asInstanceOf[hb_direction_t]

  /** the #hb_direction_t of the buffer, see hb_buffer_set_direction().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def direction_=(value: sn.gnome.harfbuzz.Direction_t /* None */ ): Unit =
    (!raw).direction_=(value.raw.asInstanceOf[hb_direction_t])

  /** the #hb_script_t of the buffer, see hb_buffer_set_script().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def script: sn.gnome.harfbuzz.Script_t /* None */ =
    (!raw).script.asInstanceOf[hb_script_t]

  /** the #hb_script_t of the buffer, see hb_buffer_set_script().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def script_=(value: sn.gnome.harfbuzz.Script_t /* None */ ): Unit =
    (!raw).script_=(value.raw.asInstanceOf[hb_script_t])

  /** the #hb_language_t of the buffer, see hb_buffer_set_language().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def language: sn.gnome.harfbuzz.language_t /* None */ =
    (!raw).language.asInstanceOf[hb_language_t]

  /** the #hb_language_t of the buffer, see hb_buffer_set_language().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def language_=(value: sn.gnome.harfbuzz.language_t /* None */ ): Unit =
    (!raw).language_=(
      value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[hb_language_t]
    )

end segment_properties_t

object segment_properties_t:
  def fromRaw(ptr: Ptr[hb_segment_properties_t]): segment_properties_t =
    new segment_properties_t(ptr)
end segment_properties_t
