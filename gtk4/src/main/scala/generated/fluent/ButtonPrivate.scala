package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkButtonPrivate

class ButtonPrivate private[gnome] (raw: Ptr[GtkButtonPrivate]):

  def getUnsafeRawPointer(): Ptr[GtkButtonPrivate] = this.raw
end ButtonPrivate

object ButtonPrivate:
  def fromRaw(ptr: Ptr[GtkButtonPrivate]): ButtonPrivate = new ButtonPrivate(
    ptr
  )
end ButtonPrivate
