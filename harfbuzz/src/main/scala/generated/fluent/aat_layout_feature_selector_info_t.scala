package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_aat_layout_feature_selector_info_t

/** Structure representing a setting for an #hb_aat_layout_feature_type_t.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class aat_layout_feature_selector_info_t private[gnome] (
    raw: Ptr[hb_aat_layout_feature_selector_info_t]
):

  def getUnsafeRawPointer(): Ptr[hb_aat_layout_feature_selector_info_t] =
    this.raw

  /** The selector's name identifier
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field name_id]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ot_name_id_t), @type -> DataRecord(hb_ot_name_id_t)))"
  )
  private def nameId__ = ???

  /** The value to turn the selector on
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def enable: Aat_layout_feature_selector_t /* None */ =
    Aat_layout_feature_selector_t.fromRaw((!raw).enable)

  /** The value to turn the selector on
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def enable_=(value: Aat_layout_feature_selector_t /* None */ ): Unit =
    (!raw).enable_=(value.raw.value)

  /** The value to turn the selector off
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def disable: Aat_layout_feature_selector_t /* None */ =
    Aat_layout_feature_selector_t.fromRaw((!raw).disable)

  /** The value to turn the selector off
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def disable_=(value: Aat_layout_feature_selector_t /* None */ ): Unit =
    (!raw).disable_=(value.raw.value)
end aat_layout_feature_selector_info_t
object aat_layout_feature_selector_info_t:
  def fromRaw(
      ptr: Ptr[hb_aat_layout_feature_selector_info_t]
  ): aat_layout_feature_selector_info_t =
    new aat_layout_feature_selector_info_t(ptr)
end aat_layout_feature_selector_info_t
