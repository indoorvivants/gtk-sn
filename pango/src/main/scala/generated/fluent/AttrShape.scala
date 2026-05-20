package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gpointer
import sn.gnome.pango.{Attribute, Rectangle}
import sn.gnome.pango.internal.PangoAttrShape

/** The `PangoAttrShape` structure is used to represent attributes which impose
  * shape restrictions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AttrShape private[gnome] (raw: Ptr[PangoAttrShape]):

  def getUnsafeRawPointer(): Ptr[PangoAttrShape] = this.raw

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

  /** the ink rectangle to restrict to
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def inkRect: sn.gnome.pango.Rectangle /* None */ =
    (!raw).ink_rect.asInstanceOf[PangoRectangle]

  /** the ink rectangle to restrict to
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def inkRect_=(value: sn.gnome.pango.Rectangle /* None */ ): Unit =
    (!raw).ink_rect_=(
      value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[PangoRectangle]
    )

  /** the logical rectangle to restrict to
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def logicalRect: sn.gnome.pango.Rectangle /* None */ =
    (!raw).logical_rect.asInstanceOf[PangoRectangle]

  /** the logical rectangle to restrict to
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def logicalRect_=(value: sn.gnome.pango.Rectangle /* None */ ): Unit =
    (!raw).logical_rect_=(
      value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[PangoRectangle]
    )

  /** user data set (see [func@Pango.AttrShape.new_with_data])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def data: Ptr[Byte] /* None */ =
    (!raw).data.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]

  /** user data set (see [func@Pango.AttrShape.new_with_data])
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def data_=(value: Ptr[Byte] /* None */ ): Unit = (!raw).data_=(
    gpointer(value).asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
  )

  /** copy function for the user data
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field copy_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AttrDataCopyFunc), @type -> DataRecord(PangoAttrDataCopyFunc)))"
  )
  private def copyFunc__ = ???

  /** destroy function for the user data
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field destroy_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DestroyNotify), @type -> DataRecord(GDestroyNotify)))"
  )
  private def destroyFunc__ = ???
end AttrShape

object AttrShape:
  def fromRaw(ptr: Ptr[PangoAttrShape]): AttrShape = new AttrShape(ptr)
end AttrShape
