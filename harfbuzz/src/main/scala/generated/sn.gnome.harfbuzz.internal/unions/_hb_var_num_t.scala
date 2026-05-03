package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _hb_var_num_t = CArray[Byte, Nat._4]
object _hb_var_num_t:
  given _tag: Tag[_hb_var_num_t] = Tag.CArray[CChar, Nat._4](Tag.Byte, Tag.Nat4)
  
  def apply()(using Zone): Ptr[_hb_var_num_t] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_hb_var_num_t](1)
    ___ptr
  
  @scala.annotation.targetName("apply_f")
  def apply(f: Float)(using Zone): Ptr[_hb_var_num_t] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_hb_var_num_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[Float]].update(0, f)
    ___ptr
  
  @scala.annotation.targetName("apply_u32")
  def apply(u32: uint32_t)(using Zone): Ptr[_hb_var_num_t] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_hb_var_num_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[uint32_t]].update(0, u32)
    ___ptr
  
  @scala.annotation.targetName("apply_i32")
  def apply(i32: int32_t)(using Zone): Ptr[_hb_var_num_t] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_hb_var_num_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[int32_t]].update(0, i32)
    ___ptr
  
  @scala.annotation.targetName("apply_u16")
  def apply(u16: CArray[uint16_t, Nat._2])(using Zone): Ptr[_hb_var_num_t] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_hb_var_num_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[uint16_t, Nat._2]]].update(0, u16)
    ___ptr
  
  @scala.annotation.targetName("apply_i16")
  def apply(i16: CArray[int16_t, Nat._2])(using Zone): Ptr[_hb_var_num_t] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_hb_var_num_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[int16_t, Nat._2]]].update(0, i16)
    ___ptr
  
  @scala.annotation.targetName("apply_u8")
  def apply(u8: CArray[uint8_t, Nat._4])(using Zone): Ptr[_hb_var_num_t] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_hb_var_num_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[uint8_t, Nat._4]]].update(0, u8)
    ___ptr
  
  @scala.annotation.targetName("apply_i8")
  def apply(i8: CArray[int8_t, Nat._4])(using Zone): Ptr[_hb_var_num_t] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_hb_var_num_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[int8_t, Nat._4]]].update(0, i8)
    ___ptr
  
  extension (struct: _hb_var_num_t)
    inline def f : Float = !struct.at(0).asInstanceOf[Ptr[Float]]
    inline def f_=(value: Float): Unit = !struct.at(0).asInstanceOf[Ptr[Float]] = value
    inline def u32 : uint32_t = !struct.at(0).asInstanceOf[Ptr[uint32_t]]
    inline def u32_=(value: uint32_t): Unit = !struct.at(0).asInstanceOf[Ptr[uint32_t]] = value
    inline def i32 : int32_t = !struct.at(0).asInstanceOf[Ptr[int32_t]]
    inline def i32_=(value: int32_t): Unit = !struct.at(0).asInstanceOf[Ptr[int32_t]] = value
    inline def u16 : CArray[uint16_t, Nat._2] = !struct.at(0).asInstanceOf[Ptr[CArray[uint16_t, Nat._2]]]
    inline def u16_=(value: CArray[uint16_t, Nat._2]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[uint16_t, Nat._2]]] = value
    inline def i16 : CArray[int16_t, Nat._2] = !struct.at(0).asInstanceOf[Ptr[CArray[int16_t, Nat._2]]]
    inline def i16_=(value: CArray[int16_t, Nat._2]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[int16_t, Nat._2]]] = value
    inline def u8 : CArray[uint8_t, Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[uint8_t, Nat._4]]]
    inline def u8_=(value: CArray[uint8_t, Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[uint8_t, Nat._4]]] = value
    inline def i8 : CArray[int8_t, Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[int8_t, Nat._4]]]
    inline def i8_=(value: CArray[int8_t, Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[int8_t, Nat._4]]] = value