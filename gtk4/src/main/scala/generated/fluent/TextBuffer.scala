package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.{Clipboard, ContentProvider, Paintable}
import sn.gnome.gdk4.internal.GdkClipboard
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer, guint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{
  TextChildAnchor,
  TextIter,
  TextMark,
  TextTag,
  TextTagTable
}
import sn.gnome.gtk4.internal.{GtkTextBuffer, GtkTextMark}
import sn.gnome.runtime.*

/** Stores text and attributes for display in a `GtkTextView`.
  *
  * You may wish to begin by reading the [text widget conceptual
  * overview](section-text-widget.html), which gives an overview of all the
  * objects and data types related to the text widget and how they work
  * together.
  *
  * GtkTextBuffer can support undoing changes to the buffer content, see
  * [method@Gtk.TextBuffer.set_enable_undo].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TextBuffer private[gnome] (raw: Ptr[GtkTextBuffer])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds the mark at position @where.
    *
    * The mark must not be added to another buffer, and if its name is not %NULL
    * then there must not be another mark in the buffer with the same name.
    *
    * Emits the [signal@Gtk.TextBuffer::mark-set] signal as notification of the
    * mark's initial placement.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addMark(
      mark: sn.gnome.gtk4.TextMark /* Some(Ptr[GtkTextMark]) */,
      where: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */
  )(using Runtime): Unit /* None */ =
    gtk_text_buffer_add_mark(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      mark.getUnsafeRawPointer().asInstanceOf,
      where.getUnsafeRawPointer().asInstanceOf
    )
  end addMark

  /** Adds @clipboard to the list of clipboards in which the selection contents
    * of @buffer are available.
    *
    * In most cases, @clipboard will be the `GdkClipboard` returned by
    * [method@Gtk.Widget.get_primary_clipboard] for a view of @buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addSelectionClipboard(
      clipboard: sn.gnome.gdk4.Clipboard /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkClipboard]) */
  )(using Runtime): Unit /* None */ =
    gtk_text_buffer_add_selection_clipboard(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      clipboard.getUnsafeRawPointer().asInstanceOf
    )
  end addSelectionClipboard

  /** Emits the “apply-tag” signal on @buffer.
    *
    * The default handler for the signal applies
    * @tag
    *   to the given range. @start and @end do not have to be in order.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def applyTag(
      tag: sn.gnome.gtk4.TextTag /* Some(Ptr[GtkTextTag]) */,
      start: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      end: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */
  )(using Runtime): Unit /* None */ =
    gtk_text_buffer_apply_tag(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      tag.getUnsafeRawPointer().asInstanceOf,
      start.getUnsafeRawPointer().asInstanceOf,
      end.getUnsafeRawPointer().asInstanceOf
    )
  end applyTag

  /** Emits the “apply-tag” signal on @buffer.
    *
    * Calls [method@Gtk.TextTagTable.lookup] on the buffer’s tag table to get a
    * `GtkTextTag`, then calls [method@Gtk.TextBuffer.apply_tag].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def applyTagByName(
      name: scala.Predef.String /* Some(CString) */,
      start: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      end: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */
  )(using Runtime): Unit /* None */ =
    gtk_text_buffer_apply_tag_by_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      summon[Runtime].inZone(toCString(name)),
      start.getUnsafeRawPointer().asInstanceOf,
      end.getUnsafeRawPointer().asInstanceOf
    )
  end applyTagByName

  /** Performs the appropriate action as if the user hit the delete key with the
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def backspace(
      iter: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      interactive: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      default_editable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Boolean /* None */ =
    gtk_text_buffer_backspace(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      iter.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if interactive == true then 1 else 0))),
      gboolean(gint((if default_editable == true then 1 else 0)))
    ).value.!=(0)
  end backspace

  /** Denotes the beginning of an action that may not be undone.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def beginIrreversibleAction(): Unit /* None */ =
    gtk_text_buffer_begin_irreversible_action(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]]
    )
  end beginIrreversibleAction

  /** Called to indicate that the buffer operations between here and a call to
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def beginUserAction(): Unit /* None */ =
    gtk_text_buffer_begin_user_action(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]]
    )
  end beginUserAction

  /** Copies the currently-selected text to a clipboard.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copyClipboard(
      clipboard: sn.gnome.gdk4.Clipboard /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkClipboard]) */
  )(using Runtime): Unit /* None */ =
    gtk_text_buffer_copy_clipboard(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      clipboard.getUnsafeRawPointer().asInstanceOf
    )
  end copyClipboard

  /** Creates and inserts a child anchor.
    *
    * This is a convenience function which simply creates a child anchor with
    * [ctor@Gtk.TextChildAnchor.new] and inserts it into the buffer with
    * [method@Gtk.TextBuffer.insert_child_anchor].
    *
    * The new anchor is owned by the buffer; no reference count is returned to
    * the caller of this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def createChildAnchor(
      iter: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */
  )(using Runtime): sn.gnome.gtk4.TextChildAnchor /* None */ =
    sn.gnome.gtk4.TextChildAnchor.applyUnsafe(
      gtk_text_buffer_create_child_anchor(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
        iter.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end createChildAnchor

  /** Creates a mark at position @where.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def createMark(
      mark_name: Option[scala.Predef.String /* Some(CString) */ ],
      where: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      left_gravity: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Runtime): sn.gnome.gtk4.TextMark /* None */ =
    sn.gnome.gtk4.TextMark.applyUnsafe(
      gtk_text_buffer_create_mark(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
        mark_name
          .map[CString](o => summon[Runtime].inZone(toCString(o)))
          .getOrElse(null.asInstanceOf[CString]),
        where.getUnsafeRawPointer().asInstanceOf,
        gboolean(gint((if left_gravity == true then 1 else 0)))
      ).asInstanceOf
    )
  end createMark

  /** Creates a tag and adds it to the tag table for @buffer.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method create_tag/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def createTag__ = ???

  /** Copies the currently-selected text to a clipboard, then deletes said text
    * if it’s editable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def cutClipboard(
      clipboard: sn.gnome.gdk4.Clipboard /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkClipboard]) */,
      default_editable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Runtime): Unit /* None */ =
    gtk_text_buffer_cut_clipboard(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      clipboard.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if default_editable == true then 1 else 0)))
    )
  end cutClipboard

  /** Deletes text between @start and @end.
    *
    * The order of @start and @end is not actually relevant;
    * gtk_text_buffer_delete() will reorder them.
    *
    * This function actually emits the “delete-range” signal, and the default
    * handler of that signal deletes the text. Because the buffer is modified,
    * all outstanding iterators become invalid after calling this function;
    * however, the @start and @end will be re-initialized to point to the
    * location where text was deleted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def delete(
      start: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      end: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */
  ): Unit /* None */ =
    gtk_text_buffer_delete(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      start.getUnsafeRawPointer().asInstanceOf,
      end.getUnsafeRawPointer().asInstanceOf
    )
  end delete

  /** Deletes all editable text in the given range.
    *
    * Calls [method@Gtk.TextBuffer.delete] for each editable sub-range of
    * [@start,@end). @start and @end are revalidated to point to the location of
    * the last deleted range, or left untouched if no text was deleted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def deleteInteractive(
      start_iter: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      end_iter: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      default_editable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Boolean /* None */ =
    gtk_text_buffer_delete_interactive(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      start_iter.getUnsafeRawPointer().asInstanceOf,
      end_iter.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if default_editable == true then 1 else 0)))
    ).value.!=(0)
  end deleteInteractive

  /** Deletes @mark, so that it’s no longer located anywhere in the buffer.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def deleteMark(
      mark: sn.gnome.gtk4.TextMark /* Some(Ptr[GtkTextMark]) */
  )(using Runtime): Unit /* None */ =
    gtk_text_buffer_delete_mark(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      mark.getUnsafeRawPointer().asInstanceOf
    )
  end deleteMark

  /** Deletes the mark named @name; the mark must exist.
    *
    * See [method@Gtk.TextBuffer.delete_mark] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def deleteMarkByName(
      name: scala.Predef.String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_text_buffer_delete_mark_by_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      summon[Runtime].inZone(toCString(name))
    )
  end deleteMarkByName

  /** Deletes the range between the “insert” and “selection_bound” marks, that
    * is, the currently-selected text.
    *
    * If @interactive is %TRUE, the editability of the selection will be
    * considered (users can’t delete uneditable text).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def deleteSelection(
      interactive: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      default_editable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Boolean /* None */ =
    gtk_text_buffer_delete_selection(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      gboolean(gint((if interactive == true then 1 else 0))),
      gboolean(gint((if default_editable == true then 1 else 0)))
    ).value.!=(0)
  end deleteSelection

  /** Denotes the end of an action that may not be undone.
    *
    * This will cause any previous operations in the undo/redo queue to be
    * cleared.
    *
    * This should be called after completing modifications to the text buffer
    * after [method@Gtk.TextBuffer.begin_irreversible_action] was called.
    *
    * You may nest calls to gtk_text_buffer_begin_irreversible_action() and
    * gtk_text_buffer_end_irreversible_action() pairs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def endIrreversibleAction(): Unit /* None */ =
    gtk_text_buffer_end_irreversible_action(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]]
    )
  end endIrreversibleAction

  /** Ends a user-visible operation.
    *
    * Should be paired with a call to [method@Gtk.TextBuffer.begin_user_action].
    * See that function for a full explanation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def endUserAction(): Unit /* None */ =
    gtk_text_buffer_end_user_action(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]]
    )
  end endUserAction

  /** Retrieves the first and last iterators in the buffer, i.e. the entire
    * buffer lies within the range [@start,@end).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_bounds]: Method get_bounds contains an OUT parameter, which is not supported yet"
  )
  private def getBounds__ = ???

  /** Gets whether there is a redoable action in the history.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCanRedo(): Boolean /* None */ =
    gtk_text_buffer_get_can_redo(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]]
    ).value.!=(0)
  end getCanRedo

  /** Gets whether there is an undoable action in the history.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCanUndo(): Boolean /* None */ =
    gtk_text_buffer_get_can_undo(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]]
    ).value.!=(0)
  end getCanUndo

  /** Gets the number of characters in the buffer.
    *
    * Note that characters and bytes are not the same, you can’t e.g. expect the
    * contents of the buffer in string form to be this many bytes long.
    *
    * The character count is cached, so this function is very fast.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCharCount(): Int /* None */ =
    gtk_text_buffer_get_char_count(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]]
    )
  end getCharCount

  /** Gets whether the buffer is saving modifications to the buffer to allow for
    * undo and redo actions.
    *
    * See [method@Gtk.TextBuffer.begin_irreversible_action] and
    * [method@Gtk.TextBuffer.end_irreversible_action] to create changes to the
    * buffer that cannot be undone.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEnableUndo(): Boolean /* None */ =
    gtk_text_buffer_get_enable_undo(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]]
    ).value.!=(0)
  end getEnableUndo

  /** Initializes @iter with the “end iterator,” one past the last valid
    * character in the text buffer.
    *
    * If dereferenced with [method@Gtk.TextIter.get_char], the end iterator has
    * a character value of 0. The entire buffer lies in the range from the first
    * position in the buffer (call [method@Gtk.TextBuffer.get_start_iter] to get
    * character position 0) to the end iterator.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_end_iter]: Method get_end_iter contains an OUT parameter, which is not supported yet"
  )
  private def getEndIter__ = ???

  /** Indicates whether the buffer has some text currently selected.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHasSelection(): Boolean /* None */ =
    gtk_text_buffer_get_has_selection(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]]
    ).value.!=(0)
  end getHasSelection

  /** Returns the mark that represents the cursor (insertion point).
    *
    * Equivalent to calling [method@Gtk.TextBuffer.get_mark] to get the mark
    * named “insert”, but very slightly more efficient, and involves less
    * typing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInsert()(using Runtime): sn.gnome.gtk4.TextMark /* None */ =
    sn.gnome.gtk4.TextMark.applyUnsafe(
      gtk_text_buffer_get_insert(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]]
      ).asInstanceOf
    )
  end getInsert

  /** Obtains the location of @anchor within @buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_iter_at_child_anchor]: Method get_iter_at_child_anchor contains an OUT parameter, which is not supported yet"
  )
  private def getIterAtChildAnchor__ = ???

  /** Initializes @iter to the start of the given line.
    *
    * If @line_number is greater than or equal to the number of lines in the @buffer,
    * the end iterator is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_iter_at_line]: Method get_iter_at_line contains an OUT parameter, which is not supported yet"
  )
  private def getIterAtLine__ = ???

  /** Obtains an iterator pointing to @byte_index within the given line.
    *
    * @byte_index
    *   must be the start of a UTF-8 character. Note bytes, not characters;
    *   UTF-8 may encode one character as multiple bytes.
    *
    * If @line_number is greater than or equal to the number of lines in the @buffer,
    * the end iterator is returned. And if @byte_index is off the end of the
    * line, the iterator at the end of the line is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_iter_at_line_index]: Method get_iter_at_line_index contains an OUT parameter, which is not supported yet"
  )
  private def getIterAtLineIndex__ = ???

  /** Obtains an iterator pointing to @char_offset within the given line.
    *
    * Note characters, not bytes; UTF-8 may encode one character as multiple
    * bytes.
    *
    * If @line_number is greater than or equal to the number of lines in the @buffer,
    * the end iterator is returned. And if @char_offset is off the end of the
    * line, the iterator at the end of the line is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_iter_at_line_offset]: Method get_iter_at_line_offset contains an OUT parameter, which is not supported yet"
  )
  private def getIterAtLineOffset__ = ???

  /** Initializes @iter with the current position of @mark.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_iter_at_mark]: Method get_iter_at_mark contains an OUT parameter, which is not supported yet"
  )
  private def getIterAtMark__ = ???

  /** Initializes @iter to a position @char_offset chars from the start of the
    * entire buffer.
    *
    * If @char_offset is -1 or greater than the number of characters in the
    * buffer, @iter is initialized to the end iterator, the iterator one past
    * the last valid character in the buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_iter_at_offset]: Method get_iter_at_offset contains an OUT parameter, which is not supported yet"
  )
  private def getIterAtOffset__ = ???

  /** Obtains the number of lines in the buffer.
    *
    * This value is cached, so the function is very fast.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLineCount(): Int /* None */ =
    gtk_text_buffer_get_line_count(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]]
    )
  end getLineCount

  /** Returns the mark named @name in buffer @buffer, or %NULL if no such mark
    * exists in the buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMark(
      name: scala.Predef.String /* Some(CString) */
  )(using Runtime): sn.gnome.gtk4.TextMark /* None */ =
    sn.gnome.gtk4.TextMark.applyUnsafe(
      gtk_text_buffer_get_mark(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
        summon[Runtime].inZone(toCString(name))
      ).asInstanceOf
    )
  end getMark

  /** Gets the maximum number of undo levels to perform.
    *
    * If 0, unlimited undo actions may be performed. Note that this may have a
    * memory usage impact as it requires storing an additional copy of the
    * inserted or removed text within the text buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMaxUndoLevels(): UInt /* None */ =
    gtk_text_buffer_get_max_undo_levels(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]]
    ).value
  end getMaxUndoLevels

  /** Indicates whether the buffer has been modified since the last call to
    * [method@Gtk.TextBuffer.set_modified] set the modification flag to %FALSE.
    *
    * Used for example to enable a “save” function in a text editor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModified(): Boolean /* None */ =
    gtk_text_buffer_get_modified(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]]
    ).value.!=(0)
  end getModified

  /** Returns the mark that represents the selection bound.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSelectionBound()(using Runtime): sn.gnome.gtk4.TextMark /* None */ =
    sn.gnome.gtk4.TextMark.applyUnsafe(
      gtk_text_buffer_get_selection_bound(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]]
      ).asInstanceOf
    )
  end getSelectionBound

  /** Returns %TRUE if some text is selected; places the bounds of the selection
    * in @start and @end.
    *
    * If the selection has length 0, then @start and @end are filled in with the
    * same value. @start and @end will be in ascending order. If @start and @end
    * are %NULL, then they are not filled in, but the return value still
    * indicates whether text is selected.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_selection_bounds]: Method get_selection_bounds contains an OUT parameter, which is not supported yet"
  )
  private def getSelectionBounds__ = ???

  /** Get a content provider for this buffer.
    *
    * It can be used to make the content of @buffer available in a
    * `GdkClipboard`, see [method@Gdk.Clipboard.set_content].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSelectionContent()(using
      Runtime
  ): sn.gnome.gdk4.ContentProvider /* None */ =
    sn.gnome.gdk4.ContentProvider.applyUnsafe(
      gtk_text_buffer_get_selection_content(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]]
      ).asInstanceOf
    )
  end getSelectionContent

  /** Returns the text in the range [@start,@end).
    *
    * Excludes undisplayed text (text marked with tags that set the invisibility
    * attribute) if @include_hidden_chars is %FALSE. The returned string
    * includes a 0xFFFC character whenever the buffer contains embedded images,
    * so byte and character indexes into the returned string do correspond to
    * byte and character indexes into the buffer. Contrast with
    * [method@Gtk.TextBuffer.get_text]. Note that 0xFFFC can occur in normal
    * text as well, so it is not a reliable indicator that a paintable or widget
    * is in the buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSlice(
      start: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      end: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      include_hidden_chars: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): scala.Predef.String /* None */ =
    fromCString(
      gtk_text_buffer_get_slice(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
        start.getUnsafeRawPointer().asInstanceOf,
        end.getUnsafeRawPointer().asInstanceOf,
        gboolean(gint((if include_hidden_chars == true then 1 else 0)))
      ).asInstanceOf
    )
  end getSlice

  /** Initialized @iter with the first position in the text buffer.
    *
    * This is the same as using [method@Gtk.TextBuffer.get_iter_at_offset] to
    * get the iter at character offset 0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_start_iter]: Method get_start_iter contains an OUT parameter, which is not supported yet"
  )
  private def getStartIter__ = ???

  /** Get the `GtkTextTagTable` associated with this buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTagTable()(using Runtime): sn.gnome.gtk4.TextTagTable /* None */ =
    sn.gnome.gtk4.TextTagTable.applyUnsafe(
      gtk_text_buffer_get_tag_table(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]]
      ).asInstanceOf
    )
  end getTagTable

  /** Returns the text in the range [@start,@end).
    *
    * Excludes undisplayed text (text marked with tags that set the invisibility
    * attribute) if @include_hidden_chars is %FALSE. Does not include characters
    * representing embedded images, so byte and character indexes into the
    * returned string do not correspond to byte and character indexes into the
    * buffer. Contrast with [method@Gtk.TextBuffer.get_slice].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getText(
      start: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      end: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      include_hidden_chars: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): scala.Predef.String /* None */ =
    fromCString(
      gtk_text_buffer_get_text(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
        start.getUnsafeRawPointer().asInstanceOf,
        end.getUnsafeRawPointer().asInstanceOf,
        gboolean(gint((if include_hidden_chars == true then 1 else 0)))
      ).asInstanceOf
    )
  end getText

  /** Inserts @len bytes of @text at position @iter.
    *
    * If @len is -1, @text must be nul-terminated and will be inserted in its
    * entirety. Emits the “insert-text” signal; insertion actually occurs in the
    * default handler for the signal. @iter is invalidated when insertion occurs
    * (because the buffer contents change), but the default signal handler
    * revalidates it to point to the end of the inserted text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insert(
      iter: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      text: scala.Predef.String /* Some(CString) */,
      len: Int /* Some(CInt) */
  )(using Runtime): Unit /* None */ =
    gtk_text_buffer_insert(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      iter.getUnsafeRawPointer().asInstanceOf,
      summon[Runtime].inZone(toCString(text)),
      len
    )
  end insert

  /** Inserts @text in @buffer.
    *
    * Simply calls [method@Gtk.TextBuffer.insert], using the current cursor
    * position as the insertion point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertAtCursor(
      text: scala.Predef.String /* Some(CString) */,
      len: Int /* Some(CInt) */
  )(using Runtime): Unit /* None */ =
    gtk_text_buffer_insert_at_cursor(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      summon[Runtime].inZone(toCString(text)),
      len
    )
  end insertAtCursor

  /** Inserts a child widget anchor into the text buffer at @iter.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertChildAnchor(
      iter: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      anchor: sn.gnome.gtk4.TextChildAnchor /* Some(Ptr[GtkTextChildAnchor]) */
  )(using Runtime): Unit /* None */ =
    gtk_text_buffer_insert_child_anchor(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      iter.getUnsafeRawPointer().asInstanceOf,
      anchor.getUnsafeRawPointer().asInstanceOf
    )
  end insertChildAnchor

  /** Inserts @text in @buffer.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertInteractive(
      iter: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      text: scala.Predef.String /* Some(CString) */,
      len: Int /* Some(CInt) */,
      default_editable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Runtime): Boolean /* None */ =
    gtk_text_buffer_insert_interactive(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      iter.getUnsafeRawPointer().asInstanceOf,
      summon[Runtime].inZone(toCString(text)),
      len,
      gboolean(gint((if default_editable == true then 1 else 0)))
    ).value.!=(0)
  end insertInteractive

  /** Inserts @text in @buffer.
    *
    * Calls [method@Gtk.TextBuffer.insert_interactive] at the cursor position.
    *
    * @default_editable
    *   indicates the editability of text that doesn't have a tag affecting
    *   editability applied to it. Typically the result of
    *   [method@Gtk.TextView.get_editable] is appropriate here.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertInteractiveAtCursor(
      text: scala.Predef.String /* Some(CString) */,
      len: Int /* Some(CInt) */,
      default_editable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Runtime): Boolean /* None */ =
    gtk_text_buffer_insert_interactive_at_cursor(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      summon[Runtime].inZone(toCString(text)),
      len,
      gboolean(gint((if default_editable == true then 1 else 0)))
    ).value.!=(0)
  end insertInteractiveAtCursor

  /** Inserts the text in @markup at position @iter.
    *
    * @markup
    *   will be inserted in its entirety and must be nul-terminated and valid
    *   UTF-8. Emits the [signal@Gtk.TextBuffer::insert-text] signal, possibly
    *   multiple times; insertion actually occurs in the default handler for the
    *   signal. @iter will point to the end of the inserted text on return.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertMarkup(
      iter: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      markup: scala.Predef.String /* Some(CString) */,
      len: Int /* Some(CInt) */
  )(using Runtime): Unit /* None */ =
    gtk_text_buffer_insert_markup(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      iter.getUnsafeRawPointer().asInstanceOf,
      summon[Runtime].inZone(toCString(markup)),
      len
    )
  end insertMarkup

  /** Inserts an image into the text buffer at @iter.
    *
    * The image will be counted as one character in character counts, and when
    * obtaining the buffer contents as a string, will be represented by the
    * Unicode “object replacement character” 0xFFFC. Note that the “slice”
    * variants for obtaining portions of the buffer as a string include this
    * character for paintable, but the “text” variants do not. e.g. see
    * [method@Gtk.TextBuffer.get_slice] and [method@Gtk.TextBuffer.get_text].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertPaintable(
      iter: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      paintable: sn.gnome.gdk4.Paintable /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]) */
  ): Unit /* None */ =
    gtk_text_buffer_insert_paintable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      iter.getUnsafeRawPointer().asInstanceOf,
      paintable.getUnsafeRawPointer().asInstanceOf
    )
  end insertPaintable

  /** Copies text, tags, and paintables between @start and @end and inserts the
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertRange(
      iter: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      start: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      end: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */
  ): Unit /* None */ =
    gtk_text_buffer_insert_range(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      iter.getUnsafeRawPointer().asInstanceOf,
      start.getUnsafeRawPointer().asInstanceOf,
      end.getUnsafeRawPointer().asInstanceOf
    )
  end insertRange

  /** Copies text, tags, and paintables between @start and @end and inserts the
    * copy at @iter.
    *
    * Same as [method@Gtk.TextBuffer.insert_range], but does nothing if the
    * insertion point isn’t editable. The @default_editable parameter indicates
    * whether the text is editable at @iter if no tags enclosing @iter affect
    * editability. Typically the result of [method@Gtk.TextView.get_editable] is
    * appropriate here.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertRangeInteractive(
      iter: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      start: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      end: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      default_editable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Boolean /* None */ =
    gtk_text_buffer_insert_range_interactive(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      iter.getUnsafeRawPointer().asInstanceOf,
      start.getUnsafeRawPointer().asInstanceOf,
      end.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if default_editable == true then 1 else 0)))
    ).value.!=(0)
  end insertRangeInteractive

  /** Inserts @text into @buffer at @iter, applying the list of tags to the
    * newly-inserted text.
    *
    * The last tag specified must be %NULL to terminate the list. Equivalent to
    * calling [method@Gtk.TextBuffer.insert], then
    * [method@Gtk.TextBuffer.apply_tag] on the inserted text; this is just a
    * convenience function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method insert_with_tags/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def insertWithTags__ = ???

  /** Inserts @text into @buffer at @iter, applying the list of tags to the
    * newly-inserted text.
    *
    * Same as [method@Gtk.TextBuffer.insert_with_tags], but allows you to pass
    * in tag names instead of tag objects.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method insert_with_tags_by_name/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def insertWithTagsByName__ = ???

  /** Moves @mark to the new location @where.
    *
    * Emits the [signal@Gtk.TextBuffer::mark-set] signal as notification of the
    * move.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def moveMark(
      mark: sn.gnome.gtk4.TextMark /* Some(Ptr[GtkTextMark]) */,
      where: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */
  )(using Runtime): Unit /* None */ =
    gtk_text_buffer_move_mark(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      mark.getUnsafeRawPointer().asInstanceOf,
      where.getUnsafeRawPointer().asInstanceOf
    )
  end moveMark

  /** Moves the mark named @name (which must exist) to location @where.
    *
    * See [method@Gtk.TextBuffer.move_mark] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def moveMarkByName(
      name: scala.Predef.String /* Some(CString) */,
      where: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */
  )(using Runtime): Unit /* None */ =
    gtk_text_buffer_move_mark_by_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      summon[Runtime].inZone(toCString(name)),
      where.getUnsafeRawPointer().asInstanceOf
    )
  end moveMarkByName

  /** Pastes the contents of a clipboard.
    *
    * If @override_location is %NULL, the pasted text will be inserted at the
    * cursor position, or the buffer selection will be replaced if the selection
    * is non-empty.
    *
    * Note: pasting is asynchronous, that is, we’ll ask for the paste data and
    * return, and at some point later after the main loop runs, the paste data
    * will be inserted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pasteClipboard(
      clipboard: sn.gnome.gdk4.Clipboard /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkClipboard]) */,
      override_location: Option[
        sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */
      ],
      default_editable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Runtime): Unit /* None */ =
    gtk_text_buffer_paste_clipboard(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      clipboard.getUnsafeRawPointer().asInstanceOf,
      override_location
        .map[Ptr[GtkTextIter]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkTextIter]]),
      gboolean(gint((if default_editable == true then 1 else 0)))
    )
  end pasteClipboard

  /** This function moves the “insert” and “selection_bound” marks
    * simultaneously.
    *
    * If you move them to the same place in two steps with
    * [method@Gtk.TextBuffer.move_mark], you will temporarily select a region in
    * between their old and new locations, which can be pretty inefficient since
    * the temporarily-selected region will force stuff to be recalculated. This
    * function moves them as a unit, which can be optimized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def placeCursor(
      where: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */
  ): Unit /* None */ =
    gtk_text_buffer_place_cursor(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      where.getUnsafeRawPointer().asInstanceOf
    )
  end placeCursor

  /** Redoes the next redoable action on the buffer, if there is one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def redo(): Unit /* None */ =
    gtk_text_buffer_redo(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]]
    )
  end redo

  /** Removes all tags in the range between @start and @end.
    *
    * Be careful with this function; it could remove tags added in code
    * unrelated to the code you’re currently writing. That is, using this
    * function is probably a bad idea if you have two or more unrelated code
    * sections that add tags.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeAllTags(
      start: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      end: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */
  ): Unit /* None */ =
    gtk_text_buffer_remove_all_tags(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      start.getUnsafeRawPointer().asInstanceOf,
      end.getUnsafeRawPointer().asInstanceOf
    )
  end removeAllTags

  /** Removes a `GdkClipboard` added with
    * [method@Gtk.TextBuffer.add_selection_clipboard]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeSelectionClipboard(
      clipboard: sn.gnome.gdk4.Clipboard /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkClipboard]) */
  )(using Runtime): Unit /* None */ =
    gtk_text_buffer_remove_selection_clipboard(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      clipboard.getUnsafeRawPointer().asInstanceOf
    )
  end removeSelectionClipboard

  /** Emits the “remove-tag” signal.
    *
    * The default handler for the signal removes all occurrences of @tag from
    * the given range. @start and @end don’t have to be in order.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeTag(
      tag: sn.gnome.gtk4.TextTag /* Some(Ptr[GtkTextTag]) */,
      start: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      end: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */
  )(using Runtime): Unit /* None */ =
    gtk_text_buffer_remove_tag(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      tag.getUnsafeRawPointer().asInstanceOf,
      start.getUnsafeRawPointer().asInstanceOf,
      end.getUnsafeRawPointer().asInstanceOf
    )
  end removeTag

  /** Emits the “remove-tag” signal.
    *
    * Calls [method@Gtk.TextTagTable.lookup] on the buffer’s tag table to get a
    * `GtkTextTag`, then calls [method@Gtk.TextBuffer.remove_tag].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeTagByName(
      name: scala.Predef.String /* Some(CString) */,
      start: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      end: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */
  )(using Runtime): Unit /* None */ =
    gtk_text_buffer_remove_tag_by_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      summon[Runtime].inZone(toCString(name)),
      start.getUnsafeRawPointer().asInstanceOf,
      end.getUnsafeRawPointer().asInstanceOf
    )
  end removeTagByName

  /** This function moves the “insert” and “selection_bound” marks
    * simultaneously.
    *
    * If you move them in two steps with [method@Gtk.TextBuffer.move_mark], you
    * will temporarily select a region in between their old and new locations,
    * which can be pretty inefficient since the temporarily-selected region will
    * force stuff to be recalculated. This function moves them as a unit, which
    * can be optimized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def selectRange(
      ins: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      bound: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */
  ): Unit /* None */ =
    gtk_text_buffer_select_range(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      ins.getUnsafeRawPointer().asInstanceOf,
      bound.getUnsafeRawPointer().asInstanceOf
    )
  end selectRange

  /** Sets whether or not to enable undoable actions in the text buffer.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEnableUndo(
      enable_undo: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_text_buffer_set_enable_undo(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      gboolean(gint((if enable_undo == true then 1 else 0)))
    )
  end setEnableUndo

  /** Sets the maximum number of undo levels to perform.
    *
    * If 0, unlimited undo actions may be performed. Note that this may have a
    * memory usage impact as it requires storing an additional copy of the
    * inserted or removed text within the text buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMaxUndoLevels(
      max_undo_levels: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_text_buffer_set_max_undo_levels(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      guint(max_undo_levels)
    )
  end setMaxUndoLevels

  /** Used to keep track of whether the buffer has been modified since the last
    * time it was saved.
    *
    * Whenever the buffer is saved to disk, call
    * `gtk_text_buffer_set_modified (@buffer, FALSE)`. When the buffer is
    * modified, it will automatically toggle on the modified bit again. When the
    * modified bit flips, the buffer emits the
    * [signal@Gtk.TextBuffer::modified-changed] signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModified(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_text_buffer_set_modified(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      gboolean(gint((if setting == true then 1 else 0)))
    )
  end setModified

  /** Deletes current contents of @buffer, and inserts @text instead. This is
    * automatically marked as an irreversible action in the undo stack. If you
    * wish to mark this action as part of a larger undo operation, call
    * [method@TextBuffer.delete] and [method@TextBuffer.insert] directly
    * instead.
    *
    * If @len is -1, @text must be nul-terminated.
    * @text
    *   must be valid UTF-8.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setText(
      text: scala.Predef.String /* Some(CString) */,
      len: Int /* Some(CInt) */
  )(using Runtime): Unit /* None */ =
    gtk_text_buffer_set_text(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]],
      summon[Runtime].inZone(toCString(text)),
      len
    )
  end setText

  /** Undoes the last undoable action on the buffer, if there is one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def undo(): Unit /* None */ =
    gtk_text_buffer_undo(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextBuffer]]
    )
  end undo

  /** Emitted to apply a tag to a range of text in a `GtkTextBuffer`.
    *
    * Applying actually occurs in the default handler.
    *
    * Note that if your handler runs before the default handler it must not
    * invalidate the @start and @end iters (or has to revalidate them).
    *
    * See also: [method@Gtk.TextBuffer.apply_tag],
    * [method@Gtk.TextBuffer.insert_with_tags],
    * [method@Gtk.TextBuffer.insert_range].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal apply-tag]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TextIter)))"
  )
  private def onApplyTag = ???

  /** Emitted at the beginning of a single user-visible operation on a
    * `GtkTextBuffer`.
    *
    * See also: [method@Gtk.TextBuffer.begin_user_action],
    * [method@Gtk.TextBuffer.insert_interactive],
    * [method@Gtk.TextBuffer.insert_range_interactive],
    * [method@Gtk.TextBuffer.delete_interactive],
    * [method@Gtk.TextBuffer.backspace],
    * [method@Gtk.TextBuffer.delete_selection].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onBeginUserAction(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkTextBuffer],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"begin-user-action"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onBeginUserAction

  /** Emitted when the content of a `GtkTextBuffer` has changed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onChanged(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkTextBuffer],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"changed"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onChanged

  /** Emitted to delete a range from a `GtkTextBuffer`.
    *
    * Note that if your handler runs before the default handler it must not
    * invalidate the @start and @end iters (or has to revalidate them). The
    * default signal handler revalidates the @start and @end iters to both point
    * to the location where text was deleted. Handlers which run after the
    * default handler (see g_signal_connect_after()) do not have access to the
    * deleted text.
    *
    * See also: [method@Gtk.TextBuffer.delete].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal delete-range]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TextIter)))"
  )
  private def onDeleteRange = ???

  /** Emitted at the end of a single user-visible operation on the
    * `GtkTextBuffer`.
    *
    * See also: [method@Gtk.TextBuffer.end_user_action],
    * [method@Gtk.TextBuffer.insert_interactive],
    * [method@Gtk.TextBuffer.insert_range_interactive],
    * [method@Gtk.TextBuffer.delete_interactive],
    * [method@Gtk.TextBuffer.backspace],
    * [method@Gtk.TextBuffer.delete_selection],
    * [method@Gtk.TextBuffer.backspace].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onEndUserAction(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkTextBuffer],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"end-user-action"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onEndUserAction

  /** Emitted to insert a `GtkTextChildAnchor` in a `GtkTextBuffer`.
    *
    * Insertion actually occurs in the default handler.
    *
    * Note that if your handler runs before the default handler it must not
    * invalidate the @location iter (or has to revalidate it). The default
    * signal handler revalidates it to be placed after the inserted @anchor.
    *
    * See also: [method@Gtk.TextBuffer.insert_child_anchor].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal insert-child-anchor]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TextIter)))"
  )
  private def onInsertChildAnchor = ???

  /** Emitted to insert a `GdkPaintable` in a `GtkTextBuffer`.
    *
    * Insertion actually occurs in the default handler.
    *
    * Note that if your handler runs before the default handler it must not
    * invalidate the @location iter (or has to revalidate it). The default
    * signal handler revalidates it to be placed after the inserted @paintable.
    *
    * See also: [method@Gtk.TextBuffer.insert_paintable].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal insert-paintable]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TextIter)))"
  )
  private def onInsertPaintable = ???

  /** Emitted to insert text in a `GtkTextBuffer`.
    *
    * Insertion actually occurs in the default handler.
    *
    * Note that if your handler runs before the default handler it must not
    * invalidate the @location iter (or has to revalidate it). The default
    * signal handler revalidates it to point to the end of the inserted text.
    *
    * See also: [method@Gtk.TextBuffer.insert],
    * [method@Gtk.TextBuffer.insert_range].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal insert-text]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TextIter)))"
  )
  private def onInsertText = ???

  /** Emitted as notification after a `GtkTextMark` is deleted.
    *
    * See also: [method@Gtk.TextBuffer.delete_mark].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onMarkDeleted(handler: ((mark: TextMark)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (mark: TextMark), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkTextBuffer],
          mark: Ptr[GtkTextMark] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (mark = sr.runtime.get[TextMark](mark.asInstanceOf[Ptr[Byte]]))
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"mark-deleted"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onMarkDeleted

  /** Emitted as notification after a `GtkTextMark` is set.
    *
    * See also: [method@Gtk.TextBuffer.create_mark],
    * [method@Gtk.TextBuffer.move_mark].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal mark-set]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TextIter)))"
  )
  private def onMarkSet = ???

  /** Emitted when the modified bit of a `GtkTextBuffer` flips.
    *
    * See also: [method@Gtk.TextBuffer.set_modified].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onModifiedChanged(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkTextBuffer],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"modified-changed"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onModifiedChanged

  /** Emitted after paste operation has been completed.
    *
    * This is useful to properly scroll the view to the end of the pasted text.
    * See [method@Gtk.TextBuffer.paste_clipboard] for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onPasteDone(handler: ((clipboard: Clipboard)) => Unit)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (clipboard: Clipboard), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkTextBuffer],
          clipboard: Ptr[GdkClipboard] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (clipboard =
            sr.runtime.get[Clipboard](clipboard.asInstanceOf[Ptr[Byte]])
          )
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"paste-done"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onPasteDone

  /** Emitted when a request has been made to redo the previously undone
    * operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onRedo(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkTextBuffer],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"redo"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onRedo

  /** Emitted to remove all occurrences of @tag from a range of text in a
    * `GtkTextBuffer`.
    *
    * Removal actually occurs in the default handler.
    *
    * Note that if your handler runs before the default handler it must not
    * invalidate the @start and @end iters (or has to revalidate them).
    *
    * See also: [method@Gtk.TextBuffer.remove_tag].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal remove-tag]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TextIter)))"
  )
  private def onRemoveTag = ???

  /** Emitted when a request has been made to undo the previous operation or set
    * of operations that have been grouped together.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onUndo(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkTextBuffer],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"undo"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onUndo
end TextBuffer

object TextBuffer:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkTextBuffer])(using Runtime) =
    summon[Runtime].getOrCreate[TextBuffer](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new TextBuffer(ptr)
    )

  /** Creates a new text buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      table: Option[
        sn.gnome.gtk4.TextTagTable /* Some(Ptr[GtkTextTagTable]) */
      ]
  )(using Runtime): TextBuffer =
    val raw: Ptr[Byte] = gtk_text_buffer_new(
      table
        .map[Ptr[GtkTextTagTable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkTextTagTable]])
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[TextBuffer](raw, r => TextBuffer.applyUnsafe(r.asInstanceOf))
  end apply
end TextBuffer
