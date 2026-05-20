package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.pango.{
  AttrClass,
  AttrColor,
  AttrFloat,
  AttrFontDesc,
  AttrFontFeatures,
  AttrInt,
  AttrLanguage,
  AttrShape,
  AttrSize,
  AttrString,
  Attribute
}
import sn.gnome.pango.internal.PangoAttribute

/** The `PangoAttribute` structure represents the common portions of all
  * attributes.
  *
  * Particular types of attributes include this structure as their initial
  * portion. The common portion of the attribute holds the range to which the
  * value in the type-specific part of the attribute applies and should be
  * initialized using [method@Pango.Attribute.init]. By default, an attribute
  * will have an all-inclusive range of [0,%G_MAXUINT].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Attribute private[gnome] (raw: Ptr[PangoAttribute]):

  def getUnsafeRawPointer(): Ptr[PangoAttribute] = this.raw

  /** the class structure holding information about the type of the attribute
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def klass: sn.gnome.pango.AttrClass /* None */ =
    (!raw).klass.asInstanceOf[Ptr[PangoAttrClass]]

  /** the class structure holding information about the type of the attribute
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def klass_=(value: sn.gnome.pango.AttrClass /* None */ ): Unit =
    (!raw).klass_=(
      value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[PangoAttrClass]]
    )

  /** the start index of the range (in bytes).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def startIndex: UInt /* None */ =
    (!raw).start_index.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** the start index of the range (in bytes).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def startIndex_=(value: UInt /* None */ ): Unit = (!raw).start_index_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )

  /** end index of the range (in bytes). The character at this index is not
    * included in the range.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def endIndex: UInt /* None */ =
    (!raw).end_index.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** end index of the range (in bytes). The character at this index is not
    * included in the range.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def endIndex_=(value: UInt /* None */ ): Unit = (!raw).end_index_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )

  /** Returns the attribute cast to `PangoAttrColor`.
    *
    * This is mainly useful for language bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def asColor(): sn.gnome.pango.AttrColor /* None */ =
    sn.gnome.pango.AttrColor.fromRaw(
      pango_attribute_as_color(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttribute]]
      )
    )
  end asColor

  /** Returns the attribute cast to `PangoAttrFloat`.
    *
    * This is mainly useful for language bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def asFloat(): sn.gnome.pango.AttrFloat /* None */ =
    sn.gnome.pango.AttrFloat.fromRaw(
      pango_attribute_as_float(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttribute]]
      )
    )
  end asFloat

  /** Returns the attribute cast to `PangoAttrFontDesc`.
    *
    * This is mainly useful for language bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def asFontDesc(): sn.gnome.pango.AttrFontDesc /* None */ =
    sn.gnome.pango.AttrFontDesc.fromRaw(
      pango_attribute_as_font_desc(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttribute]]
      )
    )
  end asFontDesc

  /** Returns the attribute cast to `PangoAttrFontFeatures`.
    *
    * This is mainly useful for language bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def asFontFeatures(): sn.gnome.pango.AttrFontFeatures /* None */ =
    sn.gnome.pango.AttrFontFeatures.fromRaw(
      pango_attribute_as_font_features(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttribute]]
      )
    )
  end asFontFeatures

  /** Returns the attribute cast to `PangoAttrInt`.
    *
    * This is mainly useful for language bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def asInt(): sn.gnome.pango.AttrInt /* None */ =
    sn.gnome.pango.AttrInt.fromRaw(
      pango_attribute_as_int(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttribute]]
      )
    )
  end asInt

  /** Returns the attribute cast to `PangoAttrLanguage`.
    *
    * This is mainly useful for language bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def asLanguage(): sn.gnome.pango.AttrLanguage /* None */ =
    sn.gnome.pango.AttrLanguage.fromRaw(
      pango_attribute_as_language(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttribute]]
      )
    )
  end asLanguage

  /** Returns the attribute cast to `PangoAttrShape`.
    *
    * This is mainly useful for language bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def asShape(): sn.gnome.pango.AttrShape /* None */ =
    sn.gnome.pango.AttrShape.fromRaw(
      pango_attribute_as_shape(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttribute]]
      )
    )
  end asShape

  /** Returns the attribute cast to `PangoAttrSize`.
    *
    * This is mainly useful for language bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def asSize(): sn.gnome.pango.AttrSize /* None */ =
    sn.gnome.pango.AttrSize.fromRaw(
      pango_attribute_as_size(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttribute]]
      )
    )
  end asSize

  /** Returns the attribute cast to `PangoAttrString`.
    *
    * This is mainly useful for language bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def asString(): sn.gnome.pango.AttrString /* None */ =
    sn.gnome.pango.AttrString.fromRaw(
      pango_attribute_as_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttribute]]
      )
    )
  end asString

  /** Make a copy of an attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.pango.Attribute /* None */ =
    sn.gnome.pango.Attribute.fromRaw(
      pango_attribute_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttribute]]
      )
    )
  end copy

  /** Destroy a `PangoAttribute` and free all associated memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def destroy(): Unit /* None */ =
    pango_attribute_destroy(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttribute]]
    )
  end destroy

  /** Compare two attributes for equality.
    *
    * This compares only the actual value of the two attributes and not the
    * ranges that the attributes apply to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(
      attr2: sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */
  ): Boolean /* None */ =
    pango_attribute_equal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttribute]],
      attr2.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end equal

  /** Initializes @attr's klass to @klass, it's start_index to
    * %PANGO_ATTR_INDEX_FROM_TEXT_BEGINNING and end_index to
    * %PANGO_ATTR_INDEX_TO_TEXT_END such that the attribute applies to the
    * entire text by default.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def init(
      klass: sn.gnome.pango.AttrClass /* Some(Ptr[PangoAttrClass]) */
  ): Unit /* None */ =
    pango_attribute_init(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttribute]],
      klass.getUnsafeRawPointer().asInstanceOf
    )
  end init

end Attribute

object Attribute:
  def fromRaw(ptr: Ptr[PangoAttribute]): Attribute = new Attribute(ptr)
end Attribute
