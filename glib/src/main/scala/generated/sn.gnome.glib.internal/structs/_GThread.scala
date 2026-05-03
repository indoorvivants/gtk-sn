package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GThread = CStruct4[GThreadFunc, gpointer, gboolean, GThreadPriority]

object _GThread:
  given _tag: Tag[_GThread] = Tag.materializeCStruct4Tag[GThreadFunc, gpointer, gboolean, GThreadPriority]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GThread)
      inline def func : GThreadFunc = struct._1
      inline def func_=(value: GThreadFunc): Unit = (!struct.at1 = value)
      inline def data : gpointer = struct._2
      inline def data_=(value: gpointer): Unit = (!struct.at2 = value)
      inline def joinable : gboolean = struct._3
      inline def joinable_=(value: gboolean): Unit = (!struct.at3 = value)
      inline def priority : GThreadPriority = struct._4
      inline def priority_=(value: GThreadPriority): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GThread on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GThread] = scala.scalanative.unsafe.alloc[_GThread](1)
  def apply(func : GThreadFunc, data : gpointer, joinable : gboolean, priority : GThreadPriority)(using Zone): Ptr[_GThread] =
    val ____ptr = apply()
    (!____ptr).func = func
    (!____ptr).data = data
    (!____ptr).joinable = joinable
    (!____ptr).priority = priority
    ____ptr