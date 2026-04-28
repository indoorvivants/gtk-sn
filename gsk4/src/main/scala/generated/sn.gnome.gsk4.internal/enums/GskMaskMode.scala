package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GskMaskMode: _MASK_MODE_ALPHA: Use the alpha channel of the mask _MASK_MODE_INVERTED_ALPHA: Use the inverted alpha channel of the mask _MASK_MODE_LUMINANCE: Use the luminance of the mask, multiplied by mask alpha _MASK_MODE_INVERTED_LUMINANCE: Use the inverted luminance of the mask, multiplied by mask alpha
*/
opaque type GskMaskMode = CUnsignedInt
object GskMaskMode extends _BindgenEnumCUnsignedInt[GskMaskMode]:
  given _tag: Tag[GskMaskMode] = Tag.UInt
  inline def define(inline a: Long): GskMaskMode = a.toUInt
  val GSK_MASK_MODE_ALPHA = define(0)
  val GSK_MASK_MODE_INVERTED_ALPHA = define(1)
  val GSK_MASK_MODE_LUMINANCE = define(2)
  val GSK_MASK_MODE_INVERTED_LUMINANCE = define(3)
  def getName(value: GskMaskMode): Option[String] =
    value match
      case `GSK_MASK_MODE_ALPHA` => Some("GSK_MASK_MODE_ALPHA")
      case `GSK_MASK_MODE_INVERTED_ALPHA` => Some("GSK_MASK_MODE_INVERTED_ALPHA")
      case `GSK_MASK_MODE_LUMINANCE` => Some("GSK_MASK_MODE_LUMINANCE")
      case `GSK_MASK_MODE_INVERTED_LUMINANCE` => Some("GSK_MASK_MODE_INVERTED_LUMINANCE")
      case _ => _root_.scala.None
  extension (a: GskMaskMode)
    inline def &(b: GskMaskMode): GskMaskMode = a & b
    inline def |(b: GskMaskMode): GskMaskMode = a | b
    inline def is(b: GskMaskMode): Boolean = (a & b) == b