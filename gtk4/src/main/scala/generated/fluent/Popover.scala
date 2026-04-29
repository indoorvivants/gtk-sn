package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkRectangle
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Native
import sn.gnome.gtk4.fluent.ShortcutManager
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkPopover
import sn.gnome.gtk4.internal.GtkPositionType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkPopover` is a bubble-like context popup.
  *
  * ![An example GtkPopover](popover.png)
  *
  * It is primarily meant to provide context-dependent information or options.
  * Popovers are attached to a parent widget. By default, they point to the
  * whole widget area, although this behavior can be changed with
  * [method@Gtk.Popover.set_pointing_to].
  *
  * The position of a popover relative to the widget it is attached to can also
  * be changed with [method@Gtk.Popover.set_position]
  *
  * By default, `GtkPopover` performs a grab, in order to ensure input events
  * get redirected to it while it is shown, and also so the popover is dismissed
  * in the expected situations (clicks outside the popover, or the Escape key
  * being pressed). If no such modal behavior is desired on a popover,
  * [method@Gtk.Popover.set_autohide] may be called on it to tweak its behavior.
  *
  * ## GtkPopover as menu replacement
  *
  * `GtkPopover` is often used to replace menus. The best was to do this is to
  * use the [class@Gtk.PopoverMenu] subclass which supports being populated from
  * a `GMenuModel` with [ctor@Gtk.PopoverMenu.new_from_model].
  *
  * ```xml
  * <section>
  *   <attribute name="display-hint">horizontal-buttons</attribute>
  *   <item>
  *     <attribute name="label">Cut</attribute>
  *     <attribute name="action">app.cut</attribute>
  *     <attribute name="verb-icon">edit-cut-symbolic</attribute>
  *   </item>
  *   <item>
  *     <attribute name="label">Copy</attribute>
  *     <attribute name="action">app.copy</attribute>
  *     <attribute name="verb-icon">edit-copy-symbolic</attribute>
  *   </item>
  *   <item>
  *     <attribute name="label">Paste</attribute>
  *     <attribute name="action">app.paste</attribute>
  *     <attribute name="verb-icon">edit-paste-symbolic</attribute>
  *   </item>
  * </section>
  * ```
  *
  * # CSS nodes
  *
  * ```
  * popover.background[.menu]
  * ├── arrow
  * ╰── contents
  *     ╰── <child>
  * ```
  *
  * `GtkPopover` has a main node with name `popover`, an arrow with name
  * `arrow`, and another node for the content named `contents`. The `popover`
  * node always gets the `.background` style class. It also gets the `.menu`
  * style class if the popover is menu-like, e.g. is a [class@Gtk.PopoverMenu].
  *
  * Particular uses of `GtkPopover`, such as touch selection popups or
  * magnifiers in `GtkEntry` or `GtkTextView` get style classes like
  * `.touch-selection` or `.magnifier` to differentiate from plain popovers.
  *
  * When styling a popover directly, the `popover` node should usually not have
  * any background. The visible part of the popover can have a shadow. To
  * specify it in CSS, set the box-shadow of the `contents` node.
  *
  * Note that, in order to accomplish appropriate arrow visuals, `GtkPopover`
  * uses custom drawing for the `arrow` node. This makes it possible for the
  * arrow to change its shape dynamically, but it also limits the possibilities
  * of styling it using CSS. In particular, the `arrow` gets drawn over the
  * `content` node's border and shadow, so they look like one shape, which means
  * that the border width of the `content` node and the `arrow` node should be
  * the same. The arrow also does not support any border shape other than solid,
  * no border-radius, only one border width (border-bottom-width is used) and no
  * box-shadow.
  */
class Popover(raw: Ptr[GtkPopover])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      ShortcutManager:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the popover is modal.
    *
    * See [method@Gtk.Popover.set_autohide] for the implications of this.
    */
  def getAutohide(): Boolean =
    gtk_popover_get_autohide(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the popover will close after a modal child is closed.
    */
  def getCascadePopdown(): Boolean =
    gtk_popover_get_cascade_popdown(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child widget of @popover.
    */
  def getChild(): Widget = new Widget(
    gtk_popover_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether this popover is showing an arrow pointing at the widget that
    * it is relative to.
    */
  def getHasArrow(): Boolean =
    gtk_popover_get_has_arrow(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether mnemonics are visible.
    */
  def getMnemonicsVisible(): Boolean =
    gtk_popover_get_mnemonics_visible(this.raw.asInstanceOf).value.!=(0)

  @annotation.compileTimeOnly(
    "Method get_offset contains an OUT parameter, which is not supported yet"
  )
  def getOffset(using DummyImplicit) = ???

  @annotation.compileTimeOnly(
    "Method get_pointing_to contains an OUT parameter, which is not supported yet"
  )
  def getPointingTo(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the preferred position of @popover.
    */
  def getPosition(): GtkPositionType = gtk_popover_get_position(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pops @popover down.
    *
    * This may have the side-effect of closing a parent popover as well. See
    * [property@Gtk.Popover:cascade-popdown].
    */
  def popdown(): Unit = gtk_popover_popdown(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pops @popover up.
    */
  def popup(): Unit = gtk_popover_popup(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Allocate a size for the `GtkPopover`.
    *
    * This function needs to be called in size-allocate by widgets who have a
    * `GtkPopover` as child. When using a layout manager, this is happening
    * automatically.
    *
    * To make a popover appear on screen, use [method@Gtk.Popover.popup].
    */
  def present(): Unit = gtk_popover_present(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether @popover is modal.
    *
    * A modal popover will grab the keyboard focus on it when being displayed.
    * Focus will wrap around within the popover. Clicking outside the popover
    * area or pressing Esc will dismiss the popover.
    *
    * Called this function on an already showing popup with a new autohide value
    * different from the current one, will cause the popup to be hidden.
    */
  def setAutohide(autohide: Boolean): Unit = gtk_popover_set_autohide(
    this.raw.asInstanceOf,
    gboolean(gint((if autohide == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @cascade_popdown is %TRUE, the popover will be closed when a child
    * modal popover is closed.
    *
    * If %FALSE, @popover will stay visible.
    */
  def setCascadePopdown(cascade_popdown: Boolean): Unit =
    gtk_popover_set_cascade_popdown(
      this.raw.asInstanceOf,
      gboolean(gint((if cascade_popdown == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the child widget of @popover.
    */
  def setChild(child: Widget): Unit = gtk_popover_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the default widget of a `GtkPopover`.
    *
    * The default widget is the widget that’s activated when the user presses
    * Enter in a dialog (for example). This function sets or unsets the default
    * widget for a `GtkPopover`.
    */
  def setDefaultWidget(widget: Widget): Unit = gtk_popover_set_default_widget(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether this popover should draw an arrow pointing at the widget it
    * is relative to.
    */
  def setHasArrow(has_arrow: Boolean): Unit = gtk_popover_set_has_arrow(
    this.raw.asInstanceOf,
    gboolean(gint((if has_arrow == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether mnemonics should be visible.
    */
  def setMnemonicsVisible(mnemonics_visible: Boolean): Unit =
    gtk_popover_set_mnemonics_visible(
      this.raw.asInstanceOf,
      gboolean(gint((if mnemonics_visible == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the offset to use when calculating the position of the popover.
    *
    * These values are used when preparing the [struct@Gdk.PopupLayout] for
    * positioning the popover.
    */
  def setOffset(x_offset: Int, y_offset: Int): Unit =
    gtk_popover_set_offset(this.raw.asInstanceOf, x_offset, y_offset)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the rectangle that @popover points to.
    *
    * This is in the coordinate space of the @popover parent.
    */
  def setPointingTo(rect: Ptr[GdkRectangle]): Unit =
    gtk_popover_set_pointing_to(this.raw.asInstanceOf, rect)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the preferred position for @popover to appear.
    *
    * If the @popover is currently visible, it will be immediately updated.
    *
    * This preference will be respected where possible, although on lack of
    * space (eg. if close to the window edges), the `GtkPopover` may choose to
    * appear on the opposite side.
    */
  def setPosition(position: GtkPositionType): Unit =
    gtk_popover_set_position(this.raw.asInstanceOf, position)

end Popover

object Popover:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkPopover`.
    */
  def apply(): Popover = new Popover(gtk_popover_new().asInstanceOf)
end Popover
