package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkMnemonicTriggerClass

class MnemonicTriggerClass private[gnome] (raw: Ptr[GtkMnemonicTriggerClass]):

  def getUnsafeRawPointer(): Ptr[GtkMnemonicTriggerClass] = this.raw
end MnemonicTriggerClass

object MnemonicTriggerClass:
  def fromRaw(ptr: Ptr[GtkMnemonicTriggerClass]): MnemonicTriggerClass =
    new MnemonicTriggerClass(ptr)
end MnemonicTriggerClass
