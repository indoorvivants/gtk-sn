package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkListBaseClass

class ListBaseClass private[gnome] (raw: Ptr[GtkListBaseClass]):

  def getUnsafeRawPointer(): Ptr[GtkListBaseClass] = this.raw
end ListBaseClass

object ListBaseClass:
  def fromRaw(ptr: Ptr[GtkListBaseClass]): ListBaseClass = new ListBaseClass(
    ptr
  )
end ListBaseClass
