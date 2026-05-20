package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_ot_math_kern_entry_t

/** Data type to hold math kerning (cut-in) information for a glyph.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ot_math_kern_entry_t private[gnome] (raw: Ptr[hb_ot_math_kern_entry_t]):

  def getUnsafeRawPointer(): Ptr[hb_ot_math_kern_entry_t] = this.raw

  /** The maximum height at which this entry should be used
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field max_correction_height]: Cannot render type Type(List(),ListMap(@name -> DataRecord(position_t), @type -> DataRecord(hb_position_t)))"
  )
  private def maxCorrectionHeight__ = ???

  /** The kern value of the entry
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field kern_value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(position_t), @type -> DataRecord(hb_position_t)))"
  )
  private def kernValue__ = ???
end ot_math_kern_entry_t
object ot_math_kern_entry_t:
  def fromRaw(ptr: Ptr[hb_ot_math_kern_entry_t]): ot_math_kern_entry_t =
    new ot_math_kern_entry_t(ptr)
end ot_math_kern_entry_t
