package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkIMMulticontextPrivate

class IMMulticontextPrivate private[gnome] (raw: Ptr[GtkIMMulticontextPrivate]):

  def getUnsafeRawPointer(): Ptr[GtkIMMulticontextPrivate] = this.raw
end IMMulticontextPrivate

object IMMulticontextPrivate:
  def fromRaw(ptr: Ptr[GtkIMMulticontextPrivate]): IMMulticontextPrivate =
    new IMMulticontextPrivate(ptr)
end IMMulticontextPrivate
