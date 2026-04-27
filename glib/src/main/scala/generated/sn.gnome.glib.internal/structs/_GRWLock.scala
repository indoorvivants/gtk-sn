package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GRWLock = CStruct2[gpointer, CArray[guint, Nat._2]]

object _GRWLock:
  given _tag: Tag[_GRWLock] = Tag.materializeCStruct2Tag[gpointer, CArray[guint, Nat._2]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GRWLock)
      inline def p : gpointer = struct._1
      inline def p_=(value: gpointer): Unit = (!struct.at1 = value)
      inline def i : CArray[guint, Nat._2] = struct._2
      inline def i_=(value: CArray[guint, Nat._2]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GRWLock on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GRWLock] = scala.scalanative.unsafe.alloc[_GRWLock](1)
  def apply(p : gpointer, i : CArray[guint, Nat._2])(using Zone): Ptr[_GRWLock] =
    val ____ptr = apply()
    (!____ptr).p = p
    (!____ptr).i = i
    ____ptr