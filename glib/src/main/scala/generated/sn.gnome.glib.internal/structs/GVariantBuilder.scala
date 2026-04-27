package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GVariantBuilder = CStruct1[GVariantBuilder_U]

object GVariantBuilder:
  given _tag: Tag[GVariantBuilder] = Tag.materializeCStruct1Tag[GVariantBuilder_U]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GVariantBuilder)
      inline def u : GVariantBuilder_U = struct._1
      inline def u_=(value: GVariantBuilder_U): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GVariantBuilder on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GVariantBuilder] = scala.scalanative.unsafe.alloc[GVariantBuilder](1)
  def apply(u : GVariantBuilder_U)(using Zone): Ptr[GVariantBuilder] =
    val ____ptr = apply()
    (!____ptr).u = u
    ____ptr
  
  
opaque type GVariantBuilder_U = CArray[Byte, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
object GVariantBuilder_U:
  given _tag: Tag[GVariantBuilder_U] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]](Tag.Byte, Tag.Digit3[Nat._1, Nat._2, Nat._8](Tag.Nat1, Tag.Nat2, Tag.Nat8))
  
  def apply()(using Zone): Ptr[GVariantBuilder_U] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GVariantBuilder_U](1)
    ___ptr
  
  @scala.annotation.targetName("apply_s")
  def apply(s: GVariantBuilder_U_S)(using Zone): Ptr[GVariantBuilder_U] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GVariantBuilder_U](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[GVariantBuilder_U_S]].update(0, s)
    ___ptr
  
  @scala.annotation.targetName("apply_x")
  def apply(x: CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[GVariantBuilder_U] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GVariantBuilder_U](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]].update(0, x)
    ___ptr
  
  extension (struct: GVariantBuilder_U)
    inline def s : GVariantBuilder_U_S = !struct.at(0).asInstanceOf[Ptr[GVariantBuilder_U_S]]
    inline def s_=(value: GVariantBuilder_U_S): Unit = !struct.at(0).asInstanceOf[Ptr[GVariantBuilder_U_S]] = value
    inline def x : CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]] = !struct.at(0).asInstanceOf[Ptr[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]]
    inline def x_=(value: CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[guintptr, Nat.Digit2[Nat._1, Nat._6]]]] = value
opaque type GVariantBuilder_U_S = CStruct3[gsize, Ptr[GVariantType], CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]]]

object GVariantBuilder_U_S:
  given _tag: Tag[GVariantBuilder_U_S] = Tag.materializeCStruct3Tag[gsize, Ptr[GVariantType], CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GVariantBuilder_U_S)
      inline def partial_magic : gsize = struct._1
      inline def partial_magic_=(value: gsize): Unit = (!struct.at1 = value)
      inline def `type` : Ptr[GVariantType] = struct._2
      inline def type_=(value: Ptr[GVariantType]): Unit = (!struct.at2 = value)
      inline def y : CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]] = struct._3
      inline def y_=(value: CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GVariantBuilder_U_S on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GVariantBuilder_U_S] = scala.scalanative.unsafe.alloc[GVariantBuilder_U_S](1)
  def apply(partial_magic : gsize, `type` : Ptr[GVariantType], y : CArray[guintptr, Nat.Digit2[Nat._1, Nat._4]])(using Zone): Ptr[GVariantBuilder_U_S] =
    val ____ptr = apply()
    (!____ptr).partial_magic = partial_magic
    (!____ptr).`type` = `type`
    (!____ptr).y = y
    ____ptr