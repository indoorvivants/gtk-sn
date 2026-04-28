package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.internal.GdkEventSequence
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.Gesture
import sn.gnome.gtk4.internal.GtkGestureSingle

class GestureSingle(raw: Ptr[GtkGestureSingle])
    extends Gesture(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getButton(): UInt = gtk_gesture_single_get_button(
    this.raw.asInstanceOf
  ).value

  def getCurrentButton(): UInt = gtk_gesture_single_get_current_button(
    this.raw.asInstanceOf
  ).value

  def getCurrentSequence(): Ptr[GdkEventSequence] =
    gtk_gesture_single_get_current_sequence(this.raw.asInstanceOf)

  def getExclusive(): Boolean =
    gtk_gesture_single_get_exclusive(this.raw.asInstanceOf).value.!=(0)

  def getTouchOnly(): Boolean =
    gtk_gesture_single_get_touch_only(this.raw.asInstanceOf).value.!=(0)

  def setButton(button: UInt): Unit =
    gtk_gesture_single_set_button(this.raw.asInstanceOf, guint(button))

  def setExclusive(exclusive: Boolean): Unit = gtk_gesture_single_set_exclusive(
    this.raw.asInstanceOf,
    gboolean(gint((if exclusive == true then 1 else 0)))
  )

  def setTouchOnly(touch_only: Boolean): Unit =
    gtk_gesture_single_set_touch_only(
      this.raw.asInstanceOf,
      gboolean(gint((if touch_only == true then 1 else 0)))
    )

end GestureSingle
