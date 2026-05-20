package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkTextMarkClass

class TextMarkClass private[gnome] (raw: Ptr[GtkTextMarkClass]):

  def getUnsafeRawPointer(): Ptr[GtkTextMarkClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]

end TextMarkClass

object TextMarkClass:
  def fromRaw(ptr: Ptr[GtkTextMarkClass]): TextMarkClass = new TextMarkClass(
    ptr
  )
end TextMarkClass
