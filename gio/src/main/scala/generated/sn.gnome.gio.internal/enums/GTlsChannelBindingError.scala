package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTlsChannelBindingError: _TLS_CHANNEL_BINDING_ERROR_NOT_IMPLEMENTED: Either entire binding retrieval facility or specific binding type is not implemented in the TLS backend. _TLS_CHANNEL_BINDING_ERROR_INVALID_STATE: The handshake is not yet complete on the connection which is a strong requirement for any existing binding type. _TLS_CHANNEL_BINDING_ERROR_NOT_AVAILABLE: Handshake is complete but binding data is not available. That normally indicates the TLS implementation failed to provide the binding data. For example, some implementations do not provide a peer certificate for resumed connections. _TLS_CHANNEL_BINDING_ERROR_NOT_SUPPORTED: Binding type is not supported on the current connection. This error could be triggered when requesting `tls-server-end-point` binding data for a certificate which has no hash function or uses multiple hash functions. _TLS_CHANNEL_BINDING_ERROR_GENERAL_ERROR: Any other backend error preventing binding data retrieval.
*/
opaque type GTlsChannelBindingError = CUnsignedInt
object GTlsChannelBindingError extends _BindgenEnumCUnsignedInt[GTlsChannelBindingError]:
  given _tag: Tag[GTlsChannelBindingError] = Tag.UInt
  inline def define(inline a: Long): GTlsChannelBindingError = a.toUInt
  val G_TLS_CHANNEL_BINDING_ERROR_NOT_IMPLEMENTED = define(0)
  val G_TLS_CHANNEL_BINDING_ERROR_INVALID_STATE = define(1)
  val G_TLS_CHANNEL_BINDING_ERROR_NOT_AVAILABLE = define(2)
  val G_TLS_CHANNEL_BINDING_ERROR_NOT_SUPPORTED = define(3)
  val G_TLS_CHANNEL_BINDING_ERROR_GENERAL_ERROR = define(4)
  def getName(value: GTlsChannelBindingError): Option[String] =
    value match
      case `G_TLS_CHANNEL_BINDING_ERROR_NOT_IMPLEMENTED` => Some("G_TLS_CHANNEL_BINDING_ERROR_NOT_IMPLEMENTED")
      case `G_TLS_CHANNEL_BINDING_ERROR_INVALID_STATE` => Some("G_TLS_CHANNEL_BINDING_ERROR_INVALID_STATE")
      case `G_TLS_CHANNEL_BINDING_ERROR_NOT_AVAILABLE` => Some("G_TLS_CHANNEL_BINDING_ERROR_NOT_AVAILABLE")
      case `G_TLS_CHANNEL_BINDING_ERROR_NOT_SUPPORTED` => Some("G_TLS_CHANNEL_BINDING_ERROR_NOT_SUPPORTED")
      case `G_TLS_CHANNEL_BINDING_ERROR_GENERAL_ERROR` => Some("G_TLS_CHANNEL_BINDING_ERROR_GENERAL_ERROR")
      case _ => _root_.scala.None
  extension (a: GTlsChannelBindingError)
    inline def &(b: GTlsChannelBindingError): GTlsChannelBindingError = a & b
    inline def |(b: GTlsChannelBindingError): GTlsChannelBindingError = a | b
    inline def is(b: GTlsChannelBindingError): Boolean = (a & b) == b