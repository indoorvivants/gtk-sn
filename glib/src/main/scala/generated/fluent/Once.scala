package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.OnceStatus
import sn.gnome.glib.internal.GOnce

/** A #GOnce struct controls a one-time initialization function. Any one-time
  * initialization function must have its own unique #GOnce struct.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Once private[gnome] (raw: Ptr[GOnce]):

  def getUnsafeRawPointer(): Ptr[GOnce] = this.raw

  /** the status of the #GOnce
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def status: sn.gnome.glib.OnceStatus /* None */ =
    (!raw).status.asInstanceOf[GOnceStatus]

  /** the status of the #GOnce
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def status_=(value: sn.gnome.glib.OnceStatus /* None */ ): Unit =
    (!raw).status_=(value.raw.asInstanceOf[GOnceStatus])

  /** the value returned by the call to the function, if @status is
    * %G_ONCE_STATUS_READY
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field retval]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(volatile gpointer)))"
  )
  private def retval__ = ???
  @annotation.compileTimeOnly(
    "[method impl/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ThreadFunc), @type -> DataRecord(GThreadFunc)))"
  )
  private def impl__ = ???

end Once

object Once:
  def fromRaw(ptr: Ptr[GOnce]): Once = new Once(ptr)
end Once
