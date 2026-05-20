package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.Requisition
import sn.gnome.gtk4.internal.GtkRequisition

/** A `GtkRequisition` represents the desired size of a widget. See [GtkWidget’s
  * geometry management
  * section](class.Widget.html#height-for-width-geometry-management) for more
  * information.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Requisition private[gnome] (raw: Ptr[GtkRequisition]):

  def getUnsafeRawPointer(): Ptr[GtkRequisition] = this.raw

  /** the widget’s desired width
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def width: Int /* None */ = (!raw).width.asInstanceOf[CInt]

  /** the widget’s desired width
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def width_=(value: Int /* None */ ): Unit =
    (!raw).width_=(value.asInstanceOf[CInt])

  /** the widget’s desired height
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def height: Int /* None */ = (!raw).height.asInstanceOf[CInt]

  /** the widget’s desired height
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def height_=(value: Int /* None */ ): Unit =
    (!raw).height_=(value.asInstanceOf[CInt])

  /** Copies a `GtkRequisition`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.gtk4.Requisition /* None */ =
    sn.gnome.gtk4.Requisition.fromRaw(
      gtk_requisition_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRequisition]]
      )
    )
  end copy

  /** Frees a `GtkRequisition`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    gtk_requisition_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRequisition]]
    )
  end free

end Requisition

object Requisition:
  def fromRaw(ptr: Ptr[GtkRequisition]): Requisition = new Requisition(ptr)
end Requisition
