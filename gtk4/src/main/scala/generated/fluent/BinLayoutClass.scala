package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.LayoutManagerClass
import sn.gnome.gtk4.internal.GtkBinLayoutClass

class BinLayoutClass private[gnome] (raw: Ptr[GtkBinLayoutClass]):

  def getUnsafeRawPointer(): Ptr[GtkBinLayoutClass] = this.raw

  def parentClass: sn.gnome.gtk4.LayoutManagerClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkLayoutManagerClass]
end BinLayoutClass

object BinLayoutClass:
  def fromRaw(ptr: Ptr[GtkBinLayoutClass]): BinLayoutClass = new BinLayoutClass(
    ptr
  )
end BinLayoutClass
