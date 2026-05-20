package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkToplevelInterface

class ToplevelInterface private[gnome] (raw: Ptr[GdkToplevelInterface]):

  def getUnsafeRawPointer(): Ptr[GdkToplevelInterface] = this.raw
end ToplevelInterface

object ToplevelInterface:
  def fromRaw(ptr: Ptr[GdkToplevelInterface]): ToplevelInterface =
    new ToplevelInterface(ptr)
end ToplevelInterface
