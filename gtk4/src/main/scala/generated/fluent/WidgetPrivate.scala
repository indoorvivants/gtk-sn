package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkWidgetPrivate

class WidgetPrivate private[gnome] (raw: Ptr[GtkWidgetPrivate]):

  def getUnsafeRawPointer(): Ptr[GtkWidgetPrivate] = this.raw
end WidgetPrivate

object WidgetPrivate:
  def fromRaw(ptr: Ptr[GtkWidgetPrivate]): WidgetPrivate = new WidgetPrivate(
    ptr
  )
end WidgetPrivate
