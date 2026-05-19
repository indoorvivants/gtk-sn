package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.MenuModel
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{Accessible, Buildable, ConstraintTarget, Widget}
import sn.gnome.gtk4.internal.GtkPopoverMenuBar

/** `GtkPopoverMenuBar` presents a horizontal bar of items that pop up popover
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PopoverMenuBar private[gnome] (raw: Ptr[GtkPopoverMenuBar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a custom widget to a generated menubar.
    *
    * For this to work, the menu model of @bar must have an item with a `custom`
    * attribute that matches @id.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addChild(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */,
      id: String /* Some(CString) */
  )(using Runtime): Boolean /* None */ =
    gtk_popover_menu_bar_add_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPopoverMenuBar]],
      child.getUnsafeRawPointer().asInstanceOf,
      summon[Runtime].inZone(toCString(id))
    ).value.!=(0)
  end addChild

  /** Returns the model from which the contents of @bar are taken.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMenuModel()(using Runtime): sn.gnome.gio.MenuModel /* None */ =
    sn.gnome.gio.MenuModel.applyUnsafe(
      gtk_popover_menu_bar_get_menu_model(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPopoverMenuBar]]
      ).asInstanceOf
    )
  end getMenuModel

  /** Removes a widget that has previously been added with
    * gtk_popover_menu_bar_add_child().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeChild(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Boolean /* None */ =
    gtk_popover_menu_bar_remove_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPopoverMenuBar]],
      child.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end removeChild

  /** Sets a menu model from which @bar should take its contents.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMenuModel(
      model: Option[
        sn.gnome.gio.MenuModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GMenuModel]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_popover_menu_bar_set_menu_model(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPopoverMenuBar]],
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]]
        )
    )
  end setMenuModel

end PopoverMenuBar

object PopoverMenuBar:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkPopoverMenuBar])(using Runtime) =
    summon[Runtime].getOrCreate[PopoverMenuBar](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new PopoverMenuBar(ptr)
    )

  /** Creates a `GtkPopoverMenuBar` from a `GMenuModel`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromModel(
      model: Option[
        sn.gnome.gio.MenuModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GMenuModel]) */
      ]
  )(using Runtime): PopoverMenuBar =
    val raw: Ptr[Byte] = gtk_popover_menu_bar_new_from_model(
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]]
        )
    ).asInstanceOf
    summon[Runtime].getOrCreate[PopoverMenuBar](
      raw,
      r => PopoverMenuBar.applyUnsafe(r.asInstanceOf)
    )
  end fromModel
end PopoverMenuBar
