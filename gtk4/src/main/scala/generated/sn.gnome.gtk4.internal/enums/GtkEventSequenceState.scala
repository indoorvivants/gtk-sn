package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkEventSequenceState: _EVENT_SEQUENCE_NONE: The sequence is handled, but not grabbed. _EVENT_SEQUENCE_CLAIMED: The sequence is handled and grabbed. _EVENT_SEQUENCE_DENIED: The sequence is denied.
*/
opaque type GtkEventSequenceState = CUnsignedInt
object GtkEventSequenceState extends _BindgenEnumCUnsignedInt[GtkEventSequenceState]:
  given _tag: Tag[GtkEventSequenceState] = Tag.UInt
  inline def define(inline a: Long): GtkEventSequenceState = a.toUInt
  val GTK_EVENT_SEQUENCE_NONE = define(0)
  val GTK_EVENT_SEQUENCE_CLAIMED = define(1)
  val GTK_EVENT_SEQUENCE_DENIED = define(2)
  def getName(value: GtkEventSequenceState): Option[String] =
    value match
      case `GTK_EVENT_SEQUENCE_NONE` => Some("GTK_EVENT_SEQUENCE_NONE")
      case `GTK_EVENT_SEQUENCE_CLAIMED` => Some("GTK_EVENT_SEQUENCE_CLAIMED")
      case `GTK_EVENT_SEQUENCE_DENIED` => Some("GTK_EVENT_SEQUENCE_DENIED")
      case _ => _root_.scala.None
  extension (a: GtkEventSequenceState)
    inline def &(b: GtkEventSequenceState): GtkEventSequenceState = a & b
    inline def |(b: GtkEventSequenceState): GtkEventSequenceState = a | b
    inline def is(b: GtkEventSequenceState): Boolean = (a & b) == b