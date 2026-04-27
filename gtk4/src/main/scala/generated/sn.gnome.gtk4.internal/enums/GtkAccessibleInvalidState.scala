package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkAccessibleInvalidState: _ACCESSIBLE_INVALID_FALSE: There are no detected errors in the value _ACCESSIBLE_INVALID_TRUE: The value entered by the user has failed validation _ACCESSIBLE_INVALID_GRAMMAR: A grammatical error was detected _ACCESSIBLE_INVALID_SPELLING: A spelling error was detected
*/
opaque type GtkAccessibleInvalidState = CUnsignedInt
object GtkAccessibleInvalidState extends _BindgenEnumCUnsignedInt[GtkAccessibleInvalidState]:
  given _tag: Tag[GtkAccessibleInvalidState] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleInvalidState = a.toUInt
  val GTK_ACCESSIBLE_INVALID_FALSE = define(0)
  val GTK_ACCESSIBLE_INVALID_TRUE = define(1)
  val GTK_ACCESSIBLE_INVALID_GRAMMAR = define(2)
  val GTK_ACCESSIBLE_INVALID_SPELLING = define(3)
  def getName(value: GtkAccessibleInvalidState): Option[String] =
    value match
      case `GTK_ACCESSIBLE_INVALID_FALSE` => Some("GTK_ACCESSIBLE_INVALID_FALSE")
      case `GTK_ACCESSIBLE_INVALID_TRUE` => Some("GTK_ACCESSIBLE_INVALID_TRUE")
      case `GTK_ACCESSIBLE_INVALID_GRAMMAR` => Some("GTK_ACCESSIBLE_INVALID_GRAMMAR")
      case `GTK_ACCESSIBLE_INVALID_SPELLING` => Some("GTK_ACCESSIBLE_INVALID_SPELLING")
      case _ => _root_.scala.None
  extension (a: GtkAccessibleInvalidState)
    inline def &(b: GtkAccessibleInvalidState): GtkAccessibleInvalidState = a & b
    inline def |(b: GtkAccessibleInvalidState): GtkAccessibleInvalidState = a | b
    inline def is(b: GtkAccessibleInvalidState): Boolean = (a & b) == b