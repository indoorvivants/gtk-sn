package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.SectionModel
import sn.gnome.gtk4.internal.GtkFlattenListModel

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkFlattenListModel` is a list model that concatenates other list models.
  *
  * `GtkFlattenListModel` takes a list model containing list models, and
  * flattens it into a single model. Each list model becomes a section in the
  * single model.
  */
class FlattenListModel(raw: Ptr[GtkFlattenListModel])
    extends Object(raw.asInstanceOf),
      ListModel,
      SectionModel:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the model set via gtk_flatten_list_model_set_model().
    */
  def getModel(): ListModel = new ListModel.Abstract(
    gtk_flatten_list_model_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the model containing the item at the given position.
    */
  def getModelForItem(position: UInt): ListModel = new ListModel.Abstract(
    gtk_flatten_list_model_get_model_for_item(
      this.raw.asInstanceOf,
      guint(position)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a new model to be flattened.
    */
  def setModel(model: ListModel): Unit = gtk_flatten_list_model_set_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

end FlattenListModel

object FlattenListModel:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkFlattenListModel` that flattens @list.
    */
  def apply(model: ListModel): FlattenListModel = new FlattenListModel(
    gtk_flatten_list_model_new(
      model.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end FlattenListModel
