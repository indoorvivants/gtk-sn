package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GCClosure = CStruct2[GClosure, _root_.sn.gnome.glib.internal.gpointer]

object _GCClosure:
  given _tag: Tag[_GCClosure] = Tag.materializeCStruct2Tag[GClosure, _root_.sn.gnome.glib.internal.gpointer]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GCClosure)
      inline def closure : GClosure = struct._1
      inline def closure_=(value: GClosure): Unit = (!struct.at1 = value)
      inline def callback : _root_.sn.gnome.glib.internal.gpointer = struct._2
      inline def callback_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GCClosure on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GCClosure] = scala.scalanative.unsafe.alloc[_GCClosure](1)
  def apply(closure : GClosure, callback : _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[_GCClosure] =
    val ____ptr = apply()
    (!____ptr).closure = closure
    (!____ptr).callback = callback
    ____ptr