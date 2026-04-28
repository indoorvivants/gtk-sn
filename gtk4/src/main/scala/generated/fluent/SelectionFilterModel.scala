package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.SelectionModel
import sn.gnome.gtk4.internal.GtkSelectionFilterModel

class SelectionFilterModel(raw: Ptr[GtkSelectionFilterModel])
    extends Object(raw.asInstanceOf),
      ListModel:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getModel(): SelectionModel = new SelectionModel.Abstract(
    gtk_selection_filter_model_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  def setModel(model: SelectionModel): Unit =
    gtk_selection_filter_model_set_model(
      this.raw.asInstanceOf,
      model.getUnsafeRawPointer().asInstanceOf
    )

end SelectionFilterModel

object SelectionFilterModel:
  def apply(model: SelectionModel): SelectionFilterModel =
    new SelectionFilterModel(
      gtk_selection_filter_model_new(
        model.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
end SelectionFilterModel
