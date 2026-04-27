package sn.gnome.graphene.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type graphene_simd4x4f_t = CStruct4[graphene_simd4f_t, graphene_simd4f_t, graphene_simd4f_t, graphene_simd4f_t]

object graphene_simd4x4f_t:
  given _tag: Tag[graphene_simd4x4f_t] = Tag.materializeCStruct4Tag[graphene_simd4f_t, graphene_simd4f_t, graphene_simd4f_t, graphene_simd4f_t]
  
  export fields.*
  private[internal] object fields:
    extension (struct: graphene_simd4x4f_t)
      inline def x : graphene_simd4f_t = struct._1
      inline def x_=(value: graphene_simd4f_t): Unit = (!struct.at1 = value)
      inline def y : graphene_simd4f_t = struct._2
      inline def y_=(value: graphene_simd4f_t): Unit = (!struct.at2 = value)
      inline def z : graphene_simd4f_t = struct._3
      inline def z_=(value: graphene_simd4f_t): Unit = (!struct.at3 = value)
      inline def w : graphene_simd4f_t = struct._4
      inline def w_=(value: graphene_simd4f_t): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates graphene_simd4x4f_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[graphene_simd4x4f_t] = scala.scalanative.unsafe.alloc[graphene_simd4x4f_t](1)
  def apply(x : graphene_simd4f_t, y : graphene_simd4f_t, z : graphene_simd4f_t, w : graphene_simd4f_t)(using Zone): Ptr[graphene_simd4x4f_t] =
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).z = z
    (!____ptr).w = w
    ____ptr