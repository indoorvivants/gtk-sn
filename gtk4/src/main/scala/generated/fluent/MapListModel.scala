package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.SectionModel
import sn.gnome.gtk4.internal.GtkMapListModel
import sn.gnome.gtk4.internal.GtkMapListModelMapFunc

class MapListModel(raw: Ptr[GtkMapListModel])
    extends Object(raw.asInstanceOf),
      ListModel,
      SectionModel:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getModel(): ListModel = new ListModel.Abstract(
    gtk_map_list_model_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  def hasMap(): Boolean =
    gtk_map_list_model_has_map(this.raw.asInstanceOf).value.!=(0)

  def setMapFunc(
      map_func: GtkMapListModelMapFunc,
      user_data: Ptr[Byte],
      user_destroy: GDestroyNotify
  ): Unit = gtk_map_list_model_set_map_func(
    this.raw.asInstanceOf,
    map_func,
    gpointer(user_data),
    user_destroy
  )

  def setModel(model: ListModel): Unit = gtk_map_list_model_set_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

end MapListModel

object MapListModel:
  def apply(
      model: ListModel,
      map_func: GtkMapListModelMapFunc,
      user_data: Ptr[Byte],
      user_destroy: GDestroyNotify
  ): MapListModel = new MapListModel(
    gtk_map_list_model_new(
      model.getUnsafeRawPointer().asInstanceOf,
      map_func,
      gpointer(user_data),
      user_destroy
    ).asInstanceOf
  )
end MapListModel
