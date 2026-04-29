package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSignalFlags: _SIGNAL_RUN_FIRST: Invoke the object method handler in the first emission stage. _SIGNAL_RUN_LAST: Invoke the object method handler in the third emission stage. _SIGNAL_RUN_CLEANUP: Invoke the object method handler in the last emission stage. _SIGNAL_NO_RECURSE: Signals being emitted for an object while currently being in emission for this very object will not be emitted recursively, but instead cause the first emission to be restarted. _SIGNAL_DETAILED: This signal supports "::detail" appendices to the signal name upon handler connections and emissions. _SIGNAL_ACTION: Action signals are signals that may freely be emitted on alive objects from user code via g_signal_emit() and friends, without the need of being embedded into extra code that performs pre or post emission adjustments on the object. They can also be thought of as object methods which can be called generically by third-party code. _SIGNAL_NO_HOOKS: No emissions hooks are supported for this signal. _SIGNAL_MUST_COLLECT: Varargs signal emission will always collect the arguments, even if there are no signal handlers connected. Since 2.30. _SIGNAL_DEPRECATED: The signal is deprecated and will be removed in a future version. A warning will be generated if it is connected while running with G_ENABLE_DIAGNOSTIC=1. Since 2.32. _SIGNAL_ACCUMULATOR_FIRST_RUN: Only used in #GSignalAccumulator accumulator functions for the #GSignalInvocationHint::run_type field to mark the first call to the accumulator function for a signal emission. Since 2.68.
*/
opaque type GSignalFlags = CUnsignedInt
object GSignalFlags extends _BindgenEnumCUnsignedInt[GSignalFlags]:
  given _tag: Tag[GSignalFlags] = Tag.UInt
  inline def define(inline a: Long): GSignalFlags = a.toUInt
  val G_SIGNAL_RUN_FIRST = define(1)
  val G_SIGNAL_RUN_LAST = define(2)
  val G_SIGNAL_RUN_CLEANUP = define(4)
  val G_SIGNAL_NO_RECURSE = define(8)
  val G_SIGNAL_DETAILED = define(16)
  val G_SIGNAL_ACTION = define(32)
  val G_SIGNAL_NO_HOOKS = define(64)
  val G_SIGNAL_MUST_COLLECT = define(128)
  val G_SIGNAL_DEPRECATED = define(256)
  val G_SIGNAL_ACCUMULATOR_FIRST_RUN = define(131072)
  def getName(value: GSignalFlags): Option[String] =
    value match
      case `G_SIGNAL_RUN_FIRST` => Some("G_SIGNAL_RUN_FIRST")
      case `G_SIGNAL_RUN_LAST` => Some("G_SIGNAL_RUN_LAST")
      case `G_SIGNAL_RUN_CLEANUP` => Some("G_SIGNAL_RUN_CLEANUP")
      case `G_SIGNAL_NO_RECURSE` => Some("G_SIGNAL_NO_RECURSE")
      case `G_SIGNAL_DETAILED` => Some("G_SIGNAL_DETAILED")
      case `G_SIGNAL_ACTION` => Some("G_SIGNAL_ACTION")
      case `G_SIGNAL_NO_HOOKS` => Some("G_SIGNAL_NO_HOOKS")
      case `G_SIGNAL_MUST_COLLECT` => Some("G_SIGNAL_MUST_COLLECT")
      case `G_SIGNAL_DEPRECATED` => Some("G_SIGNAL_DEPRECATED")
      case `G_SIGNAL_ACCUMULATOR_FIRST_RUN` => Some("G_SIGNAL_ACCUMULATOR_FIRST_RUN")
      case _ => _root_.scala.None
  extension (a: GSignalFlags)
    inline def &(b: GSignalFlags): GSignalFlags = a & b
    inline def |(b: GSignalFlags): GSignalFlags = a | b
    inline def is(b: GSignalFlags): Boolean = (a & b) == b