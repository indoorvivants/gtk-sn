package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ConstraintTarget,
  Editable,
  Widget
}
import sn.gnome.gtk4.internal.GtkSearchEntry

/** `GtkSearchEntry` is an entry widget that has been tailored for use as a
  * search entry.
  *
  * The main API for interacting with a `GtkSearchEntry` as entry is the
  * `GtkEditable` interface.
  *
  * ![An example GtkSearchEntry](search-entry.png)
  *
  * It will show an inactive symbolic “find” icon when the search entry is
  * empty, and a symbolic “clear” icon when there is text. Clicking on the
  * “clear” icon will empty the search entry.
  *
  * To make filtering appear more reactive, it is a good idea to not react to
  * every change in the entry text immediately, but only after a short delay. To
  * support this, `GtkSearchEntry` emits the
  * [signal@Gtk.SearchEntry::search-changed] signal which can be used instead of
  * the [signal@Gtk.Editable::changed] signal.
  *
  * The [signal@Gtk.SearchEntry::previous-match],
  * [signal@Gtk.SearchEntry::next-match] and
  * [signal@Gtk.SearchEntry::stop-search] signals can be used to implement
  * moving between search results and ending the search.
  *
  * Often, `GtkSearchEntry` will be fed events by means of being placed inside a
  * [class@Gtk.SearchBar]. If that is not the case, you can use
  * [method@Gtk.SearchEntry.set_key_capture_widget] to let it capture key input
  * from another widget.
  *
  * `GtkSearchEntry` provides only minimal API and should be used with the
  * [iface@Gtk.Editable] API.
  *
  * ## CSS Nodes
  *
  * ```
  * entry.search
  * ╰── text
  * ```
  *
  * `GtkSearchEntry` has a single CSS node with name entry that carries a
  * `.search` style class, and the text node is a child of that.
  *
  * ## Accessibility
  *
  * `GtkSearchEntry` uses the %GTK_ACCESSIBLE_ROLE_SEARCH_BOX role.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SearchEntry(raw: Ptr[GtkSearchEntry])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Editable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the widget that @entry is capturing key events from.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getKeyCaptureWidget(): Widget /* None */ = new Widget(
    gtk_search_entry_get_key_capture_widget(
      this.raw.asInstanceOf[Ptr[GtkSearchEntry]]
    ).asInstanceOf
  )

  /** Gets the placeholder text associated with @entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPlaceholderText()(using Zone): String /* None */ = fromCString(
    gtk_search_entry_get_placeholder_text(
      this.raw.asInstanceOf[Ptr[GtkSearchEntry]]
    ).asInstanceOf
  )

  /** Get the delay to be used between the last keypress and the
    * [signal@Gtk.SearchEntry::search-changed] signal being emitted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSearchDelay(): UInt /* None */ = gtk_search_entry_get_search_delay(
    this.raw.asInstanceOf[Ptr[GtkSearchEntry]]
  ).value

  /** Sets @widget as the widget that @entry will capture key events from.
    *
    * Key events are consumed by the search entry to start or continue a search.
    *
    * If the entry is part of a `GtkSearchBar`, it is preferable to call
    * [method@Gtk.SearchBar.set_key_capture_widget] instead, which will reveal
    * the entry in addition to triggering the search entry.
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
      widget: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_search_entry_set_key_capture_widget(
    this.raw.asInstanceOf[Ptr[GtkSearchEntry]],
    widget
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** Sets the placeholder text associated with @entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPlaceholderText(
      text: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_search_entry_set_placeholder_text(
    this.raw.asInstanceOf[Ptr[GtkSearchEntry]],
    text
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Set the delay to be used between the last keypress and the
    * [signal@Gtk.SearchEntry::search-changed] signal being emitted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSearchDelay(
      delay: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_search_entry_set_search_delay(
    this.raw.asInstanceOf[Ptr[GtkSearchEntry]],
    guint(delay)
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end SearchEntry

object SearchEntry:
  /** Creates a `GtkSearchEntry`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): SearchEntry = new SearchEntry(
    gtk_search_entry_new().asInstanceOf
  )
end SearchEntry
