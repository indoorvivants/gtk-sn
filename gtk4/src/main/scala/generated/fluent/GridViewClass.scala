package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkGridViewClass

class GridViewClass private[gnome] (raw: Ptr[GtkGridViewClass]):

  def getUnsafeRawPointer(): Ptr[GtkGridViewClass] = this.raw
end GridViewClass

object GridViewClass:
  def fromRaw(ptr: Ptr[GtkGridViewClass]): GridViewClass = new GridViewClass(
    ptr
  )
end GridViewClass
