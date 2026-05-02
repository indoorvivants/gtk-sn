package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.Clipboard
import sn.gnome.gdk4.fluent.ContentProvider
import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.TextChildAnchor
import sn.gnome.gtk4.fluent.TextMark
import sn.gnome.gtk4.fluent.TextTag
import sn.gnome.gtk4.fluent.TextTagTable
import sn.gnome.gtk4.internal.GtkTextBuffer
import sn.gnome.gtk4.internal.GtkTextIter

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Stores text and attributes for display in a `GtkTextView`.
  *
  * You may wish to begin by reading the [text widget conceptual
  * overview](section-text-widget.html), which gives an overview of all the
  * objects and data types related to the text widget and how they work
  * together.
  *
  * GtkTextBuffer can support undoing changes to the buffer content, see
  * [method@Gtk.TextBuffer.set_enable_undo].
  */
class TextBuffer(raw: Ptr[GtkTextBuffer]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds the mark at position @where.
    *
    * The mark must not be added to another buffer, and if its name is not %NULL
    * then there must not be another mark in the buffer with the same name.
    *
    * Emits the [signal@Gtk.TextBuffer::mark-set] signal as notification of the
    * mark's initial placement.
    */
  def addMark(
      mark: TextMark /* Some(Ptr[GtkTextMark]) */,
      where: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */
  ): Unit /* None */ = gtk_text_buffer_add_mark(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    mark.getUnsafeRawPointer().asInstanceOf,
    where
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds @clipboard to the list of clipboards in which the selection contents
    * of @buffer are available.
    *
    * In most cases, @clipboard will be the `GdkClipboard` returned by
    * [method@Gtk.Widget.get_primary_clipboard] for a view of @buffer.
    */
  def addSelectionClipboard(
      clipboard: Clipboard /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkClipboard]) */
  ): Unit /* None */ = gtk_text_buffer_add_selection_clipboard(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    clipboard.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emits the “apply-tag” signal on @buffer.
    *
    * The default handler for the signal applies
    * @tag
    *   to the given range. @start and @end do not have to be in order.
    */
  def applyTag(
      tag: TextTag /* Some(Ptr[GtkTextTag]) */,
      start: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      end: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */
  ): Unit /* None */ = gtk_text_buffer_apply_tag(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    tag.getUnsafeRawPointer().asInstanceOf,
    start,
    end
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emits the “apply-tag” signal on @buffer.
    *
    * Calls [method@Gtk.TextTagTable.lookup] on the buffer’s tag table to get a
    * `GtkTextTag`, then calls [method@Gtk.TextBuffer.apply_tag].
    */
  def applyTagByName(
      name: String | CString /* Some(CString) */,
      start: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      end: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */
  )(using Zone): Unit /* None */ = gtk_text_buffer_apply_tag_by_name(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    __sn_extract_string(name),
    start,
    end
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Performs the appropriate action as if the user hit the delete key with the
    * cursor at the position specified by @iter.
    *
    * In the normal case a single character will be deleted, but when combining
    * accents are involved, more than one character can be deleted, and when
    * precomposed character and accent combinations are involved, less than one
    * character will be deleted.
    *
    * Because the buffer is modified, all outstanding iterators become invalid
    * after calling this function; however, the @iter will be re-initialized to
    * point to the location where text was deleted.
    */
  def backspace(
      iter: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      interactive: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      default_editable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Boolean /* None */ = gtk_text_buffer_backspace(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    iter,
    gboolean(gint((if interactive == true then 1 else 0))),
    gboolean(gint((if default_editable == true then 1 else 0)))
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Denotes the beginning of an action that may not be undone.
    *
    * This will cause any previous operations in the undo/redo queue to be
    * cleared.
    *
    * This should be paired with a call to
    * [method@Gtk.TextBuffer.end_irreversible_action] after the irreversible
    * action has completed.
    *
    * You may nest calls to gtk_text_buffer_begin_irreversible_action() and
    * gtk_text_buffer_end_irreversible_action() pairs.
    */
  def beginIrreversibleAction(): Unit /* None */ =
    gtk_text_buffer_begin_irreversible_action(
      this.raw.asInstanceOf[Ptr[GtkTextBuffer]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Called to indicate that the buffer operations between here and a call to
    * gtk_text_buffer_end_user_action() are part of a single user-visible
    * operation.
    *
    * The operations between gtk_text_buffer_begin_user_action() and
    * gtk_text_buffer_end_user_action() can then be grouped when creating an
    * undo stack. `GtkTextBuffer` maintains a count of calls to
    * gtk_text_buffer_begin_user_action() that have not been closed with a call
    * to gtk_text_buffer_end_user_action(), and emits the “begin-user-action”
    * and “end-user-action” signals only for the outermost pair of calls. This
    * allows you to build user actions from other user actions.
    *
    * The “interactive” buffer mutation functions, such as
    * [method@Gtk.TextBuffer.insert_interactive], automatically call begin/end
    * user action around the buffer operations they perform, so there's no need
    * to add extra calls if you user action consists solely of a single call to
    * one of those functions.
    */
  def beginUserAction(): Unit /* None */ = gtk_text_buffer_begin_user_action(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Copies the currently-selected text to a clipboard.
    */
  def copyClipboard(
      clipboard: Clipboard /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkClipboard]) */
  ): Unit /* None */ = gtk_text_buffer_copy_clipboard(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    clipboard.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates and inserts a child anchor.
    *
    * This is a convenience function which simply creates a child anchor with
    * [ctor@Gtk.TextChildAnchor.new] and inserts it into the buffer with
    * [method@Gtk.TextBuffer.insert_child_anchor].
    *
    * The new anchor is owned by the buffer; no reference count is returned to
    * the caller of this function.
    */
  def createChildAnchor(
      iter: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */
  ): TextChildAnchor /* None */ = new TextChildAnchor(
    gtk_text_buffer_create_child_anchor(
      this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
      iter
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a mark at position @where.
    *
    * If @mark_name is %NULL, the mark is anonymous; otherwise, the mark can be
    * retrieved by name using [method@Gtk.TextBuffer.get_mark]. If a mark has
    * left gravity, and text is inserted at the mark’s current location, the
    * mark will be moved to the left of the newly-inserted text. If the mark has
    * right gravity (@left_gravity = %FALSE), the mark will end up on the right
    * of newly-inserted text. The standard left-to-right cursor is a mark with
    * right gravity (when you type, the cursor stays on the right side of the
    * text you’re typing).
    *
    * The caller of this function does not own a reference to the returned
    * `GtkTextMark`, so you can ignore the return value if you like. Marks are
    * owned by the buffer and go away when the buffer does.
    *
    * Emits the [signal@Gtk.TextBuffer::mark-set] signal as notification of the
    * mark's initial placement.
    */
  def createMark(
      mark_name: Option[String | CString /* Some(CString) */ ],
      where: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      left_gravity: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Zone): TextMark /* None */ = new TextMark(
    gtk_text_buffer_create_mark(
      this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
      mark_name
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString]),
      where,
      gboolean(gint((if left_gravity == true then 1 else 0)))
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a tag and adds it to the tag table for @buffer.
    *
    * Equivalent to calling [ctor@Gtk.TextTag.new] and then adding the tag to
    * the buffer’s tag table. The returned tag is owned by the buffer’s tag
    * table, so the ref count will be equal to one.
    *
    * If @tag_name is %NULL, the tag is anonymous.
    *
    * If @tag_name is non-%NULL, a tag called @tag_name must not already exist
    * in the tag table for this buffer.
    *
    * The @first_property_name argument and subsequent arguments are a list of
    * properties to set on the tag, as with g_object_set().
    */
  inline def createTag(
      tag_name: Option[String | CString /* Some(CString) */ ],
      first_property_name: Option[String | CString /* Some(CString) */ ],
      args: Any*
  )(using Zone): TextTag /* None */ = new TextTag(
    gtk_text_buffer_create_tag(
      this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
      tag_name
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString]),
      first_property_name
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString]),
      args*
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Copies the currently-selected text to a clipboard, then deletes said text
    * if it’s editable.
    */
  def cutClipboard(
      clipboard: Clipboard /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkClipboard]) */,
      default_editable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_text_buffer_cut_clipboard(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    clipboard.getUnsafeRawPointer().asInstanceOf,
    gboolean(gint((if default_editable == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Deletes text between @start and @end.
    *
    * The order of @start and @end is not actually relevant;
    * gtk_text_buffer_delete() will reorder them.
    *
    * This function actually emits the “delete-range” signal, and the default
    * handler of that signal deletes the text. Because the buffer is modified,
    * all outstanding iterators become invalid after calling this function;
    * however, the @start and @end will be re-initialized to point to the
    * location where text was deleted.
    */
  def delete(
      start: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      end: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */
  ): Unit /* None */ = gtk_text_buffer_delete(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    start,
    end
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Deletes all editable text in the given range.
    *
    * Calls [method@Gtk.TextBuffer.delete] for each editable sub-range of
    * [@start,@end). @start and @end are revalidated to point to the location of
    * the last deleted range, or left untouched if no text was deleted.
    */
  def deleteInteractive(
      start_iter: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      end_iter: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      default_editable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Boolean /* None */ = gtk_text_buffer_delete_interactive(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    start_iter,
    end_iter,
    gboolean(gint((if default_editable == true then 1 else 0)))
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Deletes @mark, so that it’s no longer located anywhere in the buffer.
    *
    * Removes the reference the buffer holds to the mark, so if you haven’t
    * called g_object_ref() on the mark, it will be freed. Even if the mark
    * isn’t freed, most operations on @mark become invalid, until it gets added
    * to a buffer again with [method@Gtk.TextBuffer.add_mark]. Use
    * [method@Gtk.TextMark.get_deleted] to find out if a mark has been removed
    * from its buffer.
    *
    * The [signal@Gtk.TextBuffer::mark-deleted] signal will be emitted as
    * notification after the mark is deleted.
    */
  def deleteMark(
      mark: TextMark /* Some(Ptr[GtkTextMark]) */
  ): Unit /* None */ = gtk_text_buffer_delete_mark(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    mark.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Deletes the mark named @name; the mark must exist.
    *
    * See [method@Gtk.TextBuffer.delete_mark] for details.
    */
  def deleteMarkByName(
      name: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_text_buffer_delete_mark_by_name(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    __sn_extract_string(name)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Deletes the range between the “insert” and “selection_bound” marks, that
    * is, the currently-selected text.
    *
    * If @interactive is %TRUE, the editability of the selection will be
    * considered (users can’t delete uneditable text).
    */
  def deleteSelection(
      interactive: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      default_editable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Boolean /* None */ = gtk_text_buffer_delete_selection(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    gboolean(gint((if interactive == true then 1 else 0))),
    gboolean(gint((if default_editable == true then 1 else 0)))
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Denotes the end of an action that may not be undone.
    *
    * This will cause any previous operations in the undo/redo queue to be
    * cleared.
    *
    * This should be called after completing modifications to the text buffer
    * after [method@Gtk.TextBuffer.begin_irreversible_action] was called.
    *
    * You may nest calls to gtk_text_buffer_begin_irreversible_action() and
    * gtk_text_buffer_end_irreversible_action() pairs.
    */
  def endIrreversibleAction(): Unit /* None */ =
    gtk_text_buffer_end_irreversible_action(
      this.raw.asInstanceOf[Ptr[GtkTextBuffer]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ends a user-visible operation.
    *
    * Should be paired with a call to [method@Gtk.TextBuffer.begin_user_action].
    * See that function for a full explanation.
    */
  def endUserAction(): Unit /* None */ = gtk_text_buffer_end_user_action(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the first and last iterators in the buffer, i.e. the entire
    * buffer lies within the range [@start,@end).
    */
  @annotation.compileTimeOnly(
    "Method get_bounds contains an OUT parameter, which is not supported yet"
  )
  private def getBounds__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether there is a redoable action in the history.
    */
  def getCanRedo(): Boolean /* None */ = gtk_text_buffer_get_can_redo(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether there is an undoable action in the history.
    */
  def getCanUndo(): Boolean /* None */ = gtk_text_buffer_get_can_undo(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the number of characters in the buffer.
    *
    * Note that characters and bytes are not the same, you can’t e.g. expect the
    * contents of the buffer in string form to be this many bytes long.
    *
    * The character count is cached, so this function is very fast.
    */
  def getCharCount(): Int /* None */ = gtk_text_buffer_get_char_count(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the buffer is saving modifications to the buffer to allow for
    * undo and redo actions.
    *
    * See [method@Gtk.TextBuffer.begin_irreversible_action] and
    * [method@Gtk.TextBuffer.end_irreversible_action] to create changes to the
    * buffer that cannot be undone.
    */
  def getEnableUndo(): Boolean /* None */ = gtk_text_buffer_get_enable_undo(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Initializes @iter with the “end iterator,” one past the last valid
    * character in the text buffer.
    *
    * If dereferenced with [method@Gtk.TextIter.get_char], the end iterator has
    * a character value of 0. The entire buffer lies in the range from the first
    * position in the buffer (call [method@Gtk.TextBuffer.get_start_iter] to get
    * character position 0) to the end iterator.
    */
  @annotation.compileTimeOnly(
    "Method get_end_iter contains an OUT parameter, which is not supported yet"
  )
  private def getEndIter__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates whether the buffer has some text currently selected.
    */
  def getHasSelection(): Boolean /* None */ = gtk_text_buffer_get_has_selection(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the mark that represents the cursor (insertion point).
    *
    * Equivalent to calling [method@Gtk.TextBuffer.get_mark] to get the mark
    * named “insert”, but very slightly more efficient, and involves less
    * typing.
    */
  def getInsert(): TextMark /* None */ = new TextMark(
    gtk_text_buffer_get_insert(
      this.raw.asInstanceOf[Ptr[GtkTextBuffer]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains the location of @anchor within @buffer.
    */
  @annotation.compileTimeOnly(
    "Method get_iter_at_child_anchor contains an OUT parameter, which is not supported yet"
  )
  private def getIterAtChildAnchor__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Initializes @iter to the start of the given line.
    *
    * If @line_number is greater than or equal to the number of lines in the @buffer,
    * the end iterator is returned.
    */
  @annotation.compileTimeOnly(
    "Method get_iter_at_line contains an OUT parameter, which is not supported yet"
  )
  private def getIterAtLine__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains an iterator pointing to @byte_index within the given line.
    *
    * @byte_index
    *   must be the start of a UTF-8 character. Note bytes, not characters;
    *   UTF-8 may encode one character as multiple bytes.
    *
    * If @line_number is greater than or equal to the number of lines in the @buffer,
    * the end iterator is returned. And if @byte_index is off the end of the
    * line, the iterator at the end of the line is returned.
    */
  @annotation.compileTimeOnly(
    "Method get_iter_at_line_index contains an OUT parameter, which is not supported yet"
  )
  private def getIterAtLineIndex__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains an iterator pointing to @char_offset within the given line.
    *
    * Note characters, not bytes; UTF-8 may encode one character as multiple
    * bytes.
    *
    * If @line_number is greater than or equal to the number of lines in the @buffer,
    * the end iterator is returned. And if @char_offset is off the end of the
    * line, the iterator at the end of the line is returned.
    */
  @annotation.compileTimeOnly(
    "Method get_iter_at_line_offset contains an OUT parameter, which is not supported yet"
  )
  private def getIterAtLineOffset__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Initializes @iter with the current position of @mark.
    */
  @annotation.compileTimeOnly(
    "Method get_iter_at_mark contains an OUT parameter, which is not supported yet"
  )
  private def getIterAtMark__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Initializes @iter to a position @char_offset chars from the start of the
    * entire buffer.
    *
    * If @char_offset is -1 or greater than the number of characters in the
    * buffer, @iter is initialized to the end iterator, the iterator one past
    * the last valid character in the buffer.
    */
  @annotation.compileTimeOnly(
    "Method get_iter_at_offset contains an OUT parameter, which is not supported yet"
  )
  private def getIterAtOffset__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains the number of lines in the buffer.
    *
    * This value is cached, so the function is very fast.
    */
  def getLineCount(): Int /* None */ = gtk_text_buffer_get_line_count(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the mark named @name in buffer @buffer, or %NULL if no such mark
    * exists in the buffer.
    */
  def getMark(
      name: String | CString /* Some(CString) */
  )(using Zone): TextMark /* None */ = new TextMark(
    gtk_text_buffer_get_mark(
      this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
      __sn_extract_string(name)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the maximum number of undo levels to perform.
    *
    * If 0, unlimited undo actions may be performed. Note that this may have a
    * memory usage impact as it requires storing an additional copy of the
    * inserted or removed text within the text buffer.
    */
  def getMaxUndoLevels(): UInt /* None */ = gtk_text_buffer_get_max_undo_levels(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates whether the buffer has been modified since the last call to
    * [method@Gtk.TextBuffer.set_modified] set the modification flag to %FALSE.
    *
    * Used for example to enable a “save” function in a text editor.
    */
  def getModified(): Boolean /* None */ = gtk_text_buffer_get_modified(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the mark that represents the selection bound.
    *
    * Equivalent to calling [method@Gtk.TextBuffer.get_mark] to get the mark
    * named “selection_bound”, but very slightly more efficient, and involves
    * less typing.
    *
    * The currently-selected text in @buffer is the region between the
    * “selection_bound” and “insert” marks. If “selection_bound” and “insert”
    * are in the same place, then there is no current selection.
    * [method@Gtk.TextBuffer.get_selection_bounds] is another convenient
    * function for handling the selection, if you just want to know whether
    * there’s a selection and what its bounds are.
    */
  def getSelectionBound(): TextMark /* None */ = new TextMark(
    gtk_text_buffer_get_selection_bound(
      this.raw.asInstanceOf[Ptr[GtkTextBuffer]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if some text is selected; places the bounds of the selection
    * in @start and @end.
    *
    * If the selection has length 0, then @start and @end are filled in with the
    * same value. @start and @end will be in ascending order. If @start and @end
    * are %NULL, then they are not filled in, but the return value still
    * indicates whether text is selected.
    */
  @annotation.compileTimeOnly(
    "Method get_selection_bounds contains an OUT parameter, which is not supported yet"
  )
  private def getSelectionBounds__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get a content provider for this buffer.
    *
    * It can be used to make the content of @buffer available in a
    * `GdkClipboard`, see [method@Gdk.Clipboard.set_content].
    */
  def getSelectionContent(): ContentProvider /* None */ = new ContentProvider(
    gtk_text_buffer_get_selection_content(
      this.raw.asInstanceOf[Ptr[GtkTextBuffer]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the text in the range [@start,@end).
    *
    * Excludes undisplayed text (text marked with tags that set the invisibility
    * attribute) if @include_hidden_chars is %FALSE. The returned string
    * includes a 0xFFFC character whenever the buffer contains embedded images,
    * so byte and character indexes into the returned string do correspond to
    * byte and character indexes into the buffer. Contrast with
    * [method@Gtk.TextBuffer.get_text]. Note that 0xFFFC can occur in normal
    * text as well, so it is not a reliable indicator that a paintable or widget
    * is in the buffer.
    */
  def getSlice(
      start: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      end: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      include_hidden_chars: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Zone): String /* None */ = fromCString(
    gtk_text_buffer_get_slice(
      this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
      start,
      end,
      gboolean(gint((if include_hidden_chars == true then 1 else 0)))
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Initialized @iter with the first position in the text buffer.
    *
    * This is the same as using [method@Gtk.TextBuffer.get_iter_at_offset] to
    * get the iter at character offset 0.
    */
  @annotation.compileTimeOnly(
    "Method get_start_iter contains an OUT parameter, which is not supported yet"
  )
  private def getStartIter__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get the `GtkTextTagTable` associated with this buffer.
    */
  def getTagTable(): TextTagTable /* None */ = new TextTagTable(
    gtk_text_buffer_get_tag_table(
      this.raw.asInstanceOf[Ptr[GtkTextBuffer]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the text in the range [@start,@end).
    *
    * Excludes undisplayed text (text marked with tags that set the invisibility
    * attribute) if @include_hidden_chars is %FALSE. Does not include characters
    * representing embedded images, so byte and character indexes into the
    * returned string do not correspond to byte and character indexes into the
    * buffer. Contrast with [method@Gtk.TextBuffer.get_slice].
    */
  def getText(
      start: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      end: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      include_hidden_chars: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Zone): String /* None */ = fromCString(
    gtk_text_buffer_get_text(
      this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
      start,
      end,
      gboolean(gint((if include_hidden_chars == true then 1 else 0)))
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts @len bytes of @text at position @iter.
    *
    * If @len is -1, @text must be nul-terminated and will be inserted in its
    * entirety. Emits the “insert-text” signal; insertion actually occurs in the
    * default handler for the signal. @iter is invalidated when insertion occurs
    * (because the buffer contents change), but the default signal handler
    * revalidates it to point to the end of the inserted text.
    */
  def insert(
      iter: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      text: String | CString /* Some(CString) */,
      len: Int /* Some(CInt) */
  )(using Zone): Unit /* None */ = gtk_text_buffer_insert(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    iter,
    __sn_extract_string(text),
    len
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts @text in @buffer.
    *
    * Simply calls [method@Gtk.TextBuffer.insert], using the current cursor
    * position as the insertion point.
    */
  def insertAtCursor(
      text: String | CString /* Some(CString) */,
      len: Int /* Some(CInt) */
  )(using Zone): Unit /* None */ = gtk_text_buffer_insert_at_cursor(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    __sn_extract_string(text),
    len
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts a child widget anchor into the text buffer at @iter.
    *
    * The anchor will be counted as one character in character counts, and when
    * obtaining the buffer contents as a string, will be represented by the
    * Unicode “object replacement character” 0xFFFC. Note that the “slice”
    * variants for obtaining portions of the buffer as a string include this
    * character for child anchors, but the “text” variants do not. E.g. see
    * [method@Gtk.TextBuffer.get_slice] and [method@Gtk.TextBuffer.get_text].
    *
    * Consider [method@Gtk.TextBuffer.create_child_anchor] as a more convenient
    * alternative to this function. The buffer will add a reference to the
    * anchor, so you can unref it after insertion.
    */
  def insertChildAnchor(
      iter: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      anchor: TextChildAnchor /* Some(Ptr[GtkTextChildAnchor]) */
  ): Unit /* None */ = gtk_text_buffer_insert_child_anchor(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    iter,
    anchor.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts @text in @buffer.
    *
    * Like [method@Gtk.TextBuffer.insert], but the insertion will not occur if @iter
    * is at a non-editable location in the buffer. Usually you want to prevent
    * insertions at ineditable locations if the insertion results from a user
    * action (is interactive).
    *
    * @default_editable
    *   indicates the editability of text that doesn't have a tag affecting
    *   editability applied to it. Typically the result of
    *   [method@Gtk.TextView.get_editable] is appropriate here.
    */
  def insertInteractive(
      iter: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      text: String | CString /* Some(CString) */,
      len: Int /* Some(CInt) */,
      default_editable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Zone): Boolean /* None */ = gtk_text_buffer_insert_interactive(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    iter,
    __sn_extract_string(text),
    len,
    gboolean(gint((if default_editable == true then 1 else 0)))
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts @text in @buffer.
    *
    * Calls [method@Gtk.TextBuffer.insert_interactive] at the cursor position.
    *
    * @default_editable
    *   indicates the editability of text that doesn't have a tag affecting
    *   editability applied to it. Typically the result of
    *   [method@Gtk.TextView.get_editable] is appropriate here.
    */
  def insertInteractiveAtCursor(
      text: String | CString /* Some(CString) */,
      len: Int /* Some(CInt) */,
      default_editable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Zone): Boolean /* None */ =
    gtk_text_buffer_insert_interactive_at_cursor(
      this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
      __sn_extract_string(text),
      len,
      gboolean(gint((if default_editable == true then 1 else 0)))
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts the text in @markup at position @iter.
    *
    * @markup
    *   will be inserted in its entirety and must be nul-terminated and valid
    *   UTF-8. Emits the [signal@Gtk.TextBuffer::insert-text] signal, possibly
    *   multiple times; insertion actually occurs in the default handler for the
    *   signal. @iter will point to the end of the inserted text on return.
    */
  def insertMarkup(
      iter: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      markup: String | CString /* Some(CString) */,
      len: Int /* Some(CInt) */
  )(using Zone): Unit /* None */ = gtk_text_buffer_insert_markup(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    iter,
    __sn_extract_string(markup),
    len
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts an image into the text buffer at @iter.
    *
    * The image will be counted as one character in character counts, and when
    * obtaining the buffer contents as a string, will be represented by the
    * Unicode “object replacement character” 0xFFFC. Note that the “slice”
    * variants for obtaining portions of the buffer as a string include this
    * character for paintable, but the “text” variants do not. e.g. see
    * [method@Gtk.TextBuffer.get_slice] and [method@Gtk.TextBuffer.get_text].
    */
  def insertPaintable(
      iter: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      paintable: Paintable /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]) */
  ): Unit /* None */ = gtk_text_buffer_insert_paintable(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    iter,
    paintable.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Copies text, tags, and paintables between @start and @end and inserts the
    * copy at @iter.
    *
    * The order of @start and @end doesn’t matter.
    *
    * Used instead of simply getting/inserting text because it preserves images
    * and tags. If @start and @end are in a different buffer from
    * @buffer,
    *   the two buffers must share the same tag table.
    *
    * Implemented via emissions of the ::insert-text and ::apply-tag signals, so
    * expect those.
    */
  def insertRange(
      iter: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      start: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      end: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */
  ): Unit /* None */ = gtk_text_buffer_insert_range(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    iter,
    start,
    end
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Copies text, tags, and paintables between @start and @end and inserts the
    * copy at @iter.
    *
    * Same as [method@Gtk.TextBuffer.insert_range], but does nothing if the
    * insertion point isn’t editable. The @default_editable parameter indicates
    * whether the text is editable at @iter if no tags enclosing @iter affect
    * editability. Typically the result of [method@Gtk.TextView.get_editable] is
    * appropriate here.
    */
  def insertRangeInteractive(
      iter: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      start: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      end: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      default_editable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Boolean /* None */ = gtk_text_buffer_insert_range_interactive(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    iter,
    start,
    end,
    gboolean(gint((if default_editable == true then 1 else 0)))
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts @text into @buffer at @iter, applying the list of tags to the
    * newly-inserted text.
    *
    * The last tag specified must be %NULL to terminate the list. Equivalent to
    * calling [method@Gtk.TextBuffer.insert], then
    * [method@Gtk.TextBuffer.apply_tag] on the inserted text; this is just a
    * convenience function.
    */
  inline def insertWithTags(
      iter: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      text: String | CString /* Some(CString) */,
      len: Int /* Some(CInt) */,
      first_tag: TextTag /* Some(Ptr[GtkTextTag]) */,
      args: Any*
  )(using Zone): Unit /* None */ = gtk_text_buffer_insert_with_tags(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    iter,
    __sn_extract_string(text),
    len,
    first_tag.getUnsafeRawPointer().asInstanceOf,
    args*
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts @text into @buffer at @iter, applying the list of tags to the
    * newly-inserted text.
    *
    * Same as [method@Gtk.TextBuffer.insert_with_tags], but allows you to pass
    * in tag names instead of tag objects.
    */
  inline def insertWithTagsByName(
      iter: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      text: String | CString /* Some(CString) */,
      len: Int /* Some(CInt) */,
      first_tag_name: String | CString /* Some(CString) */,
      args: Any*
  )(using Zone): Unit /* None */ = gtk_text_buffer_insert_with_tags_by_name(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    iter,
    __sn_extract_string(text),
    len,
    __sn_extract_string(first_tag_name),
    args*
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Moves @mark to the new location @where.
    *
    * Emits the [signal@Gtk.TextBuffer::mark-set] signal as notification of the
    * move.
    */
  def moveMark(
      mark: TextMark /* Some(Ptr[GtkTextMark]) */,
      where: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */
  ): Unit /* None */ = gtk_text_buffer_move_mark(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    mark.getUnsafeRawPointer().asInstanceOf,
    where
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Moves the mark named @name (which must exist) to location @where.
    *
    * See [method@Gtk.TextBuffer.move_mark] for details.
    */
  def moveMarkByName(
      name: String | CString /* Some(CString) */,
      where: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */
  )(using Zone): Unit /* None */ = gtk_text_buffer_move_mark_by_name(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    __sn_extract_string(name),
    where
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pastes the contents of a clipboard.
    *
    * If @override_location is %NULL, the pasted text will be inserted at the
    * cursor position, or the buffer selection will be replaced if the selection
    * is non-empty.
    *
    * Note: pasting is asynchronous, that is, we’ll ask for the paste data and
    * return, and at some point later after the main loop runs, the paste data
    * will be inserted.
    */
  def pasteClipboard(
      clipboard: Clipboard /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkClipboard]) */,
      override_location: Option[Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */ ],
      default_editable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_text_buffer_paste_clipboard(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    clipboard.getUnsafeRawPointer().asInstanceOf,
    override_location
      .map[Ptr[GtkTextIter]](o => o)
      .getOrElse(null.asInstanceOf[Ptr[GtkTextIter]]),
    gboolean(gint((if default_editable == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function moves the “insert” and “selection_bound” marks
    * simultaneously.
    *
    * If you move them to the same place in two steps with
    * [method@Gtk.TextBuffer.move_mark], you will temporarily select a region in
    * between their old and new locations, which can be pretty inefficient since
    * the temporarily-selected region will force stuff to be recalculated. This
    * function moves them as a unit, which can be optimized.
    */
  def placeCursor(
      where: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */
  ): Unit /* None */ = gtk_text_buffer_place_cursor(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    where
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Redoes the next redoable action on the buffer, if there is one.
    */
  def redo(): Unit /* None */ = gtk_text_buffer_redo(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes all tags in the range between @start and @end.
    *
    * Be careful with this function; it could remove tags added in code
    * unrelated to the code you’re currently writing. That is, using this
    * function is probably a bad idea if you have two or more unrelated code
    * sections that add tags.
    */
  def removeAllTags(
      start: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      end: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */
  ): Unit /* None */ = gtk_text_buffer_remove_all_tags(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    start,
    end
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a `GdkClipboard` added with
    * [method@Gtk.TextBuffer.add_selection_clipboard]
    */
  def removeSelectionClipboard(
      clipboard: Clipboard /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkClipboard]) */
  ): Unit /* None */ = gtk_text_buffer_remove_selection_clipboard(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    clipboard.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emits the “remove-tag” signal.
    *
    * The default handler for the signal removes all occurrences of @tag from
    * the given range. @start and @end don’t have to be in order.
    */
  def removeTag(
      tag: TextTag /* Some(Ptr[GtkTextTag]) */,
      start: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      end: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */
  ): Unit /* None */ = gtk_text_buffer_remove_tag(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    tag.getUnsafeRawPointer().asInstanceOf,
    start,
    end
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emits the “remove-tag” signal.
    *
    * Calls [method@Gtk.TextTagTable.lookup] on the buffer’s tag table to get a
    * `GtkTextTag`, then calls [method@Gtk.TextBuffer.remove_tag].
    */
  def removeTagByName(
      name: String | CString /* Some(CString) */,
      start: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      end: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */
  )(using Zone): Unit /* None */ = gtk_text_buffer_remove_tag_by_name(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    __sn_extract_string(name),
    start,
    end
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function moves the “insert” and “selection_bound” marks
    * simultaneously.
    *
    * If you move them in two steps with [method@Gtk.TextBuffer.move_mark], you
    * will temporarily select a region in between their old and new locations,
    * which can be pretty inefficient since the temporarily-selected region will
    * force stuff to be recalculated. This function moves them as a unit, which
    * can be optimized.
    */
  def selectRange(
      ins: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */,
      bound: Ptr[GtkTextIter] /* Some(Ptr[GtkTextIter]) */
  ): Unit /* None */ = gtk_text_buffer_select_range(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    ins,
    bound
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether or not to enable undoable actions in the text buffer.
    *
    * Undoable actions in this context are changes to the text content of the
    * buffer. Changes to tags and marks are not tracked.
    *
    * If enabled, the user will be able to undo the last number of actions up to
    * [method@Gtk.TextBuffer.get_max_undo_levels].
    *
    * See [method@Gtk.TextBuffer.begin_irreversible_action] and
    * [method@Gtk.TextBuffer.end_irreversible_action] to create changes to the
    * buffer that cannot be undone.
    */
  def setEnableUndo(
      enable_undo: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_text_buffer_set_enable_undo(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    gboolean(gint((if enable_undo == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the maximum number of undo levels to perform.
    *
    * If 0, unlimited undo actions may be performed. Note that this may have a
    * memory usage impact as it requires storing an additional copy of the
    * inserted or removed text within the text buffer.
    */
  def setMaxUndoLevels(
      max_undo_levels: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_text_buffer_set_max_undo_levels(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    guint(max_undo_levels)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Used to keep track of whether the buffer has been modified since the last
    * time it was saved.
    *
    * Whenever the buffer is saved to disk, call
    * `gtk_text_buffer_set_modified (@buffer, FALSE)`. When the buffer is
    * modified, it will automatically toggle on the modified bit again. When the
    * modified bit flips, the buffer emits the
    * [signal@Gtk.TextBuffer::modified-changed] signal.
    */
  def setModified(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_text_buffer_set_modified(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Deletes current contents of @buffer, and inserts @text instead. This is
    * automatically marked as an irreversible action in the undo stack. If you
    * wish to mark this action as part of a larger undo operation, call
    * [method@TextBuffer.delete] and [method@TextBuffer.insert] directly
    * instead.
    *
    * If @len is -1, @text must be nul-terminated.
    * @text
    *   must be valid UTF-8.
    */
  def setText(
      text: String | CString /* Some(CString) */,
      len: Int /* Some(CInt) */
  )(using Zone): Unit /* None */ = gtk_text_buffer_set_text(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]],
    __sn_extract_string(text),
    len
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Undoes the last undoable action on the buffer, if there is one.
    */
  def undo(): Unit /* None */ = gtk_text_buffer_undo(
    this.raw.asInstanceOf[Ptr[GtkTextBuffer]]
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end TextBuffer

object TextBuffer:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new text buffer.
    */
  def apply(
      table: Option[TextTagTable /* Some(Ptr[GtkTextTagTable]) */ ]
  ): TextBuffer = new TextBuffer(
    gtk_text_buffer_new(
      table
        .map[Ptr[GtkTextTagTable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkTextTagTable]])
    ).asInstanceOf
  )
end TextBuffer
