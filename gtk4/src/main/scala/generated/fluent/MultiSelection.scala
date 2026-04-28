package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.SectionModel
import sn.gnome.gtk4.fluent.SelectionModel
import sn.gnome.gtk4.internal.GtkMultiSelection

class MultiSelection(raw: Ptr[GtkMultiSelection])
    extends Object(raw.asInstanceOf),
      ListModel,
      SectionModel,
      SelectionModel:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getModel(): ListModel = new ListModel.Abstract(
    gtk_multi_selection_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  def setModel(model: ListModel): Unit = gtk_multi_selection_set_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

end MultiSelection

object MultiSelection:
  def apply(model: ListModel): MultiSelection = new MultiSelection(
    gtk_multi_selection_new(
      model.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end MultiSelection
