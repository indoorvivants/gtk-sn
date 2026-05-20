package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkPictureClass

class PictureClass private[gnome] (raw: Ptr[GtkPictureClass]):

  def getUnsafeRawPointer(): Ptr[GtkPictureClass] = this.raw

  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
end PictureClass

object PictureClass:
  def fromRaw(ptr: Ptr[GtkPictureClass]): PictureClass = new PictureClass(ptr)
end PictureClass
