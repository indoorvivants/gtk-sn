package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkCssProviderPrivate

class CssProviderPrivate private[gnome] (raw: Ptr[GtkCssProviderPrivate]):

  def getUnsafeRawPointer(): Ptr[GtkCssProviderPrivate] = this.raw
end CssProviderPrivate

object CssProviderPrivate:
  def fromRaw(ptr: Ptr[GtkCssProviderPrivate]): CssProviderPrivate =
    new CssProviderPrivate(ptr)
end CssProviderPrivate
