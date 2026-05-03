package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GMemoryInputStream = CStruct2[GInputStream, Ptr[GMemoryInputStreamPrivate]]

object _GMemoryInputStream:
  given _tag: Tag[_GMemoryInputStream] = Tag.materializeCStruct2Tag[GInputStream, Ptr[GMemoryInputStreamPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GMemoryInputStream)
      inline def parent_instance : GInputStream = struct._1
      inline def parent_instance_=(value: GInputStream): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GMemoryInputStreamPrivate] = struct._2
      inline def priv_=(value: Ptr[GMemoryInputStreamPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GMemoryInputStream on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GMemoryInputStream] = scala.scalanative.unsafe.alloc[_GMemoryInputStream](1)
  def apply(parent_instance : GInputStream, priv : Ptr[GMemoryInputStreamPrivate])(using Zone): Ptr[_GMemoryInputStream] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr