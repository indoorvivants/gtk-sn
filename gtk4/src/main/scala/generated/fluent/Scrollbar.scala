package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.{
  Accessible,
  Adjustment,
  Buildable,
  ConstraintTarget,
  Orientable,
  Orientation,
  Widget
}
import sn.gnome.gtk4.internal.GtkScrollbar

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `GtkScrollbar` widget is a horizontal or vertical scrollbar.
  *
  * ![An example GtkScrollbar](scrollbar.png)
  *
  * Its position and movement are controlled by the adjustment that is passed to
  * or created by [ctor@Gtk.Scrollbar.new]. See [class@Gtk.Adjustment] for more
  * details. The [property@Gtk.Adjustment:value] field sets the position of the
  * thumb and must be between [property@Gtk.Adjustment:lower] and
  * [property@Gtk.Adjustment:upper] - [property@Gtk.Adjustment:page-size]. The
  * [property@Gtk.Adjustment:page-size] represents the size of the visible
  * scrollable area.
  *
  * The fields [property@Gtk.Adjustment:step-increment] and
  * [property@Gtk.Adjustment:page-increment] fields are added to or subtracted
  * from the [property@Gtk.Adjustment:value] when the user asks to move by a
  * step (using e.g. the cursor arrow keys) or by a page (using e.g. the Page
  * Down/Up keys).
  *
  * # CSS nodes
  *
  * ```
  * scrollbar
  * ╰── range[.fine-tune]
  *     ╰── trough
  *         ╰── slider
  * ```
  *
  * `GtkScrollbar` has a main CSS node with name scrollbar and a subnode for its
  * contents. The main node gets the .horizontal or .vertical style classes
  * applied, depending on the scrollbar's orientation.
  *
  * The range node gets the style class .fine-tune added when the scrollbar is
  * in 'fine-tuning' mode.
  *
  * Other style classes that may be added to scrollbars inside
  * [class@Gtk.ScrolledWindow] include the positional classes (.left, .right,
  * .top, .bottom) and style classes related to overlay scrolling
  * (.overlay-indicator, .dragging, .hovering).
  *
  * # Accessibility
  *
  * `GtkScrollbar` uses the %GTK_ACCESSIBLE_ROLE_SCROLLBAR role.
  */
class Scrollbar(raw: Ptr[GtkScrollbar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the scrollbar's adjustment.
    */
  def getAdjustment(): Adjustment /* None */ = new Adjustment(
    gtk_scrollbar_get_adjustment(
      this.raw.asInstanceOf[Ptr[GtkScrollbar]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makes the scrollbar use the given adjustment.
    */
  def setAdjustment(
      adjustment: Option[Adjustment /* Some(Ptr[GtkAdjustment]) */ ]
  ): Unit /* None */ = gtk_scrollbar_set_adjustment(
    this.raw.asInstanceOf[Ptr[GtkScrollbar]],
    adjustment
      .map[Ptr[GtkAdjustment]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkAdjustment]])
  )

end Scrollbar

object Scrollbar:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new scrollbar with the given orientation.
    */
  def apply(
      orientation: Orientation /* Some(GtkOrientation) */,
      adjustment: Option[Adjustment /* Some(Ptr[GtkAdjustment]) */ ]
  ): Scrollbar = new Scrollbar(
    gtk_scrollbar_new(
      orientation.raw,
      adjustment
        .map[Ptr[GtkAdjustment]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkAdjustment]])
    ).asInstanceOf
  )
end Scrollbar
