package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkCssProviderClass

class CssProviderClass private[gnome] (raw: Ptr[GtkCssProviderClass]):

  def getUnsafeRawPointer(): Ptr[GtkCssProviderClass] = this.raw
end CssProviderClass

object CssProviderClass:
  def fromRaw(ptr: Ptr[GtkCssProviderClass]): CssProviderClass =
    new CssProviderClass(ptr)
end CssProviderClass
