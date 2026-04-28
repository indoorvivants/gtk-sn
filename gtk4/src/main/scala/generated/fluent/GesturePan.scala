package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.GestureDrag
import sn.gnome.gtk4.internal.GtkGesturePan
import sn.gnome.gtk4.internal.GtkOrientation

class GesturePan(raw: Ptr[GtkGesturePan]) extends GestureDrag(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getOrientation(): GtkOrientation = gtk_gesture_pan_get_orientation(
    this.raw.asInstanceOf
  )

  def setOrientation(orientation: GtkOrientation): Unit =
    gtk_gesture_pan_set_orientation(this.raw.asInstanceOf, orientation)

end GesturePan

object GesturePan:
  def apply(orientation: GtkOrientation): GesturePan = new GesturePan(
    gtk_gesture_pan_new(orientation).asInstanceOf
  )
end GesturePan
