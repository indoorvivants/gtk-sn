package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

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
  @annotation.compileTimeOnly(
    "[method drag_data_delete/<method parameters>/path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def dragDataDelete__ = ???

  /** Asks the `GtkTreeDragSource` to return a `GdkContentProvider` representing
    * the row at @path. Should robustly handle a @path no longer found in the
    * model!
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method drag_data_get/<method parameters>/path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def dragDataGet__ = ???

  /** Asks the `GtkTreeDragSource` whether a particular row can be used as the
    * source of a DND operation. If the source doesn’t implement this interface,
    * the row is assumed draggable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method row_draggable/<method parameters>/path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def rowDraggable__ = ???

end TreeDragSource

object TreeDragSource:
  class Abstract(raw: Ptr[Byte]) extends TreeDragSource:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end TreeDragSource
