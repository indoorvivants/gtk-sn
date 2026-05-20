package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GInputStreamClass
import sn.gnome.gobject.ObjectClass

class InputStreamClass private[gnome] (raw: Ptr[GInputStreamClass]):

  def getUnsafeRawPointer(): Ptr[GInputStreamClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field read_fn]: Field is missing <type>")
  private def readFn__ = ???
  @annotation.compileTimeOnly("[field skip]: Field is missing <type>")
  private def skip__ = ???
  @annotation.compileTimeOnly("[field close_fn]: Field is missing <type>")
  private def closeFn__ = ???
  @annotation.compileTimeOnly("[field read_async]: Field is missing <type>")
  private def readAsync__ = ???
  @annotation.compileTimeOnly("[field read_finish]: Field is missing <type>")
  private def readFinish__ = ???
  @annotation.compileTimeOnly("[field skip_async]: Field is missing <type>")
  private def skipAsync__ = ???
  @annotation.compileTimeOnly("[field skip_finish]: Field is missing <type>")
  private def skipFinish__ = ???
  @annotation.compileTimeOnly("[field close_async]: Field is missing <type>")
  private def closeAsync__ = ???
  @annotation.compileTimeOnly("[field close_finish]: Field is missing <type>")
  private def closeFinish__ = ???
  @annotation.compileTimeOnly("[field _g_reserved1]: Field is missing <type>")
  private def GReserved1__ = ???
  @annotation.compileTimeOnly("[field _g_reserved2]: Field is missing <type>")
  private def GReserved2__ = ???
  @annotation.compileTimeOnly("[field _g_reserved3]: Field is missing <type>")
  private def GReserved3__ = ???
  @annotation.compileTimeOnly("[field _g_reserved4]: Field is missing <type>")
  private def GReserved4__ = ???
  @annotation.compileTimeOnly("[field _g_reserved5]: Field is missing <type>")
  private def GReserved5__ = ???
end InputStreamClass

object InputStreamClass:
  def fromRaw(ptr: Ptr[GInputStreamClass]): InputStreamClass =
    new InputStreamClass(ptr)
end InputStreamClass
