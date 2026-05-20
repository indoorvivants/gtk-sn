package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.pango.Attribute
import sn.gnome.pango.internal.PangoAttrSize

/** The `PangoAttrSize` structure is used to represent attributes which set font
  * size.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AttrSize private[gnome] (raw: Ptr[PangoAttrSize]):

  def getUnsafeRawPointer(): Ptr[PangoAttrSize] = this.raw

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

  /** size of font, in units of 1/%PANGO_SCALE of a point (for %PANGO_ATTR_SIZE)
    * or of a device unit (for %PANGO_ATTR_ABSOLUTE_SIZE)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def size: Int /* None */ = (!raw).size.asInstanceOf[CInt]

  /** size of font, in units of 1/%PANGO_SCALE of a point (for %PANGO_ATTR_SIZE)
    * or of a device unit (for %PANGO_ATTR_ABSOLUTE_SIZE)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def size_=(value: Int /* None */ ): Unit =
    (!raw).size_=(value.asInstanceOf[CInt])

  /** whether the font size is in device units or points. This field is only
    * present for compatibility with Pango-1.8.0 (%PANGO_ATTR_ABSOLUTE_SIZE was
    * added in 1.8.1); and always will be %FALSE for %PANGO_ATTR_SIZE and %TRUE
    * for %PANGO_ATTR_ABSOLUTE_SIZE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def absolute: UInt /* None */ =
    (!raw).absolute.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** whether the font size is in device units or points. This field is only
    * present for compatibility with Pango-1.8.0 (%PANGO_ATTR_ABSOLUTE_SIZE was
    * added in 1.8.1); and always will be %FALSE for %PANGO_ATTR_SIZE and %TRUE
    * for %PANGO_ATTR_ABSOLUTE_SIZE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def absolute_=(value: UInt /* None */ ): Unit = (!raw).absolute_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )
end AttrSize

object AttrSize:
  def fromRaw(ptr: Ptr[PangoAttrSize]): AttrSize = new AttrSize(ptr)
end AttrSize
