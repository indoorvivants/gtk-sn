package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoLayoutDeserializeError: _LAYOUT_DESERIALIZE_INVALID: Unspecified error _LAYOUT_DESERIALIZE_INVALID_VALUE: A JSon value could not be interpreted _LAYOUT_DESERIALIZE_MISSING_VALUE: A required JSon member was not found
*/
opaque type PangoLayoutDeserializeError = CUnsignedInt
object PangoLayoutDeserializeError extends _BindgenEnumCUnsignedInt[PangoLayoutDeserializeError]:
  given _tag: Tag[PangoLayoutDeserializeError] = Tag.UInt
  inline def define(inline a: Long): PangoLayoutDeserializeError = a.toUInt
  val PANGO_LAYOUT_DESERIALIZE_INVALID = define(0)
  val PANGO_LAYOUT_DESERIALIZE_INVALID_VALUE = define(1)
  val PANGO_LAYOUT_DESERIALIZE_MISSING_VALUE = define(2)
  def getName(value: PangoLayoutDeserializeError): Option[String] =
    value match
      case `PANGO_LAYOUT_DESERIALIZE_INVALID` => Some("PANGO_LAYOUT_DESERIALIZE_INVALID")
      case `PANGO_LAYOUT_DESERIALIZE_INVALID_VALUE` => Some("PANGO_LAYOUT_DESERIALIZE_INVALID_VALUE")
      case `PANGO_LAYOUT_DESERIALIZE_MISSING_VALUE` => Some("PANGO_LAYOUT_DESERIALIZE_MISSING_VALUE")
      case _ => _root_.scala.None
  extension (a: PangoLayoutDeserializeError)
    inline def &(b: PangoLayoutDeserializeError): PangoLayoutDeserializeError = a & b
    inline def |(b: PangoLayoutDeserializeError): PangoLayoutDeserializeError = a | b
    inline def is(b: PangoLayoutDeserializeError): Boolean = (a & b) == b