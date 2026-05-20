package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.pango.internal.PangoRectangle

/** The `PangoRectangle` structure represents a rectangle.
  *
  * `PangoRectangle` is frequently used to represent the logical or ink extents
  * of a single glyph or section of text. (See, for instance,
  * [method@Pango.Font.get_glyph_extents].)
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Rectangle private[gnome] (raw: Ptr[PangoRectangle]):

  def getUnsafeRawPointer(): Ptr[PangoRectangle] = this.raw

  /** X coordinate of the left side of the rectangle.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def x: Int /* None */ = (!raw).x.asInstanceOf[CInt]

  /** X coordinate of the left side of the rectangle.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def x_=(value: Int /* None */ ): Unit = (!raw).x_=(value.asInstanceOf[CInt])

  /** Y coordinate of the the top side of the rectangle.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def y: Int /* None */ = (!raw).y.asInstanceOf[CInt]

  /** Y coordinate of the the top side of the rectangle.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def y_=(value: Int /* None */ ): Unit = (!raw).y_=(value.asInstanceOf[CInt])

  /** width of the rectangle.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def width: Int /* None */ = (!raw).width.asInstanceOf[CInt]

  /** width of the rectangle.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def width_=(value: Int /* None */ ): Unit =
    (!raw).width_=(value.asInstanceOf[CInt])

  /** height of the rectangle.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def height: Int /* None */ = (!raw).height.asInstanceOf[CInt]

  /** height of the rectangle.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def height_=(value: Int /* None */ ): Unit =
    (!raw).height_=(value.asInstanceOf[CInt])
end Rectangle

object Rectangle:
  def fromRaw(ptr: Ptr[PangoRectangle]): Rectangle = new Rectangle(ptr)
end Rectangle
