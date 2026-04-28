package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.ShortcutTrigger
import sn.gnome.gtk4.internal.GtkMnemonicTrigger

class MnemonicTrigger(raw: Ptr[GtkMnemonicTrigger])
    extends ShortcutTrigger(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getKeyval(): UInt = gtk_mnemonic_trigger_get_keyval(
    this.raw.asInstanceOf
  ).value

end MnemonicTrigger

object MnemonicTrigger:
  def apply(keyval: UInt): MnemonicTrigger = new MnemonicTrigger(
    gtk_mnemonic_trigger_new(guint(keyval)).asInstanceOf
  )
end MnemonicTrigger
