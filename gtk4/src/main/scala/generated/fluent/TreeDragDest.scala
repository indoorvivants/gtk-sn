package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.Value
import sn.gnome.gtk4.TreePath
import sn.gnome.runtime.*

trait TreeDragDest:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Asks the `GtkTreeDragDest` to insert a row before the path @dest, deriving
    * the contents of the row from @value. If @dest is outside the tree so that
    * inserting before it is impossible, %FALSE will be returned. Also, %FALSE
    * may be returned if the new row is not created for some model-specific
    * reason. Should robustly handle a @dest no longer found in the model!
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dragDataReceived(
      dest: sn.gnome.gtk4.TreePath /* Some(Ptr[GtkTreePath]) */,
      value: sn.gnome.gobject.Value /* Some(Ptr[_root_.sn.gnome.gobject.internal.GValue]) */
  )(using Runtime): Boolean /* None */ =
    gtk_tree_drag_dest_drag_data_received(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeDragDest]],
      dest.getUnsafeRawPointer().asInstanceOf,
      value.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end dragDataReceived

  /** Determines whether a drop is possible before the given @dest_path, at the
    * same depth as @dest_path. i.e., can we drop the data in
    * @value
    *   at that location. @dest_path does not have to exist; the return value
    *   will almost certainly be %FALSE if the parent of @dest_path doesn’t
    *   exist, though.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def rowDropPossible(
      dest_path: sn.gnome.gtk4.TreePath /* Some(Ptr[GtkTreePath]) */,
      value: sn.gnome.gobject.Value /* Some(Ptr[_root_.sn.gnome.gobject.internal.GValue]) */
  )(using Runtime): Boolean /* None */ =
    gtk_tree_drag_dest_row_drop_possible(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeDragDest]],
      dest_path.getUnsafeRawPointer().asInstanceOf,
      value.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end rowDropPossible

end TreeDragDest

object TreeDragDest:
  class Abstract(raw: Ptr[Byte]) extends TreeDragDest:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end TreeDragDest
