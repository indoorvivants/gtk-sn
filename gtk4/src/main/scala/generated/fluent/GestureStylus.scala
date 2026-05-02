package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.DeviceTool
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.GestureSingle
import sn.gnome.gtk4.internal.GtkGestureStylus

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkGestureStylus` is a `GtkGesture` specific to stylus input.
  *
  * The provided signals just relay the basic information of the stylus events.
  */
class GestureStylus(raw: Ptr[GtkGestureStylus])
    extends GestureSingle(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the current values for the requested @axes.
    *
    * This function must be called from the handler of one of the
    * [signal@Gtk.GestureStylus::down], [signal@Gtk.GestureStylus::motion],
    * [signal@Gtk.GestureStylus::up] or [signal@Gtk.GestureStylus::proximity]
    * signals.
    */
  @annotation.compileTimeOnly(
    "Method get_axes contains an OUT parameter, which is not supported yet"
  )
  private def getAxes__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the current value for the requested @axis.
    *
    * This function must be called from the handler of one of the
    * [signal@Gtk.GestureStylus::down], [signal@Gtk.GestureStylus::motion],
    * [signal@Gtk.GestureStylus::up] or [signal@Gtk.GestureStylus::proximity]
    * signals.
    */
  @annotation.compileTimeOnly(
    "Method get_axis contains an OUT parameter, which is not supported yet"
  )
  private def getAxis__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the accumulated backlog of tracking information.
    *
    * By default, GTK will limit rate of input events. On stylus input where
    * accuracy of strokes is paramount, this function returns the accumulated
    * coordinate/timing state before the emission of the current
    * [Gtk.GestureStylus::motion] signal.
    *
    * This function may only be called within a
    * [signal@Gtk.GestureStylus::motion] signal handler, the state given in this
    * signal and obtainable through [method@Gtk.GestureStylus.get_axis] express
    * the latest (most up-to-date) state in motion history.
    *
    * The @backlog is provided in chronological order.
    */
  @annotation.compileTimeOnly(
    "Method get_backlog contains an OUT parameter, which is not supported yet"
  )
  private def getBacklog__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GdkDeviceTool` currently driving input through this gesture.
    *
    * This function must be called from the handler of one of the
    * [signal@Gtk.GestureStylus::down], [signal@Gtk.GestureStylus::motion],
    * [signal@Gtk.GestureStylus::up] or [signal@Gtk.GestureStylus::proximity]
    * signals.
    */
  def getDeviceTool(): DeviceTool /* None */ = new DeviceTool(
    gtk_gesture_stylus_get_device_tool(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the gesture is for styluses only.
    *
    * Stylus-only gestures will signal events exclusively from stylus input
    * devices.
    */
  def getStylusOnly(): Boolean /* None */ =
    gtk_gesture_stylus_get_stylus_only(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the state of stylus-only
    *
    * If true, the gesture will exclusivly handle events from stylus input
    * deivces, otherwise it'll handle events from any pointing device.
    */
  def setStylusOnly(
      stylus_only: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_gesture_stylus_set_stylus_only(
    this.raw.asInstanceOf,
    gboolean(gint((if stylus_only == true then 1 else 0)))
  )

end GestureStylus

object GestureStylus:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkGestureStylus`.
    */
  def apply(): GestureStylus = new GestureStylus(
    gtk_gesture_stylus_new().asInstanceOf
  )
end GestureStylus
