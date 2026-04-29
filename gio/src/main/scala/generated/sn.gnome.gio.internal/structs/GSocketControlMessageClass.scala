package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSocketControlMessageClass: _size: gets the size of the message. _level: gets the protocol of the message. _type: gets the protocol specific type of the message. : Writes out the message data. : Tries to deserialize a message.
*/
opaque type GSocketControlMessageClass = CArray[CChar, Nat.Digit3[Nat._2, Nat._1, Nat._6]]

object GSocketControlMessageClass:
  given _tag: Tag[GSocketControlMessageClass] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._1, Nat._6]](Tag.Byte, Tag.Digit3[Nat._2, Nat._1, Nat._6](Tag.Nat2, Tag.Nat1, Tag.Nat6))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GSocketControlMessageClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def get_size: CFuncPtr1[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gsize] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gsize]]]
      inline def get_size_=(value: CFuncPtr1[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gsize]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gsize]]] = value
      inline def get_level: CFuncPtr1[Ptr[GSocketControlMessage], CInt] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSocketControlMessage], CInt]]]
      inline def get_level_=(value: CFuncPtr1[Ptr[GSocketControlMessage], CInt]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSocketControlMessage], CInt]]] = value
      inline def get_type: CFuncPtr1[Ptr[GSocketControlMessage], CInt] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSocketControlMessage], CInt]]]
      inline def get_type_=(value: CFuncPtr1[Ptr[GSocketControlMessage], CInt]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSocketControlMessage], CInt]]] = value
      inline def serialize: CFuncPtr2[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def serialize_=(value: CFuncPtr2[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def deserialize: CFuncPtr4[CInt, CInt, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, Ptr[GSocketControlMessage]] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr4[CInt, CInt, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, Ptr[GSocketControlMessage]]]]
      inline def deserialize_=(value: CFuncPtr4[CInt, CInt, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, Ptr[GSocketControlMessage]]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr4[CInt, CInt, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, Ptr[GSocketControlMessage]]]] = value
      inline def _g_reserved1: CFuncPtr0[Unit] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved2: CFuncPtr0[Unit] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved3: CFuncPtr0[Unit] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved4: CFuncPtr0[Unit] = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved5: CFuncPtr0[Unit] = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved5_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
    end extension
  
  // Allocates GSocketControlMessageClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GSocketControlMessageClass] = scala.scalanative.unsafe.alloc[GSocketControlMessageClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, get_size : CFuncPtr1[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gsize], get_level : CFuncPtr1[Ptr[GSocketControlMessage], CInt], get_type : CFuncPtr1[Ptr[GSocketControlMessage], CInt], serialize : CFuncPtr2[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gpointer, Unit], deserialize : CFuncPtr4[CInt, CInt, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, Ptr[GSocketControlMessage]], _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit], _g_reserved4 : CFuncPtr0[Unit], _g_reserved5 : CFuncPtr0[Unit])(using Zone): Ptr[GSocketControlMessageClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_size = get_size
    (!____ptr).get_level = get_level
    (!____ptr).get_type = get_type
    (!____ptr).serialize = serialize
    (!____ptr).deserialize = deserialize
    (!____ptr)._g_reserved1 = _g_reserved1
    (!____ptr)._g_reserved2 = _g_reserved2
    (!____ptr)._g_reserved3 = _g_reserved3
    (!____ptr)._g_reserved4 = _g_reserved4
    (!____ptr)._g_reserved5 = _g_reserved5
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](11)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[CFuncPtr1[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gsize]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gsize]].toInt, alignmentof[CFuncPtr1[Ptr[GSocketControlMessage], CInt]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr1[Ptr[GSocketControlMessage], CInt]].toInt, alignmentof[CFuncPtr1[Ptr[GSocketControlMessage], CInt]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr1[Ptr[GSocketControlMessage], CInt]].toInt, alignmentof[CFuncPtr2[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr2[Ptr[GSocketControlMessage], _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr4[CInt, CInt, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, Ptr[GSocketControlMessage]]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr4[CInt, CInt, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, Ptr[GSocketControlMessage]]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(8) = align(res(7) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(9) = align(res(8) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(10) = align(res(9) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res
  end offsets