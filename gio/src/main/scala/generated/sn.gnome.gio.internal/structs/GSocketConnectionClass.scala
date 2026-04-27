package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSocketConnectionClass = CArray[CChar, Nat.Digit3[Nat._3, Nat._0, Nat._4]]

object GSocketConnectionClass:
  given _tag: Tag[GSocketConnectionClass] = Tag.CArray[CChar, Nat.Digit3[Nat._3, Nat._0, Nat._4]](Tag.Byte, Tag.Digit3[Nat._3, Nat._0, Nat._4](Tag.Nat3, Tag.Nat0, Tag.Nat4))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GSocketConnectionClass)
      inline def parent_class: GIOStreamClass = !struct.at(offsets(0)).asInstanceOf[Ptr[GIOStreamClass]]
      inline def parent_class_=(value: GIOStreamClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GIOStreamClass]] = value
      inline def _g_reserved1: CFuncPtr0[Unit] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved2: CFuncPtr0[Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved3: CFuncPtr0[Unit] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved4: CFuncPtr0[Unit] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved5: CFuncPtr0[Unit] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved5_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved6: CFuncPtr0[Unit] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved6_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
    end extension
  
  // Allocates GSocketConnectionClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GSocketConnectionClass] = scala.scalanative.unsafe.alloc[GSocketConnectionClass](1)
  def apply(parent_class : GIOStreamClass, _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit], _g_reserved4 : CFuncPtr0[Unit], _g_reserved5 : CFuncPtr0[Unit], _g_reserved6 : CFuncPtr0[Unit])(using Zone): Ptr[GSocketConnectionClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr)._g_reserved1 = _g_reserved1
    (!____ptr)._g_reserved2 = _g_reserved2
    (!____ptr)._g_reserved3 = _g_reserved3
    (!____ptr)._g_reserved4 = _g_reserved4
    (!____ptr)._g_reserved5 = _g_reserved5
    (!____ptr)._g_reserved6 = _g_reserved6
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](7)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[GIOStreamClass].toInt)
    res(1) = align(res(0) + sizeof[GIOStreamClass].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res
  end offsets