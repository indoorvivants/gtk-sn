package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GRecMutex = CStruct2[_root_.sn.gnome.glib.internal.gpointer, CArray[_root_.sn.gnome.glib.internal.guint, Nat._2]]

object GRecMutex:
  given _tag: Tag[GRecMutex] = Tag.materializeCStruct2Tag[_root_.sn.gnome.glib.internal.gpointer, CArray[_root_.sn.gnome.glib.internal.guint, Nat._2]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GRecMutex)
      inline def p : _root_.sn.gnome.glib.internal.gpointer = struct._1
      inline def p_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at1 = value)
      inline def i : CArray[_root_.sn.gnome.glib.internal.guint, Nat._2] = struct._2
      inline def i_=(value: CArray[_root_.sn.gnome.glib.internal.guint, Nat._2]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GRecMutex on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GRecMutex] = scala.scalanative.unsafe.alloc[GRecMutex](1)
  def apply(p : _root_.sn.gnome.glib.internal.gpointer, i : CArray[_root_.sn.gnome.glib.internal.guint, Nat._2])(using Zone): Ptr[GRecMutex] =
    val ____ptr = apply()
    (!____ptr).p = p
    (!____ptr).i = i
    ____ptr