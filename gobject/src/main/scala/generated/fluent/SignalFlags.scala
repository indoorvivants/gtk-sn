package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.GSignalFlags

/** The signal flags are used to specify a signal's behaviour.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SignalFlags private (val raw: GSignalFlags):
  def is(kv: SignalFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[SignalFlags.KnownValue]
    SignalFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"SignalFlags(${sb.result().mkString(", ")})"
end SignalFlags

object SignalFlags:
  export KnownValue.*

  def fromRaw(raw: GSignalFlags) = new SignalFlags(raw)

  extension (af: SignalFlags)
    def &(other: SignalFlags) =
      SignalFlags(af.raw & other.raw)
    def |(other: SignalFlags) =
      SignalFlags(af.raw | other.raw)

  /** The signal flags are used to specify a signal's behaviour.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GSignalFlags, name: scala.Predef.String)
      extends SignalFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** Invoke the object method handler in the first emission stage.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case RUN_FIRST
        extends KnownValue(GSignalFlags.G_SIGNAL_RUN_FIRST, "RUN_FIRST")

    /** Invoke the object method handler in the third emission stage.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case RUN_LAST extends KnownValue(GSignalFlags.G_SIGNAL_RUN_LAST, "RUN_LAST")

    /** Invoke the object method handler in the last emission stage.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case RUN_CLEANUP
        extends KnownValue(GSignalFlags.G_SIGNAL_RUN_CLEANUP, "RUN_CLEANUP")

    /** Signals being emitted for an object while currently being in emission
      * for this very object will not be emitted recursively, but instead cause
      * the first emission to be restarted.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NO_RECURSE
        extends KnownValue(GSignalFlags.G_SIGNAL_NO_RECURSE, "NO_RECURSE")

    /** This signal supports "::detail" appendices to the signal name upon
      * handler connections and emissions.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DETAILED extends KnownValue(GSignalFlags.G_SIGNAL_DETAILED, "DETAILED")

    /** Action signals are signals that may freely be emitted on alive objects
      * from user code via g_signal_emit() and friends, without the need of
      * being embedded into extra code that performs pre or post emission
      * adjustments on the object. They can also be thought of as object methods
      * which can be called generically by third-party code.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ACTION extends KnownValue(GSignalFlags.G_SIGNAL_ACTION, "ACTION")

    /** No emissions hooks are supported for this signal.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NO_HOOKS extends KnownValue(GSignalFlags.G_SIGNAL_NO_HOOKS, "NO_HOOKS")

    /** Varargs signal emission will always collect the arguments, even if there
      * are no signal handlers connected. Since 2.30.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case MUST_COLLECT
        extends KnownValue(GSignalFlags.G_SIGNAL_MUST_COLLECT, "MUST_COLLECT")

    /** The signal is deprecated and will be removed in a future version. A
      * warning will be generated if it is connected while running with
      * G_ENABLE_DIAGNOSTIC=1. Since 2.32.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DEPRECATED
        extends KnownValue(GSignalFlags.G_SIGNAL_DEPRECATED, "DEPRECATED")

    /** Only used in #GSignalAccumulator accumulator functions for the
      * #GSignalInvocationHint::run_type field to mark the first call to the
      * accumulator function for a signal emission. Since 2.68.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ACCUMULATOR_FIRST_RUN
        extends KnownValue(
          GSignalFlags.G_SIGNAL_ACCUMULATOR_FIRST_RUN,
          "ACCUMULATOR_FIRST_RUN"
        )
  end KnownValue
end SignalFlags
