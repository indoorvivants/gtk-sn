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

class ListItem(raw: Ptr[GtkListItem]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAccessibleDescription()(using Zone): String = fromCString(
    gtk_list_item_get_accessible_description(this.raw.asInstanceOf).asInstanceOf
  )

  def getAccessibleLabel()(using Zone): String = fromCString(
    gtk_list_item_get_accessible_label(this.raw.asInstanceOf).asInstanceOf
  )

  def getActivatable(): Boolean =
    gtk_list_item_get_activatable(this.raw.asInstanceOf).value.!=(0)

  def getChild(): Widget = new Widget(
    gtk_list_item_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getFocusable(): Boolean =
    gtk_list_item_get_focusable(this.raw.asInstanceOf).value.!=(0)

  def getItem(): Object = new Object(
    gtk_list_item_get_item(this.raw.asInstanceOf).asInstanceOf
  )

  def getPosition(): UInt = gtk_list_item_get_position(
    this.raw.asInstanceOf
  ).value

  def getSelectable(): Boolean =
    gtk_list_item_get_selectable(this.raw.asInstanceOf).value.!=(0)

  def getSelected(): Boolean =
    gtk_list_item_get_selected(this.raw.asInstanceOf).value.!=(0)

  def setAccessibleDescription(
      description: String | CString
  )(using Zone): Unit = gtk_list_item_set_accessible_description(
    this.raw.asInstanceOf,
    __sn_extract_string(description)
  )

  def setAccessibleLabel(label: String | CString)(using Zone): Unit =
    gtk_list_item_set_accessible_label(
      this.raw.asInstanceOf,
      __sn_extract_string(label)
    )

  def setActivatable(activatable: Boolean): Unit =
    gtk_list_item_set_activatable(
      this.raw.asInstanceOf,
      gboolean(gint((if activatable == true then 1 else 0)))
    )

  def setChild(child: Widget): Unit = gtk_list_item_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setFocusable(focusable: Boolean): Unit = gtk_list_item_set_focusable(
    this.raw.asInstanceOf,
    gboolean(gint((if focusable == true then 1 else 0)))
  )

  def setSelectable(selectable: Boolean): Unit = gtk_list_item_set_selectable(
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
