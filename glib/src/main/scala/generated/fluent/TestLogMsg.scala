package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.TestLogType
import sn.gnome.glib.internal.{GTestLogMsg, guint}

class TestLogMsg private[gnome] (raw: Ptr[GTestLogMsg]):

  def getUnsafeRawPointer(): Ptr[GTestLogMsg] = this.raw

  def logType: sn.gnome.glib.TestLogType /* None */ =
    (!raw).log_type.asInstanceOf[GTestLogType]
  def logType_=(value: sn.gnome.glib.TestLogType /* None */ ): Unit =
    (!raw).log_type_=(value.raw.asInstanceOf[GTestLogType])

  def nStrings: UInt /* None */ = (!raw).n_strings.asInstanceOf[guint]
  def nStrings_=(value: UInt /* None */ ): Unit =
    (!raw).n_strings_=(guint(value).asInstanceOf[guint])
  @annotation.compileTimeOnly(
    "[field strings]: Cannot render type Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar**)))"
  )
  private def strings__ = ???

  def nNums: UInt /* None */ = (!raw).n_nums.asInstanceOf[guint]
  def nNums_=(value: UInt /* None */ ): Unit =
    (!raw).n_nums_=(guint(value).asInstanceOf[guint])
  @annotation.compileTimeOnly(
    "[field nums]: Cannot render type Type(List(),ListMap(@name -> DataRecord(long double), @type -> DataRecord(long double*)))"
  )
  private def nums__ = ???

  /** Internal function for gtester to free test log messages, no ABI guarantees
    * provided.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_test_log_msg_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTestLogMsg]]
    )
  end free

end TestLogMsg

object TestLogMsg:
  def fromRaw(ptr: Ptr[GTestLogMsg]): TestLogMsg = new TestLogMsg(ptr)
end TestLogMsg
