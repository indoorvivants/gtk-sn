package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.ContentProvider
import sn.gnome.gdk4.fluent.Drag
import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gdk4.internal.GdkDragAction
import sn.gnome.gtk4.fluent.GestureSingle
import sn.gnome.gtk4.internal.GtkDragSource

class DragSource(raw: Ptr[GtkDragSource])
    extends GestureSingle(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def dragCancel(): Unit = gtk_drag_source_drag_cancel(this.raw.asInstanceOf)

  def getActions(): GdkDragAction = gtk_drag_source_get_actions(
    this.raw.asInstanceOf
  )

  def getContent(): ContentProvider = new ContentProvider(
    gtk_drag_source_get_content(this.raw.asInstanceOf).asInstanceOf
  )

  def getDrag(): Drag = new Drag(
    gtk_drag_source_get_drag(this.raw.asInstanceOf).asInstanceOf
  )

  def setActions(actions: GdkDragAction): Unit =
    gtk_drag_source_set_actions(this.raw.asInstanceOf, actions)

  def setContent(content: ContentProvider): Unit = gtk_drag_source_set_content(
    this.raw.asInstanceOf,
    content.getUnsafeRawPointer().asInstanceOf
  )

  def setIcon(paintable: Paintable, hot_x: Int, hot_y: Int): Unit =
    gtk_drag_source_set_icon(
      this.raw.asInstanceOf,
      paintable.getUnsafeRawPointer().asInstanceOf,
      hot_x,
      hot_y
    )

end DragSource

object DragSource:
  def apply(): DragSource = new DragSource(gtk_drag_source_new().asInstanceOf)
end DragSource
