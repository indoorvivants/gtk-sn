package sn.gnome.graphene.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type graphene_simd4f_union_t = CArray[Byte, Nat.Digit2[Nat._1, Nat._6]]
object graphene_simd4f_union_t:
  given _tag: Tag[graphene_simd4f_union_t] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  
  def apply()(using Zone): Ptr[graphene_simd4f_union_t] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_union_t](1)
    ___ptr
  
  @scala.annotation.targetName("apply_s")
  def apply(s: graphene_simd4f_t)(using Zone): Ptr[graphene_simd4f_union_t] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_union_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[graphene_simd4f_t]].update(0, s)
    ___ptr
  
  @scala.annotation.targetName("apply_f")
  def apply(f: CArray[Float, Nat._4])(using Zone): Ptr[graphene_simd4f_union_t] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_union_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[Float, Nat._4]]].update(0, f)
    ___ptr
  
  extension (struct: graphene_simd4f_union_t)
    inline def s : graphene_simd4f_t = !struct.at(0).asInstanceOf[Ptr[graphene_simd4f_t]]
    inline def s_=(value: graphene_simd4f_t): Unit = !struct.at(0).asInstanceOf[Ptr[graphene_simd4f_t]] = value
    inline def f : CArray[Float, Nat._4] = !struct.at(0).asInstanceOf[Ptr[CArray[Float, Nat._4]]]
    inline def f_=(value: CArray[Float, Nat._4]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[Float, Nat._4]]] = value