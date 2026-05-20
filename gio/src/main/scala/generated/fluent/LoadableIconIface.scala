package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GLoadableIconIface
import sn.gnome.gobject.TypeInterface

/** Interface for icons that can be loaded as a stream.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class LoadableIconIface private[gnome] (raw: Ptr[GLoadableIconIface]):

  def getUnsafeRawPointer(): Ptr[GLoadableIconIface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field load]: Field is missing <type>")
  private def load__ = ???
  @annotation.compileTimeOnly("[field load_async]: Field is missing <type>")
  private def loadAsync__ = ???
  @annotation.compileTimeOnly("[field load_finish]: Field is missing <type>")
  private def loadFinish__ = ???
end LoadableIconIface

object LoadableIconIface:
  def fromRaw(ptr: Ptr[GLoadableIconIface]): LoadableIconIface =
    new LoadableIconIface(ptr)
end LoadableIconIface
