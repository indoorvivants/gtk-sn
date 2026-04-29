package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.LayoutManager
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkBaselinePosition
import sn.gnome.gtk4.internal.GtkCenterLayout
import sn.gnome.gtk4.internal.GtkOrientation

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkCenterLayout` is a layout manager that manages up to three children.
  *
  * The start widget is allocated at the start of the layout (left in
  * left-to-right locales and right in right-to-left ones), and the end widget
  * at the end.
  *
  * The center widget is centered regarding the full width of the layout's.
  */
class CenterLayout(raw: Ptr[GtkCenterLayout])
    extends LayoutManager(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the baseline position of the layout.
    */
  def getBaselinePosition(): GtkBaselinePosition =
    gtk_center_layout_get_baseline_position(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the center widget of the layout.
    */
  def getCenterWidget(): Widget = new Widget(
    gtk_center_layout_get_center_widget(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the end widget of the layout.
    */
  def getEndWidget(): Widget = new Widget(
    gtk_center_layout_get_end_widget(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the current orienration of the layout manager.
    */
  def getOrientation(): GtkOrientation = gtk_center_layout_get_orientation(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether @self shrinks the center widget after other children.
    */
  def getShrinkCenterLast(): Boolean =
    gtk_center_layout_get_shrink_center_last(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the start widget of the layout.
    */
  def getStartWidget(): Widget = new Widget(
    gtk_center_layout_get_start_widget(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the new baseline position of @self
    */
  def setBaselinePosition(baseline_position: GtkBaselinePosition): Unit =
    gtk_center_layout_set_baseline_position(
      this.raw.asInstanceOf,
      baseline_position
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the new center widget of @self.
    *
    * To remove the existing center widget, pass %NULL.
    */
  def setCenterWidget(widget: Widget): Unit =
    gtk_center_layout_set_center_widget(
      this.raw.asInstanceOf,
      widget.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the new end widget of @self.
    *
    * To remove the existing center widget, pass %NULL.
    */
  def setEndWidget(widget: Widget): Unit = gtk_center_layout_set_end_widget(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the orientation of @self.
    */
  def setOrientation(orientation: GtkOrientation): Unit =
    gtk_center_layout_set_orientation(this.raw.asInstanceOf, orientation)

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
    gtk_center_layout_set_shrink_center_last(
      this.raw.asInstanceOf,
      gboolean(gint((if shrink_center_last == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the new start widget of @self.
    *
    * To remove the existing start widget, pass %NULL.
    */
  def setStartWidget(widget: Widget): Unit = gtk_center_layout_set_start_widget(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  )

end CenterLayout

object CenterLayout:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkCenterLayout`.
    */
  def apply(): CenterLayout = new CenterLayout(
    gtk_center_layout_new().asInstanceOf
  )
end CenterLayout
