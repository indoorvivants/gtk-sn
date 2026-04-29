package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.ShortcutAction
import sn.gnome.gtk4.internal.GtkActivateAction

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkShortcutAction` that calls gtk_widget_activate().
  */
class ActivateAction(raw: Ptr[GtkActivateAction])
    extends ShortcutAction(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ActivateAction
