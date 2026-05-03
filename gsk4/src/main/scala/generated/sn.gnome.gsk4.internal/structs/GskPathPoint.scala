package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GskPathPoint = CStruct1[GskPathPoint_Union0]

object GskPathPoint:
  given _tag: Tag[GskPathPoint] = Tag.materializeCStruct1Tag[GskPathPoint_Union0]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GskPathPoint)
      inline def _1 : GskPathPoint_Union0 = struct._1
      inline def _1_=(value: GskPathPoint_Union0): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GskPathPoint on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GskPathPoint] = scala.scalanative.unsafe.alloc[GskPathPoint](1)
  def apply(_1 : GskPathPoint_Union0)(using Zone): Ptr[GskPathPoint] =
    val ____ptr = apply()
    (!____ptr)._1 = _1
    ____ptr
  
  
opaque type GskPathPoint_Union0 = CArray[Byte, Nat.Digit2[Nat._6, Nat._4]]
object GskPathPoint_Union0:
  given _tag: Tag[GskPathPoint_Union0] = Tag.CArray[CChar, Nat.Digit2[Nat._6, Nat._4]](Tag.Byte, Tag.Digit2[Nat._6, Nat._4](Tag.Nat6, Tag.Nat4))
  
  def apply()(using Zone): Ptr[GskPathPoint_Union0] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GskPathPoint_Union0](1)
    ___ptr
  
  @scala.annotation.targetName("apply__1")
  def apply(_1: GskPathPoint_Union0_Struct0)(using Zone): Ptr[GskPathPoint_Union0] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GskPathPoint_Union0](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[GskPathPoint_Union0_Struct0]].update(0, _1)
    ___ptr
  
  @scala.annotation.targetName("apply_padding")
  def apply(padding: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[GskPathPoint_Union0] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GskPathPoint_Union0](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]].update(0, padding)
    ___ptr
  
  @scala.annotation.targetName("apply_alignment")
  def apply(alignment: _root_.sn.gnome.graphene.internal.graphene_vec4_t)(using Zone): Ptr[GskPathPoint_Union0] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GskPathPoint_Union0](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.graphene.internal.graphene_vec4_t]].update(0, alignment)
    ___ptr
  
  extension (struct: GskPathPoint_Union0)
    inline def _1 : GskPathPoint_Union0_Struct0 = !struct.at(0).asInstanceOf[Ptr[GskPathPoint_Union0_Struct0]]
    inline def _1_=(value: GskPathPoint_Union0_Struct0): Unit = !struct.at(0).asInstanceOf[Ptr[GskPathPoint_Union0_Struct0]] = value
    inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = !struct.at(0).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]]
    inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]] = value
    inline def alignment : _root_.sn.gnome.graphene.internal.graphene_vec4_t = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.graphene.internal.graphene_vec4_t]]
    inline def alignment_=(value: _root_.sn.gnome.graphene.internal.graphene_vec4_t): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.graphene.internal.graphene_vec4_t]] = value
opaque type GskPathPoint_Union0_Struct0 = CStruct3[_root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gsize, Float]

object GskPathPoint_Union0_Struct0:
  given _tag: Tag[GskPathPoint_Union0_Struct0] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gsize, Float]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GskPathPoint_Union0_Struct0)
      inline def contour : _root_.sn.gnome.glib.internal.gsize = struct._1
      inline def contour_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = (!struct.at1 = value)
      inline def idx : _root_.sn.gnome.glib.internal.gsize = struct._2
      inline def idx_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = (!struct.at2 = value)
      inline def t : Float = struct._3
      inline def t_=(value: Float): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GskPathPoint_Union0_Struct0 on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GskPathPoint_Union0_Struct0] = scala.scalanative.unsafe.alloc[GskPathPoint_Union0_Struct0](1)
  def apply(contour : _root_.sn.gnome.glib.internal.gsize, idx : _root_.sn.gnome.glib.internal.gsize, t : Float)(using Zone): Ptr[GskPathPoint_Union0_Struct0] =
    val ____ptr = apply()
    (!____ptr).contour = contour
    (!____ptr).idx = idx
    (!____ptr).t = t
    ____ptr