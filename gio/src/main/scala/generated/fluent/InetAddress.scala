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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GInetAddress represents an IPv4 or IPv6 internet address. Use
  * g_resolver_lookup_by_name() or g_resolver_lookup_by_name_async() to look up
  * the #GInetAddress for a hostname. Use g_resolver_lookup_by_address() or
  * g_resolver_lookup_by_address_async() to look up the hostname for a
  * #GInetAddress.
  *
  * To actually connect to a remote host, you will need a #GInetSocketAddress
  * (which includes a #GInetAddress as well as a port number).
  */
class InetAddress(raw: Ptr[GInetAddress]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if two #GInetAddress instances are equal, e.g. the same address.
    */
  def equal(other_address: InetAddress): Boolean = g_inet_address_equal(
    this.raw.asInstanceOf,
    other_address.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets @address's family
    */
  def getFamily(): GSocketFamily = g_inet_address_get_family(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether @address is the "any" address for its family.
    */
  def getIsAny(): Boolean =
    g_inet_address_get_is_any(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether @address is a link-local address (that is, if it identifies
    * a host on a local network that is not connected to the Internet).
    */
  def getIsLinkLocal(): Boolean =
    g_inet_address_get_is_link_local(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether @address is the loopback address for its family.
    */
  def getIsLoopback(): Boolean =
    g_inet_address_get_is_loopback(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether @address is a global multicast address.
    */
  def getIsMcGlobal(): Boolean =
    g_inet_address_get_is_mc_global(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether @address is a link-local multicast address.
    */
  def getIsMcLinkLocal(): Boolean =
    g_inet_address_get_is_mc_link_local(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether @address is a node-local multicast address.
    */
  def getIsMcNodeLocal(): Boolean =
    g_inet_address_get_is_mc_node_local(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether @address is an organization-local multicast address.
    */
  def getIsMcOrgLocal(): Boolean =
    g_inet_address_get_is_mc_org_local(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether @address is a site-local multicast address.
    */
  def getIsMcSiteLocal(): Boolean =
    g_inet_address_get_is_mc_site_local(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether @address is a multicast address.
    */
  def getIsMulticast(): Boolean =
    g_inet_address_get_is_multicast(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests whether @address is a site-local address such as 10.0.0.1 (that is,
    * the address identifies a host on a local network that can not be reached
    * directly from the Internet, but which may have outgoing Internet
    * connectivity via a NAT or firewall).
    */
  def getIsSiteLocal(): Boolean =
    g_inet_address_get_is_site_local(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the size of the native raw binary address for @address. This is the
    * size of the data that you get from g_inet_address_to_bytes().
    */
  def getNativeSize(): CUnsignedLongInt = g_inet_address_get_native_size(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the raw binary address data from @address.
    */
  def toBytes(): Ptr[guint8] = g_inet_address_to_bytes(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts @address to string form.
    */
  def toString()(using Zone): String = fromCString(
    g_inet_address_to_string(this.raw.asInstanceOf).asInstanceOf
  )

end InetAddress

object InetAddress:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a #GInetAddress for the "any" address (unassigned/"don't care")
    * for @family.
    */
  def any(family: GSocketFamily): InetAddress = new InetAddress(
    g_inet_address_new_any(family).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Parses @string as an IP address and creates a new #GInetAddress.
    */
  def fromString(string: String | CString)(using Zone): InetAddress =
    new InetAddress(
      g_inet_address_new_from_string(
        __sn_extract_string(string).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a #GInetAddress for the loopback address for @family.
    */
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
