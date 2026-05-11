package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gpointer, guint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.runtime.*

trait ListModel:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Get the item at @position.
    *
    * If @position is greater than the number of items in @list, %NULL is
    * returned.
    *
    * %NULL is never returned for an index that is smaller than the length of
    * the list.
    *
    * See also: g_list_model_get_n_items()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getItem(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Ptr[Byte] /* None */ =
    g_list_model_get_item(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GListModel]],
      guint(position)
    ).value
  end getItem

  /** Gets the type of the items in @list.
    *
    * All items returned from g_list_model_get_item() are of the type returned
    * by this function, or a subtype, or if the type is an interface, they are
    * an implementation of that interface.
    *
    * The item type of a #GListModel can not change during the life of the
    * model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getItemType(): GType /* None */ =
    g_list_model_get_item_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GListModel]]
    )
  end getItemType

  /** Gets the number of items in @list.
    *
    * Depending on the model implementation, calling this function may be less
    * efficient than iterating the list with increasing values for
    * @position
    *   until g_list_model_get_item() returns %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNItems(): UInt /* None */ =
    g_list_model_get_n_items(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GListModel]]
    ).value
  end getNItems

  /** Get the item at @position.
    *
    * If @position is greater than the number of items in @list, %NULL is
    * returned.
    *
    * %NULL is never returned for an index that is smaller than the length of
    * the list.
    *
    * This function is meant to be used by language bindings in place of
    * g_list_model_get_item().
    *
    * See also: g_list_model_get_n_items()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getObject(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Runtime): sn.gnome.gobject.fluent.Object /* None */ =
    sn.gnome.gobject.fluent.Object.applyUnsafe(
      g_list_model_get_object(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GListModel]],
        guint(position)
      ).asInstanceOf
    )
  end getObject

  /** Emits the #GListModel::items-changed signal on @list.
    *
    * This function should only be called by classes implementing #GListModel.
    * It has to be called after the internal representation of @list has been
    * updated, because handlers connected to this signal might query the new
    * state of the list.
    *
    * Implementations must only make changes to the model (as visible to its
    * consumer) in places that will not cause problems for that consumer. For
    * models that are driven directly by a write API (such as #GListStore),
    * changes can be reported in response to uses of that API. For models that
    * represent remote data, changes should only be made from a fresh mainloop
    * dispatch. It is particularly not permitted to make changes in response to
    * a call to the #GListModel consumer API.
    *
    * Stated another way: in general, it is assumed that code making a series of
    * accesses to the model via the API, without returning to the mainloop, and
    * without calling other code, will continue to view the same contents of the
    * model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def itemsChanged(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      removed: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      added: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    g_list_model_items_changed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GListModel]],
      guint(position),
      guint(removed),
      guint(added)
    )
  end itemsChanged

end ListModel

object ListModel:
  class Abstract(raw: Ptr[Byte]) extends ListModel:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end ListModel
