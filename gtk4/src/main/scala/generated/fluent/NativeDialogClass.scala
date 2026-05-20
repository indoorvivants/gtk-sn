package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkNativeDialogClass

/** Class structure for `GtkNativeDialog`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class NativeDialogClass private[gnome] (raw: Ptr[GtkNativeDialogClass]):

  def getUnsafeRawPointer(): Ptr[GtkNativeDialogClass] = this.raw

  @annotation.compileTimeOnly("[field response]: Field is missing <type>")
  private def response__ = ???
  @annotation.compileTimeOnly("[field show]: Field is missing <type>")
  private def show__ = ???
  @annotation.compileTimeOnly("[field hide]: Field is missing <type>")
  private def hide__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved1]: Field is missing <type>")
  private def GtkReserved1__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved2]: Field is missing <type>")
  private def GtkReserved2__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved3]: Field is missing <type>")
  private def GtkReserved3__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved4]: Field is missing <type>")
  private def GtkReserved4__ = ???
end NativeDialogClass

object NativeDialogClass:
  def fromRaw(ptr: Ptr[GtkNativeDialogClass]): NativeDialogClass =
    new NativeDialogClass(ptr)
end NativeDialogClass
