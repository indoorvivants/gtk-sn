package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkBaselinePosition
import sn.gnome.gtk4.internal.GtkCenterBox

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkCenterBox` arranges three children in a row, keeping the middle child
  * centered as well as possible.
  *
  * ![An example GtkCenterBox](centerbox.png)
  *
  * To add children to `GtkCenterBox`, use
  * [method@Gtk.CenterBox.set_start_widget],
  * [method@Gtk.CenterBox.set_center_widget] and
  * [method@Gtk.CenterBox.set_end_widget].
  *
  * The sizing and positioning of children can be influenced with the align and
  * expand properties of the children.
  *
  * # GtkCenterBox as GtkBuildable
  *
  * The `GtkCenterBox` implementation of the `GtkBuildable` interface supports
  * placing children in the 3 positions by specifying “start”, “center” or “end”
  * as the “type” attribute of a `<child>` element.
  *
  * # CSS nodes
  *
  * `GtkCenterBox` uses a single CSS node with the name “box”,
  *
  * The first child of the `GtkCenterBox` will be allocated depending on the
  * text direction, i.e. in left-to-right layouts it will be allocated on the
  * left and in right-to-left layouts on the right.
  *
  * In vertical orientation, the nodes of the children are arranged from top to
  * bottom.
  *
  * # Accessibility
  *
  * Until GTK 4.10, `GtkCenterBox` used the `GTK_ACCESSIBLE_ROLE_GROUP` role.
  *
  * Starting from GTK 4.12, `GtkCenterBox` uses the
  * `GTK_ACCESSIBLE_ROLE_GENERIC` role.
  */
class CenterBox(raw: Ptr[GtkCenterBox])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value set by gtk_center_box_set_baseline_position().
    */
  def getBaselinePosition(): GtkBaselinePosition =
    gtk_center_box_get_baseline_position(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the center widget, or %NULL if there is none.
    */
  def getCenterWidget(): Widget = new Widget(
    gtk_center_box_get_center_widget(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the end widget, or %NULL if there is none.
    */
  def getEndWidget(): Widget = new Widget(
    gtk_center_box_get_end_widget(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether @self shrinks the center widget after other children.
    */
  def getShrinkCenterLast(): Boolean =
    gtk_center_box_get_shrink_center_last(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the start widget, or %NULL if there is none.
    */
  def getStartWidget(): Widget = new Widget(
    gtk_center_box_get_start_widget(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the baseline position of a center box.
    *
    * This affects only horizontal boxes with at least one baseline aligned
    * child. If there is more vertical space available than requested, and the
    * baseline is not allocated by the parent then
    * @position
    *   is used to allocate the baseline wrt. the extra space available.
    */
  def setBaselinePosition(position: GtkBaselinePosition): Unit =
    gtk_center_box_set_baseline_position(this.raw.asInstanceOf, position)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the center widget.
    *
    * To remove the existing center widget, pass %NULL.
    */
  def setCenterWidget(child: Widget): Unit = gtk_center_box_set_center_widget(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the end widget.
    *
    * To remove the existing end widget, pass %NULL.
    */
  def setEndWidget(child: Widget): Unit = gtk_center_box_set_end_widget(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether to shrink the center widget after other children.
    *
    * By default, when there's no space to give all three children their natural
    * widths, the start and end widgets start shrinking and the center child
    * keeps natural width until they reach minimum width.
    *
    * If set to `FALSE`, start and end widgets keep natural width and the center
    * widget starts shrinking instead.
    */
  def setShrinkCenterLast(shrink_center_last: Boolean): Unit =
    gtk_center_box_set_shrink_center_last(
      this.raw.asInstanceOf,
      gboolean(gint((if shrink_center_last == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the start widget.
    *
    * To remove the existing start widget, pass %NULL.
    */
  def setStartWidget(child: Widget): Unit = gtk_center_box_set_start_widget(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

end CenterBox

object CenterBox:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkCenterBox`.
    */
  def apply(): CenterBox = new CenterBox(gtk_center_box_new().asInstanceOf)
end CenterBox
