package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkPropagationLimit: _LIMIT_NONE: Events are handled regardless of what their target is. _LIMIT_SAME_NATIVE: Events are only handled if their target is in the same [iface] as the event controllers widget. Note that some event types have two targets (origin and destination).
*/
opaque type GtkPropagationLimit = CUnsignedInt
object GtkPropagationLimit extends _BindgenEnumCUnsignedInt[GtkPropagationLimit]:
  given _tag: Tag[GtkPropagationLimit] = Tag.UInt
  inline def define(inline a: Long): GtkPropagationLimit = a.toUInt
  val GTK_LIMIT_NONE = define(0)
  val GTK_LIMIT_SAME_NATIVE = define(1)
  def getName(value: GtkPropagationLimit): Option[String] =
    value match
      case `GTK_LIMIT_NONE` => Some("GTK_LIMIT_NONE")
      case `GTK_LIMIT_SAME_NATIVE` => Some("GTK_LIMIT_SAME_NATIVE")
      case _ => _root_.scala.None
  extension (a: GtkPropagationLimit)
    inline def &(b: GtkPropagationLimit): GtkPropagationLimit = a & b
    inline def |(b: GtkPropagationLimit): GtkPropagationLimit = a | b
    inline def is(b: GtkPropagationLimit): Boolean = (a & b) == b