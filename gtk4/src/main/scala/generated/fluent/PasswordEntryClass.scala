package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkPasswordEntryClass

class PasswordEntryClass private[gnome] (raw: Ptr[GtkPasswordEntryClass]):

  def getUnsafeRawPointer(): Ptr[GtkPasswordEntryClass] = this.raw
end PasswordEntryClass

object PasswordEntryClass:
  def fromRaw(ptr: Ptr[GtkPasswordEntryClass]): PasswordEntryClass =
    new PasswordEntryClass(ptr)
end PasswordEntryClass
