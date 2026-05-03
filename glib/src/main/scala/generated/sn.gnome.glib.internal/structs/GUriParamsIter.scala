package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GUriParamsIter = CStruct4[gint, gpointer, gpointer, CArray[guint8, Nat.Digit3[Nat._2, Nat._5, Nat._6]]]

object GUriParamsIter:
  given _tag: Tag[GUriParamsIter] = Tag.materializeCStruct4Tag[gint, gpointer, gpointer, CArray[guint8, Nat.Digit3[Nat._2, Nat._5, Nat._6]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GUriParamsIter)
      inline def dummy0 : gint = struct._1
      inline def dummy0_=(value: gint): Unit = (!struct.at1 = value)
      inline def dummy1 : gpointer = struct._2
      inline def dummy1_=(value: gpointer): Unit = (!struct.at2 = value)
      inline def dummy2 : gpointer = struct._3
      inline def dummy2_=(value: gpointer): Unit = (!struct.at3 = value)
      inline def dummy3 : CArray[guint8, Nat.Digit3[Nat._2, Nat._5, Nat._6]] = struct._4
      inline def dummy3_=(value: CArray[guint8, Nat.Digit3[Nat._2, Nat._5, Nat._6]]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates GUriParamsIter on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GUriParamsIter] = scala.scalanative.unsafe.alloc[GUriParamsIter](1)
  def apply(dummy0 : gint, dummy1 : gpointer, dummy2 : gpointer, dummy3 : CArray[guint8, Nat.Digit3[Nat._2, Nat._5, Nat._6]])(using Zone): Ptr[GUriParamsIter] =
    val ____ptr = apply()
    (!____ptr).dummy0 = dummy0
    (!____ptr).dummy1 = dummy1
    (!____ptr).dummy2 = dummy2
    (!____ptr).dummy3 = dummy3
    ____ptr