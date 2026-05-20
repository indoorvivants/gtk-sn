package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.EntryBufferClass
import sn.gnome.gtk4.internal.GtkPasswordEntryBufferClass

class PasswordEntryBufferClass private[gnome] (
    raw: Ptr[GtkPasswordEntryBufferClass]
):

  def getUnsafeRawPointer(): Ptr[GtkPasswordEntryBufferClass] = this.raw

  def parentClass: sn.gnome.gtk4.EntryBufferClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkEntryBufferClass]
end PasswordEntryBufferClass

object PasswordEntryBufferClass:
  def fromRaw(ptr: Ptr[GtkPasswordEntryBufferClass]): PasswordEntryBufferClass =
    new PasswordEntryBufferClass(ptr)
end PasswordEntryBufferClass
