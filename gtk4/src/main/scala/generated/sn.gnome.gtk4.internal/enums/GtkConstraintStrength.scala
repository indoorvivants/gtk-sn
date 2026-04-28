package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkConstraintStrength: _CONSTRAINT_STRENGTH_REQUIRED: The constraint is required towards solving the layout _CONSTRAINT_STRENGTH_STRONG: A strong constraint _CONSTRAINT_STRENGTH_MEDIUM: A medium constraint _CONSTRAINT_STRENGTH_WEAK: A weak constraint
*/
opaque type GtkConstraintStrength = CUnsignedInt
object GtkConstraintStrength extends _BindgenEnumCUnsignedInt[GtkConstraintStrength]:
  given _tag: Tag[GtkConstraintStrength] = Tag.UInt
  inline def define(inline a: Long): GtkConstraintStrength = a.toUInt
  val GTK_CONSTRAINT_STRENGTH_REQUIRED = define(1001001000)
  val GTK_CONSTRAINT_STRENGTH_STRONG = define(1000000000)
  val GTK_CONSTRAINT_STRENGTH_MEDIUM = define(1000)
  val GTK_CONSTRAINT_STRENGTH_WEAK = define(1)
  def getName(value: GtkConstraintStrength): Option[String] =
    value match
      case `GTK_CONSTRAINT_STRENGTH_REQUIRED` => Some("GTK_CONSTRAINT_STRENGTH_REQUIRED")
      case `GTK_CONSTRAINT_STRENGTH_STRONG` => Some("GTK_CONSTRAINT_STRENGTH_STRONG")
      case `GTK_CONSTRAINT_STRENGTH_MEDIUM` => Some("GTK_CONSTRAINT_STRENGTH_MEDIUM")
      case `GTK_CONSTRAINT_STRENGTH_WEAK` => Some("GTK_CONSTRAINT_STRENGTH_WEAK")
      case _ => _root_.scala.None
  extension (a: GtkConstraintStrength)
    inline def &(b: GtkConstraintStrength): GtkConstraintStrength = a & b
    inline def |(b: GtkConstraintStrength): GtkConstraintStrength = a | b
    inline def is(b: GtkConstraintStrength): Boolean = (a & b) == b