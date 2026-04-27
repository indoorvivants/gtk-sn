package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkEventControllerScrollFlags: _EVENT_CONTROLLER_SCROLL_NONE: Don't emit scroll. _EVENT_CONTROLLER_SCROLL_VERTICAL: Emit scroll with vertical deltas. _EVENT_CONTROLLER_SCROLL_HORIZONTAL: Emit scroll with horizontal deltas. _EVENT_CONTROLLER_SCROLL_DISCRETE: Only emit deltas that are multiples of 1. _EVENT_CONTROLLER_SCROLL_KINETIC: Emit ::decelerate after continuous scroll finishes. _EVENT_CONTROLLER_SCROLL_BOTH_AXES: Emit scroll on both axes.
*/
opaque type GtkEventControllerScrollFlags = CUnsignedInt
object GtkEventControllerScrollFlags extends _BindgenEnumCUnsignedInt[GtkEventControllerScrollFlags]:
  given _tag: Tag[GtkEventControllerScrollFlags] = Tag.UInt
  inline def define(inline a: Long): GtkEventControllerScrollFlags = a.toUInt
  val GTK_EVENT_CONTROLLER_SCROLL_NONE = define(0)
  val GTK_EVENT_CONTROLLER_SCROLL_VERTICAL = define(1)
  val GTK_EVENT_CONTROLLER_SCROLL_HORIZONTAL = define(2)
  val GTK_EVENT_CONTROLLER_SCROLL_DISCRETE = define(4)
  val GTK_EVENT_CONTROLLER_SCROLL_KINETIC = define(8)
  val GTK_EVENT_CONTROLLER_SCROLL_BOTH_AXES = define(3)
  def getName(value: GtkEventControllerScrollFlags): Option[String] =
    value match
      case `GTK_EVENT_CONTROLLER_SCROLL_NONE` => Some("GTK_EVENT_CONTROLLER_SCROLL_NONE")
      case `GTK_EVENT_CONTROLLER_SCROLL_VERTICAL` => Some("GTK_EVENT_CONTROLLER_SCROLL_VERTICAL")
      case `GTK_EVENT_CONTROLLER_SCROLL_HORIZONTAL` => Some("GTK_EVENT_CONTROLLER_SCROLL_HORIZONTAL")
      case `GTK_EVENT_CONTROLLER_SCROLL_DISCRETE` => Some("GTK_EVENT_CONTROLLER_SCROLL_DISCRETE")
      case `GTK_EVENT_CONTROLLER_SCROLL_KINETIC` => Some("GTK_EVENT_CONTROLLER_SCROLL_KINETIC")
      case `GTK_EVENT_CONTROLLER_SCROLL_BOTH_AXES` => Some("GTK_EVENT_CONTROLLER_SCROLL_BOTH_AXES")
      case _ => _root_.scala.None
  extension (a: GtkEventControllerScrollFlags)
    inline def &(b: GtkEventControllerScrollFlags): GtkEventControllerScrollFlags = a & b
    inline def |(b: GtkEventControllerScrollFlags): GtkEventControllerScrollFlags = a | b
    inline def is(b: GtkEventControllerScrollFlags): Boolean = (a & b) == b