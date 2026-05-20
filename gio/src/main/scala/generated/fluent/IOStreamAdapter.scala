package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GIOStreamAdapter

class IOStreamAdapter private[gnome] (raw: Ptr[GIOStreamAdapter]):

  def getUnsafeRawPointer(): Ptr[GIOStreamAdapter] = this.raw
end IOStreamAdapter

object IOStreamAdapter:
  def fromRaw(ptr: Ptr[GIOStreamAdapter]): IOStreamAdapter =
    new IOStreamAdapter(ptr)
end IOStreamAdapter
