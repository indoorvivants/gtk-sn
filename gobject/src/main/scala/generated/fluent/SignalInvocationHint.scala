package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.SignalFlags
import sn.gnome.gobject.internal.GSignalInvocationHint

/** The #GSignalInvocationHint structure is used to pass on additional
  * information to callbacks during a signal emission.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SignalInvocationHint private[gnome] (raw: Ptr[GSignalInvocationHint]):

  def getUnsafeRawPointer(): Ptr[GSignalInvocationHint] = this.raw

  /** The signal id of the signal invoking the callback
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def signalId: UInt /* None */ =
    (!raw).signal_id.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** The signal id of the signal invoking the callback
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def signalId_=(value: UInt /* None */ ): Unit = (!raw).signal_id_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )

  /** The detail passed on for this emission
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field detail]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def detail__ = ???

  /** The stage the signal emission is currently in, this field will contain one
    * of %G_SIGNAL_RUN_FIRST, %G_SIGNAL_RUN_LAST or %G_SIGNAL_RUN_CLEANUP and
    * %G_SIGNAL_ACCUMULATOR_FIRST_RUN. %G_SIGNAL_ACCUMULATOR_FIRST_RUN is only
    * set for the first run of the accumulator function for a signal emission.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def runType: sn.gnome.gobject.SignalFlags /* None */ =
    (!raw).run_type.asInstanceOf[GSignalFlags]

  /** The stage the signal emission is currently in, this field will contain one
    * of %G_SIGNAL_RUN_FIRST, %G_SIGNAL_RUN_LAST or %G_SIGNAL_RUN_CLEANUP and
    * %G_SIGNAL_ACCUMULATOR_FIRST_RUN. %G_SIGNAL_ACCUMULATOR_FIRST_RUN is only
    * set for the first run of the accumulator function for a signal emission.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def runType_=(value: sn.gnome.gobject.SignalFlags /* None */ ): Unit =
    (!raw).run_type_=(value.raw.value.asInstanceOf[GSignalFlags])
end SignalInvocationHint

object SignalInvocationHint:
  def fromRaw(ptr: Ptr[GSignalInvocationHint]): SignalInvocationHint =
    new SignalInvocationHint(ptr)
end SignalInvocationHint
