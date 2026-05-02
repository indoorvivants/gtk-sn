package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkListItem

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkListItem` is used by list widgets to represent items in a
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
  */
class ListItem(raw: Ptr[GtkListItem]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the accessible description of @self.
    */
  def getAccessibleDescription()(using Zone): String /* None */ = fromCString(
    gtk_list_item_get_accessible_description(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the accessible label of @self.
    */
  def getAccessibleLabel()(using Zone): String /* None */ = fromCString(
    gtk_list_item_get_accessible_label(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if a list item has been set to be activatable via
    * gtk_list_item_set_activatable().
    */
  def getActivatable(): Boolean /* None */ =
    gtk_list_item_get_activatable(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child previously set via gtk_list_item_set_child() or %NULL if
    * none was set.
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_list_item_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if a list item has been set to be focusable via
    * gtk_list_item_set_focusable().
    */
  def getFocusable(): Boolean /* None */ =
    gtk_list_item_get_focusable(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the model item that associated with @self.
    *
    * If @self is unbound, this function returns %NULL.
    */
  def getItem(): Object /* None */ = new Object(
    gtk_list_item_get_item(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the position in the model that @self currently displays.
    *
    * If @self is unbound, %GTK_INVALID_LIST_POSITION is returned.
    */
  def getPosition(): UInt /* None */ = gtk_list_item_get_position(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if a list item has been set to be selectable via
    * gtk_list_item_set_selectable().
    *
    * Do not confuse this function with [method@Gtk.ListItem.get_selected].
    */
  def getSelectable(): Boolean /* None */ =
    gtk_list_item_get_selectable(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if the item is displayed as selected.
    *
    * The selected state is maintained by the liste widget and its model and
    * cannot be set otherwise.
    */
  def getSelected(): Boolean /* None */ =
    gtk_list_item_get_selected(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the accessible description for the list item, which may be used by
    * e.g. screen readers.
    */
  def setAccessibleDescription(
      description: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_list_item_set_accessible_description(
    this.raw.asInstanceOf,
    __sn_extract_string(description)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the accessible label for the list item, which may be used by e.g.
    * screen readers.
    */
  def setAccessibleLabel(
      label: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_list_item_set_accessible_label(
    this.raw.asInstanceOf,
    __sn_extract_string(label)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @self to be activatable.
    *
    * If an item is activatable, double-clicking on the item, using the Return
    * key or calling gtk_widget_activate() will activate the item. Activating
    * instructs the containing view to handle activation. `GtkListView` for
    * example will be emitting the [signal@Gtk.ListView::activate] signal.
    *
    * By default, list items are activatable.
    */
  def setActivatable(
      activatable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_list_item_set_activatable(
    this.raw.asInstanceOf,
    gboolean(gint((if activatable == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the child to be used for this listitem.
    *
    * This function is typically called by applications when setting up a
    * listitem so that the widget can be reused when binding it multiple times.
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_list_item_set_child(
    this.raw.asInstanceOf,
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @self to be focusable.
    *
    * If an item is focusable, it can be focused using the keyboard. This works
    * similar to [method@Gtk.Widget.set_focusable].
    *
    * Note that if items are not focusable, the keyboard cannot be used to
    * activate them and selecting only works if one of the listitem's children
    * is focusable.
    *
    * By default, list items are focusable.
    */
  def setFocusable(
      focusable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_list_item_set_focusable(
    this.raw.asInstanceOf,
    gboolean(gint((if focusable == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @self to be selectable.
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
    */
  def setSelectable(
      selectable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_list_item_set_selectable(
    this.raw.asInstanceOf,
    gboolean(gint((if selectable == true then 1 else 0)))
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ListItem
