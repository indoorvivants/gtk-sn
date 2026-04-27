package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GUriParamsIter = CStruct4[_root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, CArray[_root_.sn.gnome.glib.internal.guint8, Nat.Digit3[Nat._2, Nat._5, Nat._6]]]

object _GUriParamsIter:
  given _tag: Tag[_GUriParamsIter] = Tag.materializeCStruct4Tag[_root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, CArray[_root_.sn.gnome.glib.internal.guint8, Nat.Digit3[Nat._2, Nat._5, Nat._6]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GUriParamsIter)
      inline def dummy0 : _root_.sn.gnome.glib.internal.gint = struct._1
      inline def dummy0_=(value: _root_.sn.gnome.glib.internal.gint): Unit = (!struct.at1 = value)
      inline def dummy1 : _root_.sn.gnome.glib.internal.gpointer = struct._2
      inline def dummy1_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at2 = value)
      inline def dummy2 : _root_.sn.gnome.glib.internal.gpointer = struct._3
      inline def dummy2_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at3 = value)
      inline def dummy3 : CArray[_root_.sn.gnome.glib.internal.guint8, Nat.Digit3[Nat._2, Nat._5, Nat._6]] = struct._4
      inline def dummy3_=(value: CArray[_root_.sn.gnome.glib.internal.guint8, Nat.Digit3[Nat._2, Nat._5, Nat._6]]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GUriParamsIter on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GUriParamsIter] = scala.scalanative.unsafe.alloc[_GUriParamsIter](1)
  def apply(dummy0 : _root_.sn.gnome.glib.internal.gint, dummy1 : _root_.sn.gnome.glib.internal.gpointer, dummy2 : _root_.sn.gnome.glib.internal.gpointer, dummy3 : CArray[_root_.sn.gnome.glib.internal.guint8, Nat.Digit3[Nat._2, Nat._5, Nat._6]])(using Zone): Ptr[_GUriParamsIter] =
    val ____ptr = apply()
    (!____ptr).dummy0 = dummy0
    (!____ptr).dummy1 = dummy1
    (!____ptr).dummy2 = dummy2
    (!____ptr).dummy3 = dummy3
    ____ptr