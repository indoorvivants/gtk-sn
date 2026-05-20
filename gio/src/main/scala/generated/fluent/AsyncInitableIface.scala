package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GAsyncInitableIface
import sn.gnome.gobject.TypeInterface

/** Provides an interface for asynchronous initializing object such that
  * initialization may fail.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AsyncInitableIface private[gnome] (raw: Ptr[GAsyncInitableIface]):

  def getUnsafeRawPointer(): Ptr[GAsyncInitableIface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field init_async]: Field is missing <type>")
  private def initAsync__ = ???
  @annotation.compileTimeOnly("[field init_finish]: Field is missing <type>")
  private def initFinish__ = ???
end AsyncInitableIface

object AsyncInitableIface:
  def fromRaw(ptr: Ptr[GAsyncInitableIface]): AsyncInitableIface =
    new AsyncInitableIface(ptr)
end AsyncInitableIface
