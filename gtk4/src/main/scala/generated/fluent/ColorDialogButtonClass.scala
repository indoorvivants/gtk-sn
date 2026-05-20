package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkColorDialogButtonClass

class ColorDialogButtonClass private[gnome] (
    raw: Ptr[GtkColorDialogButtonClass]
):

  def getUnsafeRawPointer(): Ptr[GtkColorDialogButtonClass] = this.raw

  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
end ColorDialogButtonClass

object ColorDialogButtonClass:
  def fromRaw(ptr: Ptr[GtkColorDialogButtonClass]): ColorDialogButtonClass =
    new ColorDialogButtonClass(ptr)
end ColorDialogButtonClass
