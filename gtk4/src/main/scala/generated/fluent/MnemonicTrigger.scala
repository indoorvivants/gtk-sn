package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.ShortcutTrigger
import sn.gnome.gtk4.internal.GtkMnemonicTrigger

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkShortcutTrigger` that triggers when a specific mnemonic is pressed.
  *
  * Mnemonics require a *mnemonic modifier* (typically <kbd>Alt</kbd>) to be
  * pressed together with the mnemonic key.
  */
class MnemonicTrigger(raw: Ptr[GtkMnemonicTrigger])
    extends ShortcutTrigger(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the keyval that must be pressed to succeed triggering @self.
    */
  def getKeyval(): UInt /* None */ = gtk_mnemonic_trigger_get_keyval(
    this.raw.asInstanceOf[Ptr[GtkMnemonicTrigger]]
  ).value

end MnemonicTrigger

object MnemonicTrigger:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GtkShortcutTrigger` that will trigger whenever the key with the
    * given @keyval is pressed and mnemonics have been activated.
    *
    * Mnemonics are activated by calling code when a key event with the right
    * modifiers is detected.
    */
  def apply(
      keyval: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): MnemonicTrigger = new MnemonicTrigger(
    gtk_mnemonic_trigger_new(guint(keyval)).asInstanceOf
  )
end MnemonicTrigger
