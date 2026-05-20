package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkATContextClass

class ATContextClass private[gnome] (raw: Ptr[GtkATContextClass]):

  def getUnsafeRawPointer(): Ptr[GtkATContextClass] = this.raw
end ATContextClass

object ATContextClass:
  def fromRaw(ptr: Ptr[GtkATContextClass]): ATContextClass = new ATContextClass(
    ptr
  )
end ATContextClass
