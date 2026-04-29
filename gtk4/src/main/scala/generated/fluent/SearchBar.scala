package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Editable
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkSearchBar

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkSearchBar` is a container made to have a search entry.
  *
  * ![An example GtkSearchBar](search-bar.png)
  *
  * It can also contain additional widgets, such as drop-down menus, or buttons.
  * The search bar would appear when a search is started through typing on the
  * keyboard, or the application’s search mode is toggled on.
  *
  * For keyboard presses to start a search, the search bar must be told of a
  * widget to capture key events from through
  * [method@Gtk.SearchBar.set_key_capture_widget]. This widget will typically be
  * the top-level window, or a parent container of the search bar. Common
  * shortcuts such as Ctrl+F should be handled as an application action, or
  * through the menu items.
  *
  * You will also need to tell the search bar about which entry you are using as
  * your search entry using [method@Gtk.SearchBar.connect_entry].
  *
  * ## Creating a search bar
  *
  * The following example shows you how to create a more complex search entry.
  *
  * [A simple
  * example](https://gitlab.gnome.org/GNOME/gtk/tree/main/examples/search-bar.c)
  *
  * # CSS nodes
  *
  * ```
  * searchbar
  * ╰── revealer
  *     ╰── box
  *          ├── [child]
  *          ╰── [button.close]
  * ```
  *
  * `GtkSearchBar` has a main CSS node with name searchbar. It has a child node
  * with name revealer that contains a node with name box. The box node contains
  * both the CSS node of the child widget as well as an optional button node
  * which gets the .close style class applied.
  *
  * # Accessibility
  *
  * `GtkSearchBar` uses the %GTK_ACCESSIBLE_ROLE_SEARCH role.
  */
class SearchBar(raw: Ptr[GtkSearchBar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Connects the `GtkEditable` widget passed as the one to be used in this
    * search bar.
    *
    * The entry should be a descendant of the search bar. Calling this function
    * manually is only required if the entry isn’t the direct child of the
    * search bar (as in our main example).
    */
  def connectEntry(entry: Editable): Unit = gtk_search_bar_connect_entry(
    this.raw.asInstanceOf,
    entry.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child widget of @bar.
    */
  def getChild(): Widget = new Widget(
    gtk_search_bar_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the widget that @bar is capturing key events from.
    */
  def getKeyCaptureWidget(): Widget = new Widget(
    gtk_search_bar_get_key_capture_widget(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the search mode is on or off.
    */
  def getSearchMode(): Boolean =
    gtk_search_bar_get_search_mode(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the close button is shown.
    */
  def getShowCloseButton(): Boolean =
    gtk_search_bar_get_show_close_button(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the child widget of @bar.
    */
  def setChild(child: Widget): Unit = gtk_search_bar_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @widget as the widget that @bar will capture key events from.
    *
    * If key events are handled by the search bar, the bar will be shown, and
    * the entry populated with the entered text.
    *
    * Note that despite the name of this function, the events are only
    * 'captured' in the bubble phase, which means that editable child widgets of @widget
    * will receive text input before it gets captured. If that is not desired,
    * you can capture and forward the events yourself with
    * [method@Gtk.EventControllerKey.forward].
    */
  def setKeyCaptureWidget(widget: Widget): Unit =
    gtk_search_bar_set_key_capture_widget(
      this.raw.asInstanceOf,
      widget.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Switches the search mode on or off.
    */
  def setSearchMode(search_mode: Boolean): Unit =
    gtk_search_bar_set_search_mode(
      this.raw.asInstanceOf,
      gboolean(gint((if search_mode == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Shows or hides the close button.
    *
    * Applications that already have a “search” toggle button should not show a
    * close button in their search bar, as it duplicates the role of the toggle
    * button.
    */
  def setShowCloseButton(visible: Boolean): Unit =
    gtk_search_bar_set_show_close_button(
      this.raw.asInstanceOf,
      gboolean(gint((if visible == true then 1 else 0)))
    )

end SearchBar

object SearchBar:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GtkSearchBar`.
    *
    * You will need to tell it about which widget is going to be your text entry
    * using [method@Gtk.SearchBar.connect_entry].
    */
  def apply(): SearchBar = new SearchBar(gtk_search_bar_new().asInstanceOf)
end SearchBar
