package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.{ActivateAction, ShortcutAction}
import sn.gnome.gtk4.internal.GtkActivateAction

/** A `GtkShortcutAction` that calls gtk_widget_activate().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ActivateAction(raw: Ptr[GtkActivateAction])
    extends ShortcutAction(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ActivateAction

object ActivateAction:
  /** Gets the activate action.
    *
    * This is an action that calls gtk_widget_activate() on the given widget
    * upon activation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def get(): ActivateAction /* Some(Ptr[GtkShortcutAction]) */ =
    new ActivateAction(gtk_activate_action_get().asInstanceOf)

end ActivateAction
