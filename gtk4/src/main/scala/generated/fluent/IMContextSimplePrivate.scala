package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkIMContextSimplePrivate

class IMContextSimplePrivate private[gnome] (
    raw: Ptr[GtkIMContextSimplePrivate]
):

  def getUnsafeRawPointer(): Ptr[GtkIMContextSimplePrivate] = this.raw
end IMContextSimplePrivate

object IMContextSimplePrivate:
  def fromRaw(ptr: Ptr[GtkIMContextSimplePrivate]): IMContextSimplePrivate =
    new IMContextSimplePrivate(ptr)
end IMContextSimplePrivate
