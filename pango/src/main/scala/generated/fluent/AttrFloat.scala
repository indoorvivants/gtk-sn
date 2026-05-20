package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.pango.Attribute
import sn.gnome.pango.internal.PangoAttrFloat

/** The `PangoAttrFloat` structure is used to represent attributes with a float
  * or double value.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AttrFloat private[gnome] (raw: Ptr[PangoAttrFloat]):

  def getUnsafeRawPointer(): Ptr[PangoAttrFloat] = this.raw

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

  /** the value of the attribute
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def value: Double /* None */ = (!raw).value.asInstanceOf[Double]

  /** the value of the attribute
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def value_=(value: Double /* None */ ): Unit =
    (!raw).value_=(value.asInstanceOf[Double])
end AttrFloat

object AttrFloat:
  def fromRaw(ptr: Ptr[PangoAttrFloat]): AttrFloat = new AttrFloat(ptr)
end AttrFloat
