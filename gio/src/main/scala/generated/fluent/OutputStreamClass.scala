package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GOutputStreamClass
import sn.gnome.gobject.ObjectClass

class OutputStreamClass private[gnome] (raw: Ptr[GOutputStreamClass]):

  def getUnsafeRawPointer(): Ptr[GOutputStreamClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field write_fn]: Field is missing <type>")
  private def writeFn__ = ???
  @annotation.compileTimeOnly("[field splice]: Field is missing <type>")
  private def splice__ = ???
  @annotation.compileTimeOnly("[field flush]: Field is missing <type>")
  private def flush__ = ???
  @annotation.compileTimeOnly("[field close_fn]: Field is missing <type>")
  private def closeFn__ = ???
  @annotation.compileTimeOnly("[field write_async]: Field is missing <type>")
  private def writeAsync__ = ???
  @annotation.compileTimeOnly("[field write_finish]: Field is missing <type>")
  private def writeFinish__ = ???
  @annotation.compileTimeOnly("[field splice_async]: Field is missing <type>")
  private def spliceAsync__ = ???
  @annotation.compileTimeOnly("[field splice_finish]: Field is missing <type>")
  private def spliceFinish__ = ???
  @annotation.compileTimeOnly("[field flush_async]: Field is missing <type>")
  private def flushAsync__ = ???
  @annotation.compileTimeOnly("[field flush_finish]: Field is missing <type>")
  private def flushFinish__ = ???
  @annotation.compileTimeOnly("[field close_async]: Field is missing <type>")
  private def closeAsync__ = ???
  @annotation.compileTimeOnly("[field close_finish]: Field is missing <type>")
  private def closeFinish__ = ???
  @annotation.compileTimeOnly("[field writev_fn]: Field is missing <type>")
  private def writevFn__ = ???
  @annotation.compileTimeOnly("[field writev_async]: Field is missing <type>")
  private def writevAsync__ = ???
  @annotation.compileTimeOnly("[field writev_finish]: Field is missing <type>")
  private def writevFinish__ = ???
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
end OutputStreamClass

object OutputStreamClass:
  def fromRaw(ptr: Ptr[GOutputStreamClass]): OutputStreamClass =
    new OutputStreamClass(ptr)
end OutputStreamClass
