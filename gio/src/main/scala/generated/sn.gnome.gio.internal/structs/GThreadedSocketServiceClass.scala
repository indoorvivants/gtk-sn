package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GThreadedSocketServiceClass = CArray[CChar, Nat.Digit3[Nat._2, Nat._9, Nat._6]]

object GThreadedSocketServiceClass:
  given _tag: Tag[GThreadedSocketServiceClass] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._9, Nat._6]](Tag.Byte, Tag.Digit3[Nat._2, Nat._9, Nat._6](Tag.Nat2, Tag.Nat9, Tag.Nat6))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GThreadedSocketServiceClass)
      inline def parent_class: GSocketServiceClass = !struct.at(offsets(0)).asInstanceOf[Ptr[GSocketServiceClass]]
      inline def parent_class_=(value: GSocketServiceClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GSocketServiceClass]] = value
      inline def run: CFuncPtr3[Ptr[GThreadedSocketService], Ptr[GSocketConnection], Ptr[_root_.sn.gnome.gobject.internal.GObject], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GThreadedSocketService], Ptr[GSocketConnection], Ptr[_root_.sn.gnome.gobject.internal.GObject], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def run_=(value: CFuncPtr3[Ptr[GThreadedSocketService], Ptr[GSocketConnection], Ptr[_root_.sn.gnome.gobject.internal.GObject], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GThreadedSocketService], Ptr[GSocketConnection], Ptr[_root_.sn.gnome.gobject.internal.GObject], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def _g_reserved1: CFuncPtr0[Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved2: CFuncPtr0[Unit] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved3: CFuncPtr0[Unit] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved4: CFuncPtr0[Unit] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved5: CFuncPtr0[Unit] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved5_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
    end extension
  
  // Allocates GThreadedSocketServiceClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GThreadedSocketServiceClass] = scala.scalanative.unsafe.alloc[GThreadedSocketServiceClass](1)
  def apply(parent_class : GSocketServiceClass, run : CFuncPtr3[Ptr[GThreadedSocketService], Ptr[GSocketConnection], Ptr[_root_.sn.gnome.gobject.internal.GObject], _root_.sn.gnome.glib.internal.gboolean], _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit], _g_reserved4 : CFuncPtr0[Unit], _g_reserved5 : CFuncPtr0[Unit])(using Zone): Ptr[GThreadedSocketServiceClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).run = run
    (!____ptr)._g_reserved1 = _g_reserved1
    (!____ptr)._g_reserved2 = _g_reserved2
    (!____ptr)._g_reserved3 = _g_reserved3
    (!____ptr)._g_reserved4 = _g_reserved4
    (!____ptr)._g_reserved5 = _g_reserved5
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
    
    res(0) = align(0, alignmentof[GSocketServiceClass].toInt)
    res(1) = align(res(0) + sizeof[GSocketServiceClass].toInt, alignmentof[CFuncPtr3[Ptr[GThreadedSocketService], Ptr[GSocketConnection], Ptr[_root_.sn.gnome.gobject.internal.GObject], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr3[Ptr[GThreadedSocketService], Ptr[GSocketConnection], Ptr[_root_.sn.gnome.gobject.internal.GObject], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res
  end offsets