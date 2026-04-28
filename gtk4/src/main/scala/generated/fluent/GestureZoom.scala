package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Gesture
import sn.gnome.gtk4.internal.GtkGestureZoom

class GestureZoom(raw: Ptr[GtkGestureZoom]) extends Gesture(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getScaleDelta(): Double = gtk_gesture_zoom_get_scale_delta(
    this.raw.asInstanceOf
  )

end GestureZoom

object GestureZoom:
  def apply(): GestureZoom = new GestureZoom(
    gtk_gesture_zoom_new().asInstanceOf
  )
end GestureZoom
