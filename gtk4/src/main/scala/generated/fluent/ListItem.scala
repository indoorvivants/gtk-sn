package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.Widget
import sn.gnome.gtk4.internal.GtkListItem

/** `GtkListItem` is used by list widgets to represent items in a
  * [iface@Gio.ListModel].
  *
  * `GtkListItem` objects are managed by the list widget (with its factory) and
  * cannot be created by applications, but they need to be populated by
  * application code. This is done by calling [method@Gtk.ListItem.set_child].
  *
  * `GtkListItem` objects exist in 2 stages:
  *
  *   1. The unbound stage where the listitem is not currently connected to an
  *      item in the list. In that case, the [property@Gtk.ListItem:item]
  *      property is set to %NULL.
  *   2. The bound stage where the listitem references an item from the list.
  *      The [property@Gtk.ListItem:item] property is not %NULL.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ListItem private[gnome] (raw: Ptr[GtkListItem])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the accessible description of @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAccessibleDescription()(using Zone): String /* None */ =
    fromCString(
      gtk_list_item_get_accessible_description(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkListItem]]
      ).asInstanceOf
    )
  end getAccessibleDescription

  /** Gets the accessible label of @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAccessibleLabel()(using Zone): String /* None */ =
    fromCString(
      gtk_list_item_get_accessible_label(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkListItem]]
      ).asInstanceOf
    )
  end getAccessibleLabel

  /** Checks if a list item has been set to be activatable via
    * gtk_list_item_set_activatable().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActivatable(): Boolean /* None */ =
    gtk_list_item_get_activatable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkListItem]]
    ).value.!=(0)
  end getActivatable

  /** Gets the child previously set via gtk_list_item_set_child() or %NULL if
    * none was set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_list_item_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkListItem]]
      ).asInstanceOf
    )
  end getChild

  /** Checks if a list item has been set to be focusable via
    * gtk_list_item_set_focusable().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFocusable(): Boolean /* None */ =
    gtk_list_item_get_focusable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkListItem]]
    ).value.!=(0)
  end getFocusable

  /** Gets the model item that associated with @self.
    *
    * If @self is unbound, this function returns %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getItem()(using Runtime): sn.gnome.gobject.Object /* None */ =
    sn.gnome.gobject.Object.applyUnsafe(
      gtk_list_item_get_item(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkListItem]]
      ).asInstanceOf
    )
  end getItem

  /** Gets the position in the model that @self currently displays.
    *
    * If @self is unbound, %GTK_INVALID_LIST_POSITION is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPosition(): UInt /* None */ =
    gtk_list_item_get_position(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkListItem]]
    ).value
  end getPosition

  /** Checks if a list item has been set to be selectable via
    * gtk_list_item_set_selectable().
    *
    * Do not confuse this function with [method@Gtk.ListItem.get_selected].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSelectable(): Boolean /* None */ =
    gtk_list_item_get_selectable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkListItem]]
    ).value.!=(0)
  end getSelectable

  /** Checks if the item is displayed as selected.
    *
    * The selected state is maintained by the liste widget and its model and
    * cannot be set otherwise.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSelected(): Boolean /* None */ =
    gtk_list_item_get_selected(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkListItem]]
    ).value.!=(0)
  end getSelected

  /** Sets the accessible description for the list item, which may be used by
    * e.g. screen readers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAccessibleDescription(
      description: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_list_item_set_accessible_description(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkListItem]],
      toCString(description)
    )
  end setAccessibleDescription

  /** Sets the accessible label for the list item, which may be used by e.g.
    * screen readers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAccessibleLabel(
      label: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_list_item_set_accessible_label(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkListItem]],
      toCString(label)
    )
  end setAccessibleLabel

  /** Sets @self to be activatable.
    *
    * If an item is activatable, double-clicking on the item, using the Return
    * key or calling gtk_widget_activate() will activate the item. Activating
    * instructs the containing view to handle activation. `GtkListView` for
    * example will be emitting the [signal@Gtk.ListView::activate] signal.
    *
    * By default, list items are activatable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setActivatable(
      activatable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_list_item_set_activatable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkListItem]],
      gboolean(gint((if activatable == true then 1 else 0)))
    )
  end setActivatable

  /** Sets the child to be used for this listitem.
    *
    * This function is typically called by applications when setting up a
    * listitem so that the widget can be reused when binding it multiple times.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChild(child: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ])(
      using Runtime
  ): Unit /* None */ =
    gtk_list_item_set_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkListItem]],
      child
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setChild

  /** Sets @self to be focusable.
    *
    * If an item is focusable, it can be focused using the keyboard. This works
    * similar to [method@Gtk.Widget.set_focusable].
    *
    * Note that if items are not focusable, the keyboard cannot be used to
    * activate them and selecting only works if one of the listitem's children
    * is focusable.
    *
    * By default, list items are focusable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFocusable(
      focusable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_list_item_set_focusable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkListItem]],
      gboolean(gint((if focusable == true then 1 else 0)))
    )
  end setFocusable

  /** Sets @self to be selectable.
    *
    * If an item is selectable, clicking on the item or using the keyboard will
    * try to select or unselect the item. If this succeeds is up to the model to
    * determine, as it is managing the selected state.
    *
    * Note that this means that making an item non-selectable has no influence
    * on the selected state at all. A non-selectable item may still be selected.
    *
    * By default, list items are selectable. When rebinding them to a new item,
    * they will also be reset to be selectable by GTK.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSelectable(
      selectable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_list_item_set_selectable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkListItem]],
      gboolean(gint((if selectable == true then 1 else 0)))
    )
  end setSelectable

end ListItem

object ListItem:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkListItem])(using Runtime) = summon[Runtime]
    .getOrCreate[ListItem](ptr.asInstanceOf[Ptr[Byte]], p => new ListItem(ptr))

end ListItem
