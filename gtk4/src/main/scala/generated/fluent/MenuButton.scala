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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `GtkMenuButton` widget is used to display a popup when clicked.
  *
  * ![An example GtkMenuButton](menu-button.png)
  *
  * This popup can be provided either as a `GtkPopover` or as an abstract
  * `GMenuModel`.
  *
  * The `GtkMenuButton` widget can show either an icon (set with the
  * [property@Gtk.MenuButton:icon-name] property) or a label (set with the
  * [property@Gtk.MenuButton:label] property). If neither is explicitly set, a
  * [class@Gtk.Image] is automatically created, using an arrow image oriented
  * according to [property@Gtk.MenuButton:direction] or the generic
  * “open-menu-symbolic” icon if the direction is not set.
  *
  * The positioning of the popup is determined by the
  * [property@Gtk.MenuButton:direction] property of the menu button.
  *
  * For menus, the [property@Gtk.Widget:halign] and [property@Gtk.Widget:valign]
  * properties of the menu are also taken into account. For example, when the
  * direction is %GTK_ARROW_DOWN and the horizontal alignment is
  * %GTK_ALIGN_START, the menu will be positioned below the button, with the
  * starting edge (depending on the text direction) of the menu aligned with the
  * starting edge of the button. If there is not enough space below the button,
  * the menu is popped up above the button instead. If the alignment would move
  * part of the menu offscreen, it is “pushed in”.
  *
  * |           | start                | center                | end                |
  * |:----------|:---------------------|:----------------------|:-------------------|
  * | **down**  | ![](down-start.png)  | ![](down-center.png)  | ![](down-end.png)  |
  * | **up**    | ![](up-start.png)    | ![](up-center.png)    | ![](up-end.png)    |
  * | **left**  | ![](left-start.png)  | ![](left-center.png)  | ![](left-end.png)  |
  * | **right** | ![](right-start.png) | ![](right-center.png) | ![](right-end.png) |
  *
  * # CSS nodes
  *
  * ```
  * menubutton
  * ╰── button.toggle
  *     ╰── <content>
  *          ╰── [arrow]
  * ```
  *
  * `GtkMenuButton` has a single CSS node with name `menubutton` which contains
  * a `button` node with a `.toggle` style class.
  *
  * If the button contains an icon, it will have the `.image-button` style
  * class, if it contains text, it will have `.text-button` style class. If an
  * arrow is visible in addition to an icon, text or a custom child, it will
  * also have `.arrow-button` style class.
  *
  * Inside the toggle button content, there is an `arrow` node for the
  * indicator, which will carry one of the `.none`, `.up`, `.down`, `.left` or
  * `.right` style classes to indicate the direction that the menu will appear
  * in. The CSS is expected to provide a suitable image for each of these cases
  * using the `-gtk-icon-source` property.
  *
  * Optionally, the `menubutton` node can carry the `.circular` style class to
  * request a round appearance.
  *
  * # Accessibility
  *
  * `GtkMenuButton` uses the %GTK_ACCESSIBLE_ROLE_BUTTON role.
  */
class MenuButton(raw: Ptr[GtkMenuButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the menu button is active.
    */
  def getActive(): Boolean /* None */ =
    gtk_menu_button_get_active(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether to show a dropdown arrow even when using an icon or a custom
    * child.
    */
  def getAlwaysShowArrow(): Boolean /* None */ =
    gtk_menu_button_get_always_show_arrow(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves whether the button can be smaller than the natural size of its
    * contents.
    */
  def getCanShrink(): Boolean /* None */ =
    gtk_menu_button_get_can_shrink(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child widget of @menu_button.
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_menu_button_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the direction the popup will be pointing at when popped up.
    */
  @annotation.compileTimeOnly(
    "Method get_direction is weird: conflicting override"
  )
  private def getDirection__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the button has a frame.
    */
  def getHasFrame(): Boolean /* None */ =
    gtk_menu_button_get_has_frame(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the name of the icon shown in the button.
    */
  def getIconName()(using Zone): String /* None */ = fromCString(
    gtk_menu_button_get_icon_name(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the label shown in the button
    */
  def getLabel()(using Zone): String /* None */ = fromCString(
    gtk_menu_button_get_label(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GMenuModel` used to generate the popup.
    */
  def getMenuModel(): MenuModel /* None */ = new MenuModel(
    gtk_menu_button_get_menu_model(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GtkPopover` that pops out of the button.
    *
    * If the button is not using a `GtkPopover`, this function returns %NULL.
    */
  def getPopover(): Popover /* None */ = new Popover(
    gtk_menu_button_get_popover(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the menu button acts as a primary menu.
    */
  def getPrimary(): Boolean /* None */ =
    gtk_menu_button_get_primary(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether an embedded underline in the text indicates a mnemonic.
    */
  def getUseUnderline(): Boolean /* None */ =
    gtk_menu_button_get_use_underline(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Dismiss the menu.
    */
  def popdown(): Unit /* None */ = gtk_menu_button_popdown(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pop up the menu.
    */
  def popup(): Unit /* None */ = gtk_menu_button_popup(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the menu button is active.
    */
  def setActive(
      active: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_menu_button_set_active(
    this.raw.asInstanceOf,
    gboolean(gint((if active == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether to show a dropdown arrow even when using an icon or a custom
    * child.
    */
  def setAlwaysShowArrow(
      always_show_arrow: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_menu_button_set_always_show_arrow(
    this.raw.asInstanceOf,
    gboolean(gint((if always_show_arrow == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the button size can be smaller than the natural size of its
    * contents.
    *
    * For text buttons, setting @can_shrink to true will ellipsize the label.
    *
    * For icon buttons, this function has no effect.
    */
  def setCanShrink(
      can_shrink: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_menu_button_set_can_shrink(
    this.raw.asInstanceOf,
    gboolean(gint((if can_shrink == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the child widget of @menu_button.
    *
    * Setting a child resets [property@Gtk.MenuButton:label] and
    * [property@Gtk.MenuButton:icon-name].
    *
    * If [property@Gtk.MenuButton:always-show-arrow] is set to `TRUE` and
    * [property@Gtk.MenuButton:direction] is not `GTK_ARROW_NONE`, a dropdown
    * arrow will be shown next to the child.
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_menu_button_set_child(
    this.raw.asInstanceOf,
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @func to be called when a popup is about to be shown.
    *
    * @func
    *   should use one of
    *
    *   - [method@Gtk.MenuButton.set_popover]
    *   - [method@Gtk.MenuButton.set_menu_model]
    *
    * to set a popup for @menu_button. If @func is non-%NULL, @menu_button will
    * always be sensitive.
    *
    * Using this function will not reset the menu widget attached to
    * @menu_button.
    *   Instead, this can be done manually in @func.
    */
  def setCreatePopupFunc(
      func: Option[
        GtkMenuButtonCreatePopupFunc /* Some(GtkMenuButtonCreatePopupFunc) */
      ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      destroy_notify: Option[
        GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
      ]
  ): Unit /* None */ = gtk_menu_button_set_create_popup_func(
    this.raw.asInstanceOf,
    func
      .map[GtkMenuButtonCreatePopupFunc](o => o)
      .getOrElse(null.asInstanceOf[GtkMenuButtonCreatePopupFunc]),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
    destroy_notify
      .map[_root_.sn.gnome.glib.internal.GDestroyNotify](o => o)
      .getOrElse(
        null.asInstanceOf[_root_.sn.gnome.glib.internal.GDestroyNotify]
      )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the direction in which the popup will be popped up.
    *
    * If the button is automatically populated with an arrow icon, its direction
    * will be changed to match.
    *
    * If the does not fit in the available space in the given direction, GTK
    * will its best to keep it inside the screen and fully visible.
    *
    * If you pass %GTK_ARROW_NONE for a @direction, the popup will behave as if
    * you passed %GTK_ARROW_DOWN (although you won’t see any arrows).
    */
  @annotation.compileTimeOnly(
    "Method set_direction is weird: conflicting override"
  )
  private def setDirection__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the style of the button.
    */
  def setHasFrame(
      has_frame: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_menu_button_set_has_frame(
    this.raw.asInstanceOf,
    gboolean(gint((if has_frame == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the name of an icon to show inside the menu button.
    *
    * Setting icon name resets [property@Gtk.MenuButton:label] and
    * [property@Gtk.MenuButton:child].
    *
    * If [property@Gtk.MenuButton:always-show-arrow] is set to `TRUE` and
    * [property@Gtk.MenuButton:direction] is not `GTK_ARROW_NONE`, a dropdown
    * arrow will be shown next to the icon.
    */
  def setIconName(
      icon_name: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_menu_button_set_icon_name(
    this.raw.asInstanceOf,
    __sn_extract_string(icon_name)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the label to show inside the menu button.
    *
    * Setting a label resets [property@Gtk.MenuButton:icon-name] and
    * [property@Gtk.MenuButton:child].
    *
    * If [property@Gtk.MenuButton:direction] is not `GTK_ARROW_NONE`, a dropdown
    * arrow will be shown next to the label.
    */
  def setLabel(
      label: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_menu_button_set_label(this.raw.asInstanceOf, __sn_extract_string(label))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `GMenuModel` from which the popup will be constructed.
    *
    * If @menu_model is %NULL, the button is disabled.
    *
    * A [class@Gtk.Popover] will be created from the menu model with
    * [ctor@Gtk.PopoverMenu.new_from_model]. Actions will be connected as
    * documented for this function.
    *
    * If [property@Gtk.MenuButton:popover] is already set, it will be
    * dissociated from the @menu_button, and the property is set to %NULL.
    */
  def setMenuModel(
      menu_model: Option[
        MenuModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GMenuModel]) */
      ]
  ): Unit /* None */ = gtk_menu_button_set_menu_model(
    this.raw.asInstanceOf,
    menu_model
      .map[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]]
      )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `GtkPopover` that will be popped up when the @menu_button is
    * clicked.
    *
    * If @popover is %NULL, the button is disabled.
    *
    * If [property@Gtk.MenuButton:menu-model] is set, the menu model is
    * dissociated from the @menu_button, and the property is set to %NULL.
    */
  def setPopover(
      popover: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_menu_button_set_popover(
    this.raw.asInstanceOf,
    popover
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether menu button acts as a primary menu.
    *
    * Primary menus can be opened with the <kbd>F10</kbd> key.
    */
  def setPrimary(
      primary: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_menu_button_set_primary(
    this.raw.asInstanceOf,
    gboolean(gint((if primary == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If true, an underline in the text indicates a mnemonic.
    */
  def setUseUnderline(
      use_underline: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_menu_button_set_use_underline(
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkMenuButton` widget with downwards-pointing arrow as the
    * only child.
    *
    * You can replace the child widget with another `GtkWidget` should you wish
    * to.
    */
  def apply(): MenuButton = new MenuButton(gtk_menu_button_new().asInstanceOf)
end MenuButton
