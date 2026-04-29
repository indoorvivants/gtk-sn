package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTlsChannelBindingType: _TLS_CHANNEL_BINDING_TLS_UNIQUE: [`tls-unique`](https://tools.ietf.org/html/rfc5929#section-3) binding type _TLS_CHANNEL_BINDING_TLS_SERVER_END_POINT: [`tls-server-end-point`](https://tools.ietf.org/html/rfc5929#section-4) binding type _TLS_CHANNEL_BINDING_TLS_EXPORTER: [`tls-exporter`](https://www.rfc-editor.org/rfc/rfc9266.html) binding type. Since: 2.74
*/
opaque type GTlsChannelBindingType = CUnsignedInt
object GTlsChannelBindingType extends _BindgenEnumCUnsignedInt[GTlsChannelBindingType]:
  given _tag: Tag[GTlsChannelBindingType] = Tag.UInt
  inline def define(inline a: Long): GTlsChannelBindingType = a.toUInt
  val G_TLS_CHANNEL_BINDING_TLS_UNIQUE = define(0)
  val G_TLS_CHANNEL_BINDING_TLS_SERVER_END_POINT = define(1)
  val G_TLS_CHANNEL_BINDING_TLS_EXPORTER = define(2)
  def getName(value: GTlsChannelBindingType): Option[String] =
    value match
      case `G_TLS_CHANNEL_BINDING_TLS_UNIQUE` => Some("G_TLS_CHANNEL_BINDING_TLS_UNIQUE")
      case `G_TLS_CHANNEL_BINDING_TLS_SERVER_END_POINT` => Some("G_TLS_CHANNEL_BINDING_TLS_SERVER_END_POINT")
      case `G_TLS_CHANNEL_BINDING_TLS_EXPORTER` => Some("G_TLS_CHANNEL_BINDING_TLS_EXPORTER")
      case _ => _root_.scala.None
  extension (a: GTlsChannelBindingType)
    inline def &(b: GTlsChannelBindingType): GTlsChannelBindingType = a & b
    inline def |(b: GTlsChannelBindingType): GTlsChannelBindingType = a | b
    inline def is(b: GTlsChannelBindingType): Boolean = (a & b) == b