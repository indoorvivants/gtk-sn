package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Filter
import sn.gnome.gtk4.fluent.SectionModel
import sn.gnome.gtk4.internal.GtkFilterListModel

class FilterListModel(raw: Ptr[GtkFilterListModel])
    extends Object(raw.asInstanceOf),
      ListModel,
      SectionModel:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getFilter(): Filter = new Filter(
    gtk_filter_list_model_get_filter(this.raw.asInstanceOf).asInstanceOf
  )

  def getIncremental(): Boolean =
    gtk_filter_list_model_get_incremental(this.raw.asInstanceOf).value.!=(0)

  def getModel(): ListModel = new ListModel.Abstract(
    gtk_filter_list_model_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  def getPending(): UInt = gtk_filter_list_model_get_pending(
    this.raw.asInstanceOf
  ).value

  def setFilter(filter: Filter): Unit = gtk_filter_list_model_set_filter(
    this.raw.asInstanceOf,
    filter.getUnsafeRawPointer().asInstanceOf
  )

  def setIncremental(incremental: Boolean): Unit =
    gtk_filter_list_model_set_incremental(
      this.raw.asInstanceOf,
      gboolean(gint((if incremental == true then 1 else 0)))
    )

  def setModel(model: ListModel): Unit = gtk_filter_list_model_set_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

end FilterListModel

object FilterListModel:
  def apply(model: ListModel, filter: Filter): FilterListModel =
    new FilterListModel(
      gtk_filter_list_model_new(
        model.getUnsafeRawPointer().asInstanceOf,
        filter.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
end FilterListModel
