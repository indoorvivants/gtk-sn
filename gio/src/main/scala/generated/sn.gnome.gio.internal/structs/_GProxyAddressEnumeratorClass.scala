package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GProxyAddressEnumeratorClass:
*/
opaque type _GProxyAddressEnumeratorClass = CStruct8[GSocketAddressEnumeratorClass, CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object _GProxyAddressEnumeratorClass:
  given _tag: Tag[_GProxyAddressEnumeratorClass] = Tag.materializeCStruct8Tag[GSocketAddressEnumeratorClass, CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GProxyAddressEnumeratorClass)
      inline def parent_class : GSocketAddressEnumeratorClass = struct._1
      inline def parent_class_=(value: GSocketAddressEnumeratorClass): Unit = (!struct.at1 = value)
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
      inline def _g_reserved7 : CFuncPtr0[Unit] = struct._8
      inline def _g_reserved7_=(value: CFuncPtr0[Unit]): Unit = (!struct.at8 = value)
    end extension
  
  // Allocates _GProxyAddressEnumeratorClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GProxyAddressEnumeratorClass] = scala.scalanative.unsafe.alloc[_GProxyAddressEnumeratorClass](1)
  def apply(parent_class : GSocketAddressEnumeratorClass, _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit], _g_reserved4 : CFuncPtr0[Unit], _g_reserved5 : CFuncPtr0[Unit], _g_reserved6 : CFuncPtr0[Unit], _g_reserved7 : CFuncPtr0[Unit])(using Zone): Ptr[_GProxyAddressEnumeratorClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr)._g_reserved1 = _g_reserved1
    (!____ptr)._g_reserved2 = _g_reserved2
    (!____ptr)._g_reserved3 = _g_reserved3
    (!____ptr)._g_reserved4 = _g_reserved4
    (!____ptr)._g_reserved5 = _g_reserved5
    (!____ptr)._g_reserved6 = _g_reserved6
    (!____ptr)._g_reserved7 = _g_reserved7
    ____ptr