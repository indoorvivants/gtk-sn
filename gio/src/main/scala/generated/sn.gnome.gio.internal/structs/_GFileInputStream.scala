package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GFileInputStream = CStruct2[GInputStream, Ptr[GFileInputStreamPrivate]]

object _GFileInputStream:
  given _tag: Tag[_GFileInputStream] = Tag.materializeCStruct2Tag[GInputStream, Ptr[GFileInputStreamPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GFileInputStream)
      inline def parent_instance : GInputStream = struct._1
      inline def parent_instance_=(value: GInputStream): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GFileInputStreamPrivate] = struct._2
      inline def priv_=(value: Ptr[GFileInputStreamPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GFileInputStream on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GFileInputStream] = scala.scalanative.unsafe.alloc[_GFileInputStream](1)
  def apply(parent_instance : GInputStream, priv : Ptr[GFileInputStreamPrivate])(using Zone): Ptr[_GFileInputStream] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr