package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Device
import sn.gnome.gdk4.fluent.Display
import sn.gnome.gdk4.fluent.Drag
import sn.gnome.gdk4.fluent.Surface
import sn.gnome.gdk4.internal.GdkContentFormats
import sn.gnome.gdk4.internal.GdkDragAction
import sn.gnome.gdk4.internal.GdkDrop
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.internal.GValue

class Drop(raw: Ptr[GdkDrop]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def finish(action: GdkDragAction): Unit =
    gdk_drop_finish(this.raw.asInstanceOf, action)

  def getActions(): GdkDragAction = gdk_drop_get_actions(this.raw.asInstanceOf)

  def getDevice(): Device = new Device(
    gdk_drop_get_device(this.raw.asInstanceOf).asInstanceOf
  )

  def getDisplay(): Display = new Display(
    gdk_drop_get_display(this.raw.asInstanceOf).asInstanceOf
  )

  def getDrag(): Drag = new Drag(
    gdk_drop_get_drag(this.raw.asInstanceOf).asInstanceOf
  )

  def getFormats(): Ptr[GdkContentFormats] = gdk_drop_get_formats(
    this.raw.asInstanceOf
  )

  def getSurface(): Surface = new Surface(
    gdk_drop_get_surface(this.raw.asInstanceOf).asInstanceOf
  )

  // Method read_async contains an array parameter, which is not supported yet

  // Method read_finish contains an OUT parameter, which is not supported yet

  def readValueAsync(
      `type`: GType,
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gdk_drop_read_value_async(
    this.raw.asInstanceOf,
    `type`,
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def readValueFinish(result: AsyncResult): GResult[Ptr[GValue]] =
    GResult.wrap(__errorPtr =>
      gdk_drop_read_value_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      )
    )

  def status(actions: GdkDragAction, preferred: GdkDragAction): Unit =
    gdk_drop_status(this.raw.asInstanceOf, actions, preferred)

end Drop
