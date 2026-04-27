package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkMessageType: _MESSAGE_INFO: Informational message _MESSAGE_WARNING: Non-fatal warning message _MESSAGE_QUESTION: Question requiring a choice _MESSAGE_ERROR: Fatal error message _MESSAGE_OTHER: None of the above
*/
opaque type GtkMessageType = CUnsignedInt
object GtkMessageType extends _BindgenEnumCUnsignedInt[GtkMessageType]:
  given _tag: Tag[GtkMessageType] = Tag.UInt
  inline def define(inline a: Long): GtkMessageType = a.toUInt
  val GTK_MESSAGE_INFO = define(0)
  val GTK_MESSAGE_WARNING = define(1)
  val GTK_MESSAGE_QUESTION = define(2)
  val GTK_MESSAGE_ERROR = define(3)
  val GTK_MESSAGE_OTHER = define(4)
  def getName(value: GtkMessageType): Option[String] =
    value match
      case `GTK_MESSAGE_INFO` => Some("GTK_MESSAGE_INFO")
      case `GTK_MESSAGE_WARNING` => Some("GTK_MESSAGE_WARNING")
      case `GTK_MESSAGE_QUESTION` => Some("GTK_MESSAGE_QUESTION")
      case `GTK_MESSAGE_ERROR` => Some("GTK_MESSAGE_ERROR")
      case `GTK_MESSAGE_OTHER` => Some("GTK_MESSAGE_OTHER")
      case _ => _root_.scala.None
  extension (a: GtkMessageType)
    inline def &(b: GtkMessageType): GtkMessageType = a & b
    inline def |(b: GtkMessageType): GtkMessageType = a | b
    inline def is(b: GtkMessageType): Boolean = (a & b) == b