package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GZlibDecompressorClass = CStruct1[_root_.sn.gnome.gobject.internal.GObjectClass]

object _GZlibDecompressorClass:
  given _tag: Tag[_GZlibDecompressorClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObjectClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GZlibDecompressorClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GZlibDecompressorClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GZlibDecompressorClass] = scala.scalanative.unsafe.alloc[_GZlibDecompressorClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass)(using Zone): Ptr[_GZlibDecompressorClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr