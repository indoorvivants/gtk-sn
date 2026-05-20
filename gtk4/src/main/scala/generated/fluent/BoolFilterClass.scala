package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.FilterClass
import sn.gnome.gtk4.internal.GtkBoolFilterClass

class BoolFilterClass private[gnome] (raw: Ptr[GtkBoolFilterClass]):

  def getUnsafeRawPointer(): Ptr[GtkBoolFilterClass] = this.raw

  def parentClass: sn.gnome.gtk4.FilterClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkFilterClass]
end BoolFilterClass

object BoolFilterClass:
  def fromRaw(ptr: Ptr[GtkBoolFilterClass]): BoolFilterClass =
    new BoolFilterClass(ptr)
end BoolFilterClass
