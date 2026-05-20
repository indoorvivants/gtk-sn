package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GInitableIface
import sn.gnome.gobject.TypeInterface

/** Provides an interface for initializing object such that initialization may
  * fail.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class InitableIface private[gnome] (raw: Ptr[GInitableIface]):

  def getUnsafeRawPointer(): Ptr[GInitableIface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field init]: Field is missing <type>")
  private def init__ = ???
end InitableIface

object InitableIface:
  def fromRaw(ptr: Ptr[GInitableIface]): InitableIface = new InitableIface(ptr)
end InitableIface
