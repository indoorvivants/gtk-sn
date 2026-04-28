package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.ColumnViewColumn
import sn.gnome.gtk4.fluent.Sorter
import sn.gnome.gtk4.internal.GtkColumnViewSorter
import sn.gnome.gtk4.internal.GtkSortType

class ColumnViewSorter(raw: Ptr[GtkColumnViewSorter])
    extends Sorter(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getNSortColumns(): UInt = gtk_column_view_sorter_get_n_sort_columns(
    this.raw.asInstanceOf
  ).value

  // Method get_nth_sort_column contains an OUT parameter, which is not supported yet

  def getPrimarySortColumn(): ColumnViewColumn = new ColumnViewColumn(
    gtk_column_view_sorter_get_primary_sort_column(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

  def getPrimarySortOrder(): GtkSortType =
    gtk_column_view_sorter_get_primary_sort_order(this.raw.asInstanceOf)

end ColumnViewSorter
