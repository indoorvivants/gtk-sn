package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.{NothingAction, ShortcutAction}
import sn.gnome.gtk4.internal.GtkNothingAction

/** A `GtkShortcutAction` that does nothing.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class NothingAction(raw: Ptr[GtkNothingAction])
    extends ShortcutAction(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end NothingAction

object NothingAction:
  /** Gets the nothing action.
    *
    * This is an action that does nothing and where activating it always fails.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def get(): NothingAction /* Some(Ptr[GtkShortcutAction]) */ =
    new NothingAction(gtk_nothing_action_get().asInstanceOf)

end NothingAction
