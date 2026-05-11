package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait Buildable:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Gets the ID of the @buildable object.
    *
    * `GtkBuilder` sets the name based on the ID attribute of the `<object>` tag
    * used to construct the @buildable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBuildableId()(using Zone): String /* None */ =
    fromCString(
      gtk_buildable_get_buildable_id(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkBuildable]]
      ).asInstanceOf
    )
  end getBuildableId

end Buildable

object Buildable:
  class Abstract(raw: Ptr[Byte]) extends Buildable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Buildable
