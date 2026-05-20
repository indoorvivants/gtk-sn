package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{GTimer, gboolean, gint}

/** Opaque datatype that records a start time.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Timer private[gnome] (raw: Ptr[GTimer]):

  def getUnsafeRawPointer(): Ptr[GTimer] = this.raw

  /** Resumes a timer that has previously been stopped with g_timer_stop().
    * g_timer_stop() must be called before using this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def continue(): Unit /* None */ =
    g_timer_continue(this.getUnsafeRawPointer().asInstanceOf[Ptr[GTimer]])
  end continue

  /** Destroys a timer, freeing associated resources.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def destroy(): Unit /* None */ =
    g_timer_destroy(this.getUnsafeRawPointer().asInstanceOf[Ptr[GTimer]])
  end destroy

  /** If @timer has been started but not stopped, obtains the time since the
    * timer was started. If @timer has been stopped, obtains the elapsed time
    * between the time it was started and the time it was stopped. The return
    * value is the number of seconds elapsed, including any fractional part. The @microseconds
    * out parameter is essentially useless.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method elapsed/<method parameters>/microseconds]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gulong), @type -> DataRecord(gulong*)))"
  )
  private def elapsed__ = ???

  /** Exposes whether the timer is currently active.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isActive(): Boolean /* None */ =
    g_timer_is_active(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTimer]]
    ).value.!=(0)
  end isActive

  /** This function is useless; it's fine to call g_timer_start() on an
    * already-started timer to reset the start time, so g_timer_reset() serves
    * no purpose.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def reset(): Unit /* None */ =
    g_timer_reset(this.getUnsafeRawPointer().asInstanceOf[Ptr[GTimer]])
  end reset

  /** Marks a start time, so that future calls to g_timer_elapsed() will report
    * the time since g_timer_start() was called. g_timer_new() automatically
    * marks the start time, so no need to call g_timer_start() immediately after
    * creating the timer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def start(): Unit /* None */ =
    g_timer_start(this.getUnsafeRawPointer().asInstanceOf[Ptr[GTimer]])
  end start

  /** Marks an end time, so calls to g_timer_elapsed() will return the
    * difference between this end time and the start time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def stop(): Unit /* None */ =
    g_timer_stop(this.getUnsafeRawPointer().asInstanceOf[Ptr[GTimer]])
  end stop

end Timer

object Timer:
  def fromRaw(ptr: Ptr[GTimer]): Timer = new Timer(ptr)
end Timer
