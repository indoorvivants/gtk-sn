package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

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
  @annotation.compileTimeOnly(
    "[method drag_data_received/<method parameters>/dest]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def dragDataReceived__ = ???

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
  @annotation.compileTimeOnly(
    "[method row_drop_possible/<method parameters>/dest_path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def rowDropPossible__ = ???

end TreeDragDest

object TreeDragDest:
  class Abstract(raw: Ptr[Byte]) extends TreeDragDest:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end TreeDragDest
