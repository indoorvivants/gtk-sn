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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkPopoverMenuBar` presents a horizontal bar of items that pop up popover
  * menus when clicked.
  *
  * ![An example GtkPopoverMenuBar](menubar.png)
  *
  * The only way to create instances of `GtkPopoverMenuBar` is from a
  * `GMenuModel`.
  *
  * # CSS nodes
  *
  * ```
  * menubar
  * ├── item[.active]
  * ┊   ╰── popover
  * ╰── item
  *     ╰── popover
  * ```
  *
  * `GtkPopoverMenuBar` has a single CSS node with name menubar, below which
  * each item has its CSS node, and below that the corresponding popover.
  *
  * The item whose popover is currently open gets the .active style class.
  *
  * # Accessibility
  *
  * `GtkPopoverMenuBar` uses the %GTK_ACCESSIBLE_ROLE_MENU_BAR role, the menu
  * items use the %GTK_ACCESSIBLE_ROLE_MENU_ITEM role and the menus use the
  * %GTK_ACCESSIBLE_ROLE_MENU role.
  */
class PopoverMenuBar(raw: Ptr[GtkPopoverMenuBar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a custom widget to a generated menubar.
    *
    * For this to work, the menu model of @bar must have an item with a `custom`
    * attribute that matches @id.
    */
  def addChild(
      child: Widget /* Some(Ptr[GtkWidget]) */,
      id: String | CString /* Some(CString) */
  )(using Zone): Boolean /* None */ = gtk_popover_menu_bar_add_child(
    this.raw.asInstanceOf[Ptr[GtkPopoverMenuBar]],
    child.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(id)
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the model from which the contents of @bar are taken.
    */
  def getMenuModel(): MenuModel /* None */ = new MenuModel(
    gtk_popover_menu_bar_get_menu_model(
      this.raw.asInstanceOf[Ptr[GtkPopoverMenuBar]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a widget that has previously been added with
    * gtk_popover_menu_bar_add_child().
    */
  def removeChild(
      child: Widget /* Some(Ptr[GtkWidget]) */
  ): Boolean /* None */ = gtk_popover_menu_bar_remove_child(
    this.raw.asInstanceOf[Ptr[GtkPopoverMenuBar]],
    child.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a menu model from which @bar should take its contents.
    */
  def setMenuModel(
      model: Option[
        MenuModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GMenuModel]) */
      ]
  ): Unit /* None */ = gtk_popover_menu_bar_set_menu_model(
    this.raw.asInstanceOf[Ptr[GtkPopoverMenuBar]],
    model
      .map[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]]
      )
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GtkPopoverMenuBar` from a `GMenuModel`.
    */
  def fromModel(
      model: Option[
        MenuModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GMenuModel]) */
      ]
  ): PopoverMenuBar = new PopoverMenuBar(
    gtk_popover_menu_bar_new_from_model(
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]]
        )
    ).asInstanceOf
  )
end PopoverMenuBar
