package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.{Drag, Paintable}
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ConstraintTarget,
  Native,
  Root,
  Widget
}
import sn.gnome.gtk4.internal.GtkDragIcon

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkDragIcon` is a `GtkRoot` implementation for drag icons.
  *
  * A drag icon moves with the pointer during a Drag-and-Drop operation and is
  * destroyed when the drag ends.
  *
  * To set up a drag icon and associate it with an ongoing drag operation, use
  * [func@Gtk.DragIcon.get_for_drag] to get the icon for a drag. You can then
  * use it like any other widget and use [method@Gtk.DragIcon.set_child] to set
  * whatever widget should be used for the drag icon.
  *
  * Keep in mind that drag icons do not allow user input.
  */
class DragIcon(raw: Ptr[GtkDragIcon])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      Root:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the widget currently used as drag icon.
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_drag_icon_get_child(
      this.raw.asInstanceOf[Ptr[GtkDragIcon]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the widget to display as the drag icon.
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_drag_icon_set_child(
    this.raw.asInstanceOf[Ptr[GtkDragIcon]],
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

end DragIcon

object DragIcon:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a widget that can be used as a drag icon for the given
    * @value.
    *
    * Supported types include strings, `GdkRGBA` and `GtkTextBuffer`. If GTK
    * does not know how to create a widget for a given value, it will return
    * %NULL.
    *
    * This method is used to set the default drag icon on drag-and-drop
    * operations started by `GtkDragSource`, so you don't need to set a drag
    * icon using this function there.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(const GValue*)))"
  )
  def createWidgetForValue() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GtkDragIcon` in use with @drag.
    *
    * If no drag icon exists yet, a new one will be created and shown.
    */
  def getForDrag(
      drag: Drag /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDrag]) */
  ): Widget /* Some(Ptr[GtkWidget]) */ = new Widget(
    gtk_drag_icon_get_for_drag(
      drag.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GtkDragIcon` that shows @paintable, and associates it with the
    * drag operation.
    *
    * The hotspot position on the paintable is aligned with the hotspot of the
    * cursor.
    */
  def setFromPaintable(
      drag: Drag /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDrag]) */,
      paintable: Paintable /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]) */,
      hot_x: Int /* Some(CInt) */,
      hot_y: Int /* Some(CInt) */
  ): Unit /* Some(Unit) */ = gtk_drag_icon_set_from_paintable(
    drag.getUnsafeRawPointer().asInstanceOf,
    paintable.getUnsafeRawPointer().asInstanceOf,
    hot_x,
    hot_y
  )

end DragIcon
