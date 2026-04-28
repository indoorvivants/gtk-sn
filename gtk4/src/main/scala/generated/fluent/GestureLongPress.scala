package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.GestureSingle
import sn.gnome.gtk4.internal.GtkGestureLongPress

class GestureLongPress(raw: Ptr[GtkGestureLongPress])
    extends GestureSingle(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getDelayFactor(): Double = gtk_gesture_long_press_get_delay_factor(
    this.raw.asInstanceOf
  )

  def setDelayFactor(delay_factor: Double): Unit =
    gtk_gesture_long_press_set_delay_factor(this.raw.asInstanceOf, delay_factor)

end GestureLongPress

object GestureLongPress:
  def apply(): GestureLongPress = new GestureLongPress(
    gtk_gesture_long_press_new().asInstanceOf
  )
end GestureLongPress
