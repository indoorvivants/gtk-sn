package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.LayoutChild
import sn.gnome.gtk4.internal.GtkGridLayoutChild

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkLayoutChild` subclass for children in a `GtkGridLayout`.
  */
class GridLayoutChild(raw: Ptr[GtkGridLayoutChild])
    extends LayoutChild(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the column number to which @child attaches its left side.
    */
  def getColumn(): Int = gtk_grid_layout_child_get_column(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the number of columns that @child spans to.
    */
  def getColumnSpan(): Int = gtk_grid_layout_child_get_column_span(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the row number to which @child attaches its top side.
    */
  def getRow(): Int = gtk_grid_layout_child_get_row(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the number of rows that @child spans to.
    */
  def getRowSpan(): Int = gtk_grid_layout_child_get_row_span(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the column number to attach the left side of @child.
    */
  def setColumn(column: Int): Unit =
    gtk_grid_layout_child_set_column(this.raw.asInstanceOf, column)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the number of columns @child spans to.
    */
  def setColumnSpan(span: Int): Unit =
    gtk_grid_layout_child_set_column_span(this.raw.asInstanceOf, span)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the row to place @child in.
    */
  def setRow(row: Int): Unit =
    gtk_grid_layout_child_set_row(this.raw.asInstanceOf, row)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the number of rows @child spans to.
    */
  def setRowSpan(span: Int): Unit =
    gtk_grid_layout_child_set_row_span(this.raw.asInstanceOf, span)

end GridLayoutChild
