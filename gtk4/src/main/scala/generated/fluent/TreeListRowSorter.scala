package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Sorter
import sn.gnome.gtk4.internal.GtkTreeListRowSorter

class TreeListRowSorter(raw: Ptr[GtkTreeListRowSorter])
    extends Sorter(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getSorter(): Sorter = new Sorter(
    gtk_tree_list_row_sorter_get_sorter(this.raw.asInstanceOf).asInstanceOf
  )

  def setSorter(sorter: Sorter): Unit = gtk_tree_list_row_sorter_set_sorter(
    this.raw.asInstanceOf,
    sorter.getUnsafeRawPointer().asInstanceOf
  )

end TreeListRowSorter

object TreeListRowSorter:
  def apply(sorter: Sorter): TreeListRowSorter = new TreeListRowSorter(
    gtk_tree_list_row_sorter_new(
      sorter.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end TreeListRowSorter
