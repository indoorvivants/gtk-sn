package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GIOStreamClass
import sn.gnome.gobject.ObjectClass

class IOStreamClass private[gnome] (raw: Ptr[GIOStreamClass]):

  def getUnsafeRawPointer(): Ptr[GIOStreamClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly(
    "[field get_input_stream]: Field is missing <type>"
  )
  private def getInputStream__ = ???
  @annotation.compileTimeOnly(
    "[field get_output_stream]: Field is missing <type>"
  )
  private def getOutputStream__ = ???
  @annotation.compileTimeOnly("[field close_fn]: Field is missing <type>")
  private def closeFn__ = ???
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
  @annotation.compileTimeOnly("[field _g_reserved6]: Field is missing <type>")
  private def GReserved6__ = ???
  @annotation.compileTimeOnly("[field _g_reserved7]: Field is missing <type>")
  private def GReserved7__ = ???
  @annotation.compileTimeOnly("[field _g_reserved8]: Field is missing <type>")
  private def GReserved8__ = ???
  @annotation.compileTimeOnly("[field _g_reserved9]: Field is missing <type>")
  private def GReserved9__ = ???
  @annotation.compileTimeOnly("[field _g_reserved10]: Field is missing <type>")
  private def GReserved10__ = ???
end IOStreamClass

object IOStreamClass:
  def fromRaw(ptr: Ptr[GIOStreamClass]): IOStreamClass = new IOStreamClass(ptr)
end IOStreamClass
