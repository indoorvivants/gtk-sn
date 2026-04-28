package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSK_SUBSURFACE_NODE:
*/
opaque type GskRenderNodeType = CUnsignedInt
object GskRenderNodeType extends _BindgenEnumCUnsignedInt[GskRenderNodeType]:
  given _tag: Tag[GskRenderNodeType] = Tag.UInt
  inline def define(inline a: Long): GskRenderNodeType = a.toUInt
  val GSK_NOT_A_RENDER_NODE = define(0)
  val GSK_CONTAINER_NODE = define(1)
  val GSK_CAIRO_NODE = define(2)
  val GSK_COLOR_NODE = define(3)
  val GSK_LINEAR_GRADIENT_NODE = define(4)
  val GSK_REPEATING_LINEAR_GRADIENT_NODE = define(5)
  val GSK_RADIAL_GRADIENT_NODE = define(6)
  val GSK_REPEATING_RADIAL_GRADIENT_NODE = define(7)
  val GSK_CONIC_GRADIENT_NODE = define(8)
  val GSK_BORDER_NODE = define(9)
  val GSK_TEXTURE_NODE = define(10)
  val GSK_INSET_SHADOW_NODE = define(11)
  val GSK_OUTSET_SHADOW_NODE = define(12)
  val GSK_TRANSFORM_NODE = define(13)
  val GSK_OPACITY_NODE = define(14)
  val GSK_COLOR_MATRIX_NODE = define(15)
  val GSK_REPEAT_NODE = define(16)
  val GSK_CLIP_NODE = define(17)
  val GSK_ROUNDED_CLIP_NODE = define(18)
  val GSK_SHADOW_NODE = define(19)
  val GSK_BLEND_NODE = define(20)
  val GSK_CROSS_FADE_NODE = define(21)
  val GSK_TEXT_NODE = define(22)
  val GSK_BLUR_NODE = define(23)
  val GSK_DEBUG_NODE = define(24)
  val GSK_GL_SHADER_NODE = define(25)
  val GSK_TEXTURE_SCALE_NODE = define(26)
  val GSK_MASK_NODE = define(27)
  val GSK_FILL_NODE = define(28)
  val GSK_STROKE_NODE = define(29)
  val GSK_SUBSURFACE_NODE = define(30)
  def getName(value: GskRenderNodeType): Option[String] =
    value match
      case `GSK_NOT_A_RENDER_NODE` => Some("GSK_NOT_A_RENDER_NODE")
      case `GSK_CONTAINER_NODE` => Some("GSK_CONTAINER_NODE")
      case `GSK_CAIRO_NODE` => Some("GSK_CAIRO_NODE")
      case `GSK_COLOR_NODE` => Some("GSK_COLOR_NODE")
      case `GSK_LINEAR_GRADIENT_NODE` => Some("GSK_LINEAR_GRADIENT_NODE")
      case `GSK_REPEATING_LINEAR_GRADIENT_NODE` => Some("GSK_REPEATING_LINEAR_GRADIENT_NODE")
      case `GSK_RADIAL_GRADIENT_NODE` => Some("GSK_RADIAL_GRADIENT_NODE")
      case `GSK_REPEATING_RADIAL_GRADIENT_NODE` => Some("GSK_REPEATING_RADIAL_GRADIENT_NODE")
      case `GSK_CONIC_GRADIENT_NODE` => Some("GSK_CONIC_GRADIENT_NODE")
      case `GSK_BORDER_NODE` => Some("GSK_BORDER_NODE")
      case `GSK_TEXTURE_NODE` => Some("GSK_TEXTURE_NODE")
      case `GSK_INSET_SHADOW_NODE` => Some("GSK_INSET_SHADOW_NODE")
      case `GSK_OUTSET_SHADOW_NODE` => Some("GSK_OUTSET_SHADOW_NODE")
      case `GSK_TRANSFORM_NODE` => Some("GSK_TRANSFORM_NODE")
      case `GSK_OPACITY_NODE` => Some("GSK_OPACITY_NODE")
      case `GSK_COLOR_MATRIX_NODE` => Some("GSK_COLOR_MATRIX_NODE")
      case `GSK_REPEAT_NODE` => Some("GSK_REPEAT_NODE")
      case `GSK_CLIP_NODE` => Some("GSK_CLIP_NODE")
      case `GSK_ROUNDED_CLIP_NODE` => Some("GSK_ROUNDED_CLIP_NODE")
      case `GSK_SHADOW_NODE` => Some("GSK_SHADOW_NODE")
      case `GSK_BLEND_NODE` => Some("GSK_BLEND_NODE")
      case `GSK_CROSS_FADE_NODE` => Some("GSK_CROSS_FADE_NODE")
      case `GSK_TEXT_NODE` => Some("GSK_TEXT_NODE")
      case `GSK_BLUR_NODE` => Some("GSK_BLUR_NODE")
      case `GSK_DEBUG_NODE` => Some("GSK_DEBUG_NODE")
      case `GSK_GL_SHADER_NODE` => Some("GSK_GL_SHADER_NODE")
      case `GSK_TEXTURE_SCALE_NODE` => Some("GSK_TEXTURE_SCALE_NODE")
      case `GSK_MASK_NODE` => Some("GSK_MASK_NODE")
      case `GSK_FILL_NODE` => Some("GSK_FILL_NODE")
      case `GSK_STROKE_NODE` => Some("GSK_STROKE_NODE")
      case `GSK_SUBSURFACE_NODE` => Some("GSK_SUBSURFACE_NODE")
      case _ => _root_.scala.None
  extension (a: GskRenderNodeType)
    inline def &(b: GskRenderNodeType): GskRenderNodeType = a & b
    inline def |(b: GskRenderNodeType): GskRenderNodeType = a | b
    inline def is(b: GskRenderNodeType): Boolean = (a & b) == b