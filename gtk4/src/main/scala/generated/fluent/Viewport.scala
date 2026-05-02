package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Adjustment
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Scrollable
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkScrollInfo
import sn.gnome.gtk4.internal.GtkViewport

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkViewport` implements scrollability for widgets that lack their own
  * scrolling capabilities.
  *
  * Use `GtkViewport` to scroll child widgets such as `GtkGrid`, `GtkBox`, and
  * so on.
  *
  * The `GtkViewport` will start scrolling content only if allocated less than
  * the child widget’s minimum size in a given orientation.
  *
  * # CSS nodes
  *
  * `GtkViewport` has a single CSS node with name `viewport`.
  *
  * # Accessibility
  *
  * Until GTK 4.10, `GtkViewport` used the `GTK_ACCESSIBLE_ROLE_GROUP` role.
  *
  * Starting from GTK 4.12, `GtkViewport` uses the `GTK_ACCESSIBLE_ROLE_GENERIC`
  * role.
  */
class Viewport(raw: Ptr[GtkViewport])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Scrollable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child widget of @viewport.
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_viewport_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the viewport is scrolling to keep the focused child in view.
    */
  def getScrollToFocus(): Boolean /* None */ =
    gtk_viewport_get_scroll_to_focus(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scrolls a descendant of the viewport into view.
    *
    * The viewport and the descendant must be visible and mapped for this
    * function to work, otherwise no scrolling will be performed.
    */
  def scrollTo(
      descendant: Widget /* Some(Ptr[GtkWidget]) */,
      scroll: Option[Ptr[GtkScrollInfo] /* Some(Ptr[GtkScrollInfo]) */ ]
  ): Unit /* None */ = gtk_viewport_scroll_to(
    this.raw.asInstanceOf,
    descendant.getUnsafeRawPointer().asInstanceOf,
    scroll
      .map[Ptr[GtkScrollInfo]](o => o)
      .getOrElse(null.asInstanceOf[Ptr[GtkScrollInfo]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the child widget of @viewport.
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_viewport_set_child(
    this.raw.asInstanceOf,
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the viewport should automatically scroll to keep the focused
    * child in view.
    */
  def setScrollToFocus(
      scroll_to_focus: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_viewport_set_scroll_to_focus(
    this.raw.asInstanceOf,
    gboolean(gint((if scroll_to_focus == true then 1 else 0)))
  )

end Viewport

object Viewport:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkViewport`.
    *
    * The new viewport uses the given adjustments, or default adjustments if
    * none are given.
    */
  def apply(
      hadjustment: Option[Adjustment /* Some(Ptr[GtkAdjustment]) */ ],
      vadjustment: Option[Adjustment /* Some(Ptr[GtkAdjustment]) */ ]
  ): Viewport = new Viewport(
    gtk_viewport_new(
      hadjustment
        .map[Ptr[GtkAdjustment]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkAdjustment]]),
      vadjustment
        .map[Ptr[GtkAdjustment]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkAdjustment]])
    ).asInstanceOf
  )
end Viewport
