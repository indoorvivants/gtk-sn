package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GUriError: _URI_ERROR_FAILED: Generic error if no more specific error is available. See the error message for details. _URI_ERROR_BAD_SCHEME: The scheme of a URI could not be parsed. _URI_ERROR_BAD_USER: The user/userinfo of a URI could not be parsed. _URI_ERROR_BAD_PASSWORD: The password of a URI could not be parsed. _URI_ERROR_BAD_AUTH_PARAMS: The authentication parameters of a URI could not be parsed. _URI_ERROR_BAD_HOST: The host of a URI could not be parsed. _URI_ERROR_BAD_PORT: The port of a URI could not be parsed. _URI_ERROR_BAD_PATH: The path of a URI could not be parsed. _URI_ERROR_BAD_QUERY: The query of a URI could not be parsed. _URI_ERROR_BAD_FRAGMENT: The fragment of a URI could not be parsed.
*/
opaque type GUriError = CUnsignedInt
object GUriError extends _BindgenEnumCUnsignedInt[GUriError]:
  given _tag: Tag[GUriError] = Tag.UInt
  inline def define(inline a: Long): GUriError = a.toUInt
  val G_URI_ERROR_FAILED = define(0)
  val G_URI_ERROR_BAD_SCHEME = define(1)
  val G_URI_ERROR_BAD_USER = define(2)
  val G_URI_ERROR_BAD_PASSWORD = define(3)
  val G_URI_ERROR_BAD_AUTH_PARAMS = define(4)
  val G_URI_ERROR_BAD_HOST = define(5)
  val G_URI_ERROR_BAD_PORT = define(6)
  val G_URI_ERROR_BAD_PATH = define(7)
  val G_URI_ERROR_BAD_QUERY = define(8)
  val G_URI_ERROR_BAD_FRAGMENT = define(9)
  def getName(value: GUriError): Option[String] =
    value match
      case `G_URI_ERROR_FAILED` => Some("G_URI_ERROR_FAILED")
      case `G_URI_ERROR_BAD_SCHEME` => Some("G_URI_ERROR_BAD_SCHEME")
      case `G_URI_ERROR_BAD_USER` => Some("G_URI_ERROR_BAD_USER")
      case `G_URI_ERROR_BAD_PASSWORD` => Some("G_URI_ERROR_BAD_PASSWORD")
      case `G_URI_ERROR_BAD_AUTH_PARAMS` => Some("G_URI_ERROR_BAD_AUTH_PARAMS")
      case `G_URI_ERROR_BAD_HOST` => Some("G_URI_ERROR_BAD_HOST")
      case `G_URI_ERROR_BAD_PORT` => Some("G_URI_ERROR_BAD_PORT")
      case `G_URI_ERROR_BAD_PATH` => Some("G_URI_ERROR_BAD_PATH")
      case `G_URI_ERROR_BAD_QUERY` => Some("G_URI_ERROR_BAD_QUERY")
      case `G_URI_ERROR_BAD_FRAGMENT` => Some("G_URI_ERROR_BAD_FRAGMENT")
      case _ => _root_.scala.None
  extension (a: GUriError)
    inline def &(b: GUriError): GUriError = a & b
    inline def |(b: GUriError): GUriError = a | b
    inline def is(b: GUriError): Boolean = (a & b) == b