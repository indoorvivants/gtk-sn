package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.MenuModel
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ConstraintTarget,
  Native,
  Popover,
  PopoverMenuFlags,
  ShortcutManager,
  Widget
}
import sn.gnome.gtk4.internal.GtkPopoverMenu

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkPopoverMenu` is a subclass of `GtkPopover` that implements menu
  * behavior.
  *
  * ![An example GtkPopoverMenu](menu.png)
  *
  * `GtkPopoverMenu` treats its children like menus and allows switching between
  * them. It can open submenus as traditional, nested submenus, or in a more
  * touch-friendly sliding fashion. The property
  * [property@Gtk.PopoverMenu:flags] controls this appearance.
  *
  * `GtkPopoverMenu` is meant to be used primarily with menu models, using
  * [ctor@Gtk.PopoverMenu.new_from_model]. If you need to put other widgets such
  * as a `GtkSpinButton` or a `GtkSwitch` into a popover, you can use
  * [method@Gtk.PopoverMenu.add_child].
  *
  * For more dialog-like behavior, use a plain `GtkPopover`.
  *
  * ## Menu models
  *
  * The XML format understood by `GtkBuilder` for `GMenuModel` consists of a
  * toplevel `<menu>` element, which contains one or more `<item>` elements.
  * Each `<item>` element contains `<attribute>` and `<link>` elements with a
  * mandatory name attribute. `<link>` elements have the same content model as
  * `<menu>`. Instead of `<link name="submenu">` or `<link name="section">`, you
  * can use `<submenu>` or `<section>` elements.
  *
  * ```xml
  * <menu id='app-menu'>
  *   <section>
  *     <item>
  *       <attribute name='label' translatable='yes'>_New Window</attribute>
  *       <attribute name='action'>app.new</attribute>
  *     </item>
  *     <item>
  *       <attribute name='label' translatable='yes'>_About Sunny</attribute>
  *       <attribute name='action'>app.about</attribute>
  *     </item>
  *     <item>
  *       <attribute name='label' translatable='yes'>_Quit</attribute>
  *       <attribute name='action'>app.quit</attribute>
  *     </item>
  *   </section>
  * </menu>
  * ```
  *
  * Attribute values can be translated using gettext, like other `GtkBuilder`
  * content. `<attribute>` elements can be marked for translation with a
  * `translatable="yes"` attribute. It is also possible to specify message
  * context and translator comments, using the context and comments attributes.
  * To make use of this, the `GtkBuilder` must have been given the gettext
  * domain to use.
  *
  * The following attributes are used when constructing menu items:
  *
  *   - "label": a user-visible string to display
  *   - "use-markup": whether the text in the menu item includes [Pango
  *     markup](https://docs.gtk.org/Pango/pango_markup.html)
  *   - "action": the prefixed name of the action to trigger
  *   - "target": the parameter to use when activating the action
  *   - "icon" and "verb-icon": names of icons that may be displayed
  *   - "submenu-action": name of an action that may be used to track whether a
  *     submenu is open
  *   - "hidden-when": a string used to determine when the item will be hidden.
  *     Possible values include "action-disabled", "action-missing",
  *     "macos-menubar". This is mainly useful for exported menus, see
  *     [method@Gtk.Application.set_menubar].
  *   - "custom": a string used to match against the ID of a custom child added
  *     with [method@Gtk.PopoverMenu.add_child],
  *     [method@Gtk.PopoverMenuBar.add_child], or in the ui file with
  *     `<child type="ID">`.
  *
  * The following attributes are used when constructing sections:
  *
  *   - "label": a user-visible string to use as section heading
  *   - "display-hint": a string used to determine special formatting for the
  *     section. Possible values include "horizontal-buttons",
  *     "circular-buttons" and "inline-buttons". They all indicate that section
  *     should be displayed as a horizontal row of buttons.
  *   - "text-direction": a string used to determine the `GtkTextDirection` to
  *     use when "display-hint" is set to "horizontal-buttons". Possible values
  *     include "rtl", "ltr", and "none".
  *
  * The following attributes are used when constructing submenus:
  *
  *   - "label": a user-visible string to display
  *   - "icon": icon name to display
  *
  * Menu items will also show accelerators, which are usually associated with
  * actions via [method@Gtk.Application.set_accels_for_action],
  * [method@WidgetClass.add_binding_action] or
  * [method@Gtk.ShortcutController.add_shortcut].
  *
  * # CSS Nodes
  *
  * `GtkPopoverMenu` is just a subclass of `GtkPopover` that adds custom content
  * to it, therefore it has the same CSS nodes. It is one of the cases that add
  * a `.menu` style class to the main `popover` node.
  *
  * Menu items have nodes with name `button` and class `.model`. If a section
  * display-hint is set, the section gets a node `box` with class `horizontal`
  * plus a class with the same text as the display hint. Note that said box may
  * not be the direct ancestor of the item `button`s. Thus, for example, to
  * style items in an `inline-buttons` section, select
  * `.inline-buttons button.model`. Other things that may be of interest to
  * style in menus include `label` nodes.
  *
  * # Accessibility
  *
  * `GtkPopoverMenu` uses the %GTK_ACCESSIBLE_ROLE_MENU role, and its items use
  * the %GTK_ACCESSIBLE_ROLE_MENU_ITEM, %GTK_ACCESSIBLE_ROLE_MENU_ITEM_CHECKBOX
  * or %GTK_ACCESSIBLE_ROLE_MENU_ITEM_RADIO roles, depending on the action they
  * are connected to.
  */
class PopoverMenu(raw: Ptr[GtkPopoverMenu])
    extends Popover(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      ShortcutManager:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a custom widget to a generated menu.
    *
    * For this to work, the menu model of @popover must have an item with a
    * `custom` attribute that matches @id.
    */
  def addChild(
      child: Widget /* Some(Ptr[GtkWidget]) */,
      id: String | CString /* Some(CString) */
  )(using Zone): Boolean /* None */ = gtk_popover_menu_add_child(
    this.raw.asInstanceOf[Ptr[GtkPopoverMenu]],
    child.getUnsafeRawPointer().asInstanceOf,
    __sn_extract_string(id)
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the flags that @popover uses to create/display a menu from its
    * model.
    */
  def getFlags(): PopoverMenuFlags /* None */ = PopoverMenuFlags.fromRaw(
    gtk_popover_menu_get_flags(this.raw.asInstanceOf[Ptr[GtkPopoverMenu]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the menu model used to populate the popover.
    */
  def getMenuModel(): MenuModel /* None */ = new MenuModel(
    gtk_popover_menu_get_menu_model(
      this.raw.asInstanceOf[Ptr[GtkPopoverMenu]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a widget that has previously been added with
    * [method@Gtk.PopoverMenu.add_child()]
    */
  def removeChild(
      child: Widget /* Some(Ptr[GtkWidget]) */
  ): Boolean /* None */ = gtk_popover_menu_remove_child(
    this.raw.asInstanceOf[Ptr[GtkPopoverMenu]],
    child.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the flags that @popover uses to create/display a menu from its model.
    *
    * If a model is set and the flags change, contents are rebuilt, so if
    * setting properties individually, set flags before model to avoid a
    * redundant rebuild.
    */
  def setFlags(
      flags: PopoverMenuFlags /* Some(GtkPopoverMenuFlags) */
  ): Unit /* None */ = gtk_popover_menu_set_flags(
    this.raw.asInstanceOf[Ptr[GtkPopoverMenu]],
    flags.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a new menu model on @popover.
    *
    * The existing contents of @popover are removed, and the @popover is
    * populated with new contents according to @model.
    */
  def setMenuModel(
      model: Option[
        MenuModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GMenuModel]) */
      ]
  ): Unit /* None */ = gtk_popover_menu_set_menu_model(
    this.raw.asInstanceOf[Ptr[GtkPopoverMenu]],
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
end PopoverMenu

object PopoverMenu:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GtkPopoverMenu` and populates it according to @model.
    *
    * The created buttons are connected to actions found in the
    * `GtkApplicationWindow` to which the popover belongs - typically by means
    * of being attached to a widget that is contained within the
    * `GtkApplicationWindow`s widget hierarchy.
    *
    * Actions can also be added using [method@Gtk.Widget.insert_action_group] on
    * the menus attach widget or on any of its parent widgets.
    *
    * This function creates menus with sliding submenus. See
    * [ctor@Gtk.PopoverMenu.new_from_model_full] for a way to control this.
    */
  def fromModel(
      model: Option[
        MenuModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GMenuModel]) */
      ]
  ): PopoverMenu = new PopoverMenu(
    gtk_popover_menu_new_from_model(
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]]
        )
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GtkPopoverMenu` and populates it according to @model.
    *
    * The created buttons are connected to actions found in the action groups
    * that are accessible from the parent widget. This includes the
    * `GtkApplicationWindow` to which the popover belongs. Actions can also be
    * added using [method@Gtk.Widget.insert_action_group] on the parent widget
    * or on any of its parent widgets.
    *
    * The only flag that is supported currently is %GTK_POPOVER_MENU_NESTED,
    * which makes GTK create traditional, nested submenus instead of the default
    * sliding submenus.
    */
  def fromModelFull(
      model: MenuModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GMenuModel]) */,
      flags: PopoverMenuFlags /* Some(GtkPopoverMenuFlags) */
  ): PopoverMenu = new PopoverMenu(
    gtk_popover_menu_new_from_model_full(
      model.getUnsafeRawPointer().asInstanceOf,
      flags.raw
    ).asInstanceOf
  )
end PopoverMenu
