package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.ShortcutTrigger
import sn.gnome.gtk4.internal.GtkMnemonicTrigger

/** A `GtkShortcutTrigger` that triggers when a specific mnemonic is pressed.
  *
  * Mnemonics require a *mnemonic modifier* (typically <kbd>Alt</kbd>) to be
  * pressed together with the mnemonic key.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MnemonicTrigger private[gnome] (raw: Ptr[GtkMnemonicTrigger])
    extends ShortcutTrigger(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the keyval that must be pressed to succeed triggering @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getKeyval(): UInt /* None */ =
    gtk_mnemonic_trigger_get_keyval(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMnemonicTrigger]]
    ).value
  end getKeyval

end MnemonicTrigger

object MnemonicTrigger:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkMnemonicTrigger])(using Runtime) =
    summon[Runtime].getOrCreate[MnemonicTrigger](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new MnemonicTrigger(ptr)
    )

  /** Creates a `GtkShortcutTrigger` that will trigger whenever the key with the
    * given @keyval is pressed and mnemonics have been activated.
    *
    * Mnemonics are activated by calling code when a key event with the right
    * modifiers is detected.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(keyval: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ )(using
      Runtime
  ): MnemonicTrigger =
    val raw: Ptr[Byte] = gtk_mnemonic_trigger_new(guint(keyval)).asInstanceOf
    summon[Runtime].getOrCreate[MnemonicTrigger](
      raw,
      r => MnemonicTrigger.applyUnsafe(r.asInstanceOf)
    )
  end apply
end MnemonicTrigger
