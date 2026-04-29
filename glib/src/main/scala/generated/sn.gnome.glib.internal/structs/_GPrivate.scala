package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GPrivate = CStruct3[gpointer, GDestroyNotify, CArray[gpointer, Nat._2]]

object _GPrivate:
  given _tag: Tag[_GPrivate] = Tag.materializeCStruct3Tag[gpointer, GDestroyNotify, CArray[gpointer, Nat._2]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GPrivate)
      inline def p : gpointer = struct._1
      inline def p_=(value: gpointer): Unit = (!struct.at1 = value)
      inline def _notify : GDestroyNotify = struct._2
      inline def _notify_=(value: GDestroyNotify): Unit = (!struct.at2 = value)
      inline def future : CArray[gpointer, Nat._2] = struct._3
      inline def future_=(value: CArray[gpointer, Nat._2]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GPrivate on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GPrivate] = scala.scalanative.unsafe.alloc[_GPrivate](1)
  def apply(p : gpointer, _notify : GDestroyNotify, future : CArray[gpointer, Nat._2])(using Zone): Ptr[_GPrivate] =
    val ____ptr = apply()
    (!____ptr).p = p
    (!____ptr)._notify = _notify
    (!____ptr).future = future
    ____ptr