package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GVariantIter = CStruct1[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]

object _GVariantIter:
  given _tag: Tag[_GVariantIter] = Tag.materializeCStruct1Tag[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GVariantIter)
      inline def x : CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]] = struct._1
      inline def x_=(value: CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GVariantIter on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GVariantIter] = scala.scalanative.unsafe.alloc[_GVariantIter](1)
  def apply(x : CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[_GVariantIter] =
    val ____ptr = apply()
    (!____ptr).x = x
    ____ptr