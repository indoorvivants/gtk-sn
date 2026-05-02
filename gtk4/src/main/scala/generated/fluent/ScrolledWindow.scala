package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Adjustment
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkCornerType
import sn.gnome.gtk4.internal.GtkPolicyType
import sn.gnome.gtk4.internal.GtkScrolledWindow

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkScrolledWindow` is a container that makes its child scrollable.
  *
  * It does so using either internally added scrollbars or externally associated
  * adjustments, and optionally draws a frame around the child.
  *
  * Widgets with native scrolling support, i.e. those whose classes implement
  * the [iface@Gtk.Scrollable] interface, are added directly. For other types of
  * widget, the class [class@Gtk.Viewport] acts as an adaptor, giving
  * scrollability to other widgets. [method@Gtk.ScrolledWindow.set_child]
  * intelligently accounts for whether or not the added child is a
  * `GtkScrollable`. If it isn’t, then it wraps the child in a `GtkViewport`.
  * Therefore, you can just add any child widget and not worry about the
  * details.
  *
  * If [method@Gtk.ScrolledWindow.set_child] has added a `GtkViewport` for you,
  * it will be automatically removed when you unset the child. Unless
  * [property@Gtk.ScrolledWindow:hscrollbar-policy] and
  * [property@Gtk.ScrolledWindow:vscrollbar-policy] are %GTK_POLICY_NEVER or
  * %GTK_POLICY_EXTERNAL, `GtkScrolledWindow` adds internal `GtkScrollbar`
  * widgets around its child. The scroll position of the child, and if
  * applicable the scrollbars, is controlled by the
  * [property@Gtk.ScrolledWindow:hadjustment] and
  * [property@Gtk.ScrolledWindow:vadjustment] that are associated with the
  * `GtkScrolledWindow`. See the docs on [class@Gtk.Scrollbar] for the details,
  * but note that the “step_increment” and “page_increment” fields are only
  * effective if the policy causes scrollbars to be present.
  *
  * If a `GtkScrolledWindow` doesn’t behave quite as you would like, or doesn’t
  * have exactly the right layout, it’s very possible to set up your own
  * scrolling with `GtkScrollbar` and for example a `GtkGrid`.
  *
  * # Touch support
  *
  * `GtkScrolledWindow` has built-in support for touch devices. When a
  * touchscreen is used, swiping will move the scrolled window, and will expose
  * 'kinetic' behavior. This can be turned off with the
  * [property@Gtk.ScrolledWindow:kinetic-scrolling] property if it is undesired.
  *
  * `GtkScrolledWindow` also displays visual 'overshoot' indication when the
  * content is pulled beyond the end, and this situation can be captured with
  * the [signal@Gtk.ScrolledWindow::edge-overshot] signal.
  *
  * If no mouse device is present, the scrollbars will overlaid as narrow,
  * auto-hiding indicators over the content. If traditional scrollbars are
  * desired although no mouse is present, this behaviour can be turned off with
  * the [property@Gtk.ScrolledWindow:overlay-scrolling] property.
  *
  * # CSS nodes
  *
  * `GtkScrolledWindow` has a main CSS node with name scrolledwindow. It gets a
  * .frame style class added when [property@Gtk.ScrolledWindow:has-frame] is
  * %TRUE.
  *
  * It uses subnodes with names overshoot and undershoot to draw the overflow
  * and underflow indications. These nodes get the .left, .right, .top or
  * .bottom style class added depending on where the indication is drawn.
  *
  * `GtkScrolledWindow` also sets the positional style classes (.left, .right,
  * .top, .bottom) and style classes related to overlay scrolling
  * (.overlay-indicator, .dragging, .hovering) on its scrollbars.
  *
  * If both scrollbars are visible, the area where they meet is drawn with a
  * subnode named junction.
  *
  * # Accessibility
  *
  * Until GTK 4.10, `GtkScrolledWindow` used the `GTK_ACCESSIBLE_ROLE_GROUP`
  * role.
  *
  * Starting from GTK 4.12, `GtkScrolledWindow` uses the
  * `GTK_ACCESSIBLE_ROLE_GENERIC` role.
  */
class ScrolledWindow(raw: Ptr[GtkScrolledWindow])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child widget of @scrolled_window.
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_scrolled_window_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the horizontal scrollbar’s adjustment.
    *
    * This is the adjustment used to connect the horizontal scrollbar to the
    * child widget’s horizontal scroll functionality.
    */
  def getHadjustment(): Adjustment /* None */ = new Adjustment(
    gtk_scrolled_window_get_hadjustment(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the scrolled window draws a frame.
    */
  def getHasFrame(): Boolean /* None */ =
    gtk_scrolled_window_get_has_frame(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the horizontal scrollbar of @scrolled_window.
    */
  def getHscrollbar(): Widget /* None */ = new Widget(
    gtk_scrolled_window_get_hscrollbar(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the specified kinetic scrolling behavior.
    */
  def getKineticScrolling(): Boolean /* None */ =
    gtk_scrolled_window_get_kinetic_scrolling(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the maximum content height set.
    */
  def getMaxContentHeight(): Int /* None */ =
    gtk_scrolled_window_get_max_content_height(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the maximum content width set.
    */
  def getMaxContentWidth(): Int /* None */ =
    gtk_scrolled_window_get_max_content_width(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the minimal content height of @scrolled_window.
    */
  def getMinContentHeight(): Int /* None */ =
    gtk_scrolled_window_get_min_content_height(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the minimum content width of @scrolled_window.
    */
  def getMinContentWidth(): Int /* None */ =
    gtk_scrolled_window_get_min_content_width(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether overlay scrolling is enabled for this scrolled window.
    */
  def getOverlayScrolling(): Boolean /* None */ =
    gtk_scrolled_window_get_overlay_scrolling(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the placement of the contents with respect to the scrollbars.
    */
  def getPlacement(): GtkCornerType /* None */ =
    gtk_scrolled_window_get_placement(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the current policy values for the horizontal and vertical
    * scrollbars.
    *
    * See [method@Gtk.ScrolledWindow.set_policy].
    */
  @annotation.compileTimeOnly(
    "Method get_policy contains an OUT parameter, which is not supported yet"
  )
  private def getPolicy__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reports whether the natural height of the child will be calculated and
    * propagated through the scrolled window’s requested natural height.
    */
  def getPropagateNaturalHeight(): Boolean /* None */ =
    gtk_scrolled_window_get_propagate_natural_height(
      this.raw.asInstanceOf
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reports whether the natural width of the child will be calculated and
    * propagated through the scrolled window’s requested natural width.
    */
  def getPropagateNaturalWidth(): Boolean /* None */ =
    gtk_scrolled_window_get_propagate_natural_width(this.raw.asInstanceOf).value
      .!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the vertical scrollbar’s adjustment.
    *
    * This is the adjustment used to connect the vertical scrollbar to the child
    * widget’s vertical scroll functionality.
    */
  def getVadjustment(): Adjustment /* None */ = new Adjustment(
    gtk_scrolled_window_get_vadjustment(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the vertical scrollbar of @scrolled_window.
    */
  def getVscrollbar(): Widget /* None */ = new Widget(
    gtk_scrolled_window_get_vscrollbar(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the child widget of @scrolled_window.
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_scrolled_window_set_child(
    this.raw.asInstanceOf,
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `GtkAdjustment` for the horizontal scrollbar.
    */
  def setHadjustment(
      hadjustment: Option[Adjustment /* Some(Ptr[GtkAdjustment]) */ ]
  ): Unit /* None */ = gtk_scrolled_window_set_hadjustment(
    this.raw.asInstanceOf,
    hadjustment
      .map[Ptr[GtkAdjustment]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkAdjustment]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Changes the frame drawn around the contents of @scrolled_window.
    */
  def setHasFrame(
      has_frame: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_scrolled_window_set_has_frame(
    this.raw.asInstanceOf,
    gboolean(gint((if has_frame == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Turns kinetic scrolling on or off.
    *
    * Kinetic scrolling only applies to devices with source
    * %GDK_SOURCE_TOUCHSCREEN.
    */
  def setKineticScrolling(
      kinetic_scrolling: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_scrolled_window_set_kinetic_scrolling(
    this.raw.asInstanceOf,
    gboolean(gint((if kinetic_scrolling == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the maximum height that @scrolled_window should keep visible.
    *
    * The @scrolled_window will grow up to this height before it starts
    * scrolling the content.
    *
    * It is a programming error to set the maximum content height to a value
    * smaller than [property@Gtk.ScrolledWindow:min-content-height].
    */
  def setMaxContentHeight(height: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_scrolled_window_set_max_content_height(this.raw.asInstanceOf, height)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the maximum width that @scrolled_window should keep visible.
    *
    * The @scrolled_window will grow up to this width before it starts scrolling
    * the content.
    *
    * It is a programming error to set the maximum content width to a value
    * smaller than [property@Gtk.ScrolledWindow:min-content-width].
    */
  def setMaxContentWidth(width: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_scrolled_window_set_max_content_width(this.raw.asInstanceOf, width)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the minimum height that @scrolled_window should keep visible.
    *
    * Note that this can and (usually will) be smaller than the minimum size of
    * the content.
    *
    * It is a programming error to set the minimum content height to a value
    * greater than [property@Gtk.ScrolledWindow:max-content-height].
    */
  def setMinContentHeight(height: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_scrolled_window_set_min_content_height(this.raw.asInstanceOf, height)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the minimum width that @scrolled_window should keep visible.
    *
    * Note that this can and (usually will) be smaller than the minimum size of
    * the content.
    *
    * It is a programming error to set the minimum content width to a value
    * greater than [property@Gtk.ScrolledWindow:max-content-width].
    */
  def setMinContentWidth(width: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_scrolled_window_set_min_content_width(this.raw.asInstanceOf, width)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Enables or disables overlay scrolling for this scrolled window.
    */
  def setOverlayScrolling(
      overlay_scrolling: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_scrolled_window_set_overlay_scrolling(
    this.raw.asInstanceOf,
    gboolean(gint((if overlay_scrolling == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the placement of the contents with respect to the scrollbars for the
    * scrolled window.
    *
    * The default is %GTK_CORNER_TOP_LEFT, meaning the child is in the top left,
    * with the scrollbars underneath and to the right. Other values in
    * [enum@Gtk.CornerType] are %GTK_CORNER_TOP_RIGHT, %GTK_CORNER_BOTTOM_LEFT,
    * and %GTK_CORNER_BOTTOM_RIGHT.
    *
    * See also [method@Gtk.ScrolledWindow.get_placement] and
    * [method@Gtk.ScrolledWindow.unset_placement].
    */
  def setPlacement(
      window_placement: GtkCornerType /* Some(GtkCornerType) */
  ): Unit /* None */ =
    gtk_scrolled_window_set_placement(this.raw.asInstanceOf, window_placement)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the scrollbar policy for the horizontal and vertical scrollbars.
    *
    * The policy determines when the scrollbar should appear; it is a value from
    * the [enum@Gtk.PolicyType] enumeration. If %GTK_POLICY_ALWAYS, the
    * scrollbar is always present; if %GTK_POLICY_NEVER, the scrollbar is never
    * present; if %GTK_POLICY_AUTOMATIC, the scrollbar is present only if needed
    * (that is, if the slider part of the bar would be smaller than the trough —
    * the display is larger than the page size).
    */
  def setPolicy(
      hscrollbar_policy: GtkPolicyType /* Some(GtkPolicyType) */,
      vscrollbar_policy: GtkPolicyType /* Some(GtkPolicyType) */
  ): Unit /* None */ = gtk_scrolled_window_set_policy(
    this.raw.asInstanceOf,
    hscrollbar_policy,
    vscrollbar_policy
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the natural height of the child should be calculated and
    * propagated through the scrolled window’s requested natural height.
    */
  def setPropagateNaturalHeight(
      propagate: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_scrolled_window_set_propagate_natural_height(
    this.raw.asInstanceOf,
    gboolean(gint((if propagate == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the natural width of the child should be calculated and
    * propagated through the scrolled window’s requested natural width.
    */
  def setPropagateNaturalWidth(
      propagate: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_scrolled_window_set_propagate_natural_width(
    this.raw.asInstanceOf,
    gboolean(gint((if propagate == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `GtkAdjustment` for the vertical scrollbar.
    */
  def setVadjustment(
      vadjustment: Option[Adjustment /* Some(Ptr[GtkAdjustment]) */ ]
  ): Unit /* None */ = gtk_scrolled_window_set_vadjustment(
    this.raw.asInstanceOf,
    vadjustment
      .map[Ptr[GtkAdjustment]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkAdjustment]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unsets the placement of the contents with respect to the scrollbars.
    *
    * If no window placement is set for a scrolled window, it defaults to
    * %GTK_CORNER_TOP_LEFT.
    */
  def unsetPlacement(): Unit /* None */ = gtk_scrolled_window_unset_placement(
    this.raw.asInstanceOf
  )

end ScrolledWindow

object ScrolledWindow:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new scrolled window.
    */
  def apply(): ScrolledWindow = new ScrolledWindow(
    gtk_scrolled_window_new().asInstanceOf
  )
end ScrolledWindow
