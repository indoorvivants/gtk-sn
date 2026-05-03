package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.NothingAction
import sn.gnome.gtk4.fluent.ShortcutAction
import sn.gnome.gtk4.internal.GtkNothingAction

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkShortcutAction` that does nothing.
  */
class NothingAction(raw: Ptr[GtkNothingAction])
    extends ShortcutAction(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end NothingAction

object NothingAction:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the nothing action.
    *
    * This is an action that does nothing and where activating it always fails.
    */
  def get(): NothingAction /* None */ = new NothingAction(
    gtk_nothing_action_get().asInstanceOf
  )

end NothingAction
