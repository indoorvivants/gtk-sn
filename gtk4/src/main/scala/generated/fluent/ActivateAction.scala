package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{ActivateAction, ShortcutAction}
import sn.gnome.gtk4.internal.GtkActivateAction

/** A `GtkShortcutAction` that calls gtk_widget_activate().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ActivateAction private[gnome] (raw: Ptr[GtkActivateAction])
    extends ShortcutAction(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ActivateAction

object ActivateAction:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkActivateAction])(using Runtime) =
    summon[Runtime].getOrCreate[ActivateAction](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ActivateAction(ptr)
    )

  /** Gets the activate action.
    *
    * This is an action that calls gtk_widget_activate() on the given widget
    * upon activation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def get()(using
      Runtime
  ): sn.gnome.gtk4.ActivateAction /* Some(Ptr[GtkShortcutAction]) */ =
    sn.gnome.gtk4.ActivateAction
      .applyUnsafe(gtk_activate_action_get().asInstanceOf)

end ActivateAction
