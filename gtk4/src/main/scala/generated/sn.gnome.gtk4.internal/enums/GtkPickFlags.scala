package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkPickFlags: _PICK_DEFAULT: The default behavior, include widgets that are receiving events _PICK_INSENSITIVE: Include widgets that are insensitive _PICK_NON_TARGETABLE: Include widgets that are marked as non-targetable. See [property:can-target]
*/
opaque type GtkPickFlags = CUnsignedInt
object GtkPickFlags extends _BindgenEnumCUnsignedInt[GtkPickFlags]:
  given _tag: Tag[GtkPickFlags] = Tag.UInt
  inline def define(inline a: Long): GtkPickFlags = a.toUInt
  val GTK_PICK_DEFAULT = define(0)
  val GTK_PICK_INSENSITIVE = define(1)
  val GTK_PICK_NON_TARGETABLE = define(2)
  def getName(value: GtkPickFlags): Option[String] =
    value match
      case `GTK_PICK_DEFAULT` => Some("GTK_PICK_DEFAULT")
      case `GTK_PICK_INSENSITIVE` => Some("GTK_PICK_INSENSITIVE")
      case `GTK_PICK_NON_TARGETABLE` => Some("GTK_PICK_NON_TARGETABLE")
      case _ => _root_.scala.None
  extension (a: GtkPickFlags)
    inline def &(b: GtkPickFlags): GtkPickFlags = a & b
    inline def |(b: GtkPickFlags): GtkPickFlags = a | b
    inline def is(b: GtkPickFlags): Boolean = (a & b) == b