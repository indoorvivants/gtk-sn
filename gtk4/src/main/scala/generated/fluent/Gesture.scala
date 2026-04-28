package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Device
import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkEventSequence
import sn.gnome.glib.internal.GList
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.fluent.Gesture
import sn.gnome.gtk4.internal.GtkEventSequenceState
import sn.gnome.gtk4.internal.GtkGesture

class Gesture(raw: Ptr[GtkGesture]) extends EventController(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  // Method get_bounding_box contains an OUT parameter, which is not supported yet

  // Method get_bounding_box_center contains an OUT parameter, which is not supported yet

  def getDevice(): Device = new Device(
    gtk_gesture_get_device(this.raw.asInstanceOf).asInstanceOf
  )

  def getGroup(): Ptr[GList] = gtk_gesture_get_group(this.raw.asInstanceOf)

  def getLastEvent(sequence: Ptr[GdkEventSequence]): Event = new Event(
    gtk_gesture_get_last_event(this.raw.asInstanceOf, sequence).asInstanceOf
  )

  def getLastUpdatedSequence(): Ptr[GdkEventSequence] =
    gtk_gesture_get_last_updated_sequence(this.raw.asInstanceOf)

  // Method get_point contains an OUT parameter, which is not supported yet

  def getSequenceState(sequence: Ptr[GdkEventSequence]): GtkEventSequenceState =
    gtk_gesture_get_sequence_state(this.raw.asInstanceOf, sequence)

  def getSequences(): Ptr[GList] = gtk_gesture_get_sequences(
    this.raw.asInstanceOf
  )

  def group(gesture: Gesture): Unit = gtk_gesture_group(
    this.raw.asInstanceOf,
    gesture.getUnsafeRawPointer().asInstanceOf
  )

  def handlesSequence(sequence: Ptr[GdkEventSequence]): Boolean =
    gtk_gesture_handles_sequence(this.raw.asInstanceOf, sequence).value.!=(0)

  def isActive(): Boolean =
    gtk_gesture_is_active(this.raw.asInstanceOf).value.!=(0)

  def isGroupedWith(other: Gesture): Boolean = gtk_gesture_is_grouped_with(
    this.raw.asInstanceOf,
    other.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def isRecognized(): Boolean =
    gtk_gesture_is_recognized(this.raw.asInstanceOf).value.!=(0)

  def setSequenceState(
      sequence: Ptr[GdkEventSequence],
      state: GtkEventSequenceState
  ): Boolean =
    gtk_gesture_set_sequence_state(this.raw.asInstanceOf, sequence, state).value
      .!=(0)

  def setState(state: GtkEventSequenceState): Boolean =
    gtk_gesture_set_state(this.raw.asInstanceOf, state).value.!=(0)

  def ungroup(): Unit = gtk_gesture_ungroup(this.raw.asInstanceOf)

end Gesture
