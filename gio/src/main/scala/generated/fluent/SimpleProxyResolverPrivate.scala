package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GSimpleProxyResolverPrivate

class SimpleProxyResolverPrivate private[gnome] (
    raw: Ptr[GSimpleProxyResolverPrivate]
):

  def getUnsafeRawPointer(): Ptr[GSimpleProxyResolverPrivate] = this.raw
end SimpleProxyResolverPrivate

object SimpleProxyResolverPrivate:
  def fromRaw(
      ptr: Ptr[GSimpleProxyResolverPrivate]
  ): SimpleProxyResolverPrivate = new SimpleProxyResolverPrivate(ptr)
end SimpleProxyResolverPrivate
