package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Actionable
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkListBoxRow

class ListBoxRow(raw: Ptr[GtkListBoxRow])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Actionable,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def changed(): Unit = gtk_list_box_row_changed(this.raw.asInstanceOf)

  def getActivatable(): Boolean =
    gtk_list_box_row_get_activatable(this.raw.asInstanceOf).value.!=(0)

  def getChild(): Widget = new Widget(
    gtk_list_box_row_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getHeader(): Widget = new Widget(
    gtk_list_box_row_get_header(this.raw.asInstanceOf).asInstanceOf
  )

  def getIndex(): Int = gtk_list_box_row_get_index(this.raw.asInstanceOf)

  def getSelectable(): Boolean =
    gtk_list_box_row_get_selectable(this.raw.asInstanceOf).value.!=(0)

  def isSelected(): Boolean =
    gtk_list_box_row_is_selected(this.raw.asInstanceOf).value.!=(0)

  def setActivatable(activatable: Boolean): Unit =
    gtk_list_box_row_set_activatable(
      this.raw.asInstanceOf,
      gboolean(gint((if activatable == true then 1 else 0)))
    )

  def setChild(child: Widget): Unit = gtk_list_box_row_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setHeader(header: Widget): Unit = gtk_list_box_row_set_header(
    this.raw.asInstanceOf,
    header.getUnsafeRawPointer().asInstanceOf
  )

  def setSelectable(selectable: Boolean): Unit =
    gtk_list_box_row_set_selectable(
      this.raw.asInstanceOf,
      gboolean(gint((if selectable == true then 1 else 0)))
    )

end ListBoxRow

object ListBoxRow:
  def apply(): ListBoxRow = new ListBoxRow(gtk_list_box_row_new().asInstanceOf)
end ListBoxRow
