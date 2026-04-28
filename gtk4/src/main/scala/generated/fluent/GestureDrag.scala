package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.GestureSingle
import sn.gnome.gtk4.internal.GtkGestureDrag

class GestureDrag(raw: Ptr[GtkGestureDrag])
    extends GestureSingle(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  // Method get_offset contains an OUT parameter, which is not supported yet

  // Method get_start_point contains an OUT parameter, which is not supported yet

end GestureDrag

object GestureDrag:
  def apply(): GestureDrag = new GestureDrag(
    gtk_gesture_drag_new().asInstanceOf
  )
end GestureDrag
