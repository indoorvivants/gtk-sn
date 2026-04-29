package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GSocketConnectionClass = CStruct7[GIOStreamClass, CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object _GSocketConnectionClass:
  given _tag: Tag[_GSocketConnectionClass] = Tag.materializeCStruct7Tag[GIOStreamClass, CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GSocketConnectionClass)
      inline def parent_class : GIOStreamClass = struct._1
      inline def parent_class_=(value: GIOStreamClass): Unit = (!struct.at1 = value)
      inline def _g_reserved1 : CFuncPtr0[Unit] = struct._2
      inline def _g_reserved1_=(value: CFuncPtr0[Unit]): Unit = (!struct.at2 = value)
      inline def _g_reserved2 : CFuncPtr0[Unit] = struct._3
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at3 = value)
      inline def _g_reserved3 : CFuncPtr0[Unit] = struct._4
      inline def _g_reserved3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at4 = value)
      inline def _g_reserved4 : CFuncPtr0[Unit] = struct._5
      inline def _g_reserved4_=(value: CFuncPtr0[Unit]): Unit = (!struct.at5 = value)
      inline def _g_reserved5 : CFuncPtr0[Unit] = struct._6
      inline def _g_reserved5_=(value: CFuncPtr0[Unit]): Unit = (!struct.at6 = value)
      inline def _g_reserved6 : CFuncPtr0[Unit] = struct._7
      inline def _g_reserved6_=(value: CFuncPtr0[Unit]): Unit = (!struct.at7 = value)
    end extension
  
  // Allocates _GSocketConnectionClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GSocketConnectionClass] = scala.scalanative.unsafe.alloc[_GSocketConnectionClass](1)
  def apply(parent_class : GIOStreamClass, _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit], _g_reserved4 : CFuncPtr0[Unit], _g_reserved5 : CFuncPtr0[Unit], _g_reserved6 : CFuncPtr0[Unit])(using Zone): Ptr[_GSocketConnectionClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr)._g_reserved1 = _g_reserved1
    (!____ptr)._g_reserved2 = _g_reserved2
    (!____ptr)._g_reserved3 = _g_reserved3
    (!____ptr)._g_reserved4 = _g_reserved4
    (!____ptr)._g_reserved5 = _g_reserved5
    (!____ptr)._g_reserved6 = _g_reserved6
    ____ptr