package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.internal.GskTransform
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
  def getTransform(): Ptr[GskTransform] /* None */ =
    gtk_fixed_layout_child_get_transform(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the transformation of the child of a `GtkFixedLayout`.
    */
  def setTransform(
      transform: Ptr[
        GskTransform
      ] /* Some(Ptr[_root_.sn.gnome.gsk4.internal.GskTransform]) */
  ): Unit /* None */ =
    gtk_fixed_layout_child_set_transform(this.raw.asInstanceOf, transform)

end FixedLayoutChild
