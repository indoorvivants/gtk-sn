package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSocketListenerClass: : virtual method called when the set of socket listened to changes
*/
opaque type GSocketListenerClass = CArray[CChar, Nat.Digit3[Nat._1, Nat._9, Nat._2]]

object GSocketListenerClass:
  given _tag: Tag[GSocketListenerClass] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._9, Nat._2]](Tag.Byte, Tag.Digit3[Nat._1, Nat._9, Nat._2](Tag.Nat1, Tag.Nat9, Tag.Nat2))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GSocketListenerClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def changed: CFuncPtr1[Ptr[GSocketListener], Unit] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSocketListener], Unit]]]
      inline def changed_=(value: CFuncPtr1[Ptr[GSocketListener], Unit]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSocketListener], Unit]]] = value
      inline def event: CFuncPtr3[Ptr[GSocketListener], GSocketListenerEvent, Ptr[GSocket], Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GSocketListener], GSocketListenerEvent, Ptr[GSocket], Unit]]]
      inline def event_=(value: CFuncPtr3[Ptr[GSocketListener], GSocketListenerEvent, Ptr[GSocket], Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GSocketListener], GSocketListenerEvent, Ptr[GSocket], Unit]]] = value
      inline def _g_reserved2: CFuncPtr0[Unit] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved3: CFuncPtr0[Unit] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved4: CFuncPtr0[Unit] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved5: CFuncPtr0[Unit] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved5_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved6: CFuncPtr0[Unit] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved6_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
    end extension
  
  // Allocates GSocketListenerClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GSocketListenerClass] = scala.scalanative.unsafe.alloc[GSocketListenerClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, changed : CFuncPtr1[Ptr[GSocketListener], Unit], event : CFuncPtr3[Ptr[GSocketListener], GSocketListenerEvent, Ptr[GSocket], Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit], _g_reserved4 : CFuncPtr0[Unit], _g_reserved5 : CFuncPtr0[Unit], _g_reserved6 : CFuncPtr0[Unit])(using Zone): Ptr[GSocketListenerClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).changed = changed
    (!____ptr).event = event
    (!____ptr)._g_reserved2 = _g_reserved2
    (!____ptr)._g_reserved3 = _g_reserved3
    (!____ptr)._g_reserved4 = _g_reserved4
    (!____ptr)._g_reserved5 = _g_reserved5
    (!____ptr)._g_reserved6 = _g_reserved6
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](8)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[CFuncPtr1[Ptr[GSocketListener], Unit]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GSocketListener], Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GSocketListener], GSocketListenerEvent, Ptr[GSocket], Unit]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr3[Ptr[GSocketListener], GSocketListenerEvent, Ptr[GSocket], Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res
  end offsets