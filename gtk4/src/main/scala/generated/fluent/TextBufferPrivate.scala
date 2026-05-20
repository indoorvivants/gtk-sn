package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkTextBufferPrivate

class TextBufferPrivate private[gnome] (raw: Ptr[GtkTextBufferPrivate]):

  def getUnsafeRawPointer(): Ptr[GtkTextBufferPrivate] = this.raw
end TextBufferPrivate

object TextBufferPrivate:
  def fromRaw(ptr: Ptr[GtkTextBufferPrivate]): TextBufferPrivate =
    new TextBufferPrivate(ptr)
end TextBufferPrivate
