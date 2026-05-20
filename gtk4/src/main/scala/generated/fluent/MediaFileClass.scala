package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.MediaStreamClass
import sn.gnome.gtk4.internal.GtkMediaFileClass

class MediaFileClass private[gnome] (raw: Ptr[GtkMediaFileClass]):

  def getUnsafeRawPointer(): Ptr[GtkMediaFileClass] = this.raw

  def parentClass: sn.gnome.gtk4.MediaStreamClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkMediaStreamClass]
  @annotation.compileTimeOnly("[field open]: Field is missing <type>")
  private def open__ = ???
  @annotation.compileTimeOnly("[field close]: Field is missing <type>")
  private def close__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved1]: Field is missing <type>")
  private def GtkReserved1__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved2]: Field is missing <type>")
  private def GtkReserved2__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved3]: Field is missing <type>")
  private def GtkReserved3__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved4]: Field is missing <type>")
  private def GtkReserved4__ = ???
end MediaFileClass

object MediaFileClass:
  def fromRaw(ptr: Ptr[GtkMediaFileClass]): MediaFileClass = new MediaFileClass(
    ptr
  )
end MediaFileClass
