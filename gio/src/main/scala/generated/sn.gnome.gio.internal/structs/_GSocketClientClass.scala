package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GSocketClientClass = CStruct6[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr4[Ptr[GSocketClient], GSocketClientEvent, Ptr[GSocketConnectable], Ptr[GIOStream], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object _GSocketClientClass:
  given _tag: Tag[_GSocketClientClass] = Tag.materializeCStruct6Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr4[Ptr[GSocketClient], GSocketClientEvent, Ptr[GSocketConnectable], Ptr[GIOStream], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GSocketClientClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def event : CFuncPtr4[Ptr[GSocketClient], GSocketClientEvent, Ptr[GSocketConnectable], Ptr[GIOStream], Unit] = struct._2
      inline def event_=(value: CFuncPtr4[Ptr[GSocketClient], GSocketClientEvent, Ptr[GSocketConnectable], Ptr[GIOStream], Unit]): Unit = (!struct.at2 = value)
      inline def _g_reserved1 : CFuncPtr0[Unit] = struct._3
      inline def _g_reserved1_=(value: CFuncPtr0[Unit]): Unit = (!struct.at3 = value)
      inline def _g_reserved2 : CFuncPtr0[Unit] = struct._4
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at4 = value)
      inline def _g_reserved3 : CFuncPtr0[Unit] = struct._5
      inline def _g_reserved3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at5 = value)
      inline def _g_reserved4 : CFuncPtr0[Unit] = struct._6
      inline def _g_reserved4_=(value: CFuncPtr0[Unit]): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates _GSocketClientClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GSocketClientClass] = scala.scalanative.unsafe.alloc[_GSocketClientClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, event : CFuncPtr4[Ptr[GSocketClient], GSocketClientEvent, Ptr[GSocketConnectable], Ptr[GIOStream], Unit], _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit], _g_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[_GSocketClientClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).event = event
    (!____ptr)._g_reserved1 = _g_reserved1
    (!____ptr)._g_reserved2 = _g_reserved2
    (!____ptr)._g_reserved3 = _g_reserved3
    (!____ptr)._g_reserved4 = _g_reserved4
    ____ptr