package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Native
import sn.gnome.gtk4.fluent.Root
import sn.gnome.gtk4.fluent.Widget
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
