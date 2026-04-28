package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gpointer
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkDrawingArea
import sn.gnome.gtk4.internal.GtkDrawingAreaDrawFunc

class DrawingArea(raw: Ptr[GtkDrawingArea])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getContentHeight(): Int = gtk_drawing_area_get_content_height(
    this.raw.asInstanceOf
  )

  def getContentWidth(): Int = gtk_drawing_area_get_content_width(
    this.raw.asInstanceOf
  )

  def setContentHeight(height: Int): Unit =
    gtk_drawing_area_set_content_height(this.raw.asInstanceOf, height)

  def setContentWidth(width: Int): Unit =
    gtk_drawing_area_set_content_width(this.raw.asInstanceOf, width)

  def setDrawFunc(
      draw_func: GtkDrawingAreaDrawFunc,
      user_data: Ptr[Byte],
      destroy: GDestroyNotify
  ): Unit = gtk_drawing_area_set_draw_func(
    this.raw.asInstanceOf,
    draw_func,
    gpointer(user_data),
    destroy
  )

end DrawingArea

object DrawingArea:
  def apply(): DrawingArea = new DrawingArea(
    gtk_drawing_area_new().asInstanceOf
  )
end DrawingArea
