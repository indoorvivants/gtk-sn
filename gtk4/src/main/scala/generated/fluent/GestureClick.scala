package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.GestureSingle
import sn.gnome.gtk4.internal.GtkGestureClick

class GestureClick(raw: Ptr[GtkGestureClick])
    extends GestureSingle(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end GestureClick

object GestureClick:
  def apply(): GestureClick = new GestureClick(
    gtk_gesture_click_new().asInstanceOf
  )
end GestureClick
