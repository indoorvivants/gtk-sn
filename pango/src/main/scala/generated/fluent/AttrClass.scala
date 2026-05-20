package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.pango.AttrType
import sn.gnome.pango.internal.PangoAttrClass

/** The `PangoAttrClass` structure stores the type and operations for a
  * particular type of attribute.
  *
  * The functions in this structure should not be called directly. Instead, one
  * should use the wrapper functions provided for `PangoAttribute`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AttrClass private[gnome] (raw: Ptr[PangoAttrClass]):

  def getUnsafeRawPointer(): Ptr[PangoAttrClass] = this.raw

  /** the type ID for this attribute
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def `type`: sn.gnome.pango.AttrType /* None */ =
    (!raw).`type`.asInstanceOf[PangoAttrType]

  /** the type ID for this attribute
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def type_=(value: sn.gnome.pango.AttrType /* None */ ): Unit =
    (!raw).type_=(value.raw.asInstanceOf[PangoAttrType])
  @annotation.compileTimeOnly("[field copy]: Field is missing <type>")
  private def copy__ = ???
  @annotation.compileTimeOnly("[field destroy]: Field is missing <type>")
  private def destroy__ = ???
  @annotation.compileTimeOnly("[field equal]: Field is missing <type>")
  private def equal__ = ???
end AttrClass

object AttrClass:
  def fromRaw(ptr: Ptr[PangoAttrClass]): AttrClass = new AttrClass(ptr)
end AttrClass
