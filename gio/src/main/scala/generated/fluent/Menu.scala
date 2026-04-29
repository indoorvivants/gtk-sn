package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.MenuItem
import sn.gnome.gio.fluent.MenuModel
import sn.gnome.gio.internal.GMenu
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GMenu is a simple implementation of #GMenuModel. You populate a #GMenu by
  * adding #GMenuItem instances to it.
  *
  * There are some convenience functions to allow you to directly add items
  * (avoiding #GMenuItem) for the common cases. To add a regular item, use
  * g_menu_insert(). To add a section, use g_menu_insert_section(). To add a
  * submenu, use g_menu_insert_submenu().
  */
class Menu(raw: Ptr[GMenu]) extends MenuModel(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience function for appending a normal menu item to the end of
    * @menu.
    *   Combine g_menu_item_new() and g_menu_insert_item() for a more flexible
    *   alternative.
    */
  def append(label: String | CString, detailed_action: String | CString)(using
      Zone
  ): Unit = g_menu_append(
    this.raw.asInstanceOf,
    __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(detailed_action).asInstanceOf[Ptr[gchar]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends @item to the end of @menu.
    *
    * See g_menu_insert_item() for more information.
    */
  def appendItem(item: MenuItem): Unit = g_menu_append_item(
    this.raw.asInstanceOf,
    item.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience function for appending a section menu item to the end of
    * @menu.
    *   Combine g_menu_item_new_section() and g_menu_insert_item() for a more
    *   flexible alternative.
    */
  def appendSection(label: String | CString, section: MenuModel)(using
      Zone
  ): Unit = g_menu_append_section(
    this.raw.asInstanceOf,
    __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
    section.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience function for appending a submenu menu item to the end of
    * @menu.
    *   Combine g_menu_item_new_submenu() and g_menu_insert_item() for a more
    *   flexible alternative.
    */
  def appendSubmenu(label: String | CString, submenu: MenuModel)(using
      Zone
  ): Unit = g_menu_append_submenu(
    this.raw.asInstanceOf,
    __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
    submenu.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Marks @menu as frozen.
    *
    * After the menu is frozen, it is an error to attempt to make any changes to
    * it. In effect this means that the #GMenu API must no longer be used.
    *
    * This function causes g_menu_model_is_mutable() to begin returning %FALSE,
    * which has some positive performance implications.
    */
  def freeze(): Unit = g_menu_freeze(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience function for inserting a normal menu item into @menu. Combine
    * g_menu_item_new() and g_menu_insert_item() for a more flexible
    * alternative.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts @item into @menu.
    *
    * The "insertion" is actually done by copying all of the attribute and link
    * values of @item and using them to form a new item within @menu. As such, @item
    * itself is not really inserted, but rather, a menu item that is exactly the
    * same as the one presently described by @item.
    *
    * This means that @item is essentially useless after the insertion occurs.
    * Any changes you make to it are ignored unless it is inserted again (at
    * which point its updated values will be copied).
    *
    * You should probably just free @item once you're done.
    *
    * There are many convenience functions to take care of common cases. See
    * g_menu_insert(), g_menu_insert_section() and g_menu_insert_submenu() as
    * well as "prepend" and "append" variants of each of these functions.
    */
  def insertItem(position: Int, item: MenuItem): Unit = g_menu_insert_item(
    this.raw.asInstanceOf,
    gint(position),
    item.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience function for inserting a section menu item into @menu. Combine
    * g_menu_item_new_section() and g_menu_insert_item() for a more flexible
    * alternative.
    */
  def insertSection(position: Int, label: String | CString, section: MenuModel)(
      using Zone
  ): Unit = g_menu_insert_section(
    this.raw.asInstanceOf,
    gint(position),
    __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
    section.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience function for inserting a submenu menu item into @menu. Combine
    * g_menu_item_new_submenu() and g_menu_insert_item() for a more flexible
    * alternative.
    */
  def insertSubmenu(position: Int, label: String | CString, submenu: MenuModel)(
      using Zone
  ): Unit = g_menu_insert_submenu(
    this.raw.asInstanceOf,
    gint(position),
    __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
    submenu.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience function for prepending a normal menu item to the start of @menu.
    * Combine g_menu_item_new() and g_menu_insert_item() for a more flexible
    * alternative.
    */
  def prepend(label: String | CString, detailed_action: String | CString)(using
      Zone
  ): Unit = g_menu_prepend(
    this.raw.asInstanceOf,
    __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(detailed_action).asInstanceOf[Ptr[gchar]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Prepends @item to the start of @menu.
    *
    * See g_menu_insert_item() for more information.
    */
  def prependItem(item: MenuItem): Unit = g_menu_prepend_item(
    this.raw.asInstanceOf,
    item.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience function for prepending a section menu item to the start of @menu.
    * Combine g_menu_item_new_section() and g_menu_insert_item() for a more
    * flexible alternative.
    */
  def prependSection(label: String | CString, section: MenuModel)(using
      Zone
  ): Unit = g_menu_prepend_section(
    this.raw.asInstanceOf,
    __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
    section.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience function for prepending a submenu menu item to the start of @menu.
    * Combine g_menu_item_new_submenu() and g_menu_insert_item() for a more
    * flexible alternative.
    */
  def prependSubmenu(label: String | CString, submenu: MenuModel)(using
      Zone
  ): Unit = g_menu_prepend_submenu(
    this.raw.asInstanceOf,
    __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
    submenu.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes an item from the menu.
    *
    * @position
    *   gives the index of the item to remove.
    *
    * It is an error if position is not in range the range from 0 to one less
    * than the number of items in the menu.
    *
    * It is not possible to remove items by identity since items are added to
    * the menu simply by copying their links and attributes (ie: identity of the
    * item itself is not preserved).
    */
  def remove(position: Int): Unit =
    g_menu_remove(this.raw.asInstanceOf, gint(position))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes all items in the menu.
    */
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GMenu.
    *
    * The new menu has no items.
    */
  def apply(): Menu = new Menu(g_menu_new().asInstanceOf)
end Menu
