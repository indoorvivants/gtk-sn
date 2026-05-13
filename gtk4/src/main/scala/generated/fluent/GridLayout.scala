package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{BaselinePosition, LayoutManager}
import sn.gnome.gtk4.internal.GtkGridLayout

/** `GtkGridLayout` is a layout manager which arranges child widgets in rows and
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class GridLayout private[gnome] (raw: Ptr[GtkGridLayout])
    extends LayoutManager(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the row set with gtk_grid_layout_set_baseline_row().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBaselineRow(): Int /* None */ =
    gtk_grid_layout_get_baseline_row(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGridLayout]]
    )
  end getBaselineRow

  /** Checks whether all columns of @grid should have the same width.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getColumnHomogeneous(): Boolean /* None */ =
    gtk_grid_layout_get_column_homogeneous(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGridLayout]]
    ).value.!=(0)
  end getColumnHomogeneous

  /** Retrieves the spacing set with gtk_grid_layout_set_column_spacing().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getColumnSpacing(): UInt /* None */ =
    gtk_grid_layout_get_column_spacing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGridLayout]]
    ).value
  end getColumnSpacing

  /** Returns the baseline position of @row.
    *
    * If no value has been set with
    * [method@Gtk.GridLayout.set_row_baseline_position], the default value of
    * %GTK_BASELINE_POSITION_CENTER is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRowBaselinePosition(
      row: Int /* Some(CInt) */
  ): BaselinePosition /* None */ =
    BaselinePosition.fromRaw(
      gtk_grid_layout_get_row_baseline_position(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGridLayout]],
        row
      )
    )
  end getRowBaselinePosition

  /** Checks whether all rows of @grid should have the same height.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRowHomogeneous(): Boolean /* None */ =
    gtk_grid_layout_get_row_homogeneous(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGridLayout]]
    ).value.!=(0)
  end getRowHomogeneous

  /** Retrieves the spacing set with gtk_grid_layout_set_row_spacing().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRowSpacing(): UInt /* None */ =
    gtk_grid_layout_get_row_spacing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGridLayout]]
    ).value
  end getRowSpacing

  /** Sets which row defines the global baseline for the entire grid.
    *
    * Each row in the grid can have its own local baseline, but only one of
    * those is global, meaning it will be the baseline in the parent of the @grid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBaselineRow(row: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_grid_layout_set_baseline_row(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGridLayout]],
      row
    )
  end setBaselineRow

  /** Sets whether all columns of @grid should have the same width.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setColumnHomogeneous(
      homogeneous: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_grid_layout_set_column_homogeneous(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGridLayout]],
      gboolean(gint((if homogeneous == true then 1 else 0)))
    )
  end setColumnHomogeneous

  /** Sets the amount of space to insert between consecutive columns.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setColumnSpacing(
      spacing: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_grid_layout_set_column_spacing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGridLayout]],
      guint(spacing)
    )
  end setColumnSpacing

  /** Sets how the baseline should be positioned on @row of the grid, in case
    * that row is assigned more space than is requested.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRowBaselinePosition(
      row: Int /* Some(CInt) */,
      pos: BaselinePosition /* Some(GtkBaselinePosition) */
  ): Unit /* None */ =
    gtk_grid_layout_set_row_baseline_position(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGridLayout]],
      row,
      pos.raw
    )
  end setRowBaselinePosition

  /** Sets whether all rows of @grid should have the same height.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRowHomogeneous(
      homogeneous: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_grid_layout_set_row_homogeneous(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGridLayout]],
      gboolean(gint((if homogeneous == true then 1 else 0)))
    )
  end setRowHomogeneous

  /** Sets the amount of space to insert between consecutive rows.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRowSpacing(
      spacing: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_grid_layout_set_row_spacing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGridLayout]],
      guint(spacing)
    )
  end setRowSpacing

end GridLayout

object GridLayout:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkGridLayout])(using Runtime) =
    summon[Runtime].getOrCreate[GridLayout](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new GridLayout(ptr)
    )

  /** Creates a new `GtkGridLayout`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): GridLayout =
    val raw: Ptr[Byte] = gtk_grid_layout_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[GridLayout](raw, r => GridLayout.applyUnsafe(r.asInstanceOf))
  end apply
end GridLayout
