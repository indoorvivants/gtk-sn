package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GStaticRWLock = CStruct7[_root_.sn.gnome.glib.internal.GStaticMutex, Ptr[_root_.sn.gnome.glib.internal.GCond], Ptr[_root_.sn.gnome.glib.internal.GCond], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]

object GStaticRWLock:
  given _tag: Tag[GStaticRWLock] = Tag.materializeCStruct7Tag[_root_.sn.gnome.glib.internal.GStaticMutex, Ptr[_root_.sn.gnome.glib.internal.GCond], Ptr[_root_.sn.gnome.glib.internal.GCond], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GStaticRWLock)
      inline def mutex : _root_.sn.gnome.glib.internal.GStaticMutex = struct._1
      inline def mutex_=(value: _root_.sn.gnome.glib.internal.GStaticMutex): Unit = (!struct.at1 = value)
      inline def read_cond : Ptr[_root_.sn.gnome.glib.internal.GCond] = struct._2
      inline def read_cond_=(value: Ptr[_root_.sn.gnome.glib.internal.GCond]): Unit = (!struct.at2 = value)
      inline def write_cond : Ptr[_root_.sn.gnome.glib.internal.GCond] = struct._3
      inline def write_cond_=(value: Ptr[_root_.sn.gnome.glib.internal.GCond]): Unit = (!struct.at3 = value)
      inline def read_counter : _root_.sn.gnome.glib.internal.guint = struct._4
      inline def read_counter_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at4 = value)
      inline def have_writer : _root_.sn.gnome.glib.internal.gboolean = struct._5
      inline def have_writer_=(value: _root_.sn.gnome.glib.internal.gboolean): Unit = (!struct.at5 = value)
      inline def want_to_read : _root_.sn.gnome.glib.internal.guint = struct._6
      inline def want_to_read_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at6 = value)
      inline def want_to_write : _root_.sn.gnome.glib.internal.guint = struct._7
      inline def want_to_write_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at7 = value)
    end extension
  
  // Allocates GStaticRWLock on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GStaticRWLock] = scala.scalanative.unsafe.alloc[GStaticRWLock](1)
  def apply(mutex : _root_.sn.gnome.glib.internal.GStaticMutex, read_cond : Ptr[_root_.sn.gnome.glib.internal.GCond], write_cond : Ptr[_root_.sn.gnome.glib.internal.GCond], read_counter : _root_.sn.gnome.glib.internal.guint, have_writer : _root_.sn.gnome.glib.internal.gboolean, want_to_read : _root_.sn.gnome.glib.internal.guint, want_to_write : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[GStaticRWLock] =
    val ____ptr = apply()
    (!____ptr).mutex = mutex
    (!____ptr).read_cond = read_cond
    (!____ptr).write_cond = write_cond
    (!____ptr).read_counter = read_counter
    (!____ptr).have_writer = have_writer
    (!____ptr).want_to_read = want_to_read
    (!____ptr).want_to_write = want_to_write
    ____ptr