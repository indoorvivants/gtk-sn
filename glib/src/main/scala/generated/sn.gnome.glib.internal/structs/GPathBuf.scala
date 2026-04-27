package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GPathBuf = CStruct1[CArray[gpointer, Nat._8]]

object GPathBuf:
  given _tag: Tag[GPathBuf] = Tag.materializeCStruct1Tag[CArray[gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GPathBuf)
      inline def dummy : CArray[gpointer, Nat._8] = struct._1
      inline def dummy_=(value: CArray[gpointer, Nat._8]): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GPathBuf on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GPathBuf] = scala.scalanative.unsafe.alloc[GPathBuf](1)
  def apply(dummy : CArray[gpointer, Nat._8])(using Zone): Ptr[GPathBuf] =
    val ____ptr = apply()
    (!____ptr).dummy = dummy
    ____ptr