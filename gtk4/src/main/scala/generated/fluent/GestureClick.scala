package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.GestureSingle
import sn.gnome.gtk4.internal.GtkGestureClick

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkGestureClick` is a `GtkGesture` implementation for clicks.
  *
  * It is able to recognize multiple clicks on a nearby zone, which can be
  * listened for through the [signal@Gtk.GestureClick::pressed] signal. Whenever
  * time or distance between clicks exceed the GTK defaults,
  * [signal@Gtk.GestureClick::stopped] is emitted, and the click counter is
  * reset.
  */
class GestureClick(raw: Ptr[GtkGestureClick])
    extends GestureSingle(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end GestureClick

object GestureClick:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a newly created `GtkGesture` that recognizes single and multiple
    * presses.
    */
  def apply(): GestureClick = new GestureClick(
    gtk_gesture_click_new().asInstanceOf
  )
end GestureClick
