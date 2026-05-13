package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.ListModel
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.SectionModel
import sn.gnome.gtk4.internal.GtkFlattenListModel

/** `GtkFlattenListModel` is a list model that concatenates other list models.
  *
  * `GtkFlattenListModel` takes a list model containing list models, and
  * flattens it into a single model. Each list model becomes a section in the
  * single model.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FlattenListModel private[gnome] (raw: Ptr[GtkFlattenListModel])
    extends Object(raw.asInstanceOf),
      ListModel,
      SectionModel:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the model set via gtk_flatten_list_model_set_model().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModel(): ListModel /* None */ =
    new ListModel.Abstract(
      gtk_flatten_list_model_get_model(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlattenListModel]]
      ).asInstanceOf
    )
  end getModel

  /** Returns the model containing the item at the given position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModelForItem(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): ListModel /* None */ =
    new ListModel.Abstract(
      gtk_flatten_list_model_get_model_for_item(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlattenListModel]],
        guint(position)
      ).asInstanceOf
    )
  end getModelForItem

  /** Sets a new model to be flattened.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModel(
      model: Option[
        ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ]
  ): Unit /* None */ =
    gtk_flatten_list_model_set_model(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFlattenListModel]],
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
        )
    )
  end setModel

end FlattenListModel

object FlattenListModel:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkFlattenListModel])(using Runtime) =
    summon[Runtime].getOrCreate[FlattenListModel](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new FlattenListModel(ptr)
    )

  /** Creates a new `GtkFlattenListModel` that flattens @list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      model: Option[
        ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ]
  )(using Runtime): FlattenListModel =
    val raw: Ptr[Byte] = gtk_flatten_list_model_new(
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
        )
    ).asInstanceOf
    summon[Runtime].getOrCreate[FlattenListModel](
      raw,
      r => FlattenListModel.applyUnsafe(r.asInstanceOf)
    )
  end apply
end FlattenListModel
