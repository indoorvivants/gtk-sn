package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.DeviceTool
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.GestureSingle
import sn.gnome.gtk4.internal.GtkGestureStylus

class GestureStylus(raw: Ptr[GtkGestureStylus])
    extends GestureSingle(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  // Method get_axes contains an array parameter, which is not supported yet

  // Method get_axis contains an OUT parameter, which is not supported yet

  // Method get_backlog contains an array parameter, which is not supported yet

  def getDeviceTool(): DeviceTool = new DeviceTool(
    gtk_gesture_stylus_get_device_tool(this.raw.asInstanceOf).asInstanceOf
  )

  def getStylusOnly(): Boolean =
    gtk_gesture_stylus_get_stylus_only(this.raw.asInstanceOf).value.!=(0)

  def setStylusOnly(stylus_only: Boolean): Unit =
    gtk_gesture_stylus_set_stylus_only(
      this.raw.asInstanceOf,
      gboolean(gint((if stylus_only == true then 1 else 0)))
    )

end GestureStylus

object GestureStylus:
  def apply(): GestureStylus = new GestureStylus(
    gtk_gesture_stylus_new().asInstanceOf
  )
end GestureStylus
