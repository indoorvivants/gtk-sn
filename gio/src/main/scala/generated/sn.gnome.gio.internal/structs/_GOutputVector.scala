package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GOutputVector = CStruct2[_root_.sn.gnome.glib.internal.gconstpointer, _root_.sn.gnome.glib.internal.gsize]

object _GOutputVector:
  given _tag: Tag[_GOutputVector] = Tag.materializeCStruct2Tag[_root_.sn.gnome.glib.internal.gconstpointer, _root_.sn.gnome.glib.internal.gsize]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GOutputVector)
      inline def buffer : _root_.sn.gnome.glib.internal.gconstpointer = struct._1
      inline def buffer_=(value: _root_.sn.gnome.glib.internal.gconstpointer): Unit = (!struct.at1 = value)
      inline def size : _root_.sn.gnome.glib.internal.gsize = struct._2
      inline def size_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GOutputVector on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GOutputVector] = scala.scalanative.unsafe.alloc[_GOutputVector](1)
  def apply(buffer : _root_.sn.gnome.glib.internal.gconstpointer, size : _root_.sn.gnome.glib.internal.gsize)(using Zone): Ptr[_GOutputVector] =
    val ____ptr = apply()
    (!____ptr).buffer = buffer
    (!____ptr).size = size
    ____ptr