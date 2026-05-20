package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.ContentProvider
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.TreePath

trait TreeDragSource:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Asks the `GtkTreeDragSource` to delete the row at @path, because it was
    * moved somewhere else via drag-and-drop. Returns %FALSE if the deletion
    * fails because @path no longer exists, or for some model-specific reason.
    * Should robustly handle a @path no longer found in the model!
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dragDataDelete(
      path: sn.gnome.gtk4.TreePath /* Some(Ptr[GtkTreePath]) */
  ): Boolean /* None */ =
    gtk_tree_drag_source_drag_data_delete(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeDragSource]],
      path.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end dragDataDelete

  /** Asks the `GtkTreeDragSource` to return a `GdkContentProvider` representing
    * the row at @path. Should robustly handle a @path no longer found in the
    * model!
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dragDataGet(
      path: sn.gnome.gtk4.TreePath /* Some(Ptr[GtkTreePath]) */
  )(using Runtime): sn.gnome.gdk4.ContentProvider /* None */ =
    sn.gnome.gdk4.ContentProvider.applyUnsafe(
      gtk_tree_drag_source_drag_data_get(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeDragSource]],
        path.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end dragDataGet

  /** Asks the `GtkTreeDragSource` whether a particular row can be used as the
    * source of a DND operation. If the source doesn’t implement this interface,
    * the row is assumed draggable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def rowDraggable(
      path: sn.gnome.gtk4.TreePath /* Some(Ptr[GtkTreePath]) */
  ): Boolean /* None */ =
    gtk_tree_drag_source_row_draggable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeDragSource]],
      path.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end rowDraggable

end TreeDragSource

object TreeDragSource:
  class Abstract(raw: Ptr[Byte]) extends TreeDragSource:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end TreeDragSource
