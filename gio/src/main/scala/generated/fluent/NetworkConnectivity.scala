package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GNetworkConnectivity

/** The host's network connectivity state, as reported by #GNetworkMonitor.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum NetworkConnectivity(val raw: GNetworkConnectivity):
  /** The host is not configured with a route to the Internet; it may or may not
    * be connected to a local network.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LOCAL
      extends NetworkConnectivity(
        GNetworkConnectivity.G_NETWORK_CONNECTIVITY_LOCAL
      )

  /** The host is connected to a network, but does not appear to be able to
    * reach the full Internet, perhaps due to upstream network problems.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LIMITED
      extends NetworkConnectivity(
        GNetworkConnectivity.G_NETWORK_CONNECTIVITY_LIMITED
      )

  /** The host is behind a captive portal and cannot reach the full Internet.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PORTAL
      extends NetworkConnectivity(
        GNetworkConnectivity.G_NETWORK_CONNECTIVITY_PORTAL
      )

  /** The host is connected to a network, and appears to be able to reach the
    * full Internet.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
