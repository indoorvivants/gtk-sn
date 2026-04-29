package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GBufferedOutputStreamClass = CStruct3[GFilterOutputStreamClass, CFuncPtr0[Unit], CFuncPtr0[Unit]]

object _GBufferedOutputStreamClass:
  given _tag: Tag[_GBufferedOutputStreamClass] = Tag.materializeCStruct3Tag[GFilterOutputStreamClass, CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GBufferedOutputStreamClass)
      inline def parent_class : GFilterOutputStreamClass = struct._1
      inline def parent_class_=(value: GFilterOutputStreamClass): Unit = (!struct.at1 = value)
      inline def _g_reserved1 : CFuncPtr0[Unit] = struct._2
      inline def _g_reserved1_=(value: CFuncPtr0[Unit]): Unit = (!struct.at2 = value)
      inline def _g_reserved2 : CFuncPtr0[Unit] = struct._3
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GBufferedOutputStreamClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GBufferedOutputStreamClass] = scala.scalanative.unsafe.alloc[_GBufferedOutputStreamClass](1)
  def apply(parent_class : GFilterOutputStreamClass, _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit])(using Zone): Ptr[_GBufferedOutputStreamClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr)._g_reserved1 = _g_reserved1
    (!____ptr)._g_reserved2 = _g_reserved2
    ____ptr