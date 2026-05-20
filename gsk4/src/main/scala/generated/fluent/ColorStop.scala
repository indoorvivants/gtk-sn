package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.RGBA
import sn.gnome.gsk4.internal.GskColorStop

/** A color stop in a gradient node.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ColorStop private[gnome] (raw: Ptr[GskColorStop]):

  def getUnsafeRawPointer(): Ptr[GskColorStop] = this.raw

  /** the offset of the color stop
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def offset: Float /* None */ = (!raw).offset.asInstanceOf[Float]

  /** the offset of the color stop
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def offset_=(value: Float /* None */ ): Unit =
    (!raw).offset_=(value.asInstanceOf.asInstanceOf[Float])

  /** the color at the given offset
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def color: sn.gnome.gdk4.RGBA /* None */ =
    (!raw).color.asInstanceOf[_root_.sn.gnome.gdk4.internal.GdkRGBA]

  /** the color at the given offset
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
end ColorStop

object ColorStop:
  def fromRaw(ptr: Ptr[GskColorStop]): ColorStop = new ColorStop(ptr)
end ColorStop
