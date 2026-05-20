package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.FilterClass
import sn.gnome.gtk4.internal.GtkCustomFilterClass

class CustomFilterClass private[gnome] (raw: Ptr[GtkCustomFilterClass]):

  def getUnsafeRawPointer(): Ptr[GtkCustomFilterClass] = this.raw

  def parentClass: sn.gnome.gtk4.FilterClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkFilterClass]
end CustomFilterClass

object CustomFilterClass:
  def fromRaw(ptr: Ptr[GtkCustomFilterClass]): CustomFilterClass =
    new CustomFilterClass(ptr)
end CustomFilterClass
