package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GNetworkConnectivity: _NETWORK_CONNECTIVITY_LOCAL: The host is not configured with a route to the Internet; it may or may not be connected to a local network. _NETWORK_CONNECTIVITY_LIMITED: The host is connected to a network, but does not appear to be able to reach the full Internet, perhaps due to upstream network problems. _NETWORK_CONNECTIVITY_PORTAL: The host is behind a captive portal and cannot reach the full Internet. _NETWORK_CONNECTIVITY_FULL: The host is connected to a network, and appears to be able to reach the full Internet.
*/
opaque type GNetworkConnectivity = CUnsignedInt
object GNetworkConnectivity extends _BindgenEnumCUnsignedInt[GNetworkConnectivity]:
  given _tag: Tag[GNetworkConnectivity] = Tag.UInt
  inline def define(inline a: Long): GNetworkConnectivity = a.toUInt
  val G_NETWORK_CONNECTIVITY_LOCAL = define(1)
  val G_NETWORK_CONNECTIVITY_LIMITED = define(2)
  val G_NETWORK_CONNECTIVITY_PORTAL = define(3)
  val G_NETWORK_CONNECTIVITY_FULL = define(4)
  def getName(value: GNetworkConnectivity): Option[String] =
    value match
      case `G_NETWORK_CONNECTIVITY_LOCAL` => Some("G_NETWORK_CONNECTIVITY_LOCAL")
      case `G_NETWORK_CONNECTIVITY_LIMITED` => Some("G_NETWORK_CONNECTIVITY_LIMITED")
      case `G_NETWORK_CONNECTIVITY_PORTAL` => Some("G_NETWORK_CONNECTIVITY_PORTAL")
      case `G_NETWORK_CONNECTIVITY_FULL` => Some("G_NETWORK_CONNECTIVITY_FULL")
      case _ => _root_.scala.None
  extension (a: GNetworkConnectivity)
    inline def &(b: GNetworkConnectivity): GNetworkConnectivity = a & b
    inline def |(b: GNetworkConnectivity): GNetworkConnectivity = a | b
    inline def is(b: GNetworkConnectivity): Boolean = (a & b) == b