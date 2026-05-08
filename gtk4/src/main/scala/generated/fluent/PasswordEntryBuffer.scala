package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.EntryBuffer
import sn.gnome.gtk4.internal.GtkPasswordEntryBuffer

/** A `GtkEntryBuffer` that locks the underlying memory to prevent it from being
  * swapped to disk.
  *
  * `GtkPasswordEntry` uses a `GtkPasswordEntryBuffer`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PasswordEntryBuffer(raw: Ptr[GtkPasswordEntryBuffer])
    extends EntryBuffer(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end PasswordEntryBuffer

object PasswordEntryBuffer:
  /** Creates a new `GtkEntryBuffer` using secure memory allocations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): PasswordEntryBuffer =
    val raw: Ptr[Byte] = gtk_password_entry_buffer_new().asInstanceOf
    summon[Runtime].getOrCreate[PasswordEntryBuffer](
      raw,
      r => new PasswordEntryBuffer(r.asInstanceOf)
    )
  end apply
end PasswordEntryBuffer
