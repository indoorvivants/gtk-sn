package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gchar, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.GestureSingle
import sn.gnome.gtk4.internal.GtkGestureClick

/** `GtkGestureClick` is a `GtkGesture` implementation for clicks.
  *
  * It is able to recognize multiple clicks on a nearby zone, which can be
  * listened for through the [signal@Gtk.GestureClick::pressed] signal. Whenever
  * time or distance between clicks exceed the GTK defaults,
  * [signal@Gtk.GestureClick::stopped] is emitted, and the click counter is
  * reset.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class GestureClick(raw: Ptr[GtkGestureClick])
    extends GestureSingle(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Emitted whenever a button or touch press happens.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal pressed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))"
  )
  private def onPressed = ???

  /** Emitted when a button or touch is released.
    *
    * @n_press
    *   will report the number of press that is paired to this event, note that
    *   [signal@Gtk.GestureClick::stopped] may have been emitted between the
    *   press and its release, @n_press will only start over at the next press.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal released]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))"
  )
  private def onReleased = ???

  /** Emitted whenever any time/distance threshold has been exceeded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onStopped(f: EmptyTuple.type => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkGestureClick],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"stopped"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onStopped

  /** Emitted whenever the gesture receives a release event that had no previous
    * corresponding press.
    *
    * Due to implicit grabs, this can only happen on situations where input is
    * grabbed elsewhere mid-press or the pressed widget voluntarily relinquishes
    * its implicit grab.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal unpaired-release]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))"
  )
  private def onUnpairedRelease = ???

end GestureClick

object GestureClick:
  /** Returns a newly created `GtkGesture` that recognizes single and multiple
    * presses.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): GestureClick = new GestureClick(
    gtk_gesture_click_new().asInstanceOf
  )
end GestureClick
