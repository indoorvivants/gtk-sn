package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.ListModel
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{SectionModel, SelectionModel}
import sn.gnome.gtk4.internal.GtkSingleSelection

/** `GtkSingleSelection` is a `GtkSelectionModel` that allows selecting a single
  * item.
  *
  * Note that the selection is *persistent* -- if the selected item is removed
  * and re-added in the same [signal@Gio.ListModel::items-changed] emission, it
  * stays selected. In particular, this means that changing the sort order of an
  * underlying sort model will preserve the selection.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SingleSelection private[gnome] (raw: Ptr[GtkSingleSelection])
    extends Object(raw.asInstanceOf),
      ListModel,
      SectionModel,
      SelectionModel:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Checks if autoselect has been enabled or disabled via
    * gtk_single_selection_set_autoselect().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAutoselect(): Boolean /* None */ =
    gtk_single_selection_get_autoselect(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSingleSelection]]
    ).value.!=(0)
  end getAutoselect

  /** If %TRUE, gtk_selection_model_unselect_item() is supported and allows
    * unselecting the selected item.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCanUnselect(): Boolean /* None */ =
    gtk_single_selection_get_can_unselect(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSingleSelection]]
    ).value.!=(0)
  end getCanUnselect

  /** Gets the model that @self is wrapping.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModel(): ListModel /* None */ =
    new ListModel.Abstract(
      gtk_single_selection_get_model(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSingleSelection]]
      ).asInstanceOf
    )
  end getModel

  /** Gets the position of the selected item.
    *
    * If no item is selected, %GTK_INVALID_LIST_POSITION is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSelected(): UInt /* None */ =
    gtk_single_selection_get_selected(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSingleSelection]]
    ).value
  end getSelected

  /** Gets the selected item.
    *
    * If no item is selected, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSelectedItem()(using Runtime): sn.gnome.gobject.Object /* None */ =
    sn.gnome.gobject.Object.applyUnsafe(
      gtk_single_selection_get_selected_item(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSingleSelection]]
      ).asInstanceOf
    )
  end getSelectedItem

  /** Enables or disables autoselect.
    *
    * If @autoselect is %TRUE, @self will enforce that an item is always
    * selected. It will select a new item when the currently selected item is
    * deleted and it will disallow unselecting the current item.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAutoselect(
      autoselect: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_single_selection_set_autoselect(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSingleSelection]],
      gboolean(gint((if autoselect == true then 1 else 0)))
    )
  end setAutoselect

  /** If %TRUE, unselecting the current item via
    * gtk_selection_model_unselect_item() is supported.
    *
    * Note that setting [property@Gtk.SingleSelection:autoselect] will cause
    * unselecting to not work, so it practically makes no sense to set both at
    * the same time the same time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCanUnselect(
      can_unselect: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_single_selection_set_can_unselect(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSingleSelection]],
      gboolean(gint((if can_unselect == true then 1 else 0)))
    )
  end setCanUnselect

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
    gtk_single_selection_set_model(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSingleSelection]],
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
        )
    )
  end setModel

  /** Selects the item at the given position.
    *
    * If the list does not have an item at @position or
    * %GTK_INVALID_LIST_POSITION is given, the behavior depends on the value of
    * the [property@Gtk.SingleSelection:autoselect] property: If it is set, no
    * change will occur and the old item will stay selected. If it is unset, the
    * selection will be unset and no item will be selected.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSelected(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_single_selection_set_selected(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSingleSelection]],
      guint(position)
    )
  end setSelected

end SingleSelection

object SingleSelection:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkSingleSelection])(using Runtime) =
    summon[Runtime].getOrCreate[SingleSelection](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new SingleSelection(ptr)
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
  )(using Runtime): SingleSelection =
    val raw: Ptr[Byte] = gtk_single_selection_new(
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
        )
    ).asInstanceOf
    summon[Runtime].getOrCreate[SingleSelection](
      raw,
      r => SingleSelection.applyUnsafe(r.asInstanceOf)
    )
  end apply
end SingleSelection
