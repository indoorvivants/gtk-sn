package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GThreadPool = CStruct3[_root_.sn.gnome.glib.internal.GFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]

object GThreadPool:
  given _tag: Tag[GThreadPool] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.GFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GThreadPool)
      inline def func : _root_.sn.gnome.glib.internal.GFunc = struct._1
      inline def func_=(value: _root_.sn.gnome.glib.internal.GFunc): Unit = (!struct.at1 = value)
      inline def user_data : _root_.sn.gnome.glib.internal.gpointer = struct._2
      inline def user_data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at2 = value)
      inline def exclusive : _root_.sn.gnome.glib.internal.gboolean = struct._3
      inline def exclusive_=(value: _root_.sn.gnome.glib.internal.gboolean): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GThreadPool on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GThreadPool] = scala.scalanative.unsafe.alloc[GThreadPool](1)
  def apply(func : _root_.sn.gnome.glib.internal.GFunc, user_data : _root_.sn.gnome.glib.internal.gpointer, exclusive : _root_.sn.gnome.glib.internal.gboolean)(using Zone): Ptr[GThreadPool] =
    val ____ptr = apply()
    (!____ptr).func = func
    (!____ptr).user_data = user_data
    (!____ptr).exclusive = exclusive
    ____ptr