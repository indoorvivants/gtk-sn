package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_ot_var_axis_info_t

/** Data type for holding variation-axis values.
  *
  * The minimum, default, and maximum values are in un-normalized, user scales.
  *
  * <note>Note: at present, the only flag defined for @flags is
  * #HB_OT_VAR_AXIS_FLAG_HIDDEN.</note>
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ot_var_axis_info_t private[gnome] (raw: Ptr[hb_ot_var_axis_info_t]):

  def getUnsafeRawPointer(): Ptr[hb_ot_var_axis_info_t] = this.raw

  /** Index of the axis in the variation-axis array
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field axis_index]: Cannot render type Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(unsigned int)))"
  )
  private def axisIndex__ = ???

  /** The #hb_tag_t tag identifying the design variation of the axis
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field tag]: Cannot render type Type(List(),ListMap(@name -> DataRecord(tag_t), @type -> DataRecord(hb_tag_t)))"
  )
  private def tag__ = ???

  /** The `name` table Name ID that provides display names for the axis
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field name_id]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ot_name_id_t), @type -> DataRecord(hb_ot_name_id_t)))"
  )
  private def nameId__ = ???

  /** The #hb_ot_var_axis_flags_t flags for the axis
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flags: ot_var_axis_flags_t /* None */ =
    ot_var_axis_flags_t.fromRaw((!raw).flags)

  /** The #hb_ot_var_axis_flags_t flags for the axis
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flags_=(value: ot_var_axis_flags_t /* None */ ): Unit =
    (!raw).flags_=(value.raw.value)

  /** The minimum value on the variation axis that the font covers
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def minValue: Float /* None */ = (!raw).min_value

  /** The minimum value on the variation axis that the font covers
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def minValue_=(value: Float /* None */ ): Unit =
    (!raw).min_value_=(value.asInstanceOf)

  /** The position on the variation axis corresponding to the font's defaults
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def defaultValue: Float /* None */ = (!raw).default_value

  /** The position on the variation axis corresponding to the font's defaults
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def defaultValue_=(value: Float /* None */ ): Unit =
    (!raw).default_value_=(value.asInstanceOf)

  /** The maximum value on the variation axis that the font covers
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def maxValue: Float /* None */ = (!raw).max_value

  /** The maximum value on the variation axis that the font covers
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def maxValue_=(value: Float /* None */ ): Unit =
    (!raw).max_value_=(value.asInstanceOf)
end ot_var_axis_info_t
object ot_var_axis_info_t:
  def fromRaw(ptr: Ptr[hb_ot_var_axis_info_t]): ot_var_axis_info_t =
    new ot_var_axis_info_t(ptr)
end ot_var_axis_info_t
