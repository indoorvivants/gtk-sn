package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkCssStyleChange

class CssStyleChange private[gnome] (raw: Ptr[GtkCssStyleChange]):

  def getUnsafeRawPointer(): Ptr[GtkCssStyleChange] = this.raw
end CssStyleChange

object CssStyleChange:
  def fromRaw(ptr: Ptr[GtkCssStyleChange]): CssStyleChange = new CssStyleChange(
    ptr
  )
end CssStyleChange
