package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkCenterBoxClass

class CenterBoxClass private[gnome] (raw: Ptr[GtkCenterBoxClass]):

  def getUnsafeRawPointer(): Ptr[GtkCenterBoxClass] = this.raw
end CenterBoxClass

object CenterBoxClass:
  def fromRaw(ptr: Ptr[GtkCenterBoxClass]): CenterBoxClass = new CenterBoxClass(
    ptr
  )
end CenterBoxClass
