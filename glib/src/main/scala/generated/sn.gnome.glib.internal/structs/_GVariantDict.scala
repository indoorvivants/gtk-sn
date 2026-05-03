package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GVariantDict = CStruct1[_GVariantDict_U]

object _GVariantDict:
  given _tag: Tag[_GVariantDict] = Tag.materializeCStruct1Tag[_GVariantDict_U]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GVariantDict)
      inline def u : _GVariantDict_U = struct._1
      inline def u_=(value: _GVariantDict_U): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GVariantDict on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GVariantDict] = scala.scalanative.unsafe.alloc[_GVariantDict](1)
  def apply(u : _GVariantDict_U)(using Zone): Ptr[_GVariantDict] =
    val ____ptr = apply()
    (!____ptr).u = u
    ____ptr
  
  
opaque type _GVariantDict_U = CArray[Byte, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
object _GVariantDict_U:
  given _tag: Tag[_GVariantDict_U] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]](Tag.Byte, Tag.Digit3[Nat._1, Nat._2, Nat._8](Tag.Nat1, Tag.Nat2, Tag.Nat8))
  
  def apply()(using Zone): Ptr[_GVariantDict_U] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GVariantDict_U](1)
    ___ptr
  
  @scala.annotation.targetName("apply_s")
  def apply(s: _GVariantDict_U_S)(using Zone): Ptr[_GVariantDict_U] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GVariantDict_U](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_GVariantDict_U_S]].update(0, s)
    ___ptr
  
  @scala.annotation.targetName("apply_x")
  def apply(x: CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[_GVariantDict_U] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GVariantDict_U](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]].update(0, x)
    ___ptr
  
  extension (struct: _GVariantDict_U)
    inline def s : _GVariantDict_U_S = !struct.at(0).asInstanceOf[Ptr[_GVariantDict_U_S]]
    inline def s_=(value: _GVariantDict_U_S): Unit = !struct.at(0).asInstanceOf[Ptr[_GVariantDict_U_S]] = value
    inline def x : CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]] = !struct.at(0).asInstanceOf[Ptr[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]]
    inline def x_=(value: CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]] = value
opaque type _GVariantDict_U_S = CStruct3[Ptr[GVariant], gsize, CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]]]

object _GVariantDict_U_S:
  given _tag: Tag[_GVariantDict_U_S] = Tag.materializeCStruct3Tag[Ptr[GVariant], gsize, CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GVariantDict_U_S)
      inline def asv : Ptr[GVariant] = struct._1
      inline def asv_=(value: Ptr[GVariant]): Unit = (!struct.at1 = value)
      inline def partial_magic : gsize = struct._2
      inline def partial_magic_=(value: gsize): Unit = (!struct.at2 = value)
      inline def y : CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]] = struct._3
      inline def y_=(value: CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GVariantDict_U_S on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GVariantDict_U_S] = scala.scalanative.unsafe.alloc[_GVariantDict_U_S](1)
  def apply(asv : Ptr[GVariant], partial_magic : gsize, y : CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]])(using Zone): Ptr[_GVariantDict_U_S] =
    val ____ptr = apply()
    (!____ptr).asv = asv
    (!____ptr).partial_magic = partial_magic
    (!____ptr).y = y
    ____ptr