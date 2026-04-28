package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Drop
import sn.gnome.gdk4.internal.GdkContentFormats
import sn.gnome.gdk4.internal.GdkDragAction
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.internal.GValue
import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.internal.GtkDropTarget

class DropTarget(raw: Ptr[GtkDropTarget])
    extends EventController(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getActions(): GdkDragAction = gtk_drop_target_get_actions(
    this.raw.asInstanceOf
  )

  def getCurrentDrop(): Drop = new Drop(
    gtk_drop_target_get_current_drop(this.raw.asInstanceOf).asInstanceOf
  )

  def getDrop(): Drop = new Drop(
    gtk_drop_target_get_drop(this.raw.asInstanceOf).asInstanceOf
  )

  def getFormats(): Ptr[GdkContentFormats] = gtk_drop_target_get_formats(
    this.raw.asInstanceOf
  )

  // Method get_gtypes contains an OUT parameter, which is not supported yet

  def getPreload(): Boolean =
    gtk_drop_target_get_preload(this.raw.asInstanceOf).value.!=(0)

  def getValue(): Ptr[GValue] = gtk_drop_target_get_value(this.raw.asInstanceOf)

  def reject(): Unit = gtk_drop_target_reject(this.raw.asInstanceOf)

  def setActions(actions: GdkDragAction): Unit =
    gtk_drop_target_set_actions(this.raw.asInstanceOf, actions)

  // Method set_gtypes contains an array parameter, which is not supported yet

  def setPreload(preload: Boolean): Unit = gtk_drop_target_set_preload(
    this.raw.asInstanceOf,
    gboolean(gint((if preload == true then 1 else 0)))
  )

end DropTarget

object DropTarget:
  def apply(`type`: GType, actions: GdkDragAction): DropTarget = new DropTarget(
    gtk_drop_target_new(`type`, actions).asInstanceOf
  )
end DropTarget
