package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GUnixCredentialsMessageClass:
*/
opaque type _GUnixCredentialsMessageClass = CStruct3[GSocketControlMessageClass, CFuncPtr0[Unit], CFuncPtr0[Unit]]

object _GUnixCredentialsMessageClass:
  given _tag: Tag[_GUnixCredentialsMessageClass] = Tag.materializeCStruct3Tag[GSocketControlMessageClass, CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GUnixCredentialsMessageClass)
      inline def parent_class : GSocketControlMessageClass = struct._1
      inline def parent_class_=(value: GSocketControlMessageClass): Unit = (!struct.at1 = value)
      inline def _g_reserved1 : CFuncPtr0[Unit] = struct._2
      inline def _g_reserved1_=(value: CFuncPtr0[Unit]): Unit = (!struct.at2 = value)
      inline def _g_reserved2 : CFuncPtr0[Unit] = struct._3
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GUnixCredentialsMessageClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GUnixCredentialsMessageClass] = scala.scalanative.unsafe.alloc[_GUnixCredentialsMessageClass](1)
  def apply(parent_class : GSocketControlMessageClass, _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit])(using Zone): Ptr[_GUnixCredentialsMessageClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr)._g_reserved1 = _g_reserved1
    (!____ptr)._g_reserved2 = _g_reserved2
    ____ptr