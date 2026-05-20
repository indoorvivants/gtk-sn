package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkRecentManagerPrivate

class RecentManagerPrivate private[gnome] (raw: Ptr[GtkRecentManagerPrivate]):

  def getUnsafeRawPointer(): Ptr[GtkRecentManagerPrivate] = this.raw
end RecentManagerPrivate

object RecentManagerPrivate:
  def fromRaw(ptr: Ptr[GtkRecentManagerPrivate]): RecentManagerPrivate =
    new RecentManagerPrivate(ptr)
end RecentManagerPrivate
