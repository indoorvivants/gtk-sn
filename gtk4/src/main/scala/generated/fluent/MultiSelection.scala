package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.ListModel
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{SectionModel, SelectionModel}
import sn.gnome.gtk4.internal.GtkMultiSelection

/** `GtkMultiSelection` is a `GtkSelectionModel` that allows selecting multiple
  * elements.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MultiSelection private[gnome] (raw: Ptr[GtkMultiSelection])
    extends Object(raw.asInstanceOf),
      ListModel,
      SectionModel,
      SelectionModel:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the underlying model of @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModel(): ListModel /* None */ =
    new ListModel.Abstract(
      gtk_multi_selection_get_model(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMultiSelection]]
      ).asInstanceOf
    )
  end getModel

  /** Sets the model that @self should wrap.
    *
    * If @model is %NULL, @self will be empty.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModel(
      model: Option[
        ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ]
  ): Unit /* None */ =
    gtk_multi_selection_set_model(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMultiSelection]],
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
        )
    )
  end setModel

end MultiSelection

object MultiSelection:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkMultiSelection])(using Runtime) =
    summon[Runtime].getOrCreate[MultiSelection](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new MultiSelection(ptr)
    )

  /** Creates a new selection to handle @model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      model: Option[
        ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ]
  )(using Runtime): MultiSelection =
    val raw: Ptr[Byte] = gtk_multi_selection_new(
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
        )
    ).asInstanceOf
    summon[Runtime].getOrCreate[MultiSelection](
      raw,
      r => MultiSelection.applyUnsafe(r.asInstanceOf)
    )
  end apply
end MultiSelection
