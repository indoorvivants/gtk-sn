package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GResolverError: _RESOLVER_ERROR_NOT_FOUND: the requested name/address/service was not found _RESOLVER_ERROR_TEMPORARY_FAILURE: the requested information could not be looked up due to a network error or similar problem _RESOLVER_ERROR_INTERNAL: unknown error
*/
opaque type GResolverError = CUnsignedInt
object GResolverError extends _BindgenEnumCUnsignedInt[GResolverError]:
  given _tag: Tag[GResolverError] = Tag.UInt
  inline def define(inline a: Long): GResolverError = a.toUInt
  val G_RESOLVER_ERROR_NOT_FOUND = define(0)
  val G_RESOLVER_ERROR_TEMPORARY_FAILURE = define(1)
  val G_RESOLVER_ERROR_INTERNAL = define(2)
  def getName(value: GResolverError): Option[String] =
    value match
      case `G_RESOLVER_ERROR_NOT_FOUND` => Some("G_RESOLVER_ERROR_NOT_FOUND")
      case `G_RESOLVER_ERROR_TEMPORARY_FAILURE` => Some("G_RESOLVER_ERROR_TEMPORARY_FAILURE")
      case `G_RESOLVER_ERROR_INTERNAL` => Some("G_RESOLVER_ERROR_INTERNAL")
      case _ => _root_.scala.None
  extension (a: GResolverError)
    inline def &(b: GResolverError): GResolverError = a & b
    inline def |(b: GResolverError): GResolverError = a | b
    inline def is(b: GResolverError): Boolean = (a & b) == b