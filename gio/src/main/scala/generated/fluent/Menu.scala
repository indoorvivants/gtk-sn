package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{MenuItem, MenuModel}
import sn.gnome.gio.internal.GMenu
import sn.gnome.glib.internal.{gchar, gint}
import sn.gnome.gobject.runtime.*

/** #GMenu is a simple implementation of #GMenuModel. You populate a #GMenu by
  * adding #GMenuItem instances to it.
  *
  * There are some convenience functions to allow you to directly add items
  * (avoiding #GMenuItem) for the common cases. To add a regular item, use
  * g_menu_insert(). To add a section, use g_menu_insert_section(). To add a
  * submenu, use g_menu_insert_submenu().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Menu private[gnome] (raw: Ptr[GMenu]) extends MenuModel(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Convenience function for appending a normal menu item to the end of
    * @menu.
    *   Combine g_menu_item_new() and g_menu_insert_item() for a more flexible
    *   alternative.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def append(
      label: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      detailed_action: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone): Unit /* None */ =
    g_menu_append(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenu]],
      label
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      detailed_action
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
    )
  end append

  /** Appends @item to the end of @menu.
    *
    * See g_menu_insert_item() for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendItem(
      item: sn.gnome.gio.fluent.MenuItem /* Some(Ptr[GMenuItem]) */
  )(using Runtime): Unit /* None */ =
    g_menu_append_item(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenu]],
      item.getUnsafeRawPointer().asInstanceOf
    )
  end appendItem

  /** Convenience function for appending a section menu item to the end of
    * @menu.
    *   Combine g_menu_item_new_section() and g_menu_insert_item() for a more
    *   flexible alternative.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendSection(
      label: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      section: sn.gnome.gio.fluent.MenuModel /* Some(Ptr[GMenuModel]) */
  )(using Zone, Runtime): Unit /* None */ =
    g_menu_append_section(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenu]],
      label
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      section.getUnsafeRawPointer().asInstanceOf
    )
  end appendSection

  /** Convenience function for appending a submenu menu item to the end of
    * @menu.
    *   Combine g_menu_item_new_submenu() and g_menu_insert_item() for a more
    *   flexible alternative.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendSubmenu(
      label: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      submenu: sn.gnome.gio.fluent.MenuModel /* Some(Ptr[GMenuModel]) */
  )(using Zone, Runtime): Unit /* None */ =
    g_menu_append_submenu(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenu]],
      label
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      submenu.getUnsafeRawPointer().asInstanceOf
    )
  end appendSubmenu

  /** Marks @menu as frozen.
    *
    * After the menu is frozen, it is an error to attempt to make any changes to
    * it. In effect this means that the #GMenu API must no longer be used.
    *
    * This function causes g_menu_model_is_mutable() to begin returning %FALSE,
    * which has some positive performance implications.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def freeze(): Unit /* None */ =
    g_menu_freeze(this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenu]])
  end freeze

  /** Convenience function for inserting a normal menu item into @menu. Combine
    * g_menu_item_new() and g_menu_insert_item() for a more flexible
    * alternative.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insert(
      position: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      label: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      detailed_action: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone): Unit /* None */ =
    g_menu_insert(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenu]],
      gint(position),
      label
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      detailed_action
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
    )
  end insert

  /** Inserts @item into @menu.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertItem(
      position: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      item: sn.gnome.gio.fluent.MenuItem /* Some(Ptr[GMenuItem]) */
  )(using Runtime): Unit /* None */ =
    g_menu_insert_item(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenu]],
      gint(position),
      item.getUnsafeRawPointer().asInstanceOf
    )
  end insertItem

  /** Convenience function for inserting a section menu item into @menu. Combine
    * g_menu_item_new_section() and g_menu_insert_item() for a more flexible
    * alternative.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertSection(
      position: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      label: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      section: sn.gnome.gio.fluent.MenuModel /* Some(Ptr[GMenuModel]) */
  )(using Zone, Runtime): Unit /* None */ =
    g_menu_insert_section(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenu]],
      gint(position),
      label
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      section.getUnsafeRawPointer().asInstanceOf
    )
  end insertSection

  /** Convenience function for inserting a submenu menu item into @menu. Combine
    * g_menu_item_new_submenu() and g_menu_insert_item() for a more flexible
    * alternative.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertSubmenu(
      position: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      label: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      submenu: sn.gnome.gio.fluent.MenuModel /* Some(Ptr[GMenuModel]) */
  )(using Zone, Runtime): Unit /* None */ =
    g_menu_insert_submenu(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenu]],
      gint(position),
      label
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      submenu.getUnsafeRawPointer().asInstanceOf
    )
  end insertSubmenu

  /** Convenience function for prepending a normal menu item to the start of @menu.
    * Combine g_menu_item_new() and g_menu_insert_item() for a more flexible
    * alternative.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prepend(
      label: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      detailed_action: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone): Unit /* None */ =
    g_menu_prepend(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenu]],
      label
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      detailed_action
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
    )
  end prepend

  /** Prepends @item to the start of @menu.
    *
    * See g_menu_insert_item() for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prependItem(
      item: sn.gnome.gio.fluent.MenuItem /* Some(Ptr[GMenuItem]) */
  )(using Runtime): Unit /* None */ =
    g_menu_prepend_item(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenu]],
      item.getUnsafeRawPointer().asInstanceOf
    )
  end prependItem

  /** Convenience function for prepending a section menu item to the start of @menu.
    * Combine g_menu_item_new_section() and g_menu_insert_item() for a more
    * flexible alternative.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prependSection(
      label: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      section: sn.gnome.gio.fluent.MenuModel /* Some(Ptr[GMenuModel]) */
  )(using Zone, Runtime): Unit /* None */ =
    g_menu_prepend_section(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenu]],
      label
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      section.getUnsafeRawPointer().asInstanceOf
    )
  end prependSection

  /** Convenience function for prepending a submenu menu item to the start of @menu.
    * Combine g_menu_item_new_submenu() and g_menu_insert_item() for a more
    * flexible alternative.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prependSubmenu(
      label: Option[
        String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      submenu: sn.gnome.gio.fluent.MenuModel /* Some(Ptr[GMenuModel]) */
  )(using Zone, Runtime): Unit /* None */ =
    g_menu_prepend_submenu(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenu]],
      label
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          toCString(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      submenu.getUnsafeRawPointer().asInstanceOf
    )
  end prependSubmenu

  /** Removes an item from the menu.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remove(
      position: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): Unit /* None */ =
    g_menu_remove(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenu]],
      gint(position)
    )
  end remove

  /** Removes all items in the menu.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeAll(): Unit /* None */ =
    g_menu_remove_all(this.getUnsafeRawPointer().asInstanceOf[Ptr[GMenu]])
  end removeAll

end Menu

object Menu:
  def applyUnsafe(ptr: Ptr[GMenu])(using Runtime) = summon[Runtime]
    .getOrCreate[Menu](ptr.asInstanceOf[Ptr[Byte]], p => new Menu(ptr))

  /** Creates a new #GMenu.
    *
    * The new menu has no items.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): Menu =
    val raw: Ptr[Byte] = g_menu_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[Menu](raw, r => Menu.applyUnsafe(r.asInstanceOf))
  end apply
end Menu
