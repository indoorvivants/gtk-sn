package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.GestureSingle
import sn.gnome.gtk4.internal.GtkGestureLongPress

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkGestureLongPress` is a `GtkGesture` for long presses.
  *
  * This gesture is also known as “Press and Hold”.
  *
  * When the timeout is exceeded, the gesture is triggering the
  * [signal@Gtk.GestureLongPress::pressed] signal.
  *
  * If the touchpoint is lifted before the timeout passes, or if it drifts too
  * far of the initial press point, the [signal@Gtk.GestureLongPress::cancelled]
  * signal will be emitted.
  *
  * How long the timeout is before the ::pressed signal gets emitted is
  * determined by the [property@Gtk.Settings:gtk-long-press-time] setting. It
  * can be modified by the [property@Gtk.GestureLongPress:delay-factor]
  * property.
  */
class GestureLongPress(raw: Ptr[GtkGestureLongPress])
    extends GestureSingle(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the delay factor.
    */
  def getDelayFactor(): Double = gtk_gesture_long_press_get_delay_factor(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Applies the given delay factor.
    *
    * The default long press time will be multiplied by this value. Valid values
    * are in the range [0.5..2.0].
    */
  def setDelayFactor(delay_factor: Double): Unit =
    gtk_gesture_long_press_set_delay_factor(this.raw.asInstanceOf, delay_factor)

end GestureLongPress

object GestureLongPress:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a newly created `GtkGesture` that recognizes long presses.
    */
  def apply(): GestureLongPress = new GestureLongPress(
    gtk_gesture_long_press_new().asInstanceOf
  )
end GestureLongPress
