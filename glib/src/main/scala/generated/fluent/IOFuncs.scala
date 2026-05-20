package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GIOFuncs

/** A table of functions used to handle different types of #GIOChannel in a
  * generic way.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class IOFuncs private[gnome] (raw: Ptr[GIOFuncs]):

  def getUnsafeRawPointer(): Ptr[GIOFuncs] = this.raw
  @annotation.compileTimeOnly("[field io_read]: Field is missing <type>")
  private def ioRead__ = ???
  @annotation.compileTimeOnly("[field io_write]: Field is missing <type>")
  private def ioWrite__ = ???
  @annotation.compileTimeOnly("[field io_seek]: Field is missing <type>")
  private def ioSeek__ = ???
  @annotation.compileTimeOnly("[field io_close]: Field is missing <type>")
  private def ioClose__ = ???
  @annotation.compileTimeOnly(
    "[field io_create_watch]: Field is missing <type>"
  )
  private def ioCreateWatch__ = ???
  @annotation.compileTimeOnly("[field io_free]: Field is missing <type>")
  private def ioFree__ = ???
  @annotation.compileTimeOnly("[field io_set_flags]: Field is missing <type>")
  private def ioSetFlags__ = ???
  @annotation.compileTimeOnly("[field io_get_flags]: Field is missing <type>")
  private def ioGetFlags__ = ???
end IOFuncs

object IOFuncs:
  def fromRaw(ptr: Ptr[GIOFuncs]): IOFuncs = new IOFuncs(ptr)
end IOFuncs
