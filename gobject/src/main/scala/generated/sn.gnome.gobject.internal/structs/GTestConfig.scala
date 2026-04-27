package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTestConfig = CStruct6[_root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean]

object GTestConfig:
  given _tag: Tag[GTestConfig] = Tag.materializeCStruct6Tag[_root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GTestConfig)
      inline def test_initialized : _root_.sn.gnome.glib.internal.gboolean = struct._1
      inline def test_initialized_=(value: _root_.sn.gnome.glib.internal.gboolean): Unit = (!struct.at1 = value)
      inline def test_quick : _root_.sn.gnome.glib.internal.gboolean = struct._2
      inline def test_quick_=(value: _root_.sn.gnome.glib.internal.gboolean): Unit = (!struct.at2 = value)
      inline def test_perf : _root_.sn.gnome.glib.internal.gboolean = struct._3
      inline def test_perf_=(value: _root_.sn.gnome.glib.internal.gboolean): Unit = (!struct.at3 = value)
      inline def test_verbose : _root_.sn.gnome.glib.internal.gboolean = struct._4
      inline def test_verbose_=(value: _root_.sn.gnome.glib.internal.gboolean): Unit = (!struct.at4 = value)
      inline def test_quiet : _root_.sn.gnome.glib.internal.gboolean = struct._5
      inline def test_quiet_=(value: _root_.sn.gnome.glib.internal.gboolean): Unit = (!struct.at5 = value)
      inline def test_undefined : _root_.sn.gnome.glib.internal.gboolean = struct._6
      inline def test_undefined_=(value: _root_.sn.gnome.glib.internal.gboolean): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates GTestConfig on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GTestConfig] = scala.scalanative.unsafe.alloc[GTestConfig](1)
  def apply(test_initialized : _root_.sn.gnome.glib.internal.gboolean, test_quick : _root_.sn.gnome.glib.internal.gboolean, test_perf : _root_.sn.gnome.glib.internal.gboolean, test_verbose : _root_.sn.gnome.glib.internal.gboolean, test_quiet : _root_.sn.gnome.glib.internal.gboolean, test_undefined : _root_.sn.gnome.glib.internal.gboolean)(using Zone): Ptr[GTestConfig] =
    val ____ptr = apply()
    (!____ptr).test_initialized = test_initialized
    (!____ptr).test_quick = test_quick
    (!____ptr).test_perf = test_perf
    (!____ptr).test_verbose = test_verbose
    (!____ptr).test_quiet = test_quiet
    (!____ptr).test_undefined = test_undefined
    ____ptr