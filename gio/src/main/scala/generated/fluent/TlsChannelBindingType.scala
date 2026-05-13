package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GTlsChannelBindingType

/** The type of TLS channel binding data to retrieve from #GTlsConnection or
  * #GDtlsConnection, as documented by RFC 5929 or RFC 9266. The
  * [`tls-unique-for-telnet`](https://tools.ietf.org/html/rfc5929#section-5)
  * binding type is not currently implemented.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum TlsChannelBindingType(val raw: GTlsChannelBindingType):
  /** [`tls-unique`](https://tools.ietf.org/html/rfc5929#section-3) binding type
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNIQUE
      extends TlsChannelBindingType(
        GTlsChannelBindingType.G_TLS_CHANNEL_BINDING_TLS_UNIQUE
      )

  /** [`tls-server-end-point`](https://tools.ietf.org/html/rfc5929#section-4)
    * binding type
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SERVER_END_POINT
      extends TlsChannelBindingType(
        GTlsChannelBindingType.G_TLS_CHANNEL_BINDING_TLS_SERVER_END_POINT
      )

  /** [`tls-exporter`](https://www.rfc-editor.org/rfc/rfc9266.html) binding
    * type. Since: 2.74
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EXPORTER
      extends TlsChannelBindingType(
        GTlsChannelBindingType.G_TLS_CHANNEL_BINDING_TLS_EXPORTER
      )
end TlsChannelBindingType

object TlsChannelBindingType:
  def fromRaw(raw: GTlsChannelBindingType): TlsChannelBindingType =
    raw match
      case GTlsChannelBindingType.G_TLS_CHANNEL_BINDING_TLS_UNIQUE =>
        TlsChannelBindingType.UNIQUE
      case GTlsChannelBindingType.G_TLS_CHANNEL_BINDING_TLS_SERVER_END_POINT =>
        TlsChannelBindingType.SERVER_END_POINT
      case GTlsChannelBindingType.G_TLS_CHANNEL_BINDING_TLS_EXPORTER =>
        TlsChannelBindingType.EXPORTER
  end fromRaw
end TlsChannelBindingType
