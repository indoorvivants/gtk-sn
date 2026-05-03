package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.SelectionMode
import sn.gnome.gtk4.fluent.TreeView
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
  def countSelectedRows(): Int /* None */ =
    gtk_tree_selection_count_selected_rows(
      this.raw.asInstanceOf[Ptr[GtkTreeSelection]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the selection mode for @selection. See gtk_tree_selection_set_mode().
    */
  def getMode(): SelectionMode /* None */ = SelectionMode.fromRaw(
    gtk_tree_selection_get_mode(this.raw.asInstanceOf[Ptr[GtkTreeSelection]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the current selection function.
    */
  def getSelectFunction(): GtkTreeSelectionFunc /* None */ =
    gtk_tree_selection_get_select_function(
      this.raw.asInstanceOf[Ptr[GtkTreeSelection]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @iter to the currently selected node if @selection is set to
    * %GTK_SELECTION_SINGLE or %GTK_SELECTION_BROWSE. @iter may be NULL if you
    * just want to test if @selection has any selected nodes. @model is filled
    * with the current model as a convenience. This function will not work if
    * you use @selection is %GTK_SELECTION_MULTIPLE.
    */
  @annotation.compileTimeOnly(
    "Method get_selected contains an OUT parameter, which is not supported yet"
  )
  private def getSelected__ = ???

  /**  COMMENT FOR THE ORIGINAL C DEFINITION
    *
    *  Creates a list of path of all selected rows. Additionally, if you are
    *  planning on modifying the model after calling this function, you may
    *  want to convert the returned list into a list of `GtkTreeRowReference`s.
    *  To do this, you can use gtk_tree_row_reference_new().
    *
    *  To free the return value, use:
    *  |[<!-- language="C" -->
    *  g_list_free_full (list, (GDestroyNotify) gtk_tree_path_free);
    *  ]|
    */
  @annotation.compileTimeOnly(
    "Method get_selected_rows contains an OUT parameter, which is not supported yet"
  )
  private def getSelectedRows__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the tree view associated with @selection.
    */
  def getTreeView(): TreeView /* None */ = new TreeView(
    gtk_tree_selection_get_tree_view(
      this.raw.asInstanceOf[Ptr[GtkTreeSelection]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the user data for the selection function.
    */
  def getUserData(): Ptr[Byte] /* None */ = gtk_tree_selection_get_user_data(
    this.raw.asInstanceOf[Ptr[GtkTreeSelection]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if the row at @iter is currently selected.
    */
  def iterIsSelected(
      iter: Ptr[GtkTreeIter] /* Some(Ptr[GtkTreeIter]) */
  ): Boolean /* None */ = gtk_tree_selection_iter_is_selected(
    this.raw.asInstanceOf[Ptr[GtkTreeSelection]],
    iter
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if the row pointed to by @path is currently selected. If @path
    * does not point to a valid location, %FALSE is returned
    */
  def pathIsSelected(
      path: Ptr[GtkTreePath] /* Some(Ptr[GtkTreePath]) */
  ): Boolean /* None */ = gtk_tree_selection_path_is_selected(
    this.raw.asInstanceOf[Ptr[GtkTreeSelection]],
    path
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects all the nodes. @selection must be set to %GTK_SELECTION_MULTIPLE
    * mode.
    */
  def selectAll(): Unit /* None */ = gtk_tree_selection_select_all(
    this.raw.asInstanceOf[Ptr[GtkTreeSelection]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects the specified iterator.
    */
  def selectIter(
      iter: Ptr[GtkTreeIter] /* Some(Ptr[GtkTreeIter]) */
  ): Unit /* None */ = gtk_tree_selection_select_iter(
    this.raw.asInstanceOf[Ptr[GtkTreeSelection]],
    iter
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Select the row at @path.
    */
  def selectPath(
      path: Ptr[GtkTreePath] /* Some(Ptr[GtkTreePath]) */
  ): Unit /* None */ = gtk_tree_selection_select_path(
    this.raw.asInstanceOf[Ptr[GtkTreeSelection]],
    path
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects a range of nodes, determined by @start_path and @end_path
    * inclusive.
    * @selection
    *   must be set to %GTK_SELECTION_MULTIPLE mode.
    */
  def selectRange(
      start_path: Ptr[GtkTreePath] /* Some(Ptr[GtkTreePath]) */,
      end_path: Ptr[GtkTreePath] /* Some(Ptr[GtkTreePath]) */
  ): Unit /* None */ = gtk_tree_selection_select_range(
    this.raw.asInstanceOf[Ptr[GtkTreeSelection]],
    start_path,
    end_path
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Calls a function for each selected node. Note that you cannot modify the
    * tree or selection from within this function. As a result,
    * gtk_tree_selection_get_selected_rows() might be more useful.
    */
  def selectedForeach(
      func: GtkTreeSelectionForeachFunc /* Some(GtkTreeSelectionForeachFunc) */,
      data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = gtk_tree_selection_selected_foreach(
    this.raw.asInstanceOf[Ptr[GtkTreeSelection]],
    func,
    data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the selection mode of the @selection. If the previous type was
    * %GTK_SELECTION_MULTIPLE, then the anchor is kept selected, if it was
    * previously selected.
    */
  def setMode(
      `type`: SelectionMode /* Some(GtkSelectionMode) */
  ): Unit /* None */ = gtk_tree_selection_set_mode(
    this.raw.asInstanceOf[Ptr[GtkTreeSelection]],
    `type`.raw
  )

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
      func: Option[GtkTreeSelectionFunc /* Some(GtkTreeSelectionFunc) */ ],
      data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      destroy: GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
  ): Unit /* None */ = gtk_tree_selection_set_select_function(
    this.raw.asInstanceOf[Ptr[GtkTreeSelection]],
    func
      .map[GtkTreeSelectionFunc](o => o)
      .getOrElse(null.asInstanceOf[GtkTreeSelectionFunc]),
    data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
    destroy
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unselects all the nodes.
    */
  def unselectAll(): Unit /* None */ = gtk_tree_selection_unselect_all(
    this.raw.asInstanceOf[Ptr[GtkTreeSelection]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unselects the specified iterator.
    */
  def unselectIter(
      iter: Ptr[GtkTreeIter] /* Some(Ptr[GtkTreeIter]) */
  ): Unit /* None */ = gtk_tree_selection_unselect_iter(
    this.raw.asInstanceOf[Ptr[GtkTreeSelection]],
    iter
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unselects the row at @path.
    */
  def unselectPath(
      path: Ptr[GtkTreePath] /* Some(Ptr[GtkTreePath]) */
  ): Unit /* None */ = gtk_tree_selection_unselect_path(
    this.raw.asInstanceOf[Ptr[GtkTreeSelection]],
    path
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unselects a range of nodes, determined by @start_path and @end_path
    * inclusive.
    */
  def unselectRange(
      start_path: Ptr[GtkTreePath] /* Some(Ptr[GtkTreePath]) */,
      end_path: Ptr[GtkTreePath] /* Some(Ptr[GtkTreePath]) */
  ): Unit /* None */ = gtk_tree_selection_unselect_range(
    this.raw.asInstanceOf[Ptr[GtkTreeSelection]],
    start_path,
    end_path
  )

end TreeSelection
