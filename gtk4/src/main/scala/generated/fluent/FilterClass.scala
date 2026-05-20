package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkFilterClass

class FilterClass private[gnome] (raw: Ptr[GtkFilterClass]):

  def getUnsafeRawPointer(): Ptr[GtkFilterClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field match]: Field is missing <type>")
  private def match__ = ???
  @annotation.compileTimeOnly("[field get_strictness]: Field is missing <type>")
  private def getStrictness__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved1]: Field is missing <type>")
  private def GtkReserved1__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved2]: Field is missing <type>")
  private def GtkReserved2__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved3]: Field is missing <type>")
  private def GtkReserved3__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved4]: Field is missing <type>")
  private def GtkReserved4__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved5]: Field is missing <type>")
  private def GtkReserved5__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved6]: Field is missing <type>")
  private def GtkReserved6__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved7]: Field is missing <type>")
  private def GtkReserved7__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved8]: Field is missing <type>")
  private def GtkReserved8__ = ???
end FilterClass

object FilterClass:
  def fromRaw(ptr: Ptr[GtkFilterClass]): FilterClass = new FilterClass(ptr)
end FilterClass
