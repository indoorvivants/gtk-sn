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
  def getModel(): ListModel /* None */ = new ListModel.Abstract(
    gtk_flatten_list_model_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the model containing the item at the given position.
    */
  def getModelForItem(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): ListModel /* None */ = new ListModel.Abstract(
    gtk_flatten_list_model_get_model_for_item(
      this.raw.asInstanceOf,
      guint(position)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a new model to be flattened.
    */
  def setModel(
      model: Option[
        ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ]
  ): Unit /* None */ = gtk_flatten_list_model_set_model(
    this.raw.asInstanceOf,
    model
      .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
      )
  )

end FlattenListModel

object FlattenListModel:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkFlattenListModel` that flattens @list.
    */
  def apply(
      model: Option[
        ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ]
  ): FlattenListModel = new FlattenListModel(
    gtk_flatten_list_model_new(
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
        )
    ).asInstanceOf
  )
end FlattenListModel
