package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.NetworkAddress
import sn.gnome.gio.fluent.SocketConnectable
import sn.gnome.gio.internal.GNetworkAddress
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.guint16
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GNetworkAddress provides an easy way to resolve a hostname and then attempt
  * to connect to that host, handling the possibility of multiple IP addresses
  * and multiple address families.
  *
  * The enumeration results of resolved addresses *may* be cached as long as
  * this object is kept alive which may have unexpected results if alive for too
  * long.
  *
  * See #GSocketConnectable for an example of using the connectable interface.
  */
class NetworkAddress(raw: Ptr[GNetworkAddress])
    extends Object(raw.asInstanceOf),
      SocketConnectable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets @addr's hostname. This might be either UTF-8 or ASCII-encoded,
    * depending on what @addr was created with.
    */
  def getHostname()(using Zone): String /* None */ = fromCString(
    g_network_address_get_hostname(
      this.raw.asInstanceOf[Ptr[GNetworkAddress]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets @addr's port number
    */
  def getPort(): UShort /* None */ = g_network_address_get_port(
    this.raw.asInstanceOf[Ptr[GNetworkAddress]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets @addr's scheme
    */
  def getScheme()(using Zone): String /* None */ = fromCString(
    g_network_address_get_scheme(
      this.raw.asInstanceOf[Ptr[GNetworkAddress]]
    ).asInstanceOf
  )

end NetworkAddress

object NetworkAddress:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GSocketConnectable for connecting to the given
    * @hostname
    *   and @port.
    *
    * Note that depending on the configuration of the machine, a
    * @hostname
    *   of `localhost` may refer to the IPv4 loopback address only, or to both
    *   IPv4 and IPv6; use g_network_address_new_loopback() to create a
    *   #GNetworkAddress that is guaranteed to resolve to both addresses.
    */
  def apply(
      hostname: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      port: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */
  )(using Zone): NetworkAddress = new NetworkAddress(
    g_network_address_new(
      __sn_extract_string(hostname).asInstanceOf[Ptr[gchar]],
      guint16(port)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GSocketConnectable for connecting to the local host over a
    * loopback connection to the given @port. This is intended for use in
    * connecting to local services which may be running on IPv4 or IPv6.
    *
    * The connectable will return IPv4 and IPv6 loopback addresses, regardless
    * of how the host resolves `localhost`. By contrast, g_network_address_new()
    * will often only return an IPv4 address when resolving `localhost`, and an
    * IPv6 address for `localhost6`.
    *
    * g_network_address_get_hostname() will always return `localhost` for a
    * #GNetworkAddress created with this constructor.
    */
  def loopback(
      port: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */
  ): NetworkAddress = new NetworkAddress(
    g_network_address_new_loopback(guint16(port)).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GSocketConnectable for connecting to the given
    * @hostname
    *   and @port. May fail and return %NULL in case parsing @host_and_port
    *   fails.
    *
    * @host_and_port
    *   may be in any of a number of recognised formats; an IPv6 address, an
    *   IPv4 address, or a domain name (in which case a DNS lookup is
    *   performed). Quoting with [] is supported for all address types. A port
    *   override may be specified in the usual way with a colon.
    *
    * If no port is specified in @host_and_port then @default_port will be used
    * as the port number to connect to.
    *
    * In general, @host_and_port is expected to be provided by the user
    * (allowing them to give the hostname, and a port override if necessary) and @default_port
    * is expected to be provided by the application.
    *
    * (The port component of @host_and_port can also be specified as a service
    * name rather than as a numeric port, but this functionality is deprecated,
    * because it depends on the contents of /etc/services, which is generally
    * quite sparse on platforms other than Linux.)
    */
  def parse(
      host_and_port: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      default_port: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */
  )(using Zone): GResult[NetworkAddress /* None */ ] =
    GResult.wrap(__errorPtr =>
      new NetworkAddress(
        g_network_address_parse(
          __sn_extract_string(host_and_port).asInstanceOf[Ptr[gchar]],
          guint16(default_port),
          __errorPtr
        ).asInstanceOf
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GSocketConnectable for connecting to the given
    * @uri.
    *   May fail and return %NULL in case parsing @uri fails.
    *
    * Using this rather than g_network_address_new() or
    * g_network_address_parse() allows #GSocketClient to determine when to use
    * application-specific proxy protocols.
    */
  def parseUri(
      uri: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      default_port: UShort /* Some(_root_.sn.gnome.glib.internal.guint16) */
  )(using Zone): GResult[NetworkAddress /* None */ ] =
    GResult.wrap(__errorPtr =>
      new NetworkAddress(
        g_network_address_parse_uri(
          __sn_extract_string(uri).asInstanceOf[Ptr[gchar]],
          guint16(default_port),
          __errorPtr
        ).asInstanceOf
      )
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end NetworkAddress
