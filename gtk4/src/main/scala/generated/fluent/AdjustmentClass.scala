package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.InitiallyUnownedClass
import sn.gnome.gtk4.internal.GtkAdjustmentClass

class AdjustmentClass private[gnome] (raw: Ptr[GtkAdjustmentClass]):

  def getUnsafeRawPointer(): Ptr[GtkAdjustmentClass] = this.raw

  def parentClass: sn.gnome.gobject.InitiallyUnownedClass /* None */ =
    (!raw).parent_class
      .asInstanceOf[_root_.sn.gnome.gobject.internal.GInitiallyUnownedClass]
  @annotation.compileTimeOnly("[field changed]: Field is missing <type>")
  private def changed__ = ???
  @annotation.compileTimeOnly("[field value_changed]: Field is missing <type>")
  private def valueChanged__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved1]: Field is missing <type>")
  private def GtkReserved1__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved2]: Field is missing <type>")
  private def GtkReserved2__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved3]: Field is missing <type>")
  private def GtkReserved3__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved4]: Field is missing <type>")
  private def GtkReserved4__ = ???
end AdjustmentClass

object AdjustmentClass:
  def fromRaw(ptr: Ptr[GtkAdjustmentClass]): AdjustmentClass =
    new AdjustmentClass(ptr)
end AdjustmentClass
