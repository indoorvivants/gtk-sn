package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkOrientation: _ORIENTATION_HORIZONTAL: The element is in horizontal orientation. _ORIENTATION_VERTICAL: The element is in vertical orientation.
*/
opaque type GtkOrientation = CUnsignedInt
object GtkOrientation extends _BindgenEnumCUnsignedInt[GtkOrientation]:
  given _tag: Tag[GtkOrientation] = Tag.UInt
  inline def define(inline a: Long): GtkOrientation = a.toUInt
  val GTK_ORIENTATION_HORIZONTAL = define(0)
  val GTK_ORIENTATION_VERTICAL = define(1)
  def getName(value: GtkOrientation): Option[String] =
    value match
      case `GTK_ORIENTATION_HORIZONTAL` => Some("GTK_ORIENTATION_HORIZONTAL")
      case `GTK_ORIENTATION_VERTICAL` => Some("GTK_ORIENTATION_VERTICAL")
      case _ => _root_.scala.None
  extension (a: GtkOrientation)
    inline def &(b: GtkOrientation): GtkOrientation = a & b
    inline def |(b: GtkOrientation): GtkOrientation = a | b
    inline def is(b: GtkOrientation): Boolean = (a & b) == b