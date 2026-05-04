package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.LayoutChild
import sn.gnome.gtk4.internal.GtkGridLayoutChild

/** `GtkLayoutChild` subclass for children in a `GtkGridLayout`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class GridLayoutChild(raw: Ptr[GtkGridLayoutChild])
    extends LayoutChild(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the column number to which @child attaches its left side.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getColumn(): Int /* None */ = gtk_grid_layout_child_get_column(
    this.raw.asInstanceOf[Ptr[GtkGridLayoutChild]]
  )

  /** Retrieves the number of columns that @child spans to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getColumnSpan(): Int /* None */ = gtk_grid_layout_child_get_column_span(
    this.raw.asInstanceOf[Ptr[GtkGridLayoutChild]]
  )

  /** Retrieves the row number to which @child attaches its top side.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRow(): Int /* None */ = gtk_grid_layout_child_get_row(
    this.raw.asInstanceOf[Ptr[GtkGridLayoutChild]]
  )

  /** Retrieves the number of rows that @child spans to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRowSpan(): Int /* None */ = gtk_grid_layout_child_get_row_span(
    this.raw.asInstanceOf[Ptr[GtkGridLayoutChild]]
  )

  /** Sets the column number to attach the left side of @child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setColumn(column: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_grid_layout_child_set_column(
      this.raw.asInstanceOf[Ptr[GtkGridLayoutChild]],
      column
    )

  /** Sets the number of columns @child spans to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setColumnSpan(span: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_grid_layout_child_set_column_span(
      this.raw.asInstanceOf[Ptr[GtkGridLayoutChild]],
      span
    )

  /** Sets the row to place @child in.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRow(row: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_grid_layout_child_set_row(
      this.raw.asInstanceOf[Ptr[GtkGridLayoutChild]],
      row
    )

  /** Sets the number of rows @child spans to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRowSpan(span: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_grid_layout_child_set_row_span(
      this.raw.asInstanceOf[Ptr[GtkGridLayoutChild]],
      span
    )

end GridLayoutChild
