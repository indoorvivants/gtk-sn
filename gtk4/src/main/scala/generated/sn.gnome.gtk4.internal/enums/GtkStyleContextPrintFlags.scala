package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkStyleContextPrintFlags = CUnsignedInt
object GtkStyleContextPrintFlags extends _BindgenEnumCUnsignedInt[GtkStyleContextPrintFlags]:
  given _tag: Tag[GtkStyleContextPrintFlags] = Tag.UInt
  inline def define(inline a: Long): GtkStyleContextPrintFlags = a.toUInt
  val GTK_STYLE_CONTEXT_PRINT_NONE = define(0)
  val GTK_STYLE_CONTEXT_PRINT_RECURSE = define(1)
  val GTK_STYLE_CONTEXT_PRINT_SHOW_STYLE = define(2)
  val GTK_STYLE_CONTEXT_PRINT_SHOW_CHANGE = define(4)
  def getName(value: GtkStyleContextPrintFlags): Option[String] =
    value match
      case `GTK_STYLE_CONTEXT_PRINT_NONE` => Some("GTK_STYLE_CONTEXT_PRINT_NONE")
      case `GTK_STYLE_CONTEXT_PRINT_RECURSE` => Some("GTK_STYLE_CONTEXT_PRINT_RECURSE")
      case `GTK_STYLE_CONTEXT_PRINT_SHOW_STYLE` => Some("GTK_STYLE_CONTEXT_PRINT_SHOW_STYLE")
      case `GTK_STYLE_CONTEXT_PRINT_SHOW_CHANGE` => Some("GTK_STYLE_CONTEXT_PRINT_SHOW_CHANGE")
      case _ => _root_.scala.None
  extension (a: GtkStyleContextPrintFlags)
    inline def &(b: GtkStyleContextPrintFlags): GtkStyleContextPrintFlags = a & b
    inline def |(b: GtkStyleContextPrintFlags): GtkStyleContextPrintFlags = a | b
    inline def is(b: GtkStyleContextPrintFlags): Boolean = (a & b) == b