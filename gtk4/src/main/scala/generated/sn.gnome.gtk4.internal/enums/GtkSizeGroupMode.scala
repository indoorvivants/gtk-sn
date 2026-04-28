package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkSizeGroupMode: _SIZE_GROUP_NONE: group has no effect _SIZE_GROUP_HORIZONTAL: group affects horizontal requisition _SIZE_GROUP_VERTICAL: group affects vertical requisition _SIZE_GROUP_BOTH: group affects both horizontal and vertical requisition
*/
opaque type GtkSizeGroupMode = CUnsignedInt
object GtkSizeGroupMode extends _BindgenEnumCUnsignedInt[GtkSizeGroupMode]:
  given _tag: Tag[GtkSizeGroupMode] = Tag.UInt
  inline def define(inline a: Long): GtkSizeGroupMode = a.toUInt
  val GTK_SIZE_GROUP_NONE = define(0)
  val GTK_SIZE_GROUP_HORIZONTAL = define(1)
  val GTK_SIZE_GROUP_VERTICAL = define(2)
  val GTK_SIZE_GROUP_BOTH = define(3)
  def getName(value: GtkSizeGroupMode): Option[String] =
    value match
      case `GTK_SIZE_GROUP_NONE` => Some("GTK_SIZE_GROUP_NONE")
      case `GTK_SIZE_GROUP_HORIZONTAL` => Some("GTK_SIZE_GROUP_HORIZONTAL")
      case `GTK_SIZE_GROUP_VERTICAL` => Some("GTK_SIZE_GROUP_VERTICAL")
      case `GTK_SIZE_GROUP_BOTH` => Some("GTK_SIZE_GROUP_BOTH")
      case _ => _root_.scala.None
  extension (a: GtkSizeGroupMode)
    inline def &(b: GtkSizeGroupMode): GtkSizeGroupMode = a & b
    inline def |(b: GtkSizeGroupMode): GtkSizeGroupMode = a | b
    inline def is(b: GtkSizeGroupMode): Boolean = (a & b) == b