package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkBaselinePosition
import sn.gnome.gtk4.internal.GtkBox
import sn.gnome.gtk4.internal.GtkOrientation

class Box(raw: Ptr[GtkBox])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def append(child: Widget): Unit = gtk_box_append(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def getBaselineChild(): Int = gtk_box_get_baseline_child(
    this.raw.asInstanceOf
  )

  def getBaselinePosition(): GtkBaselinePosition =
    gtk_box_get_baseline_position(this.raw.asInstanceOf)

  def getHomogeneous(): Boolean =
    gtk_box_get_homogeneous(this.raw.asInstanceOf).value.!=(0)

  def getSpacing(): Int = gtk_box_get_spacing(this.raw.asInstanceOf)

  def insertChildAfter(child: Widget, sibling: Widget): Unit =
    gtk_box_insert_child_after(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      sibling.getUnsafeRawPointer().asInstanceOf
    )

  def prepend(child: Widget): Unit = gtk_box_prepend(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def remove(child: Widget): Unit = gtk_box_remove(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def reorderChildAfter(child: Widget, sibling: Widget): Unit =
    gtk_box_reorder_child_after(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      sibling.getUnsafeRawPointer().asInstanceOf
    )

  def setBaselineChild(child: Int): Unit =
    gtk_box_set_baseline_child(this.raw.asInstanceOf, child)

  def setBaselinePosition(position: GtkBaselinePosition): Unit =
    gtk_box_set_baseline_position(this.raw.asInstanceOf, position)

  def setHomogeneous(homogeneous: Boolean): Unit = gtk_box_set_homogeneous(
    this.raw.asInstanceOf,
    gboolean(gint((if homogeneous == true then 1 else 0)))
  )

  def setSpacing(spacing: Int): Unit =
    gtk_box_set_spacing(this.raw.asInstanceOf, spacing)

end Box

object Box:
  def apply(orientation: GtkOrientation, spacing: Int): Box = new Box(
    gtk_box_new(orientation, spacing).asInstanceOf
  )
end Box
