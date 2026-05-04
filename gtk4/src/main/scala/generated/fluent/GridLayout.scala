package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gtk4.fluent.{BaselinePosition, LayoutManager}
import sn.gnome.gtk4.internal.GtkGridLayout

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkGridLayout` is a layout manager which arranges child widgets in rows and
  * columns.
  *
  * Children have an "attach point" defined by the horizontal and vertical index
  * of the cell they occupy; children can span multiple rows or columns. The
  * layout properties for setting the attach points and spans are set using the
  * [class@Gtk.GridLayoutChild] associated to each child widget.
  *
  * The behaviour of `GtkGridLayout` when several children occupy the same grid
  * cell is undefined.
  *
  * `GtkGridLayout` can be used like a `GtkBoxLayout` if all children are
  * attached to the same row or column; however, if you only ever need a single
  * row or column, you should consider using `GtkBoxLayout`.
  */
class GridLayout(raw: Ptr[GtkGridLayout])
    extends LayoutManager(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the row set with gtk_grid_layout_set_baseline_row().
    */
  def getBaselineRow(): Int /* None */ = gtk_grid_layout_get_baseline_row(
    this.raw.asInstanceOf[Ptr[GtkGridLayout]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether all columns of @grid should have the same width.
    */
  def getColumnHomogeneous(): Boolean /* None */ =
    gtk_grid_layout_get_column_homogeneous(
      this.raw.asInstanceOf[Ptr[GtkGridLayout]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the spacing set with gtk_grid_layout_set_column_spacing().
    */
  def getColumnSpacing(): UInt /* None */ = gtk_grid_layout_get_column_spacing(
    this.raw.asInstanceOf[Ptr[GtkGridLayout]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the baseline position of @row.
    *
    * If no value has been set with
    * [method@Gtk.GridLayout.set_row_baseline_position], the default value of
    * %GTK_BASELINE_POSITION_CENTER is returned.
    */
  def getRowBaselinePosition(
      row: Int /* Some(CInt) */
  ): BaselinePosition /* None */ = BaselinePosition.fromRaw(
    gtk_grid_layout_get_row_baseline_position(
      this.raw.asInstanceOf[Ptr[GtkGridLayout]],
      row
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether all rows of @grid should have the same height.
    */
  def getRowHomogeneous(): Boolean /* None */ =
    gtk_grid_layout_get_row_homogeneous(
      this.raw.asInstanceOf[Ptr[GtkGridLayout]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the spacing set with gtk_grid_layout_set_row_spacing().
    */
  def getRowSpacing(): UInt /* None */ = gtk_grid_layout_get_row_spacing(
    this.raw.asInstanceOf[Ptr[GtkGridLayout]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets which row defines the global baseline for the entire grid.
    *
    * Each row in the grid can have its own local baseline, but only one of
    * those is global, meaning it will be the baseline in the parent of the @grid.
    */
  def setBaselineRow(row: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_grid_layout_set_baseline_row(
      this.raw.asInstanceOf[Ptr[GtkGridLayout]],
      row
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether all columns of @grid should have the same width.
    */
  def setColumnHomogeneous(
      homogeneous: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_grid_layout_set_column_homogeneous(
    this.raw.asInstanceOf[Ptr[GtkGridLayout]],
    gboolean(gint((if homogeneous == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the amount of space to insert between consecutive columns.
    */
  def setColumnSpacing(
      spacing: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_grid_layout_set_column_spacing(
    this.raw.asInstanceOf[Ptr[GtkGridLayout]],
    guint(spacing)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets how the baseline should be positioned on @row of the grid, in case
    * that row is assigned more space than is requested.
    */
  def setRowBaselinePosition(
      row: Int /* Some(CInt) */,
      pos: BaselinePosition /* Some(GtkBaselinePosition) */
  ): Unit /* None */ = gtk_grid_layout_set_row_baseline_position(
    this.raw.asInstanceOf[Ptr[GtkGridLayout]],
    row,
    pos.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether all rows of @grid should have the same height.
    */
  def setRowHomogeneous(
      homogeneous: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_grid_layout_set_row_homogeneous(
    this.raw.asInstanceOf[Ptr[GtkGridLayout]],
    gboolean(gint((if homogeneous == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the amount of space to insert between consecutive rows.
    */
  def setRowSpacing(
      spacing: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_grid_layout_set_row_spacing(
    this.raw.asInstanceOf[Ptr[GtkGridLayout]],
    guint(spacing)
  )

end GridLayout

object GridLayout:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkGridLayout`.
    */
  def apply(): GridLayout = new GridLayout(gtk_grid_layout_new().asInstanceOf)
end GridLayout
