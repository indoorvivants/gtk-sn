package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDoubleIEEE754 = CArray[Byte, Nat._8]
object GDoubleIEEE754:
  given _tag: Tag[GDoubleIEEE754] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  
  def apply()(using Zone): Ptr[GDoubleIEEE754] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GDoubleIEEE754](1)
    ___ptr
  
  @scala.annotation.targetName("apply_v_double")
  def apply(v_double: _root_.sn.gnome.glib.internal.gdouble)(using Zone): Ptr[GDoubleIEEE754] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GDoubleIEEE754](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]].update(0, v_double)
    ___ptr
  
  @scala.annotation.targetName("apply_mpn")
  def apply(mpn: GDoubleIEEE754_Mpn)(using Zone): Ptr[GDoubleIEEE754] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GDoubleIEEE754](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[GDoubleIEEE754_Mpn]].update(0, mpn)
    ___ptr
  
  extension (struct: GDoubleIEEE754)
    inline def v_double : _root_.sn.gnome.glib.internal.gdouble = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]]
    inline def v_double_=(value: _root_.sn.gnome.glib.internal.gdouble): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]] = value
    inline def mpn : GDoubleIEEE754_Mpn = !struct.at(0).asInstanceOf[Ptr[GDoubleIEEE754_Mpn]]
    inline def mpn_=(value: GDoubleIEEE754_Mpn): Unit = !struct.at(0).asInstanceOf[Ptr[GDoubleIEEE754_Mpn]] = value
opaque type GDoubleIEEE754_Mpn = CStruct4[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]

object GDoubleIEEE754_Mpn:
  given _tag: Tag[GDoubleIEEE754_Mpn] = Tag.materializeCStruct4Tag[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDoubleIEEE754_Mpn)
      inline def mantissa_low : _root_.sn.gnome.glib.internal.guint = struct._1
      inline def mantissa_low_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at1 = value)
      inline def mantissa_high : _root_.sn.gnome.glib.internal.guint = struct._2
      inline def mantissa_high_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at2 = value)
      inline def biased_exponent : _root_.sn.gnome.glib.internal.guint = struct._3
      inline def biased_exponent_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at3 = value)
      inline def sign : _root_.sn.gnome.glib.internal.guint = struct._4
      inline def sign_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates GDoubleIEEE754_Mpn on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDoubleIEEE754_Mpn] = scala.scalanative.unsafe.alloc[GDoubleIEEE754_Mpn](1)
  def apply(mantissa_low : _root_.sn.gnome.glib.internal.guint, mantissa_high : _root_.sn.gnome.glib.internal.guint, biased_exponent : _root_.sn.gnome.glib.internal.guint, sign : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[GDoubleIEEE754_Mpn] =
    val ____ptr = apply()
    (!____ptr).mantissa_low = mantissa_low
    (!____ptr).mantissa_high = mantissa_high
    (!____ptr).biased_exponent = biased_exponent
    (!____ptr).sign = sign
    ____ptr