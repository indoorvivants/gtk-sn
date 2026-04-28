package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Drop
import sn.gnome.gdk4.internal.GdkContentFormats
import sn.gnome.gdk4.internal.GdkDragAction
import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.internal.GtkDropTargetAsync

class DropTargetAsync(raw: Ptr[GtkDropTargetAsync])
    extends EventController(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getActions(): GdkDragAction = gtk_drop_target_async_get_actions(
    this.raw.asInstanceOf
  )

  def getFormats(): Ptr[GdkContentFormats] = gtk_drop_target_async_get_formats(
    this.raw.asInstanceOf
  )

  def rejectDrop(drop: Drop): Unit = gtk_drop_target_async_reject_drop(
    this.raw.asInstanceOf,
    drop.getUnsafeRawPointer().asInstanceOf
  )

  def setActions(actions: GdkDragAction): Unit =
    gtk_drop_target_async_set_actions(this.raw.asInstanceOf, actions)

  def setFormats(formats: Ptr[GdkContentFormats]): Unit =
    gtk_drop_target_async_set_formats(this.raw.asInstanceOf, formats)

end DropTargetAsync

object DropTargetAsync:
  def apply(
      formats: Ptr[GdkContentFormats],
      actions: GdkDragAction
  ): DropTargetAsync = new DropTargetAsync(
    gtk_drop_target_async_new(formats, actions).asInstanceOf
  )
end DropTargetAsync
