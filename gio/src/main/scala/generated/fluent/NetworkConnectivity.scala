package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GNetworkConnectivity

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The host's network connectivity state, as reported by #GNetworkMonitor.
  */
enum NetworkConnectivity(val raw: GNetworkConnectivity):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The host is not configured with a route to the Internet; it may or may not
    * be connected to a local network.
    */
  case LOCAL
      extends NetworkConnectivity(
        GNetworkConnectivity.G_NETWORK_CONNECTIVITY_LOCAL
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The host is connected to a network, but does not appear to be able to
    * reach the full Internet, perhaps due to upstream network problems.
    */
  case LIMITED
      extends NetworkConnectivity(
        GNetworkConnectivity.G_NETWORK_CONNECTIVITY_LIMITED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The host is behind a captive portal and cannot reach the full Internet.
    */
  case PORTAL
      extends NetworkConnectivity(
        GNetworkConnectivity.G_NETWORK_CONNECTIVITY_PORTAL
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The host is connected to a network, and appears to be able to reach the
    * full Internet.
    */
  case FULL
      extends NetworkConnectivity(
        GNetworkConnectivity.G_NETWORK_CONNECTIVITY_FULL
      )
end NetworkConnectivity

object NetworkConnectivity:
  def fromRaw(raw: GNetworkConnectivity): NetworkConnectivity =
    raw match
      case GNetworkConnectivity.G_NETWORK_CONNECTIVITY_LOCAL =>
        NetworkConnectivity.LOCAL
      case GNetworkConnectivity.G_NETWORK_CONNECTIVITY_LIMITED =>
        NetworkConnectivity.LIMITED
      case GNetworkConnectivity.G_NETWORK_CONNECTIVITY_PORTAL =>
        NetworkConnectivity.PORTAL
      case GNetworkConnectivity.G_NETWORK_CONNECTIVITY_FULL =>
        NetworkConnectivity.FULL
  end fromRaw
end NetworkConnectivity
