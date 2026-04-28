package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.SectionModel
import sn.gnome.gtk4.internal.GtkSliceListModel

class SliceListModel(raw: Ptr[GtkSliceListModel])
    extends Object(raw.asInstanceOf),
      ListModel,
      SectionModel:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getModel(): ListModel = new ListModel.Abstract(
    gtk_slice_list_model_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  def getOffset(): UInt = gtk_slice_list_model_get_offset(
    this.raw.asInstanceOf
  ).value

  def getSize(): UInt = gtk_slice_list_model_get_size(
    this.raw.asInstanceOf
  ).value

  def setModel(model: ListModel): Unit = gtk_slice_list_model_set_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

  def setOffset(offset: UInt): Unit =
    gtk_slice_list_model_set_offset(this.raw.asInstanceOf, guint(offset))

  def setSize(size: UInt): Unit =
    gtk_slice_list_model_set_size(this.raw.asInstanceOf, guint(size))

end SliceListModel

object SliceListModel:
  def apply(model: ListModel, offset: UInt, size: UInt): SliceListModel =
    new SliceListModel(
      gtk_slice_list_model_new(
        model.getUnsafeRawPointer().asInstanceOf,
        guint(offset),
        guint(size)
      ).asInstanceOf
    )
end SliceListModel
