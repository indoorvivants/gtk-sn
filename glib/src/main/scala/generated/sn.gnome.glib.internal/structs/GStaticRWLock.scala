package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GStaticRWLock = CStruct7[GStaticMutex, Ptr[GCond], Ptr[GCond], guint, gboolean, guint, guint]

object GStaticRWLock:
  given _tag: Tag[GStaticRWLock] = Tag.materializeCStruct7Tag[GStaticMutex, Ptr[GCond], Ptr[GCond], guint, gboolean, guint, guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GStaticRWLock)
      inline def mutex : GStaticMutex = struct._1
      inline def mutex_=(value: GStaticMutex): Unit = (!struct.at1 = value)
      inline def read_cond : Ptr[GCond] = struct._2
      inline def read_cond_=(value: Ptr[GCond]): Unit = (!struct.at2 = value)
      inline def write_cond : Ptr[GCond] = struct._3
      inline def write_cond_=(value: Ptr[GCond]): Unit = (!struct.at3 = value)
      inline def read_counter : guint = struct._4
      inline def read_counter_=(value: guint): Unit = (!struct.at4 = value)
      inline def have_writer : gboolean = struct._5
      inline def have_writer_=(value: gboolean): Unit = (!struct.at5 = value)
      inline def want_to_read : guint = struct._6
      inline def want_to_read_=(value: guint): Unit = (!struct.at6 = value)
      inline def want_to_write : guint = struct._7
      inline def want_to_write_=(value: guint): Unit = (!struct.at7 = value)
    end extension
  
  // Allocates GStaticRWLock on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GStaticRWLock] = scala.scalanative.unsafe.alloc[GStaticRWLock](1)
  def apply(mutex : GStaticMutex, read_cond : Ptr[GCond], write_cond : Ptr[GCond], read_counter : guint, have_writer : gboolean, want_to_read : guint, want_to_write : guint)(using Zone): Ptr[GStaticRWLock] =
    val ____ptr = apply()
    (!____ptr).mutex = mutex
    (!____ptr).read_cond = read_cond
    (!____ptr).write_cond = write_cond
    (!____ptr).read_counter = read_counter
    (!____ptr).have_writer = have_writer
    (!____ptr).want_to_read = want_to_read
    (!____ptr).want_to_write = want_to_write
    ____ptr