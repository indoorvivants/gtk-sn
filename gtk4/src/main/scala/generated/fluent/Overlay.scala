package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{Accessible, Buildable, ConstraintTarget, Widget}
import sn.gnome.gtk4.internal.GtkOverlay

/** `GtkOverlay` is a container which contains a single main child, on top of
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Overlay(raw: Ptr[GtkOverlay])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds @widget to @overlay.
    *
    * The widget will be stacked on top of the main widget added with
    * [method@Gtk.Overlay.set_child].
    *
    * The position at which @widget is placed is determined from its
    * [property@Gtk.Widget:halign] and [property@Gtk.Widget:valign] properties.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addOverlay(widget: Widget /* Some(Ptr[GtkWidget]) */ ): Unit /* None */ =
    gtk_overlay_add_overlay(
      this.raw.asInstanceOf[Ptr[GtkOverlay]],
      widget.getUnsafeRawPointer().asInstanceOf
    )

  /** Gets the child widget of @overlay.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_overlay_get_child(this.raw.asInstanceOf[Ptr[GtkOverlay]]).asInstanceOf
  )

  /** Gets whether @widget should be clipped within the parent.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getClipOverlay(
      widget: Widget /* Some(Ptr[GtkWidget]) */
  ): Boolean /* None */ = gtk_overlay_get_clip_overlay(
    this.raw.asInstanceOf[Ptr[GtkOverlay]],
    widget.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  /** Gets whether @widget's size is included in the measurement of
    * @overlay.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMeasureOverlay(
      widget: Widget /* Some(Ptr[GtkWidget]) */
  ): Boolean /* None */ = gtk_overlay_get_measure_overlay(
    this.raw.asInstanceOf[Ptr[GtkOverlay]],
    widget.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  /** Removes an overlay that was added with gtk_overlay_add_overlay().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeOverlay(
      widget: Widget /* Some(Ptr[GtkWidget]) */
  ): Unit /* None */ = gtk_overlay_remove_overlay(
    this.raw.asInstanceOf[Ptr[GtkOverlay]],
    widget.getUnsafeRawPointer().asInstanceOf
  )

  /** Sets the child widget of @overlay.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_overlay_set_child(
    this.raw.asInstanceOf[Ptr[GtkOverlay]],
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** Sets whether @widget should be clipped within the parent.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setClipOverlay(
      widget: Widget /* Some(Ptr[GtkWidget]) */,
      clip_overlay: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_overlay_set_clip_overlay(
    this.raw.asInstanceOf[Ptr[GtkOverlay]],
    widget.getUnsafeRawPointer().asInstanceOf,
    gboolean(gint((if clip_overlay == true then 1 else 0)))
  )

  /** Sets whether @widget is included in the measured size of @overlay.
    *
    * The overlay will request the size of the largest child that has this
    * property set to %TRUE. Children who are not included may be drawn outside
    * of @overlay's allocation if they are too large.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMeasureOverlay(
      widget: Widget /* Some(Ptr[GtkWidget]) */,
      measure: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_overlay_set_measure_overlay(
    this.raw.asInstanceOf[Ptr[GtkOverlay]],
    widget.getUnsafeRawPointer().asInstanceOf,
    gboolean(gint((if measure == true then 1 else 0)))
  )

  /** Emitted to determine the position and size of any overlay child widgets.
    *
    * A handler for this signal should fill @allocation with the desired
    * position and size for @widget, relative to the 'main' child of @overlay.
    *
    * The default handler for this signal uses the @widget's halign and valign
    * properties to determine the position and gives the widget its natural size
    * (except that an alignment of %GTK_ALIGN_FILL will cause the overlay to be
    * full-width/height). If the main child is a `GtkScrolledWindow`, the
    * overlays are placed relative to its contents.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal get-child-position]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(Gdk.Rectangle)))"
  )
  private def onGetChildPosition = ???

end Overlay

object Overlay:
  /** Creates a new `GtkOverlay`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): Overlay =
    val raw: Ptr[Byte] = gtk_overlay_new().asInstanceOf
    summon[Runtime].getOrCreate[Overlay](raw, r => new Overlay(r.asInstanceOf))
  end apply
end Overlay
