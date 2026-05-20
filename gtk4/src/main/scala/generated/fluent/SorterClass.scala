package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkSorterClass

/** The virtual table for `GtkSorter`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SorterClass private[gnome] (raw: Ptr[GtkSorterClass]):

  def getUnsafeRawPointer(): Ptr[GtkSorterClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field compare]: Field is missing <type>")
  private def compare__ = ???
  @annotation.compileTimeOnly("[field get_order]: Field is missing <type>")
  private def getOrder__ = ???
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
end SorterClass

object SorterClass:
  def fromRaw(ptr: Ptr[GtkSorterClass]): SorterClass = new SorterClass(ptr)
end SorterClass
