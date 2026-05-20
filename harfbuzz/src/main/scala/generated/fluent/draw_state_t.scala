package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_draw_state_t

/** Current drawing state.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class draw_state_t private[gnome] (raw: Ptr[hb_draw_state_t]):

  def getUnsafeRawPointer(): Ptr[hb_draw_state_t] = this.raw

  /** Whether there is an open path
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field path_open]: Cannot render type Type(List(),ListMap(@name -> DataRecord(bool_t), @type -> DataRecord(hb_bool_t)))"
  )
  private def pathOpen__ = ???

  /** X component of the start of current path
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pathStartX: Float /* None */ = (!raw).path_start_x.asInstanceOf[Float]

  /** X component of the start of current path
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pathStartX_=(value: Float /* None */ ): Unit =
    (!raw).path_start_x_=(value.asInstanceOf.asInstanceOf[Float])

  /** Y component of the start of current path
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pathStartY: Float /* None */ = (!raw).path_start_y.asInstanceOf[Float]

  /** Y component of the start of current path
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pathStartY_=(value: Float /* None */ ): Unit =
    (!raw).path_start_y_=(value.asInstanceOf.asInstanceOf[Float])

  /** X component of current point
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def currentX: Float /* None */ = (!raw).current_x.asInstanceOf[Float]

  /** X component of current point
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def currentX_=(value: Float /* None */ ): Unit =
    (!raw).current_x_=(value.asInstanceOf.asInstanceOf[Float])

  /** Y component of current point
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def currentY: Float /* None */ = (!raw).current_y.asInstanceOf[Float]

  /** Y component of current point
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def currentY_=(value: Float /* None */ ): Unit =
    (!raw).current_y_=(value.asInstanceOf.asInstanceOf[Float])

end draw_state_t

object draw_state_t:
  def fromRaw(ptr: Ptr[hb_draw_state_t]): draw_state_t = new draw_state_t(ptr)
end draw_state_t
