package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkConstraintRelation: _CONSTRAINT_RELATION_EQ: Equal _CONSTRAINT_RELATION_LE: Less than, or equal _CONSTRAINT_RELATION_GE: Greater than, or equal
*/
opaque type GtkConstraintRelation = CInt
object GtkConstraintRelation extends _BindgenEnumCInt[GtkConstraintRelation]:
  given _tag: Tag[GtkConstraintRelation] = Tag.Int
  inline def define(inline a: CInt): GtkConstraintRelation = a
  val GTK_CONSTRAINT_RELATION_LE = define(-1)
  val GTK_CONSTRAINT_RELATION_EQ = define(0)
  val GTK_CONSTRAINT_RELATION_GE = define(1)
  def getName(value: GtkConstraintRelation): Option[String] =
    value match
      case `GTK_CONSTRAINT_RELATION_LE` => Some("GTK_CONSTRAINT_RELATION_LE")
      case `GTK_CONSTRAINT_RELATION_EQ` => Some("GTK_CONSTRAINT_RELATION_EQ")
      case `GTK_CONSTRAINT_RELATION_GE` => Some("GTK_CONSTRAINT_RELATION_GE")
      case _ => _root_.scala.None
  extension (a: GtkConstraintRelation)
    inline def &(b: GtkConstraintRelation): GtkConstraintRelation = a & b
    inline def |(b: GtkConstraintRelation): GtkConstraintRelation = a | b
    inline def is(b: GtkConstraintRelation): Boolean = (a & b) == b