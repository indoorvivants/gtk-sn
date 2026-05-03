package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GDoubleIEEE754 = CArray[Byte, Nat._8]
object _GDoubleIEEE754:
  given _tag: Tag[_GDoubleIEEE754] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  
  def apply()(using Zone): Ptr[_GDoubleIEEE754] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GDoubleIEEE754](1)
    ___ptr
  
  @scala.annotation.targetName("apply_v_double")
  def apply(v_double: gdouble)(using Zone): Ptr[_GDoubleIEEE754] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GDoubleIEEE754](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gdouble]].update(0, v_double)
    ___ptr
  
  @scala.annotation.targetName("apply_mpn")
  def apply(mpn: _GDoubleIEEE754_Mpn)(using Zone): Ptr[_GDoubleIEEE754] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GDoubleIEEE754](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_GDoubleIEEE754_Mpn]].update(0, mpn)
    ___ptr
  
  extension (struct: _GDoubleIEEE754)
    inline def v_double : gdouble = !struct.at(0).asInstanceOf[Ptr[gdouble]]
    inline def v_double_=(value: gdouble): Unit = !struct.at(0).asInstanceOf[Ptr[gdouble]] = value
    inline def mpn : _GDoubleIEEE754_Mpn = !struct.at(0).asInstanceOf[Ptr[_GDoubleIEEE754_Mpn]]
    inline def mpn_=(value: _GDoubleIEEE754_Mpn): Unit = !struct.at(0).asInstanceOf[Ptr[_GDoubleIEEE754_Mpn]] = value
opaque type _GDoubleIEEE754_Mpn = CStruct4[guint, guint, guint, guint]

object _GDoubleIEEE754_Mpn:
  given _tag: Tag[_GDoubleIEEE754_Mpn] = Tag.materializeCStruct4Tag[guint, guint, guint, guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDoubleIEEE754_Mpn)
      inline def mantissa_low : guint = struct._1
      inline def mantissa_low_=(value: guint): Unit = (!struct.at1 = value)
      inline def mantissa_high : guint = struct._2
      inline def mantissa_high_=(value: guint): Unit = (!struct.at2 = value)
      inline def biased_exponent : guint = struct._3
      inline def biased_exponent_=(value: guint): Unit = (!struct.at3 = value)
      inline def sign : guint = struct._4
      inline def sign_=(value: guint): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GDoubleIEEE754_Mpn on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDoubleIEEE754_Mpn] = scala.scalanative.unsafe.alloc[_GDoubleIEEE754_Mpn](1)
  def apply(mantissa_low : guint, mantissa_high : guint, biased_exponent : guint, sign : guint)(using Zone): Ptr[_GDoubleIEEE754_Mpn] =
    val ____ptr = apply()
    (!____ptr).mantissa_low = mantissa_low
    (!____ptr).mantissa_high = mantissa_high
    (!____ptr).biased_exponent = biased_exponent
    (!____ptr).sign = sign
    ____ptr