package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GPrivate = CStruct3[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._2]]

object GPrivate:
  given _tag: Tag[GPrivate] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._2]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GPrivate)
      inline def p : _root_.sn.gnome.glib.internal.gpointer = struct._1
      inline def p_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at1 = value)
      inline def _notify : _root_.sn.gnome.glib.internal.GDestroyNotify = struct._2
      inline def _notify_=(value: _root_.sn.gnome.glib.internal.GDestroyNotify): Unit = (!struct.at2 = value)
      inline def future : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._2] = struct._3
      inline def future_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._2]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GPrivate on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GPrivate] = scala.scalanative.unsafe.alloc[GPrivate](1)
  def apply(p : _root_.sn.gnome.glib.internal.gpointer, _notify : _root_.sn.gnome.glib.internal.GDestroyNotify, future : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._2])(using Zone): Ptr[GPrivate] =
    val ____ptr = apply()
    (!____ptr).p = p
    (!____ptr)._notify = _notify
    (!____ptr).future = future
    ____ptr