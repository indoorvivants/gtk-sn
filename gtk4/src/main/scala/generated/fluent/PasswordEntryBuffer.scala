package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.EntryBuffer
import sn.gnome.gtk4.internal.GtkPasswordEntryBuffer

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkEntryBuffer` that locks the underlying memory to prevent it from being
  * swapped to disk.
  *
  * `GtkPasswordEntry` uses a `GtkPasswordEntryBuffer`.
  */
class PasswordEntryBuffer(raw: Ptr[GtkPasswordEntryBuffer])
    extends EntryBuffer(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end PasswordEntryBuffer

object PasswordEntryBuffer:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkEntryBuffer` using secure memory allocations.
    */
  def apply(): PasswordEntryBuffer = new PasswordEntryBuffer(
    gtk_password_entry_buffer_new().asInstanceOf
  )
end PasswordEntryBuffer
