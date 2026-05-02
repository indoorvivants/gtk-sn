package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.SectionModel
import sn.gnome.gtk4.fluent.SelectionModel
import sn.gnome.gtk4.internal.GtkSingleSelection

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkSingleSelection` is a `GtkSelectionModel` that allows selecting a single
  * item.
  *
  * Note that the selection is *persistent* -- if the selected item is removed
  * and re-added in the same [signal@Gio.ListModel::items-changed] emission, it
  * stays selected. In particular, this means that changing the sort order of an
  * underlying sort model will preserve the selection.
  */
class SingleSelection(raw: Ptr[GtkSingleSelection])
    extends Object(raw.asInstanceOf),
      ListModel,
      SectionModel,
      SelectionModel:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if autoselect has been enabled or disabled via
    * gtk_single_selection_set_autoselect().
    */
  def getAutoselect(): Boolean /* None */ =
    gtk_single_selection_get_autoselect(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If %TRUE, gtk_selection_model_unselect_item() is supported and allows
    * unselecting the selected item.
    */
  def getCanUnselect(): Boolean /* None */ =
    gtk_single_selection_get_can_unselect(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the model that @self is wrapping.
    */
  def getModel(): ListModel /* None */ = new ListModel.Abstract(
    gtk_single_selection_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the position of the selected item.
    *
    * If no item is selected, %GTK_INVALID_LIST_POSITION is returned.
    */
  def getSelected(): UInt /* None */ = gtk_single_selection_get_selected(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the selected item.
    *
    * If no item is selected, %NULL is returned.
    */
  def getSelectedItem(): Object /* None */ = new Object(
    gtk_single_selection_get_selected_item(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Enables or disables autoselect.
    *
    * If @autoselect is %TRUE, @self will enforce that an item is always
    * selected. It will select a new item when the currently selected item is
    * deleted and it will disallow unselecting the current item.
    */
  def setAutoselect(
      autoselect: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_single_selection_set_autoselect(
    this.raw.asInstanceOf,
    gboolean(gint((if autoselect == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If %TRUE, unselecting the current item via
    * gtk_selection_model_unselect_item() is supported.
    *
    * Note that setting [property@Gtk.SingleSelection:autoselect] will cause
    * unselecting to not work, so it practically makes no sense to set both at
    * the same time the same time.
    */
  def setCanUnselect(
      can_unselect: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_single_selection_set_can_unselect(
    this.raw.asInstanceOf,
    gboolean(gint((if can_unselect == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the model that @self should wrap.
    *
    * If @model is %NULL, @self will be empty.
    */
  def setModel(
      model: Option[
        ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ]
  ): Unit /* None */ = gtk_single_selection_set_model(
    this.raw.asInstanceOf,
    model
      .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
      )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects the item at the given position.
    *
    * If the list does not have an item at @position or
    * %GTK_INVALID_LIST_POSITION is given, the behavior depends on the value of
    * the [property@Gtk.SingleSelection:autoselect] property: If it is set, no
    * change will occur and the old item will stay selected. If it is unset, the
    * selection will be unset and no item will be selected.
    */
  def setSelected(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_single_selection_set_selected(this.raw.asInstanceOf, guint(position))

end SingleSelection

object SingleSelection:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new selection to handle @model.
    */
  def apply(
      model: Option[
        ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ]
  ): SingleSelection = new SingleSelection(
    gtk_single_selection_new(
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
        )
    ).asInstanceOf
  )
end SingleSelection
