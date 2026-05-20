package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.pango.internal.PangoLayoutClass

class LayoutClass private[gnome] (raw: Ptr[PangoLayoutClass]):

  def getUnsafeRawPointer(): Ptr[PangoLayoutClass] = this.raw
end LayoutClass

object LayoutClass:
  def fromRaw(ptr: Ptr[PangoLayoutClass]): LayoutClass = new LayoutClass(ptr)
end LayoutClass
