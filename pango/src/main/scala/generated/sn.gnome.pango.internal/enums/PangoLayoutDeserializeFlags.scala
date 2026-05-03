package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoLayoutDeserializeFlags: _LAYOUT_DESERIALIZE_DEFAULT: Default behavior _LAYOUT_DESERIALIZE_CONTEXT: Apply context information from the serialization to the `PangoContext`
*/
opaque type PangoLayoutDeserializeFlags = CUnsignedInt
object PangoLayoutDeserializeFlags extends _BindgenEnumCUnsignedInt[PangoLayoutDeserializeFlags]:
  given _tag: Tag[PangoLayoutDeserializeFlags] = Tag.UInt
  inline def define(inline a: Long): PangoLayoutDeserializeFlags = a.toUInt
  val PANGO_LAYOUT_DESERIALIZE_DEFAULT = define(0)
  val PANGO_LAYOUT_DESERIALIZE_CONTEXT = define(1)
  def getName(value: PangoLayoutDeserializeFlags): Option[String] =
    value match
      case `PANGO_LAYOUT_DESERIALIZE_DEFAULT` => Some("PANGO_LAYOUT_DESERIALIZE_DEFAULT")
      case `PANGO_LAYOUT_DESERIALIZE_CONTEXT` => Some("PANGO_LAYOUT_DESERIALIZE_CONTEXT")
      case _ => _root_.scala.None
  extension (a: PangoLayoutDeserializeFlags)
    inline def &(b: PangoLayoutDeserializeFlags): PangoLayoutDeserializeFlags = a & b
    inline def |(b: PangoLayoutDeserializeFlags): PangoLayoutDeserializeFlags = a | b
    inline def is(b: PangoLayoutDeserializeFlags): Boolean = (a & b) == b