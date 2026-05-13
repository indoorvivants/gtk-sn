package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.ShortcutAction
import sn.gnome.gtk4.internal.GtkNamedAction

/** A `GtkShortcutAction` that activates an action by name.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class NamedAction private[gnome] (raw: Ptr[GtkNamedAction])
    extends ShortcutAction(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the name of the action that will be activated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActionName()(using Zone): String /* None */ =
    fromCString(
      gtk_named_action_get_action_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNamedAction]]
      ).asInstanceOf
    )
  end getActionName

end NamedAction

object NamedAction:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkNamedAction])(using Runtime) =
    summon[Runtime].getOrCreate[NamedAction](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new NamedAction(ptr)
    )

  /** Creates an action that when activated, activates the named action on the
    * widget.
    *
    * It also passes the given arguments to it.
    *
    * See [method@Gtk.Widget.insert_action_group] for how to add actions to
    * widgets.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      name: String /* Some(CString) */
  )(using Zone, Runtime): NamedAction =
    val raw: Ptr[Byte] = gtk_named_action_new(toCString(name)).asInstanceOf
    summon[Runtime].getOrCreate[NamedAction](
      raw,
      r => NamedAction.applyUnsafe(r.asInstanceOf)
    )
  end apply
end NamedAction
