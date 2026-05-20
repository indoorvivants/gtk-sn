package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkTextChildAnchorClass

class TextChildAnchorClass private[gnome] (raw: Ptr[GtkTextChildAnchorClass]):

  def getUnsafeRawPointer(): Ptr[GtkTextChildAnchorClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field _gtk_reserved1]: Field is missing <type>")
  private def GtkReserved1__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved2]: Field is missing <type>")
  private def GtkReserved2__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved3]: Field is missing <type>")
  private def GtkReserved3__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved4]: Field is missing <type>")
  private def GtkReserved4__ = ???
end TextChildAnchorClass

object TextChildAnchorClass:
  def fromRaw(ptr: Ptr[GtkTextChildAnchorClass]): TextChildAnchorClass =
    new TextChildAnchorClass(ptr)
end TextChildAnchorClass
