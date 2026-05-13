package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait DesktopAppInfoLookup:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Gets the default application for launching applications using this URI
    * scheme for a particular #GDesktopAppInfoLookup implementation.
    *
    * The #GDesktopAppInfoLookup interface and this function is used to
    * implement g_app_info_get_default_for_uri_scheme() backends in a GIO
    * module. There is no reason for applications to use it directly.
    * Applications should use g_app_info_get_default_for_uri_scheme().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_default_for_uri_scheme]: Method g_desktop_app_info_lookup_get_default_for_uri_scheme has no target types"
  )
  private def getDefaultForUriScheme__ = ???

end DesktopAppInfoLookup

object DesktopAppInfoLookup:
  class Abstract(raw: Ptr[Byte]) extends DesktopAppInfoLookup:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end DesktopAppInfoLookup
