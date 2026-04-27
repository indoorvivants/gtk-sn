package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GPathBuf = CStruct1[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object _GPathBuf:
  given _tag: Tag[_GPathBuf] = Tag.materializeCStruct1Tag[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GPathBuf)
      inline def dummy : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._1
      inline def dummy_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GPathBuf on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GPathBuf] = scala.scalanative.unsafe.alloc[_GPathBuf](1)
  def apply(dummy : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[_GPathBuf] =
    val ____ptr = apply()
    (!____ptr).dummy = dummy
    ____ptr