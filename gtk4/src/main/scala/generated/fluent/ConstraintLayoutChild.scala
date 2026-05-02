package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.LayoutChild
import sn.gnome.gtk4.internal.GtkConstraintLayoutChild

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkLayoutChild` subclass for children in a `GtkConstraintLayout`.
  */
class ConstraintLayoutChild(raw: Ptr[GtkConstraintLayoutChild])
    extends LayoutChild(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ConstraintLayoutChild
