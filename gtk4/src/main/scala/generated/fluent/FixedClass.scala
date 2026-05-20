package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkFixedClass

class FixedClass private[gnome] (raw: Ptr[GtkFixedClass]):

  def getUnsafeRawPointer(): Ptr[GtkFixedClass] = this.raw

  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]

end FixedClass

object FixedClass:
  def fromRaw(ptr: Ptr[GtkFixedClass]): FixedClass = new FixedClass(ptr)
end FixedClass
