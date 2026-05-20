package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.FilterClass
import sn.gnome.gtk4.internal.GtkStringFilterClass

class StringFilterClass private[gnome] (raw: Ptr[GtkStringFilterClass]):

  def getUnsafeRawPointer(): Ptr[GtkStringFilterClass] = this.raw

  def parentClass: sn.gnome.gtk4.FilterClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkFilterClass]
end StringFilterClass

object StringFilterClass:
  def fromRaw(ptr: Ptr[GtkStringFilterClass]): StringFilterClass =
    new StringFilterClass(ptr)
end StringFilterClass
