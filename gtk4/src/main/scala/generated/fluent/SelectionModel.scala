package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gtk4.Bitset

trait SelectionModel:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Gets the set containing all currently selected items in the model.
    *
    * This function may be slow, so if you are only interested in single item,
    * consider using [method@Gtk.SelectionModel.is_selected] or if you are only
    * interested in a few, consider
    * [method@Gtk.SelectionModel.get_selection_in_range].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSelection(): sn.gnome.gtk4.Bitset /* None */ =
    sn.gnome.gtk4.Bitset.fromRaw(
      gtk_selection_model_get_selection(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSelectionModel]]
      )
    )
  end getSelection

  /** Gets the set of selected items in a range.
    *
    * This function is an optimization for
    * [method@Gtk.SelectionModel.get_selection] when you are only interested in
    * part of the model's selected state. A common use case is in response to
    * the [signal@Gtk.SelectionModel::selection-changed] signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSelectionInRange(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      n_items: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): sn.gnome.gtk4.Bitset /* None */ =
    sn.gnome.gtk4.Bitset.fromRaw(
      gtk_selection_model_get_selection_in_range(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSelectionModel]],
        guint(position),
        guint(n_items)
      )
    )
  end getSelectionInRange

  /** Checks if the given item is selected.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isSelected(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Boolean /* None */ =
    gtk_selection_model_is_selected(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSelectionModel]],
      guint(position)
    ).value.!=(0)
  end isSelected

  /** Requests to select all items in the model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def selectAll(): Boolean /* None */ =
    gtk_selection_model_select_all(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSelectionModel]]
    ).value.!=(0)
  end selectAll

  /** Requests to select an item in the model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def selectItem(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      unselect_rest: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Boolean /* None */ =
    gtk_selection_model_select_item(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSelectionModel]],
      guint(position),
      gboolean(gint((if unselect_rest == true then 1 else 0)))
    ).value.!=(0)
  end selectItem

  /** Requests to select a range of items in the model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def selectRange(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      n_items: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      unselect_rest: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Boolean /* None */ =
    gtk_selection_model_select_range(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSelectionModel]],
      guint(position),
      guint(n_items),
      gboolean(gint((if unselect_rest == true then 1 else 0)))
    ).value.!=(0)
  end selectRange

  /** Helper function for implementations of `GtkSelectionModel`.
    *
    * Call this when the selection changes to emit the
    * [signal@Gtk.SelectionModel::selection-changed] signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def selectionChanged(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      n_items: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_selection_model_selection_changed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSelectionModel]],
      guint(position),
      guint(n_items)
    )
  end selectionChanged

  /** Make selection changes.
    *
    * This is the most advanced selection updating method that allows the most
    * fine-grained control over selection changes. If you can, you should try
    * the simpler versions, as implementations are more likely to implement
    * support for those.
    *
    * Requests that the selection state of all positions set in @mask be updated
    * to the respective value in the @selected bitmask.
    *
    * In pseudocode, it would look something like this:
    *
    * ```c
    * for (i = 0; i < n_items; i++)
    *   {
    *     // don't change values not in the mask
    *     if (!gtk_bitset_contains (mask, i))
    *       continue;
    *
    *     if (gtk_bitset_contains (selected, i))
    *       select_item (i);
    *     else
    *       unselect_item (i);
    *   }
    *
    * gtk_selection_model_selection_changed (model,
    *                                        first_changed_item,
    *                                        n_changed_items);
    * ```
    *
    * @mask
    *   and @selected must not be modified. They may refer to the same bitset,
    *   which would mean that every item in the set should be selected.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSelection(
      selected: sn.gnome.gtk4.Bitset /* Some(Ptr[GtkBitset]) */,
      mask: sn.gnome.gtk4.Bitset /* Some(Ptr[GtkBitset]) */
  ): Boolean /* None */ =
    gtk_selection_model_set_selection(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSelectionModel]],
      selected.getUnsafeRawPointer().asInstanceOf,
      mask.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end setSelection

  /** Requests to unselect all items in the model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unselectAll(): Boolean /* None */ =
    gtk_selection_model_unselect_all(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSelectionModel]]
    ).value.!=(0)
  end unselectAll

  /** Requests to unselect an item in the model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unselectItem(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Boolean /* None */ =
    gtk_selection_model_unselect_item(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSelectionModel]],
      guint(position)
    ).value.!=(0)
  end unselectItem

  /** Requests to unselect a range of items in the model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unselectRange(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      n_items: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Boolean /* None */ =
    gtk_selection_model_unselect_range(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSelectionModel]],
      guint(position),
      guint(n_items)
    ).value.!=(0)
  end unselectRange

end SelectionModel

object SelectionModel:
  class Abstract(raw: Ptr[Byte]) extends SelectionModel:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end SelectionModel
