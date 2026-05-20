package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.ListModel
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{SectionModel, SelectionModel}
import sn.gnome.gtk4.internal.GtkNoSelection

/** `GtkNoSelection` is a `GtkSelectionModel` that does not allow selecting
  * anything.
  *
  * This model is meant to be used as a simple wrapper around a `GListModel`
  * when a `GtkSelectionModel` is required.
  *
  * `GtkNoSelection` passes through sections from the underlying model.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class NoSelection private[gnome] (raw: Ptr[GtkNoSelection])
    extends Object(raw.asInstanceOf),
      ListModel,
      SectionModel,
      SelectionModel:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the model that @self is wrapping.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModel(): sn.gnome.gio.ListModel /* None */ =
    new ListModel.Abstract(
      gtk_no_selection_get_model(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNoSelection]]
      ).asInstanceOf
    )
  end getModel

  /** Sets the model that @self should wrap.
    *
    * If @model is %NULL, this model will be empty.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModel(
      model: Option[
        sn.gnome.gio.ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ]
  ): Unit /* None */ =
    gtk_no_selection_set_model(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNoSelection]],
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
        )
    )
  end setModel

end NoSelection

object NoSelection:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkNoSelection])(using Runtime) =
    summon[Runtime].getOrCreate[NoSelection](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new NoSelection(ptr)
    )

  /** Creates a new selection to handle @model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      model: Option[
        sn.gnome.gio.ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ]
  )(using Runtime): NoSelection =
    val raw: Ptr[Byte] = gtk_no_selection_new(
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
        )
    ).asInstanceOf
    summon[Runtime].getOrCreate[NoSelection](
      raw,
      r => NoSelection.applyUnsafe(r.asInstanceOf)
    )
  end apply
end NoSelection
