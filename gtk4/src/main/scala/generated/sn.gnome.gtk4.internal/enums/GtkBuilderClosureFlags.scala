package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkBuilderClosureFlags: _BUILDER_CLOSURE_SWAPPED: The closure should be created swapped. See g_cclosure_new_swap() for details.
*/
opaque type GtkBuilderClosureFlags = CUnsignedInt
object GtkBuilderClosureFlags extends _BindgenEnumCUnsignedInt[GtkBuilderClosureFlags]:
  given _tag: Tag[GtkBuilderClosureFlags] = Tag.UInt
  inline def define(inline a: Long): GtkBuilderClosureFlags = a.toUInt
  val GTK_BUILDER_CLOSURE_SWAPPED = define(1)
  def getName(value: GtkBuilderClosureFlags): Option[String] =
    value match
      case `GTK_BUILDER_CLOSURE_SWAPPED` => Some("GTK_BUILDER_CLOSURE_SWAPPED")
      case _ => _root_.scala.None
  extension (a: GtkBuilderClosureFlags)
    inline def &(b: GtkBuilderClosureFlags): GtkBuilderClosureFlags = a & b
    inline def |(b: GtkBuilderClosureFlags): GtkBuilderClosureFlags = a | b
    inline def is(b: GtkBuilderClosureFlags): Boolean = (a & b) == b