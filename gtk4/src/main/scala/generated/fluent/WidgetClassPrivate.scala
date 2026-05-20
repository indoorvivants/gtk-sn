package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkWidgetClassPrivate

class WidgetClassPrivate private[gnome] (raw: Ptr[GtkWidgetClassPrivate]):

  def getUnsafeRawPointer(): Ptr[GtkWidgetClassPrivate] = this.raw
end WidgetClassPrivate

object WidgetClassPrivate:
  def fromRaw(ptr: Ptr[GtkWidgetClassPrivate]): WidgetClassPrivate =
    new WidgetClassPrivate(ptr)
end WidgetClassPrivate
