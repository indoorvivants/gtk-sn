package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.LayoutChild
import sn.gnome.gtk4.internal.GtkFixedLayoutChild

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkLayoutChild` subclass for children in a `GtkFixedLayout`.
  */
class FixedLayoutChild(raw: Ptr[GtkFixedLayoutChild])
    extends LayoutChild(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the transformation of the child.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gsk.Transform), @type -> DataRecord(GskTransform*)))"
  )
  def getTransform__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the transformation of the child of a `GtkFixedLayout`.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gsk.Transform), @type -> DataRecord(GskTransform*)))"
  )
  def setTransform__ = ???

end FixedLayoutChild
