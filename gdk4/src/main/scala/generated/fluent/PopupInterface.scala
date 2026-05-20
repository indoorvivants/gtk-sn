package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkPopupInterface

class PopupInterface private[gnome] (raw: Ptr[GdkPopupInterface]):

  def getUnsafeRawPointer(): Ptr[GdkPopupInterface] = this.raw
end PopupInterface

object PopupInterface:
  def fromRaw(ptr: Ptr[GdkPopupInterface]): PopupInterface = new PopupInterface(
    ptr
  )
end PopupInterface
