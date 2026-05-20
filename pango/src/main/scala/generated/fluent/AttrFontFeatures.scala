package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gchar
import sn.gnome.pango.Attribute
import sn.gnome.pango.internal.PangoAttrFontFeatures

/** The `PangoAttrFontFeatures` structure is used to represent OpenType font
  * features as an attribute.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AttrFontFeatures private[gnome] (raw: Ptr[PangoAttrFontFeatures]):

  def getUnsafeRawPointer(): Ptr[PangoAttrFontFeatures] = this.raw

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

  /** the features, as a string in CSS syntax
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def features(using Zone): scala.Predef.String /* None */ =
    (!raw).features.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]

  /** the features, as a string in CSS syntax
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def features_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).features_=(
      toCString(value)
        .asInstanceOf[Ptr[gchar]]
        .asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
    )
end AttrFontFeatures

object AttrFontFeatures:
  def fromRaw(ptr: Ptr[PangoAttrFontFeatures]): AttrFontFeatures =
    new AttrFontFeatures(ptr)
end AttrFontFeatures
