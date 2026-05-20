package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{GTestConfig, gboolean, gint}

class TestConfig private[gnome] (raw: Ptr[GTestConfig]):

  def getUnsafeRawPointer(): Ptr[GTestConfig] = this.raw

  def testInitialized: Boolean /* None */ =
    (!raw).test_initialized.asInstanceOf[gboolean]
  def testInitialized_=(value: Boolean /* None */ ): Unit =
    (!raw).test_initialized_=(
      gboolean(gint((if value == true then 1 else 0))).asInstanceOf[gboolean]
    )

  def testQuick: Boolean /* None */ = (!raw).test_quick.asInstanceOf[gboolean]
  def testQuick_=(value: Boolean /* None */ ): Unit = (!raw).test_quick_=(
    gboolean(gint((if value == true then 1 else 0))).asInstanceOf[gboolean]
  )

  def testPerf: Boolean /* None */ = (!raw).test_perf.asInstanceOf[gboolean]
  def testPerf_=(value: Boolean /* None */ ): Unit = (!raw).test_perf_=(
    gboolean(gint((if value == true then 1 else 0))).asInstanceOf[gboolean]
  )

  def testVerbose: Boolean /* None */ =
    (!raw).test_verbose.asInstanceOf[gboolean]
  def testVerbose_=(value: Boolean /* None */ ): Unit = (!raw).test_verbose_=(
    gboolean(gint((if value == true then 1 else 0))).asInstanceOf[gboolean]
  )

  def testQuiet: Boolean /* None */ = (!raw).test_quiet.asInstanceOf[gboolean]
  def testQuiet_=(value: Boolean /* None */ ): Unit = (!raw).test_quiet_=(
    gboolean(gint((if value == true then 1 else 0))).asInstanceOf[gboolean]
  )

  def testUndefined: Boolean /* None */ =
    (!raw).test_undefined.asInstanceOf[gboolean]
  def testUndefined_=(value: Boolean /* None */ ): Unit =
    (!raw).test_undefined_=(
      gboolean(gint((if value == true then 1 else 0))).asInstanceOf[gboolean]
    )
end TestConfig

object TestConfig:
  def fromRaw(ptr: Ptr[GTestConfig]): TestConfig = new TestConfig(ptr)
end TestConfig
