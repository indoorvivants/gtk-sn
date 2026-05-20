package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{Accessible, Buildable, ConstraintTarget, Editable, Widget}
import sn.gnome.gtk4.internal.GtkSearchBar

/** `GtkSearchBar` is a container made to have a search entry.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SearchBar private[gnome] (raw: Ptr[GtkSearchBar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Connects the `GtkEditable` widget passed as the one to be used in this
    * search bar.
    *
    * The entry should be a descendant of the search bar. Calling this function
    * manually is only required if the entry isn’t the direct child of the
    * search bar (as in our main example).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def connectEntry(
      entry: sn.gnome.gtk4.Editable /* Some(Ptr[GtkEditable]) */
  ): Unit /* None */ =
    gtk_search_bar_connect_entry(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSearchBar]],
      entry.getUnsafeRawPointer().asInstanceOf
    )
  end connectEntry

  /** Gets the child widget of @bar.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_search_bar_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSearchBar]]
      ).asInstanceOf
    )
  end getChild

  /** Gets the widget that @bar is capturing key events from.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getKeyCaptureWidget()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_search_bar_get_key_capture_widget(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSearchBar]]
      ).asInstanceOf
    )
  end getKeyCaptureWidget

  /** Returns whether the search mode is on or off.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSearchMode(): Boolean /* None */ =
    gtk_search_bar_get_search_mode(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSearchBar]]
    ).value.!=(0)
  end getSearchMode

  /** Returns whether the close button is shown.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShowCloseButton(): Boolean /* None */ =
    gtk_search_bar_get_show_close_button(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSearchBar]]
    ).value.!=(0)
  end getShowCloseButton

  /** Sets the child widget of @bar.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChild(child: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ])(
      using Runtime
  ): Unit /* None */ =
    gtk_search_bar_set_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSearchBar]],
      child
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setChild

  /** Sets @widget as the widget that @bar will capture key events from.
    *
    * If key events are handled by the search bar, the bar will be shown, and
    * the entry populated with the entered text.
    *
    * Note that despite the name of this function, the events are only
    * 'captured' in the bubble phase, which means that editable child widgets of @widget
    * will receive text input before it gets captured. If that is not desired,
    * you can capture and forward the events yourself with
    * [method@Gtk.EventControllerKey.forward].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setKeyCaptureWidget(
      widget: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_search_bar_set_key_capture_widget(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSearchBar]],
      widget
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setKeyCaptureWidget

  /** Switches the search mode on or off.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSearchMode(
      search_mode: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_search_bar_set_search_mode(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSearchBar]],
      gboolean(gint((if search_mode == true then 1 else 0)))
    )
  end setSearchMode

  /** Shows or hides the close button.
    *
    * Applications that already have a “search” toggle button should not show a
    * close button in their search bar, as it duplicates the role of the toggle
    * button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowCloseButton(
      visible: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_search_bar_set_show_close_button(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSearchBar]],
      gboolean(gint((if visible == true then 1 else 0)))
    )
  end setShowCloseButton

end SearchBar

object SearchBar:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkSearchBar])(using Runtime) =
    summon[Runtime].getOrCreate[SearchBar](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new SearchBar(ptr)
    )

  /** Creates a `GtkSearchBar`.
    *
    * You will need to tell it about which widget is going to be your text entry
    * using [method@Gtk.SearchBar.connect_entry].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): SearchBar =
    val raw: Ptr[Byte] = gtk_search_bar_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[SearchBar](raw, r => SearchBar.applyUnsafe(r.asInstanceOf))
  end apply
end SearchBar
