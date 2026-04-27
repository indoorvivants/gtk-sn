package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GVariantClass = CUnsignedInt
object GVariantClass extends _BindgenEnumCUnsignedInt[GVariantClass]:
  given _tag: Tag[GVariantClass] = Tag.UInt
  inline def define(inline a: Long): GVariantClass = a.toUInt
  val G_VARIANT_CLASS_BOOLEAN = define(98)
  val G_VARIANT_CLASS_BYTE = define(121)
  val G_VARIANT_CLASS_INT16 = define(110)
  val G_VARIANT_CLASS_UINT16 = define(113)
  val G_VARIANT_CLASS_INT32 = define(105)
  val G_VARIANT_CLASS_UINT32 = define(117)
  val G_VARIANT_CLASS_INT64 = define(120)
  val G_VARIANT_CLASS_UINT64 = define(116)
  val G_VARIANT_CLASS_HANDLE = define(104)
  val G_VARIANT_CLASS_DOUBLE = define(100)
  val G_VARIANT_CLASS_STRING = define(115)
  val G_VARIANT_CLASS_OBJECT_PATH = define(111)
  val G_VARIANT_CLASS_SIGNATURE = define(103)
  val G_VARIANT_CLASS_VARIANT = define(118)
  val G_VARIANT_CLASS_MAYBE = define(109)
  val G_VARIANT_CLASS_ARRAY = define(97)
  val G_VARIANT_CLASS_TUPLE = define(40)
  val G_VARIANT_CLASS_DICT_ENTRY = define(123)
  def getName(value: GVariantClass): Option[String] =
    value match
      case `G_VARIANT_CLASS_BOOLEAN` => Some("G_VARIANT_CLASS_BOOLEAN")
      case `G_VARIANT_CLASS_BYTE` => Some("G_VARIANT_CLASS_BYTE")
      case `G_VARIANT_CLASS_INT16` => Some("G_VARIANT_CLASS_INT16")
      case `G_VARIANT_CLASS_UINT16` => Some("G_VARIANT_CLASS_UINT16")
      case `G_VARIANT_CLASS_INT32` => Some("G_VARIANT_CLASS_INT32")
      case `G_VARIANT_CLASS_UINT32` => Some("G_VARIANT_CLASS_UINT32")
      case `G_VARIANT_CLASS_INT64` => Some("G_VARIANT_CLASS_INT64")
      case `G_VARIANT_CLASS_UINT64` => Some("G_VARIANT_CLASS_UINT64")
      case `G_VARIANT_CLASS_HANDLE` => Some("G_VARIANT_CLASS_HANDLE")
      case `G_VARIANT_CLASS_DOUBLE` => Some("G_VARIANT_CLASS_DOUBLE")
      case `G_VARIANT_CLASS_STRING` => Some("G_VARIANT_CLASS_STRING")
      case `G_VARIANT_CLASS_OBJECT_PATH` => Some("G_VARIANT_CLASS_OBJECT_PATH")
      case `G_VARIANT_CLASS_SIGNATURE` => Some("G_VARIANT_CLASS_SIGNATURE")
      case `G_VARIANT_CLASS_VARIANT` => Some("G_VARIANT_CLASS_VARIANT")
      case `G_VARIANT_CLASS_MAYBE` => Some("G_VARIANT_CLASS_MAYBE")
      case `G_VARIANT_CLASS_ARRAY` => Some("G_VARIANT_CLASS_ARRAY")
      case `G_VARIANT_CLASS_TUPLE` => Some("G_VARIANT_CLASS_TUPLE")
      case `G_VARIANT_CLASS_DICT_ENTRY` => Some("G_VARIANT_CLASS_DICT_ENTRY")
      case _ => _root_.scala.None
  extension (a: GVariantClass)
    inline def &(b: GVariantClass): GVariantClass = a & b
    inline def |(b: GVariantClass): GVariantClass = a | b
    inline def is(b: GVariantClass): Boolean = (a & b) == b