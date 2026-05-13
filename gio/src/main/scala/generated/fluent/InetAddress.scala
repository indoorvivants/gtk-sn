package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.{InetAddress, SocketFamily}
import sn.gnome.gio.internal.GInetAddress
import sn.gnome.glib.internal.{gboolean, gchar, gint, gsize, guint8}
import sn.gnome.gobject.Object
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
class InetAddress private[gnome] (raw: Ptr[GInetAddress])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Checks if two #GInetAddress instances are equal, e.g. the same address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(
      other_address: sn.gnome.gio.InetAddress /* Some(Ptr[GInetAddress]) */
  )(using Runtime): Boolean /* None */ =
    g_inet_address_equal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetAddress]],
      other_address.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end equal

  /** Gets @address's family
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFamily(): SocketFamily /* None */ =
    SocketFamily.fromRaw(
      g_inet_address_get_family(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetAddress]]
      )
    )
  end getFamily

  /** Tests whether @address is the "any" address for its family.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsAny(): Boolean /* None */ =
    g_inet_address_get_is_any(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetAddress]]
    ).value.!=(0)
  end getIsAny

  /** Tests whether @address is a link-local address (that is, if it identifies
    * a host on a local network that is not connected to the Internet).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsLinkLocal(): Boolean /* None */ =
    g_inet_address_get_is_link_local(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetAddress]]
    ).value.!=(0)
  end getIsLinkLocal

  /** Tests whether @address is the loopback address for its family.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsLoopback(): Boolean /* None */ =
    g_inet_address_get_is_loopback(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetAddress]]
    ).value.!=(0)
  end getIsLoopback

  /** Tests whether @address is a global multicast address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsMcGlobal(): Boolean /* None */ =
    g_inet_address_get_is_mc_global(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetAddress]]
    ).value.!=(0)
  end getIsMcGlobal

  /** Tests whether @address is a link-local multicast address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsMcLinkLocal(): Boolean /* None */ =
    g_inet_address_get_is_mc_link_local(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetAddress]]
    ).value.!=(0)
  end getIsMcLinkLocal

  /** Tests whether @address is a node-local multicast address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsMcNodeLocal(): Boolean /* None */ =
    g_inet_address_get_is_mc_node_local(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetAddress]]
    ).value.!=(0)
  end getIsMcNodeLocal

  /** Tests whether @address is an organization-local multicast address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsMcOrgLocal(): Boolean /* None */ =
    g_inet_address_get_is_mc_org_local(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetAddress]]
    ).value.!=(0)
  end getIsMcOrgLocal

  /** Tests whether @address is a site-local multicast address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsMcSiteLocal(): Boolean /* None */ =
    g_inet_address_get_is_mc_site_local(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetAddress]]
    ).value.!=(0)
  end getIsMcSiteLocal

  /** Tests whether @address is a multicast address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsMulticast(): Boolean /* None */ =
    g_inet_address_get_is_multicast(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetAddress]]
    ).value.!=(0)
  end getIsMulticast

  /** Tests whether @address is a site-local address such as 10.0.0.1 (that is,
    * the address identifies a host on a local network that can not be reached
    * directly from the Internet, but which may have outgoing Internet
    * connectivity via a NAT or firewall).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsSiteLocal(): Boolean /* None */ =
    g_inet_address_get_is_site_local(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetAddress]]
    ).value.!=(0)
  end getIsSiteLocal

  /** Gets the size of the native raw binary address for @address. This is the
    * size of the data that you get from g_inet_address_to_bytes().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNativeSize(): CUnsignedLongInt /* None */ =
    g_inet_address_get_native_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetAddress]]
    ).value
  end getNativeSize

  /** Gets the raw binary address data from @address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toBytes(): Ptr[guint8] /* None */ =
    g_inet_address_to_bytes(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetAddress]]
    )
  end toBytes

  /** Converts @address to string form.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toString()(using Zone): String /* None */ =
    fromCString(
      g_inet_address_to_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetAddress]]
      ).asInstanceOf
    )
  end toString

end InetAddress

object InetAddress:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GInetAddress])(using Runtime) =
    summon[Runtime].getOrCreate[InetAddress](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new InetAddress(ptr)
    )

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
    summon[Runtime].getOrCreate[InetAddress](
      raw,
      r => InetAddress.applyUnsafe(r.asInstanceOf)
    )
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
    "[constructor new_from_bytes/bytes]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @type -> DataRecord(const guint8*)))"
  )
  private def fromBytes() = ???

  /** Parses @string as an IP address and creates a new #GInetAddress.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromString(
      string: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone, Runtime): InetAddress =
    val raw: Ptr[Byte] = g_inet_address_new_from_string(
      toCString(string).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
    summon[Runtime].getOrCreate[InetAddress](
      raw,
      r => InetAddress.applyUnsafe(r.asInstanceOf)
    )
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
    summon[Runtime].getOrCreate[InetAddress](
      raw,
      r => InetAddress.applyUnsafe(r.asInstanceOf)
    )
  end loopback
end InetAddress
