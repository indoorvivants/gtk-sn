package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.LayoutChild
import sn.gnome.gtk4.internal.GtkGridLayoutChild

/** `GtkLayoutChild` subclass for children in a `GtkGridLayout`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class GridLayoutChild private[gnome] (raw: Ptr[GtkGridLayoutChild])
    extends LayoutChild(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the column number to which @child attaches its left side.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getColumn(): Int /* None */ =
    gtk_grid_layout_child_get_column(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGridLayoutChild]]
    )
  end getColumn

  /** Retrieves the number of columns that @child spans to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getColumnSpan(): Int /* None */ =
    gtk_grid_layout_child_get_column_span(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGridLayoutChild]]
    )
  end getColumnSpan

  /** Retrieves the row number to which @child attaches its top side.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRow(): Int /* None */ =
    gtk_grid_layout_child_get_row(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGridLayoutChild]]
    )
  end getRow

  /** Retrieves the number of rows that @child spans to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRowSpan(): Int /* None */ =
    gtk_grid_layout_child_get_row_span(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGridLayoutChild]]
    )
  end getRowSpan

  /** Sets the column number to attach the left side of @child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setColumn(column: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_grid_layout_child_set_column(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGridLayoutChild]],
      column
    )
  end setColumn

  /** Sets the number of columns @child spans to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setColumnSpan(span: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_grid_layout_child_set_column_span(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGridLayoutChild]],
      span
    )
  end setColumnSpan

  /** Sets the row to place @child in.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRow(row: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_grid_layout_child_set_row(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGridLayoutChild]],
      row
    )
  end setRow

  /** Sets the number of rows @child spans to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRowSpan(span: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_grid_layout_child_set_row_span(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGridLayoutChild]],
      span
    )
  end setRowSpan

end GridLayoutChild

object GridLayoutChild:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkGridLayoutChild])(using Runtime) =
    summon[Runtime].getOrCreate[GridLayoutChild](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new GridLayoutChild(ptr)
    )

end GridLayoutChild
