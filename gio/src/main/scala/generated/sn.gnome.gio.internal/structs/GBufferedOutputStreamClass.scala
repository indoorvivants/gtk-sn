package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GBufferedOutputStreamClass = CArray[CChar, Nat.Digit3[Nat._3, Nat._3, Nat._6]]

object GBufferedOutputStreamClass:
  given _tag: Tag[GBufferedOutputStreamClass] = Tag.CArray[CChar, Nat.Digit3[Nat._3, Nat._3, Nat._6]](Tag.Byte, Tag.Digit3[Nat._3, Nat._3, Nat._6](Tag.Nat3, Tag.Nat3, Tag.Nat6))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GBufferedOutputStreamClass)
      inline def parent_class: GFilterOutputStreamClass = !struct.at(offsets(0)).asInstanceOf[Ptr[GFilterOutputStreamClass]]
      inline def parent_class_=(value: GFilterOutputStreamClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GFilterOutputStreamClass]] = value
      inline def _g_reserved1: CFuncPtr0[Unit] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved2: CFuncPtr0[Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
    end extension
  
  // Allocates GBufferedOutputStreamClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GBufferedOutputStreamClass] = scala.scalanative.unsafe.alloc[GBufferedOutputStreamClass](1)
  def apply(parent_class : GFilterOutputStreamClass, _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit])(using Zone): Ptr[GBufferedOutputStreamClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr)._g_reserved1 = _g_reserved1
    (!____ptr)._g_reserved2 = _g_reserved2
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](3)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[GFilterOutputStreamClass].toInt)
    res(1) = align(res(0) + sizeof[GFilterOutputStreamClass].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res
  end offsets