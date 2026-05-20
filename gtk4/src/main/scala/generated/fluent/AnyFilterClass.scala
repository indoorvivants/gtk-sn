package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkAnyFilterClass

class AnyFilterClass private[gnome] (raw: Ptr[GtkAnyFilterClass]):

  def getUnsafeRawPointer(): Ptr[GtkAnyFilterClass] = this.raw
end AnyFilterClass

object AnyFilterClass:
  def fromRaw(ptr: Ptr[GtkAnyFilterClass]): AnyFilterClass = new AnyFilterClass(
    ptr
  )
end AnyFilterClass
