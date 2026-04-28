package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gsize
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.internal.GtkEntryBuffer

class EntryBuffer(raw: Ptr[GtkEntryBuffer]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def deleteText(position: UInt, n_chars: Int): UInt =
    gtk_entry_buffer_delete_text(
      this.raw.asInstanceOf,
      guint(position),
      n_chars
    ).value

  def emitDeletedText(position: UInt, n_chars: UInt): Unit =
    gtk_entry_buffer_emit_deleted_text(
      this.raw.asInstanceOf,
      guint(position),
      guint(n_chars)
    )

  def emitInsertedText(position: UInt, chars: String | CString, n_chars: UInt)(
      using Zone
  ): Unit = gtk_entry_buffer_emit_inserted_text(
    this.raw.asInstanceOf,
    guint(position),
    __sn_extract_string(chars),
    guint(n_chars)
  )

  def getBytes(): CUnsignedLongInt = gtk_entry_buffer_get_bytes(
    this.raw.asInstanceOf
  ).value

  def getLength(): UInt = gtk_entry_buffer_get_length(
    this.raw.asInstanceOf
  ).value

  def getMaxLength(): Int = gtk_entry_buffer_get_max_length(
    this.raw.asInstanceOf
  )

  def getText()(using Zone): String = fromCString(
    gtk_entry_buffer_get_text(this.raw.asInstanceOf).asInstanceOf
  )

  def insertText(position: UInt, chars: String | CString, n_chars: Int)(using
      Zone
  ): UInt = gtk_entry_buffer_insert_text(
    this.raw.asInstanceOf,
    guint(position),
    __sn_extract_string(chars),
    n_chars
  ).value

  def setMaxLength(max_length: Int): Unit =
    gtk_entry_buffer_set_max_length(this.raw.asInstanceOf, max_length)

  def setText(chars: String | CString, n_chars: Int)(using Zone): Unit =
    gtk_entry_buffer_set_text(
      this.raw.asInstanceOf,
      __sn_extract_string(chars),
      n_chars
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end EntryBuffer

object EntryBuffer:
  def apply(initial_chars: String | CString, n_initial_chars: Int)(using
      Zone
  ): EntryBuffer = new EntryBuffer(
    gtk_entry_buffer_new(
      __sn_extract_string(initial_chars),
      n_initial_chars
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end EntryBuffer
