package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkVideoClass

class VideoClass private[gnome] (raw: Ptr[GtkVideoClass]):

  def getUnsafeRawPointer(): Ptr[GtkVideoClass] = this.raw

  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
end VideoClass

object VideoClass:
  def fromRaw(ptr: Ptr[GtkVideoClass]): VideoClass = new VideoClass(ptr)
end VideoClass
