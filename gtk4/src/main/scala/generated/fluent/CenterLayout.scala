package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.LayoutManager
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkBaselinePosition
import sn.gnome.gtk4.internal.GtkCenterLayout
import sn.gnome.gtk4.internal.GtkOrientation

class CenterLayout(raw: Ptr[GtkCenterLayout])
    extends LayoutManager(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getBaselinePosition(): GtkBaselinePosition =
    gtk_center_layout_get_baseline_position(this.raw.asInstanceOf)

  def getCenterWidget(): Widget = new Widget(
    gtk_center_layout_get_center_widget(this.raw.asInstanceOf).asInstanceOf
  )

  def getEndWidget(): Widget = new Widget(
    gtk_center_layout_get_end_widget(this.raw.asInstanceOf).asInstanceOf
  )

  def getOrientation(): GtkOrientation = gtk_center_layout_get_orientation(
    this.raw.asInstanceOf
  )

  def getShrinkCenterLast(): Boolean =
    gtk_center_layout_get_shrink_center_last(this.raw.asInstanceOf).value.!=(0)

  def getStartWidget(): Widget = new Widget(
    gtk_center_layout_get_start_widget(this.raw.asInstanceOf).asInstanceOf
  )

  def setBaselinePosition(baseline_position: GtkBaselinePosition): Unit =
    gtk_center_layout_set_baseline_position(
      this.raw.asInstanceOf,
      baseline_position
    )

  def setCenterWidget(widget: Widget): Unit =
    gtk_center_layout_set_center_widget(
      this.raw.asInstanceOf,
      widget.getUnsafeRawPointer().asInstanceOf
    )

  def setEndWidget(widget: Widget): Unit = gtk_center_layout_set_end_widget(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  )

  def setOrientation(orientation: GtkOrientation): Unit =
    gtk_center_layout_set_orientation(this.raw.asInstanceOf, orientation)

  def setShrinkCenterLast(shrink_center_last: Boolean): Unit =
    gtk_center_layout_set_shrink_center_last(
      this.raw.asInstanceOf,
      gboolean(gint((if shrink_center_last == true then 1 else 0)))
    )

  def setStartWidget(widget: Widget): Unit = gtk_center_layout_set_start_widget(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  )

end CenterLayout

object CenterLayout:
  def apply(): CenterLayout = new CenterLayout(
    gtk_center_layout_new().asInstanceOf
  )
end CenterLayout
