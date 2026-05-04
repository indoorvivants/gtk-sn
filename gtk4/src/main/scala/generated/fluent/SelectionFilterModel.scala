package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.SelectionModel
import sn.gnome.gtk4.internal.GtkSelectionFilterModel

/** `GtkSelectionFilterModel` is a list model that presents the selection from a
  * `GtkSelectionModel`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SelectionFilterModel(raw: Ptr[GtkSelectionFilterModel])
    extends Object(raw.asInstanceOf),
      ListModel:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the model currently filtered or %NULL if none.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModel(): SelectionModel /* None */ = new SelectionModel.Abstract(
    gtk_selection_filter_model_get_model(
      this.raw.asInstanceOf[Ptr[GtkSelectionFilterModel]]
    ).asInstanceOf
  )

  /** Sets the model to be filtered.
    *
    * Note that GTK makes no effort to ensure that @model conforms to the item
    * type of @self. It assumes that the caller knows what they are doing and
    * have set up an appropriate filter to ensure that item types match.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModel(
      model: Option[SelectionModel /* Some(Ptr[GtkSelectionModel]) */ ]
  ): Unit /* None */ = gtk_selection_filter_model_set_model(
    this.raw.asInstanceOf[Ptr[GtkSelectionFilterModel]],
    model
      .map[Ptr[GtkSelectionModel]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkSelectionModel]])
  )

end SelectionFilterModel

object SelectionFilterModel:
  /** Creates a new `GtkSelectionFilterModel` that will include the selected
    * items from the underlying selection model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
