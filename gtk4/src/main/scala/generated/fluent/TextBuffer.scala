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

class TextBuffer(raw: Ptr[GtkTextBuffer]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addMark(mark: TextMark, where: Ptr[GtkTextIter]): Unit =
    gtk_text_buffer_add_mark(
      this.raw.asInstanceOf,
      mark.getUnsafeRawPointer().asInstanceOf,
      where
    )

  def addSelectionClipboard(clipboard: Clipboard): Unit =
    gtk_text_buffer_add_selection_clipboard(
      this.raw.asInstanceOf,
      clipboard.getUnsafeRawPointer().asInstanceOf
    )

  def applyTag(
      tag: TextTag,
      start: Ptr[GtkTextIter],
      end: Ptr[GtkTextIter]
  ): Unit = gtk_text_buffer_apply_tag(
    this.raw.asInstanceOf,
    tag.getUnsafeRawPointer().asInstanceOf,
    start,
    end
  )

  def applyTagByName(
      name: String | CString,
      start: Ptr[GtkTextIter],
      end: Ptr[GtkTextIter]
  )(using Zone): Unit = gtk_text_buffer_apply_tag_by_name(
    this.raw.asInstanceOf,
    __sn_extract_string(name),
    start,
    end
  )

  def backspace(
      iter: Ptr[GtkTextIter],
      interactive: Boolean,
      default_editable: Boolean
  ): Boolean = gtk_text_buffer_backspace(
    this.raw.asInstanceOf,
    iter,
    gboolean(gint((if interactive == true then 1 else 0))),
    gboolean(gint((if default_editable == true then 1 else 0)))
  ).value.!=(0)

  def beginIrreversibleAction(): Unit =
    gtk_text_buffer_begin_irreversible_action(this.raw.asInstanceOf)

  def beginUserAction(): Unit = gtk_text_buffer_begin_user_action(
    this.raw.asInstanceOf
  )

  def copyClipboard(clipboard: Clipboard): Unit =
    gtk_text_buffer_copy_clipboard(
      this.raw.asInstanceOf,
      clipboard.getUnsafeRawPointer().asInstanceOf
    )

  def createChildAnchor(iter: Ptr[GtkTextIter]): TextChildAnchor =
    new TextChildAnchor(
      gtk_text_buffer_create_child_anchor(
        this.raw.asInstanceOf,
        iter
      ).asInstanceOf
    )

  def createMark(
      mark_name: String | CString,
      where: Ptr[GtkTextIter],
      left_gravity: Boolean
  )(using Zone): TextMark = new TextMark(
    gtk_text_buffer_create_mark(
      this.raw.asInstanceOf,
      __sn_extract_string(mark_name),
      where,
      gboolean(gint((if left_gravity == true then 1 else 0)))
    ).asInstanceOf
  )

  inline def createTag(
      tag_name: String | CString,
      first_property_name: String | CString,
      args: Any*
  )(using Zone): TextTag = new TextTag(
    gtk_text_buffer_create_tag(
      this.raw.asInstanceOf,
      __sn_extract_string(tag_name),
      __sn_extract_string(first_property_name),
      args*
    ).asInstanceOf
  )

  def cutClipboard(clipboard: Clipboard, default_editable: Boolean): Unit =
    gtk_text_buffer_cut_clipboard(
      this.raw.asInstanceOf,
      clipboard.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if default_editable == true then 1 else 0)))
    )

  def delete(start: Ptr[GtkTextIter], end: Ptr[GtkTextIter]): Unit =
    gtk_text_buffer_delete(this.raw.asInstanceOf, start, end)

  def deleteInteractive(
      start_iter: Ptr[GtkTextIter],
      end_iter: Ptr[GtkTextIter],
      default_editable: Boolean
  ): Boolean = gtk_text_buffer_delete_interactive(
    this.raw.asInstanceOf,
    start_iter,
    end_iter,
    gboolean(gint((if default_editable == true then 1 else 0)))
  ).value.!=(0)

  def deleteMark(mark: TextMark): Unit = gtk_text_buffer_delete_mark(
    this.raw.asInstanceOf,
    mark.getUnsafeRawPointer().asInstanceOf
  )

  def deleteMarkByName(name: String | CString)(using Zone): Unit =
    gtk_text_buffer_delete_mark_by_name(
      this.raw.asInstanceOf,
      __sn_extract_string(name)
    )

  def deleteSelection(
      interactive: Boolean,
      default_editable: Boolean
  ): Boolean = gtk_text_buffer_delete_selection(
    this.raw.asInstanceOf,
    gboolean(gint((if interactive == true then 1 else 0))),
    gboolean(gint((if default_editable == true then 1 else 0)))
  ).value.!=(0)

  def endIrreversibleAction(): Unit = gtk_text_buffer_end_irreversible_action(
    this.raw.asInstanceOf
  )

  def endUserAction(): Unit = gtk_text_buffer_end_user_action(
    this.raw.asInstanceOf
  )

  // Method get_bounds contains an OUT parameter, which is not supported yet

  def getCanRedo(): Boolean =
    gtk_text_buffer_get_can_redo(this.raw.asInstanceOf).value.!=(0)

  def getCanUndo(): Boolean =
    gtk_text_buffer_get_can_undo(this.raw.asInstanceOf).value.!=(0)

  def getCharCount(): Int = gtk_text_buffer_get_char_count(
    this.raw.asInstanceOf
  )

  def getEnableUndo(): Boolean =
    gtk_text_buffer_get_enable_undo(this.raw.asInstanceOf).value.!=(0)

  // Method get_end_iter contains an OUT parameter, which is not supported yet

  def getHasSelection(): Boolean =
    gtk_text_buffer_get_has_selection(this.raw.asInstanceOf).value.!=(0)

  def getInsert(): TextMark = new TextMark(
    gtk_text_buffer_get_insert(this.raw.asInstanceOf).asInstanceOf
  )

  // Method get_iter_at_child_anchor contains an OUT parameter, which is not supported yet

  // Method get_iter_at_line contains an OUT parameter, which is not supported yet

  // Method get_iter_at_line_index contains an OUT parameter, which is not supported yet

  // Method get_iter_at_line_offset contains an OUT parameter, which is not supported yet

  // Method get_iter_at_mark contains an OUT parameter, which is not supported yet

  // Method get_iter_at_offset contains an OUT parameter, which is not supported yet

  def getLineCount(): Int = gtk_text_buffer_get_line_count(
    this.raw.asInstanceOf
  )

  def getMark(name: String | CString)(using Zone): TextMark = new TextMark(
    gtk_text_buffer_get_mark(
      this.raw.asInstanceOf,
      __sn_extract_string(name)
    ).asInstanceOf
  )

  def getMaxUndoLevels(): UInt = gtk_text_buffer_get_max_undo_levels(
    this.raw.asInstanceOf
  ).value

  def getModified(): Boolean =
    gtk_text_buffer_get_modified(this.raw.asInstanceOf).value.!=(0)

  def getSelectionBound(): TextMark = new TextMark(
    gtk_text_buffer_get_selection_bound(this.raw.asInstanceOf).asInstanceOf
  )

  // Method get_selection_bounds contains an OUT parameter, which is not supported yet

  def getSelectionContent(): ContentProvider = new ContentProvider(
    gtk_text_buffer_get_selection_content(this.raw.asInstanceOf).asInstanceOf
  )

  def getSlice(
      start: Ptr[GtkTextIter],
      end: Ptr[GtkTextIter],
      include_hidden_chars: Boolean
  )(using Zone): String = fromCString(
    gtk_text_buffer_get_slice(
      this.raw.asInstanceOf,
      start,
      end,
      gboolean(gint((if include_hidden_chars == true then 1 else 0)))
    ).asInstanceOf
  )

  // Method get_start_iter contains an OUT parameter, which is not supported yet

  def getTagTable(): TextTagTable = new TextTagTable(
    gtk_text_buffer_get_tag_table(this.raw.asInstanceOf).asInstanceOf
  )

  def getText(
      start: Ptr[GtkTextIter],
      end: Ptr[GtkTextIter],
      include_hidden_chars: Boolean
  )(using Zone): String = fromCString(
    gtk_text_buffer_get_text(
      this.raw.asInstanceOf,
      start,
      end,
      gboolean(gint((if include_hidden_chars == true then 1 else 0)))
    ).asInstanceOf
  )

  def insert(iter: Ptr[GtkTextIter], text: String | CString, len: Int)(using
      Zone
  ): Unit = gtk_text_buffer_insert(
    this.raw.asInstanceOf,
    iter,
    __sn_extract_string(text),
    len
  )

  def insertAtCursor(text: String | CString, len: Int)(using Zone): Unit =
    gtk_text_buffer_insert_at_cursor(
      this.raw.asInstanceOf,
      __sn_extract_string(text),
      len
    )

  def insertChildAnchor(iter: Ptr[GtkTextIter], anchor: TextChildAnchor): Unit =
    gtk_text_buffer_insert_child_anchor(
      this.raw.asInstanceOf,
      iter,
      anchor.getUnsafeRawPointer().asInstanceOf
    )

  def insertInteractive(
      iter: Ptr[GtkTextIter],
      text: String | CString,
      len: Int,
      default_editable: Boolean
  )(using Zone): Boolean = gtk_text_buffer_insert_interactive(
    this.raw.asInstanceOf,
    iter,
    __sn_extract_string(text),
    len,
    gboolean(gint((if default_editable == true then 1 else 0)))
  ).value.!=(0)

  def insertInteractiveAtCursor(
      text: String | CString,
      len: Int,
      default_editable: Boolean
  )(using Zone): Boolean = gtk_text_buffer_insert_interactive_at_cursor(
    this.raw.asInstanceOf,
    __sn_extract_string(text),
    len,
    gboolean(gint((if default_editable == true then 1 else 0)))
  ).value.!=(0)

  def insertMarkup(iter: Ptr[GtkTextIter], markup: String | CString, len: Int)(
      using Zone
  ): Unit = gtk_text_buffer_insert_markup(
    this.raw.asInstanceOf,
    iter,
    __sn_extract_string(markup),
    len
  )

  def insertPaintable(iter: Ptr[GtkTextIter], paintable: Paintable): Unit =
    gtk_text_buffer_insert_paintable(
      this.raw.asInstanceOf,
      iter,
      paintable.getUnsafeRawPointer().asInstanceOf
    )

  def insertRange(
      iter: Ptr[GtkTextIter],
      start: Ptr[GtkTextIter],
      end: Ptr[GtkTextIter]
  ): Unit =
    gtk_text_buffer_insert_range(this.raw.asInstanceOf, iter, start, end)

  def insertRangeInteractive(
      iter: Ptr[GtkTextIter],
      start: Ptr[GtkTextIter],
      end: Ptr[GtkTextIter],
      default_editable: Boolean
  ): Boolean = gtk_text_buffer_insert_range_interactive(
    this.raw.asInstanceOf,
    iter,
    start,
    end,
    gboolean(gint((if default_editable == true then 1 else 0)))
  ).value.!=(0)

  inline def insertWithTags(
      iter: Ptr[GtkTextIter],
      text: String | CString,
      len: Int,
      first_tag: TextTag,
      args: Any*
  )(using Zone): Unit = gtk_text_buffer_insert_with_tags(
    this.raw.asInstanceOf,
    iter,
    __sn_extract_string(text),
    len,
    first_tag.getUnsafeRawPointer().asInstanceOf,
    args*
  )

  inline def insertWithTagsByName(
      iter: Ptr[GtkTextIter],
      text: String | CString,
      len: Int,
      first_tag_name: String | CString,
      args: Any*
  )(using Zone): Unit = gtk_text_buffer_insert_with_tags_by_name(
    this.raw.asInstanceOf,
    iter,
    __sn_extract_string(text),
    len,
    __sn_extract_string(first_tag_name),
    args*
  )

  def moveMark(mark: TextMark, where: Ptr[GtkTextIter]): Unit =
    gtk_text_buffer_move_mark(
      this.raw.asInstanceOf,
      mark.getUnsafeRawPointer().asInstanceOf,
      where
    )

  def moveMarkByName(name: String | CString, where: Ptr[GtkTextIter])(using
      Zone
  ): Unit = gtk_text_buffer_move_mark_by_name(
    this.raw.asInstanceOf,
    __sn_extract_string(name),
    where
  )

  def pasteClipboard(
      clipboard: Clipboard,
      override_location: Ptr[GtkTextIter],
      default_editable: Boolean
  ): Unit = gtk_text_buffer_paste_clipboard(
    this.raw.asInstanceOf,
    clipboard.getUnsafeRawPointer().asInstanceOf,
    override_location,
    gboolean(gint((if default_editable == true then 1 else 0)))
  )

  def placeCursor(where: Ptr[GtkTextIter]): Unit =
    gtk_text_buffer_place_cursor(this.raw.asInstanceOf, where)

  def redo(): Unit = gtk_text_buffer_redo(this.raw.asInstanceOf)

  def removeAllTags(start: Ptr[GtkTextIter], end: Ptr[GtkTextIter]): Unit =
    gtk_text_buffer_remove_all_tags(this.raw.asInstanceOf, start, end)

  def removeSelectionClipboard(clipboard: Clipboard): Unit =
    gtk_text_buffer_remove_selection_clipboard(
      this.raw.asInstanceOf,
      clipboard.getUnsafeRawPointer().asInstanceOf
    )

  def removeTag(
      tag: TextTag,
      start: Ptr[GtkTextIter],
      end: Ptr[GtkTextIter]
  ): Unit = gtk_text_buffer_remove_tag(
    this.raw.asInstanceOf,
    tag.getUnsafeRawPointer().asInstanceOf,
    start,
    end
  )

  def removeTagByName(
      name: String | CString,
      start: Ptr[GtkTextIter],
      end: Ptr[GtkTextIter]
  )(using Zone): Unit = gtk_text_buffer_remove_tag_by_name(
    this.raw.asInstanceOf,
    __sn_extract_string(name),
    start,
    end
  )

  def selectRange(ins: Ptr[GtkTextIter], bound: Ptr[GtkTextIter]): Unit =
    gtk_text_buffer_select_range(this.raw.asInstanceOf, ins, bound)

  def setEnableUndo(enable_undo: Boolean): Unit =
    gtk_text_buffer_set_enable_undo(
      this.raw.asInstanceOf,
      gboolean(gint((if enable_undo == true then 1 else 0)))
    )

  def setMaxUndoLevels(max_undo_levels: UInt): Unit =
    gtk_text_buffer_set_max_undo_levels(
      this.raw.asInstanceOf,
      guint(max_undo_levels)
    )

  def setModified(setting: Boolean): Unit = gtk_text_buffer_set_modified(
    this.raw.asInstanceOf,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  def setText(text: String | CString, len: Int)(using Zone): Unit =
    gtk_text_buffer_set_text(
      this.raw.asInstanceOf,
      __sn_extract_string(text),
      len
    )

  def undo(): Unit = gtk_text_buffer_undo(this.raw.asInstanceOf)

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
  def apply(table: TextTagTable): TextBuffer = new TextBuffer(
    gtk_text_buffer_new(table.getUnsafeRawPointer().asInstanceOf).asInstanceOf
  )
end TextBuffer
