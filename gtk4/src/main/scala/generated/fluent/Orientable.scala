package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.Orientation

trait Orientable:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Retrieves the orientation of the @orientable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getOrientation(): sn.gnome.gtk4.Orientation /* None */ =
    sn.gnome.gtk4.Orientation.fromRaw(
      gtk_orientable_get_orientation(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkOrientable]]
      )
    )
  end getOrientation

  /** Sets the orientation of the @orientable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setOrientation(
      orientation: sn.gnome.gtk4.Orientation /* Some(GtkOrientation) */
  ): Unit /* None */ =
    gtk_orientable_set_orientation(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkOrientable]],
      orientation.raw
    )
  end setOrientation

end Orientable

object Orientable:
  class Abstract(raw: Ptr[Byte]) extends Orientable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Orientable
