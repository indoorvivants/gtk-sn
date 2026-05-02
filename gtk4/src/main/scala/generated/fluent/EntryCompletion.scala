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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkEntryCompletion` is an auxiliary object to provide completion
  * functionality for `GtkEntry`.
  *
  * It implements the [iface@Gtk.CellLayout] interface, to allow the user to add
  * extra cells to the `GtkTreeView` with completion matches.
  *
  * “Completion functionality” means that when the user modifies the text in the
  * entry, `GtkEntryCompletion` checks which rows in the model match the current
  * content of the entry, and displays a list of matches. By default, the
  * matching is done by comparing the entry text case-insensitively against the
  * text column of the model (see [method@Gtk.EntryCompletion.set_text_column]),
  * but this can be overridden with a custom match function (see
  * [method@Gtk.EntryCompletion.set_match_func]).
  *
  * When the user selects a completion, the content of the entry is updated. By
  * default, the content of the entry is replaced by the text column of the
  * model, but this can be overridden by connecting to the
  * [signal@Gtk.EntryCompletion::match-selected] signal and updating the entry
  * in the signal handler. Note that you should return %TRUE from the signal
  * handler to suppress the default behaviour.
  *
  * To add completion functionality to an entry, use
  * [method@Gtk.Entry.set_completion].
  *
  * `GtkEntryCompletion` uses a [class@Gtk.TreeModelFilter] model to represent
  * the subset of the entire model that is currently matching. While the
  * `GtkEntryCompletion` signals [signal@Gtk.EntryCompletion::match-selected]
  * and [signal@Gtk.EntryCompletion::cursor-on-match] take the original model
  * and an iter pointing to that model as arguments, other callbacks and signals
  * (such as `GtkCellLayoutDataFunc` or [signal@Gtk.CellArea::apply-attributes)]
  * will generally take the filter model as argument. As long as you are only
  * calling [method@Gtk.TreeModel.get], this will make no difference to you. If
  * for some reason, you need the original model, use
  * [method@Gtk.TreeModelFilter.get_model]. Don’t forget to use
  * [method@Gtk.TreeModelFilter.convert_iter_to_child_iter] to obtain a matching
  * iter.
  */
class EntryCompletion(raw: Ptr[GtkEntryCompletion])
    extends Object(raw.asInstanceOf),
      Buildable,
      CellLayout:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Requests a completion operation, or in other words a refiltering of the
    * current list with completions, using the current key.
    *
    * The completion list view will be updated accordingly.
    */
  def complete(): Unit /* None */ = gtk_entry_completion_complete(
    this.raw.asInstanceOf[Ptr[GtkEntryCompletion]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Computes the common prefix that is shared by all rows in @completion that
    * start with @key.
    *
    * If no row matches @key, %NULL will be returned. Note that a text column
    * must have been set for this function to work, see
    * [method@Gtk.EntryCompletion.set_text_column] for details.
    */
  def computePrefix(
      key: String | CString /* Some(CString) */
  )(using Zone): String /* None */ = fromCString(
    gtk_entry_completion_compute_prefix(
      this.raw.asInstanceOf[Ptr[GtkEntryCompletion]],
      __sn_extract_string(key)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get the original text entered by the user that triggered the completion or
    * %NULL if there’s no completion ongoing.
    */
  def getCompletionPrefix()(using Zone): String /* None */ = fromCString(
    gtk_entry_completion_get_completion_prefix(
      this.raw.asInstanceOf[Ptr[GtkEntryCompletion]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the entry @completion has been attached to.
    */
  def getEntry(): Widget /* None */ = new Widget(
    gtk_entry_completion_get_entry(
      this.raw.asInstanceOf[Ptr[GtkEntryCompletion]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the common prefix of the possible completions should be
    * automatically inserted in the entry.
    */
  def getInlineCompletion(): Boolean /* None */ =
    gtk_entry_completion_get_inline_completion(
      this.raw.asInstanceOf[Ptr[GtkEntryCompletion]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if inline-selection mode is turned on.
    */
  def getInlineSelection(): Boolean /* None */ =
    gtk_entry_completion_get_inline_selection(
      this.raw.asInstanceOf[Ptr[GtkEntryCompletion]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the minimum key length as set for @completion.
    */
  def getMinimumKeyLength(): Int /* None */ =
    gtk_entry_completion_get_minimum_key_length(
      this.raw.asInstanceOf[Ptr[GtkEntryCompletion]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the model the `GtkEntryCompletion` is using as data source.
    *
    * Returns %NULL if the model is unset.
    */
  def getModel(): TreeModel /* None */ = new TreeModel.Abstract(
    gtk_entry_completion_get_model(
      this.raw.asInstanceOf[Ptr[GtkEntryCompletion]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the completions should be presented in a popup window.
    */
  def getPopupCompletion(): Boolean /* None */ =
    gtk_entry_completion_get_popup_completion(
      this.raw.asInstanceOf[Ptr[GtkEntryCompletion]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the completion popup window will be resized to the width
    * of the entry.
    */
  def getPopupSetWidth(): Boolean /* None */ =
    gtk_entry_completion_get_popup_set_width(
      this.raw.asInstanceOf[Ptr[GtkEntryCompletion]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the completion popup window will appear even if there is
    * only a single match.
    */
  def getPopupSingleMatch(): Boolean /* None */ =
    gtk_entry_completion_get_popup_single_match(
      this.raw.asInstanceOf[Ptr[GtkEntryCompletion]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the column in the model of @completion to get strings from.
    */
  def getTextColumn(): Int /* None */ = gtk_entry_completion_get_text_column(
    this.raw.asInstanceOf[Ptr[GtkEntryCompletion]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Requests a prefix insertion.
    */
  def insertPrefix(): Unit /* None */ = gtk_entry_completion_insert_prefix(
    this.raw.asInstanceOf[Ptr[GtkEntryCompletion]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the common prefix of the possible completions should be
    * automatically inserted in the entry.
    */
  def setInlineCompletion(
      inline_completion: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_entry_completion_set_inline_completion(
    this.raw.asInstanceOf[Ptr[GtkEntryCompletion]],
    gboolean(gint((if inline_completion == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether it is possible to cycle through the possible completions
    * inside the entry.
    */
  def setInlineSelection(
      inline_selection: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_entry_completion_set_inline_selection(
    this.raw.asInstanceOf[Ptr[GtkEntryCompletion]],
    gboolean(gint((if inline_selection == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the match function for @completion to be @func.
    *
    * The match function is used to determine if a row should or should not be
    * in the completion list.
    */
  def setMatchFunc(
      func: GtkEntryCompletionMatchFunc /* Some(GtkEntryCompletionMatchFunc) */,
      func_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      func_notify: GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
  ): Unit /* None */ = gtk_entry_completion_set_match_func(
    this.raw.asInstanceOf[Ptr[GtkEntryCompletion]],
    func,
    func_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
    func_notify
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Requires the length of the search key for @completion to be at least
    * @length.
    *
    * This is useful for long lists, where completing using a small key takes a
    * lot of time and will come up with meaningless results anyway (ie, a too
    * large dataset).
    */
  def setMinimumKeyLength(length: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_entry_completion_set_minimum_key_length(
      this.raw.asInstanceOf[Ptr[GtkEntryCompletion]],
      length
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the model for a `GtkEntryCompletion`.
    *
    * If @completion already has a model set, it will remove it before setting
    * the new model. If model is %NULL, then it will unset the model.
    */
  def setModel(
      model: Option[TreeModel /* Some(Ptr[GtkTreeModel]) */ ]
  ): Unit /* None */ = gtk_entry_completion_set_model(
    this.raw.asInstanceOf[Ptr[GtkEntryCompletion]],
    model
      .map[Ptr[GtkTreeModel]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkTreeModel]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the completions should be presented in a popup window.
    */
  def setPopupCompletion(
      popup_completion: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_entry_completion_set_popup_completion(
    this.raw.asInstanceOf[Ptr[GtkEntryCompletion]],
    gboolean(gint((if popup_completion == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the completion popup window will be resized to be the same
    * width as the entry.
    */
  def setPopupSetWidth(
      popup_set_width: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_entry_completion_set_popup_set_width(
    this.raw.asInstanceOf[Ptr[GtkEntryCompletion]],
    gboolean(gint((if popup_set_width == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the completion popup window will appear even if there is only
    * a single match.
    *
    * You may want to set this to %FALSE if you are using
    * [property@Gtk.EntryCompletion:inline-completion].
    */
  def setPopupSingleMatch(
      popup_single_match: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_entry_completion_set_popup_single_match(
    this.raw.asInstanceOf[Ptr[GtkEntryCompletion]],
    gboolean(gint((if popup_single_match == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience function for setting up the most used case of this code: a
    * completion list with just strings.
    *
    * This function will set up @completion to have a list displaying all (and
    * just) strings in the completion list, and to get those strings from @column
    * in the model of @completion.
    *
    * This functions creates and adds a `GtkCellRendererText` for the selected
    * column. If you need to set the text column, but don't want the cell
    * renderer, use g_object_set() to set the
    * [property@Gtk.EntryCompletion:text-column] property directly.
    */
  def setTextColumn(column: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_entry_completion_set_text_column(
      this.raw.asInstanceOf[Ptr[GtkEntryCompletion]],
      column
    )

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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkEntryCompletion` object.
    */
  def apply(): EntryCompletion = new EntryCompletion(
    gtk_entry_completion_new().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkEntryCompletion` object using the specified @area.
    *
    * The `GtkCellArea` is used to layout cells in the underlying
    * `GtkTreeViewColumn` for the drop-down menu.
    */
  def withArea(area: CellArea /* Some(Ptr[GtkCellArea]) */ ): EntryCompletion =
    new EntryCompletion(
      gtk_entry_completion_new_with_area(
        area.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
end EntryCompletion
