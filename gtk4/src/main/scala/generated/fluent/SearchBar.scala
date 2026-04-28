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

class SearchBar(raw: Ptr[GtkSearchBar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def connectEntry(entry: Editable): Unit = gtk_search_bar_connect_entry(
    this.raw.asInstanceOf,
    entry.getUnsafeRawPointer().asInstanceOf
  )

  def getChild(): Widget = new Widget(
    gtk_search_bar_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getKeyCaptureWidget(): Widget = new Widget(
    gtk_search_bar_get_key_capture_widget(this.raw.asInstanceOf).asInstanceOf
  )

  def getSearchMode(): Boolean =
    gtk_search_bar_get_search_mode(this.raw.asInstanceOf).value.!=(0)

  def getShowCloseButton(): Boolean =
    gtk_search_bar_get_show_close_button(this.raw.asInstanceOf).value.!=(0)

  def setChild(child: Widget): Unit = gtk_search_bar_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setKeyCaptureWidget(widget: Widget): Unit =
    gtk_search_bar_set_key_capture_widget(
      this.raw.asInstanceOf,
      widget.getUnsafeRawPointer().asInstanceOf
    )

  def setSearchMode(search_mode: Boolean): Unit =
    gtk_search_bar_set_search_mode(
      this.raw.asInstanceOf,
      gboolean(gint((if search_mode == true then 1 else 0)))
    )

  def setShowCloseButton(visible: Boolean): Unit =
    gtk_search_bar_set_show_close_button(
      this.raw.asInstanceOf,
      gboolean(gint((if visible == true then 1 else 0)))
    )

end SearchBar

object SearchBar:
  def apply(): SearchBar = new SearchBar(gtk_search_bar_new().asInstanceOf)
end SearchBar
