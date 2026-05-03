package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GFloatIEEE754 = CArray[Byte, Nat._4]
object _GFloatIEEE754:
  given _tag: Tag[_GFloatIEEE754] = Tag.CArray[CChar, Nat._4](Tag.Byte, Tag.Nat4)
  
  def apply()(using Zone): Ptr[_GFloatIEEE754] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GFloatIEEE754](1)
    ___ptr
  
  @scala.annotation.targetName("apply_v_float")
  def apply(v_float: gfloat)(using Zone): Ptr[_GFloatIEEE754] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GFloatIEEE754](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gfloat]].update(0, v_float)
    ___ptr
  
  @scala.annotation.targetName("apply_mpn")
  def apply(mpn: _GFloatIEEE754_Mpn)(using Zone): Ptr[_GFloatIEEE754] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GFloatIEEE754](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_GFloatIEEE754_Mpn]].update(0, mpn)
    ___ptr
  
  extension (struct: _GFloatIEEE754)
    inline def v_float : gfloat = !struct.at(0).asInstanceOf[Ptr[gfloat]]
    inline def v_float_=(value: gfloat): Unit = !struct.at(0).asInstanceOf[Ptr[gfloat]] = value
    inline def mpn : _GFloatIEEE754_Mpn = !struct.at(0).asInstanceOf[Ptr[_GFloatIEEE754_Mpn]]
    inline def mpn_=(value: _GFloatIEEE754_Mpn): Unit = !struct.at(0).asInstanceOf[Ptr[_GFloatIEEE754_Mpn]] = value
opaque type _GFloatIEEE754_Mpn = CStruct3[guint, guint, guint]

object _GFloatIEEE754_Mpn:
  given _tag: Tag[_GFloatIEEE754_Mpn] = Tag.materializeCStruct3Tag[guint, guint, guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GFloatIEEE754_Mpn)
      inline def mantissa : guint = struct._1
      inline def mantissa_=(value: guint): Unit = (!struct.at1 = value)
      inline def biased_exponent : guint = struct._2
      inline def biased_exponent_=(value: guint): Unit = (!struct.at2 = value)
      inline def sign : guint = struct._3
      inline def sign_=(value: guint): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GFloatIEEE754_Mpn on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GFloatIEEE754_Mpn] = scala.scalanative.unsafe.alloc[_GFloatIEEE754_Mpn](1)
  def apply(mantissa : guint, biased_exponent : guint, sign : guint)(using Zone): Ptr[_GFloatIEEE754_Mpn] =
    val ____ptr = apply()
    (!____ptr).mantissa = mantissa
    (!____ptr).biased_exponent = biased_exponent
    (!____ptr).sign = sign
    ____ptr