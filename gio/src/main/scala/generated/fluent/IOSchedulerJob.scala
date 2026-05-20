package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GIOSchedulerJob

/** Opaque class for defining and scheduling IO jobs.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class IOSchedulerJob private[gnome] (raw: Ptr[GIOSchedulerJob]):

  def getUnsafeRawPointer(): Ptr[GIOSchedulerJob] = this.raw

  /** Used from an I/O job to send a callback to be run in the thread that the
    * job was started from, waiting for the result (and thus blocking the I/O
    * job).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method send_to_mainloop/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.SourceFunc), @type -> DataRecord(GSourceFunc)))"
  )
  private def sendToMainloop__ = ???

  /** Used from an I/O job to send a callback to be run asynchronously in the
    * thread that the job was started from. The callback will be run when the
    * main loop is available, but at that time the I/O job might have finished.
    * The return value from the callback is ignored.
    *
    * Note that if you are passing the @user_data from g_io_scheduler_push_job()
    * on to this function you have to ensure that it is not freed before
    * @func
    *   is called, either by passing %NULL as @notify to
    *   g_io_scheduler_push_job() or by using refcounting for @user_data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method send_to_mainloop_async/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.SourceFunc), @type -> DataRecord(GSourceFunc)))"
  )
  private def sendToMainloopAsync__ = ???

end IOSchedulerJob

object IOSchedulerJob:
  def fromRaw(ptr: Ptr[GIOSchedulerJob]): IOSchedulerJob = new IOSchedulerJob(
    ptr
  )
end IOSchedulerJob
