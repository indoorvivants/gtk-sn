package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.InetAddress
import sn.gnome.gio.internal.GInetAddress
import sn.gnome.gio.internal.GSocketFamily
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gsize
import sn.gnome.glib.internal.guint8
import sn.gnome.gobject.fluent.Object

class InetAddress(raw: Ptr[GInetAddress]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def equal(other_address: InetAddress): Boolean = g_inet_address_equal(
    this.raw.asInstanceOf,
    other_address.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def getFamily(): GSocketFamily = g_inet_address_get_family(
    this.raw.asInstanceOf
  )

  def getIsAny(): Boolean =
    g_inet_address_get_is_any(this.raw.asInstanceOf).value.!=(0)

  def getIsLinkLocal(): Boolean =
    g_inet_address_get_is_link_local(this.raw.asInstanceOf).value.!=(0)

  def getIsLoopback(): Boolean =
    g_inet_address_get_is_loopback(this.raw.asInstanceOf).value.!=(0)

  def getIsMcGlobal(): Boolean =
    g_inet_address_get_is_mc_global(this.raw.asInstanceOf).value.!=(0)

  def getIsMcLinkLocal(): Boolean =
    g_inet_address_get_is_mc_link_local(this.raw.asInstanceOf).value.!=(0)

  def getIsMcNodeLocal(): Boolean =
    g_inet_address_get_is_mc_node_local(this.raw.asInstanceOf).value.!=(0)

  def getIsMcOrgLocal(): Boolean =
    g_inet_address_get_is_mc_org_local(this.raw.asInstanceOf).value.!=(0)

  def getIsMcSiteLocal(): Boolean =
    g_inet_address_get_is_mc_site_local(this.raw.asInstanceOf).value.!=(0)

  def getIsMulticast(): Boolean =
    g_inet_address_get_is_multicast(this.raw.asInstanceOf).value.!=(0)

  def getIsSiteLocal(): Boolean =
    g_inet_address_get_is_site_local(this.raw.asInstanceOf).value.!=(0)

  def getNativeSize(): CUnsignedLongInt = g_inet_address_get_native_size(
    this.raw.asInstanceOf
  ).value

  def toBytes(): Ptr[guint8] = g_inet_address_to_bytes(this.raw.asInstanceOf)

  def toString()(using Zone): String = fromCString(
    g_inet_address_to_string(this.raw.asInstanceOf).asInstanceOf
  )

end InetAddress

object InetAddress:
  def any(family: GSocketFamily): InetAddress = new InetAddress(
    g_inet_address_new_any(family).asInstanceOf
  )
  def fromString(string: String | CString)(using Zone): InetAddress =
    new InetAddress(
      g_inet_address_new_from_string(
        __sn_extract_string(string).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )
  def loopback(family: GSocketFamily): InetAddress = new InetAddress(
    g_inet_address_new_loopback(family).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end InetAddress
