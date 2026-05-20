package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkMediaStreamClass

class MediaStreamClass private[gnome] (raw: Ptr[GtkMediaStreamClass]):

  def getUnsafeRawPointer(): Ptr[GtkMediaStreamClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field play]: Field is missing <type>")
  private def play__ = ???
  @annotation.compileTimeOnly("[field pause]: Field is missing <type>")
  private def pause__ = ???
  @annotation.compileTimeOnly("[field seek]: Field is missing <type>")
  private def seek__ = ???
  @annotation.compileTimeOnly("[field update_audio]: Field is missing <type>")
  private def updateAudio__ = ???
  @annotation.compileTimeOnly("[field realize]: Field is missing <type>")
  private def realize__ = ???
  @annotation.compileTimeOnly("[field unrealize]: Field is missing <type>")
  private def unrealize__ = ???
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
end MediaStreamClass

object MediaStreamClass:
  def fromRaw(ptr: Ptr[GtkMediaStreamClass]): MediaStreamClass =
    new MediaStreamClass(ptr)
end MediaStreamClass
