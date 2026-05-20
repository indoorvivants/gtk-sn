package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_ot_name_entry_t

/** Structure representing a name ID in a particular language.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ot_name_entry_t private[gnome] (raw: Ptr[hb_ot_name_entry_t]):

  def getUnsafeRawPointer(): Ptr[hb_ot_name_entry_t] = this.raw

  /** name ID
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field name_id]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ot_name_id_t), @type -> DataRecord(hb_ot_name_id_t)))"
  )
  private def nameId__ = ???

  /** language
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def language: sn.gnome.harfbuzz.language_t /* None */ =
    sn.gnome.harfbuzz.language_t.fromRaw((!raw).language)

  /** language
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def language_=(value: sn.gnome.harfbuzz.language_t /* None */ ): Unit =
    (!raw).language_=(value.getUnsafeRawPointer())
end ot_name_entry_t
object ot_name_entry_t:
  def fromRaw(ptr: Ptr[hb_ot_name_entry_t]): ot_name_entry_t =
    new ot_name_entry_t(ptr)
end ot_name_entry_t
