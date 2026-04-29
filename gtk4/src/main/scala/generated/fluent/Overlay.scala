package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkOverlay

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkOverlay` is a container which contains a single main child, on top of
  * which it can place “overlay” widgets.
  *
  * ![An example GtkOverlay](overlay.png)
  *
  * The position of each overlay widget is determined by its
  * [property@Gtk.Widget:halign] and [property@Gtk.Widget:valign] properties.
  * E.g. a widget with both alignments set to %GTK_ALIGN_START will be placed at
  * the top left corner of the `GtkOverlay` container, whereas an overlay with
  * halign set to %GTK_ALIGN_CENTER and valign set to %GTK_ALIGN_END will be
  * placed a the bottom edge of the `GtkOverlay`, horizontally centered. The
  * position can be adjusted by setting the margin properties of the child to
  * non-zero values.
  *
  * More complicated placement of overlays is possible by connecting to the
  * [signal@Gtk.Overlay::get-child-position] signal.
  *
  * An overlay’s minimum and natural sizes are those of its main child. The
  * sizes of overlay children are not considered when measuring these preferred
  * sizes.
  *
  * # GtkOverlay as GtkBuildable
  *
  * The `GtkOverlay` implementation of the `GtkBuildable` interface supports
  * placing a child as an overlay by specifying “overlay” as the “type”
  * attribute of a `<child>` element.
  *
  * # CSS nodes
  *
  * `GtkOverlay` has a single CSS node with the name “overlay”. Overlay children
  * whose alignments cause them to be positioned at an edge get the style
  * classes “.left”, “.right”, “.top”, and/or “.bottom” according to their
  * position.
  */
class Overlay(raw: Ptr[GtkOverlay])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds @widget to @overlay.
    *
    * The widget will be stacked on top of the main widget added with
    * [method@Gtk.Overlay.set_child].
    *
    * The position at which @widget is placed is determined from its
    * [property@Gtk.Widget:halign] and [property@Gtk.Widget:valign] properties.
    */
  def addOverlay(widget: Widget): Unit = gtk_overlay_add_overlay(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child widget of @overlay.
    */
  def getChild(): Widget = new Widget(
    gtk_overlay_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether @widget should be clipped within the parent.
    */
  def getClipOverlay(widget: Widget): Boolean = gtk_overlay_get_clip_overlay(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether @widget's size is included in the measurement of
    * @overlay.
    */
  def getMeasureOverlay(widget: Widget): Boolean =
    gtk_overlay_get_measure_overlay(
      this.raw.asInstanceOf,
      widget.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes an overlay that was added with gtk_overlay_add_overlay().
    */
  def removeOverlay(widget: Widget): Unit = gtk_overlay_remove_overlay(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the child widget of @overlay.
    */
  def setChild(child: Widget): Unit = gtk_overlay_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether @widget should be clipped within the parent.
    */
  def setClipOverlay(widget: Widget, clip_overlay: Boolean): Unit =
    gtk_overlay_set_clip_overlay(
      this.raw.asInstanceOf,
      widget.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if clip_overlay == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether @widget is included in the measured size of @overlay.
    *
    * The overlay will request the size of the largest child that has this
    * property set to %TRUE. Children who are not included may be drawn outside
    * of @overlay's allocation if they are too large.
    */
  def setMeasureOverlay(widget: Widget, measure: Boolean): Unit =
    gtk_overlay_set_measure_overlay(
      this.raw.asInstanceOf,
      widget.getUnsafeRawPointer().asInstanceOf,
      gboolean(gint((if measure == true then 1 else 0)))
    )

end Overlay

object Overlay:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkOverlay`.
    */
  def apply(): Overlay = new Overlay(gtk_overlay_new().asInstanceOf)
end Overlay
