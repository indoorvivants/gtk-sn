package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDesktopAppInfoLookupIface

/** Interface that is used by backends to associate default handlers with URI
  * schemes.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DesktopAppInfoLookupIface private[gnome] (
    raw: Ptr[GDesktopAppInfoLookupIface]
):

  def getUnsafeRawPointer(): Ptr[GDesktopAppInfoLookupIface] = this.raw

  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    sn.gnome.gobject.TypeInterface.fromRaw((!raw).g_iface)
  @annotation.compileTimeOnly(
    "[field get_default_for_uri_scheme]: Field is missing <type>"
  )
  private def getDefaultForUriScheme__ = ???
end DesktopAppInfoLookupIface
object DesktopAppInfoLookupIface:
  def fromRaw(ptr: Ptr[GDesktopAppInfoLookupIface]): DesktopAppInfoLookupIface =
    new DesktopAppInfoLookupIface(ptr)
end DesktopAppInfoLookupIface
