package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gsize, guint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.internal.GtkEntryBuffer

/** A `GtkEntryBuffer` hold the text displayed in a `GtkText` widget.
  *
  * A single `GtkEntryBuffer` object can be shared by multiple widgets which
  * will then share the same text content, but not the cursor position,
  * visibility attributes, icon etc.
  *
  * `GtkEntryBuffer` may be derived from. Such a derived class might allow text
  * to be stored in an alternate location, such as non-pageable memory, useful
  * in the case of important passwords. Or a derived class could integrate with
  * an application’s concept of undo/redo.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class EntryBuffer(raw: Ptr[GtkEntryBuffer]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Deletes a sequence of characters from the buffer.
    *
    * @n_chars
    *   characters are deleted starting at @position. If @n_chars is negative,
    *   then all characters until the end of the text are deleted.
    *
    * If @position or @n_chars are out of bounds, then they are coerced to sane
    * values.
    *
    * Note that the positions are specified in characters, not bytes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def deleteText(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      n_chars: Int /* Some(CInt) */
  ): UInt /* None */ = gtk_entry_buffer_delete_text(
    this.raw.asInstanceOf[Ptr[GtkEntryBuffer]],
    guint(position),
    n_chars
  ).value

  /** Used when subclassing `GtkEntryBuffer`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def emitDeletedText(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      n_chars: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_entry_buffer_emit_deleted_text(
    this.raw.asInstanceOf[Ptr[GtkEntryBuffer]],
    guint(position),
    guint(n_chars)
  )

  /** Used when subclassing `GtkEntryBuffer`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def emitInsertedText(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      chars: String | CString /* Some(CString) */,
      n_chars: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Zone): Unit /* None */ = gtk_entry_buffer_emit_inserted_text(
    this.raw.asInstanceOf[Ptr[GtkEntryBuffer]],
    guint(position),
    __sn_extract_string(chars),
    guint(n_chars)
  )

  /** Retrieves the length in bytes of the buffer.
    *
    * See [method@Gtk.EntryBuffer.get_length].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBytes(): CUnsignedLongInt /* None */ = gtk_entry_buffer_get_bytes(
    this.raw.asInstanceOf[Ptr[GtkEntryBuffer]]
  ).value

  /** Retrieves the length in characters of the buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLength(): UInt /* None */ = gtk_entry_buffer_get_length(
    this.raw.asInstanceOf[Ptr[GtkEntryBuffer]]
  ).value

  /** Retrieves the maximum allowed length of the text in @buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMaxLength(): Int /* None */ = gtk_entry_buffer_get_max_length(
    this.raw.asInstanceOf[Ptr[GtkEntryBuffer]]
  )

  /** Retrieves the contents of the buffer.
    *
    * The memory pointer returned by this call will not change unless this
    * object emits a signal, or is finalized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getText()(using Zone): String /* None */ = fromCString(
    gtk_entry_buffer_get_text(
      this.raw.asInstanceOf[Ptr[GtkEntryBuffer]]
    ).asInstanceOf
  )

  /** Inserts @n_chars characters of @chars into the contents of the buffer, at
    * position @position.
    *
    * If @n_chars is negative, then characters from chars will be inserted until
    * a null-terminator is found. If @position or @n_chars are out of bounds, or
    * the maximum buffer text length is exceeded, then they are coerced to sane
    * values.
    *
    * Note that the position and length are in characters, not in bytes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertText(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      chars: String | CString /* Some(CString) */,
      n_chars: Int /* Some(CInt) */
  )(using Zone): UInt /* None */ = gtk_entry_buffer_insert_text(
    this.raw.asInstanceOf[Ptr[GtkEntryBuffer]],
    guint(position),
    __sn_extract_string(chars),
    n_chars
  ).value

  /** Sets the maximum allowed length of the contents of the buffer.
    *
    * If the current contents are longer than the given length, then they will
    * be truncated to fit.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMaxLength(max_length: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_entry_buffer_set_max_length(
      this.raw.asInstanceOf[Ptr[GtkEntryBuffer]],
      max_length
    )

  /** Sets the text in the buffer.
    *
    * This is roughly equivalent to calling [method@Gtk.EntryBuffer.delete_text]
    * and [method@Gtk.EntryBuffer.insert_text].
    *
    * Note that @n_chars is in characters, not in bytes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setText(
      chars: String | CString /* Some(CString) */,
      n_chars: Int /* Some(CInt) */
  )(using Zone): Unit /* None */ = gtk_entry_buffer_set_text(
    this.raw.asInstanceOf[Ptr[GtkEntryBuffer]],
    __sn_extract_string(chars),
    n_chars
  )

  /** The text is altered in the default handler for this signal.
    *
    * If you want access to the text after the text has been modified, use
    * %G_CONNECT_AFTER.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal deleted-text]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))"
  )
  private def onDeletedText = ???

  /** This signal is emitted after text is inserted into the buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal inserted-text]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))"
  )
  private def onInsertedText = ???

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
  /** Create a new `GtkEntryBuffer` object.
    *
    * Optionally, specify initial text to set in the buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      initial_chars: Option[String | CString /* Some(CString) */ ],
      n_initial_chars: Int /* Some(CInt) */
  )(using Zone): EntryBuffer = new EntryBuffer(
    gtk_entry_buffer_new(
      initial_chars
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString]),
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
