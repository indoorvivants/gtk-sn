package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkWidgetPaintableClass

class WidgetPaintableClass private[gnome] (raw: Ptr[GtkWidgetPaintableClass]):

  def getUnsafeRawPointer(): Ptr[GtkWidgetPaintableClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end WidgetPaintableClass

object WidgetPaintableClass:
  def fromRaw(ptr: Ptr[GtkWidgetPaintableClass]): WidgetPaintableClass =
    new WidgetPaintableClass(ptr)
end WidgetPaintableClass
