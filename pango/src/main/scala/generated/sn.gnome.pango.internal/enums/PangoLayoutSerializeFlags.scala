package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoLayoutSerializeFlags: _LAYOUT_SERIALIZE_DEFAULT: Default behavior _LAYOUT_SERIALIZE_CONTEXT: Include context information _LAYOUT_SERIALIZE_OUTPUT: Include information about the formatted output
*/
opaque type PangoLayoutSerializeFlags = CUnsignedInt
object PangoLayoutSerializeFlags extends _BindgenEnumCUnsignedInt[PangoLayoutSerializeFlags]:
  given _tag: Tag[PangoLayoutSerializeFlags] = Tag.UInt
  inline def define(inline a: Long): PangoLayoutSerializeFlags = a.toUInt
  val PANGO_LAYOUT_SERIALIZE_DEFAULT = define(0)
  val PANGO_LAYOUT_SERIALIZE_CONTEXT = define(1)
  val PANGO_LAYOUT_SERIALIZE_OUTPUT = define(2)
  def getName(value: PangoLayoutSerializeFlags): Option[String] =
    value match
      case `PANGO_LAYOUT_SERIALIZE_DEFAULT` => Some("PANGO_LAYOUT_SERIALIZE_DEFAULT")
      case `PANGO_LAYOUT_SERIALIZE_CONTEXT` => Some("PANGO_LAYOUT_SERIALIZE_CONTEXT")
      case `PANGO_LAYOUT_SERIALIZE_OUTPUT` => Some("PANGO_LAYOUT_SERIALIZE_OUTPUT")
      case _ => _root_.scala.None
  extension (a: PangoLayoutSerializeFlags)
    inline def &(b: PangoLayoutSerializeFlags): PangoLayoutSerializeFlags = a & b
    inline def |(b: PangoLayoutSerializeFlags): PangoLayoutSerializeFlags = a | b
    inline def is(b: PangoLayoutSerializeFlags): Boolean = (a & b) == b