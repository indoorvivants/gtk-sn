package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.Gesture
import sn.gnome.gtk4.internal.GtkGestureSingle

/** `GtkGestureSingle` is a `GtkGestures` subclass optimized for singe-touch and
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class GestureSingle private[gnome] (raw: Ptr[GtkGestureSingle])
    extends Gesture(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the button number @gesture listens for.
    *
    * If this is 0, the gesture reacts to any button press.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getButton(): UInt /* None */ =
    gtk_gesture_single_get_button(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGestureSingle]]
    ).value
  end getButton

  /** Returns the button number currently interacting with @gesture, or 0 if
    * there is none.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCurrentButton(): UInt /* None */ =
    gtk_gesture_single_get_current_button(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGestureSingle]]
    ).value
  end getCurrentButton

  /** Returns the event sequence currently interacting with @gesture.
    *
    * This is only meaningful if [method@Gtk.Gesture.is_active] returns %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_current_sequence/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gdk.EventSequence), @type -> DataRecord(GdkEventSequence*)))"
  )
  private def getCurrentSequence__ = ???

  /** Gets whether a gesture is exclusive.
    *
    * For more information, see [method@Gtk.GestureSingle.set_exclusive].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExclusive(): Boolean /* None */ =
    gtk_gesture_single_get_exclusive(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGestureSingle]]
    ).value.!=(0)
  end getExclusive

  /** Returns %TRUE if the gesture is only triggered by touch events.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTouchOnly(): Boolean /* None */ =
    gtk_gesture_single_get_touch_only(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGestureSingle]]
    ).value.!=(0)
  end getTouchOnly

  /** Sets the button number @gesture listens to.
    *
    * If non-0, every button press from a different button number will be
    * ignored. Touch events implicitly match with button 1.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setButton(
      button: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_gesture_single_set_button(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGestureSingle]],
      guint(button)
    )
  end setButton

  /** Sets whether @gesture is exclusive.
    *
    * An exclusive gesture will only handle pointer and "pointer emulated" touch
    * events, so at any given time, there is only one sequence able to interact
    * with those.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setExclusive(
      exclusive: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_gesture_single_set_exclusive(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGestureSingle]],
      gboolean(gint((if exclusive == true then 1 else 0)))
    )
  end setExclusive

  /** Sets whether to handle only touch events.
    *
    * If @touch_only is %TRUE, @gesture will only handle events of type
    * %GDK_TOUCH_BEGIN, %GDK_TOUCH_UPDATE or %GDK_TOUCH_END. If %FALSE, mouse
    * events will be handled too.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTouchOnly(
      touch_only: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_gesture_single_set_touch_only(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGestureSingle]],
      gboolean(gint((if touch_only == true then 1 else 0)))
    )
  end setTouchOnly

end GestureSingle

object GestureSingle:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkGestureSingle])(using Runtime) =
    summon[Runtime].getOrCreate[GestureSingle](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new GestureSingle(ptr)
    )

end GestureSingle
