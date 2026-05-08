package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.{InetAddress, SocketFamily}
import sn.gnome.gio.internal.GInetAddress
import sn.gnome.glib.internal.{gboolean, gchar, gint, gsize, guint8}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*

/** #GInetAddress represents an IPv4 or IPv6 internet address. Use
  * g_resolver_lookup_by_name() or g_resolver_lookup_by_name_async() to look up
  * the #GInetAddress for a hostname. Use g_resolver_lookup_by_address() or
  * g_resolver_lookup_by_address_async() to look up the hostname for a
  * #GInetAddress.
  *
  * To actually connect to a remote host, you will need a #GInetSocketAddress
  * (which includes a #GInetAddress as well as a port number).
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class InetAddress(raw: Ptr[GInetAddress]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Checks if two #GInetAddress instances are equal, e.g. the same address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(
      other_address: InetAddress /* Some(Ptr[GInetAddress]) */
  ): Boolean /* None */ = g_inet_address_equal(
    this.raw.asInstanceOf[Ptr[GInetAddress]],
    other_address.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  /** Gets @address's family
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFamily(): SocketFamily /* None */ = SocketFamily.fromRaw(
    g_inet_address_get_family(this.raw.asInstanceOf[Ptr[GInetAddress]])
  )

  /** Tests whether @address is the "any" address for its family.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsAny(): Boolean /* None */ = g_inet_address_get_is_any(
    this.raw.asInstanceOf[Ptr[GInetAddress]]
  ).value.!=(0)

  /** Tests whether @address is a link-local address (that is, if it identifies
    * a host on a local network that is not connected to the Internet).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsLinkLocal(): Boolean /* None */ = g_inet_address_get_is_link_local(
    this.raw.asInstanceOf[Ptr[GInetAddress]]
  ).value.!=(0)

  /** Tests whether @address is the loopback address for its family.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsLoopback(): Boolean /* None */ = g_inet_address_get_is_loopback(
    this.raw.asInstanceOf[Ptr[GInetAddress]]
  ).value.!=(0)

  /** Tests whether @address is a global multicast address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsMcGlobal(): Boolean /* None */ = g_inet_address_get_is_mc_global(
    this.raw.asInstanceOf[Ptr[GInetAddress]]
  ).value.!=(0)

  /** Tests whether @address is a link-local multicast address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsMcLinkLocal(): Boolean /* None */ =
    g_inet_address_get_is_mc_link_local(
      this.raw.asInstanceOf[Ptr[GInetAddress]]
    ).value.!=(0)

  /** Tests whether @address is a node-local multicast address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsMcNodeLocal(): Boolean /* None */ =
    g_inet_address_get_is_mc_node_local(
      this.raw.asInstanceOf[Ptr[GInetAddress]]
    ).value.!=(0)

  /** Tests whether @address is an organization-local multicast address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsMcOrgLocal(): Boolean /* None */ =
    g_inet_address_get_is_mc_org_local(
      this.raw.asInstanceOf[Ptr[GInetAddress]]
    ).value.!=(0)

  /** Tests whether @address is a site-local multicast address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsMcSiteLocal(): Boolean /* None */ =
    g_inet_address_get_is_mc_site_local(
      this.raw.asInstanceOf[Ptr[GInetAddress]]
    ).value.!=(0)

  /** Tests whether @address is a multicast address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsMulticast(): Boolean /* None */ = g_inet_address_get_is_multicast(
    this.raw.asInstanceOf[Ptr[GInetAddress]]
  ).value.!=(0)

  /** Tests whether @address is a site-local address such as 10.0.0.1 (that is,
    * the address identifies a host on a local network that can not be reached
    * directly from the Internet, but which may have outgoing Internet
    * connectivity via a NAT or firewall).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsSiteLocal(): Boolean /* None */ = g_inet_address_get_is_site_local(
    this.raw.asInstanceOf[Ptr[GInetAddress]]
  ).value.!=(0)

  /** Gets the size of the native raw binary address for @address. This is the
    * size of the data that you get from g_inet_address_to_bytes().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNativeSize(): CUnsignedLongInt /* None */ =
    g_inet_address_get_native_size(
      this.raw.asInstanceOf[Ptr[GInetAddress]]
    ).value

  /** Gets the raw binary address data from @address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toBytes(): Ptr[guint8] /* None */ = g_inet_address_to_bytes(
    this.raw.asInstanceOf[Ptr[GInetAddress]]
  )

  /** Converts @address to string form.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toString()(using Zone): String /* None */ = fromCString(
    g_inet_address_to_string(
      this.raw.asInstanceOf[Ptr[GInetAddress]]
    ).asInstanceOf
  )

end InetAddress

object InetAddress:
  /** Creates a #GInetAddress for the "any" address (unassigned/"don't care")
    * for @family.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def any(family: SocketFamily /* Some(GSocketFamily) */ )(using
      Runtime
  ): InetAddress =
    val raw: Ptr[Byte] = g_inet_address_new_any(family.raw).asInstanceOf
    summon[Runtime]
      .getOrCreate[InetAddress](raw, r => new InetAddress(r.asInstanceOf))
  end any

  /** Creates a new #GInetAddress from the given @family and @bytes.
    * @bytes
    *   should be 4 bytes for %G_SOCKET_FAMILY_IPV4 and 16 bytes for
    *   %G_SOCKET_FAMILY_IPV6.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[bytes]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @type -> DataRecord(const guint8*)))"
  )
  private def new_from_bytes() = ???

  /** Parses @string as an IP address and creates a new #GInetAddress.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromString(
      string: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone)(using Runtime): InetAddress =
    val raw: Ptr[Byte] = g_inet_address_new_from_string(
      __sn_extract_string(string).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[InetAddress](raw, r => new InetAddress(r.asInstanceOf))
  end fromString

  /** Creates a #GInetAddress for the loopback address for @family.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def loopback(family: SocketFamily /* Some(GSocketFamily) */ )(using
      Runtime
  ): InetAddress =
    val raw: Ptr[Byte] = g_inet_address_new_loopback(family.raw).asInstanceOf
    summon[Runtime]
      .getOrCreate[InetAddress](raw, r => new InetAddress(r.asInstanceOf))
  end loopback

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end InetAddress
