package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkOrdering: _ORDERING_SMALLER: the first value is smaller than the second _ORDERING_EQUAL: the two values are equal _ORDERING_LARGER: the first value is larger than the second
*/
opaque type GtkOrdering = CInt
object GtkOrdering extends _BindgenEnumCInt[GtkOrdering]:
  given _tag: Tag[GtkOrdering] = Tag.Int
  inline def define(inline a: CInt): GtkOrdering = a
  val GTK_ORDERING_SMALLER = define(-1)
  val GTK_ORDERING_EQUAL = define(0)
  val GTK_ORDERING_LARGER = define(1)
  def getName(value: GtkOrdering): Option[String] =
    value match
      case `GTK_ORDERING_SMALLER` => Some("GTK_ORDERING_SMALLER")
      case `GTK_ORDERING_EQUAL` => Some("GTK_ORDERING_EQUAL")
      case `GTK_ORDERING_LARGER` => Some("GTK_ORDERING_LARGER")
      case _ => _root_.scala.None
  extension (a: GtkOrdering)
    inline def &(b: GtkOrdering): GtkOrdering = a & b
    inline def |(b: GtkOrdering): GtkOrdering = a | b
    inline def is(b: GtkOrdering): Boolean = (a & b) == b