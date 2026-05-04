package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.{MnemonicAction, ShortcutAction}
import sn.gnome.gtk4.internal.GtkMnemonicAction

/** A `GtkShortcutAction` that calls gtk_widget_mnemonic_activate().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MnemonicAction(raw: Ptr[GtkMnemonicAction])
    extends ShortcutAction(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end MnemonicAction

object MnemonicAction:
  /** Gets the mnemonic action.
    *
    * This is an action that calls gtk_widget_mnemonic_activate() on the given
    * widget upon activation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def get(): MnemonicAction /* Some(Ptr[GtkShortcutAction]) */ =
    new MnemonicAction(gtk_mnemonic_action_get().asInstanceOf)

end MnemonicAction
