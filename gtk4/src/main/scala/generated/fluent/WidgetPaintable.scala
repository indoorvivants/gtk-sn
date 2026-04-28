package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkWidgetPaintable

class WidgetPaintable(raw: Ptr[GtkWidgetPaintable])
    extends Object(raw.asInstanceOf),
      Paintable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getWidget(): Widget = new Widget(
    gtk_widget_paintable_get_widget(this.raw.asInstanceOf).asInstanceOf
  )

  def setWidget(widget: Widget): Unit = gtk_widget_paintable_set_widget(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  )

end WidgetPaintable

object WidgetPaintable:
  def apply(widget: Widget): WidgetPaintable = new WidgetPaintable(
    gtk_widget_paintable_new(
      widget.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end WidgetPaintable
