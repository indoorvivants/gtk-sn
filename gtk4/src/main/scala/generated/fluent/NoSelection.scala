package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.{SectionModel, SelectionModel}
import sn.gnome.gtk4.internal.GtkNoSelection

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkNoSelection` is a `GtkSelectionModel` that does not allow selecting
  * anything.
  *
  * This model is meant to be used as a simple wrapper around a `GListModel`
  * when a `GtkSelectionModel` is required.
  *
  * `GtkNoSelection` passes through sections from the underlying model.
  */
class NoSelection(raw: Ptr[GtkNoSelection])
    extends Object(raw.asInstanceOf),
      ListModel,
      SectionModel,
      SelectionModel:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the model that @self is wrapping.
    */
  def getModel(): ListModel /* None */ = new ListModel.Abstract(
    gtk_no_selection_get_model(
      this.raw.asInstanceOf[Ptr[GtkNoSelection]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the model that @self should wrap.
    *
    * If @model is %NULL, this model will be empty.
    */
  def setModel(
      model: Option[
        ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ]
  ): Unit /* None */ = gtk_no_selection_set_model(
    this.raw.asInstanceOf[Ptr[GtkNoSelection]],
    model
      .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
      )
  )

end NoSelection

object NoSelection:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new selection to handle @model.
    */
  def apply(
      model: Option[
        ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ]
  ): NoSelection = new NoSelection(
    gtk_no_selection_new(
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
        )
    ).asInstanceOf
  )
end NoSelection
