package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GResolverPrivate

class ResolverPrivate private[gnome] (raw: Ptr[GResolverPrivate]):

  def getUnsafeRawPointer(): Ptr[GResolverPrivate] = this.raw
end ResolverPrivate

object ResolverPrivate:
  def fromRaw(ptr: Ptr[GResolverPrivate]): ResolverPrivate =
    new ResolverPrivate(ptr)
end ResolverPrivate
