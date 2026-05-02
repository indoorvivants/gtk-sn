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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkGestureSingle` is a `GtkGestures` subclass optimized for singe-touch and
  * mouse gestures.
  *
  * Under interaction, these gestures stick to the first interacting sequence,
  * which is accessible through [method@Gtk.GestureSingle.get_current_sequence]
  * while the gesture is being interacted with.
  *
  * By default gestures react to both %GDK_BUTTON_PRIMARY and touch events.
  * [method@Gtk.GestureSingle.set_touch_only] can be used to change the touch
  * behavior. Callers may also specify a different mouse button number to
  * interact with through [method@Gtk.GestureSingle.set_button], or react to any
  * mouse button by setting it to 0. While the gesture is active, the button
  * being currently pressed can be known through
  * [method@Gtk.GestureSingle.get_current_button].
  */
class GestureSingle(raw: Ptr[GtkGestureSingle])
    extends Gesture(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the button number @gesture listens for.
    *
    * If this is 0, the gesture reacts to any button press.
    */
  def getButton(): UInt /* None */ = gtk_gesture_single_get_button(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the button number currently interacting with @gesture, or 0 if
    * there is none.
    */
  def getCurrentButton(): UInt /* None */ =
    gtk_gesture_single_get_current_button(this.raw.asInstanceOf).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the event sequence currently interacting with @gesture.
    *
    * This is only meaningful if [method@Gtk.Gesture.is_active] returns %TRUE.
    */
  def getCurrentSequence(): Ptr[GdkEventSequence] /* None */ =
    gtk_gesture_single_get_current_sequence(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether a gesture is exclusive.
    *
    * For more information, see [method@Gtk.GestureSingle.set_exclusive].
    */
  def getExclusive(): Boolean /* None */ =
    gtk_gesture_single_get_exclusive(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if the gesture is only triggered by touch events.
    */
  def getTouchOnly(): Boolean /* None */ =
    gtk_gesture_single_get_touch_only(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the button number @gesture listens to.
    *
    * If non-0, every button press from a different button number will be
    * ignored. Touch events implicitly match with button 1.
    */
  def setButton(
      button: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_gesture_single_set_button(this.raw.asInstanceOf, guint(button))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether @gesture is exclusive.
    *
    * An exclusive gesture will only handle pointer and "pointer emulated" touch
    * events, so at any given time, there is only one sequence able to interact
    * with those.
    */
  def setExclusive(
      exclusive: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_gesture_single_set_exclusive(
    this.raw.asInstanceOf,
    gboolean(gint((if exclusive == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether to handle only touch events.
    *
    * If @touch_only is %TRUE, @gesture will only handle events of type
    * %GDK_TOUCH_BEGIN, %GDK_TOUCH_UPDATE or %GDK_TOUCH_END. If %FALSE, mouse
    * events will be handled too.
    */
  def setTouchOnly(
      touch_only: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_gesture_single_set_touch_only(
    this.raw.asInstanceOf,
    gboolean(gint((if touch_only == true then 1 else 0)))
  )

end GestureSingle
