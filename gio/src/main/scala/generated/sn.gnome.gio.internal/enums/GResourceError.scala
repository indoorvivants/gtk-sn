package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GResourceError: _RESOURCE_ERROR_NOT_FOUND: no file was found at the requested path _RESOURCE_ERROR_INTERNAL: unknown error
*/
opaque type GResourceError = CUnsignedInt
object GResourceError extends _BindgenEnumCUnsignedInt[GResourceError]:
  given _tag: Tag[GResourceError] = Tag.UInt
  inline def define(inline a: Long): GResourceError = a.toUInt
  val G_RESOURCE_ERROR_NOT_FOUND = define(0)
  val G_RESOURCE_ERROR_INTERNAL = define(1)
  def getName(value: GResourceError): Option[String] =
    value match
      case `G_RESOURCE_ERROR_NOT_FOUND` => Some("G_RESOURCE_ERROR_NOT_FOUND")
      case `G_RESOURCE_ERROR_INTERNAL` => Some("G_RESOURCE_ERROR_INTERNAL")
      case _ => _root_.scala.None
  extension (a: GResourceError)
    inline def &(b: GResourceError): GResourceError = a & b
    inline def |(b: GResourceError): GResourceError = a | b
    inline def is(b: GResourceError): Boolean = (a & b) == b