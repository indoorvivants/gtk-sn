package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkPrintQuality: _PRINT_QUALITY_LOW: Low quality. _PRINT_QUALITY_NORMAL: Normal quality. _PRINT_QUALITY_HIGH: High quality. _PRINT_QUALITY_DRAFT: Draft quality.
*/
opaque type GtkPrintQuality = CUnsignedInt
object GtkPrintQuality extends _BindgenEnumCUnsignedInt[GtkPrintQuality]:
  given _tag: Tag[GtkPrintQuality] = Tag.UInt
  inline def define(inline a: Long): GtkPrintQuality = a.toUInt
  val GTK_PRINT_QUALITY_LOW = define(0)
  val GTK_PRINT_QUALITY_NORMAL = define(1)
  val GTK_PRINT_QUALITY_HIGH = define(2)
  val GTK_PRINT_QUALITY_DRAFT = define(3)
  def getName(value: GtkPrintQuality): Option[String] =
    value match
      case `GTK_PRINT_QUALITY_LOW` => Some("GTK_PRINT_QUALITY_LOW")
      case `GTK_PRINT_QUALITY_NORMAL` => Some("GTK_PRINT_QUALITY_NORMAL")
      case `GTK_PRINT_QUALITY_HIGH` => Some("GTK_PRINT_QUALITY_HIGH")
      case `GTK_PRINT_QUALITY_DRAFT` => Some("GTK_PRINT_QUALITY_DRAFT")
      case _ => _root_.scala.None
  extension (a: GtkPrintQuality)
    inline def &(b: GtkPrintQuality): GtkPrintQuality = a & b
    inline def |(b: GtkPrintQuality): GtkPrintQuality = a | b
    inline def is(b: GtkPrintQuality): Boolean = (a & b) == b