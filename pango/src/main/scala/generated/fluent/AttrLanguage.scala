package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.pango.{Attribute, Language}
import sn.gnome.pango.internal.PangoAttrLanguage

/** The `PangoAttrLanguage` structure is used to represent attributes that are
  * languages.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AttrLanguage private[gnome] (raw: Ptr[PangoAttrLanguage]):

  def getUnsafeRawPointer(): Ptr[PangoAttrLanguage] = this.raw

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

  /** the `PangoLanguage` which is the value of the attribute
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def value: sn.gnome.pango.Language /* None */ =
    (!raw).value.asInstanceOf[Ptr[PangoLanguage]]

  /** the `PangoLanguage` which is the value of the attribute
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def value_=(value: sn.gnome.pango.Language /* None */ ): Unit =
    (!raw).value_=(
      value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[PangoLanguage]]
    )
end AttrLanguage

object AttrLanguage:
  def fromRaw(ptr: Ptr[PangoAttrLanguage]): AttrLanguage = new AttrLanguage(ptr)
end AttrLanguage
