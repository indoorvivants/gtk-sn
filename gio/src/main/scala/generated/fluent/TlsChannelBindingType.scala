package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GTlsChannelBindingType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The type of TLS channel binding data to retrieve from #GTlsConnection or
  * #GDtlsConnection, as documented by RFC 5929 or RFC 9266. The
  * [`tls-unique-for-telnet`](https://tools.ietf.org/html/rfc5929#section-5)
  * binding type is not currently implemented.
  */
enum TlsChannelBindingType(val raw: GTlsChannelBindingType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [`tls-unique`](https://tools.ietf.org/html/rfc5929#section-3) binding type
    */
  case UNIQUE
      extends TlsChannelBindingType(
        GTlsChannelBindingType.G_TLS_CHANNEL_BINDING_TLS_UNIQUE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [`tls-server-end-point`](https://tools.ietf.org/html/rfc5929#section-4)
    * binding type
    */
  case SERVER_END_POINT
      extends TlsChannelBindingType(
        GTlsChannelBindingType.G_TLS_CHANNEL_BINDING_TLS_SERVER_END_POINT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * [`tls-exporter`](https://www.rfc-editor.org/rfc/rfc9266.html) binding
    * type. Since: 2.74
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
