package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.MountOperationClass
import sn.gnome.gtk4.internal.GtkMountOperationClass

class MountOperationClass private[gnome] (raw: Ptr[GtkMountOperationClass]):

  def getUnsafeRawPointer(): Ptr[GtkMountOperationClass] = this.raw

  /** The parent class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gio.MountOperationClass /* None */ =
    (!raw).parent_class
      .asInstanceOf[_root_.sn.gnome.gio.internal.GMountOperationClass]
  @annotation.compileTimeOnly("[field _gtk_reserved1]: Field is missing <type>")
  private def GtkReserved1__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved2]: Field is missing <type>")
  private def GtkReserved2__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved3]: Field is missing <type>")
  private def GtkReserved3__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved4]: Field is missing <type>")
  private def GtkReserved4__ = ???
end MountOperationClass

object MountOperationClass:
  def fromRaw(ptr: Ptr[GtkMountOperationClass]): MountOperationClass =
    new MountOperationClass(ptr)
end MountOperationClass
