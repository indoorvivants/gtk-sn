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
import sn.gnome.gtk4.internal.GtkCenterBox

class CenterBox(raw: Ptr[GtkCenterBox])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getBaselinePosition(): GtkBaselinePosition =
    gtk_center_box_get_baseline_position(this.raw.asInstanceOf)

  def getCenterWidget(): Widget = new Widget(
    gtk_center_box_get_center_widget(this.raw.asInstanceOf).asInstanceOf
  )

  def getEndWidget(): Widget = new Widget(
    gtk_center_box_get_end_widget(this.raw.asInstanceOf).asInstanceOf
  )

  def getShrinkCenterLast(): Boolean =
    gtk_center_box_get_shrink_center_last(this.raw.asInstanceOf).value.!=(0)

  def getStartWidget(): Widget = new Widget(
    gtk_center_box_get_start_widget(this.raw.asInstanceOf).asInstanceOf
  )

  def setBaselinePosition(position: GtkBaselinePosition): Unit =
    gtk_center_box_set_baseline_position(this.raw.asInstanceOf, position)

  def setCenterWidget(child: Widget): Unit = gtk_center_box_set_center_widget(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setEndWidget(child: Widget): Unit = gtk_center_box_set_end_widget(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setShrinkCenterLast(shrink_center_last: Boolean): Unit =
    gtk_center_box_set_shrink_center_last(
      this.raw.asInstanceOf,
      gboolean(gint((if shrink_center_last == true then 1 else 0)))
    )

  def setStartWidget(child: Widget): Unit = gtk_center_box_set_start_widget(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

end CenterBox

object CenterBox:
  def apply(): CenterBox = new CenterBox(gtk_center_box_new().asInstanceOf)
end CenterBox
