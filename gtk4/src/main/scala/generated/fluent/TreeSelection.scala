package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.TreeView
import sn.gnome.gtk4.internal.GtkSelectionMode
import sn.gnome.gtk4.internal.GtkTreeIter
import sn.gnome.gtk4.internal.GtkTreePath
import sn.gnome.gtk4.internal.GtkTreeSelection
import sn.gnome.gtk4.internal.GtkTreeSelectionForeachFunc
import sn.gnome.gtk4.internal.GtkTreeSelectionFunc

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The selection object for GtkTreeView
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
  */
class TreeSelection(raw: Ptr[GtkTreeSelection])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the number of rows that have been selected in @tree.
    */
  def countSelectedRows(): Int = gtk_tree_selection_count_selected_rows(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the selection mode for @selection. See gtk_tree_selection_set_mode().
    */
  def getMode(): GtkSelectionMode = gtk_tree_selection_get_mode(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the current selection function.
    */
  def getSelectFunction(): GtkTreeSelectionFunc =
    gtk_tree_selection_get_select_function(this.raw.asInstanceOf)

  @annotation.compileTimeOnly(
    "Method get_selected contains an OUT parameter, which is not supported yet"
  )
  def getSelected() = ???

  @annotation.compileTimeOnly(
    "Method get_selected_rows contains an OUT parameter, which is not supported yet"
  )
  def getSelectedRows() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the tree view associated with @selection.
    */
  def getTreeView(): TreeView = new TreeView(
    gtk_tree_selection_get_tree_view(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the user data for the selection function.
    */
  def getUserData(): Ptr[Byte] = gtk_tree_selection_get_user_data(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if the row at @iter is currently selected.
    */
  def iterIsSelected(iter: Ptr[GtkTreeIter]): Boolean =
    gtk_tree_selection_iter_is_selected(this.raw.asInstanceOf, iter).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if the row pointed to by @path is currently selected. If @path
    * does not point to a valid location, %FALSE is returned
    */
  def pathIsSelected(path: Ptr[GtkTreePath]): Boolean =
    gtk_tree_selection_path_is_selected(this.raw.asInstanceOf, path).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects all the nodes. @selection must be set to %GTK_SELECTION_MULTIPLE
    * mode.
    */
  def selectAll(): Unit = gtk_tree_selection_select_all(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects the specified iterator.
    */
  def selectIter(iter: Ptr[GtkTreeIter]): Unit =
    gtk_tree_selection_select_iter(this.raw.asInstanceOf, iter)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Select the row at @path.
    */
  def selectPath(path: Ptr[GtkTreePath]): Unit =
    gtk_tree_selection_select_path(this.raw.asInstanceOf, path)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects a range of nodes, determined by @start_path and @end_path
    * inclusive.
    * @selection
    *   must be set to %GTK_SELECTION_MULTIPLE mode.
    */
  def selectRange(
      start_path: Ptr[GtkTreePath],
      end_path: Ptr[GtkTreePath]
  ): Unit =
    gtk_tree_selection_select_range(this.raw.asInstanceOf, start_path, end_path)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Calls a function for each selected node. Note that you cannot modify the
    * tree or selection from within this function. As a result,
    * gtk_tree_selection_get_selected_rows() might be more useful.
    */
  def selectedForeach(
      func: GtkTreeSelectionForeachFunc,
      data: Ptr[Byte]
  ): Unit = gtk_tree_selection_selected_foreach(
    this.raw.asInstanceOf,
    func,
    gpointer(data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the selection mode of the @selection. If the previous type was
    * %GTK_SELECTION_MULTIPLE, then the anchor is kept selected, if it was
    * previously selected.
    */
  def setMode(`type`: GtkSelectionMode): Unit =
    gtk_tree_selection_set_mode(this.raw.asInstanceOf, `type`)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the selection function.
    *
    * If set, this function is called before any node is selected or unselected,
    * giving some control over which nodes are selected. The select function
    * should return %TRUE if the state of the node may be toggled, and %FALSE if
    * the state of the node should be left unchanged.
    */
  def setSelectFunction(
      func: GtkTreeSelectionFunc,
      data: Ptr[Byte],
      destroy: GDestroyNotify
  ): Unit = gtk_tree_selection_set_select_function(
    this.raw.asInstanceOf,
    func,
    gpointer(data),
    destroy
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unselects all the nodes.
    */
  def unselectAll(): Unit = gtk_tree_selection_unselect_all(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unselects the specified iterator.
    */
  def unselectIter(iter: Ptr[GtkTreeIter]): Unit =
    gtk_tree_selection_unselect_iter(this.raw.asInstanceOf, iter)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unselects the row at @path.
    */
  def unselectPath(path: Ptr[GtkTreePath]): Unit =
    gtk_tree_selection_unselect_path(this.raw.asInstanceOf, path)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unselects a range of nodes, determined by @start_path and @end_path
    * inclusive.
    */
  def unselectRange(
      start_path: Ptr[GtkTreePath],
      end_path: Ptr[GtkTreePath]
  ): Unit = gtk_tree_selection_unselect_range(
    this.raw.asInstanceOf,
    start_path,
    end_path
  )

end TreeSelection
