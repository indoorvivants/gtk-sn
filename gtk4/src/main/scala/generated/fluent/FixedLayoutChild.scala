package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.internal.GskTransform
import sn.gnome.gtk4.fluent.LayoutChild
import sn.gnome.gtk4.internal.GtkFixedLayoutChild

class FixedLayoutChild(raw: Ptr[GtkFixedLayoutChild])
    extends LayoutChild(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getTransform(): Ptr[GskTransform] = gtk_fixed_layout_child_get_transform(
    this.raw.asInstanceOf
  )

  def setTransform(transform: Ptr[GskTransform]): Unit =
    gtk_fixed_layout_child_set_transform(this.raw.asInstanceOf, transform)

end FixedLayoutChild
