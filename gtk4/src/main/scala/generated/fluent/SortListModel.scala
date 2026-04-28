package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.SectionModel
import sn.gnome.gtk4.fluent.Sorter
import sn.gnome.gtk4.internal.GtkSortListModel

class SortListModel(raw: Ptr[GtkSortListModel])
    extends Object(raw.asInstanceOf),
      ListModel,
      SectionModel:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getIncremental(): Boolean =
    gtk_sort_list_model_get_incremental(this.raw.asInstanceOf).value.!=(0)

  def getModel(): ListModel = new ListModel.Abstract(
    gtk_sort_list_model_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  def getPending(): UInt = gtk_sort_list_model_get_pending(
    this.raw.asInstanceOf
  ).value

  def getSectionSorter(): Sorter = new Sorter(
    gtk_sort_list_model_get_section_sorter(this.raw.asInstanceOf).asInstanceOf
  )

  def getSorter(): Sorter = new Sorter(
    gtk_sort_list_model_get_sorter(this.raw.asInstanceOf).asInstanceOf
  )

  def setIncremental(incremental: Boolean): Unit =
    gtk_sort_list_model_set_incremental(
      this.raw.asInstanceOf,
      gboolean(gint((if incremental == true then 1 else 0)))
    )

  def setModel(model: ListModel): Unit = gtk_sort_list_model_set_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

  def setSectionSorter(sorter: Sorter): Unit =
    gtk_sort_list_model_set_section_sorter(
      this.raw.asInstanceOf,
      sorter.getUnsafeRawPointer().asInstanceOf
    )

  def setSorter(sorter: Sorter): Unit = gtk_sort_list_model_set_sorter(
    this.raw.asInstanceOf,
    sorter.getUnsafeRawPointer().asInstanceOf
  )

end SortListModel

object SortListModel:
  def apply(model: ListModel, sorter: Sorter): SortListModel =
    new SortListModel(
      gtk_sort_list_model_new(
        model.getUnsafeRawPointer().asInstanceOf,
        sorter.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
end SortListModel
