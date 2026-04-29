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

  @annotation.compileTimeOnly(
    "Method get_axes contains an OUT parameter, which is not supported yet"
  )
  def getAxes(using DummyImplicit) = ???

  @annotation.compileTimeOnly(
    "Method get_axis contains an OUT parameter, which is not supported yet"
  )
  def getAxis(using DummyImplicit) = ???

  @annotation.compileTimeOnly(
    "Method get_backlog contains an OUT parameter, which is not supported yet"
  )
  def getBacklog(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GdkDeviceTool` currently driving input through this gesture.
    *
    * This function must be called from the handler of one of the
    * [signal@Gtk.GestureStylus::down], [signal@Gtk.GestureStylus::motion],
    * [signal@Gtk.GestureStylus::up] or [signal@Gtk.GestureStylus::proximity]
    * signals.
    */
  def getDeviceTool(): DeviceTool = new DeviceTool(
    gtk_gesture_stylus_get_device_tool(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the gesture is for styluses only.
    *
    * Stylus-only gestures will signal events exclusively from stylus input
    * devices.
    */
  def getStylusOnly(): Boolean =
    gtk_gesture_stylus_get_stylus_only(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the state of stylus-only
    *
    * If true, the gesture will exclusivly handle events from stylus input
    * deivces, otherwise it'll handle events from any pointing device.
    */
  def setStylusOnly(stylus_only: Boolean): Unit =
    gtk_gesture_stylus_set_stylus_only(
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
