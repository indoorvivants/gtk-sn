package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{Buildable, CellArea, CellLayout, TreeModel, Widget}
import sn.gnome.gtk4.internal.GtkEntryCompletion
import sn.gnome.runtime.*

/** `GtkEntryCompletion` is an auxiliary object to provide completion
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class EntryCompletion private[gnome] (raw: Ptr[GtkEntryCompletion])
    extends Object(raw.asInstanceOf),
      Buildable,
      CellLayout:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Requests a completion operation, or in other words a refiltering of the
    * current list with completions, using the current key.
    *
    * The completion list view will be updated accordingly.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def complete(): Unit /* None */ =
    gtk_entry_completion_complete(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntryCompletion]]
    )
  end complete

  /** Computes the common prefix that is shared by all rows in @completion that
    * start with @key.
    *
    * If no row matches @key, %NULL will be returned. Note that a text column
    * must have been set for this function to work, see
    * [method@Gtk.EntryCompletion.set_text_column] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def computePrefix(
      key: String /* Some(CString) */
  )(using Runtime): String /* None */ =
    fromCString(
      gtk_entry_completion_compute_prefix(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntryCompletion]],
        summon[Runtime].inZone(toCString(key))
      ).asInstanceOf
    )
  end computePrefix

  /** Get the original text entered by the user that triggered the completion or
    * %NULL if there’s no completion ongoing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCompletionPrefix(): String /* None */ =
    fromCString(
      gtk_entry_completion_get_completion_prefix(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntryCompletion]]
      ).asInstanceOf
    )
  end getCompletionPrefix

  /** Gets the entry @completion has been attached to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEntry()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_entry_completion_get_entry(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntryCompletion]]
      ).asInstanceOf
    )
  end getEntry

  /** Returns whether the common prefix of the possible completions should be
    * automatically inserted in the entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInlineCompletion(): Boolean /* None */ =
    gtk_entry_completion_get_inline_completion(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntryCompletion]]
    ).value.!=(0)
  end getInlineCompletion

  /** Returns %TRUE if inline-selection mode is turned on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInlineSelection(): Boolean /* None */ =
    gtk_entry_completion_get_inline_selection(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntryCompletion]]
    ).value.!=(0)
  end getInlineSelection

  /** Returns the minimum key length as set for @completion.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMinimumKeyLength(): Int /* None */ =
    gtk_entry_completion_get_minimum_key_length(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntryCompletion]]
    )
  end getMinimumKeyLength

  /** Returns the model the `GtkEntryCompletion` is using as data source.
    *
    * Returns %NULL if the model is unset.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModel(): TreeModel /* None */ =
    new TreeModel.Abstract(
      gtk_entry_completion_get_model(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntryCompletion]]
      ).asInstanceOf
    )
  end getModel

  /** Returns whether the completions should be presented in a popup window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPopupCompletion(): Boolean /* None */ =
    gtk_entry_completion_get_popup_completion(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntryCompletion]]
    ).value.!=(0)
  end getPopupCompletion

  /** Returns whether the completion popup window will be resized to the width
    * of the entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPopupSetWidth(): Boolean /* None */ =
    gtk_entry_completion_get_popup_set_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntryCompletion]]
    ).value.!=(0)
  end getPopupSetWidth

  /** Returns whether the completion popup window will appear even if there is
    * only a single match.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPopupSingleMatch(): Boolean /* None */ =
    gtk_entry_completion_get_popup_single_match(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntryCompletion]]
    ).value.!=(0)
  end getPopupSingleMatch

  /** Returns the column in the model of @completion to get strings from.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTextColumn(): Int /* None */ =
    gtk_entry_completion_get_text_column(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntryCompletion]]
    )
  end getTextColumn

  /** Requests a prefix insertion.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertPrefix(): Unit /* None */ =
    gtk_entry_completion_insert_prefix(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntryCompletion]]
    )
  end insertPrefix

  /** Sets whether the common prefix of the possible completions should be
    * automatically inserted in the entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInlineCompletion(
      inline_completion: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_entry_completion_set_inline_completion(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntryCompletion]],
      gboolean(gint((if inline_completion == true then 1 else 0)))
    )
  end setInlineCompletion

  /** Sets whether it is possible to cycle through the possible completions
    * inside the entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInlineSelection(
      inline_selection: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_entry_completion_set_inline_selection(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntryCompletion]],
      gboolean(gint((if inline_selection == true then 1 else 0)))
    )
  end setInlineSelection

  /** Sets the match function for @completion to be @func.
    *
    * The match function is used to determine if a row should or should not be
    * in the completion list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_match_func/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(EntryCompletionMatchFunc), @type -> DataRecord(GtkEntryCompletionMatchFunc)))"
  )
  private def setMatchFunc__ = ???

  /** Requires the length of the search key for @completion to be at least
    * @length.
    *
    * This is useful for long lists, where completing using a small key takes a
    * lot of time and will come up with meaningless results anyway (ie, a too
    * large dataset).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMinimumKeyLength(length: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_entry_completion_set_minimum_key_length(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntryCompletion]],
      length
    )
  end setMinimumKeyLength

  /** Sets the model for a `GtkEntryCompletion`.
    *
    * If @completion already has a model set, it will remove it before setting
    * the new model. If model is %NULL, then it will unset the model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModel(
      model: Option[TreeModel /* Some(Ptr[GtkTreeModel]) */ ]
  ): Unit /* None */ =
    gtk_entry_completion_set_model(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntryCompletion]],
      model
        .map[Ptr[GtkTreeModel]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkTreeModel]])
    )
  end setModel

  /** Sets whether the completions should be presented in a popup window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPopupCompletion(
      popup_completion: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_entry_completion_set_popup_completion(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntryCompletion]],
      gboolean(gint((if popup_completion == true then 1 else 0)))
    )
  end setPopupCompletion

  /** Sets whether the completion popup window will be resized to be the same
    * width as the entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPopupSetWidth(
      popup_set_width: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_entry_completion_set_popup_set_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntryCompletion]],
      gboolean(gint((if popup_set_width == true then 1 else 0)))
    )
  end setPopupSetWidth

  /** Sets whether the completion popup window will appear even if there is only
    * a single match.
    *
    * You may want to set this to %FALSE if you are using
    * [property@Gtk.EntryCompletion:inline-completion].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPopupSingleMatch(
      popup_single_match: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_entry_completion_set_popup_single_match(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntryCompletion]],
      gboolean(gint((if popup_single_match == true then 1 else 0)))
    )
  end setPopupSingleMatch

  /** Convenience function for setting up the most used case of this code: a
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTextColumn(column: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_entry_completion_set_text_column(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEntryCompletion]],
      column
    )
  end setTextColumn

  /** Emitted when a match from the cursor is on a match of the list.
    *
    * The default behaviour is to replace the contents of the entry with the
    * contents of the text column in the row pointed to by @iter.
    *
    * Note that @model is the model that was passed to
    * [method@Gtk.EntryCompletion.set_model].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal cursor-on-match]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TreeModel)))"
  )
  private def onCursorOnMatch = ???

  /** Emitted when the inline autocompletion is triggered.
    *
    * The default behaviour is to make the entry display the whole prefix and
    * select the newly inserted part.
    *
    * Applications may connect to this signal in order to insert only a smaller
    * part of the @prefix into the entry - e.g. the entry used in the
    * `GtkFileChooser` inserts only the part of the prefix up to the next '/'.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onInsertPrefix(handler: ((prefix: String)) => Boolean)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (prefix: String), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkEntryCompletion],
          prefix: CString /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((prefix = fromCString(prefix)))
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
    val signal = c"insert-prefix"
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
  end onInsertPrefix

  /** Emitted when a match from the list is selected.
    *
    * The default behaviour is to replace the contents of the entry with the
    * contents of the text column in the row pointed to by @iter.
    *
    * Note that @model is the model that was passed to
    * [method@Gtk.EntryCompletion.set_model].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal match-selected]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TreeModel)))"
  )
  private def onMatchSelected = ???

  /** Emitted when the filter model has zero number of rows in
    * completion_complete method.
    *
    * In other words when `GtkEntryCompletion` is out of suggestions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onNoMatches(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkEntryCompletion],
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
    val signal = c"no-matches"
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
  end onNoMatches
end EntryCompletion

object EntryCompletion:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkEntryCompletion])(using Runtime) =
    summon[Runtime].getOrCreate[EntryCompletion](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new EntryCompletion(ptr)
    )

  /** Creates a new `GtkEntryCompletion` object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): EntryCompletion =
    val raw: Ptr[Byte] = gtk_entry_completion_new().asInstanceOf
    summon[Runtime].getOrCreate[EntryCompletion](
      raw,
      r => EntryCompletion.applyUnsafe(r.asInstanceOf)
    )
  end apply

  /** Creates a new `GtkEntryCompletion` object using the specified @area.
    *
    * The `GtkCellArea` is used to layout cells in the underlying
    * `GtkTreeViewColumn` for the drop-down menu.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withArea(area: sn.gnome.gtk4.CellArea /* Some(Ptr[GtkCellArea]) */ )(using
      Runtime
  ): EntryCompletion =
    val raw: Ptr[Byte] = gtk_entry_completion_new_with_area(
      area.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime].getOrCreate[EntryCompletion](
      raw,
      r => EntryCompletion.applyUnsafe(r.asInstanceOf)
    )
  end withArea
end EntryCompletion
