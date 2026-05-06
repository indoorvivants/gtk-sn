package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gchar, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{SelectionMode, TreeView}
import sn.gnome.gtk4.internal.GtkTreeSelection

/** The selection object for GtkTreeView
  *
  * The `GtkTreeSelection` object is a helper object to manage the selection for
  * a `GtkTreeView` widget. The `GtkTreeSelection` object is automatically
  * created when a new `GtkTreeView` widget is created, and cannot exist
  * independently of this widget. The primary reason the `GtkTreeSelection`
  * objects exists is for cleanliness of code and API. That is, there is no
  * conceptual reason all these functions could not be methods on the
  * `GtkTreeView` widget instead of a separate function.
  *
  * The `GtkTreeSelection` object is gotten from a `GtkTreeView` by calling
  * gtk_tree_view_get_selection(). It can be manipulated to check the selection
  * status of the tree, as well as select and deselect individual rows.
  * Selection is done completely view side. As a result, multiple views of the
  * same model can have completely different selections. Additionally, you
  * cannot change the selection of a row on the model that is not currently
  * displayed by the view without expanding its parents first.
  *
  * One of the important things to remember when monitoring the selection of a
  * view is that the `GtkTreeSelection`::changed signal is mostly a hint. That
  * is, it may only emit one signal when a range of rows is selected.
  * Additionally, it may on occasion emit a `GtkTreeSelection`::changed signal
  * when nothing has happened (mostly as a result of programmers calling
  * select_row on an already selected row).
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TreeSelection(raw: Ptr[GtkTreeSelection])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the number of rows that have been selected in @tree.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def countSelectedRows(): Int /* None */ =
    gtk_tree_selection_count_selected_rows(
      this.raw.asInstanceOf[Ptr[GtkTreeSelection]]
    )

  /** Gets the selection mode for @selection. See gtk_tree_selection_set_mode().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMode(): SelectionMode /* None */ = SelectionMode.fromRaw(
    gtk_tree_selection_get_mode(this.raw.asInstanceOf[Ptr[GtkTreeSelection]])
  )

  /** Returns the current selection function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_select_function/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeSelectionFunc), @type -> DataRecord(GtkTreeSelectionFunc)))"
  )
  private def getSelectFunction__ = ???

  /** Sets @iter to the currently selected node if @selection is set to
    * %GTK_SELECTION_SINGLE or %GTK_SELECTION_BROWSE. @iter may be NULL if you
    * just want to test if @selection has any selected nodes. @model is filled
    * with the current model as a convenience. This function will not work if
    * you use @selection is %GTK_SELECTION_MULTIPLE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_selected]: Method get_selected contains an OUT parameter, which is not supported yet"
  )
  private def getSelected__ = ???

  /**  Creates a list of path of all selected rows. Additionally, if you are
    *  planning on modifying the model after calling this function, you may
    *  want to convert the returned list into a list of `GtkTreeRowReference`s.
    *  To do this, you can use gtk_tree_row_reference_new().
    *
    *  To free the return value, use:
    *  |[<!-- language="C" -->
    *  g_list_free_full (list, (GDestroyNotify) gtk_tree_path_free);
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_selected_rows]: Method get_selected_rows contains an OUT parameter, which is not supported yet"
  )
  private def getSelectedRows__ = ???

  /** Returns the tree view associated with @selection.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTreeView(): TreeView /* None */ = new TreeView(
    gtk_tree_selection_get_tree_view(
      this.raw.asInstanceOf[Ptr[GtkTreeSelection]]
    ).asInstanceOf
  )

  /** Returns the user data for the selection function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUserData(): Ptr[Byte] /* None */ = gtk_tree_selection_get_user_data(
    this.raw.asInstanceOf[Ptr[GtkTreeSelection]]
  ).value

  /** Returns %TRUE if the row at @iter is currently selected.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method iter_is_selected/<method parameters>/iter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))"
  )
  private def iterIsSelected__ = ???

  /** Returns %TRUE if the row pointed to by @path is currently selected. If @path
    * does not point to a valid location, %FALSE is returned
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method path_is_selected/<method parameters>/path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def pathIsSelected__ = ???

  /** Selects all the nodes. @selection must be set to %GTK_SELECTION_MULTIPLE
    * mode.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def selectAll(): Unit /* None */ = gtk_tree_selection_select_all(
    this.raw.asInstanceOf[Ptr[GtkTreeSelection]]
  )

  /** Selects the specified iterator.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method select_iter/<method parameters>/iter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))"
  )
  private def selectIter__ = ???

  /** Select the row at @path.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method select_path/<method parameters>/path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def selectPath__ = ???

  /** Selects a range of nodes, determined by @start_path and @end_path
    * inclusive.
    * @selection
    *   must be set to %GTK_SELECTION_MULTIPLE mode.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method select_range/<method parameters>/start_path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def selectRange__ = ???

  /** Calls a function for each selected node. Note that you cannot modify the
    * tree or selection from within this function. As a result,
    * gtk_tree_selection_get_selected_rows() might be more useful.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method selected_foreach/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeSelectionForeachFunc), @type -> DataRecord(GtkTreeSelectionForeachFunc)))"
  )
  private def selectedForeach__ = ???

  /** Sets the selection mode of the @selection. If the previous type was
    * %GTK_SELECTION_MULTIPLE, then the anchor is kept selected, if it was
    * previously selected.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMode(
      `type`: SelectionMode /* Some(GtkSelectionMode) */
  ): Unit /* None */ = gtk_tree_selection_set_mode(
    this.raw.asInstanceOf[Ptr[GtkTreeSelection]],
    `type`.raw
  )

  /** Sets the selection function.
    *
    * If set, this function is called before any node is selected or unselected,
    * giving some control over which nodes are selected. The select function
    * should return %TRUE if the state of the node may be toggled, and %FALSE if
    * the state of the node should be left unchanged.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_select_function/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeSelectionFunc), @type -> DataRecord(GtkTreeSelectionFunc)))"
  )
  private def setSelectFunction__ = ???

  /** Unselects all the nodes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unselectAll(): Unit /* None */ = gtk_tree_selection_unselect_all(
    this.raw.asInstanceOf[Ptr[GtkTreeSelection]]
  )

  /** Unselects the specified iterator.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method unselect_iter/<method parameters>/iter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))"
  )
  private def unselectIter__ = ???

  /** Unselects the row at @path.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method unselect_path/<method parameters>/path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def unselectPath__ = ???

  /** Unselects a range of nodes, determined by @start_path and @end_path
    * inclusive.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method unselect_range/<method parameters>/start_path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def unselectRange__ = ???

  /** Emitted whenever the selection has (possibly) changed. Please note that
    * this signal is mostly a hint. It may only be emitted once when a range of
    * rows are selected, and it may occasionally be emitted when nothing has
    * happened.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onChanged(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkTreeSelection],
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
end TreeSelection
