package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.pango.internal.PangoContextClass

class ContextClass private[gnome] (raw: Ptr[PangoContextClass]):

  def getUnsafeRawPointer(): Ptr[PangoContextClass] = this.raw
end ContextClass

object ContextClass:
  def fromRaw(ptr: Ptr[PangoContextClass]): ContextClass = new ContextClass(ptr)
end ContextClass
