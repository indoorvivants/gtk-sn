package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.EntryBuffer
import sn.gnome.gtk4.internal.GtkPasswordEntryBuffer

class PasswordEntryBuffer(raw: Ptr[GtkPasswordEntryBuffer])
    extends EntryBuffer(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end PasswordEntryBuffer

object PasswordEntryBuffer:
  def apply(): PasswordEntryBuffer = new PasswordEntryBuffer(
    gtk_password_entry_buffer_new().asInstanceOf
  )
end PasswordEntryBuffer
