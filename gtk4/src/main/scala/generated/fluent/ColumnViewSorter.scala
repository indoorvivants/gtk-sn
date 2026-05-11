package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{ColumnViewColumn, SortType, Sorter}
import sn.gnome.gtk4.internal.GtkColumnViewSorter

/** `GtkColumnViewSorter` is a sorter implementation that is geared towards the
  * needs of `GtkColumnView`.
  *
  * The sorter returned by [method@Gtk.ColumnView.get_sorter] is a
  * `GtkColumnViewSorter`.
  *
  * In column views, sorting can be configured by associating sorters with
  * columns, and users can invert sort order by clicking on column headers. The
  * API of `GtkColumnViewSorter` is designed to allow saving and restoring this
  * configuration.
  *
  * If you are only interested in the primary sort column (i.e. the column where
  * a sort indicator is shown in the header), then you can just look at
  * [property@Gtk.ColumnViewSorter:primary-sort-column] and
  * [property@Gtk.ColumnViewSorter:primary-sort-order].
  *
  * If you want to store the full sort configuration, including secondary sort
  * columns that are used for tie breaking, then you can use
  * [method@Gtk.ColumnViewSorter.get_nth_sort_column]. To get notified about
  * changes, use [signal@Gtk.Sorter::changed].
  *
  * To restore a saved sort configuration on a `GtkColumnView`, use code like:
  *
  * ```
  * sorter = gtk_column_view_get_sorter (view);
  * for (i = gtk_column_view_sorter_get_n_sort_columns (sorter) - 1; i >= 0; i--)
  *   {
  *     column = gtk_column_view_sorter_get_nth_sort_column (sorter, i, &order);
  *     gtk_column_view_sort_by_column (view, column, order);
  *   }
  * ```
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ColumnViewSorter private[gnome] (raw: Ptr[GtkColumnViewSorter])
    extends Sorter(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the number of columns by which the sorter sorts.
    *
    * If the sorter of the primary sort column does not determine a total order,
    * then the secondary sorters are consulted to break the ties.
    *
    * Use the [signal@Gtk.Sorter::changed] signal to get notified when the
    * number of sort columns changes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNSortColumns(): UInt /* None */ =
    gtk_column_view_sorter_get_n_sort_columns(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewSorter]]
    ).value
  end getNSortColumns

  /** Gets the @position'th sort column and its associated sort order.
    *
    * Use the [signal@Gtk.Sorter::changed] signal to get notified when sort
    * columns change.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_nth_sort_column]: Method get_nth_sort_column contains an OUT parameter, which is not supported yet"
  )
  private def getNthSortColumn__ = ???

  /** Returns the primary sort column.
    *
    * The primary sort column is the one that displays the triangle in a column
    * view header.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPrimarySortColumn()(using
      Runtime
  ): sn.gnome.gtk4.fluent.ColumnViewColumn /* None */ =
    sn.gnome.gtk4.fluent.ColumnViewColumn.applyUnsafe(
      gtk_column_view_sorter_get_primary_sort_column(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewSorter]]
      ).asInstanceOf
    )
  end getPrimarySortColumn

  /** Returns the primary sort order.
    *
    * The primary sort order determines whether the triangle displayed in the
    * column view header of the primary sort column points upwards or downwards.
    *
    * If there is no primary sort column, then this function returns
    * `GTK_SORT_ASCENDING`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPrimarySortOrder(): SortType /* None */ =
    SortType.fromRaw(
      gtk_column_view_sorter_get_primary_sort_order(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewSorter]]
      )
    )
  end getPrimarySortOrder

end ColumnViewSorter

object ColumnViewSorter:
  def applyUnsafe(ptr: Ptr[GtkColumnViewSorter])(using Runtime) =
    summon[Runtime].getOrCreate[ColumnViewSorter](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ColumnViewSorter(ptr)
    )

end ColumnViewSorter
