package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkTextTagClass

class TextTagClass private[gnome] (raw: Ptr[GtkTextTagClass]):

  def getUnsafeRawPointer(): Ptr[GtkTextTagClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]

end TextTagClass

object TextTagClass:
  def fromRaw(ptr: Ptr[GtkTextTagClass]): TextTagClass = new TextTagClass(ptr)
end TextTagClass
