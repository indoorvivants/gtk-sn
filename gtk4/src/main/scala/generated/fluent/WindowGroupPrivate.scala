package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkWindowGroupPrivate

class WindowGroupPrivate private[gnome] (raw: Ptr[GtkWindowGroupPrivate]):

  def getUnsafeRawPointer(): Ptr[GtkWindowGroupPrivate] = this.raw
end WindowGroupPrivate

object WindowGroupPrivate:
  def fromRaw(ptr: Ptr[GtkWindowGroupPrivate]): WindowGroupPrivate =
    new WindowGroupPrivate(ptr)
end WindowGroupPrivate
