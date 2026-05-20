package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.IMContextClass
import sn.gnome.gtk4.internal.GtkIMMulticontextClass

class IMMulticontextClass private[gnome] (raw: Ptr[GtkIMMulticontextClass]):

  def getUnsafeRawPointer(): Ptr[GtkIMMulticontextClass] = this.raw

  def parentClass: sn.gnome.gtk4.IMContextClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkIMContextClass]
  @annotation.compileTimeOnly("[field _gtk_reserved1]: Field is missing <type>")
  private def GtkReserved1__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved2]: Field is missing <type>")
  private def GtkReserved2__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved3]: Field is missing <type>")
  private def GtkReserved3__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved4]: Field is missing <type>")
  private def GtkReserved4__ = ???
end IMMulticontextClass

object IMMulticontextClass:
  def fromRaw(ptr: Ptr[GtkIMMulticontextClass]): IMMulticontextClass =
    new IMMulticontextClass(ptr)
end IMMulticontextClass
