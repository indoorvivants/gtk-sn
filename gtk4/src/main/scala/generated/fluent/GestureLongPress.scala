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
import sn.gnome.gtk4.internal.GtkGestureLongPress
import sn.gnome.runtime.*

/** `GtkGestureLongPress` is a `GtkGesture` for long presses.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class GestureLongPress private[gnome] (raw: Ptr[GtkGestureLongPress])
    extends GestureSingle(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the delay factor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDelayFactor(): Double /* None */ =
    gtk_gesture_long_press_get_delay_factor(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGestureLongPress]]
    )
  end getDelayFactor

  /** Applies the given delay factor.
    *
    * The default long press time will be multiplied by this value. Valid values
    * are in the range [0.5..2.0].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDelayFactor(
      delay_factor: Double /* Some(Double) */
  ): Unit /* None */ =
    gtk_gesture_long_press_set_delay_factor(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGestureLongPress]],
      delay_factor
    )
  end setDelayFactor

  /** Emitted whenever a press moved too far, or was released before
    * [signal@Gtk.GestureLongPress::pressed] happened.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onCancelled(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkGestureLongPress],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"cancelled"
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
  end onCancelled

  /** Emitted whenever a press goes unmoved/unreleased longer than what the GTK
    * defaults tell.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal pressed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))"
  )
  private def onPressed = ???

end GestureLongPress

object GestureLongPress:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkGestureLongPress])(using Runtime) =
    summon[Runtime].getOrCreate[GestureLongPress](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new GestureLongPress(ptr)
    )

  /** Returns a newly created `GtkGesture` that recognizes long presses.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): GestureLongPress =
    val raw: Ptr[Byte] = gtk_gesture_long_press_new().asInstanceOf
    summon[Runtime].getOrCreate[GestureLongPress](
      raw,
      r => GestureLongPress.applyUnsafe(r.asInstanceOf)
    )
  end apply
end GestureLongPress
