package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.SectionModel
import sn.gnome.gtk4.fluent.SelectionModel
import sn.gnome.gtk4.internal.GtkSingleSelection

class SingleSelection(raw: Ptr[GtkSingleSelection])
    extends Object(raw.asInstanceOf),
      ListModel,
      SectionModel,
      SelectionModel:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAutoselect(): Boolean =
    gtk_single_selection_get_autoselect(this.raw.asInstanceOf).value.!=(0)

  def getCanUnselect(): Boolean =
    gtk_single_selection_get_can_unselect(this.raw.asInstanceOf).value.!=(0)

  def getModel(): ListModel = new ListModel.Abstract(
    gtk_single_selection_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  def getSelected(): UInt = gtk_single_selection_get_selected(
    this.raw.asInstanceOf
  ).value

  def getSelectedItem(): Object = new Object(
    gtk_single_selection_get_selected_item(this.raw.asInstanceOf).asInstanceOf
  )

  def setAutoselect(autoselect: Boolean): Unit =
    gtk_single_selection_set_autoselect(
      this.raw.asInstanceOf,
      gboolean(gint((if autoselect == true then 1 else 0)))
    )

  def setCanUnselect(can_unselect: Boolean): Unit =
    gtk_single_selection_set_can_unselect(
      this.raw.asInstanceOf,
      gboolean(gint((if can_unselect == true then 1 else 0)))
    )

  def setModel(model: ListModel): Unit = gtk_single_selection_set_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

  def setSelected(position: UInt): Unit =
    gtk_single_selection_set_selected(this.raw.asInstanceOf, guint(position))

end SingleSelection

object SingleSelection:
  def apply(model: ListModel): SingleSelection = new SingleSelection(
    gtk_single_selection_new(
      model.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end SingleSelection
