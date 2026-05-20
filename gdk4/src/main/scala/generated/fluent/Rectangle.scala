package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.Rectangle
import sn.gnome.gdk4.internal.GdkRectangle
import sn.gnome.glib.internal.{gboolean, gint}

/** A `GdkRectangle` data type for representing rectangles.
  *
  * `GdkRectangle` is identical to `cairo_rectangle_t`. Together with Cairo’s
  * `cairo_region_t` data type, these are the central types for representing
  * sets of pixels.
  *
  * The intersection of two rectangles can be computed with
  * [method@Gdk.Rectangle.intersect]; to find the union of two rectangles use
  * [method@Gdk.Rectangle.union].
  *
  * The `cairo_region_t` type provided by Cairo is usually used for managing
  * non-rectangular clipping of graphical operations.
  *
  * The Graphene library has a number of other data types for regions and
  * volumes in 2D and 3D.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Rectangle private[gnome] (raw: Ptr[GdkRectangle]):

  def getUnsafeRawPointer(): Ptr[GdkRectangle] = this.raw

  /** the x coordinate of the top left corner
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def x: Int /* None */ = (!raw).x

  /** the x coordinate of the top left corner
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def x_=(value: Int /* None */ ): Unit = (!raw).x_=(value)

  /** the y coordinate of the top left corner
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def y: Int /* None */ = (!raw).y

  /** the y coordinate of the top left corner
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def y_=(value: Int /* None */ ): Unit = (!raw).y_=(value)

  /** the width of the rectangle
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def width: Int /* None */ = (!raw).width

  /** the width of the rectangle
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def width_=(value: Int /* None */ ): Unit = (!raw).width_=(value)

  /** the height of the rectangle
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def height: Int /* None */ = (!raw).height

  /** the height of the rectangle
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def height_=(value: Int /* None */ ): Unit = (!raw).height_=(value)

  /** Returns %TRUE if @rect contains the point described by @x and @y.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def containsPoint(
      x: Int /* Some(CInt) */,
      y: Int /* Some(CInt) */
  ): Boolean /* None */ =
    gdk_rectangle_contains_point(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkRectangle]],
      x,
      y
    ).value.!=(0)
  end containsPoint

  /** Checks if the two given rectangles are equal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(
      rect2: sn.gnome.gdk4.Rectangle /* Some(Ptr[GdkRectangle]) */
  ): Boolean /* None */ =
    gdk_rectangle_equal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkRectangle]],
      rect2.getUnsafeRawPointer()
    ).value.!=(0)
  end equal

  /** Calculates the intersection of two rectangles.
    *
    * It is allowed for @dest to be the same as either @src1 or @src2. If the
    * rectangles do not intersect, @dest’s width and height is set to 0 and its
    * x and y values are undefined. If you are only interested in whether the
    * rectangles intersect, but not in the intersecting area itself, pass %NULL
    * for @dest.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method intersect]: Method intersect contains an OUT parameter, which is not supported yet"
  )
  private def intersect__ = ???

  /** Calculates the union of two rectangles.
    *
    * The union of rectangles @src1 and @src2 is the smallest rectangle which
    * includes both @src1 and @src2 within it. It is allowed for @dest to be the
    * same as either @src1 or @src2.
    *
    * Note that this function does not ignore 'empty' rectangles (ie. with zero
    * width or height).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method union]: Method union contains an OUT parameter, which is not supported yet"
  )
  private def union__ = ???

end Rectangle
object Rectangle:
  def fromRaw(ptr: Ptr[GdkRectangle]): Rectangle = new Rectangle(ptr)
end Rectangle
