package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.TreePath
import sn.gnome.gtk4.internal.GtkTreePath

/** An opaque structure representing a path to a row in a model.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TreePath private[gnome] (raw: Ptr[GtkTreePath]):

  def getUnsafeRawPointer(): Ptr[GtkTreePath] = this.raw

  /** Appends a new index to a path.
    *
    * As a result, the depth of the path is increased.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendIndex(`index_`: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_tree_path_append_index(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreePath]],
      `index_`
    )
  end appendIndex

  /** Compares two paths.
    *
    * If @a appears before @b in a tree, then -1 is returned. If @b appears
    * before @a, then 1 is returned. If the two nodes are equal, then 0 is
    * returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def compare(
      b: sn.gnome.gtk4.TreePath /* Some(Ptr[GtkTreePath]) */
  ): Int /* None */ =
    gtk_tree_path_compare(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreePath]],
      b.getUnsafeRawPointer().asInstanceOf
    )
  end compare

  /** Creates a new `GtkTreePath` as a copy of @path.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.gtk4.TreePath /* None */ =
    sn.gnome.gtk4.TreePath.fromRaw(
      gtk_tree_path_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreePath]]
      )
    )
  end copy

  /** Moves @path to point to the first child of the current path.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def down(): Unit /* None */ =
    gtk_tree_path_down(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreePath]]
    )
  end down

  /** Frees @path. If @path is %NULL, it simply returns.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    gtk_tree_path_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreePath]]
    )
  end free

  /** Returns the current depth of @path.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDepth(): Int /* None */ =
    gtk_tree_path_get_depth(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreePath]]
    )
  end getDepth

  /** Returns the current indices of @path.
    *
    * This is an array of integers, each representing a node in a tree. This
    * value should not be freed.
    *
    * The length of the array can be obtained with gtk_tree_path_get_depth().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_indices/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gint), @type -> DataRecord(int*)))"
  )
  private def getIndices__ = ???

  /** Returns the current indices of @path.
    *
    * This is an array of integers, each representing a node in a tree. It also
    * returns the number of elements in the array. The array should not be
    * freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_indices_with_depth]: Method get_indices_with_depth contains an OUT parameter, which is not supported yet"
  )
  private def getIndicesWithDepth__ = ???

  /** Returns %TRUE if @descendant is a descendant of @path.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isAncestor(
      descendant: sn.gnome.gtk4.TreePath /* Some(Ptr[GtkTreePath]) */
  ): Boolean /* None */ =
    gtk_tree_path_is_ancestor(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreePath]],
      descendant.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end isAncestor

  /** Returns %TRUE if @path is a descendant of @ancestor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isDescendant(
      ancestor: sn.gnome.gtk4.TreePath /* Some(Ptr[GtkTreePath]) */
  ): Boolean /* None */ =
    gtk_tree_path_is_descendant(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreePath]],
      ancestor.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end isDescendant

  /** Moves the @path to point to the next node at the current depth.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def next(): Unit /* None */ =
    gtk_tree_path_next(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreePath]]
    )
  end next

  /** Prepends a new index to a path.
    *
    * As a result, the depth of the path is increased.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prependIndex(`index_`: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_tree_path_prepend_index(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreePath]],
      `index_`
    )
  end prependIndex

  /** Moves the @path to point to the previous node at the current depth, if it
    * exists.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prev(): Boolean /* None */ =
    gtk_tree_path_prev(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreePath]]
    ).value.!=(0)
  end prev

  /** Generates a string representation of the path.
    *
    * This string is a “:” separated list of numbers. For example, “4:10:0:3”
    * would be an acceptable return value for this string. If the path has depth
    * 0, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def _toString(): scala.Predef.String /* None */ =
    fromCString(
      gtk_tree_path_to_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreePath]]
      ).asInstanceOf
    )
  end _toString

  /** Moves the @path to point to its parent node, if it has a parent.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def up(): Boolean /* None */ =
    gtk_tree_path_up(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreePath]]
    ).value.!=(0)
  end up

end TreePath

object TreePath:
  def fromRaw(ptr: Ptr[GtkTreePath]): TreePath = new TreePath(ptr)
end TreePath
