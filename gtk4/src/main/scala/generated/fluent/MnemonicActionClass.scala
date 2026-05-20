package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkMnemonicActionClass

class MnemonicActionClass private[gnome] (raw: Ptr[GtkMnemonicActionClass]):

  def getUnsafeRawPointer(): Ptr[GtkMnemonicActionClass] = this.raw
end MnemonicActionClass

object MnemonicActionClass:
  def fromRaw(ptr: Ptr[GtkMnemonicActionClass]): MnemonicActionClass =
    new MnemonicActionClass(ptr)
end MnemonicActionClass
