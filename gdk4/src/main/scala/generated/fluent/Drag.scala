package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.ContentProvider
import sn.gnome.gdk4.fluent.Device
import sn.gnome.gdk4.fluent.Display
import sn.gnome.gdk4.fluent.Surface
import sn.gnome.gdk4.internal.GdkContentFormats
import sn.gnome.gdk4.internal.GdkDrag
import sn.gnome.gdk4.internal.GdkDragAction
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

class Drag(raw: Ptr[GdkDrag]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def dropDone(success: Boolean): Unit = gdk_drag_drop_done(
    this.raw.asInstanceOf,
    gboolean(gint((if success == true then 1 else 0)))
  )

  def getActions(): GdkDragAction = gdk_drag_get_actions(this.raw.asInstanceOf)

  def getContent(): ContentProvider = new ContentProvider(
    gdk_drag_get_content(this.raw.asInstanceOf).asInstanceOf
  )

  def getDevice(): Device = new Device(
    gdk_drag_get_device(this.raw.asInstanceOf).asInstanceOf
  )

  def getDisplay(): Display = new Display(
    gdk_drag_get_display(this.raw.asInstanceOf).asInstanceOf
  )

  def getDragSurface(): Surface = new Surface(
    gdk_drag_get_drag_surface(this.raw.asInstanceOf).asInstanceOf
  )

  def getFormats(): Ptr[GdkContentFormats] = gdk_drag_get_formats(
    this.raw.asInstanceOf
  )

  def getSelectedAction(): GdkDragAction = gdk_drag_get_selected_action(
    this.raw.asInstanceOf
  )

  def getSurface(): Surface = new Surface(
    gdk_drag_get_surface(this.raw.asInstanceOf).asInstanceOf
  )

  def setHotspot(hot_x: Int, hot_y: Int): Unit =
    gdk_drag_set_hotspot(this.raw.asInstanceOf, hot_x, hot_y)

end Drag
