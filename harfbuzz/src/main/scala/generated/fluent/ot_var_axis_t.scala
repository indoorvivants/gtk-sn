package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_ot_var_axis_t

/** Use #hb_ot_var_axis_info_t instead.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ot_var_axis_t private[gnome] (raw: Ptr[hb_ot_var_axis_t]):

  def getUnsafeRawPointer(): Ptr[hb_ot_var_axis_t] = this.raw

  /** axis tag
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field tag]: Cannot render type Type(List(),ListMap(@name -> DataRecord(tag_t), @type -> DataRecord(hb_tag_t)))"
  )
  private def tag__ = ???

  /** axis name identifier
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field name_id]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ot_name_id_t), @type -> DataRecord(hb_ot_name_id_t)))"
  )
  private def nameId__ = ???

  /** minimum value of the axis
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def minValue: Float /* None */ = (!raw).min_value

  /** minimum value of the axis
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def minValue_=(value: Float /* None */ ): Unit =
    (!raw).min_value_=(value.asInstanceOf)

  /** default value of the axis
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def defaultValue: Float /* None */ = (!raw).default_value

  /** default value of the axis
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def defaultValue_=(value: Float /* None */ ): Unit =
    (!raw).default_value_=(value.asInstanceOf)

  /** maximum value of the axis
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def maxValue: Float /* None */ = (!raw).max_value

  /** maximum value of the axis
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def maxValue_=(value: Float /* None */ ): Unit =
    (!raw).max_value_=(value.asInstanceOf)
end ot_var_axis_t
object ot_var_axis_t:
  def fromRaw(ptr: Ptr[hb_ot_var_axis_t]): ot_var_axis_t = new ot_var_axis_t(
    ptr
  )
end ot_var_axis_t
