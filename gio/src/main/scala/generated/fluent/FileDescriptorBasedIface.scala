package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GFileDescriptorBasedIface

/** An interface for file descriptor based io objects.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FileDescriptorBasedIface private[gnome] (
    raw: Ptr[GFileDescriptorBasedIface]
):

  def getUnsafeRawPointer(): Ptr[GFileDescriptorBasedIface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    sn.gnome.gobject.TypeInterface.fromRaw((!raw).g_iface)
  @annotation.compileTimeOnly("[field get_fd]: Field is missing <type>")
  private def getFd__ = ???
end FileDescriptorBasedIface
object FileDescriptorBasedIface:
  def fromRaw(ptr: Ptr[GFileDescriptorBasedIface]): FileDescriptorBasedIface =
    new FileDescriptorBasedIface(ptr)
end FileDescriptorBasedIface
