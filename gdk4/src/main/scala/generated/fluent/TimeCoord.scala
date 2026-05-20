package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.AxisFlags
import sn.gnome.gdk4.internal.GdkTimeCoord
import sn.gnome.glib.internal.guint32

/** A `GdkTimeCoord` stores a single event in a motion history.
  *
  * To check whether an axis is present, check whether the corresponding flag
  * from the [flags@Gdk.AxisFlags] enumeration is set in the @flags To access
  * individual axis values, use the values of the values of the
  * [enum@Gdk.AxisUse] enumerations as indices.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TimeCoord private[gnome] (raw: Ptr[GdkTimeCoord]):

  def getUnsafeRawPointer(): Ptr[GdkTimeCoord] = this.raw

  /** The timestamp for this event
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def time: UInt /* None */ =
    (!raw).time.asInstanceOf[_root_.sn.gnome.glib.internal.guint32]

  /** The timestamp for this event
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def time_=(value: UInt /* None */ ): Unit = (!raw).time_=(
    guint32(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint32]
  )

  /** Flags indicating what axes are present, see [flags@Gdk.AxisFlags]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flags: sn.gnome.gdk4.AxisFlags /* None */ =
    (!raw).flags.asInstanceOf[GdkAxisFlags]

  /** Flags indicating what axes are present, see [flags@Gdk.AxisFlags]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flags_=(value: sn.gnome.gdk4.AxisFlags /* None */ ): Unit =
    (!raw).flags_=(value.raw.value.asInstanceOf[GdkAxisFlags])

  /** axis values, indexed by [enum@Gdk.AxisUse]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[field axes]: key not found: @type")
  private def axes__ = ???
end TimeCoord

object TimeCoord:
  def fromRaw(ptr: Ptr[GdkTimeCoord]): TimeCoord = new TimeCoord(ptr)
end TimeCoord
