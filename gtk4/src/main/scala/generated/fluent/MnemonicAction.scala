package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.ShortcutAction
import sn.gnome.gtk4.internal.GtkMnemonicAction

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkShortcutAction` that calls gtk_widget_mnemonic_activate().
  */
class MnemonicAction(raw: Ptr[GtkMnemonicAction])
    extends ShortcutAction(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end MnemonicAction
