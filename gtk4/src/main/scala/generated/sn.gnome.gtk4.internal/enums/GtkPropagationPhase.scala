package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkPropagationPhase: _PHASE_NONE: Events are not delivered. _PHASE_CAPTURE: Events are delivered in the capture phase. The capture phase happens before the bubble phase, runs from the toplevel down to the event widget. This option should only be used on containers that might possibly handle events before their children do. _PHASE_BUBBLE: Events are delivered in the bubble phase. The bubble phase happens after the capture phase, and before the default handlers are run. This phase runs from the event widget, up to the toplevel. _PHASE_TARGET: Events are delivered in the default widget event handlers, note that widget implementations must chain up on button, motion, touch and grab broken handlers for controllers in this phase to be run.
*/
opaque type GtkPropagationPhase = CUnsignedInt
object GtkPropagationPhase extends _BindgenEnumCUnsignedInt[GtkPropagationPhase]:
  given _tag: Tag[GtkPropagationPhase] = Tag.UInt
  inline def define(inline a: Long): GtkPropagationPhase = a.toUInt
  val GTK_PHASE_NONE = define(0)
  val GTK_PHASE_CAPTURE = define(1)
  val GTK_PHASE_BUBBLE = define(2)
  val GTK_PHASE_TARGET = define(3)
  def getName(value: GtkPropagationPhase): Option[String] =
    value match
      case `GTK_PHASE_NONE` => Some("GTK_PHASE_NONE")
      case `GTK_PHASE_CAPTURE` => Some("GTK_PHASE_CAPTURE")
      case `GTK_PHASE_BUBBLE` => Some("GTK_PHASE_BUBBLE")
      case `GTK_PHASE_TARGET` => Some("GTK_PHASE_TARGET")
      case _ => _root_.scala.None
  extension (a: GtkPropagationPhase)
    inline def &(b: GtkPropagationPhase): GtkPropagationPhase = a & b
    inline def |(b: GtkPropagationPhase): GtkPropagationPhase = a | b
    inline def is(b: GtkPropagationPhase): Boolean = (a & b) == b