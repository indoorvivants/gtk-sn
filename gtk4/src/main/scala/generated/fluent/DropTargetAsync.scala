package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Drop
import sn.gnome.gdk4.internal.GdkContentFormats
import sn.gnome.gdk4.internal.GdkDragAction
import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.internal.GtkDropTargetAsync

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkDropTargetAsync` is an event controller to receive Drag-and-Drop
  * operations, asynchronously.
  *
  * It is the more complete but also more complex method of handling drop
  * operations compared to [class@Gtk.DropTarget], and you should only use it if
  * `GtkDropTarget` doesn't provide all the features you need.
  *
  * To use a `GtkDropTargetAsync` to receive drops on a widget, you create a
  * `GtkDropTargetAsync` object, configure which data formats and actions you
  * support, connect to its signals, and then attach it to the widget with
  * [method@Gtk.Widget.add_controller].
  *
  * During a drag operation, the first signal that a `GtkDropTargetAsync` emits
  * is [signal@Gtk.DropTargetAsync::accept], which is meant to determine whether
  * the target is a possible drop site for the ongoing drop. The default handler
  * for the ::accept signal accepts the drop if it finds a compatible data
  * format and an action that is supported on both sides.
  *
  * If it is, and the widget becomes a target, you will receive a
  * [signal@Gtk.DropTargetAsync::drag-enter] signal, followed by
  * [signal@Gtk.DropTargetAsync::drag-motion] signals as the pointer moves,
  * optionally a [signal@Gtk.DropTargetAsync::drop] signal when a drop happens,
  * and finally a [signal@Gtk.DropTargetAsync::drag-leave] signal when the
  * pointer moves off the widget.
  *
  * The ::drag-enter and ::drag-motion handler return a `GdkDragAction` to
  * update the status of the ongoing operation. The ::drop handler should decide
  * if it ultimately accepts the drop and if it does, it should initiate the
  * data transfer and finish the operation by calling [method@Gdk.Drop.finish].
  *
  * Between the ::drag-enter and ::drag-leave signals the widget is a current
  * drop target, and will receive the %GTK_STATE_FLAG_DROP_ACTIVE state, which
  * can be used by themes to style the widget as a drop target.
  */
class DropTargetAsync(raw: Ptr[GtkDropTargetAsync])
    extends EventController(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the actions that this drop target supports.
    */
  def getActions(): GdkDragAction /* None */ =
    gtk_drop_target_async_get_actions(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the data formats that this drop target accepts.
    *
    * If the result is %NULL, all formats are expected to be supported.
    */
  def getFormats(): Ptr[GdkContentFormats] /* None */ =
    gtk_drop_target_async_get_formats(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the @drop as not accepted on this drag site.
    *
    * This function should be used when delaying the decision on whether to
    * accept a drag or not until after reading the data.
    */
  def rejectDrop(
      drop: Drop /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDrop]) */
  ): Unit /* None */ = gtk_drop_target_async_reject_drop(
    this.raw.asInstanceOf,
    drop.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the actions that this drop target supports.
    */
  def setActions(
      actions: GdkDragAction /* Some(_root_.sn.gnome.gdk4.internal.GdkDragAction) */
  ): Unit /* None */ =
    gtk_drop_target_async_set_actions(this.raw.asInstanceOf, actions)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the data formats that this drop target will accept.
    */
  def setFormats(
      formats: Option[Ptr[
        GdkContentFormats
      ] /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkContentFormats]) */ ]
  ): Unit /* None */ = gtk_drop_target_async_set_formats(
    this.raw.asInstanceOf,
    formats
      .map[Ptr[_root_.sn.gnome.gdk4.internal.GdkContentFormats]](o => o)
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gdk4.internal.GdkContentFormats]]
      )
  )

end DropTargetAsync

object DropTargetAsync:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkDropTargetAsync` object.
    */
  def apply(
      formats: Option[Ptr[
        GdkContentFormats
      ] /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkContentFormats]) */ ],
      actions: GdkDragAction /* Some(_root_.sn.gnome.gdk4.internal.GdkDragAction) */
  ): DropTargetAsync = new DropTargetAsync(
    gtk_drop_target_async_new(
      formats
        .map[Ptr[_root_.sn.gnome.gdk4.internal.GdkContentFormats]](o => o)
        .getOrElse(
          null
            .asInstanceOf[Ptr[_root_.sn.gnome.gdk4.internal.GdkContentFormats]]
        ),
      actions
    ).asInstanceOf
  )
end DropTargetAsync
