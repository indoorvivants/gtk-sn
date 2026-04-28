package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.LayoutChild
import sn.gnome.gtk4.internal.GtkOverlayLayoutChild

class OverlayLayoutChild(raw: Ptr[GtkOverlayLayoutChild])
    extends LayoutChild(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getClipOverlay(): Boolean =
    gtk_overlay_layout_child_get_clip_overlay(this.raw.asInstanceOf).value.!=(0)

  def getMeasure(): Boolean =
    gtk_overlay_layout_child_get_measure(this.raw.asInstanceOf).value.!=(0)

  def setClipOverlay(clip_overlay: Boolean): Unit =
    gtk_overlay_layout_child_set_clip_overlay(
      this.raw.asInstanceOf,
      gboolean(gint((if clip_overlay == true then 1 else 0)))
    )

  def setMeasure(measure: Boolean): Unit = gtk_overlay_layout_child_set_measure(
    this.raw.asInstanceOf,
    gboolean(gint((if measure == true then 1 else 0)))
  )

end OverlayLayoutChild
