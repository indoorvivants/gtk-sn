package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GskSerializationError: _SERIALIZATION_UNSUPPORTED_FORMAT: The format can not be identified _SERIALIZATION_UNSUPPORTED_VERSION: The version of the data is not understood _SERIALIZATION_INVALID_DATA: The given data may not exist in a proper serialization
*/
opaque type GskSerializationError = CUnsignedInt
object GskSerializationError extends _BindgenEnumCUnsignedInt[GskSerializationError]:
  given _tag: Tag[GskSerializationError] = Tag.UInt
  inline def define(inline a: Long): GskSerializationError = a.toUInt
  val GSK_SERIALIZATION_UNSUPPORTED_FORMAT = define(0)
  val GSK_SERIALIZATION_UNSUPPORTED_VERSION = define(1)
  val GSK_SERIALIZATION_INVALID_DATA = define(2)
  def getName(value: GskSerializationError): Option[String] =
    value match
      case `GSK_SERIALIZATION_UNSUPPORTED_FORMAT` => Some("GSK_SERIALIZATION_UNSUPPORTED_FORMAT")
      case `GSK_SERIALIZATION_UNSUPPORTED_VERSION` => Some("GSK_SERIALIZATION_UNSUPPORTED_VERSION")
      case `GSK_SERIALIZATION_INVALID_DATA` => Some("GSK_SERIALIZATION_INVALID_DATA")
      case _ => _root_.scala.None
  extension (a: GskSerializationError)
    inline def &(b: GskSerializationError): GskSerializationError = a & b
    inline def |(b: GskSerializationError): GskSerializationError = a | b
    inline def is(b: GskSerializationError): Boolean = (a & b) == b