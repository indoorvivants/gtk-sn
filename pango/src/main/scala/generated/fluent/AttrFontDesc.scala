package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.pango.{Attribute, FontDescription}
import sn.gnome.pango.internal.PangoAttrFontDesc

/** The `PangoAttrFontDesc` structure is used to store an attribute that sets
  * all aspects of the font description at once.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AttrFontDesc private[gnome] (raw: Ptr[PangoAttrFontDesc]):

  def getUnsafeRawPointer(): Ptr[PangoAttrFontDesc] = this.raw

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

  /** the font description which is the value of this attribute
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def desc: sn.gnome.pango.FontDescription /* None */ =
    (!raw).desc.asInstanceOf[Ptr[PangoFontDescription]]

  /** the font description which is the value of this attribute
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def desc_=(value: sn.gnome.pango.FontDescription /* None */ ): Unit =
    (!raw).desc_=(
      value
        .getUnsafeRawPointer()
        .asInstanceOf
        .asInstanceOf[Ptr[PangoFontDescription]]
    )
end AttrFontDesc

object AttrFontDesc:
  def fromRaw(ptr: Ptr[PangoAttrFontDesc]): AttrFontDesc = new AttrFontDesc(ptr)
end AttrFontDesc
