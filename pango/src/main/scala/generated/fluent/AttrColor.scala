package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.pango.{Attribute, Color}
import sn.gnome.pango.internal.PangoAttrColor

/** The `PangoAttrColor` structure is used to represent attributes that are
  * colors.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AttrColor private[gnome] (raw: Ptr[PangoAttrColor]):

  def getUnsafeRawPointer(): Ptr[PangoAttrColor] = this.raw

  /** the common portion of the attribute
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attr: sn.gnome.pango.Attribute /* None */ =
    (!raw).attr.asInstanceOf[PangoAttribute]

  /** the common portion of the attribute
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attr_=(value: sn.gnome.pango.Attribute /* None */ ): Unit = (!raw).attr_=(
    value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[PangoAttribute]
  )

  /** the `PangoColor` which is the value of the attribute
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def color: sn.gnome.pango.Color /* None */ =
    (!raw).color.asInstanceOf[PangoColor]

  /** the `PangoColor` which is the value of the attribute
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def color_=(value: sn.gnome.pango.Color /* None */ ): Unit = (!raw).color_=(
    value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[PangoColor]
  )
end AttrColor

object AttrColor:
  def fromRaw(ptr: Ptr[PangoAttrColor]): AttrColor = new AttrColor(ptr)
end AttrColor
