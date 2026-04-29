package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gpointer
import sn.gnome.gtk4.fluent.ShortcutAction
import sn.gnome.gtk4.internal.GtkCallbackAction
import sn.gnome.gtk4.internal.GtkShortcutFunc

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkShortcutAction` that invokes a callback.
  */
class CallbackAction(raw: Ptr[GtkCallbackAction])
    extends ShortcutAction(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CallbackAction

object CallbackAction:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a custom action that calls the given @callback when activated.
    */
  def apply(
      callback: GtkShortcutFunc,
      data: Ptr[Byte],
      destroy: GDestroyNotify
  ): CallbackAction = new CallbackAction(
    gtk_callback_action_new(callback, gpointer(data), destroy).asInstanceOf
  )
end CallbackAction
