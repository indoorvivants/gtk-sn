package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkFontDialogButtonClass

class FontDialogButtonClass private[gnome] (raw: Ptr[GtkFontDialogButtonClass]):

  def getUnsafeRawPointer(): Ptr[GtkFontDialogButtonClass] = this.raw

  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
end FontDialogButtonClass

object FontDialogButtonClass:
  def fromRaw(ptr: Ptr[GtkFontDialogButtonClass]): FontDialogButtonClass =
    new FontDialogButtonClass(ptr)
end FontDialogButtonClass
