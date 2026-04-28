package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.MenuModel
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Popover
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkMenuButton
import sn.gnome.gtk4.internal.GtkMenuButtonCreatePopupFunc

class MenuButton(raw: Ptr[GtkMenuButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getActive(): Boolean =
    gtk_menu_button_get_active(this.raw.asInstanceOf).value.!=(0)

  def getAlwaysShowArrow(): Boolean =
    gtk_menu_button_get_always_show_arrow(this.raw.asInstanceOf).value.!=(0)

  def getCanShrink(): Boolean =
    gtk_menu_button_get_can_shrink(this.raw.asInstanceOf).value.!=(0)

  def getChild(): Widget = new Widget(
    gtk_menu_button_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  // Method get_direction is weird: conflicting override

  def getHasFrame(): Boolean =
    gtk_menu_button_get_has_frame(this.raw.asInstanceOf).value.!=(0)

  def getIconName()(using Zone): String = fromCString(
    gtk_menu_button_get_icon_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getLabel()(using Zone): String = fromCString(
    gtk_menu_button_get_label(this.raw.asInstanceOf).asInstanceOf
  )

  def getMenuModel(): MenuModel = new MenuModel(
    gtk_menu_button_get_menu_model(this.raw.asInstanceOf).asInstanceOf
  )

  def getPopover(): Popover = new Popover(
    gtk_menu_button_get_popover(this.raw.asInstanceOf).asInstanceOf
  )

  def getPrimary(): Boolean =
    gtk_menu_button_get_primary(this.raw.asInstanceOf).value.!=(0)

  def getUseUnderline(): Boolean =
    gtk_menu_button_get_use_underline(this.raw.asInstanceOf).value.!=(0)

  def popdown(): Unit = gtk_menu_button_popdown(this.raw.asInstanceOf)

  def popup(): Unit = gtk_menu_button_popup(this.raw.asInstanceOf)

  def setActive(active: Boolean): Unit = gtk_menu_button_set_active(
    this.raw.asInstanceOf,
    gboolean(gint((if active == true then 1 else 0)))
  )

  def setAlwaysShowArrow(always_show_arrow: Boolean): Unit =
    gtk_menu_button_set_always_show_arrow(
      this.raw.asInstanceOf,
      gboolean(gint((if always_show_arrow == true then 1 else 0)))
    )

  def setCanShrink(can_shrink: Boolean): Unit = gtk_menu_button_set_can_shrink(
    this.raw.asInstanceOf,
    gboolean(gint((if can_shrink == true then 1 else 0)))
  )

  def setChild(child: Widget): Unit = gtk_menu_button_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setCreatePopupFunc(
      func: GtkMenuButtonCreatePopupFunc,
      user_data: Ptr[Byte],
      destroy_notify: GDestroyNotify
  ): Unit = gtk_menu_button_set_create_popup_func(
    this.raw.asInstanceOf,
    func,
    gpointer(user_data),
    destroy_notify
  )

  // Method set_direction is weird: conflicting override

  def setHasFrame(has_frame: Boolean): Unit = gtk_menu_button_set_has_frame(
    this.raw.asInstanceOf,
    gboolean(gint((if has_frame == true then 1 else 0)))
  )

  def setIconName(icon_name: String | CString)(using Zone): Unit =
    gtk_menu_button_set_icon_name(
      this.raw.asInstanceOf,
      __sn_extract_string(icon_name)
    )

  def setLabel(label: String | CString)(using Zone): Unit =
    gtk_menu_button_set_label(this.raw.asInstanceOf, __sn_extract_string(label))

  def setMenuModel(menu_model: MenuModel): Unit =
    gtk_menu_button_set_menu_model(
      this.raw.asInstanceOf,
      menu_model.getUnsafeRawPointer().asInstanceOf
    )

  def setPopover(popover: Widget): Unit = gtk_menu_button_set_popover(
    this.raw.asInstanceOf,
    popover.getUnsafeRawPointer().asInstanceOf
  )

  def setPrimary(primary: Boolean): Unit = gtk_menu_button_set_primary(
    this.raw.asInstanceOf,
    gboolean(gint((if primary == true then 1 else 0)))
  )

  def setUseUnderline(use_underline: Boolean): Unit =
    gtk_menu_button_set_use_underline(
      this.raw.asInstanceOf,
      gboolean(gint((if use_underline == true then 1 else 0)))
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end MenuButton

object MenuButton:
  def apply(): MenuButton = new MenuButton(gtk_menu_button_new().asInstanceOf)
end MenuButton
