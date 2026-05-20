package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.internal.GType
import sn.gnome.gtk4.{TreeIter, TreeModel, TreeModelFlags, TreePath}

trait TreeModel:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Creates a new `GtkTreeModel`, with @child_model as the child_model and @root
    * as the virtual root.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def filterNew(
      root: Option[sn.gnome.gtk4.TreePath /* Some(Ptr[GtkTreePath]) */ ]
  ): sn.gnome.gtk4.TreeModel /* None */ =
    new TreeModel.Abstract(
      gtk_tree_model_filter_new(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeModel]],
        root
          .map[Ptr[GtkTreePath]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GtkTreePath]])
      ).asInstanceOf
    )
  end filterNew

  /** Calls @func on each node in model in a depth-first fashion.
    *
    * If @func returns %TRUE, then the tree ceases to be walked, and
    * gtk_tree_model_foreach() returns.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method foreach/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeModelForeachFunc), @type -> DataRecord(GtkTreeModelForeachFunc)))"
  )
  private def foreach__ = ???

  /** Gets the value of one or more cells in the row referenced by @iter.
    *
    * The variable argument list should contain integer column numbers, each
    * column number followed by a place to store the value being retrieved. The
    * list is terminated by a -1. For example, to get a value from column 0 with
    * type %G_TYPE_STRING, you would write:
    * `gtk_tree_model_get (model, iter, 0, &place_string_here, -1)`, where
    * `place_string_here` is a #gchararray to be filled with the string.
    *
    * Returned values with type %G_TYPE_OBJECT have to be unreferenced, values
    * with type %G_TYPE_STRING or %G_TYPE_BOXED have to be freed. Other values
    * are passed by value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def get__ = ???

  /** Returns the type of the column.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getColumnType(`index_`: Int /* Some(CInt) */ ): GType /* None */ =
    gtk_tree_model_get_column_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeModel]],
      `index_`
    )
  end getColumnType

  /** Returns a set of flags supported by this interface.
    *
    * The flags are a bitwise combination of `GtkTreeModel`Flags. The flags
    * supported should not change during the lifetime of the @tree_model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFlags(): sn.gnome.gtk4.TreeModelFlags /* None */ =
    sn.gnome.gtk4.TreeModelFlags.fromRaw(
      gtk_tree_model_get_flags(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeModel]]
      )
    )
  end getFlags

  /** Sets @iter to a valid iterator pointing to @path.
    *
    * If @path does not exist, @iter is set to an invalid iterator and %FALSE is
    * returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_iter]: Method get_iter contains an OUT parameter, which is not supported yet"
  )
  private def getIter__ = ???

  /** Initializes @iter with the first iterator in the tree (the one at the path
    * "0").
    *
    * Returns %FALSE if the tree is empty, %TRUE otherwise.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_iter_first]: Method get_iter_first contains an OUT parameter, which is not supported yet"
  )
  private def getIterFirst__ = ???

  /** Sets @iter to a valid iterator pointing to @path_string, if it exists.
    *
    * Otherwise, @iter is left invalid and %FALSE is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_iter_from_string]: Method get_iter_from_string contains an OUT parameter, which is not supported yet"
  )
  private def getIterFromString__ = ???

  /** Returns the number of columns supported by @tree_model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNColumns(): Int /* None */ =
    gtk_tree_model_get_n_columns(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeModel]]
    )
  end getNColumns

  /** Returns a newly-created `GtkTreePath` referenced by @iter.
    *
    * This path should be freed with gtk_tree_path_free().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPath(
      iter: sn.gnome.gtk4.TreeIter /* Some(Ptr[GtkTreeIter]) */
  ): sn.gnome.gtk4.TreePath /* None */ =
    sn.gnome.gtk4.TreePath.fromRaw(
      gtk_tree_model_get_path(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeModel]],
        iter.getUnsafeRawPointer().asInstanceOf
      )
    )
  end getPath

  /** Generates a string representation of the iter.
    *
    * This string is a “:” separated list of numbers. For example, “4:10:0:3”
    * would be an acceptable return value for this string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStringFromIter(
      iter: sn.gnome.gtk4.TreeIter /* Some(Ptr[GtkTreeIter]) */
  ): scala.Predef.String /* None */ =
    fromCString(
      gtk_tree_model_get_string_from_iter(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeModel]],
        iter.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end getStringFromIter

  /** Gets the value of one or more cells in the row referenced by @iter.
    *
    * See [method@Gtk.TreeModel.get], this version takes a va_list for language
    * bindings to use.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getValist(
      iter: sn.gnome.gtk4.TreeIter /* Some(Ptr[GtkTreeIter]) */,
      var_args: CVarArgList /* Some(va_list) */
  ): Unit /* None */ =
    gtk_tree_model_get_valist(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeModel]],
      iter.getUnsafeRawPointer().asInstanceOf,
      var_args
    )
  end getValist

  /** Initializes and sets @value to that at @column.
    *
    * When done with @value, g_value_unset() needs to be called to free any
    * allocated memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_value]: Method get_value contains an OUT parameter, which is not supported yet"
  )
  private def getValue__ = ???

  /** Sets @iter to point to the first child of @parent.
    *
    * If @parent has no children, %FALSE is returned and @iter is set to be
    * invalid. @parent will remain a valid node after this function has been
    * called.
    *
    * If @parent is %NULL returns the first node, equivalent to
    * `gtk_tree_model_get_iter_first (tree_model, iter);`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method iter_children]: Method iter_children contains an OUT parameter, which is not supported yet"
  )
  private def iterChildren__ = ???

  /** Returns %TRUE if @iter has children, %FALSE otherwise.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def iterHasChild(
      iter: sn.gnome.gtk4.TreeIter /* Some(Ptr[GtkTreeIter]) */
  ): Boolean /* None */ =
    gtk_tree_model_iter_has_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeModel]],
      iter.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end iterHasChild

  /** Returns the number of children that @iter has.
    *
    * As a special case, if @iter is %NULL, then the number of toplevel nodes is
    * returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def iterNChildren(
      iter: Option[sn.gnome.gtk4.TreeIter /* Some(Ptr[GtkTreeIter]) */ ]
  ): Int /* None */ =
    gtk_tree_model_iter_n_children(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeModel]],
      iter
        .map[Ptr[GtkTreeIter]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkTreeIter]])
    )
  end iterNChildren

  /** Sets @iter to point to the node following it at the current level.
    *
    * If there is no next @iter, %FALSE is returned and @iter is set to be
    * invalid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def iterNext(
      iter: sn.gnome.gtk4.TreeIter /* Some(Ptr[GtkTreeIter]) */
  ): Boolean /* None */ =
    gtk_tree_model_iter_next(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeModel]],
      iter.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end iterNext

  /** Sets @iter to be the child of @parent, using the given index.
    *
    * The first index is 0. If @n is too big, or @parent has no children,
    * @iter
    *   is set to an invalid iterator and %FALSE is returned. @parent will
    *   remain a valid node after this function has been called. As a special
    *   case, if @parent is %NULL, then the @n-th root node is set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method iter_nth_child]: Method iter_nth_child contains an OUT parameter, which is not supported yet"
  )
  private def iterNthChild__ = ???

  /** Sets @iter to be the parent of @child.
    *
    * If @child is at the toplevel, and doesn’t have a parent, then
    * @iter
    *   is set to an invalid iterator and %FALSE is returned.
    * @child
    *   will remain a valid node after this function has been called.
    *
    * @iter
    *   will be initialized before the lookup is performed, so @child and @iter
    *   cannot point to the same memory location.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method iter_parent]: Method iter_parent contains an OUT parameter, which is not supported yet"
  )
  private def iterParent__ = ???

  /** Sets @iter to point to the previous node at the current level.
    *
    * If there is no previous @iter, %FALSE is returned and @iter is set to be
    * invalid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def iterPrevious(
      iter: sn.gnome.gtk4.TreeIter /* Some(Ptr[GtkTreeIter]) */
  ): Boolean /* None */ =
    gtk_tree_model_iter_previous(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeModel]],
      iter.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end iterPrevious

  /** Lets the tree ref the node.
    *
    * This is an optional method for models to implement. To be more specific,
    * models may ignore this call as it exists primarily for performance
    * reasons.
    *
    * This function is primarily meant as a way for views to let caching models
    * know when nodes are being displayed (and hence, whether or not to cache
    * that node). Being displayed means a node is in an expanded branch,
    * regardless of whether the node is currently visible in the viewport. For
    * example, a file-system based model would not want to keep the entire
    * file-hierarchy in memory, just the sections that are currently being
    * displayed by every current view.
    *
    * A model should be expected to be able to get an iter independent of its
    * reffed state.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def refNode(
      iter: sn.gnome.gtk4.TreeIter /* Some(Ptr[GtkTreeIter]) */
  ): Unit /* None */ =
    gtk_tree_model_ref_node(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeModel]],
      iter.getUnsafeRawPointer().asInstanceOf
    )
  end refNode

  /** Emits the ::row-changed signal on @tree_model.
    *
    * See [signal@Gtk.TreeModel::row-changed].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def rowChanged(
      path: sn.gnome.gtk4.TreePath /* Some(Ptr[GtkTreePath]) */,
      iter: sn.gnome.gtk4.TreeIter /* Some(Ptr[GtkTreeIter]) */
  ): Unit /* None */ =
    gtk_tree_model_row_changed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeModel]],
      path.getUnsafeRawPointer().asInstanceOf,
      iter.getUnsafeRawPointer().asInstanceOf
    )
  end rowChanged

  /** Emits the ::row-deleted signal on @tree_model.
    *
    * See [signal@Gtk.TreeModel::row-deleted].
    *
    * This should be called by models after a row has been removed. The location
    * pointed to by @path should be the location that the row previously was at.
    * It may not be a valid location anymore.
    *
    * Nodes that are deleted are not unreffed, this means that any outstanding
    * references on the deleted node should not be released.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def rowDeleted(
      path: sn.gnome.gtk4.TreePath /* Some(Ptr[GtkTreePath]) */
  ): Unit /* None */ =
    gtk_tree_model_row_deleted(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeModel]],
      path.getUnsafeRawPointer().asInstanceOf
    )
  end rowDeleted

  /** Emits the ::row-has-child-toggled signal on @tree_model.
    *
    * See [signal@Gtk.TreeModel::row-has-child-toggled].
    *
    * This should be called by models after the child state of a node changes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def rowHasChildToggled(
      path: sn.gnome.gtk4.TreePath /* Some(Ptr[GtkTreePath]) */,
      iter: sn.gnome.gtk4.TreeIter /* Some(Ptr[GtkTreeIter]) */
  ): Unit /* None */ =
    gtk_tree_model_row_has_child_toggled(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeModel]],
      path.getUnsafeRawPointer().asInstanceOf,
      iter.getUnsafeRawPointer().asInstanceOf
    )
  end rowHasChildToggled

  /** Emits the ::row-inserted signal on @tree_model.
    *
    * See [signal@Gtk.TreeModel::row-inserted].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def rowInserted(
      path: sn.gnome.gtk4.TreePath /* Some(Ptr[GtkTreePath]) */,
      iter: sn.gnome.gtk4.TreeIter /* Some(Ptr[GtkTreeIter]) */
  ): Unit /* None */ =
    gtk_tree_model_row_inserted(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeModel]],
      path.getUnsafeRawPointer().asInstanceOf,
      iter.getUnsafeRawPointer().asInstanceOf
    )
  end rowInserted

  /** Emits the ::rows-reordered signal on @tree_model.
    *
    * See [signal@Gtk.TreeModel::rows-reordered].
    *
    * This should be called by models when their rows have been reordered.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method rows_reordered/<method parameters>/new_order]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gint), @type -> DataRecord(int*)))"
  )
  private def rowsReordered__ = ???

  /** Emits the ::rows-reordered signal on @tree_model.
    *
    * See [signal@Gtk.TreeModel::rows-reordered].
    *
    * This should be called by models when their rows have been reordered.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method rows_reordered_with_length/<method parameters>/new_order]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gint), @type -> DataRecord(int)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(3), @type -> DataRecord(int*)))"
  )
  private def rowsReorderedWithLength__ = ???

  /** Lets the tree unref the node.
    *
    * This is an optional method for models to implement. To be more specific,
    * models may ignore this call as it exists primarily for performance
    * reasons. For more information on what this means, see
    * gtk_tree_model_ref_node().
    *
    * Please note that nodes that are deleted are not unreffed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unrefNode(
      iter: sn.gnome.gtk4.TreeIter /* Some(Ptr[GtkTreeIter]) */
  ): Unit /* None */ =
    gtk_tree_model_unref_node(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeModel]],
      iter.getUnsafeRawPointer().asInstanceOf
    )
  end unrefNode

end TreeModel

object TreeModel:
  class Abstract(raw: Ptr[Byte]) extends TreeModel:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end TreeModel
