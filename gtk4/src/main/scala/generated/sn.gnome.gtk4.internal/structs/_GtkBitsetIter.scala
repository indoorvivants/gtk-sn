package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkBitsetIter = CStruct1[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._0]]]

object _GtkBitsetIter:
  given _tag: Tag[_GtkBitsetIter] = Tag.materializeCStruct1Tag[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._0]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkBitsetIter)
      inline def private_data : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._0]] = struct._1
      inline def private_data_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._0]]): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GtkBitsetIter on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkBitsetIter] = scala.scalanative.unsafe.alloc[_GtkBitsetIter](1)
  def apply(private_data : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._0]])(using Zone): Ptr[_GtkBitsetIter] =
    val ____ptr = apply()
    (!____ptr).private_data = private_data
    ____ptr