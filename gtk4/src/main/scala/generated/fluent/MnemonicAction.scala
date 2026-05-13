package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{MnemonicAction, ShortcutAction}
import sn.gnome.gtk4.internal.GtkMnemonicAction

/** A `GtkShortcutAction` that calls gtk_widget_mnemonic_activate().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MnemonicAction private[gnome] (raw: Ptr[GtkMnemonicAction])
    extends ShortcutAction(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end MnemonicAction

object MnemonicAction:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkMnemonicAction])(using Runtime) =
    summon[Runtime].getOrCreate[MnemonicAction](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new MnemonicAction(ptr)
    )

  /** Gets the mnemonic action.
    *
    * This is an action that calls gtk_widget_mnemonic_activate() on the given
    * widget upon activation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def get()(using
      Runtime
  ): sn.gnome.gtk4.MnemonicAction /* Some(Ptr[GtkShortcutAction]) */ =
    sn.gnome.gtk4.MnemonicAction
      .applyUnsafe(gtk_mnemonic_action_get().asInstanceOf)

end MnemonicAction
