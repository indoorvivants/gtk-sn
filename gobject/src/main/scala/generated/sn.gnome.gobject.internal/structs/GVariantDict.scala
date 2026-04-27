package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GVariantDict = CStruct1[GVariantDict_U]

object GVariantDict:
  given _tag: Tag[GVariantDict] = Tag.materializeCStruct1Tag[GVariantDict_U]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GVariantDict)
      inline def u : GVariantDict_U = struct._1
      inline def u_=(value: GVariantDict_U): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GVariantDict on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GVariantDict] = scala.scalanative.unsafe.alloc[GVariantDict](1)
  def apply(u : GVariantDict_U)(using Zone): Ptr[GVariantDict] =
    val ____ptr = apply()
    (!____ptr).u = u
    ____ptr
  
  
opaque type GVariantDict_U = CArray[Byte, Nat.Digit3[Nat._1, Nat._2, Nat._8]]
object GVariantDict_U:
  given _tag: Tag[GVariantDict_U] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]](Tag.Byte, Tag.Digit3[Nat._1, Nat._2, Nat._8](Tag.Nat1, Tag.Nat2, Tag.Nat8))
  
  def apply()(using Zone): Ptr[GVariantDict_U] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GVariantDict_U](1)
    ___ptr
  
  @scala.annotation.targetName("apply_s")
  def apply(s: GVariantDict_U_S)(using Zone): Ptr[GVariantDict_U] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GVariantDict_U](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[GVariantDict_U_S]].update(0, s)
    ___ptr
  
  @scala.annotation.targetName("apply_x")
  def apply(x: CArray[_root_.sn.gnome.glib.internal.guintptr, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[GVariantDict_U] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GVariantDict_U](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.guintptr, Nat.Digit2[Nat._1, Nat._6]]]].update(0, x)
    ___ptr
  
  extension (struct: GVariantDict_U)
    inline def s : GVariantDict_U_S = !struct.at(0).asInstanceOf[Ptr[GVariantDict_U_S]]
    inline def s_=(value: GVariantDict_U_S): Unit = !struct.at(0).asInstanceOf[Ptr[GVariantDict_U_S]] = value
    inline def x : CArray[_root_.sn.gnome.glib.internal.guintptr, Nat.Digit2[Nat._1, Nat._6]] = !struct.at(0).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.guintptr, Nat.Digit2[Nat._1, Nat._6]]]]
    inline def x_=(value: CArray[_root_.sn.gnome.glib.internal.guintptr, Nat.Digit2[Nat._1, Nat._6]]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.guintptr, Nat.Digit2[Nat._1, Nat._6]]]] = value
opaque type GVariantDict_U_S = CStruct3[Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gsize, CArray[_root_.sn.gnome.glib.internal.guintptr, Nat.Digit2[Nat._1, Nat._4]]]

object GVariantDict_U_S:
  given _tag: Tag[GVariantDict_U_S] = Tag.materializeCStruct3Tag[Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gsize, CArray[_root_.sn.gnome.glib.internal.guintptr, Nat.Digit2[Nat._1, Nat._4]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GVariantDict_U_S)
      inline def asv : Ptr[_root_.sn.gnome.glib.internal.GVariant] = struct._1
      inline def asv_=(value: Ptr[_root_.sn.gnome.glib.internal.GVariant]): Unit = (!struct.at1 = value)
      inline def partial_magic : _root_.sn.gnome.glib.internal.gsize = struct._2
      inline def partial_magic_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = (!struct.at2 = value)
      inline def y : CArray[_root_.sn.gnome.glib.internal.guintptr, Nat.Digit2[Nat._1, Nat._4]] = struct._3
      inline def y_=(value: CArray[_root_.sn.gnome.glib.internal.guintptr, Nat.Digit2[Nat._1, Nat._4]]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GVariantDict_U_S on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GVariantDict_U_S] = scala.scalanative.unsafe.alloc[GVariantDict_U_S](1)
  def apply(asv : Ptr[_root_.sn.gnome.glib.internal.GVariant], partial_magic : _root_.sn.gnome.glib.internal.gsize, y : CArray[_root_.sn.gnome.glib.internal.guintptr, Nat.Digit2[Nat._1, Nat._4]])(using Zone): Ptr[GVariantDict_U_S] =
    val ____ptr = apply()
    (!____ptr).asv = asv
    (!____ptr).partial_magic = partial_magic
    (!____ptr).y = y
    ____ptr