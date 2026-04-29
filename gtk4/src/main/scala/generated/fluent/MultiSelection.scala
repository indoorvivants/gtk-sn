package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.SectionModel
import sn.gnome.gtk4.fluent.SelectionModel
import sn.gnome.gtk4.internal.GtkMultiSelection

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkMultiSelection` is a `GtkSelectionModel` that allows selecting multiple
  * elements.
  */
class MultiSelection(raw: Ptr[GtkMultiSelection])
    extends Object(raw.asInstanceOf),
      ListModel,
      SectionModel,
      SelectionModel:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the underlying model of @self.
    */
  def getModel(): ListModel = new ListModel.Abstract(
    gtk_multi_selection_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the model that @self should wrap.
    *
    * If @model is %NULL, @self will be empty.
    */
  def setModel(model: ListModel): Unit = gtk_multi_selection_set_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

end MultiSelection

object MultiSelection:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new selection to handle @model.
    */
  def apply(model: ListModel): MultiSelection = new MultiSelection(
    gtk_multi_selection_new(
      model.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end MultiSelection
