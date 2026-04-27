package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GThread = CStruct4[_root_.sn.gnome.glib.internal.GThreadFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.GThreadPriority]

object _GThread:
  given _tag: Tag[_GThread] = Tag.materializeCStruct4Tag[_root_.sn.gnome.glib.internal.GThreadFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.GThreadPriority]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GThread)
      inline def func : _root_.sn.gnome.glib.internal.GThreadFunc = struct._1
      inline def func_=(value: _root_.sn.gnome.glib.internal.GThreadFunc): Unit = (!struct.at1 = value)
      inline def data : _root_.sn.gnome.glib.internal.gpointer = struct._2
      inline def data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at2 = value)
      inline def joinable : _root_.sn.gnome.glib.internal.gboolean = struct._3
      inline def joinable_=(value: _root_.sn.gnome.glib.internal.gboolean): Unit = (!struct.at3 = value)
      inline def priority : _root_.sn.gnome.glib.internal.GThreadPriority = struct._4
      inline def priority_=(value: _root_.sn.gnome.glib.internal.GThreadPriority): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GThread on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GThread] = scala.scalanative.unsafe.alloc[_GThread](1)
  def apply(func : _root_.sn.gnome.glib.internal.GThreadFunc, data : _root_.sn.gnome.glib.internal.gpointer, joinable : _root_.sn.gnome.glib.internal.gboolean, priority : _root_.sn.gnome.glib.internal.GThreadPriority)(using Zone): Ptr[_GThread] =
    val ____ptr = apply()
    (!____ptr).func = func
    (!____ptr).data = data
    (!____ptr).joinable = joinable
    (!____ptr).priority = priority
    ____ptr