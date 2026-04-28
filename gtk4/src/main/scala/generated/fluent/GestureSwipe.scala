package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.GestureSingle
import sn.gnome.gtk4.internal.GtkGestureSwipe

class GestureSwipe(raw: Ptr[GtkGestureSwipe])
    extends GestureSingle(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  // Method get_velocity contains an OUT parameter, which is not supported yet

end GestureSwipe

object GestureSwipe:
  def apply(): GestureSwipe = new GestureSwipe(
    gtk_gesture_swipe_new().asInstanceOf
  )
end GestureSwipe
