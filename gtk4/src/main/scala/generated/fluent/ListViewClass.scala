package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkListViewClass

class ListViewClass private[gnome] (raw: Ptr[GtkListViewClass]):

  def getUnsafeRawPointer(): Ptr[GtkListViewClass] = this.raw
end ListViewClass

object ListViewClass:
  def fromRaw(ptr: Ptr[GtkListViewClass]): ListViewClass = new ListViewClass(
    ptr
  )
end ListViewClass
