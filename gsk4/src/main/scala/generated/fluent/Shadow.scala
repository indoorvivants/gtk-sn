package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.RGBA
import sn.gnome.gsk4.internal.GskShadow

/** The shadow parameters in a shadow node.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Shadow private[gnome] (raw: Ptr[GskShadow]):

  def getUnsafeRawPointer(): Ptr[GskShadow] = this.raw

  /** the color of the shadow
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def color: sn.gnome.gdk4.RGBA /* None */ =
    (!raw).color.asInstanceOf[_root_.sn.gnome.gdk4.internal.GdkRGBA]

  /** the color of the shadow
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def color_=(value: sn.gnome.gdk4.RGBA /* None */ ): Unit = (!raw).color_=(
    value
      .getUnsafeRawPointer()
      .asInstanceOf
      .asInstanceOf[_root_.sn.gnome.gdk4.internal.GdkRGBA]
  )

  /** the horizontal offset of the shadow
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dx: Float /* None */ = (!raw).dx.asInstanceOf[Float]

  /** the horizontal offset of the shadow
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dx_=(value: Float /* None */ ): Unit =
    (!raw).dx_=(value.asInstanceOf.asInstanceOf[Float])

  /** the vertical offset of the shadow
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dy: Float /* None */ = (!raw).dy.asInstanceOf[Float]

  /** the vertical offset of the shadow
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dy_=(value: Float /* None */ ): Unit =
    (!raw).dy_=(value.asInstanceOf.asInstanceOf[Float])

  /** the radius of the shadow
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def radius: Float /* None */ = (!raw).radius.asInstanceOf[Float]

  /** the radius of the shadow
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def radius_=(value: Float /* None */ ): Unit =
    (!raw).radius_=(value.asInstanceOf.asInstanceOf[Float])
end Shadow

object Shadow:
  def fromRaw(ptr: Ptr[GskShadow]): Shadow = new Shadow(ptr)
end Shadow
