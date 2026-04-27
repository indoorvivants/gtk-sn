package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkCollation: _COLLATION_NONE: Don't do any collation _COLLATION_UNICODE: Use [func.utf8_collate_key] _COLLATION_FILENAME: Use [func.utf8_collate_key_for_filename]
*/
opaque type GtkCollation = CUnsignedInt
object GtkCollation extends _BindgenEnumCUnsignedInt[GtkCollation]:
  given _tag: Tag[GtkCollation] = Tag.UInt
  inline def define(inline a: Long): GtkCollation = a.toUInt
  val GTK_COLLATION_NONE = define(0)
  val GTK_COLLATION_UNICODE = define(1)
  val GTK_COLLATION_FILENAME = define(2)
  def getName(value: GtkCollation): Option[String] =
    value match
      case `GTK_COLLATION_NONE` => Some("GTK_COLLATION_NONE")
      case `GTK_COLLATION_UNICODE` => Some("GTK_COLLATION_UNICODE")
      case `GTK_COLLATION_FILENAME` => Some("GTK_COLLATION_FILENAME")
      case _ => _root_.scala.None
  extension (a: GtkCollation)
    inline def &(b: GtkCollation): GtkCollation = a & b
    inline def |(b: GtkCollation): GtkCollation = a | b
    inline def is(b: GtkCollation): Boolean = (a & b) == b