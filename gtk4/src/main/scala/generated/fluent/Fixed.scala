package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gsk4.internal.GskTransform
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkFixed

class Fixed(raw: Ptr[GtkFixed])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  // Method get_child_position contains an OUT parameter, which is not supported yet

  def getChildTransform(widget: Widget): Ptr[GskTransform] =
    gtk_fixed_get_child_transform(
      this.raw.asInstanceOf,
      widget.getUnsafeRawPointer().asInstanceOf
    )

  def move(widget: Widget, x: Double, y: Double): Unit = gtk_fixed_move(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf,
    x,
    y
  )

  def put(widget: Widget, x: Double, y: Double): Unit = gtk_fixed_put(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf,
    x,
    y
  )

  def remove(widget: Widget): Unit = gtk_fixed_remove(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  )

  def setChildTransform(widget: Widget, transform: Ptr[GskTransform]): Unit =
    gtk_fixed_set_child_transform(
      this.raw.asInstanceOf,
      widget.getUnsafeRawPointer().asInstanceOf,
      transform
    )

end Fixed

object Fixed:
  def apply(): Fixed = new Fixed(gtk_fixed_new().asInstanceOf)
end Fixed
