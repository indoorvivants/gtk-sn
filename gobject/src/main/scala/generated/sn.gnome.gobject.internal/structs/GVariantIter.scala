package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GVariantIter = CStruct1[CArray[_root_.sn.gnome.glib.internal.guintptr, Nat.Digit2[Nat._1, Nat._6]]]

object GVariantIter:
  given _tag: Tag[GVariantIter] = Tag.materializeCStruct1Tag[CArray[_root_.sn.gnome.glib.internal.guintptr, Nat.Digit2[Nat._1, Nat._6]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GVariantIter)
      inline def x : CArray[_root_.sn.gnome.glib.internal.guintptr, Nat.Digit2[Nat._1, Nat._6]] = struct._1
      inline def x_=(value: CArray[_root_.sn.gnome.glib.internal.guintptr, Nat.Digit2[Nat._1, Nat._6]]): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GVariantIter on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GVariantIter] = scala.scalanative.unsafe.alloc[GVariantIter](1)
  def apply(x : CArray[_root_.sn.gnome.glib.internal.guintptr, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[GVariantIter] =
    val ____ptr = apply()
    (!____ptr).x = x
    ____ptr