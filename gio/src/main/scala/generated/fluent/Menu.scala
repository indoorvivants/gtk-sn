package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.MenuItem
import sn.gnome.gio.fluent.MenuModel
import sn.gnome.gio.internal.GMenu
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint

class Menu(raw: Ptr[GMenu]) extends MenuModel(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def append(label: String | CString, detailed_action: String | CString)(using
      Zone
  ): Unit = g_menu_append(
    this.raw.asInstanceOf,
    __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(detailed_action).asInstanceOf[Ptr[gchar]]
  )

  def appendItem(item: MenuItem): Unit = g_menu_append_item(
    this.raw.asInstanceOf,
    item.getUnsafeRawPointer().asInstanceOf
  )

  def appendSection(label: String | CString, section: MenuModel)(using
      Zone
  ): Unit = g_menu_append_section(
    this.raw.asInstanceOf,
    __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
    section.getUnsafeRawPointer().asInstanceOf
  )

  def appendSubmenu(label: String | CString, submenu: MenuModel)(using
      Zone
  ): Unit = g_menu_append_submenu(
    this.raw.asInstanceOf,
    __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
    submenu.getUnsafeRawPointer().asInstanceOf
  )

  def freeze(): Unit = g_menu_freeze(this.raw.asInstanceOf)

  def insert(
      position: Int,
      label: String | CString,
      detailed_action: String | CString
  )(using Zone): Unit = g_menu_insert(
    this.raw.asInstanceOf,
    gint(position),
    __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(detailed_action).asInstanceOf[Ptr[gchar]]
  )

  def insertItem(position: Int, item: MenuItem): Unit = g_menu_insert_item(
    this.raw.asInstanceOf,
    gint(position),
    item.getUnsafeRawPointer().asInstanceOf
  )

  def insertSection(position: Int, label: String | CString, section: MenuModel)(
      using Zone
  ): Unit = g_menu_insert_section(
    this.raw.asInstanceOf,
    gint(position),
    __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
    section.getUnsafeRawPointer().asInstanceOf
  )

  def insertSubmenu(position: Int, label: String | CString, submenu: MenuModel)(
      using Zone
  ): Unit = g_menu_insert_submenu(
    this.raw.asInstanceOf,
    gint(position),
    __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
    submenu.getUnsafeRawPointer().asInstanceOf
  )

  def prepend(label: String | CString, detailed_action: String | CString)(using
      Zone
  ): Unit = g_menu_prepend(
    this.raw.asInstanceOf,
    __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(detailed_action).asInstanceOf[Ptr[gchar]]
  )

  def prependItem(item: MenuItem): Unit = g_menu_prepend_item(
    this.raw.asInstanceOf,
    item.getUnsafeRawPointer().asInstanceOf
  )

  def prependSection(label: String | CString, section: MenuModel)(using
      Zone
  ): Unit = g_menu_prepend_section(
    this.raw.asInstanceOf,
    __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
    section.getUnsafeRawPointer().asInstanceOf
  )

  def prependSubmenu(label: String | CString, submenu: MenuModel)(using
      Zone
  ): Unit = g_menu_prepend_submenu(
    this.raw.asInstanceOf,
    __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
    submenu.getUnsafeRawPointer().asInstanceOf
  )

  def remove(position: Int): Unit =
    g_menu_remove(this.raw.asInstanceOf, gint(position))

  def removeAll(): Unit = g_menu_remove_all(this.raw.asInstanceOf)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Menu

object Menu:
  def apply(): Menu = new Menu(g_menu_new().asInstanceOf)
end Menu
