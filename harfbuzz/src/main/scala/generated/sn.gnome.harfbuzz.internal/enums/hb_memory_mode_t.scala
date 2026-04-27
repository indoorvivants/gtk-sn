package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_memory_mode_t: _MEMORY_MODE_DUPLICATE: HarfBuzz immediately makes a copy of the data. _MEMORY_MODE_READONLY: HarfBuzz client will never modify the data, and HarfBuzz will never modify the data. _MEMORY_MODE_WRITABLE: HarfBuzz client made a copy of the data solely for HarfBuzz, so HarfBuzz may modify the data. _MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE: See above
*/
opaque type hb_memory_mode_t = CUnsignedInt
object hb_memory_mode_t extends _BindgenEnumCUnsignedInt[hb_memory_mode_t]:
  given _tag: Tag[hb_memory_mode_t] = Tag.UInt
  inline def define(inline a: Long): hb_memory_mode_t = a.toUInt
  val HB_MEMORY_MODE_DUPLICATE = define(0)
  val HB_MEMORY_MODE_READONLY = define(1)
  val HB_MEMORY_MODE_WRITABLE = define(2)
  val HB_MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE = define(3)
  def getName(value: hb_memory_mode_t): Option[String] =
    value match
      case `HB_MEMORY_MODE_DUPLICATE` => Some("HB_MEMORY_MODE_DUPLICATE")
      case `HB_MEMORY_MODE_READONLY` => Some("HB_MEMORY_MODE_READONLY")
      case `HB_MEMORY_MODE_WRITABLE` => Some("HB_MEMORY_MODE_WRITABLE")
      case `HB_MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE` => Some("HB_MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE")
      case _ => _root_.scala.None
  extension (a: hb_memory_mode_t)
    inline def &(b: hb_memory_mode_t): hb_memory_mode_t = a & b
    inline def |(b: hb_memory_mode_t): hb_memory_mode_t = a | b
    inline def is(b: hb_memory_mode_t): Boolean = (a & b) == b