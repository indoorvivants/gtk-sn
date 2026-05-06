package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.{TreeDragSource, TreeModel, TreeSortable}
import sn.gnome.gtk4.internal.GtkTreeModelSort

/**  A GtkTreeModel which makes an underlying tree model sortable
  *
  *  The `GtkTreeModelSort` is a model which implements the `GtkTreeSortable`
  *  interface.  It does not hold any data itself, but rather is created with
  *  a child model and proxies its data.  It has identical column types to
  *  this child model, and the changes in the child are propagated.  The
  *  primary purpose of this model is to provide a way to sort a different
  *  model without modifying it. Note that the sort function used by
  *  `GtkTreeModelSort` is not guaranteed to be stable.
  *
  *  The use of this is best demonstrated through an example.  In the
  *  following sample code we create two `GtkTreeView` widgets each with a
  *  view of the same data.  As the model is wrapped here by a
  *  `GtkTreeModelSort`, the two `GtkTreeView`s can each sort their
  *  view of the data without affecting the other.  By contrast, if we
  *  simply put the same model in each widget, then sorting the first would
  *  sort the second.
  *
  *  ## Using a `GtkTreeModelSort`
  *
  *  |[<!-- language="C" -->
  *  {
  *    GtkTreeView *tree_view1;
  *    GtkTreeView *tree_view2;
  *    GtkTreeModel *sort_model1;
  *    GtkTreeModel *sort_model2;
  *    GtkTreeModel *child_model;
  *
  *    // get the child model
  *    child_model = get_my_model ();
  *
  *    // Create the first tree
  *    sort_model1 = gtk_tree_model_sort_new_with_model (child_model);
  *    tree_view1 = gtk_tree_view_new_with_model (sort_model1);
  *
  *    // Create the second tree
  *    sort_model2 = gtk_tree_model_sort_new_with_model (child_model);
  *    tree_view2 = gtk_tree_view_new_with_model (sort_model2);
  *
  *    // Now we can sort the two models independently
  *    gtk_tree_sortable_set_sort_column_id (GTK_TREE_SORTABLE (sort_model1),
  *                                          COLUMN_1, GTK_SORT_ASCENDING);
  *    gtk_tree_sortable_set_sort_column_id (GTK_TREE_SORTABLE (sort_model2),
  *                                          COLUMN_1, GTK_SORT_DESCENDING);
  *  }
  *  ]|
  *
  *  To demonstrate how to access the underlying child model from the sort
  *  model, the next example will be a callback for the `GtkTreeSelection`
  *  `GtkTreeSelection::changed` signal.  In this callback, we get a string
  *  from COLUMN_1 of the model.  We then modify the string, find the same
  *  selected row on the child model, and change the row there.
  *
  *  ## Accessing the child model of in a selection changed callback
  *
  *  |[<!-- language="C" -->
  *  void
  *  selection_changed (GtkTreeSelection *selection, gpointer data)
  *  {
  *    GtkTreeModel *sort_model = NULL;
  *    GtkTreeModel *child_model;
  *    GtkTreeIter sort_iter;
  *    GtkTreeIter child_iter;
  *    char *some_data = NULL;
  *    char *modified_data;
  *
  *    // Get the current selected row and the model.
  *    if (! gtk_tree_selection_get_selected (selection,
  *                                           &sort_model,
  *                                           &sort_iter))
  *      return;
  *
  *    // Look up the current value on the selected row and get
  *    // a new value to change it to.
  *    gtk_tree_model_get (GTK_TREE_MODEL (sort_model), &sort_iter,
  *                        COLUMN_1, &some_data,
  *                        -1);
  *
  *    modified_data = change_the_data (some_data);
  *    g_free (some_data);
  *
  *    // Get an iterator on the child model, instead of the sort model.
  *    gtk_tree_model_sort_convert_iter_to_child_iter (GTK_TREE_MODEL_SORT (sort_model),
  *                                                    &child_iter,
  *                                                    &sort_iter);
  *
  *    // Get the child model and change the value of the row. In this
  *    // example, the child model is a GtkListStore. It could be any other
  *    // type of model, though.
  *    child_model = gtk_tree_model_sort_get_model (GTK_TREE_MODEL_SORT (sort_model));
  *    gtk_list_store_set (GTK_LIST_STORE (child_model), &child_iter,
  *                        COLUMN_1, &modified_data,
  *                        -1);
  *    g_free (modified_data);
  *  }
  *  ]|
  *
  *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
  */
class TreeModelSort(raw: Ptr[GtkTreeModelSort])
    extends Object(raw.asInstanceOf),
      TreeDragSource,
      TreeModel,
      TreeSortable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** This function should almost never be called. It clears the @tree_model_sort
    * of any cached iterators that haven’t been reffed with
    * gtk_tree_model_ref_node(). This might be useful if the child model being
    * sorted is static (and doesn’t change often) and there has been a lot of
    * unreffed access to nodes. As a side effect of this function, all unreffed
    * iters will be invalid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clearCache(): Unit /* None */ = gtk_tree_model_sort_clear_cache(
    this.raw.asInstanceOf[Ptr[GtkTreeModelSort]]
  )

  /** Sets @sort_iter to point to the row in @tree_model_sort that corresponds
    * to the row pointed at by @child_iter. If @sort_iter was not set, %FALSE is
    * returned. Note: a boolean is only returned since 2.14.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method convert_child_iter_to_iter]: Method convert_child_iter_to_iter contains an OUT parameter, which is not supported yet"
  )
  private def convertChildIterToIter__ = ???

  /** Converts @child_path to a path relative to @tree_model_sort. That is,
    * @child_path
    *   points to a path in the child model. The returned path will point to the
    *   same row in the sorted model. If @child_path isn’t a valid path on the
    *   child model, then %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method convert_child_path_to_path/<method parameters>/child_path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def convertChildPathToPath__ = ???

  /** Sets @child_iter to point to the row pointed to by @sorted_iter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method convert_iter_to_child_iter]: Method convert_iter_to_child_iter contains an OUT parameter, which is not supported yet"
  )
  private def convertIterToChildIter__ = ???

  /** Converts @sorted_path to a path on the child model of @tree_model_sort.
    * That is, @sorted_path points to a location in @tree_model_sort. The
    * returned path will point to the same location in the model not being
    * sorted. If @sorted_path does not point to a location in the child model,
    * %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method convert_path_to_child_path/<method parameters>/sorted_path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def convertPathToChildPath__ = ???

  /** Returns the model the `GtkTreeModelSort` is sorting.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModel(): TreeModel /* None */ = new TreeModel.Abstract(
    gtk_tree_model_sort_get_model(
      this.raw.asInstanceOf[Ptr[GtkTreeModelSort]]
    ).asInstanceOf
  )

  /** > This function is slow. Only use it for debugging and/or testing >
    * purposes.
    *
    * Checks if the given iter is a valid iter for this `GtkTreeModelSort`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method iter_is_valid/<method parameters>/iter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))"
  )
  private def iterIsValid__ = ???

  /** This resets the default sort function to be in the “unsorted” state. That
    * is, it is in the same order as the child model. It will re-sort the model
    * to be in the same order as the child model only if the `GtkTreeModelSort`
    * is in “unsorted” state.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def resetDefaultSortFunc(): Unit /* None */ =
    gtk_tree_model_sort_reset_default_sort_func(
      this.raw.asInstanceOf[Ptr[GtkTreeModelSort]]
    )

end TreeModelSort

object TreeModelSort:
  /** Creates a new `GtkTreeModelSort`, with @child_model as the child model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withModel(
      child_model: TreeModel /* Some(Ptr[GtkTreeModel]) */
  ): TreeModelSort = new TreeModelSort(
    gtk_tree_model_sort_new_with_model(
      child_model.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end TreeModelSort
