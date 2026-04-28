package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.MenuModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkPopoverMenuBar

class PopoverMenuBar(raw: Ptr[GtkPopoverMenuBar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addChild(child: Widget, id: String | CString)(using Zone): Boolean =
    gtk_popover_menu_bar_add_child(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      __sn_extract_string(id)
    ).value.!=(0)

  def getMenuModel(): MenuModel = new MenuModel(
    gtk_popover_menu_bar_get_menu_model(this.raw.asInstanceOf).asInstanceOf
  )

  def removeChild(child: Widget): Boolean = gtk_popover_menu_bar_remove_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def setMenuModel(model: MenuModel): Unit =
    gtk_popover_menu_bar_set_menu_model(
      this.raw.asInstanceOf,
      model.getUnsafeRawPointer().asInstanceOf
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end PopoverMenuBar

object PopoverMenuBar:
  def fromModel(model: MenuModel): PopoverMenuBar = new PopoverMenuBar(
    gtk_popover_menu_bar_new_from_model(
      model.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end PopoverMenuBar
