package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTestConfig = CStruct6[gboolean, gboolean, gboolean, gboolean, gboolean, gboolean]

object GTestConfig:
  given _tag: Tag[GTestConfig] = Tag.materializeCStruct6Tag[gboolean, gboolean, gboolean, gboolean, gboolean, gboolean]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GTestConfig)
      inline def test_initialized : gboolean = struct._1
      inline def test_initialized_=(value: gboolean): Unit = (!struct.at1 = value)
      inline def test_quick : gboolean = struct._2
      inline def test_quick_=(value: gboolean): Unit = (!struct.at2 = value)
      inline def test_perf : gboolean = struct._3
      inline def test_perf_=(value: gboolean): Unit = (!struct.at3 = value)
      inline def test_verbose : gboolean = struct._4
      inline def test_verbose_=(value: gboolean): Unit = (!struct.at4 = value)
      inline def test_quiet : gboolean = struct._5
      inline def test_quiet_=(value: gboolean): Unit = (!struct.at5 = value)
      inline def test_undefined : gboolean = struct._6
      inline def test_undefined_=(value: gboolean): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates GTestConfig on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GTestConfig] = scala.scalanative.unsafe.alloc[GTestConfig](1)
  def apply(test_initialized : gboolean, test_quick : gboolean, test_perf : gboolean, test_verbose : gboolean, test_quiet : gboolean, test_undefined : gboolean)(using Zone): Ptr[GTestConfig] =
    val ____ptr = apply()
    (!____ptr).test_initialized = test_initialized
    (!____ptr).test_quick = test_quick
    (!____ptr).test_perf = test_perf
    (!____ptr).test_verbose = test_verbose
    (!____ptr).test_quiet = test_quiet
    (!____ptr).test_undefined = test_undefined
    ____ptr