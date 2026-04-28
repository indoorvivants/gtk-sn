package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkOverlay

class Overlay(raw: Ptr[GtkOverlay])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addOverlay(widget: Widget): Unit = gtk_overlay_add_overlay(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  )

  def getChild(): Widget = new Widget(
    gtk_overlay_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getClipOverlay(widget: Widget): Boolean = gtk_overlay_get_clip_overlay(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def getMeasureOverlay(widget: Widget): Boolean =
    gtk_overlay_get_measure_overlay(
      this.raw.asInstanceOf,
      widget.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  def removeOverlay(widget: Widget): Unit = gtk_overlay_remove_overlay(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  )

  def setChild(child: Widget): Unit = gtk_overlay_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setClipOverlay(widget: Widget, clip_overlay: Boolean): Unit =
    gtk_overlay_set_clip_overlay(
      this.raw.asInstanceOf,
      widget.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if clip_overlay == true then 1 else 0)))
    )

  def setMeasureOverlay(widget: Widget, measure: Boolean): Unit =
    gtk_overlay_set_measure_overlay(
      this.raw.asInstanceOf,
      widget.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if measure == true then 1 else 0)))
    )

end Overlay

object Overlay:
  def apply(): Overlay = new Overlay(gtk_overlay_new().asInstanceOf)
end Overlay
