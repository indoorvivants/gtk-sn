package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.TestLogMsg
import sn.gnome.glib.internal.{GTestLogBuffer, guint, guint8}

class TestLogBuffer private[gnome] (raw: Ptr[GTestLogBuffer]):

  def getUnsafeRawPointer(): Ptr[GTestLogBuffer] = this.raw

  /** Internal function for gtester to free test log messages, no ABI guarantees
    * provided.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_test_log_buffer_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTestLogBuffer]]
    )
  end free

  /** Internal function for gtester to retrieve test log messages, no ABI
    * guarantees provided.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pop(): sn.gnome.glib.TestLogMsg /* None */ =
    sn.gnome.glib.TestLogMsg.fromRaw(
      g_test_log_buffer_pop(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTestLogBuffer]]
      )
    )
  end pop

  /** Internal function for gtester to decode test log messages, no ABI
    * guarantees provided.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def push(
      n_bytes: UInt /* Some(guint) */,
      bytes: Ptr[guint8] /* Some(Ptr[guint8]) */
  ): Unit /* None */ =
    g_test_log_buffer_push(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTestLogBuffer]],
      guint(n_bytes),
      bytes.asInstanceOf[Ptr[guint8]]
    )
  end push

end TestLogBuffer

object TestLogBuffer:
  def fromRaw(ptr: Ptr[GTestLogBuffer]): TestLogBuffer = new TestLogBuffer(ptr)
end TestLogBuffer
