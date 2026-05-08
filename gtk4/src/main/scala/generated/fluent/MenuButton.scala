package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.MenuModel
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ConstraintTarget,
  Popover,
  Widget
}
import sn.gnome.gtk4.internal.GtkMenuButton
import sn.gnome.runtime.*

/** The `GtkMenuButton` widget is used to display a popup when clicked.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MenuButton(raw: Ptr[GtkMenuButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns whether the menu button is active.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActive(): Boolean /* None */ = gtk_menu_button_get_active(
    this.raw.asInstanceOf[Ptr[GtkMenuButton]]
  ).value.!=(0)

  /** Gets whether to show a dropdown arrow even when using an icon or a custom
    * child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAlwaysShowArrow(): Boolean /* None */ =
    gtk_menu_button_get_always_show_arrow(
      this.raw.asInstanceOf[Ptr[GtkMenuButton]]
    ).value.!=(0)

  /** Retrieves whether the button can be smaller than the natural size of its
    * contents.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCanShrink(): Boolean /* None */ = gtk_menu_button_get_can_shrink(
    this.raw.asInstanceOf[Ptr[GtkMenuButton]]
  ).value.!=(0)

  /** Gets the child widget of @menu_button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_menu_button_get_child(
      this.raw.asInstanceOf[Ptr[GtkMenuButton]]
    ).asInstanceOf
  )

  /** Returns the direction the popup will be pointing at when popped up.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_direction]: Method get_direction is weird: conflicting override"
  )
  private def getDirection__ = ???

  /** Returns whether the button has a frame.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHasFrame(): Boolean /* None */ = gtk_menu_button_get_has_frame(
    this.raw.asInstanceOf[Ptr[GtkMenuButton]]
  ).value.!=(0)

  /** Gets the name of the icon shown in the button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIconName()(using Zone): String /* None */ = fromCString(
    gtk_menu_button_get_icon_name(
      this.raw.asInstanceOf[Ptr[GtkMenuButton]]
    ).asInstanceOf
  )

  /** Gets the label shown in the button
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLabel()(using Zone): String /* None */ = fromCString(
    gtk_menu_button_get_label(
      this.raw.asInstanceOf[Ptr[GtkMenuButton]]
    ).asInstanceOf
  )

  /** Returns the `GMenuModel` used to generate the popup.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMenuModel(): MenuModel /* None */ = new MenuModel(
    gtk_menu_button_get_menu_model(
      this.raw.asInstanceOf[Ptr[GtkMenuButton]]
    ).asInstanceOf
  )

  /** Returns the `GtkPopover` that pops out of the button.
    *
    * If the button is not using a `GtkPopover`, this function returns %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPopover(): Popover /* None */ = new Popover(
    gtk_menu_button_get_popover(
      this.raw.asInstanceOf[Ptr[GtkMenuButton]]
    ).asInstanceOf
  )

  /** Returns whether the menu button acts as a primary menu.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPrimary(): Boolean /* None */ = gtk_menu_button_get_primary(
    this.raw.asInstanceOf[Ptr[GtkMenuButton]]
  ).value.!=(0)

  /** Returns whether an embedded underline in the text indicates a mnemonic.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUseUnderline(): Boolean /* None */ = gtk_menu_button_get_use_underline(
    this.raw.asInstanceOf[Ptr[GtkMenuButton]]
  ).value.!=(0)

  /** Dismiss the menu.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def popdown(): Unit /* None */ = gtk_menu_button_popdown(
    this.raw.asInstanceOf[Ptr[GtkMenuButton]]
  )

  /** Pop up the menu.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def popup(): Unit /* None */ = gtk_menu_button_popup(
    this.raw.asInstanceOf[Ptr[GtkMenuButton]]
  )

  /** Sets whether the menu button is active.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setActive(
      active: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_menu_button_set_active(
    this.raw.asInstanceOf[Ptr[GtkMenuButton]],
    gboolean(gint((if active == true then 1 else 0)))
  )

  /** Sets whether to show a dropdown arrow even when using an icon or a custom
    * child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAlwaysShowArrow(
      always_show_arrow: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_menu_button_set_always_show_arrow(
    this.raw.asInstanceOf[Ptr[GtkMenuButton]],
    gboolean(gint((if always_show_arrow == true then 1 else 0)))
  )

  /** Sets whether the button size can be smaller than the natural size of its
    * contents.
    *
    * For text buttons, setting @can_shrink to true will ellipsize the label.
    *
    * For icon buttons, this function has no effect.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCanShrink(
      can_shrink: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_menu_button_set_can_shrink(
    this.raw.asInstanceOf[Ptr[GtkMenuButton]],
    gboolean(gint((if can_shrink == true then 1 else 0)))
  )

  /** Sets the child widget of @menu_button.
    *
    * Setting a child resets [property@Gtk.MenuButton:label] and
    * [property@Gtk.MenuButton:icon-name].
    *
    * If [property@Gtk.MenuButton:always-show-arrow] is set to `TRUE` and
    * [property@Gtk.MenuButton:direction] is not `GTK_ARROW_NONE`, a dropdown
    * arrow will be shown next to the child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_menu_button_set_child(
    this.raw.asInstanceOf[Ptr[GtkMenuButton]],
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** Sets @func to be called when a popup is about to be shown.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_create_popup_func/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(MenuButtonCreatePopupFunc), @type -> DataRecord(GtkMenuButtonCreatePopupFunc)))"
  )
  private def setCreatePopupFunc__ = ???

  /** Sets the direction in which the popup will be popped up.
    *
    * If the button is automatically populated with an arrow icon, its direction
    * will be changed to match.
    *
    * If the does not fit in the available space in the given direction, GTK
    * will its best to keep it inside the screen and fully visible.
    *
    * If you pass %GTK_ARROW_NONE for a @direction, the popup will behave as if
    * you passed %GTK_ARROW_DOWN (although you won’t see any arrows).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_direction]: Method set_direction is weird: conflicting override"
  )
  private def setDirection__ = ???

  /** Sets the style of the button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHasFrame(
      has_frame: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_menu_button_set_has_frame(
    this.raw.asInstanceOf[Ptr[GtkMenuButton]],
    gboolean(gint((if has_frame == true then 1 else 0)))
  )

  /** Sets the name of an icon to show inside the menu button.
    *
    * Setting icon name resets [property@Gtk.MenuButton:label] and
    * [property@Gtk.MenuButton:child].
    *
    * If [property@Gtk.MenuButton:always-show-arrow] is set to `TRUE` and
    * [property@Gtk.MenuButton:direction] is not `GTK_ARROW_NONE`, a dropdown
    * arrow will be shown next to the icon.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIconName(
      icon_name: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_menu_button_set_icon_name(
    this.raw.asInstanceOf[Ptr[GtkMenuButton]],
    __sn_extract_string(icon_name)
  )

  /** Sets the label to show inside the menu button.
    *
    * Setting a label resets [property@Gtk.MenuButton:icon-name] and
    * [property@Gtk.MenuButton:child].
    *
    * If [property@Gtk.MenuButton:direction] is not `GTK_ARROW_NONE`, a dropdown
    * arrow will be shown next to the label.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLabel(
      label: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_menu_button_set_label(
    this.raw.asInstanceOf[Ptr[GtkMenuButton]],
    __sn_extract_string(label)
  )

  /** Sets the `GMenuModel` from which the popup will be constructed.
    *
    * If @menu_model is %NULL, the button is disabled.
    *
    * A [class@Gtk.Popover] will be created from the menu model with
    * [ctor@Gtk.PopoverMenu.new_from_model]. Actions will be connected as
    * documented for this function.
    *
    * If [property@Gtk.MenuButton:popover] is already set, it will be
    * dissociated from the @menu_button, and the property is set to %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMenuModel(
      menu_model: Option[
        MenuModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GMenuModel]) */
      ]
  ): Unit /* None */ = gtk_menu_button_set_menu_model(
    this.raw.asInstanceOf[Ptr[GtkMenuButton]],
    menu_model
      .map[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]]
      )
  )

  /** Sets the `GtkPopover` that will be popped up when the @menu_button is
    * clicked.
    *
    * If @popover is %NULL, the button is disabled.
    *
    * If [property@Gtk.MenuButton:menu-model] is set, the menu model is
    * dissociated from the @menu_button, and the property is set to %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPopover(
      popover: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_menu_button_set_popover(
    this.raw.asInstanceOf[Ptr[GtkMenuButton]],
    popover
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** Sets whether menu button acts as a primary menu.
    *
    * Primary menus can be opened with the <kbd>F10</kbd> key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPrimary(
      primary: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_menu_button_set_primary(
    this.raw.asInstanceOf[Ptr[GtkMenuButton]],
    gboolean(gint((if primary == true then 1 else 0)))
  )

  /** If true, an underline in the text indicates a mnemonic.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUseUnderline(
      use_underline: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_menu_button_set_use_underline(
    this.raw.asInstanceOf[Ptr[GtkMenuButton]],
    gboolean(gint((if use_underline == true then 1 else 0)))
  )

  /** Emitted to when the menu button is activated.
    *
    * The `::activate` signal on `GtkMenuButton` is an action signal and
    * emitting it causes the button to pop up its menu.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivate(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkMenuButton],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"activate"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onActivate

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
  /** Creates a new `GtkMenuButton` widget with downwards-pointing arrow as the
    * only child.
    *
    * You can replace the child widget with another `GtkWidget` should you wish
    * to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): MenuButton =
    val raw: Ptr[Byte] = gtk_menu_button_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[MenuButton](raw, r => new MenuButton(r.asInstanceOf))
  end apply
end MenuButton
