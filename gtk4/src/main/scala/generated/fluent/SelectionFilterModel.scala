package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.ListModel
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.SelectionModel
import sn.gnome.gtk4.internal.GtkSelectionFilterModel

/** `GtkSelectionFilterModel` is a list model that presents the selection from a
  * `GtkSelectionModel`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SelectionFilterModel private[gnome] (raw: Ptr[GtkSelectionFilterModel])
    extends Object(raw.asInstanceOf),
      ListModel:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the model currently filtered or %NULL if none.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModel(): SelectionModel /* None */ =
    new SelectionModel.Abstract(
      gtk_selection_filter_model_get_model(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSelectionFilterModel]]
      ).asInstanceOf
    )
  end getModel

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
  ): Unit /* None */ =
    gtk_selection_filter_model_set_model(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSelectionFilterModel]],
      model
        .map[Ptr[GtkSelectionModel]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkSelectionModel]])
    )
  end setModel

end SelectionFilterModel

object SelectionFilterModel:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkSelectionFilterModel])(using Runtime) =
    summon[Runtime].getOrCreate[SelectionFilterModel](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new SelectionFilterModel(ptr)
    )

  /** Creates a new `GtkSelectionFilterModel` that will include the selected
    * items from the underlying selection model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(model: Option[SelectionModel /* Some(Ptr[GtkSelectionModel]) */ ])(
      using Runtime
  ): SelectionFilterModel =
    val raw: Ptr[Byte] = gtk_selection_filter_model_new(
      model
        .map[Ptr[GtkSelectionModel]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkSelectionModel]])
    ).asInstanceOf
    summon[Runtime].getOrCreate[SelectionFilterModel](
      raw,
      r => SelectionFilterModel.applyUnsafe(r.asInstanceOf)
    )
  end apply
end SelectionFilterModel
