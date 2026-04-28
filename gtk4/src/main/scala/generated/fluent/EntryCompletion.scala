package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.CellArea
import sn.gnome.gtk4.fluent.CellLayout
import sn.gnome.gtk4.fluent.TreeModel
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkEntryCompletion
import sn.gnome.gtk4.internal.GtkEntryCompletionMatchFunc

class EntryCompletion(raw: Ptr[GtkEntryCompletion])
    extends Object(raw.asInstanceOf),
      Buildable,
      CellLayout:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def complete(): Unit = gtk_entry_completion_complete(this.raw.asInstanceOf)

  def computePrefix(key: String | CString)(using Zone): String = fromCString(
    gtk_entry_completion_compute_prefix(
      this.raw.asInstanceOf,
      __sn_extract_string(key)
    ).asInstanceOf
  )

  def getCompletionPrefix()(using Zone): String = fromCString(
    gtk_entry_completion_get_completion_prefix(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

  def getEntry(): Widget = new Widget(
    gtk_entry_completion_get_entry(this.raw.asInstanceOf).asInstanceOf
  )

  def getInlineCompletion(): Boolean =
    gtk_entry_completion_get_inline_completion(this.raw.asInstanceOf).value
      .!=(0)

  def getInlineSelection(): Boolean =
    gtk_entry_completion_get_inline_selection(this.raw.asInstanceOf).value.!=(0)

  def getMinimumKeyLength(): Int = gtk_entry_completion_get_minimum_key_length(
    this.raw.asInstanceOf
  )

  def getModel(): TreeModel = new TreeModel.Abstract(
    gtk_entry_completion_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  def getPopupCompletion(): Boolean =
    gtk_entry_completion_get_popup_completion(this.raw.asInstanceOf).value.!=(0)

  def getPopupSetWidth(): Boolean =
    gtk_entry_completion_get_popup_set_width(this.raw.asInstanceOf).value.!=(0)

  def getPopupSingleMatch(): Boolean =
    gtk_entry_completion_get_popup_single_match(this.raw.asInstanceOf).value
      .!=(0)

  def getTextColumn(): Int = gtk_entry_completion_get_text_column(
    this.raw.asInstanceOf
  )

  def insertPrefix(): Unit = gtk_entry_completion_insert_prefix(
    this.raw.asInstanceOf
  )

  def setInlineCompletion(inline_completion: Boolean): Unit =
    gtk_entry_completion_set_inline_completion(
      this.raw.asInstanceOf,
      gboolean(gint((if inline_completion == true then 1 else 0)))
    )

  def setInlineSelection(inline_selection: Boolean): Unit =
    gtk_entry_completion_set_inline_selection(
      this.raw.asInstanceOf,
      gboolean(gint((if inline_selection == true then 1 else 0)))
    )

  def setMatchFunc(
      func: GtkEntryCompletionMatchFunc,
      func_data: Ptr[Byte],
      func_notify: GDestroyNotify
  ): Unit = gtk_entry_completion_set_match_func(
    this.raw.asInstanceOf,
    func,
    gpointer(func_data),
    func_notify
  )

  def setMinimumKeyLength(length: Int): Unit =
    gtk_entry_completion_set_minimum_key_length(this.raw.asInstanceOf, length)

  def setModel(model: TreeModel): Unit = gtk_entry_completion_set_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

  def setPopupCompletion(popup_completion: Boolean): Unit =
    gtk_entry_completion_set_popup_completion(
      this.raw.asInstanceOf,
      gboolean(gint((if popup_completion == true then 1 else 0)))
    )

  def setPopupSetWidth(popup_set_width: Boolean): Unit =
    gtk_entry_completion_set_popup_set_width(
      this.raw.asInstanceOf,
      gboolean(gint((if popup_set_width == true then 1 else 0)))
    )

  def setPopupSingleMatch(popup_single_match: Boolean): Unit =
    gtk_entry_completion_set_popup_single_match(
      this.raw.asInstanceOf,
      gboolean(gint((if popup_single_match == true then 1 else 0)))
    )

  def setTextColumn(column: Int): Unit =
    gtk_entry_completion_set_text_column(this.raw.asInstanceOf, column)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end EntryCompletion

object EntryCompletion:
  def apply(): EntryCompletion = new EntryCompletion(
    gtk_entry_completion_new().asInstanceOf
  )
  def withArea(area: CellArea): EntryCompletion = new EntryCompletion(
    gtk_entry_completion_new_with_area(
      area.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end EntryCompletion
