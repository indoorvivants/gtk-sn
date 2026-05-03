package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkAccessibleTextContentChange: _ACCESSIBLE_TEXT_CONTENT_CHANGE_INSERT: contents change as the result of an insert operation _ACCESSIBLE_TEXT_CONTENT_CHANGE_REMOVE: contents change as the result of a remove operation
*/
opaque type GtkAccessibleTextContentChange = CUnsignedInt
object GtkAccessibleTextContentChange extends _BindgenEnumCUnsignedInt[GtkAccessibleTextContentChange]:
  given _tag: Tag[GtkAccessibleTextContentChange] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleTextContentChange = a.toUInt
  val GTK_ACCESSIBLE_TEXT_CONTENT_CHANGE_INSERT = define(0)
  val GTK_ACCESSIBLE_TEXT_CONTENT_CHANGE_REMOVE = define(1)
  def getName(value: GtkAccessibleTextContentChange): Option[String] =
    value match
      case `GTK_ACCESSIBLE_TEXT_CONTENT_CHANGE_INSERT` => Some("GTK_ACCESSIBLE_TEXT_CONTENT_CHANGE_INSERT")
      case `GTK_ACCESSIBLE_TEXT_CONTENT_CHANGE_REMOVE` => Some("GTK_ACCESSIBLE_TEXT_CONTENT_CHANGE_REMOVE")
      case _ => _root_.scala.None
  extension (a: GtkAccessibleTextContentChange)
    inline def &(b: GtkAccessibleTextContentChange): GtkAccessibleTextContentChange = a & b
    inline def |(b: GtkAccessibleTextContentChange): GtkAccessibleTextContentChange = a | b
    inline def is(b: GtkAccessibleTextContentChange): Boolean = (a & b) == b