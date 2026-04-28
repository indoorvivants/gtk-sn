package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.MenuModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Native
import sn.gnome.gtk4.fluent.Popover
import sn.gnome.gtk4.fluent.ShortcutManager
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkPopoverMenu
import sn.gnome.gtk4.internal.GtkPopoverMenuFlags

class PopoverMenu(raw: Ptr[GtkPopoverMenu])
    extends Popover(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      ShortcutManager:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addChild(child: Widget, id: String | CString)(using Zone): Boolean =
    gtk_popover_menu_add_child(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      __sn_extract_string(id)
    ).value.!=(0)

  def getFlags(): GtkPopoverMenuFlags = gtk_popover_menu_get_flags(
    this.raw.asInstanceOf
  )

  def getMenuModel(): MenuModel = new MenuModel(
    gtk_popover_menu_get_menu_model(this.raw.asInstanceOf).asInstanceOf
  )

  def removeChild(child: Widget): Boolean = gtk_popover_menu_remove_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def setFlags(flags: GtkPopoverMenuFlags): Unit =
    gtk_popover_menu_set_flags(this.raw.asInstanceOf, flags)

  def setMenuModel(model: MenuModel): Unit = gtk_popover_menu_set_menu_model(
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
end PopoverMenu

object PopoverMenu:
  def fromModel(model: MenuModel): PopoverMenu = new PopoverMenu(
    gtk_popover_menu_new_from_model(
      model.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
  def fromModelFull(model: MenuModel, flags: GtkPopoverMenuFlags): PopoverMenu =
    new PopoverMenu(
      gtk_popover_menu_new_from_model_full(
        model.getUnsafeRawPointer().asInstanceOf,
        flags
      ).asInstanceOf
    )
end PopoverMenu
