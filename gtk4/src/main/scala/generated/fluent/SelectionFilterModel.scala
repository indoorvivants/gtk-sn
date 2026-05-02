package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.SelectionModel
import sn.gnome.gtk4.internal.GtkSelectionFilterModel

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkSelectionFilterModel` is a list model that presents the selection from a
  * `GtkSelectionModel`.
  */
class SelectionFilterModel(raw: Ptr[GtkSelectionFilterModel])
    extends Object(raw.asInstanceOf),
      ListModel:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the model currently filtered or %NULL if none.
    */
  def getModel(): SelectionModel /* None */ = new SelectionModel.Abstract(
    gtk_selection_filter_model_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the model to be filtered.
    *
    * Note that GTK makes no effort to ensure that @model conforms to the item
    * type of @self. It assumes that the caller knows what they are doing and
    * have set up an appropriate filter to ensure that item types match.
    */
  def setModel(
      model: Option[SelectionModel /* Some(Ptr[GtkSelectionModel]) */ ]
  ): Unit /* None */ = gtk_selection_filter_model_set_model(
    this.raw.asInstanceOf,
    model
      .map[Ptr[GtkSelectionModel]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkSelectionModel]])
  )

end SelectionFilterModel

object SelectionFilterModel:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkSelectionFilterModel` that will include the selected
    * items from the underlying selection model.
    */
  def apply(
      model: Option[SelectionModel /* Some(Ptr[GtkSelectionModel]) */ ]
  ): SelectionFilterModel = new SelectionFilterModel(
    gtk_selection_filter_model_new(
      model
        .map[Ptr[GtkSelectionModel]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkSelectionModel]])
    ).asInstanceOf
  )
end SelectionFilterModel
