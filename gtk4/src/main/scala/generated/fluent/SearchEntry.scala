package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Editable
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkSearchEntry

class SearchEntry(raw: Ptr[GtkSearchEntry])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Editable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getKeyCaptureWidget(): Widget = new Widget(
    gtk_search_entry_get_key_capture_widget(this.raw.asInstanceOf).asInstanceOf
  )

  def getPlaceholderText()(using Zone): String = fromCString(
    gtk_search_entry_get_placeholder_text(this.raw.asInstanceOf).asInstanceOf
  )

  def getSearchDelay(): UInt = gtk_search_entry_get_search_delay(
    this.raw.asInstanceOf
  ).value

  def setKeyCaptureWidget(widget: Widget): Unit =
    gtk_search_entry_set_key_capture_widget(
      this.raw.asInstanceOf,
      widget.getUnsafeRawPointer().asInstanceOf
    )

  def setPlaceholderText(text: String | CString)(using Zone): Unit =
    gtk_search_entry_set_placeholder_text(
      this.raw.asInstanceOf,
      __sn_extract_string(text)
    )

  def setSearchDelay(delay: UInt): Unit =
    gtk_search_entry_set_search_delay(this.raw.asInstanceOf, guint(delay))

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
  def apply(): SearchEntry = new SearchEntry(
    gtk_search_entry_new().asInstanceOf
  )
end SearchEntry
